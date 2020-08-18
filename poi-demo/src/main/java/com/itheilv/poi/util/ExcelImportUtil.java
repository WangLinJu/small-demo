package com.itheilv.poi.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author WSQ
 * @since 2020-07-30
 * Excel导入工具类
 */
public class ExcelImportUtil {

    /**
     * 初始化Excel文件
     *
     * @param file the file
     * @return the the WorkBook
     */
    public static Workbook init(MultipartFile file) {
        if (file == null) {
            throw new IllegalArgumentException("文件不存在！");
        }
        try (InputStream is = file.getInputStream()) {
            String fileName = file.getOriginalFilename();
            return initWbByFileSuffix(fileName, is);
        } catch (IOException e) {
            throw new IllegalArgumentException("文件初始化错误！");
        }
    }

    /**
     * 根据文件后缀名 初始化WookBook
     *
     * @param fileName 文件名称
     * @param is       the InputStream
     * @return Workbook
     * @throws IOException the IOException
     */
    private static Workbook initWbByFileSuffix(String fileName, InputStream is) throws IOException {
        Workbook wb;
        if (fileName.endsWith("xls")) {
            wb = new HSSFWorkbook(is);
        } else if (fileName.endsWith("xlsx")) {
            wb = new XSSFWorkbook(is);
        } else {
            throw new IllegalArgumentException("文件类型不正确");
        }
        return wb;
    }

    /**
     * 将cell的值转为String
     * TODO 添加公式类型
     *
     * @param cell 单元格
     * @return 单元格的值
     */
    public static String convertCell2ToString(Cell cell) {
        String cellValue;
        switch (cell.getCellType()) {
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    cellValue = dateConvertToLocateDateTime(cell.getDateCellValue());
                } else {
                    cellValue = removeDecimalPoint(String.valueOf(cell.getNumericCellValue()));
                }
                break;
            default:
                cellValue = "";
                break;
        }
        return cellValue;
    }

    /**
     * excel字符串去除小数点后面多余的0
     *
     * @param str the String
     * @return the String
     */
    private static String removeDecimalPoint(String str) {
        if (str.indexOf(".") > 0) {
            str = str.replaceAll("0+?$", "");
            str = str.replaceAll("[.]$", "");
        }
        return str;
    }

    /**
     * Date类型转换为LocalDateTime字符串类型
     *
     * @param date the date
     * @return the localDateTime
     */
    private static String dateConvertToLocateDateTime(Date date) {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        final LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return dateTimeFormatter.format(localDateTime);
    }
}

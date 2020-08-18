package com.itheilv.poi.test;

import cn.hutool.poi.excel.ExcelUtil;
import com.itheilv.poi.model.BomApproval;
import com.itheilv.poi.model.Fruit;
import com.itheilv.poi.util.ExcelImportUtil;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import javax.swing.text.DateFormatter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author WSQ
 * @since 2020-08-03
 */
public class PoiDateTest {

    @Test
    public void testDate() throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\WSQ\\Desktop\\poi.xls");
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        HSSFSheet sheet = hssfWorkbook.getSheetAt(0);
        HSSFRow row = sheet.getRow(15);
        for (int i = 1; i <= 25; i++) {
            final String value = ExcelImportUtil.convertCell2ToString(row.getCell(i));
            System.out.println(i + " ------ " + value);
        }
    }

    @Test
    public void testList() {
        BomApproval bomApproval;
        final List<BomApproval> bomApprovalList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            bomApproval = new BomApproval();
            final String id = String.valueOf(i);
            bomApproval.setId(id);
            bomApprovalList.add(bomApproval);
        }
        System.out.println(bomApprovalList);
    }

    @Test
    public void test() {
        String str = "2";
        str = str.replace(".00", "");
        System.out.println(str);
    }

    @Test
    public void dateTest() {
        Date date = new Date("2020/3/31");
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        final LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        final String format = dateTimeFormatter.format(localDateTime);
        final LocalDateTime parse = LocalDateTime.parse(format, dateTimeFormatter);
        System.out.println(parse);
    }

    @Test
    public void dateTest02() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(LocalDateTime.now().toString(), df);
        System.out.println("String类型的时间转成LocalDateTime：" + ldt);
        df.format(LocalDateTime.now());
    }

}

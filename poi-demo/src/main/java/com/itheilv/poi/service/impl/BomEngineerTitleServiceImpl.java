package com.itheilv.poi.service.impl;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.IdUtil;
import cn.hutool.http.server.HttpServerResponse;
import com.itheilv.poi.model.BomApproval;
import com.itheilv.poi.model.BomEngineerMaterial;
import com.itheilv.poi.model.BomEngineerTitle;
import com.itheilv.poi.mapper.BomEngineerTitleMapper;
import com.itheilv.poi.service.BomApprovalService;
import com.itheilv.poi.service.BomEngineerMaterialService;
import com.itheilv.poi.service.BomEngineerTitleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheilv.poi.util.ExcelImportUtil;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 设计BOM表 服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 */
@Service
public class BomEngineerTitleServiceImpl extends ServiceImpl<BomEngineerTitleMapper, BomEngineerTitle> implements BomEngineerTitleService {

    @Autowired
    private BomApprovalService bomApprovalService;

    @Autowired
    private BomEngineerMaterialService bomEngineerMaterialService;


    @Override
    public void importBomEngineerTitleExcel(MultipartFile file, String projectId) {
        //1.获取WorkBook
        Workbook workbook = ExcelImportUtil.init(file);
        //获取Sheet页
        Sheet sheet = workbook.getSheetAt(0);
        //构建头部父数据(BomEngineerTitle表)
        BomEngineerTitle bomEngineerTitle = buildBomEngineerTitle(sheet);
        //构建头部数据（BomApproval表）
        final BomApproval bomApproval = buildBomApproval(sheet);
        //构建物料表数据
        final List<BomEngineerMaterial> bomEngineerMaterialList = buildContent(sheet);
        buildDataInto(bomApproval, bomEngineerTitle, bomEngineerMaterialList);
    }

    /**
     * 导出Excel模板数据
     *
     * @param bomId              the bomId
     * @param httpServerResponse the httpServerResponse
     */
    @Override
    public void exportBomEngineerTitleExcel(String bomId, HttpServerResponse httpServerResponse) {

    }

    /**
     * 向数据库添加数据
     *
     * @param bomApproval             the bomApproval
     * @param bomEngineerTitle        the bomEngineerTitle
     * @param bomEngineerMaterialList the bomEngineerMaterialList
     */
    private void buildDataInto(BomApproval bomApproval, BomEngineerTitle bomEngineerTitle, List<BomEngineerMaterial> bomEngineerMaterialList) {
        bomApprovalService.save(bomApproval);
        this.save(bomEngineerTitle);
        bomEngineerMaterialService.saveBatch(bomEngineerMaterialList);
    }

    private BomEngineerTitle buildBomEngineerTitle(Sheet sheet) {
        BomEngineerTitle bomEngineerTitle = new BomEngineerTitle();
        //获取版本信息
        final String version = ExcelImportUtil.convertCell2ToString(sheet.getRow(1).getCell(3));
        bomEngineerTitle.setRev(version);
        //获取描述
        final String description = ExcelImportUtil.convertCell2ToString(sheet.getRow(2).getCell(3));
        bomEngineerTitle.setDescription(description);
        //获取设计人员
        final String designedUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(1).getCell(13));
        bomEngineerTitle.setDesignedUser(designedUser);
        //获取签名人员
        final String signatureUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(3).getCell(3));
        bomEngineerTitle.setDesignedUser(signatureUser);
        //获取签名日期
        final String designedDate = ExcelImportUtil.convertCell2ToString(sheet.getRow(5).getCell(3));
        bomEngineerTitle.setDesignedDate(LocalDateTime.parse(designedDate));
        //获取当前状态
        final String status = ExcelImportUtil.convertCell2ToString(sheet.getRow(5).getCell(17));
        bomEngineerTitle.setStatus(status);
        //获取车型
        final String applicableCar = ExcelImportUtil.convertCell2ToString(sheet.getRow(7).getCell(17));
        bomEngineerTitle.setApplicableCar(applicableCar);
        //获取倍数
        final String multiple = ExcelImportUtil.convertCell2ToString(sheet.getRow(9).getCell(17));
        bomEngineerTitle.setMultiple(Integer.parseInt(multiple));
        //获取设计Bom名称
        final String name = ExcelImportUtil.convertCell2ToString(sheet.getRow(5).getCell(23));
        bomEngineerTitle.setName(name);
        //获取设计Bom编码
        final String code = ExcelImportUtil.convertCell2ToString(sheet.getRow(8).getCell(23));
        bomEngineerTitle.setCode(code);
        return bomEngineerTitle;
    }

    private BomApproval buildBomApproval(Sheet sheet) {
        BomApproval bomApproval = new BomApproval();
        //标准化人员
        final String standardizedUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(1).getCell(17));
        bomApproval.setStandardizedUser(standardizedUser);
        //标准化日期
        final String standardizedDate = ExcelImportUtil.convertCell2ToString(sheet.getRow(1).getCell(18));
        bomApproval.setStandardizedDate(LocalDateTime.parse(standardizedDate));
        //校核人员
        final String checkedUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(3).getCell(13));
        bomApproval.setCheckedUser(checkedUser);
        //校核日期
        final String checkedDate = ExcelImportUtil.convertCell2ToString(sheet.getRow(3).getCell(14));
        bomApproval.setCheckedDate(LocalDateTime.parse(checkedDate));
        //批准人员
        final String approvedUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(3).getCell(17));
        bomApproval.setApprovedUser(approvedUser);
        //批准日期
        final String approvedDate = ExcelImportUtil.convertCell2ToString(sheet.getRow(3).getCell(18));
        bomApproval.setApprovedDate(LocalDateTime.parse(approvedDate));
        //审核人员
        final String auditUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(5).getCell(13));
        bomApproval.setAuditUser(auditUser);
        //审核人员日期
        final String auditDate = ExcelImportUtil.convertCell2ToString(sheet.getRow(5).getCell(14));
        bomApproval.setAuditDate(LocalDateTime.parse(auditDate));
        //会签人员1
        final String countersignUser = ExcelImportUtil.convertCell2ToString(sheet.getRow(7).getCell(13));
        bomApproval.setCountersignUser(countersignUser);
        //会签人员1时间
        final String countersignDate = ExcelImportUtil.convertCell2ToString(sheet.getRow(7).getCell(14));
        bomApproval.setCountersignDate(LocalDateTime.parse(countersignDate));
        //会签人员2
        final String countersign2User = ExcelImportUtil.convertCell2ToString(sheet.getRow(9).getCell(13));
        bomApproval.setCountersign2User(countersign2User);
        //会签人员2时间
        final String countersign2Date = ExcelImportUtil.convertCell2ToString(sheet.getRow(9).getCell(14));
        bomApproval.setCountersign2Date(LocalDateTime.parse(countersign2Date));
        return bomApproval;
    }

    private List<BomEngineerMaterial> buildContent(Sheet sheet) {
        Assert.isTrue(sheet.getPhysicalNumberOfRows() > 15, "没有物料数据，请重新导入！");
        List<BomEngineerMaterial> bomEngineerMaterialList = new ArrayList<>();
        BomEngineerMaterial bomEngineerMaterial;
        //循环遍历物料表数据
        for (int i = 15; i < sheet.getPhysicalNumberOfRows(); i++) {
            bomEngineerMaterial = new BomEngineerMaterial();
            Row row = sheet.getRow(i);
            //第17行数据为空，跳过此循环
            if (i == 16) {
                continue;
            }
            //获取顺号
            final String no = ExcelImportUtil.convertCell2ToString(row.getCell(1));
            bomEngineerMaterial.setNo(Integer.parseInt(no));
            //获取层次
            for (int j = 2; j <= 6; j++) {
                final String layer = ExcelImportUtil.convertCell2ToString(row.getCell(j));
                if (StringUtils.isNoneBlank(layer)) {
                    bomEngineerMaterial.setLayer(Integer.parseInt(layer));
                }
            }
            //获取件号
            final String rep = ExcelImportUtil.convertCell2ToString(row.getCell(7));
            bomEngineerMaterial.setRep(Integer.parseInt(rep));
            //获取数量
            final String qty = ExcelImportUtil.convertCell2ToString(row.getCell(8));
            bomEngineerMaterial.setQty(Integer.parseInt(qty));
            //获取物料编码
            final String materialCode = ExcelImportUtil.convertCell2ToString(row.getCell(9));
            bomEngineerMaterial.setMaterialCode(materialCode);
            //获取图样代号
            final String partNumber = ExcelImportUtil.convertCell2ToString(row.getCell(10));
            bomEngineerMaterial.setPartNumber(partNumber);
            //获取版本
            String rev = ExcelImportUtil.convertCell2ToString(row.getCell(11));
            bomEngineerMaterial.setRev(rev);
            //获取中文名称
            final String chineseDesignation = ExcelImportUtil.convertCell2ToString(row.getCell(12));
            bomEngineerMaterial.setChineseDesignation(chineseDesignation);
            //获取英文名称
            final String englishDesignation = ExcelImportUtil.convertCell2ToString(row.getCell(15));
            bomEngineerMaterial.setEnglishDesignation(englishDesignation);
            //获取单件重量
            final String singleWeight = ExcelImportUtil.convertCell2ToString(row.getCell(19));
            if (StringUtils.isNoneBlank(singleWeight)) {
                bomEngineerMaterial.setSingleWeight(new BigDecimal(singleWeight));
            }
            //获取总计
            String totalWeight = ExcelImportUtil.convertCell2ToString(row.getCell(20));
            bomEngineerMaterial.setTotalWeight(new BigDecimal(totalWeight));
            //获取材料和标准
            final String materialStandard = ExcelImportUtil.convertCell2ToString(row.getCell(21));
            bomEngineerMaterial.setMaterialStandard(materialStandard);
            //获取物料属性
            final String makeOrBuy = ExcelImportUtil.convertCell2ToString(row.getCell(23));
            bomEngineerMaterial.setMakeOrBuy(makeOrBuy);
            //获取备注
            final String remarks = ExcelImportUtil.convertCell2ToString(row.getCell(24));
            bomEngineerMaterial.setRemarks(remarks);
            //获取制造过程
            final String manufactureProcess = ExcelImportUtil.convertCell2ToString(row.getCell(25));
            bomEngineerMaterial.setManufactureProcess(manufactureProcess);
            bomEngineerMaterial.setId(IdUtil.randomUUID());
            //设置父Id（父Id）为第一次循环生成的id
            if (i > 15) {
                bomEngineerMaterial.setParentId(bomEngineerMaterialList.get(0).getId());
            }
            bomEngineerMaterialList.add(bomEngineerMaterial);
        }
        return bomEngineerMaterialList;
    }

}

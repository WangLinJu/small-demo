package com.itheilv.poi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheilv.poi.model.BomApproval;
import com.itheilv.poi.model.BomManufactureMaterial;
import com.itheilv.poi.model.BomManufactureMaterialTemp;
import com.itheilv.poi.mapper.BomManufactureMaterialTempMapper;
import com.itheilv.poi.model.BomManufactureTitle;
import com.itheilv.poi.service.*;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 * <p>
 * 工艺BOM物料临时表 服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
@Service
public class BomManufactureMaterialTempServiceImpl extends ServiceImpl<BomManufactureMaterialTempMapper, BomManufactureMaterialTemp> implements BomManufactureMaterialTempService {

    @Autowired
    private BomManufactureTitleService bomManufactureTitleService;

    @Autowired
    private BomApprovalService bomApprovalService;

    @Autowired
    private BomManufactureMaterialService bomManufactureMaterialService;

    @Override
    public void exportBomManufactureMaterialTempExcel(String bomId, HttpServletResponse response) throws IOException {
        //获取模板位置
        final InputStream is = this.getClass().getClassLoader().getResourceAsStream("template/MBOM.xlsx");
        //查询最新的工艺BOM的Tab页
        final List<BomManufactureTitle> bomManufactureTitleNewVersionTabList = bomManufactureTitleService.getBomManufactureTitleNewVersionTab(bomId);
        bomManufactureTitleNewVersionTabList.forEach(bomManufactureTitle -> {
            //设置审批表数据
            final BomApproval bomApproval = bomApprovalService.getOne(new QueryWrapper<BomApproval>().eq("BOM_ID", "1"));
            bomManufactureTitle.setBomApproval(bomApproval);
            //设置物料表数据(此处逻辑)
            final List<BomManufactureMaterial> bomManufactureMaterialList = bomManufactureMaterialService.list(null);
            bomManufactureTitle.setMaterialList(bomManufactureMaterialList);
        });
        //将文件放置到客户端下载
        this.setResponse(response);
        final Context context = new Context();
        context.putVar("titleList", bomManufactureTitleNewVersionTabList);
        JxlsHelper.getInstance().processTemplate(is, response.getOutputStream(), context);
    }

    private void setResponse(final HttpServletResponse response) {
        response.reset();
        response.setContentType("application/octet-stream; charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=" + "test.xlsx");
    }
}

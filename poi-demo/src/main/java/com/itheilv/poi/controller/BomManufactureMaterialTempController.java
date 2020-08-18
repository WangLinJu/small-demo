package com.itheilv.poi.controller;


import cn.hutool.http.server.HttpServerResponse;
import com.itheilv.poi.common.BaseResult;
import com.itheilv.poi.model.BomManufactureMaterialTemp;
import com.itheilv.poi.service.BomManufactureMaterialTempService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 工艺BOM物料临时表 前端控制器
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
@RestController
@RequestMapping("/poi/bomManufactureMaterialTemp")
@Api(tags = "工艺BOM物料临时表")
public class BomManufactureMaterialTempController {

    @Autowired
    private BomManufactureMaterialTempService bomManufactureMaterialTempService;

    @ApiOperation("工艺bom导出")
    @GetMapping("/exportBomManufactureMaterialTempExcel")
    public void exportBomManufactureMaterialTempExcel(String bomId, HttpServletResponse response) {
        try {
            bomManufactureMaterialTempService.exportBomManufactureMaterialTempExcel(bomId, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package com.itheilv.poi.controller;


import com.itheilv.poi.common.BaseResult;
import com.itheilv.poi.model.BomManufactureTitle;
import com.itheilv.poi.service.BomManufactureTitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 工艺BOM表 前端控制器
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
@RestController
@RequestMapping("/poi/bomManufactureTitle")
@Api(tags = "工艺BOM主表")
public class BomManufactureTitleController {

    @Autowired
    private BomManufactureTitleService bomManufactureTitleService;

    @GetMapping("/getBomManufactureTitleNewVersionTab")
    @ApiOperation("获取最新版本的Tab页")
    public BaseResult getBomManufactureTitleNewVersionTab(String bomId) {
        final List<BomManufactureTitle> bomManufactureTitleNewVersionTab = bomManufactureTitleService.getBomManufactureTitleNewVersionTab(bomId);
        return BaseResult.successResult(bomManufactureTitleNewVersionTab);
    }

}


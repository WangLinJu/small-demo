package com.itheilv.poi.controller;


import cn.hutool.http.server.HttpServerResponse;
import com.itheilv.poi.common.BaseResult;
import com.itheilv.poi.service.BomEngineerTitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 设计BOM表 前端控制器
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 * 设计Bom
 */
@RestController
@RequestMapping("/poi/bomEngineerTitle")
@Api(tags = "设计Bom表管理")
public class BomEngineerTitleController {

    @Autowired
    private BomEngineerTitleService bomEngineerTitleService;

    @ApiOperation(value = "设计Bom的导入")
    @PostMapping("/importBomEngineerTitleExcel")
    public BaseResult importBomEngineerTitleExcel(MultipartFile multipartFile, String projectId) {
        bomEngineerTitleService.importBomEngineerTitleExcel(multipartFile, projectId);
        return BaseResult.successResult("");
    }
}


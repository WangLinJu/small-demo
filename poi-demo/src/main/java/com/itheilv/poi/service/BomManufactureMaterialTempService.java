package com.itheilv.poi.service;

import cn.hutool.http.server.HttpServerResponse;
import com.itheilv.poi.model.BomManufactureMaterialTemp;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>
 * 工艺BOM物料临时表 服务类
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
public interface BomManufactureMaterialTempService extends IService<BomManufactureMaterialTemp> {

    /**
     * 设计Bom的导出
     *
     * @param bomId    the bomId
     * @param response the httpServerResponse
     */
    void exportBomManufactureMaterialTempExcel(String bomId, HttpServletResponse response) throws IOException;
}

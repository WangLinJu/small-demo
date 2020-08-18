package com.itheilv.poi.service;

import cn.hutool.http.server.HttpServerResponse;
import com.itheilv.poi.model.BomEngineerTitle;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 设计BOM表 服务类
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 */
public interface BomEngineerTitleService extends IService<BomEngineerTitle> {

    /**
     * 设计Bom的导入
     *
     * @param multipartFile 设计Bom
     * @param projectId 项目Id
     */
    void importBomEngineerTitleExcel(MultipartFile multipartFile, String projectId);

    void exportBomEngineerTitleExcel(String bomId, HttpServerResponse httpServerResponse);
}

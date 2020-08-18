package com.itheilv.poi.service;

import com.itheilv.poi.model.BomManufactureTitle;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 工艺BOM表 服务类
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
public interface BomManufactureTitleService extends IService<BomManufactureTitle> {

    List<BomManufactureTitle> getBomManufactureTitleNewVersionTab(String bomId);
}

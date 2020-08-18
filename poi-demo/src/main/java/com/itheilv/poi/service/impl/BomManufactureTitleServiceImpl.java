package com.itheilv.poi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheilv.poi.model.BomManufactureTitle;
import com.itheilv.poi.mapper.BomManufactureTitleMapper;
import com.itheilv.poi.service.BomManufactureTitleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 工艺BOM表 服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
@Service
public class BomManufactureTitleServiceImpl extends ServiceImpl<BomManufactureTitleMapper, BomManufactureTitle> implements BomManufactureTitleService {

    @Override
    public List<BomManufactureTitle> getBomManufactureTitleNewVersionTab(String bomId) {
        final List<BomManufactureTitle> manufactureTitleTabList = baseMapper.selectList(new QueryWrapper<BomManufactureTitle>().eq("BOM_ID", bomId));
        //对CODE进行分组，取最新的Tab
        final Map<String, BomManufactureTitle> lastNewVersionTabMap = manufactureTitleTabList.stream().collect(Collectors.toMap(BomManufactureTitle::getCode, Function.identity(), BinaryOperator.maxBy(Comparator.comparingInt(BomManufactureTitle::getVersion))));
        return new ArrayList<>(lastNewVersionTabMap.values());
    }
}

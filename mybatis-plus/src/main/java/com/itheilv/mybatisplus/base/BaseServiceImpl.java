package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;


/**
 * @author WSQ
 * @since 2020-09-27
 */
public class BaseServiceImpl<Mapper extends BaseMapper<Record>, Record extends BaseModel> extends ServiceImpl<Mapper, Record> implements BaseService<Record> {

    @Override
    public PageResult queryByPageWithAutoWrapper(Record record, Pagination pagination) {
        final List<Record> list = baseMapper.selectList(null);
        return null;
    }
}

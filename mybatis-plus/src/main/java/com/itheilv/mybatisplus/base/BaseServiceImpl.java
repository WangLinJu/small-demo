package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;


/**
 * @author WSQ
 * @since 2020-09-27
 */
public class BaseServiceImpl<Mapper extends BaseMapper<Record>, Record extends BaseModel> extends ServiceImpl<Mapper, Record> implements BaseService<Record> {

    @Override
    public List<Record> listByAutoWrapper(Record record) {
        return null;
    }

    @Override
    public Page<Record> queryByPageWithAutoWrapper(Record record, Page<Record> page) {
        return baseMapper.selectPage(page, null);
    }

    @Override
    public int remove(String id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateSelective(Record record) {
        return baseMapper.updateById(record);
    }

}

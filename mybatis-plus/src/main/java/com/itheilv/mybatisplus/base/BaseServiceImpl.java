package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.base.Optional;

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
    public PageResult<Record> queryByPageWithAutoWrapper(Record record, Pagination pagination) {
        return null;
    }

    @Override
    public PageResult<Record> queryByPageWithWrapper(Wrapper<Record> ew, Pagination pagination) {
        return null;
    }

    @Override
    public PageResult<Record> queryWithAutoWrapper(Record record) {
        return null;
    }

    @Override
    public PageResult<Record> doSelectCore(BaseModelSearch baseModelSearch) {
        return null;
    }


    @Override
    public int updateAllColumn(Record record) {
        return 0;
    }

    @Override
    public int remove(String id) {
        return 0;
    }

    @Override
    public boolean remove(Wrapper<Record> wrapper) {
        return false;
    }

    @Override
    public int removeAll(List<String> ids, Record record) {
        return 0;
    }

    @Override
    public int deleteByPKs(List<String> ids) {
        return 0;
    }

    @Override
    public Record getByPK(String id) {
        return null;
    }

    @Override
    public Optional<Record> getById(String id) {
        return null;
    }

    @Override
    public int selectCount(String key, String value) {
        return 0;
    }

    @Override
    public int selectCount(String key, String value, String recordId) {
        return 0;
    }


}

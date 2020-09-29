package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author WSQ
 * @since 2020-09-27
 */
public interface BaseService<Record> extends IService<Record> {

    /**
     * 根据Model条件，返回数据
     *
     * @param record record
     * @return list
     */
    List<Record> listByAutoWrapper(Record record);

    /**
     * 返回分页数据(后台根据Model自动生成Wrapper）
     *
     * @param record record
     * @param page   page
     * @return page
     */
    Page<Record> queryByPageWithAutoWrapper(Record record, Page<Record> page);

    /**
     * 逻辑删除
     *
     * @param id id
     * @return 更新成功记录个数
     */
    int remove(String id);

    /**
     * 更新 非空字段（null字段不更新）
     *
     * @param record 数据实体
     * @return 成功记录个数
     */
    int updateSelective(Record record);
}

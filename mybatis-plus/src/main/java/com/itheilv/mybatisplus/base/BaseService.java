package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author WSQ
 * @since 2020-09-27
 */
public interface BaseService<Record> extends IService<Record> {

    /**
     * 返回分页数据(后台根据Model自动生成Wrapper） 如果启用数据权限筛选，默认生效查询当前用户数据筛选范围
     *
     * @param record
     * @param pagination
     * @return
     */
    PageResult queryByPageWithAutoWrapper(Record record, Pagination pagination);

}

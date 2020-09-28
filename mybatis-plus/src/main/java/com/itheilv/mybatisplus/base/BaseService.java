package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
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
     * @param record     record
     * @param pagination pagination
     * @return PageResult
     */
    PageResult<Record> queryByPageWithAutoWrapper(Record record, Pagination pagination);

    /**
     * 返回分页数据(Wrapper）
     *
     * @param ew Wrapper
     * @param pagination
     * @return
     */
    PageResult<Record> queryByPageWithWrapper(Wrapper<Record> ew, Pagination pagination);

    /**
     * 根据条件返回全部数据（不分页）
     *
     * @param record
     * @return
     */
    PageResult<Record> queryWithAutoWrapper(Record record);

    /**
     * 根据model做查询，可以生成EntityWrapper(用于自定义扩展），例如指定查询字段
     * BaseModelSearch baseModelSearch = BaseModelSearch.create(record, pagination);
     * baseModelSearch可以取得对应的EntityWrapper，之后进行扩展
     *
     * @param baseModelSearch
     * @return
     */
     PageResult<Record> doSelectCore(BaseModelSearch baseModelSearch);



    /**
     * 更新全部字段（自动更新 修改人及修改时间）
     *
     * @param record 数据实体
     * @return 成功记录个数
     */
    int updateAllColumn(Record record);

    /**
     * 逻辑删除（更新删除标识、更新者、更新时间）
     *
     * @param id id
     * @return 更新成功记录个数
     */
    int remove(String id);

    /**
     * 逻辑删除
     *
     * @param wrapper
     * @return
     */
    boolean remove(Wrapper<Record> wrapper);

    /**
     * 逻辑批量删除
     *
     * @param ids    the list of id
     * @param record the record
     * @return the int
     */
    int removeAll(List<String> ids, Record record);


    int deleteByPKs(List<String> ids);


    Record getByPK(String id);


    com.google.common.base.Optional<Record> getById(String id);

    /**
     * <del>根据条件查询数量(主要应用于新增时验证重复)</del>
     * 用法：传入一个数据库字段，和对应的值，返回为该字段该值对应的数据的条数
     *
     * @param key（数据库的字段）value（要验证是否重复的值）
     * @return the int
     */
    int selectCount(String key, String value);

    /**
     * <del>根据条件查询数量(主要应用于修改时验证重复)</del>
     * 用法：传入一个数据库字段，和对应的值，返回为该字段该值对应的数据的条数
     *
     * @param key（数据库的字段）value（要验证是否重复的值）recordId（要验证重复的实体ID)
     * @return the int
     */
    int selectCount(String key, String value, String recordId);

}

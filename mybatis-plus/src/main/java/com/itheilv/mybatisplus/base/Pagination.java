package com.itheilv.mybatisplus.base;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author WSQ
 * @since 2020-09-23
 * 搜索参数分页器
 */
public class Pagination implements Serializable {

    public static final String DESC = "descend";
    public static final String ASC = "ascend";
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("页码,默认1")
    protected int pageNum = 1;
    @ApiModelProperty("每页条数,默认10")
    protected int pageSize = 10;
    @ApiModelProperty(value = "排序字段,默认createDate,单字段排序时配合sortOrder使用;支持多字段排序,'-'为降序,默认升序,例如'createBy+,updateBy-,createDate+',当多字段排序时,sortOrder属性无效")
    protected String sortField = "createDate";
    @ApiModelProperty(value = "排序:descend降序，ascend升序,默认descend降序")
    protected String sortOrder = DESC;

    public Pagination() {
    }

    public Pagination(int pageNum, int pageSize) {
        // 如果PageSize没有设置，0，则默认改为10,  如果是-1 ，则查询全部
        if (pageSize == 0) {
            pageSize = 10;
        }
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

}

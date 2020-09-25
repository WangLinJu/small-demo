package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author WSQ
 * @since 2020-09-24
 */
@SuppressWarnings(value = "unused")
public class BaseModel implements Serializable {

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    @TableId(type = IdType.ASSIGN_ID)
    protected String id;

    /**
     * 删除标记
     */
    @ApiModelProperty(value = "删除标记（0：正常；1：删除")
    @TableLogic
    protected String delFlag;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    protected String remarks;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    protected String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    protected LocalDate createDate;

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者")
    @TableField(value = "create_by", fill = FieldFill.INSERT_UPDATE)
    protected String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField(value = "create_by", fill = FieldFill.INSERT_UPDATE)
    protected LocalDate updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id='" + id +
                ", delFlag='" + delFlag +
                ", remarks='" + remarks +
                ", createBy='" + createBy +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy +
                ", updateDate=" + updateDate +
                '}';
    }
}

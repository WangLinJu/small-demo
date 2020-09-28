package com.itheilv.mybatisplus.base;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

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
    @TableField(value = "del_flag")
    protected String delFlag;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    @TableField(value = "remarks")
    protected String remarks;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    protected LocalDateTime createDate;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField(value = "update_date", fill = FieldFill.INSERT_UPDATE)
    protected LocalDateTime updateDate;

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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id='" + id +
                ", delFlag='" + delFlag +
                ", remarks='" + remarks +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}

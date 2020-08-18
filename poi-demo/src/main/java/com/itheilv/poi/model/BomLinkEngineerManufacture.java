package com.itheilv.poi.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 设计和工艺BOM关联表
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 */
@TableName("BOM_LINK_ENGINEER_MANUFACTURE")
@ApiModel(value="BomLinkEngineerManufacture对象", description="设计和工艺BOM关联表")
public class BomLinkEngineerManufacture implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "设计BOM名称")
    @TableField("EBOM_NAME")
    private String ebomName;

    @ApiModelProperty(value = "设计BOM编码")
    @TableField("EBOM_CODE")
    private String ebomCode;

    @ApiModelProperty(value = "工艺文件名称")
    @TableField("MBOM_NAME")
    private String mbomName;

    @ApiModelProperty(value = "工艺文件编码")
    @TableField("MBOM_CODE")
    private String mbomCode;

    @ApiModelProperty(value = "主键ID")
    @TableId("ID")
    private String id;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATE_BY")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "CREATE_DATE", fill = FieldFill.INSERT)
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新人")
    @TableField("UPDATE_BY")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "UPDATE_DATE", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "备注")
    @TableField("REMARKS")
    private String remarks;

    @ApiModelProperty(value = "删除开关 0：未删除  1：删除")
    @TableField("DEL_FLAG")
    private String delFlag;

    @ApiModelProperty(value = "租户ID")
    @TableField("TENANT_ID")
    private String tenantId;

    @ApiModelProperty(value = "设计BOM ID")
    @TableField("EBOM_ID")
    private String ebomId;

    @ApiModelProperty(value = "工艺BOM ID")
    @TableField("MBOM_ID")
    private String mbomId;

    @ApiModelProperty(value = "项目ID")
    @TableField("PROJECT_ID")
    private String projectId;


    public String getEbomName() {
        return ebomName;
    }

    public void setEbomName(String ebomName) {
        this.ebomName = ebomName;
    }

    public String getEbomCode() {
        return ebomCode;
    }

    public void setEbomCode(String ebomCode) {
        this.ebomCode = ebomCode;
    }

    public String getMbomName() {
        return mbomName;
    }

    public void setMbomName(String mbomName) {
        this.mbomName = mbomName;
    }

    public String getMbomCode() {
        return mbomCode;
    }

    public void setMbomCode(String mbomCode) {
        this.mbomCode = mbomCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getEbomId() {
        return ebomId;
    }

    public void setEbomId(String ebomId) {
        this.ebomId = ebomId;
    }

    public String getMbomId() {
        return mbomId;
    }

    public void setMbomId(String mbomId) {
        this.mbomId = mbomId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "BomLinkEngineerManufacture{" +
        "ebomName=" + ebomName +
        ", ebomCode=" + ebomCode +
        ", mbomName=" + mbomName +
        ", mbomCode=" + mbomCode +
        ", id=" + id +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", remarks=" + remarks +
        ", delFlag=" + delFlag +
        ", tenantId=" + tenantId +
        ", ebomId=" + ebomId +
        ", mbomId=" + mbomId +
        ", projectId=" + projectId +
        "}";
    }
}

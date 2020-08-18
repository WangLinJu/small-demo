package com.itheilv.poi.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 设计BOM表
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 */
@TableName("BOM_ENGINEER_TITLE")
@ApiModel(value="BomEngineerTitle对象", description="设计BOM表")
public class BomEngineerTitle implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "设计BOM名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "设计BOM编码")
    @TableField("CODE")
    private String code;

    @ApiModelProperty(value = "版本")
    @TableField("REV")
    private String rev;

    @ApiModelProperty(value = "描述")
    @TableField("DESCRIPTION")
    private String description;

    @ApiModelProperty(value = "签名人员")
    @TableField("SIGNATURE_USER")
    private String signatureUser;

    @ApiModelProperty(value = "签名日期")
    @TableField("SIGNATURE_DATE")
    private LocalDateTime signatureDate;

    @ApiModelProperty(value = "设计人员")
    @TableField("DESIGNED_USER")
    private String designedUser;

    @ApiModelProperty(value = "设计日期")
    @TableField("DESIGNED_DATE")
    private LocalDateTime designedDate;

    @ApiModelProperty(value = "当前状态")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "适用车型")
    @TableField("APPLICABLE_CAR")
    private String applicableCar;

    @ApiModelProperty(value = "倍数")
    @TableField("MULTIPLE")
    private Integer multiple;

    @ApiModelProperty(value = "父级ID")
    @TableField("PARENT_ID")
    private String parentId;

    @ApiModelProperty(value = "所有父级ID")
    @TableField("PARENT_IDS")
    private String parentIds;

    @ApiModelProperty(value = "子表对应最大子级ID")
    @TableField("CHILD_ID")
    private String childId;

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

    @ApiModelProperty(value = "项目ID")
    @TableField("PROJECT_ID")
    private String projectId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSignatureUser() {
        return signatureUser;
    }

    public void setSignatureUser(String signatureUser) {
        this.signatureUser = signatureUser;
    }

    public LocalDateTime getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(LocalDateTime signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getDesignedUser() {
        return designedUser;
    }

    public void setDesignedUser(String designedUser) {
        this.designedUser = designedUser;
    }

    public LocalDateTime getDesignedDate() {
        return designedDate;
    }

    public void setDesignedDate(LocalDateTime designedDate) {
        this.designedDate = designedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplicableCar() {
        return applicableCar;
    }

    public void setApplicableCar(String applicableCar) {
        this.applicableCar = applicableCar;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "BomEngineerTitle{" +
        "name=" + name +
        ", code=" + code +
        ", rev=" + rev +
        ", description=" + description +
        ", signatureUser=" + signatureUser +
        ", signatureDate=" + signatureDate +
        ", designedUser=" + designedUser +
        ", designedDate=" + designedDate +
        ", status=" + status +
        ", applicableCar=" + applicableCar +
        ", multiple=" + multiple +
        ", parentId=" + parentId +
        ", parentIds=" + parentIds +
        ", childId=" + childId +
        ", id=" + id +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", remarks=" + remarks +
        ", delFlag=" + delFlag +
        ", tenantId=" + tenantId +
        ", projectId=" + projectId +
        "}";
    }
}

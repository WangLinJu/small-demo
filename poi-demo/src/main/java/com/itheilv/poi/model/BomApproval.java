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
 * BOM审批情况表
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 */
@TableName("BOM_APPROVAL")
@ApiModel(value="BomApproval对象", description="BOM审批情况表")
public class BomApproval implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "校核人员")
    @TableField("CHECKED_USER")
    private String checkedUser;

    @ApiModelProperty(value = "校核日期")
    @TableField("CHECKED_DATE")
    private LocalDateTime checkedDate;

    @ApiModelProperty(value = "审核人员")
    @TableField("AUDIT_USER")
    private String auditUser;

    @ApiModelProperty(value = "审核日期")
    @TableField("AUDIT_DATE")
    private LocalDateTime auditDate;

    @ApiModelProperty(value = "会签人员")
    @TableField("COUNTERSIGN_USER")
    private String countersignUser;

    @ApiModelProperty(value = "会签日期")
    @TableField("COUNTERSIGN_DATE")
    private LocalDateTime countersignDate;

    @ApiModelProperty(value = "会签人员2")
    @TableField("COUNTERSIGN2_USER")
    private String countersign2User;

    @ApiModelProperty(value = "会签日期2")
    @TableField("COUNTERSIGN2_DATE")
    private LocalDateTime countersign2Date;

    @ApiModelProperty(value = "标准化人员")
    @TableField("STANDARDIZED_USER")
    private String standardizedUser;

    @ApiModelProperty(value = "标准化日期")
    @TableField("STANDARDIZED_DATE")
    private LocalDateTime standardizedDate;

    @ApiModelProperty(value = "批准人员")
    @TableField("APPROVED_USER")
    private String approvedUser;

    @ApiModelProperty(value = "批准日期")
    @TableField("APPROVED_DATE")
    private LocalDateTime approvedDate;

    @ApiModelProperty(value = "设计或工艺BOM表的ID")
    @TableField("BOM_ID")
    private String bomId;

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

    @ApiModelProperty(value = "BOM类型(1设计BOM 2工艺BOM)")
    @TableField("BOM_TYPE")
    private String bomType;


    public String getCheckedUser() {
        return checkedUser;
    }

    public void setCheckedUser(String checkedUser) {
        this.checkedUser = checkedUser;
    }

    public LocalDateTime getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(LocalDateTime checkedDate) {
        this.checkedDate = checkedDate;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public String getCountersignUser() {
        return countersignUser;
    }

    public void setCountersignUser(String countersignUser) {
        this.countersignUser = countersignUser;
    }

    public LocalDateTime getCountersignDate() {
        return countersignDate;
    }

    public void setCountersignDate(LocalDateTime countersignDate) {
        this.countersignDate = countersignDate;
    }

    public String getCountersign2User() {
        return countersign2User;
    }

    public void setCountersign2User(String countersign2User) {
        this.countersign2User = countersign2User;
    }

    public LocalDateTime getCountersign2Date() {
        return countersign2Date;
    }

    public void setCountersign2Date(LocalDateTime countersign2Date) {
        this.countersign2Date = countersign2Date;
    }

    public String getStandardizedUser() {
        return standardizedUser;
    }

    public void setStandardizedUser(String standardizedUser) {
        this.standardizedUser = standardizedUser;
    }

    public LocalDateTime getStandardizedDate() {
        return standardizedDate;
    }

    public void setStandardizedDate(LocalDateTime standardizedDate) {
        this.standardizedDate = standardizedDate;
    }

    public String getApprovedUser() {
        return approvedUser;
    }

    public void setApprovedUser(String approvedUser) {
        this.approvedUser = approvedUser;
    }

    public LocalDateTime getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(LocalDateTime approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getBomId() {
        return bomId;
    }

    public void setBomId(String bomId) {
        this.bomId = bomId;
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

    public String getBomType() {
        return bomType;
    }

    public void setBomType(String bomType) {
        this.bomType = bomType;
    }

    @Override
    public String toString() {
        return "BomApproval{" +
        "checkedUser=" + checkedUser +
        ", checkedDate=" + checkedDate +
        ", auditUser=" + auditUser +
        ", auditDate=" + auditDate +
        ", countersignUser=" + countersignUser +
        ", countersignDate=" + countersignDate +
        ", countersign2User=" + countersign2User +
        ", countersign2Date=" + countersign2Date +
        ", standardizedUser=" + standardizedUser +
        ", standardizedDate=" + standardizedDate +
        ", approvedUser=" + approvedUser +
        ", approvedDate=" + approvedDate +
        ", bomId=" + bomId +
        ", id=" + id +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", remarks=" + remarks +
        ", delFlag=" + delFlag +
        ", tenantId=" + tenantId +
        ", bomType=" + bomType +
        "}";
    }
}

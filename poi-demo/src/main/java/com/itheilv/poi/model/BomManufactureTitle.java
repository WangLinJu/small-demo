package com.itheilv.poi.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 工艺BOM表
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
@TableName("BOM_MANUFACTURE_TITLE")
@ApiModel(value = "BomManufactureTitle对象", description = "工艺BOM表")
public class BomManufactureTitle implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工艺文件名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "工艺文件编码")
    @TableField("CODE")
    private String code;

    @ApiModelProperty(value = "序号")
    @TableField("NO")
    private Integer no;

    @ApiModelProperty(value = "工艺类型 0:工艺BOM文件 1:作业指导书")
    @TableField("PROCESS_BOM_TYPE")
    private String processBomType;

    @ApiModelProperty(value = "图样代号")
    @TableField("PART_NUMBER")
    private String partNumber;

    @ApiModelProperty(value = "来源")
    @TableField("SOURCE")
    private String source;

    @ApiModelProperty(value = "指导书位置")
    @TableField("GUIDE_FILE_LOCATION")
    private String guideFileLocation;

    @ApiModelProperty(value = "当前状态（0临时数据状态 1确认数据状态 2提交审批状态 3审批中 4审批成功 5审批失败）")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "车型")
    @TableField("APPLICABLE_CAR")
    private String applicableCar;

    @ApiModelProperty(value = "倍数")
    @TableField("MULTIPLE")
    private Integer multiple;

    @ApiModelProperty(value = "工位")
    @TableField("WORK_STATION")
    private String workStation;

    @ApiModelProperty(value = "系统")
    @TableField("APPLICABLE_SYSTEM")
    private String applicableSystem;

    @ApiModelProperty(value = "项目ID")
    @TableField("PROJECT_ID")
    private String projectId;

    @ApiModelProperty(value = "版本")
    @TableField("REV")
    private String rev;

    @ApiModelProperty(value = "变更类型")
    @TableField("CHANGE_TYPE")
    private String changeType;

    @ApiModelProperty(value = "变更理由")
    @TableField("CHANGE_REASON")
    private String changeReason;

    @ApiModelProperty(value = "变更人")
    @TableField("CHANGE_USER")
    private String changeUser;

    @ApiModelProperty(value = "变更时间")
    @TableField("CHANGE_DATE")
    private LocalDateTime changeDate;

    @ApiModelProperty(value = "其他")
    @TableField("OTHER")
    private String other;

    @ApiModelProperty(value = "子表对应最大子级ID")
    @TableField("CHILD_ID")
    private String childId;

    @ApiModelProperty(value = "适应版本")
    @TableField("VERSION")
    private Integer version;

    @ApiModelProperty(value = "父级ID")
    @TableField("PARENT_ID")
    private String parentId;

    @ApiModelProperty(value = "所有父级ID")
    @TableField("PARENT_IDS")
    private String parentIds;

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

    @ApiModelProperty(value = "工艺BOM名称")
    @TableField("BOM_NAME")
    private String bomName;

    @ApiModelProperty(value = "工艺BOM ID")
    @TableField("BOM_ID")
    private String bomId;

    @ApiModelProperty(value = "审批表数据")
    @TableField(exist = false)
    private BomApproval bomApproval;

    /**
     * 物料详情数据（用于bom导出）
     */
    @TableField(exist = false)
    @ApiModelProperty(value = "物料详情数据")
    protected List<BomManufactureMaterial> materialList;


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

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getProcessBomType() {
        return processBomType;
    }

    public void setProcessBomType(String processBomType) {
        this.processBomType = processBomType;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getGuideFileLocation() {
        return guideFileLocation;
    }

    public void setGuideFileLocation(String guideFileLocation) {
        this.guideFileLocation = guideFileLocation;
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

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getApplicableSystem() {
        return applicableSystem;
    }

    public void setApplicableSystem(String applicableSystem) {
        this.applicableSystem = applicableSystem;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public String getChangeUser() {
        return changeUser;
    }

    public void setChangeUser(String changeUser) {
        this.changeUser = changeUser;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public String getBomName() {
        return bomName;
    }

    public void setBomName(String bomName) {
        this.bomName = bomName;
    }

    public String getBomId() {
        return bomId;
    }

    public void setBomId(String bomId) {
        this.bomId = bomId;
    }

    public BomApproval getBomApproval() {
        return bomApproval;
    }

    public void setBomApproval(BomApproval bomApproval) {
        this.bomApproval = bomApproval;
    }

    public List<BomManufactureMaterial> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<BomManufactureMaterial> materialList) {
        this.materialList = materialList;
    }

    @Override
    public String toString() {
        return "BomManufactureTitle{" +
                "name=" + name +
                ", code=" + code +
                ", no=" + no +
                ", processBomType=" + processBomType +
                ", partNumber=" + partNumber +
                ", source=" + source +
                ", guideFileLocation=" + guideFileLocation +
                ", status=" + status +
                ", applicableCar=" + applicableCar +
                ", multiple=" + multiple +
                ", workStation=" + workStation +
                ", applicableSystem=" + applicableSystem +
                ", projectId=" + projectId +
                ", rev=" + rev +
                ", changeType=" + changeType +
                ", changeReason=" + changeReason +
                ", changeUser=" + changeUser +
                ", changeDate=" + changeDate +
                ", other=" + other +
                ", childId=" + childId +
                ", version=" + version +
                ", parentId=" + parentId +
                ", parentIds=" + parentIds +
                ", id=" + id +
                ", createBy=" + createBy +
                ", createDate=" + createDate +
                ", updateBy=" + updateBy +
                ", updateDate=" + updateDate +
                ", remarks=" + remarks +
                ", delFlag=" + delFlag +
                ", tenantId=" + tenantId +
                ", bomName=" + bomName +
                ", bomId=" + bomId +
                ", bomApproval=" + bomApproval +
                ", materialList=" + materialList +
                "}";
    }
}

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
 * 工艺BOM物料临时表
 * </p>
 *
 * @author WSQ
 * @since 2020-08-06
 */
@TableName("BOM_MANUFACTURE_MATERIAL_TEMP")
@ApiModel(value="BomManufactureMaterialTemp对象", description="工艺BOM物料临时表")
public class BomManufactureMaterialTemp implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "投料顺序号")
    @TableField("FEED_NO")
    private Integer feedNo;

    @ApiModelProperty(value = "件号")
    @TableField("REP")
    private String rep;

    @ApiModelProperty(value = "物料编码")
    @TableField("MATERIAL_CODE")
    private String materialCode;

    @ApiModelProperty(value = "图样代号")
    @TableField("PART_NUMBER")
    private String partNumber;

    @ApiModelProperty(value = "虚拟件标识")
    @TableField("PHANTOM_FLAG")
    private String phantomFlag;

    @ApiModelProperty(value = "中文名称")
    @TableField("CHINESE_DESIGNATION")
    private String chineseDesignation;

    @ApiModelProperty(value = "版本")
    @TableField("REV")
    private String rev;

    @ApiModelProperty(value = "工艺路线")
    @TableField("MANUFACTURE_ROUTE")
    private String manufactureRoute;

    @ApiModelProperty(value = "物料属性")
    @TableField("MAKE_OR_BUY")
    private String makeOrBuy;

    @ApiModelProperty(value = "数量")
    @TableField("QTY")
    private Integer qty;

    @ApiModelProperty(value = "单位")
    @TableField("UNIT")
    private String unit;

    @ApiModelProperty(value = "中车编码")
    @TableField("CRRC_CODE")
    private String crrcCode;

    @ApiModelProperty(value = "最小适用版本")
    @TableField("MIN_VERSION")
    private Integer minVersion;

    @ApiModelProperty(value = "最大适用版本")
    @TableField("MAX_VERSION")
    private Integer maxVersion;

    @ApiModelProperty(value = "版本变更类型(C:增加,U:修改,D:删除)")
    @TableField("ALTERATION_TYPE")
    private String alterationType;

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

    @ApiModelProperty(value = "工艺表CODE")
    @TableField("MBOM_CODE")
    private String mbomCode;

    @ApiModelProperty(value = "序号")
    @TableField("NO")
    private Integer no;


    public Integer getFeedNo() {
        return feedNo;
    }

    public void setFeedNo(Integer feedNo) {
        this.feedNo = feedNo;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPhantomFlag() {
        return phantomFlag;
    }

    public void setPhantomFlag(String phantomFlag) {
        this.phantomFlag = phantomFlag;
    }

    public String getChineseDesignation() {
        return chineseDesignation;
    }

    public void setChineseDesignation(String chineseDesignation) {
        this.chineseDesignation = chineseDesignation;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getManufactureRoute() {
        return manufactureRoute;
    }

    public void setManufactureRoute(String manufactureRoute) {
        this.manufactureRoute = manufactureRoute;
    }

    public String getMakeOrBuy() {
        return makeOrBuy;
    }

    public void setMakeOrBuy(String makeOrBuy) {
        this.makeOrBuy = makeOrBuy;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCrrcCode() {
        return crrcCode;
    }

    public void setCrrcCode(String crrcCode) {
        this.crrcCode = crrcCode;
    }

    public Integer getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(Integer minVersion) {
        this.minVersion = minVersion;
    }

    public Integer getMaxVersion() {
        return maxVersion;
    }

    public void setMaxVersion(Integer maxVersion) {
        this.maxVersion = maxVersion;
    }

    public String getAlterationType() {
        return alterationType;
    }

    public void setAlterationType(String alterationType) {
        this.alterationType = alterationType;
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

    public String getMbomCode() {
        return mbomCode;
    }

    public void setMbomCode(String mbomCode) {
        this.mbomCode = mbomCode;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "BomManufactureMaterialTemp{" +
        "feedNo=" + feedNo +
        ", rep=" + rep +
        ", materialCode=" + materialCode +
        ", partNumber=" + partNumber +
        ", phantomFlag=" + phantomFlag +
        ", chineseDesignation=" + chineseDesignation +
        ", rev=" + rev +
        ", manufactureRoute=" + manufactureRoute +
        ", makeOrBuy=" + makeOrBuy +
        ", qty=" + qty +
        ", unit=" + unit +
        ", crrcCode=" + crrcCode +
        ", minVersion=" + minVersion +
        ", maxVersion=" + maxVersion +
        ", alterationType=" + alterationType +
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
        ", mbomCode=" + mbomCode +
        ", no=" + no +
        "}";
    }
}

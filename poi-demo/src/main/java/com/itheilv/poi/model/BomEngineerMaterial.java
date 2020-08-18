package com.itheilv.poi.model;

import java.math.BigDecimal;
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
 * 设计BOM物料表
 * </p>
 *
 * @author WSQ
 * @since 2020-07-30
 */
@TableName("BOM_ENGINEER_MATERIAL")
@ApiModel(value="BomEngineerMaterial对象", description="设计BOM物料表")
public class BomEngineerMaterial implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "顺号")
    @TableField("NO")
    private Integer no;

    @ApiModelProperty(value = "层次")
    @TableField("LAYER")
    private Integer layer;

    @ApiModelProperty(value = "件号")
    @TableField("REP")
    private Integer rep;

    @ApiModelProperty(value = "数量")
    @TableField("QTY")
    private Integer qty;

    @ApiModelProperty(value = "物料编码")
    @TableField("MATERIAL_CODE")
    private String materialCode;

    @ApiModelProperty(value = "图样代号")
    @TableField("PART_NUMBER")
    private String partNumber;

    @ApiModelProperty(value = "版本")
    @TableField("REV")
    private String rev;

    @ApiModelProperty(value = "中文名称")
    @TableField("CHINESE_DESIGNATION")
    private String chineseDesignation;

    @ApiModelProperty(value = "英文名称")
    @TableField("ENGLISH_DESIGNATION")
    private String englishDesignation;

    @ApiModelProperty(value = "单件重量")
    @TableField("SINGLE_WEIGHT")
    private BigDecimal singleWeight;

    @ApiModelProperty(value = "总计重量")
    @TableField("TOTAL_WEIGHT")
    private BigDecimal totalWeight;

    @ApiModelProperty(value = "材料和标准")
    @TableField("MATERIAL_STANDARD")
    private String materialStandard;

    @ApiModelProperty(value = "物料属性")
    @TableField("MAKE_OR_BUY")
    private String makeOrBuy;

    @ApiModelProperty(value = "制造过程")
    @TableField("MANUFACTURE_PROCESS")
    private String manufactureProcess;

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

    @ApiModelProperty(value = "未使用数量")
    @TableField("UNUSED_QTY")
    private Integer unusedQty;

    @ApiModelProperty(value = "区分数据的唯一标识")
    @TableField("UNIQUE_ID")
    private String uniqueId;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getRep() {
        return rep;
    }

    public void setRep(Integer rep) {
        this.rep = rep;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
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

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getChineseDesignation() {
        return chineseDesignation;
    }

    public void setChineseDesignation(String chineseDesignation) {
        this.chineseDesignation = chineseDesignation;
    }

    public String getEnglishDesignation() {
        return englishDesignation;
    }

    public void setEnglishDesignation(String englishDesignation) {
        this.englishDesignation = englishDesignation;
    }

    public BigDecimal getSingleWeight() {
        return singleWeight;
    }

    public void setSingleWeight(BigDecimal singleWeight) {
        this.singleWeight = singleWeight;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getMaterialStandard() {
        return materialStandard;
    }

    public void setMaterialStandard(String materialStandard) {
        this.materialStandard = materialStandard;
    }

    public String getMakeOrBuy() {
        return makeOrBuy;
    }

    public void setMakeOrBuy(String makeOrBuy) {
        this.makeOrBuy = makeOrBuy;
    }

    public String getManufactureProcess() {
        return manufactureProcess;
    }

    public void setManufactureProcess(String manufactureProcess) {
        this.manufactureProcess = manufactureProcess;
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

    public Integer getUnusedQty() {
        return unusedQty;
    }

    public void setUnusedQty(Integer unusedQty) {
        this.unusedQty = unusedQty;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "BomEngineerMaterial{" +
        "no=" + no +
        ", layer=" + layer +
        ", rep=" + rep +
        ", qty=" + qty +
        ", materialCode=" + materialCode +
        ", partNumber=" + partNumber +
        ", rev=" + rev +
        ", chineseDesignation=" + chineseDesignation +
        ", englishDesignation=" + englishDesignation +
        ", singleWeight=" + singleWeight +
        ", totalWeight=" + totalWeight +
        ", materialStandard=" + materialStandard +
        ", makeOrBuy=" + makeOrBuy +
        ", manufactureProcess=" + manufactureProcess +
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
        ", unusedQty=" + unusedQty +
        ", uniqueId=" + uniqueId +
        "}";
    }
}

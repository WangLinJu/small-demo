package com.itheilv.poi.model.po;

import com.itheilv.poi.model.BomApproval;
import com.itheilv.poi.model.BomEngineerMaterial;
import com.itheilv.poi.model.BomEngineerTitle;


import java.util.List;

/**
 * @author WSQ
 * @since 2020-07-31
 *
 */
public class BomEngineerPO {
    /**
     * 设计Bom头部关联数据
     */
    private BomApproval bomApproval;
    /**
     * 设计Bom头部关联数据
     */
    private BomEngineerTitle bomEngineerTitle;
    /**
     * 设计Bom物料数据
     */
    private List<BomEngineerMaterial> bomEngineerMaterialList;

    public BomApproval getBomApproval() {
        return bomApproval;
    }

    public void setBomApproval(BomApproval bomApproval) {
        this.bomApproval = bomApproval;
    }

    public BomEngineerTitle getBomEngineerTitle() {
        return bomEngineerTitle;
    }

    public void setBomEngineerTitle(BomEngineerTitle bomEngineerTitle) {
        this.bomEngineerTitle = bomEngineerTitle;
    }

    public List<BomEngineerMaterial> getBomEngineerMaterialList() {
        return bomEngineerMaterialList;
    }

    public void setBomEngineerMaterialList(List<BomEngineerMaterial> bomEngineerMaterialList) {
        this.bomEngineerMaterialList = bomEngineerMaterialList;
    }

    @Override
    public String toString() {
        return "BomEngineerPO{" +
                "bomApproval=" + bomApproval +
                ", bomEngineerTitle=" + bomEngineerTitle +
                ", bomEngineerMaterialList=" + bomEngineerMaterialList +
                '}';
    }
}

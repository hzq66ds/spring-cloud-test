package com.dbEntity.member.basicentity;

import java.math.BigDecimal;
import java.util.Date;

public class LxCecEquipmentInfo {
    private Long id;

    private String stationId;

    private String operatorId;

    private String equipmentId;

    private String manufactureId;

    private String manufactureName;

    private String equipmentModel;

    private String manufactureModel;

    private String softwareVersion;

    private String productionDate;

    private Integer equipmentType;

    private BigDecimal equipmentLng;

    private BigDecimal equipmentLat;

    private BigDecimal power;

    private String equipmentName;

    private Date createTime;

    private Date updateTime;

    private String proxyOperatorId;

    private Integer artificialState;

    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public String getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId == null ? null : manufactureId.trim();
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName == null ? null : manufactureName.trim();
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel == null ? null : equipmentModel.trim();
    }

    public String getManufactureModel() {
        return manufactureModel;
    }

    public void setManufactureModel(String manufactureModel) {
        this.manufactureModel = manufactureModel == null ? null : manufactureModel.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate == null ? null : productionDate.trim();
    }

    public Integer getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
    }

    public BigDecimal getEquipmentLng() {
        return equipmentLng;
    }

    public void setEquipmentLng(BigDecimal equipmentLng) {
        this.equipmentLng = equipmentLng;
    }

    public BigDecimal getEquipmentLat() {
        return equipmentLat;
    }

    public void setEquipmentLat(BigDecimal equipmentLat) {
        this.equipmentLat = equipmentLat;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProxyOperatorId() {
        return proxyOperatorId;
    }

    public void setProxyOperatorId(String proxyOperatorId) {
        this.proxyOperatorId = proxyOperatorId == null ? null : proxyOperatorId.trim();
    }

    public Integer getArtificialState() {
        return artificialState;
    }

    public void setArtificialState(Integer artificialState) {
        this.artificialState = artificialState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
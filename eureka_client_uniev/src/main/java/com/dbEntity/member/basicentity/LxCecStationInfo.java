package com.dbEntity.member.basicentity;

import java.math.BigDecimal;
import java.util.Date;

public class LxCecStationInfo {
    private Long id;

    private String operatorId;

    private String stationId;

    private String equipmentOwnerId;

    private String stationName;

    private String stationCustomName;

    private String countryCode;

    private String areaCode;

    private String address;

    private String stationTel;

    private String serviceTel;

    private Integer stationType;

    private Integer stationCustomType;

    private Integer stationStatus;

    private Integer parkNums;

    private BigDecimal stationLng;

    private BigDecimal stationLat;

    private String siteGuide;

    private Integer construction;

    private String matchCars;

    private String parkInfo;

    private String businessHours;

    private String electricityFee;

    private String serviceFee;

    private String originalElectricityFee;

    private String originalServiceFee;

    private String businessElectricityFee;

    private String businessServiceFee;

    private String parkFee;

    private String businessHoursFormat;

    private Integer businessHours724;

    private BigDecimal electricityTax;

    private BigDecimal serviceTax;

    private Integer parkFeeFree;

    private Integer parkingDiscountType;

    private Integer parkFeeStatus;

    private Integer printerFlag;

    private Integer barrierFlag;

    private String payment;

    private Integer supportOrder;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String proxyOperatorId;

    private Integer artificialState;

    private Integer state;

    private String capabilityTag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getEquipmentOwnerId() {
        return equipmentOwnerId;
    }

    public void setEquipmentOwnerId(String equipmentOwnerId) {
        this.equipmentOwnerId = equipmentOwnerId == null ? null : equipmentOwnerId.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationCustomName() {
        return stationCustomName;
    }

    public void setStationCustomName(String stationCustomName) {
        this.stationCustomName = stationCustomName == null ? null : stationCustomName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStationTel() {
        return stationTel;
    }

    public void setStationTel(String stationTel) {
        this.stationTel = stationTel == null ? null : stationTel.trim();
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel == null ? null : serviceTel.trim();
    }

    public Integer getStationType() {
        return stationType;
    }

    public void setStationType(Integer stationType) {
        this.stationType = stationType;
    }

    public Integer getStationCustomType() {
        return stationCustomType;
    }

    public void setStationCustomType(Integer stationCustomType) {
        this.stationCustomType = stationCustomType;
    }

    public Integer getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(Integer stationStatus) {
        this.stationStatus = stationStatus;
    }

    public Integer getParkNums() {
        return parkNums;
    }

    public void setParkNums(Integer parkNums) {
        this.parkNums = parkNums;
    }

    public BigDecimal getStationLng() {
        return stationLng;
    }

    public void setStationLng(BigDecimal stationLng) {
        this.stationLng = stationLng;
    }

    public BigDecimal getStationLat() {
        return stationLat;
    }

    public void setStationLat(BigDecimal stationLat) {
        this.stationLat = stationLat;
    }

    public String getSiteGuide() {
        return siteGuide;
    }

    public void setSiteGuide(String siteGuide) {
        this.siteGuide = siteGuide == null ? null : siteGuide.trim();
    }

    public Integer getConstruction() {
        return construction;
    }

    public void setConstruction(Integer construction) {
        this.construction = construction;
    }

    public String getMatchCars() {
        return matchCars;
    }

    public void setMatchCars(String matchCars) {
        this.matchCars = matchCars == null ? null : matchCars.trim();
    }

    public String getParkInfo() {
        return parkInfo;
    }

    public void setParkInfo(String parkInfo) {
        this.parkInfo = parkInfo == null ? null : parkInfo.trim();
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours == null ? null : businessHours.trim();
    }

    public String getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(String electricityFee) {
        this.electricityFee = electricityFee == null ? null : electricityFee.trim();
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee == null ? null : serviceFee.trim();
    }

    public String getOriginalElectricityFee() {
        return originalElectricityFee;
    }

    public void setOriginalElectricityFee(String originalElectricityFee) {
        this.originalElectricityFee = originalElectricityFee == null ? null : originalElectricityFee.trim();
    }

    public String getOriginalServiceFee() {
        return originalServiceFee;
    }

    public void setOriginalServiceFee(String originalServiceFee) {
        this.originalServiceFee = originalServiceFee == null ? null : originalServiceFee.trim();
    }

    public String getBusinessElectricityFee() {
        return businessElectricityFee;
    }

    public void setBusinessElectricityFee(String businessElectricityFee) {
        this.businessElectricityFee = businessElectricityFee == null ? null : businessElectricityFee.trim();
    }

    public String getBusinessServiceFee() {
        return businessServiceFee;
    }

    public void setBusinessServiceFee(String businessServiceFee) {
        this.businessServiceFee = businessServiceFee == null ? null : businessServiceFee.trim();
    }

    public String getParkFee() {
        return parkFee;
    }

    public void setParkFee(String parkFee) {
        this.parkFee = parkFee == null ? null : parkFee.trim();
    }

    public String getBusinessHoursFormat() {
        return businessHoursFormat;
    }

    public void setBusinessHoursFormat(String businessHoursFormat) {
        this.businessHoursFormat = businessHoursFormat == null ? null : businessHoursFormat.trim();
    }

    public Integer getBusinessHours724() {
        return businessHours724;
    }

    public void setBusinessHours724(Integer businessHours724) {
        this.businessHours724 = businessHours724;
    }

    public BigDecimal getElectricityTax() {
        return electricityTax;
    }

    public void setElectricityTax(BigDecimal electricityTax) {
        this.electricityTax = electricityTax;
    }

    public BigDecimal getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(BigDecimal serviceTax) {
        this.serviceTax = serviceTax;
    }

    public Integer getParkFeeFree() {
        return parkFeeFree;
    }

    public void setParkFeeFree(Integer parkFeeFree) {
        this.parkFeeFree = parkFeeFree;
    }

    public Integer getParkingDiscountType() {
        return parkingDiscountType;
    }

    public void setParkingDiscountType(Integer parkingDiscountType) {
        this.parkingDiscountType = parkingDiscountType;
    }

    public Integer getParkFeeStatus() {
        return parkFeeStatus;
    }

    public void setParkFeeStatus(Integer parkFeeStatus) {
        this.parkFeeStatus = parkFeeStatus;
    }

    public Integer getPrinterFlag() {
        return printerFlag;
    }

    public void setPrinterFlag(Integer printerFlag) {
        this.printerFlag = printerFlag;
    }

    public Integer getBarrierFlag() {
        return barrierFlag;
    }

    public void setBarrierFlag(Integer barrierFlag) {
        this.barrierFlag = barrierFlag;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getSupportOrder() {
        return supportOrder;
    }

    public void setSupportOrder(Integer supportOrder) {
        this.supportOrder = supportOrder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getCapabilityTag() {
        return capabilityTag;
    }

    public void setCapabilityTag(String capabilityTag) {
        this.capabilityTag = capabilityTag == null ? null : capabilityTag.trim();
    }
}
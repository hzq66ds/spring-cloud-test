package com.dbEntity.member.basicentity;

import java.math.BigDecimal;
import java.util.Date;

public class LxCecConnectorInfo {
    private Long id;

    private String operatorId;

    private String stationId;

    private String equipmentId;

    private String connectorId;

    private String connectorName;

    private Integer connectorType;

    private Integer voltageUpperLimit;

    private Integer voltageLowerLimit;

    private Integer current;

    private BigDecimal power;

    private String parkNo;

    private Integer nationalStandard;

    private String qrCode;

    private Integer auxPower;

    private Integer startType;

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

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId == null ? null : connectorId.trim();
    }

    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName == null ? null : connectorName.trim();
    }

    public Integer getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(Integer connectorType) {
        this.connectorType = connectorType;
    }

    public Integer getVoltageUpperLimit() {
        return voltageUpperLimit;
    }

    public void setVoltageUpperLimit(Integer voltageUpperLimit) {
        this.voltageUpperLimit = voltageUpperLimit;
    }

    public Integer getVoltageLowerLimit() {
        return voltageLowerLimit;
    }

    public void setVoltageLowerLimit(Integer voltageLowerLimit) {
        this.voltageLowerLimit = voltageLowerLimit;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public String getParkNo() {
        return parkNo;
    }

    public void setParkNo(String parkNo) {
        this.parkNo = parkNo == null ? null : parkNo.trim();
    }

    public Integer getNationalStandard() {
        return nationalStandard;
    }

    public void setNationalStandard(Integer nationalStandard) {
        this.nationalStandard = nationalStandard;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public Integer getAuxPower() {
        return auxPower;
    }

    public void setAuxPower(Integer auxPower) {
        this.auxPower = auxPower;
    }

    public Integer getStartType() {
        return startType;
    }

    public void setStartType(Integer startType) {
        this.startType = startType;
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
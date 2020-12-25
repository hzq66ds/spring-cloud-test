package com.dbEntity.member.basicentity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LxCecConnectorInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LxCecConnectorInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(String value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(String value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(String value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(String value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(String value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLike(String value) {
            addCriterion("station_id like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotLike(String value) {
            addCriterion("station_id not like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<String> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<String> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(String value1, String value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(String value1, String value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(String value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(String value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(String value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(String value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLike(String value) {
            addCriterion("equipment_id like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotLike(String value) {
            addCriterion("equipment_id not like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<String> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<String> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(String value1, String value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdIsNull() {
            addCriterion("connector_id is null");
            return (Criteria) this;
        }

        public Criteria andConnectorIdIsNotNull() {
            addCriterion("connector_id is not null");
            return (Criteria) this;
        }

        public Criteria andConnectorIdEqualTo(String value) {
            addCriterion("connector_id =", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdNotEqualTo(String value) {
            addCriterion("connector_id <>", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdGreaterThan(String value) {
            addCriterion("connector_id >", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdGreaterThanOrEqualTo(String value) {
            addCriterion("connector_id >=", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdLessThan(String value) {
            addCriterion("connector_id <", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdLessThanOrEqualTo(String value) {
            addCriterion("connector_id <=", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdLike(String value) {
            addCriterion("connector_id like", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdNotLike(String value) {
            addCriterion("connector_id not like", value, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdIn(List<String> values) {
            addCriterion("connector_id in", values, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdNotIn(List<String> values) {
            addCriterion("connector_id not in", values, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdBetween(String value1, String value2) {
            addCriterion("connector_id between", value1, value2, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorIdNotBetween(String value1, String value2) {
            addCriterion("connector_id not between", value1, value2, "connectorId");
            return (Criteria) this;
        }

        public Criteria andConnectorNameIsNull() {
            addCriterion("connector_name is null");
            return (Criteria) this;
        }

        public Criteria andConnectorNameIsNotNull() {
            addCriterion("connector_name is not null");
            return (Criteria) this;
        }

        public Criteria andConnectorNameEqualTo(String value) {
            addCriterion("connector_name =", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameNotEqualTo(String value) {
            addCriterion("connector_name <>", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameGreaterThan(String value) {
            addCriterion("connector_name >", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameGreaterThanOrEqualTo(String value) {
            addCriterion("connector_name >=", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameLessThan(String value) {
            addCriterion("connector_name <", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameLessThanOrEqualTo(String value) {
            addCriterion("connector_name <=", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameLike(String value) {
            addCriterion("connector_name like", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameNotLike(String value) {
            addCriterion("connector_name not like", value, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameIn(List<String> values) {
            addCriterion("connector_name in", values, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameNotIn(List<String> values) {
            addCriterion("connector_name not in", values, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameBetween(String value1, String value2) {
            addCriterion("connector_name between", value1, value2, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorNameNotBetween(String value1, String value2) {
            addCriterion("connector_name not between", value1, value2, "connectorName");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeIsNull() {
            addCriterion("connector_type is null");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeIsNotNull() {
            addCriterion("connector_type is not null");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeEqualTo(Integer value) {
            addCriterion("connector_type =", value, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeNotEqualTo(Integer value) {
            addCriterion("connector_type <>", value, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeGreaterThan(Integer value) {
            addCriterion("connector_type >", value, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("connector_type >=", value, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeLessThan(Integer value) {
            addCriterion("connector_type <", value, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("connector_type <=", value, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeIn(List<Integer> values) {
            addCriterion("connector_type in", values, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeNotIn(List<Integer> values) {
            addCriterion("connector_type not in", values, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeBetween(Integer value1, Integer value2) {
            addCriterion("connector_type between", value1, value2, "connectorType");
            return (Criteria) this;
        }

        public Criteria andConnectorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("connector_type not between", value1, value2, "connectorType");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitIsNull() {
            addCriterion("voltage_upper_limit is null");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitIsNotNull() {
            addCriterion("voltage_upper_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitEqualTo(Integer value) {
            addCriterion("voltage_upper_limit =", value, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitNotEqualTo(Integer value) {
            addCriterion("voltage_upper_limit <>", value, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitGreaterThan(Integer value) {
            addCriterion("voltage_upper_limit >", value, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("voltage_upper_limit >=", value, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitLessThan(Integer value) {
            addCriterion("voltage_upper_limit <", value, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitLessThanOrEqualTo(Integer value) {
            addCriterion("voltage_upper_limit <=", value, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitIn(List<Integer> values) {
            addCriterion("voltage_upper_limit in", values, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitNotIn(List<Integer> values) {
            addCriterion("voltage_upper_limit not in", values, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitBetween(Integer value1, Integer value2) {
            addCriterion("voltage_upper_limit between", value1, value2, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageUpperLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("voltage_upper_limit not between", value1, value2, "voltageUpperLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitIsNull() {
            addCriterion("voltage_lower_limit is null");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitIsNotNull() {
            addCriterion("voltage_lower_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitEqualTo(Integer value) {
            addCriterion("voltage_lower_limit =", value, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitNotEqualTo(Integer value) {
            addCriterion("voltage_lower_limit <>", value, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitGreaterThan(Integer value) {
            addCriterion("voltage_lower_limit >", value, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("voltage_lower_limit >=", value, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitLessThan(Integer value) {
            addCriterion("voltage_lower_limit <", value, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitLessThanOrEqualTo(Integer value) {
            addCriterion("voltage_lower_limit <=", value, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitIn(List<Integer> values) {
            addCriterion("voltage_lower_limit in", values, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitNotIn(List<Integer> values) {
            addCriterion("voltage_lower_limit not in", values, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitBetween(Integer value1, Integer value2) {
            addCriterion("voltage_lower_limit between", value1, value2, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andVoltageLowerLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("voltage_lower_limit not between", value1, value2, "voltageLowerLimit");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(Integer value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(Integer value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(Integer value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(Integer value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(Integer value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<Integer> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<Integer> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(Integer value1, Integer value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("current not between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(BigDecimal value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(BigDecimal value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(BigDecimal value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(BigDecimal value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<BigDecimal> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<BigDecimal> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andParkNoIsNull() {
            addCriterion("park_no is null");
            return (Criteria) this;
        }

        public Criteria andParkNoIsNotNull() {
            addCriterion("park_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkNoEqualTo(String value) {
            addCriterion("park_no =", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotEqualTo(String value) {
            addCriterion("park_no <>", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoGreaterThan(String value) {
            addCriterion("park_no >", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoGreaterThanOrEqualTo(String value) {
            addCriterion("park_no >=", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLessThan(String value) {
            addCriterion("park_no <", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLessThanOrEqualTo(String value) {
            addCriterion("park_no <=", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLike(String value) {
            addCriterion("park_no like", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotLike(String value) {
            addCriterion("park_no not like", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoIn(List<String> values) {
            addCriterion("park_no in", values, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotIn(List<String> values) {
            addCriterion("park_no not in", values, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoBetween(String value1, String value2) {
            addCriterion("park_no between", value1, value2, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotBetween(String value1, String value2) {
            addCriterion("park_no not between", value1, value2, "parkNo");
            return (Criteria) this;
        }

        public Criteria andNationalStandardIsNull() {
            addCriterion("national_standard is null");
            return (Criteria) this;
        }

        public Criteria andNationalStandardIsNotNull() {
            addCriterion("national_standard is not null");
            return (Criteria) this;
        }

        public Criteria andNationalStandardEqualTo(Integer value) {
            addCriterion("national_standard =", value, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardNotEqualTo(Integer value) {
            addCriterion("national_standard <>", value, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardGreaterThan(Integer value) {
            addCriterion("national_standard >", value, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("national_standard >=", value, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardLessThan(Integer value) {
            addCriterion("national_standard <", value, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardLessThanOrEqualTo(Integer value) {
            addCriterion("national_standard <=", value, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardIn(List<Integer> values) {
            addCriterion("national_standard in", values, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardNotIn(List<Integer> values) {
            addCriterion("national_standard not in", values, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardBetween(Integer value1, Integer value2) {
            addCriterion("national_standard between", value1, value2, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andNationalStandardNotBetween(Integer value1, Integer value2) {
            addCriterion("national_standard not between", value1, value2, "nationalStandard");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andAuxPowerIsNull() {
            addCriterion("aux_power is null");
            return (Criteria) this;
        }

        public Criteria andAuxPowerIsNotNull() {
            addCriterion("aux_power is not null");
            return (Criteria) this;
        }

        public Criteria andAuxPowerEqualTo(Integer value) {
            addCriterion("aux_power =", value, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerNotEqualTo(Integer value) {
            addCriterion("aux_power <>", value, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerGreaterThan(Integer value) {
            addCriterion("aux_power >", value, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("aux_power >=", value, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerLessThan(Integer value) {
            addCriterion("aux_power <", value, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerLessThanOrEqualTo(Integer value) {
            addCriterion("aux_power <=", value, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerIn(List<Integer> values) {
            addCriterion("aux_power in", values, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerNotIn(List<Integer> values) {
            addCriterion("aux_power not in", values, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerBetween(Integer value1, Integer value2) {
            addCriterion("aux_power between", value1, value2, "auxPower");
            return (Criteria) this;
        }

        public Criteria andAuxPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("aux_power not between", value1, value2, "auxPower");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNull() {
            addCriterion("start_type is null");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNotNull() {
            addCriterion("start_type is not null");
            return (Criteria) this;
        }

        public Criteria andStartTypeEqualTo(Integer value) {
            addCriterion("start_type =", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotEqualTo(Integer value) {
            addCriterion("start_type <>", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThan(Integer value) {
            addCriterion("start_type >", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_type >=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThan(Integer value) {
            addCriterion("start_type <", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThanOrEqualTo(Integer value) {
            addCriterion("start_type <=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeIn(List<Integer> values) {
            addCriterion("start_type in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotIn(List<Integer> values) {
            addCriterion("start_type not in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeBetween(Integer value1, Integer value2) {
            addCriterion("start_type between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_type not between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdIsNull() {
            addCriterion("proxy_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdIsNotNull() {
            addCriterion("proxy_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdEqualTo(String value) {
            addCriterion("proxy_operator_id =", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdNotEqualTo(String value) {
            addCriterion("proxy_operator_id <>", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdGreaterThan(String value) {
            addCriterion("proxy_operator_id >", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("proxy_operator_id >=", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdLessThan(String value) {
            addCriterion("proxy_operator_id <", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("proxy_operator_id <=", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdLike(String value) {
            addCriterion("proxy_operator_id like", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdNotLike(String value) {
            addCriterion("proxy_operator_id not like", value, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdIn(List<String> values) {
            addCriterion("proxy_operator_id in", values, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdNotIn(List<String> values) {
            addCriterion("proxy_operator_id not in", values, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdBetween(String value1, String value2) {
            addCriterion("proxy_operator_id between", value1, value2, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andProxyOperatorIdNotBetween(String value1, String value2) {
            addCriterion("proxy_operator_id not between", value1, value2, "proxyOperatorId");
            return (Criteria) this;
        }

        public Criteria andArtificialStateIsNull() {
            addCriterion("artificial_state is null");
            return (Criteria) this;
        }

        public Criteria andArtificialStateIsNotNull() {
            addCriterion("artificial_state is not null");
            return (Criteria) this;
        }

        public Criteria andArtificialStateEqualTo(Integer value) {
            addCriterion("artificial_state =", value, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateNotEqualTo(Integer value) {
            addCriterion("artificial_state <>", value, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateGreaterThan(Integer value) {
            addCriterion("artificial_state >", value, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("artificial_state >=", value, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateLessThan(Integer value) {
            addCriterion("artificial_state <", value, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateLessThanOrEqualTo(Integer value) {
            addCriterion("artificial_state <=", value, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateIn(List<Integer> values) {
            addCriterion("artificial_state in", values, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateNotIn(List<Integer> values) {
            addCriterion("artificial_state not in", values, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateBetween(Integer value1, Integer value2) {
            addCriterion("artificial_state between", value1, value2, "artificialState");
            return (Criteria) this;
        }

        public Criteria andArtificialStateNotBetween(Integer value1, Integer value2) {
            addCriterion("artificial_state not between", value1, value2, "artificialState");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
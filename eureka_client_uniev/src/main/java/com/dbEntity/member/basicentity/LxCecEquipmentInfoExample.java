package com.dbEntity.member.basicentity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LxCecEquipmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LxCecEquipmentInfoExample() {
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

        public Criteria andManufactureIdIsNull() {
            addCriterion("manufacture_id is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIdIsNotNull() {
            addCriterion("manufacture_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureIdEqualTo(String value) {
            addCriterion("manufacture_id =", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotEqualTo(String value) {
            addCriterion("manufacture_id <>", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdGreaterThan(String value) {
            addCriterion("manufacture_id >", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_id >=", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLessThan(String value) {
            addCriterion("manufacture_id <", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLessThanOrEqualTo(String value) {
            addCriterion("manufacture_id <=", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLike(String value) {
            addCriterion("manufacture_id like", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotLike(String value) {
            addCriterion("manufacture_id not like", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdIn(List<String> values) {
            addCriterion("manufacture_id in", values, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotIn(List<String> values) {
            addCriterion("manufacture_id not in", values, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdBetween(String value1, String value2) {
            addCriterion("manufacture_id between", value1, value2, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotBetween(String value1, String value2) {
            addCriterion("manufacture_id not between", value1, value2, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureNameIsNull() {
            addCriterion("manufacture_name is null");
            return (Criteria) this;
        }

        public Criteria andManufactureNameIsNotNull() {
            addCriterion("manufacture_name is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureNameEqualTo(String value) {
            addCriterion("manufacture_name =", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameNotEqualTo(String value) {
            addCriterion("manufacture_name <>", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameGreaterThan(String value) {
            addCriterion("manufacture_name >", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_name >=", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameLessThan(String value) {
            addCriterion("manufacture_name <", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameLessThanOrEqualTo(String value) {
            addCriterion("manufacture_name <=", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameLike(String value) {
            addCriterion("manufacture_name like", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameNotLike(String value) {
            addCriterion("manufacture_name not like", value, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameIn(List<String> values) {
            addCriterion("manufacture_name in", values, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameNotIn(List<String> values) {
            addCriterion("manufacture_name not in", values, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameBetween(String value1, String value2) {
            addCriterion("manufacture_name between", value1, value2, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andManufactureNameNotBetween(String value1, String value2) {
            addCriterion("manufacture_name not between", value1, value2, "manufactureName");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelIsNull() {
            addCriterion("equipment_model is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelIsNotNull() {
            addCriterion("equipment_model is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelEqualTo(String value) {
            addCriterion("equipment_model =", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotEqualTo(String value) {
            addCriterion("equipment_model <>", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelGreaterThan(String value) {
            addCriterion("equipment_model >", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_model >=", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelLessThan(String value) {
            addCriterion("equipment_model <", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelLessThanOrEqualTo(String value) {
            addCriterion("equipment_model <=", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelLike(String value) {
            addCriterion("equipment_model like", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotLike(String value) {
            addCriterion("equipment_model not like", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelIn(List<String> values) {
            addCriterion("equipment_model in", values, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotIn(List<String> values) {
            addCriterion("equipment_model not in", values, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelBetween(String value1, String value2) {
            addCriterion("equipment_model between", value1, value2, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotBetween(String value1, String value2) {
            addCriterion("equipment_model not between", value1, value2, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelIsNull() {
            addCriterion("manufacture_model is null");
            return (Criteria) this;
        }

        public Criteria andManufactureModelIsNotNull() {
            addCriterion("manufacture_model is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureModelEqualTo(String value) {
            addCriterion("manufacture_model =", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelNotEqualTo(String value) {
            addCriterion("manufacture_model <>", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelGreaterThan(String value) {
            addCriterion("manufacture_model >", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_model >=", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelLessThan(String value) {
            addCriterion("manufacture_model <", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelLessThanOrEqualTo(String value) {
            addCriterion("manufacture_model <=", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelLike(String value) {
            addCriterion("manufacture_model like", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelNotLike(String value) {
            addCriterion("manufacture_model not like", value, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelIn(List<String> values) {
            addCriterion("manufacture_model in", values, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelNotIn(List<String> values) {
            addCriterion("manufacture_model not in", values, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelBetween(String value1, String value2) {
            addCriterion("manufacture_model between", value1, value2, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andManufactureModelNotBetween(String value1, String value2) {
            addCriterion("manufacture_model not between", value1, value2, "manufactureModel");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNull() {
            addCriterion("software_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNotNull() {
            addCriterion("software_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionEqualTo(String value) {
            addCriterion("software_version =", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotEqualTo(String value) {
            addCriterion("software_version <>", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThan(String value) {
            addCriterion("software_version >", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("software_version >=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThan(String value) {
            addCriterion("software_version <", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThanOrEqualTo(String value) {
            addCriterion("software_version <=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLike(String value) {
            addCriterion("software_version like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotLike(String value) {
            addCriterion("software_version not like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIn(List<String> values) {
            addCriterion("software_version in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotIn(List<String> values) {
            addCriterion("software_version not in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionBetween(String value1, String value2) {
            addCriterion("software_version between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotBetween(String value1, String value2) {
            addCriterion("software_version not between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNull() {
            addCriterion("production_date is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("production_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(String value) {
            addCriterion("production_date =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(String value) {
            addCriterion("production_date <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(String value) {
            addCriterion("production_date >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(String value) {
            addCriterion("production_date >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(String value) {
            addCriterion("production_date <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(String value) {
            addCriterion("production_date <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLike(String value) {
            addCriterion("production_date like", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotLike(String value) {
            addCriterion("production_date not like", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<String> values) {
            addCriterion("production_date in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<String> values) {
            addCriterion("production_date not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(String value1, String value2) {
            addCriterion("production_date between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(String value1, String value2) {
            addCriterion("production_date not between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNull() {
            addCriterion("equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNotNull() {
            addCriterion("equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeEqualTo(Integer value) {
            addCriterion("equipment_type =", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotEqualTo(Integer value) {
            addCriterion("equipment_type <>", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThan(Integer value) {
            addCriterion("equipment_type >", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_type >=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThan(Integer value) {
            addCriterion("equipment_type <", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_type <=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIn(List<Integer> values) {
            addCriterion("equipment_type in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotIn(List<Integer> values) {
            addCriterion("equipment_type not in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeBetween(Integer value1, Integer value2) {
            addCriterion("equipment_type between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_type not between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngIsNull() {
            addCriterion("equipment_lng is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngIsNotNull() {
            addCriterion("equipment_lng is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngEqualTo(BigDecimal value) {
            addCriterion("equipment_lng =", value, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngNotEqualTo(BigDecimal value) {
            addCriterion("equipment_lng <>", value, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngGreaterThan(BigDecimal value) {
            addCriterion("equipment_lng >", value, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("equipment_lng >=", value, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngLessThan(BigDecimal value) {
            addCriterion("equipment_lng <", value, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("equipment_lng <=", value, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngIn(List<BigDecimal> values) {
            addCriterion("equipment_lng in", values, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngNotIn(List<BigDecimal> values) {
            addCriterion("equipment_lng not in", values, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equipment_lng between", value1, value2, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equipment_lng not between", value1, value2, "equipmentLng");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatIsNull() {
            addCriterion("equipment_lat is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatIsNotNull() {
            addCriterion("equipment_lat is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatEqualTo(BigDecimal value) {
            addCriterion("equipment_lat =", value, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatNotEqualTo(BigDecimal value) {
            addCriterion("equipment_lat <>", value, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatGreaterThan(BigDecimal value) {
            addCriterion("equipment_lat >", value, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("equipment_lat >=", value, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatLessThan(BigDecimal value) {
            addCriterion("equipment_lat <", value, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("equipment_lat <=", value, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatIn(List<BigDecimal> values) {
            addCriterion("equipment_lat in", values, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatNotIn(List<BigDecimal> values) {
            addCriterion("equipment_lat not in", values, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equipment_lat between", value1, value2, "equipmentLat");
            return (Criteria) this;
        }

        public Criteria andEquipmentLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equipment_lat not between", value1, value2, "equipmentLat");
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

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
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
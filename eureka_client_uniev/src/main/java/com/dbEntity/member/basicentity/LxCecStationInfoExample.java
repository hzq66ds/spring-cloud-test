package com.dbEntity.member.basicentity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LxCecStationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LxCecStationInfoExample() {
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

        public Criteria andEquipmentOwnerIdIsNull() {
            addCriterion("equipment_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdIsNotNull() {
            addCriterion("equipment_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdEqualTo(String value) {
            addCriterion("equipment_owner_id =", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdNotEqualTo(String value) {
            addCriterion("equipment_owner_id <>", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdGreaterThan(String value) {
            addCriterion("equipment_owner_id >", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_owner_id >=", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdLessThan(String value) {
            addCriterion("equipment_owner_id <", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("equipment_owner_id <=", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdLike(String value) {
            addCriterion("equipment_owner_id like", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdNotLike(String value) {
            addCriterion("equipment_owner_id not like", value, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdIn(List<String> values) {
            addCriterion("equipment_owner_id in", values, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdNotIn(List<String> values) {
            addCriterion("equipment_owner_id not in", values, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdBetween(String value1, String value2) {
            addCriterion("equipment_owner_id between", value1, value2, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andEquipmentOwnerIdNotBetween(String value1, String value2) {
            addCriterion("equipment_owner_id not between", value1, value2, "equipmentOwnerId");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameIsNull() {
            addCriterion("station_custom_name is null");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameIsNotNull() {
            addCriterion("station_custom_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameEqualTo(String value) {
            addCriterion("station_custom_name =", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameNotEqualTo(String value) {
            addCriterion("station_custom_name <>", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameGreaterThan(String value) {
            addCriterion("station_custom_name >", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_custom_name >=", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameLessThan(String value) {
            addCriterion("station_custom_name <", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameLessThanOrEqualTo(String value) {
            addCriterion("station_custom_name <=", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameLike(String value) {
            addCriterion("station_custom_name like", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameNotLike(String value) {
            addCriterion("station_custom_name not like", value, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameIn(List<String> values) {
            addCriterion("station_custom_name in", values, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameNotIn(List<String> values) {
            addCriterion("station_custom_name not in", values, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameBetween(String value1, String value2) {
            addCriterion("station_custom_name between", value1, value2, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andStationCustomNameNotBetween(String value1, String value2) {
            addCriterion("station_custom_name not between", value1, value2, "stationCustomName");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStationTelIsNull() {
            addCriterion("station_tel is null");
            return (Criteria) this;
        }

        public Criteria andStationTelIsNotNull() {
            addCriterion("station_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStationTelEqualTo(String value) {
            addCriterion("station_tel =", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelNotEqualTo(String value) {
            addCriterion("station_tel <>", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelGreaterThan(String value) {
            addCriterion("station_tel >", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelGreaterThanOrEqualTo(String value) {
            addCriterion("station_tel >=", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelLessThan(String value) {
            addCriterion("station_tel <", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelLessThanOrEqualTo(String value) {
            addCriterion("station_tel <=", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelLike(String value) {
            addCriterion("station_tel like", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelNotLike(String value) {
            addCriterion("station_tel not like", value, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelIn(List<String> values) {
            addCriterion("station_tel in", values, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelNotIn(List<String> values) {
            addCriterion("station_tel not in", values, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelBetween(String value1, String value2) {
            addCriterion("station_tel between", value1, value2, "stationTel");
            return (Criteria) this;
        }

        public Criteria andStationTelNotBetween(String value1, String value2) {
            addCriterion("station_tel not between", value1, value2, "stationTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelIsNull() {
            addCriterion("service_tel is null");
            return (Criteria) this;
        }

        public Criteria andServiceTelIsNotNull() {
            addCriterion("service_tel is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTelEqualTo(String value) {
            addCriterion("service_tel =", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotEqualTo(String value) {
            addCriterion("service_tel <>", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelGreaterThan(String value) {
            addCriterion("service_tel >", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("service_tel >=", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLessThan(String value) {
            addCriterion("service_tel <", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLessThanOrEqualTo(String value) {
            addCriterion("service_tel <=", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLike(String value) {
            addCriterion("service_tel like", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotLike(String value) {
            addCriterion("service_tel not like", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelIn(List<String> values) {
            addCriterion("service_tel in", values, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotIn(List<String> values) {
            addCriterion("service_tel not in", values, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelBetween(String value1, String value2) {
            addCriterion("service_tel between", value1, value2, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotBetween(String value1, String value2) {
            addCriterion("service_tel not between", value1, value2, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNull() {
            addCriterion("station_type is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNotNull() {
            addCriterion("station_type is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeEqualTo(Integer value) {
            addCriterion("station_type =", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotEqualTo(Integer value) {
            addCriterion("station_type <>", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThan(Integer value) {
            addCriterion("station_type >", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_type >=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThan(Integer value) {
            addCriterion("station_type <", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("station_type <=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIn(List<Integer> values) {
            addCriterion("station_type in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotIn(List<Integer> values) {
            addCriterion("station_type not in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeBetween(Integer value1, Integer value2) {
            addCriterion("station_type between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("station_type not between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeIsNull() {
            addCriterion("station_custom_type is null");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeIsNotNull() {
            addCriterion("station_custom_type is not null");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeEqualTo(Integer value) {
            addCriterion("station_custom_type =", value, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeNotEqualTo(Integer value) {
            addCriterion("station_custom_type <>", value, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeGreaterThan(Integer value) {
            addCriterion("station_custom_type >", value, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_custom_type >=", value, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeLessThan(Integer value) {
            addCriterion("station_custom_type <", value, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("station_custom_type <=", value, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeIn(List<Integer> values) {
            addCriterion("station_custom_type in", values, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeNotIn(List<Integer> values) {
            addCriterion("station_custom_type not in", values, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeBetween(Integer value1, Integer value2) {
            addCriterion("station_custom_type between", value1, value2, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationCustomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("station_custom_type not between", value1, value2, "stationCustomType");
            return (Criteria) this;
        }

        public Criteria andStationStatusIsNull() {
            addCriterion("station_status is null");
            return (Criteria) this;
        }

        public Criteria andStationStatusIsNotNull() {
            addCriterion("station_status is not null");
            return (Criteria) this;
        }

        public Criteria andStationStatusEqualTo(Integer value) {
            addCriterion("station_status =", value, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusNotEqualTo(Integer value) {
            addCriterion("station_status <>", value, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusGreaterThan(Integer value) {
            addCriterion("station_status >", value, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_status >=", value, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusLessThan(Integer value) {
            addCriterion("station_status <", value, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("station_status <=", value, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusIn(List<Integer> values) {
            addCriterion("station_status in", values, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusNotIn(List<Integer> values) {
            addCriterion("station_status not in", values, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusBetween(Integer value1, Integer value2) {
            addCriterion("station_status between", value1, value2, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andStationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("station_status not between", value1, value2, "stationStatus");
            return (Criteria) this;
        }

        public Criteria andParkNumsIsNull() {
            addCriterion("park_nums is null");
            return (Criteria) this;
        }

        public Criteria andParkNumsIsNotNull() {
            addCriterion("park_nums is not null");
            return (Criteria) this;
        }

        public Criteria andParkNumsEqualTo(Integer value) {
            addCriterion("park_nums =", value, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsNotEqualTo(Integer value) {
            addCriterion("park_nums <>", value, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsGreaterThan(Integer value) {
            addCriterion("park_nums >", value, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_nums >=", value, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsLessThan(Integer value) {
            addCriterion("park_nums <", value, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsLessThanOrEqualTo(Integer value) {
            addCriterion("park_nums <=", value, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsIn(List<Integer> values) {
            addCriterion("park_nums in", values, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsNotIn(List<Integer> values) {
            addCriterion("park_nums not in", values, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsBetween(Integer value1, Integer value2) {
            addCriterion("park_nums between", value1, value2, "parkNums");
            return (Criteria) this;
        }

        public Criteria andParkNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("park_nums not between", value1, value2, "parkNums");
            return (Criteria) this;
        }

        public Criteria andStationLngIsNull() {
            addCriterion("station_lng is null");
            return (Criteria) this;
        }

        public Criteria andStationLngIsNotNull() {
            addCriterion("station_lng is not null");
            return (Criteria) this;
        }

        public Criteria andStationLngEqualTo(BigDecimal value) {
            addCriterion("station_lng =", value, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngNotEqualTo(BigDecimal value) {
            addCriterion("station_lng <>", value, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngGreaterThan(BigDecimal value) {
            addCriterion("station_lng >", value, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("station_lng >=", value, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngLessThan(BigDecimal value) {
            addCriterion("station_lng <", value, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("station_lng <=", value, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngIn(List<BigDecimal> values) {
            addCriterion("station_lng in", values, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngNotIn(List<BigDecimal> values) {
            addCriterion("station_lng not in", values, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("station_lng between", value1, value2, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("station_lng not between", value1, value2, "stationLng");
            return (Criteria) this;
        }

        public Criteria andStationLatIsNull() {
            addCriterion("station_lat is null");
            return (Criteria) this;
        }

        public Criteria andStationLatIsNotNull() {
            addCriterion("station_lat is not null");
            return (Criteria) this;
        }

        public Criteria andStationLatEqualTo(BigDecimal value) {
            addCriterion("station_lat =", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatNotEqualTo(BigDecimal value) {
            addCriterion("station_lat <>", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatGreaterThan(BigDecimal value) {
            addCriterion("station_lat >", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("station_lat >=", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatLessThan(BigDecimal value) {
            addCriterion("station_lat <", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("station_lat <=", value, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatIn(List<BigDecimal> values) {
            addCriterion("station_lat in", values, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatNotIn(List<BigDecimal> values) {
            addCriterion("station_lat not in", values, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("station_lat between", value1, value2, "stationLat");
            return (Criteria) this;
        }

        public Criteria andStationLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("station_lat not between", value1, value2, "stationLat");
            return (Criteria) this;
        }

        public Criteria andSiteGuideIsNull() {
            addCriterion("site_guide is null");
            return (Criteria) this;
        }

        public Criteria andSiteGuideIsNotNull() {
            addCriterion("site_guide is not null");
            return (Criteria) this;
        }

        public Criteria andSiteGuideEqualTo(String value) {
            addCriterion("site_guide =", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideNotEqualTo(String value) {
            addCriterion("site_guide <>", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideGreaterThan(String value) {
            addCriterion("site_guide >", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideGreaterThanOrEqualTo(String value) {
            addCriterion("site_guide >=", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideLessThan(String value) {
            addCriterion("site_guide <", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideLessThanOrEqualTo(String value) {
            addCriterion("site_guide <=", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideLike(String value) {
            addCriterion("site_guide like", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideNotLike(String value) {
            addCriterion("site_guide not like", value, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideIn(List<String> values) {
            addCriterion("site_guide in", values, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideNotIn(List<String> values) {
            addCriterion("site_guide not in", values, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideBetween(String value1, String value2) {
            addCriterion("site_guide between", value1, value2, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andSiteGuideNotBetween(String value1, String value2) {
            addCriterion("site_guide not between", value1, value2, "siteGuide");
            return (Criteria) this;
        }

        public Criteria andConstructionIsNull() {
            addCriterion("construction is null");
            return (Criteria) this;
        }

        public Criteria andConstructionIsNotNull() {
            addCriterion("construction is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionEqualTo(Integer value) {
            addCriterion("construction =", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionNotEqualTo(Integer value) {
            addCriterion("construction <>", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionGreaterThan(Integer value) {
            addCriterion("construction >", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionGreaterThanOrEqualTo(Integer value) {
            addCriterion("construction >=", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionLessThan(Integer value) {
            addCriterion("construction <", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionLessThanOrEqualTo(Integer value) {
            addCriterion("construction <=", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionIn(List<Integer> values) {
            addCriterion("construction in", values, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionNotIn(List<Integer> values) {
            addCriterion("construction not in", values, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionBetween(Integer value1, Integer value2) {
            addCriterion("construction between", value1, value2, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionNotBetween(Integer value1, Integer value2) {
            addCriterion("construction not between", value1, value2, "construction");
            return (Criteria) this;
        }

        public Criteria andMatchCarsIsNull() {
            addCriterion("match_cars is null");
            return (Criteria) this;
        }

        public Criteria andMatchCarsIsNotNull() {
            addCriterion("match_cars is not null");
            return (Criteria) this;
        }

        public Criteria andMatchCarsEqualTo(String value) {
            addCriterion("match_cars =", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsNotEqualTo(String value) {
            addCriterion("match_cars <>", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsGreaterThan(String value) {
            addCriterion("match_cars >", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsGreaterThanOrEqualTo(String value) {
            addCriterion("match_cars >=", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsLessThan(String value) {
            addCriterion("match_cars <", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsLessThanOrEqualTo(String value) {
            addCriterion("match_cars <=", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsLike(String value) {
            addCriterion("match_cars like", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsNotLike(String value) {
            addCriterion("match_cars not like", value, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsIn(List<String> values) {
            addCriterion("match_cars in", values, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsNotIn(List<String> values) {
            addCriterion("match_cars not in", values, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsBetween(String value1, String value2) {
            addCriterion("match_cars between", value1, value2, "matchCars");
            return (Criteria) this;
        }

        public Criteria andMatchCarsNotBetween(String value1, String value2) {
            addCriterion("match_cars not between", value1, value2, "matchCars");
            return (Criteria) this;
        }

        public Criteria andParkInfoIsNull() {
            addCriterion("park_info is null");
            return (Criteria) this;
        }

        public Criteria andParkInfoIsNotNull() {
            addCriterion("park_info is not null");
            return (Criteria) this;
        }

        public Criteria andParkInfoEqualTo(String value) {
            addCriterion("park_info =", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoNotEqualTo(String value) {
            addCriterion("park_info <>", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoGreaterThan(String value) {
            addCriterion("park_info >", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("park_info >=", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoLessThan(String value) {
            addCriterion("park_info <", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoLessThanOrEqualTo(String value) {
            addCriterion("park_info <=", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoLike(String value) {
            addCriterion("park_info like", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoNotLike(String value) {
            addCriterion("park_info not like", value, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoIn(List<String> values) {
            addCriterion("park_info in", values, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoNotIn(List<String> values) {
            addCriterion("park_info not in", values, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoBetween(String value1, String value2) {
            addCriterion("park_info between", value1, value2, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andParkInfoNotBetween(String value1, String value2) {
            addCriterion("park_info not between", value1, value2, "parkInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNull() {
            addCriterion("business_hours is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNotNull() {
            addCriterion("business_hours is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEqualTo(String value) {
            addCriterion("business_hours =", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotEqualTo(String value) {
            addCriterion("business_hours <>", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThan(String value) {
            addCriterion("business_hours >", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours >=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThan(String value) {
            addCriterion("business_hours <", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThanOrEqualTo(String value) {
            addCriterion("business_hours <=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLike(String value) {
            addCriterion("business_hours like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotLike(String value) {
            addCriterion("business_hours not like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIn(List<String> values) {
            addCriterion("business_hours in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotIn(List<String> values) {
            addCriterion("business_hours not in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursBetween(String value1, String value2) {
            addCriterion("business_hours between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotBetween(String value1, String value2) {
            addCriterion("business_hours not between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeIsNull() {
            addCriterion("electricity_fee is null");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeIsNotNull() {
            addCriterion("electricity_fee is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeEqualTo(String value) {
            addCriterion("electricity_fee =", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeNotEqualTo(String value) {
            addCriterion("electricity_fee <>", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeGreaterThan(String value) {
            addCriterion("electricity_fee >", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeGreaterThanOrEqualTo(String value) {
            addCriterion("electricity_fee >=", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeLessThan(String value) {
            addCriterion("electricity_fee <", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeLessThanOrEqualTo(String value) {
            addCriterion("electricity_fee <=", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeLike(String value) {
            addCriterion("electricity_fee like", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeNotLike(String value) {
            addCriterion("electricity_fee not like", value, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeIn(List<String> values) {
            addCriterion("electricity_fee in", values, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeNotIn(List<String> values) {
            addCriterion("electricity_fee not in", values, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeBetween(String value1, String value2) {
            addCriterion("electricity_fee between", value1, value2, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andElectricityFeeNotBetween(String value1, String value2) {
            addCriterion("electricity_fee not between", value1, value2, "electricityFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(String value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(String value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(String value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(String value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(String value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(String value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLike(String value) {
            addCriterion("service_fee like", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotLike(String value) {
            addCriterion("service_fee not like", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<String> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<String> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(String value1, String value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(String value1, String value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeIsNull() {
            addCriterion("original_electricity_fee is null");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeIsNotNull() {
            addCriterion("original_electricity_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeEqualTo(String value) {
            addCriterion("original_electricity_fee =", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeNotEqualTo(String value) {
            addCriterion("original_electricity_fee <>", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeGreaterThan(String value) {
            addCriterion("original_electricity_fee >", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeGreaterThanOrEqualTo(String value) {
            addCriterion("original_electricity_fee >=", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeLessThan(String value) {
            addCriterion("original_electricity_fee <", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeLessThanOrEqualTo(String value) {
            addCriterion("original_electricity_fee <=", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeLike(String value) {
            addCriterion("original_electricity_fee like", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeNotLike(String value) {
            addCriterion("original_electricity_fee not like", value, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeIn(List<String> values) {
            addCriterion("original_electricity_fee in", values, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeNotIn(List<String> values) {
            addCriterion("original_electricity_fee not in", values, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeBetween(String value1, String value2) {
            addCriterion("original_electricity_fee between", value1, value2, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalElectricityFeeNotBetween(String value1, String value2) {
            addCriterion("original_electricity_fee not between", value1, value2, "originalElectricityFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeIsNull() {
            addCriterion("original_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeIsNotNull() {
            addCriterion("original_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeEqualTo(String value) {
            addCriterion("original_service_fee =", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeNotEqualTo(String value) {
            addCriterion("original_service_fee <>", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeGreaterThan(String value) {
            addCriterion("original_service_fee >", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeGreaterThanOrEqualTo(String value) {
            addCriterion("original_service_fee >=", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeLessThan(String value) {
            addCriterion("original_service_fee <", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeLessThanOrEqualTo(String value) {
            addCriterion("original_service_fee <=", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeLike(String value) {
            addCriterion("original_service_fee like", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeNotLike(String value) {
            addCriterion("original_service_fee not like", value, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeIn(List<String> values) {
            addCriterion("original_service_fee in", values, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeNotIn(List<String> values) {
            addCriterion("original_service_fee not in", values, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeBetween(String value1, String value2) {
            addCriterion("original_service_fee between", value1, value2, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andOriginalServiceFeeNotBetween(String value1, String value2) {
            addCriterion("original_service_fee not between", value1, value2, "originalServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeIsNull() {
            addCriterion("business_electricity_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeIsNotNull() {
            addCriterion("business_electricity_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeEqualTo(String value) {
            addCriterion("business_electricity_fee =", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeNotEqualTo(String value) {
            addCriterion("business_electricity_fee <>", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeGreaterThan(String value) {
            addCriterion("business_electricity_fee >", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeGreaterThanOrEqualTo(String value) {
            addCriterion("business_electricity_fee >=", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeLessThan(String value) {
            addCriterion("business_electricity_fee <", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeLessThanOrEqualTo(String value) {
            addCriterion("business_electricity_fee <=", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeLike(String value) {
            addCriterion("business_electricity_fee like", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeNotLike(String value) {
            addCriterion("business_electricity_fee not like", value, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeIn(List<String> values) {
            addCriterion("business_electricity_fee in", values, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeNotIn(List<String> values) {
            addCriterion("business_electricity_fee not in", values, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeBetween(String value1, String value2) {
            addCriterion("business_electricity_fee between", value1, value2, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessElectricityFeeNotBetween(String value1, String value2) {
            addCriterion("business_electricity_fee not between", value1, value2, "businessElectricityFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeIsNull() {
            addCriterion("business_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeIsNotNull() {
            addCriterion("business_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeEqualTo(String value) {
            addCriterion("business_service_fee =", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeNotEqualTo(String value) {
            addCriterion("business_service_fee <>", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeGreaterThan(String value) {
            addCriterion("business_service_fee >", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeGreaterThanOrEqualTo(String value) {
            addCriterion("business_service_fee >=", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeLessThan(String value) {
            addCriterion("business_service_fee <", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeLessThanOrEqualTo(String value) {
            addCriterion("business_service_fee <=", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeLike(String value) {
            addCriterion("business_service_fee like", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeNotLike(String value) {
            addCriterion("business_service_fee not like", value, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeIn(List<String> values) {
            addCriterion("business_service_fee in", values, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeNotIn(List<String> values) {
            addCriterion("business_service_fee not in", values, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeBetween(String value1, String value2) {
            addCriterion("business_service_fee between", value1, value2, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andBusinessServiceFeeNotBetween(String value1, String value2) {
            addCriterion("business_service_fee not between", value1, value2, "businessServiceFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeIsNull() {
            addCriterion("park_fee is null");
            return (Criteria) this;
        }

        public Criteria andParkFeeIsNotNull() {
            addCriterion("park_fee is not null");
            return (Criteria) this;
        }

        public Criteria andParkFeeEqualTo(String value) {
            addCriterion("park_fee =", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeNotEqualTo(String value) {
            addCriterion("park_fee <>", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeGreaterThan(String value) {
            addCriterion("park_fee >", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeGreaterThanOrEqualTo(String value) {
            addCriterion("park_fee >=", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeLessThan(String value) {
            addCriterion("park_fee <", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeLessThanOrEqualTo(String value) {
            addCriterion("park_fee <=", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeLike(String value) {
            addCriterion("park_fee like", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeNotLike(String value) {
            addCriterion("park_fee not like", value, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeIn(List<String> values) {
            addCriterion("park_fee in", values, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeNotIn(List<String> values) {
            addCriterion("park_fee not in", values, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeBetween(String value1, String value2) {
            addCriterion("park_fee between", value1, value2, "parkFee");
            return (Criteria) this;
        }

        public Criteria andParkFeeNotBetween(String value1, String value2) {
            addCriterion("park_fee not between", value1, value2, "parkFee");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatIsNull() {
            addCriterion("business_hours_format is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatIsNotNull() {
            addCriterion("business_hours_format is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatEqualTo(String value) {
            addCriterion("business_hours_format =", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatNotEqualTo(String value) {
            addCriterion("business_hours_format <>", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatGreaterThan(String value) {
            addCriterion("business_hours_format >", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours_format >=", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatLessThan(String value) {
            addCriterion("business_hours_format <", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatLessThanOrEqualTo(String value) {
            addCriterion("business_hours_format <=", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatLike(String value) {
            addCriterion("business_hours_format like", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatNotLike(String value) {
            addCriterion("business_hours_format not like", value, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatIn(List<String> values) {
            addCriterion("business_hours_format in", values, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatNotIn(List<String> values) {
            addCriterion("business_hours_format not in", values, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatBetween(String value1, String value2) {
            addCriterion("business_hours_format between", value1, value2, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursFormatNotBetween(String value1, String value2) {
            addCriterion("business_hours_format not between", value1, value2, "businessHoursFormat");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724IsNull() {
            addCriterion("business_hours_724 is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724IsNotNull() {
            addCriterion("business_hours_724 is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724EqualTo(Integer value) {
            addCriterion("business_hours_724 =", value, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724NotEqualTo(Integer value) {
            addCriterion("business_hours_724 <>", value, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724GreaterThan(Integer value) {
            addCriterion("business_hours_724 >", value, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724GreaterThanOrEqualTo(Integer value) {
            addCriterion("business_hours_724 >=", value, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724LessThan(Integer value) {
            addCriterion("business_hours_724 <", value, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724LessThanOrEqualTo(Integer value) {
            addCriterion("business_hours_724 <=", value, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724In(List<Integer> values) {
            addCriterion("business_hours_724 in", values, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724NotIn(List<Integer> values) {
            addCriterion("business_hours_724 not in", values, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724Between(Integer value1, Integer value2) {
            addCriterion("business_hours_724 between", value1, value2, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andBusinessHours724NotBetween(Integer value1, Integer value2) {
            addCriterion("business_hours_724 not between", value1, value2, "businessHours724");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxIsNull() {
            addCriterion("electricity_tax is null");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxIsNotNull() {
            addCriterion("electricity_tax is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxEqualTo(BigDecimal value) {
            addCriterion("electricity_tax =", value, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxNotEqualTo(BigDecimal value) {
            addCriterion("electricity_tax <>", value, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxGreaterThan(BigDecimal value) {
            addCriterion("electricity_tax >", value, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("electricity_tax >=", value, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxLessThan(BigDecimal value) {
            addCriterion("electricity_tax <", value, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("electricity_tax <=", value, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxIn(List<BigDecimal> values) {
            addCriterion("electricity_tax in", values, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxNotIn(List<BigDecimal> values) {
            addCriterion("electricity_tax not in", values, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("electricity_tax between", value1, value2, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andElectricityTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("electricity_tax not between", value1, value2, "electricityTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxIsNull() {
            addCriterion("service_tax is null");
            return (Criteria) this;
        }

        public Criteria andServiceTaxIsNotNull() {
            addCriterion("service_tax is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTaxEqualTo(BigDecimal value) {
            addCriterion("service_tax =", value, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxNotEqualTo(BigDecimal value) {
            addCriterion("service_tax <>", value, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxGreaterThan(BigDecimal value) {
            addCriterion("service_tax >", value, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_tax >=", value, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxLessThan(BigDecimal value) {
            addCriterion("service_tax <", value, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_tax <=", value, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxIn(List<BigDecimal> values) {
            addCriterion("service_tax in", values, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxNotIn(List<BigDecimal> values) {
            addCriterion("service_tax not in", values, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_tax between", value1, value2, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andServiceTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_tax not between", value1, value2, "serviceTax");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeIsNull() {
            addCriterion("park_Fee_free is null");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeIsNotNull() {
            addCriterion("park_Fee_free is not null");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeEqualTo(Integer value) {
            addCriterion("park_Fee_free =", value, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeNotEqualTo(Integer value) {
            addCriterion("park_Fee_free <>", value, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeGreaterThan(Integer value) {
            addCriterion("park_Fee_free >", value, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_Fee_free >=", value, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeLessThan(Integer value) {
            addCriterion("park_Fee_free <", value, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeLessThanOrEqualTo(Integer value) {
            addCriterion("park_Fee_free <=", value, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeIn(List<Integer> values) {
            addCriterion("park_Fee_free in", values, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeNotIn(List<Integer> values) {
            addCriterion("park_Fee_free not in", values, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeBetween(Integer value1, Integer value2) {
            addCriterion("park_Fee_free between", value1, value2, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkFeeFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("park_Fee_free not between", value1, value2, "parkFeeFree");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeIsNull() {
            addCriterion("parking_discount_type is null");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeIsNotNull() {
            addCriterion("parking_discount_type is not null");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeEqualTo(Integer value) {
            addCriterion("parking_discount_type =", value, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeNotEqualTo(Integer value) {
            addCriterion("parking_discount_type <>", value, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeGreaterThan(Integer value) {
            addCriterion("parking_discount_type >", value, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_discount_type >=", value, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeLessThan(Integer value) {
            addCriterion("parking_discount_type <", value, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("parking_discount_type <=", value, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeIn(List<Integer> values) {
            addCriterion("parking_discount_type in", values, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeNotIn(List<Integer> values) {
            addCriterion("parking_discount_type not in", values, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeBetween(Integer value1, Integer value2) {
            addCriterion("parking_discount_type between", value1, value2, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkingDiscountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_discount_type not between", value1, value2, "parkingDiscountType");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusIsNull() {
            addCriterion("park_fee_status is null");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusIsNotNull() {
            addCriterion("park_fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusEqualTo(Integer value) {
            addCriterion("park_fee_status =", value, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusNotEqualTo(Integer value) {
            addCriterion("park_fee_status <>", value, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusGreaterThan(Integer value) {
            addCriterion("park_fee_status >", value, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_fee_status >=", value, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusLessThan(Integer value) {
            addCriterion("park_fee_status <", value, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("park_fee_status <=", value, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusIn(List<Integer> values) {
            addCriterion("park_fee_status in", values, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusNotIn(List<Integer> values) {
            addCriterion("park_fee_status not in", values, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusBetween(Integer value1, Integer value2) {
            addCriterion("park_fee_status between", value1, value2, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andParkFeeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("park_fee_status not between", value1, value2, "parkFeeStatus");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagIsNull() {
            addCriterion("printer_flag is null");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagIsNotNull() {
            addCriterion("printer_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagEqualTo(Integer value) {
            addCriterion("printer_flag =", value, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagNotEqualTo(Integer value) {
            addCriterion("printer_flag <>", value, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagGreaterThan(Integer value) {
            addCriterion("printer_flag >", value, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("printer_flag >=", value, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagLessThan(Integer value) {
            addCriterion("printer_flag <", value, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagLessThanOrEqualTo(Integer value) {
            addCriterion("printer_flag <=", value, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagIn(List<Integer> values) {
            addCriterion("printer_flag in", values, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagNotIn(List<Integer> values) {
            addCriterion("printer_flag not in", values, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagBetween(Integer value1, Integer value2) {
            addCriterion("printer_flag between", value1, value2, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andPrinterFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("printer_flag not between", value1, value2, "printerFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagIsNull() {
            addCriterion("barrier_flag is null");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagIsNotNull() {
            addCriterion("barrier_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagEqualTo(Integer value) {
            addCriterion("barrier_flag =", value, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagNotEqualTo(Integer value) {
            addCriterion("barrier_flag <>", value, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagGreaterThan(Integer value) {
            addCriterion("barrier_flag >", value, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("barrier_flag >=", value, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagLessThan(Integer value) {
            addCriterion("barrier_flag <", value, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagLessThanOrEqualTo(Integer value) {
            addCriterion("barrier_flag <=", value, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagIn(List<Integer> values) {
            addCriterion("barrier_flag in", values, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagNotIn(List<Integer> values) {
            addCriterion("barrier_flag not in", values, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagBetween(Integer value1, Integer value2) {
            addCriterion("barrier_flag between", value1, value2, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andBarrierFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("barrier_flag not between", value1, value2, "barrierFlag");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andSupportOrderIsNull() {
            addCriterion("support_order is null");
            return (Criteria) this;
        }

        public Criteria andSupportOrderIsNotNull() {
            addCriterion("support_order is not null");
            return (Criteria) this;
        }

        public Criteria andSupportOrderEqualTo(Integer value) {
            addCriterion("support_order =", value, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderNotEqualTo(Integer value) {
            addCriterion("support_order <>", value, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderGreaterThan(Integer value) {
            addCriterion("support_order >", value, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("support_order >=", value, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderLessThan(Integer value) {
            addCriterion("support_order <", value, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderLessThanOrEqualTo(Integer value) {
            addCriterion("support_order <=", value, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderIn(List<Integer> values) {
            addCriterion("support_order in", values, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderNotIn(List<Integer> values) {
            addCriterion("support_order not in", values, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderBetween(Integer value1, Integer value2) {
            addCriterion("support_order between", value1, value2, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andSupportOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("support_order not between", value1, value2, "supportOrder");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andCapabilityTagIsNull() {
            addCriterion("capability_tag is null");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagIsNotNull() {
            addCriterion("capability_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagEqualTo(String value) {
            addCriterion("capability_tag =", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagNotEqualTo(String value) {
            addCriterion("capability_tag <>", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagGreaterThan(String value) {
            addCriterion("capability_tag >", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagGreaterThanOrEqualTo(String value) {
            addCriterion("capability_tag >=", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagLessThan(String value) {
            addCriterion("capability_tag <", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagLessThanOrEqualTo(String value) {
            addCriterion("capability_tag <=", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagLike(String value) {
            addCriterion("capability_tag like", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagNotLike(String value) {
            addCriterion("capability_tag not like", value, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagIn(List<String> values) {
            addCriterion("capability_tag in", values, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagNotIn(List<String> values) {
            addCriterion("capability_tag not in", values, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagBetween(String value1, String value2) {
            addCriterion("capability_tag between", value1, value2, "capabilityTag");
            return (Criteria) this;
        }

        public Criteria andCapabilityTagNotBetween(String value1, String value2) {
            addCriterion("capability_tag not between", value1, value2, "capabilityTag");
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
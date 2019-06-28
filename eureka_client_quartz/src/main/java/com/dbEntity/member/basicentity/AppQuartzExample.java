package com.dbEntity.member.basicentity;

import java.util.ArrayList;
import java.util.List;

public class AppQuartzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppQuartzExample() {
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

        public Criteria andQuartziDIsNull() {
            addCriterion("quartzI_d is null");
            return (Criteria) this;
        }

        public Criteria andQuartziDIsNotNull() {
            addCriterion("quartzI_d is not null");
            return (Criteria) this;
        }

        public Criteria andQuartziDEqualTo(Integer value) {
            addCriterion("quartzI_d =", value, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDNotEqualTo(Integer value) {
            addCriterion("quartzI_d <>", value, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDGreaterThan(Integer value) {
            addCriterion("quartzI_d >", value, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDGreaterThanOrEqualTo(Integer value) {
            addCriterion("quartzI_d >=", value, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDLessThan(Integer value) {
            addCriterion("quartzI_d <", value, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDLessThanOrEqualTo(Integer value) {
            addCriterion("quartzI_d <=", value, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDIn(List<Integer> values) {
            addCriterion("quartzI_d in", values, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDNotIn(List<Integer> values) {
            addCriterion("quartzI_d not in", values, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDBetween(Integer value1, Integer value2) {
            addCriterion("quartzI_d between", value1, value2, "quartziD");
            return (Criteria) this;
        }

        public Criteria andQuartziDNotBetween(Integer value1, Integer value2) {
            addCriterion("quartzI_d not between", value1, value2, "quartziD");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_Name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_Name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_Name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_Name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_Name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_Name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_Name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_Name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_Name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_Name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_Name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_Name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_Name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_Name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("job_Group is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("job_Group is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("job_Group =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("job_Group <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("job_Group >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("job_Group >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("job_Group <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("job_Group <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("job_Group like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("job_Group not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("job_Group in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("job_Group not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("job_Group between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("job_Group not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_Time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_Time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_Time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_Time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_Time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_Time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_Time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_Time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_Time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_Time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_Time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_Time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_Time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_Time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNull() {
            addCriterion("cron_Expression is null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNotNull() {
            addCriterion("cron_Expression is not null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionEqualTo(String value) {
            addCriterion("cron_Expression =", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotEqualTo(String value) {
            addCriterion("cron_Expression <>", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThan(String value) {
            addCriterion("cron_Expression >", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("cron_Expression >=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThan(String value) {
            addCriterion("cron_Expression <", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("cron_Expression <=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLike(String value) {
            addCriterion("cron_Expression like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotLike(String value) {
            addCriterion("cron_Expression not like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIn(List<String> values) {
            addCriterion("cron_Expression in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotIn(List<String> values) {
            addCriterion("cron_Expression not in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionBetween(String value1, String value2) {
            addCriterion("cron_Expression between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotBetween(String value1, String value2) {
            addCriterion("cron_Expression not between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andInvokeParamIsNull() {
            addCriterion("invoke_Param is null");
            return (Criteria) this;
        }

        public Criteria andInvokeParamIsNotNull() {
            addCriterion("invoke_Param is not null");
            return (Criteria) this;
        }

        public Criteria andInvokeParamEqualTo(String value) {
            addCriterion("invoke_Param =", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamNotEqualTo(String value) {
            addCriterion("invoke_Param <>", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamGreaterThan(String value) {
            addCriterion("invoke_Param >", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamGreaterThanOrEqualTo(String value) {
            addCriterion("invoke_Param >=", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamLessThan(String value) {
            addCriterion("invoke_Param <", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamLessThanOrEqualTo(String value) {
            addCriterion("invoke_Param <=", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamLike(String value) {
            addCriterion("invoke_Param like", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamNotLike(String value) {
            addCriterion("invoke_Param not like", value, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamIn(List<String> values) {
            addCriterion("invoke_Param in", values, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamNotIn(List<String> values) {
            addCriterion("invoke_Param not in", values, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamBetween(String value1, String value2) {
            addCriterion("invoke_Param between", value1, value2, "invokeParam");
            return (Criteria) this;
        }

        public Criteria andInvokeParamNotBetween(String value1, String value2) {
            addCriterion("invoke_Param not between", value1, value2, "invokeParam");
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
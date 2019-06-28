package com.dbEntity.member.basicentity;

public class AppQuartz {
    private Integer quartziD;

    private String jobName;

    private String jobGroup;

    private String startTime;

    private String cronExpression;

    private String invokeParam;

    public Integer getQuartziD() {
        return quartziD;
    }

    public void setQuartziD(Integer quartziD) {
        this.quartziD = quartziD;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public String getInvokeParam() {
        return invokeParam;
    }

    public void setInvokeParam(String invokeParam) {
        this.invokeParam = invokeParam == null ? null : invokeParam.trim();
    }
}
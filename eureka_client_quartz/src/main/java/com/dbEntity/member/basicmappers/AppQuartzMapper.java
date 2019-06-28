package com.dbEntity.member.basicmappers;

import com.dbEntity.member.basicentity.AppQuartz;
import com.dbEntity.member.basicentity.AppQuartzExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AppQuartzMapper {
    int countByExample(AppQuartzExample example);

    int deleteByExample(AppQuartzExample example);

    @Delete({
        "delete from app_quartz",
        "where quartzI_d = #{quartziD,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer quartziD);

    @Insert({
        "insert into app_quartz (quartzI_d, job_Name, ",
        "job_Group, start_Time, ",
        "cron_Expression, invoke_Param)",
        "values (#{quartziD,jdbcType=INTEGER}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{startTime,jdbcType=VARCHAR}, ",
        "#{cronExpression,jdbcType=VARCHAR}, #{invokeParam,jdbcType=VARCHAR})"
    })
    int insert(AppQuartz record);

    int insertSelective(AppQuartz record);

    List<AppQuartz> selectByExample(AppQuartzExample example);

    @Select({
        "select",
        "quartzI_d, job_Name, job_Group, start_Time, cron_Expression, invoke_Param",
        "from app_quartz",
        "where quartzI_d = #{quartziD,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    AppQuartz selectByPrimaryKey(Integer quartziD);

    int updateByExampleSelective(@Param("record") AppQuartz record, @Param("example") AppQuartzExample example);

    int updateByExample(@Param("record") AppQuartz record, @Param("example") AppQuartzExample example);

    int updateByPrimaryKeySelective(AppQuartz record);

    @Update({
        "update app_quartz",
        "set job_Name = #{jobName,jdbcType=VARCHAR},",
          "job_Group = #{jobGroup,jdbcType=VARCHAR},",
          "start_Time = #{startTime,jdbcType=VARCHAR},",
          "cron_Expression = #{cronExpression,jdbcType=VARCHAR},",
          "invoke_Param = #{invokeParam,jdbcType=VARCHAR}",
        "where quartzI_d = #{quartziD,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppQuartz record);
}
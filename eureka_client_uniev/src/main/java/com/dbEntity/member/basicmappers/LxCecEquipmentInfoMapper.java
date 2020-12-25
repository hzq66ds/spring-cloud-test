package com.dbEntity.member.basicmappers;

import com.dbEntity.member.basicentity.LxCecEquipmentInfo;
import com.dbEntity.member.basicentity.LxCecEquipmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LxCecEquipmentInfoMapper {
    int countByExample(LxCecEquipmentInfoExample example);

    int deleteByExample(LxCecEquipmentInfoExample example);

    @Delete({
        "delete from lx_cec_equipment_info1",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into lx_cec_equipment_info1 (id, station_id, ",
        "operator_id, equipment_id, ",
        "manufacture_id, manufacture_name, ",
        "equipment_model, manufacture_model, ",
        "software_version, production_date, ",
        "equipment_type, equipment_lng, ",
        "equipment_lat, power, ",
        "equipment_name, create_time, ",
        "update_time, proxy_operator_id, ",
        "artificial_state, state)",
        "values (#{id,jdbcType=BIGINT}, #{stationId,jdbcType=VARCHAR}, ",
        "#{operatorId,jdbcType=VARCHAR}, #{equipmentId,jdbcType=VARCHAR}, ",
        "#{manufactureId,jdbcType=VARCHAR}, #{manufactureName,jdbcType=VARCHAR}, ",
        "#{equipmentModel,jdbcType=VARCHAR}, #{manufactureModel,jdbcType=VARCHAR}, ",
        "#{softwareVersion,jdbcType=VARCHAR}, #{productionDate,jdbcType=VARCHAR}, ",
        "#{equipmentType,jdbcType=INTEGER}, #{equipmentLng,jdbcType=DECIMAL}, ",
        "#{equipmentLat,jdbcType=DECIMAL}, #{power,jdbcType=DECIMAL}, ",
        "#{equipmentName,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{proxyOperatorId,jdbcType=VARCHAR}, ",
        "#{artificialState,jdbcType=INTEGER}, #{state,jdbcType=INTEGER})"
    })
    int insert(LxCecEquipmentInfo record);

    int insertSelective(LxCecEquipmentInfo record);

    List<LxCecEquipmentInfo> selectByExample(LxCecEquipmentInfoExample example);

    @Select({
        "select",
        "id, station_id, operator_id, equipment_id, manufacture_id, manufacture_name, ",
        "equipment_model, manufacture_model, software_version, production_date, equipment_type, ",
        "equipment_lng, equipment_lat, power, equipment_name, create_time, update_time, ",
        "proxy_operator_id, artificial_state, state",
        "from lx_cec_equipment_info1",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    LxCecEquipmentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LxCecEquipmentInfo record, @Param("example") LxCecEquipmentInfoExample example);

    int updateByExample(@Param("record") LxCecEquipmentInfo record, @Param("example") LxCecEquipmentInfoExample example);

    int updateByPrimaryKeySelective(LxCecEquipmentInfo record);

    @Update({
        "update lx_cec_equipment_info1",
        "set station_id = #{stationId,jdbcType=VARCHAR},",
          "operator_id = #{operatorId,jdbcType=VARCHAR},",
          "equipment_id = #{equipmentId,jdbcType=VARCHAR},",
          "manufacture_id = #{manufactureId,jdbcType=VARCHAR},",
          "manufacture_name = #{manufactureName,jdbcType=VARCHAR},",
          "equipment_model = #{equipmentModel,jdbcType=VARCHAR},",
          "manufacture_model = #{manufactureModel,jdbcType=VARCHAR},",
          "software_version = #{softwareVersion,jdbcType=VARCHAR},",
          "production_date = #{productionDate,jdbcType=VARCHAR},",
          "equipment_type = #{equipmentType,jdbcType=INTEGER},",
          "equipment_lng = #{equipmentLng,jdbcType=DECIMAL},",
          "equipment_lat = #{equipmentLat,jdbcType=DECIMAL},",
          "power = #{power,jdbcType=DECIMAL},",
          "equipment_name = #{equipmentName,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "proxy_operator_id = #{proxyOperatorId,jdbcType=VARCHAR},",
          "artificial_state = #{artificialState,jdbcType=INTEGER},",
          "state = #{state,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LxCecEquipmentInfo record);
}
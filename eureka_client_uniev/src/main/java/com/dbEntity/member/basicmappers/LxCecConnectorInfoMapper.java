package com.dbEntity.member.basicmappers;

import com.dbEntity.member.basicentity.LxCecConnectorInfo;
import com.dbEntity.member.basicentity.LxCecConnectorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LxCecConnectorInfoMapper {
    int countByExample(LxCecConnectorInfoExample example);

    int deleteByExample(LxCecConnectorInfoExample example);

    @Delete({
        "delete from lx_cec_connector_info1",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into lx_cec_connector_info1 (id, operator_id, ",
        "station_id, equipment_id, ",
        "connector_id, connector_name, ",
        "connector_type, voltage_upper_limit, ",
        "voltage_lower_limit, current, ",
        "power, park_no, national_standard, ",
        "qr_code, aux_power, ",
        "start_type, create_time, ",
        "update_time, proxy_operator_id, ",
        "artificial_state, state)",
        "values (#{id,jdbcType=BIGINT}, #{operatorId,jdbcType=VARCHAR}, ",
        "#{stationId,jdbcType=VARCHAR}, #{equipmentId,jdbcType=VARCHAR}, ",
        "#{connectorId,jdbcType=VARCHAR}, #{connectorName,jdbcType=VARCHAR}, ",
        "#{connectorType,jdbcType=INTEGER}, #{voltageUpperLimit,jdbcType=INTEGER}, ",
        "#{voltageLowerLimit,jdbcType=INTEGER}, #{current,jdbcType=INTEGER}, ",
        "#{power,jdbcType=DECIMAL}, #{parkNo,jdbcType=VARCHAR}, #{nationalStandard,jdbcType=INTEGER}, ",
        "#{qrCode,jdbcType=VARCHAR}, #{auxPower,jdbcType=INTEGER}, ",
        "#{startType,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{proxyOperatorId,jdbcType=VARCHAR}, ",
        "#{artificialState,jdbcType=INTEGER}, #{state,jdbcType=INTEGER})"
    })
    int insert(LxCecConnectorInfo record);

    int insertSelective(LxCecConnectorInfo record);

    List<LxCecConnectorInfo> selectByExample(LxCecConnectorInfoExample example);

    @Select({
        "select",
        "id, operator_id, station_id, equipment_id, connector_id, connector_name, connector_type, ",
        "voltage_upper_limit, voltage_lower_limit, current, power, park_no, national_standard, ",
        "qr_code, aux_power, start_type, create_time, update_time, proxy_operator_id, ",
        "artificial_state, state",
        "from lx_cec_connector_info1",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    LxCecConnectorInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LxCecConnectorInfo record, @Param("example") LxCecConnectorInfoExample example);

    int updateByExample(@Param("record") LxCecConnectorInfo record, @Param("example") LxCecConnectorInfoExample example);

    int updateByPrimaryKeySelective(LxCecConnectorInfo record);

    @Update({
        "update lx_cec_connector_info1",
        "set operator_id = #{operatorId,jdbcType=VARCHAR},",
          "station_id = #{stationId,jdbcType=VARCHAR},",
          "equipment_id = #{equipmentId,jdbcType=VARCHAR},",
          "connector_id = #{connectorId,jdbcType=VARCHAR},",
          "connector_name = #{connectorName,jdbcType=VARCHAR},",
          "connector_type = #{connectorType,jdbcType=INTEGER},",
          "voltage_upper_limit = #{voltageUpperLimit,jdbcType=INTEGER},",
          "voltage_lower_limit = #{voltageLowerLimit,jdbcType=INTEGER},",
          "current = #{current,jdbcType=INTEGER},",
          "power = #{power,jdbcType=DECIMAL},",
          "park_no = #{parkNo,jdbcType=VARCHAR},",
          "national_standard = #{nationalStandard,jdbcType=INTEGER},",
          "qr_code = #{qrCode,jdbcType=VARCHAR},",
          "aux_power = #{auxPower,jdbcType=INTEGER},",
          "start_type = #{startType,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "proxy_operator_id = #{proxyOperatorId,jdbcType=VARCHAR},",
          "artificial_state = #{artificialState,jdbcType=INTEGER},",
          "state = #{state,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LxCecConnectorInfo record);
}
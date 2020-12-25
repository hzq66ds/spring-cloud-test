package com.dbEntity.member.basicmappers;

import com.dbEntity.member.basicentity.LxCecStationInfo;
import com.dbEntity.member.basicentity.LxCecStationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LxCecStationInfoMapper {
    int countByExample(LxCecStationInfoExample example);

    int deleteByExample(LxCecStationInfoExample example);

    @Delete({
        "delete from lx_cec_station_info1",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into lx_cec_station_info1 (id, operator_id, ",
        "station_id, equipment_owner_id, ",
        "station_name, station_custom_name, ",
        "country_code, area_code, ",
        "address, station_tel, ",
        "service_tel, station_type, ",
        "station_custom_type, station_status, ",
        "park_nums, station_lng, ",
        "station_lat, site_guide, ",
        "construction, match_cars, ",
        "park_info, business_hours, ",
        "electricity_fee, service_fee, ",
        "original_electricity_fee, original_service_fee, ",
        "business_electricity_fee, business_service_fee, ",
        "park_fee, business_hours_format, ",
        "business_hours_724, electricity_tax, ",
        "service_tax, park_Fee_free, ",
        "parking_discount_type, park_fee_status, ",
        "printer_flag, barrier_flag, ",
        "payment, support_order, ",
        "remark, create_time, ",
        "update_time, proxy_operator_id, ",
        "artificial_state, state, ",
        "capability_tag)",
        "values (#{id,jdbcType=BIGINT}, #{operatorId,jdbcType=VARCHAR}, ",
        "#{stationId,jdbcType=VARCHAR}, #{equipmentOwnerId,jdbcType=VARCHAR}, ",
        "#{stationName,jdbcType=VARCHAR}, #{stationCustomName,jdbcType=VARCHAR}, ",
        "#{countryCode,jdbcType=VARCHAR}, #{areaCode,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{stationTel,jdbcType=VARCHAR}, ",
        "#{serviceTel,jdbcType=VARCHAR}, #{stationType,jdbcType=INTEGER}, ",
        "#{stationCustomType,jdbcType=INTEGER}, #{stationStatus,jdbcType=INTEGER}, ",
        "#{parkNums,jdbcType=INTEGER}, #{stationLng,jdbcType=DECIMAL}, ",
        "#{stationLat,jdbcType=DECIMAL}, #{siteGuide,jdbcType=VARCHAR}, ",
        "#{construction,jdbcType=INTEGER}, #{matchCars,jdbcType=VARCHAR}, ",
        "#{parkInfo,jdbcType=VARCHAR}, #{businessHours,jdbcType=VARCHAR}, ",
        "#{electricityFee,jdbcType=VARCHAR}, #{serviceFee,jdbcType=VARCHAR}, ",
        "#{originalElectricityFee,jdbcType=VARCHAR}, #{originalServiceFee,jdbcType=VARCHAR}, ",
        "#{businessElectricityFee,jdbcType=VARCHAR}, #{businessServiceFee,jdbcType=VARCHAR}, ",
        "#{parkFee,jdbcType=VARCHAR}, #{businessHoursFormat,jdbcType=VARCHAR}, ",
        "#{businessHours724,jdbcType=INTEGER}, #{electricityTax,jdbcType=DECIMAL}, ",
        "#{serviceTax,jdbcType=DECIMAL}, #{parkFeeFree,jdbcType=INTEGER}, ",
        "#{parkingDiscountType,jdbcType=INTEGER}, #{parkFeeStatus,jdbcType=INTEGER}, ",
        "#{printerFlag,jdbcType=INTEGER}, #{barrierFlag,jdbcType=INTEGER}, ",
        "#{payment,jdbcType=VARCHAR}, #{supportOrder,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{proxyOperatorId,jdbcType=VARCHAR}, ",
        "#{artificialState,jdbcType=INTEGER}, #{state,jdbcType=INTEGER}, ",
        "#{capabilityTag,jdbcType=VARCHAR})"
    })
    int insert(LxCecStationInfo record);

    int insertSelective(LxCecStationInfo record);

    List<LxCecStationInfo> selectByExample(LxCecStationInfoExample example);

    @Select({
        "select",
        "id, operator_id, station_id, equipment_owner_id, station_name, station_custom_name, ",
        "country_code, area_code, address, station_tel, service_tel, station_type, station_custom_type, ",
        "station_status, park_nums, station_lng, station_lat, site_guide, construction, ",
        "match_cars, park_info, business_hours, electricity_fee, service_fee, original_electricity_fee, ",
        "original_service_fee, business_electricity_fee, business_service_fee, park_fee, ",
        "business_hours_format, business_hours_724, electricity_tax, service_tax, park_Fee_free, ",
        "parking_discount_type, park_fee_status, printer_flag, barrier_flag, payment, ",
        "support_order, remark, create_time, update_time, proxy_operator_id, artificial_state, ",
        "state, capability_tag",
        "from lx_cec_station_info1",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    LxCecStationInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LxCecStationInfo record, @Param("example") LxCecStationInfoExample example);

    int updateByExample(@Param("record") LxCecStationInfo record, @Param("example") LxCecStationInfoExample example);

    int updateByPrimaryKeySelective(LxCecStationInfo record);

    @Update({
        "update lx_cec_station_info1",
        "set operator_id = #{operatorId,jdbcType=VARCHAR},",
          "station_id = #{stationId,jdbcType=VARCHAR},",
          "equipment_owner_id = #{equipmentOwnerId,jdbcType=VARCHAR},",
          "station_name = #{stationName,jdbcType=VARCHAR},",
          "station_custom_name = #{stationCustomName,jdbcType=VARCHAR},",
          "country_code = #{countryCode,jdbcType=VARCHAR},",
          "area_code = #{areaCode,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "station_tel = #{stationTel,jdbcType=VARCHAR},",
          "service_tel = #{serviceTel,jdbcType=VARCHAR},",
          "station_type = #{stationType,jdbcType=INTEGER},",
          "station_custom_type = #{stationCustomType,jdbcType=INTEGER},",
          "station_status = #{stationStatus,jdbcType=INTEGER},",
          "park_nums = #{parkNums,jdbcType=INTEGER},",
          "station_lng = #{stationLng,jdbcType=DECIMAL},",
          "station_lat = #{stationLat,jdbcType=DECIMAL},",
          "site_guide = #{siteGuide,jdbcType=VARCHAR},",
          "construction = #{construction,jdbcType=INTEGER},",
          "match_cars = #{matchCars,jdbcType=VARCHAR},",
          "park_info = #{parkInfo,jdbcType=VARCHAR},",
          "business_hours = #{businessHours,jdbcType=VARCHAR},",
          "electricity_fee = #{electricityFee,jdbcType=VARCHAR},",
          "service_fee = #{serviceFee,jdbcType=VARCHAR},",
          "original_electricity_fee = #{originalElectricityFee,jdbcType=VARCHAR},",
          "original_service_fee = #{originalServiceFee,jdbcType=VARCHAR},",
          "business_electricity_fee = #{businessElectricityFee,jdbcType=VARCHAR},",
          "business_service_fee = #{businessServiceFee,jdbcType=VARCHAR},",
          "park_fee = #{parkFee,jdbcType=VARCHAR},",
          "business_hours_format = #{businessHoursFormat,jdbcType=VARCHAR},",
          "business_hours_724 = #{businessHours724,jdbcType=INTEGER},",
          "electricity_tax = #{electricityTax,jdbcType=DECIMAL},",
          "service_tax = #{serviceTax,jdbcType=DECIMAL},",
          "park_Fee_free = #{parkFeeFree,jdbcType=INTEGER},",
          "parking_discount_type = #{parkingDiscountType,jdbcType=INTEGER},",
          "park_fee_status = #{parkFeeStatus,jdbcType=INTEGER},",
          "printer_flag = #{printerFlag,jdbcType=INTEGER},",
          "barrier_flag = #{barrierFlag,jdbcType=INTEGER},",
          "payment = #{payment,jdbcType=VARCHAR},",
          "support_order = #{supportOrder,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "proxy_operator_id = #{proxyOperatorId,jdbcType=VARCHAR},",
          "artificial_state = #{artificialState,jdbcType=INTEGER},",
          "state = #{state,jdbcType=INTEGER},",
          "capability_tag = #{capabilityTag,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LxCecStationInfo record);
}
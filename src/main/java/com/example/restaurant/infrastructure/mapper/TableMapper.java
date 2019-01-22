package com.example.restaurant.infrastructure.mapper;

import java.util.List;

import com.example.restaurant.domain.model.Table;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TableMapper {

  @Select("select * from user")
  List<Table> queryAll();

  @Update("update table set tableNo=#{tableNo},numOfSeat=#{numOfSeat},available=#{available}"+
    "where tableNo=#{tableNo}")
  boolean update(Table table);

  @Insert("insert into table(tableNo,numOfSeat,available values(#{tableNo},#{numOfSeat},#{available}")
  boolean insert(Table table);

  @Delete("delete from table where tableNo=#{tableNo}")
  boolean delete(String tableNo);




}









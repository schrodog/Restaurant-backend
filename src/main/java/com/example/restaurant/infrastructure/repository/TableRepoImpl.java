package com.example.restaurant.infrastructure.repository;

import java.util.List;

import com.example.restaurant.domain.model.Table;
import com.example.restaurant.domain.repository.ITableRepository;
import com.example.restaurant.infrastructure.mapper.TableMapper;

import org.springframework.beans.factory.annotation.Autowired;

public class TableRepoImpl implements ITableRepository {

  @Autowired
  private TableMapper tableMapper;
  
  @Override
  public List<Table> queryAll(){
    return tableMapper.queryAll();
  }

  @Override
  public boolean update(Table table){
    tableMapper.update(table);
    return true;
  }

  @Override
  public boolean insert(Table table){
    tableMapper.insert(table);
    return true;
  }

  @Override
  public boolean delete(String tableNo){
    tableMapper.delete(tableNo);
    return true;
  }

  
}













package com.example.restaurant.domain.repository;

import java.util.List;

import com.example.restaurant.domain.model.Table;

public interface ITableRepository {
  // Table query(String tableNo);
  
  List<Table> queryAll();

  boolean update(Table table);
  boolean insert(Table table);
  boolean delete(String tableNo);
  
  
}







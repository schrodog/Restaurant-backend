package com.example.restaurant.application.service;

import java.util.List;

import com.example.restaurant.domain.model.Table;
import com.example.restaurant.domain.repository.ITableRepository;
import com.example.restaurant.domain.service.TableManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {
  @Autowired
  private ITableRepository tableRepository;  

  @Autowired
  private TableManagement tableManagement;
  
  public List<Table> getTables(){
    return tableRepository.queryAll();
  }

  public void deleteTable(String tableNo){
    tableRepository.delete(tableNo);
  }

  public void assignTable(String tableNo){
    tableManagement.assignTable(tableNo);
  }

  public void addTable(Table table){
    tableManagement.addTable(table);
  }


}

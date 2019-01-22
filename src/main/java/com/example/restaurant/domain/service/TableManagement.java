package com.example.restaurant.domain.service;

import com.example.restaurant.domain.model.Table;
import com.example.restaurant.domain.repository.ITableRepository;

public class TableManagement {

  private ITableRepository tableRepository;

  // public boolean isValidSeat(int seat){
  //   return (seat < MAX_SEAT && seat > 0 );
  // }

  // public boolean isValidTableNo(String no){
  //   return ( no.length() > 0 && no.length() <= MAX_TABLENO_LEN );
  // }

  public boolean addTable(Table table){
    table.setAvailable(false);
    tableRepository.insert(table);
    return true;
  }

  public boolean assignTable(String tableNo){
    tableRepository.update();
    return true;
  }



  
  
}












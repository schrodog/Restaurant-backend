package com.example.restaurant.ui.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.restaurant.application.service.TableService;
import com.example.restaurant.domain.model.Table;
import com.example.restaurant.ui.dto.RequestDTO;
import com.example.restaurant.ui.dto.ResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class WebController {
  private TableService tableService;

  @GetMapping("/tables")
  private ResponseDTO getTables(){
    try {
      return new ResponseDTO(1, tableService.getTables());
    } catch(Exception e){
      return new ResponseDTO(0, -1);
    }
  }

  @DeleteMapping("/table/{tableNo}")
  private ResponseDTO deleteTable(@PathVariable @Valid String tableNo){
    try {
      tableService.deleteTable(tableNo);
      return new ResponseDTO(1, -1);
    } catch(Exception e){
      return new ResponseDTO(0, -1);
    }
  } 
  
  @PutMapping("/table")
  private ResponseDTO assignTable(@RequestBody @Valid RequestDTO<String> req){
    try {
      tableService.assignTable(req.getBody());
      return new ResponseDTO(1, -1);
    } catch(Exception e){
      return new ResponseDTO(0, -1);
    }
  }
  
  @PostMapping("/table")
  private ResponseDTO addTable(@RequestBody @Valid RequestDTO<Table> req){
    try {
      tableService.addTable(req.getBody());
      return new ResponseDTO(1, -1);
    } catch(Exception e){
      return new ResponseDTO(0, -1);
    }
  }


}





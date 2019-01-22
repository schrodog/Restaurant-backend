package com.example.restaurant.ui.dto;

/**
 * Define interface of outgoging mesage
 */

public class ResponseDTO {
  private int statusCode;
  private Object body;

  public ResponseDTO(int code, Object body){
    this.statusCode = code;
    this.body = body;
  }
}








package com.example.restaurant.ui.dto;

import javax.validation.Valid;

/**
 * Define interface of incoming msg 
 */

public class RequestDTO<T> {
  private String requestMsg;
  @Valid
  private T body;

  public RequestDTO(String requestMsg, T body) {
    this.requestMsg = requestMsg;
    this.body = body;
  }

  public String getRequestMsg() {
    return this.requestMsg;
  }

  public void setRequestMsg(String requestMsg) {
    this.requestMsg = requestMsg;
  }

  public T getBody() {
    return this.body;
  }

  public void setBody(T body) {
    this.body = body;
  }


}
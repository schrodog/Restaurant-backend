package com.example.restaurant.domain.model;

// @Entity
public class Table {
  private String tableNo;
  private int numOfSeat;
  private boolean available;

  private final int MAX_SEAT = 20;
  private final int MAX_TABLENO_LEN = 20;

  public Table() {
  }

  public Table(String tableNo, int numOfSeat, boolean available) {
    if ( tableNo.length() > 0 && tableNo.length() <= MAX_TABLENO_LEN )
      this.tableNo = tableNo;
    else
      throw new IllegalArgumentException("invalid table no");

    if (numOfSeat < MAX_SEAT && numOfSeat > 0)
      this.numOfSeat = numOfSeat;
    else
      throw new IllegalArgumentException("invalid num of seats");
    this.available = available;
  }

  public String getTableNo() {
    return this.tableNo;
  }

  public void setTableNo(String tableNo) {
    this.tableNo = tableNo;
  }

  public int getNumOfSeat() {
    return this.numOfSeat;
  }

  public void setNumOfSeat(int numOfSeat) {
    this.numOfSeat = numOfSeat;
  }

  public boolean isAvailable() {
    return this.available;
  }

  public boolean getAvailable() {
    return this.available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  @Override
  public String toString() {
    return "{" +
      " tableNo='" + getTableNo() + "'" +
      ", numOfSeat='" + getNumOfSeat() + "'" +
      ", available='" + isAvailable() + "'" +
      "}";
  }


}













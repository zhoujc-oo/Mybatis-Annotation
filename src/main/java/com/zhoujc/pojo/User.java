package com.zhoujc.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

  private long id;
  private String type;
  private String name;
  private String description;

}

package com.excentro.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

  private Long id;
  private String name;
  private String mark;

  public Student() {
  }

  public Student(String name, String mark) {
    this.name = name;
    this.mark = mark;
  }

  @Id
  @GeneratedValue
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", mark=" + mark + ", name=" + name + "]";
  }
}

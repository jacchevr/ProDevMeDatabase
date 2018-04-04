package edu.cnm.deepdive.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Profession {

  @Id
  @GeneratedValue
  private long id;

  private String profession;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  @Override
  public String toString() { return profession;}
}

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
}

package edu.cnm.deepdive.database.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Keyword {

  @Id
  @GeneratedValue
  private long id;

  private String keyword;

  @ManyToMany(mappedBy = "keywords")
  private Set<Industry> industries = new HashSet<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  @Override
  public String toString() { return keyword;}
}


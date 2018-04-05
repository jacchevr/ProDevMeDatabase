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

  @ManyToMany(mappedBy = "keywords")
  private Set<Profession> professions = new HashSet<>();

  private long score;

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }

  public Set<Industry> getIndustries() {
    return industries;
  }

  public Set<Profession> getProfessions() {
    return professions;
  }

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


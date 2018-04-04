package edu.cnm.deepdive.database.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Profession {

  @Id
  @GeneratedValue
  private long id;

  private String profession;

  @ManyToMany
  @JoinTable(name = "PROFESSION_KEYWORD", joinColumns = {@JoinColumn(name = "profession_id")},
      inverseJoinColumns = {@JoinColumn(name = "keyword_id")})
  private Set<Keyword> keywords = new HashSet<>();

  public Set<Keyword> getKeywords() {
    return keywords;
  }

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

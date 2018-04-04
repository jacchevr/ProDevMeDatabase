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
public class Industry {

  @Id
  @GeneratedValue
  private long id;

  private String industry;

  @ManyToMany
  @JoinTable(name = "INDUSTRY_KEYWORD", joinColumns = {@JoinColumn(name = "industry_id")},
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

  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  @Override
  public String toString() { return industry;}
}

package edu.cnm.deepdive.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Document {

  @Id
  @GeneratedValue
    private long id;

    private long userId;

    private String profession;

    private String industry;

    private String resume;

    private String coverLetter;

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

    public String getIndustry() {
      return industry;
    }

    public void setIndustry(String industry) {
      this.industry = industry;
    }

    public String getResume() {
      return resume;
    }

    public void setResume(String resume) {
      this.resume = resume;
    }

    public String getCoverLetter() {
      return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
      this.coverLetter = coverLetter;
    }

    public long getUserId() { return userId; }

    public void setUserId(long userId) { this.userId = userId; }

    @Override
    public String toString() { return String.format("%s...",resume);}

}

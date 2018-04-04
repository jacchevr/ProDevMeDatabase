package edu.cnm.deepdive.database.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.catalina.User;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Document {

  @Id
  @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = true)
    private UserModel userModel;

    private long resumeGrade;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
     private Date created;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profession_id", nullable = true)
    private Profession profession;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "industry_id", nullable = true)
    private Industry industry;

    private String resume;

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public Profession getProfession() {
      return profession;
    }

    public void setProfession(Profession profession) {
      this.profession = profession;
    }

    public Industry getIndustry() {
      return industry;
    }

    public void setIndustry(Industry industry) {
      this.industry = industry;
    }

    public String getResume() {
      return resume;
    }

    public void setResume(String resume) {
      this.resume = resume;
    }

    public UserModel getUserModel() { return userModel; }

    public void setUserModel(UserModel userModel) { this.userModel = userModel; }

    public long getResumeGrade() {
    return resumeGrade;
    }

    public void setResumeGrade(long resumeGrade) {
    this.resumeGrade = resumeGrade;
    }

  @Override
    public String toString() { return String.format("%s...",resume);}

}

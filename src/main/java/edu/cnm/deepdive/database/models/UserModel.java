package edu.cnm.deepdive.database.models;



import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.swing.event.DocumentEvent;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class UserModel {

  @Id
  @GeneratedValue
  private long id;

  private String email;

  private String lastName;

  private String firstName;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "userModel")
  @OrderBy("created DESC")
  private List<Document> documents = new LinkedList<>();

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public String toString() { return firstName + " " + lastName;}
}

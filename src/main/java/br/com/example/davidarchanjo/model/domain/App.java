package br.com.example.davidarchanjo.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "applications")
public class App {

  @Id
  @GeneratedValue
  private Long id;
  private String author;
  private String name;
  private String version;

  @Builder
  public App(Long id, String author, String name, String version) {
    this.id = id;
    this.author = author;
    this.name = name;
    this.version = version;
  }
 
  public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

// Getter and Setter for author
public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

// Getter and Setter for name
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

// Getter and Setter for version
public String getVersion() {
    return version;
}

public void setVersion(String version) {
    this.version = version;
}


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    App other = (App) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (author == null) {
      if (other.author != null)
        return false;
    } else if (!author.equals(other.author))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (version == null) {
      if (other.version != null)
        return false;
    } else if (!version.equals(other.version))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((version == null) ? 0 : version.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "App [id=" + id + ", author=" + author + ", name=" + name + ", version=" + version + "]";
  }

}

package br.com.example.davidarchanjo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class AppDTO {

    @NotEmpty
    @Size(max = 20)
    @JsonProperty("appName")
    private String name;

    @NotEmpty
    @JsonProperty("appVersion")
    private String version;

    @NotEmpty
    @JsonProperty("devName")
    private String author;

    @Builder
    public AppDTO(String name, String version, String author) {
        this.name = name;
        this.version = version;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AppDTO other = (AppDTO) obj;
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
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "AppDTO [name=" + name + ", version=" + version + ", author=" + author + "]";
    }
    
}

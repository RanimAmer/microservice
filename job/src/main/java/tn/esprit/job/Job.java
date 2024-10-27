package tn.esprit.job;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity
public class Job implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String service;
    private Boolean etat;

    public Job() {
    }

    public Job(int id, String service, Boolean etat) {
        this.id = id;
        this.service = service;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}

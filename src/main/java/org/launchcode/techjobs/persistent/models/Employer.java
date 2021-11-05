package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min=3, max = 50, message = "Location must be between 3 and 50 characters long.")
    private String location;

    @OneToMany//(mappedBy = "employer")
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();


    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(String location) {
        super();
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}

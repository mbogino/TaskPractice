package com.manubogino.taskpractice.models.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Task {
    private int id;

    @NotNull
    @Size(min = 1, max = 100, message = "Longitud máxima 100 caracteres.")
    private String name;

    @NotNull
    @Size(min = 1, max = 100, message = "Longitud máxima 100 caracteres.")
    private String description;

    private String userId;
    private Date creationDate;

    public Task(int id, String name, String description, String user, Date creationDate) {
        super();

        this.id = id;
        this.name = name;
        this.description = description;
        this.userId = user;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String user) {
        this.userId = user;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
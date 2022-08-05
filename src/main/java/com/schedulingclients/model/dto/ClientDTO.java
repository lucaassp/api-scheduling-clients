package com.schedulingclients.model.dto;

import com.schedulingclients.model.Client;

import java.io.Serializable;

public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public ClientDTO() {
    }

    public ClientDTO(Client obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

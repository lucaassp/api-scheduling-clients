package com.schedulingclients.model;

import com.schedulingclients.model.dto.ClientDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Document(collection = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String road;
    private String number;
    private String district;
    private String state;
    private String CEP;
    private ClientDTO client;

    public Address() {
    }

    public Address(String id, String road, String number, String district, String state, String CEP, ClientDTO client) {
        this.id = id;
        this.road = road;
        this.number = number;
        this.district = district;
        this.state = state;
        this.CEP = CEP;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return getId().equals(address.getId()) && Objects.equals(getRoad(), address.getRoad()) && Objects.equals(getNumber(), address.getNumber()) && Objects.equals(getDistrict(), address.getDistrict()) && Objects.equals(getState(), address.getState()) && Objects.equals(getCEP(), address.getCEP()) && Objects.equals(getClient(), address.getClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRoad(), getNumber(), getDistrict(), getState(), getCEP(), getClient());
    }
}

package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 17/02/15.
 */
@Entity
@Table(name = "Address")
public class Address implements Serializable{

    private int id;
    private String postalCode;
    private Integer country;
    private String region;
    private String city;
    private String streetHouse;
    private Country countryByCountry;
    private Collection<Company> companiesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "postalCode", nullable = true, length = 11)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "country", nullable = true, insertable = false, updatable = false)
    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    @Basic
    @Column(name = "region", nullable = true, length = 100)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "streetHouse", nullable = true, length = 100)
    public String getStreetHouse() {
        return streetHouse;
    }

    public void setStreetHouse(String streetHouse) {
        this.streetHouse = streetHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (id != address.id) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (country != null ? !country.equals(address.country) : address.country != null) return false;
        if (postalCode != null ? !postalCode.equals(address.postalCode) : address.postalCode != null) return false;
        if (region != null ? !region.equals(address.region) : address.region != null) return false;
        if (streetHouse != null ? !streetHouse.equals(address.streetHouse) : address.streetHouse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (streetHouse != null ? streetHouse.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "country", referencedColumnName = "id")
    public Country getCountryByCountry() {
        return countryByCountry;
    }

    public void setCountryByCountry(Country countryByCountry) {
        this.countryByCountry = countryByCountry;
    }


    @OneToMany(mappedBy = "addressByAddress")
    public Collection<Company> getCompaniesById() {
        return companiesById;
    }

    public void setCompaniesById(Collection<Company> companiesById) {
        this.companiesById = companiesById;
    }

}

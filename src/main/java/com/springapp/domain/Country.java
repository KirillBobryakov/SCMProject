package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 17/02/15.
 */
@Entity
@Table(name = "Country")
public class Country implements Serializable{
    private int id;
    private String codeA2;
    private String name;
    private Collection<Address> addressesById;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codeA2", nullable = false, insertable = true, updatable = true, length = 2)
    public String getCodeA2() {
        return codeA2;
    }

    public void setCodeA2(String codeA2) {
        this.codeA2 = codeA2;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        if (codeA2 != null ? !codeA2.equals(country.codeA2) : country.codeA2 != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codeA2 != null ? codeA2.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "countryByCountry")
    public Collection<Address> getAddressesById() {
        return addressesById;
    }
    public void setAddressesById(Collection<Address> addressesById) {
        this.addressesById = addressesById;
    }
}

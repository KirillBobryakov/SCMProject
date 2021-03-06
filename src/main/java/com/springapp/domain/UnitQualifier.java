package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 05/03/15.
 */
@Entity
@Table(name = "UnitQualifier")
public class UnitQualifier implements Serializable{
    private int id;
    private int code;
    private String name;
    private String description;
    private Collection<Good> goodsById;
    private Collection<Good> goodsById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitQualifier that = (UnitQualifier) o;

        if (code != that.code) return false;
        if (id != that.id) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + code;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "unitQualifierByGoodsUnitQualifier")
    public Collection<Good> getGoodsById() {
        return goodsById;
    }

    public void setGoodsById(Collection<Good> goodsById) {
        this.goodsById = goodsById;
    }

    @OneToMany(mappedBy = "unitQualifierByPlaceVolumeUnitQualifier")
    public Collection<Good> getGoodsById_0() {
        return goodsById_0;
    }

    public void setGoodsById_0(Collection<Good> goodsById_0) {
        this.goodsById_0 = goodsById_0;
    }
}

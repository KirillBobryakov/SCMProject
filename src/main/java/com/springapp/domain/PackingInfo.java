package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 05/03/15.
 */
@Entity
@Table(name = "PackingInfo")
public class PackingInfo implements Serializable{
    private int id;
    private String code;
    private String descriptionRu;
    private String descriptionFr;
    private Collection<Good> goodsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", length = 2)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "descriptionRu", length = 150)
    public String getDescriptionRu() {
        return descriptionRu;
    }

    public void setDescriptionRu(String descriptionRu) {
        this.descriptionRu = descriptionRu;
    }

    @Basic
    @Column(name = "descriptionFr", length = 150)
    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackingInfo that = (PackingInfo) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (descriptionFr != null ? !descriptionFr.equals(that.descriptionFr) : that.descriptionFr != null)
            return false;
        if (descriptionRu != null ? !descriptionRu.equals(that.descriptionRu) : that.descriptionRu != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (descriptionRu != null ? descriptionRu.hashCode() : 0);
        result = 31 * result + (descriptionFr != null ? descriptionFr.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "packingInfoByPlacePackingInfo")
    public Collection<Good> getGoodsById() {
        return goodsById;
    }
    public void setGoodsById(Collection<Good> goodsById) {
        this.goodsById = goodsById;
    }
}

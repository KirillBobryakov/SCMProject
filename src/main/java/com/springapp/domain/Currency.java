package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 04/03/15.
 */
@Entity
@Table(name = "Currency")
public class Currency implements Serializable{
    private int id;
    private String codeNum;
    private String codeAlfa;
    private String name;
    private Collection<ProcurementGood> procurementGoodsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codeNum", nullable = false, length = 3)
    public String getCodeNum() {
        return codeNum;
    }
    public void setCodeNum(String codeNum) {
        this.codeNum = codeNum;
    }

    @Basic
    @Column(name = "codeAlfa", nullable = false, length = 3)
    public String getCodeAlfa() {
        return codeAlfa;
    }
    public void setCodeAlfa(String codeAlfa) {
        this.codeAlfa = codeAlfa;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
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

        Currency currency = (Currency) o;

        if (id != currency.id) return false;
        if (codeAlfa != null ? !codeAlfa.equals(currency.codeAlfa) : currency.codeAlfa != null) return false;
        if (codeNum != null ? !codeNum.equals(currency.codeNum) : currency.codeNum != null) return false;
        if (name != null ? !name.equals(currency.name) : currency.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codeNum != null ? codeNum.hashCode() : 0);
        result = 31 * result + (codeAlfa != null ? codeAlfa.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "currencyByUnitPriceCurrency")
    public Collection<ProcurementGood> getProcurementGoodsById() {
        return procurementGoodsById;
    }
    public void setProcurementGoodsById(Collection<ProcurementGood> procurementGoodsById) {
        this.procurementGoodsById = procurementGoodsById;
    }

    @Override
    public String toString() {
        return codeAlfa;
    }
}

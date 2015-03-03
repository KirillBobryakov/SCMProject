package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 20/02/15.
 */
@Entity
@Table(name = "Procurement")
public class Procurement implements Serializable{
    private Integer id;
    private String nameText;
    private String nameNum;
    private Integer seller;
    private Integer consignor;
    private Company companyByConsignor;
    private Company companyBySeller;
    private Collection<ProcurementGood> procurementGoodsById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nameText", nullable = true, length = 10)
    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    @Basic
    @Column(name = "nameNum", nullable = true, length = 3)
    public String getNameNum() {
        return nameNum;
    }

    public void setNameNum(String nameNum) {
        this.nameNum = nameNum;
    }

    @Basic
    @Column(name = "seller", nullable = true, insertable = false, updatable = false)
    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    @Basic
    @Column(name = "consignor", nullable = true, insertable = false, updatable = false)
    public Integer getConsignor() {
        return consignor;
    }

    public void setConsignor(Integer consignor) {
        this.consignor = consignor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Procurement that = (Procurement) o;

        if (id != that.id) return false;
        if (consignor != null ? !consignor.equals(that.consignor) : that.consignor != null) return false;
        if (nameNum != null ? !nameNum.equals(that.nameNum) : that.nameNum != null) return false;
        if (nameText != null ? !nameText.equals(that.nameText) : that.nameText != null) return false;
        if (seller != null ? !seller.equals(that.seller) : that.seller != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameText != null ? nameText.hashCode() : 0);
        result = 31 * result + (nameNum != null ? nameNum.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (consignor != null ? consignor.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "consignor", referencedColumnName = "id")
    public Company getCompanyByConsignor() {
        return companyByConsignor;
    }

    public void setCompanyByConsignor(Company companyByConsignor) {
        this.companyByConsignor = companyByConsignor;
    }

    @ManyToOne
    @JoinColumn(name = "seller", referencedColumnName = "id")
    public Company getCompanyBySeller() {
        return companyBySeller;
    }

    public void setCompanyBySeller(Company companyBySeller) {
        this.companyBySeller = companyBySeller;
    }

    @OneToMany(mappedBy = "procurementByProcurement")
    public Collection<ProcurementGood> getProcurementGoodsById() {
        return procurementGoodsById;
    }
    public void setProcurementGoodsById(Collection<ProcurementGood> procurementGoodsById) {
        this.procurementGoodsById = procurementGoodsById;
    }
}

package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 17/02/15.
 */
@Entity
@Table(name = "Company")
public class Company implements Serializable{
    private int id;
    private String nameRu;
    private String nameFr;

    private Integer address;
    private Address addressByAddress;
    private Collection<Procurement> procurementsById;
    private Collection<Procurement> procurementsById_0;
    private Collection<ProcurementGood> procurementGoodsById;
    private Integer type;
    private CompanyType companyTypeByType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nameRu", nullable = true, length = 45)
    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    @Basic
    @Column(name = "nameFr", nullable = false, length = 45)
    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = false, updatable = false)
    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (id != company.id) return false;
        if (address != null ? !address.equals(company.address) : company.address != null) return false;
        if (nameFr != null ? !nameFr.equals(company.nameFr) : company.nameFr != null) return false;
        if (nameRu != null ? !nameRu.equals(company.nameRu) : company.nameRu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameRu != null ? nameRu.hashCode() : 0);
        result = 31 * result + (nameFr != null ? nameFr.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "address", referencedColumnName = "id")
    public Address getAddressByAddress() {
        return addressByAddress;
    }

    public void setAddressByAddress(Address addressByAddress) {
        this.addressByAddress = addressByAddress;
    }

    @OneToMany(mappedBy = "companyByConsignor")
    public Collection<Procurement> getProcurementsById() {
        return procurementsById;
    }

    public void setProcurementsById(Collection<Procurement> procurementsById) {
        this.procurementsById = procurementsById;
    }

    @OneToMany(mappedBy = "companyBySeller")
    public Collection<Procurement> getProcurementsById_0() {
        return procurementsById_0;
    }

    public void setProcurementsById_0(Collection<Procurement> procurementsById_0) {
        this.procurementsById_0 = procurementsById_0;
    }

    @OneToMany(mappedBy = "companyByProducer")
    public Collection<ProcurementGood> getProcurementGoodsById() {
        return procurementGoodsById;
    }

    public void setProcurementGoodsById(Collection<ProcurementGood> procurementGoodsById) {
        this.procurementGoodsById = procurementGoodsById;
    }

    @Basic
    @Column(name = "type", nullable = true, insertable = true, updatable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "id")
    public CompanyType getCompanyTypeByType() {
        return companyTypeByType;
    }

    public void setCompanyTypeByType(CompanyType companyTypeByType) {
        this.companyTypeByType = companyTypeByType;
    }
}

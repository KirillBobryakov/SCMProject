package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 05/03/15.
 */
@Entity
@Table(name = "TnvedCode")
public class TnvedCode implements Serializable{
    private int id;
    private String code;
    private String description;
    private Float importDutyAdValorem;
    private Float importDutyWeight;
    private Integer importDutyWeightCurrency;
    private Float vat;
    private Byte preference;
    private Currency currencyByImportDutyWeightCurrency;
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
    @Column(name = "code", length = 14)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description", length = 150)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "importDutyAdValorem", precision = 0)
    public Float getImportDutyAdValorem() {
        return importDutyAdValorem;
    }

    public void setImportDutyAdValorem(Float importDutyAdValorem) {
        this.importDutyAdValorem = importDutyAdValorem;
    }

    @Basic
    @Column(name = "importDutyWeight", precision = 0)
    public Float getImportDutyWeight() {
        return importDutyWeight;
    }

    public void setImportDutyWeight(Float importDutyWeight) {
        this.importDutyWeight = importDutyWeight;
    }

    @Basic
    @Column(name = "importDutyWeightCurrency")
    public Integer getImportDutyWeightCurrency() {
        return importDutyWeightCurrency;
    }

    public void setImportDutyWeightCurrency(Integer importDutyWeightCurrency) {
        this.importDutyWeightCurrency = importDutyWeightCurrency;
    }

    @Basic
    @Column(name = "vat", precision = 0)
    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    @Basic
    @Column(name = "preference")
    public Byte getPreference() {
        return preference;
    }

    public void setPreference(Byte preference) {
        this.preference = preference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnvedCode tnvedCode = (TnvedCode) o;

        if (id != tnvedCode.id) return false;
        if (code != null ? !code.equals(tnvedCode.code) : tnvedCode.code != null) return false;
        if (description != null ? !description.equals(tnvedCode.description) : tnvedCode.description != null)
            return false;
        if (importDutyAdValorem != null ? !importDutyAdValorem.equals(tnvedCode.importDutyAdValorem) : tnvedCode.importDutyAdValorem != null)
            return false;
        if (importDutyWeight != null ? !importDutyWeight.equals(tnvedCode.importDutyWeight) : tnvedCode.importDutyWeight != null)
            return false;
        if (importDutyWeightCurrency != null ? !importDutyWeightCurrency.equals(tnvedCode.importDutyWeightCurrency) : tnvedCode.importDutyWeightCurrency != null)
            return false;
        if (preference != null ? !preference.equals(tnvedCode.preference) : tnvedCode.preference != null) return false;
        if (vat != null ? !vat.equals(tnvedCode.vat) : tnvedCode.vat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (importDutyAdValorem != null ? importDutyAdValorem.hashCode() : 0);
        result = 31 * result + (importDutyWeight != null ? importDutyWeight.hashCode() : 0);
        result = 31 * result + (importDutyWeightCurrency != null ? importDutyWeightCurrency.hashCode() : 0);
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        result = 31 * result + (preference != null ? preference.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "importDutyWeightCurrency", referencedColumnName = "id", insertable = false, updatable = false)
    public Currency getCurrencyByImportDutyWeightCurrency() {
        return currencyByImportDutyWeightCurrency;
    }

    public void setCurrencyByImportDutyWeightCurrency(Currency currencyByImportDutyWeightCurrency) {
        this.currencyByImportDutyWeightCurrency = currencyByImportDutyWeightCurrency;
    }

    @OneToMany(mappedBy = "tnvedCodeByTnvedCode")
    public Collection<Good> getGoodsById() {
        return goodsById;
    }

    public void setGoodsById(Collection<Good> goodsById) {
        this.goodsById = goodsById;
    }
}

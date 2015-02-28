package com.springapp.domain;

import javax.persistence.*;

/**
 * Created by bkv on 24/02/15.
 */
@Entity
public class ProcurementGood {
    private int id;
    private Integer procurement;
    private Float goodQuantity;
    private Float unitPrice;
    private Float discountAbsolute;
    private Float discountPercent;
    private Integer producer;
    private Procurement procurementByProcurement;
    private Company companyByProducer;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "procurement", insertable = false, updatable = false)
    public Integer getProcurement() {
        return procurement;
    }
    public void setProcurement(Integer procurement) {
        this.procurement = procurement;
    }

    @Basic
    @Column(name = "goodQuantity", precision = 0)
    public Float getGoodQuantity() {
        return goodQuantity;
    }
    public void setGoodQuantity(Float goodQuantity) {
        this.goodQuantity = goodQuantity;
    }

    @Basic
    @Column(name = "unitPrice", precision = 0)
    public Float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "discountAbsolute", precision = 0)
    public Float getDiscountAbsolute() {
        return discountAbsolute;
    }
    public void setDiscountAbsolute(Float discountAbsolute) {
        this.discountAbsolute = discountAbsolute;
    }

    @Basic
    @Column(name = "discountPercent", precision = 0)
    public Float getDiscountPercent() {
        return discountPercent;
    }
    public void setDiscountPercent(Float discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Basic
    @Column(name = "producer", insertable = false, updatable = false)
    public Integer getProducer() {
        return producer;
    }
    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcurementGood that = (ProcurementGood) o;

        if (id != that.id) return false;
        if (discountAbsolute != null ? !discountAbsolute.equals(that.discountAbsolute) : that.discountAbsolute != null)
            return false;
        if (discountPercent != null ? !discountPercent.equals(that.discountPercent) : that.discountPercent != null)
            return false;
        if (goodQuantity != null ? !goodQuantity.equals(that.goodQuantity) : that.goodQuantity != null) return false;
        if (procurement != null ? !procurement.equals(that.procurement) : that.procurement != null) return false;
        if (producer != null ? !producer.equals(that.producer) : that.producer != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (procurement != null ? procurement.hashCode() : 0);
        result = 31 * result + (goodQuantity != null ? goodQuantity.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (discountAbsolute != null ? discountAbsolute.hashCode() : 0);
        result = 31 * result + (discountPercent != null ? discountPercent.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "procurement", referencedColumnName = "id")
    public Procurement getProcurementByProcurement() {
        return procurementByProcurement;
    }
    public void setProcurementByProcurement(Procurement procurementByProcurement) {
        this.procurementByProcurement = procurementByProcurement;
    }

    @ManyToOne
    @JoinColumn(name = "producer", referencedColumnName = "id")
    public Company getCompanyByProducer() {
        return companyByProducer;
    }
    public void setCompanyByProducer(Company companyByProducer) {
        this.companyByProducer = companyByProducer;
    }
}

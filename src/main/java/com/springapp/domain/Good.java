package com.springapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by bkv on 05/03/15.
 */
@Entity
@Table(name = "Good")
public class Good implements Serializable{
    private int id;
    private String item;
    private String model;
    private String goodsDescriptionRu;
    private String goodsDescriptionFr;
    private Integer tnvedCode;
    private Integer goodsUnitQualifier;
    private Long placeGoodsQuantity;
    private Float placeGrossWeight;
    private Float placeNetWeight;
    private Float placeVolume;
    private Integer placeVolumeUnitQualifier;
    private Float placeDimensionL;
    private Float placeDimensionW;
    private Float placeDimensionH;
    private Integer placePackingInfo;
    private PackingInfo packingInfoByPlacePackingInfo;
    private TnvedCode tnvedCodeByTnvedCode;
    private UnitQualifier unitQualifierByGoodsUnitQualifier;
    private UnitQualifier unitQualifierByPlaceVolumeUnitQualifier;
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
    @Column(name = "item", length = 45)
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "model", length = 45)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "goodsDescriptionRu", length = 250)
    public String getGoodsDescriptionRu() {
        return goodsDescriptionRu;
    }

    public void setGoodsDescriptionRu(String goodsDescriptionRu) {
        this.goodsDescriptionRu = goodsDescriptionRu;
    }

    @Basic
    @Column(name = "goodsDescriptionFr", length = 250)
    public String getGoodsDescriptionFr() {
        return goodsDescriptionFr;
    }

    public void setGoodsDescriptionFr(String goodsDescriptionFr) {
        this.goodsDescriptionFr = goodsDescriptionFr;
    }

    @Basic
    @Column(name = "tnvedCode")
    public Integer getTnvedCode() {
        return tnvedCode;
    }

    public void setTnvedCode(Integer tnvedCode) {
        this.tnvedCode = tnvedCode;
    }

    @Basic
    @Column(name = "goodsUnitQualifier")
    public Integer getGoodsUnitQualifier() {
        return goodsUnitQualifier;
    }

    public void setGoodsUnitQualifier(Integer goodsUnitQualifier) {
        this.goodsUnitQualifier = goodsUnitQualifier;
    }

    @Basic
    @Column(name = "placeGoodsQuantity")
    public Long getPlaceGoodsQuantity() {
        return placeGoodsQuantity;
    }

    public void setPlaceGoodsQuantity(Long placeGoodsQuantity) {
        this.placeGoodsQuantity = placeGoodsQuantity;
    }

    @Basic
    @Column(name = "placeGrossWeight", precision = 0)
    public Float getPlaceGrossWeight() {
        return placeGrossWeight;
    }

    public void setPlaceGrossWeight(Float placeGrossWeight) {
        this.placeGrossWeight = placeGrossWeight;
    }

    @Basic
    @Column(name = "placeNetWeight", precision = 0)
    public Float getPlaceNetWeight() {
        return placeNetWeight;
    }

    public void setPlaceNetWeight(Float placeNetWeight) {
        this.placeNetWeight = placeNetWeight;
    }

    @Basic
    @Column(name = "placeVolume", precision = 0)
    public Float getPlaceVolume() {
        return placeVolume;
    }

    public void setPlaceVolume(Float placeVolume) {
        this.placeVolume = placeVolume;
    }

    @Basic
    @Column(name = "placeVolumeUnitQualifier")
    public Integer getPlaceVolumeUnitQualifier() {
        return placeVolumeUnitQualifier;
    }

    public void setPlaceVolumeUnitQualifier(Integer placeVolumeUnitQualifier) {
        this.placeVolumeUnitQualifier = placeVolumeUnitQualifier;
    }

    @Basic
    @Column(name = "placeDimensionL", precision = 0)
    public Float getPlaceDimensionL() {
        return placeDimensionL;
    }

    public void setPlaceDimensionL(Float placeDimensionL) {
        this.placeDimensionL = placeDimensionL;
    }

    @Basic
    @Column(name = "placeDimensionW", precision = 0)
    public Float getPlaceDimensionW() {
        return placeDimensionW;
    }

    public void setPlaceDimensionW(Float placeDimensionW) {
        this.placeDimensionW = placeDimensionW;
    }

    @Basic
    @Column(name = "placeDimensionH", precision = 0)
    public Float getPlaceDimensionH() {
        return placeDimensionH;
    }

    public void setPlaceDimensionH(Float placeDimensionH) {
        this.placeDimensionH = placeDimensionH;
    }

    @Basic
    @Column(name = "placePackingInfo")
    public Integer getPlacePackingInfo() {
        return placePackingInfo;
    }

    public void setPlacePackingInfo(Integer placePackingInfo) {
        this.placePackingInfo = placePackingInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Good good = (Good) o;

        if (id != good.id) return false;
        if (goodsDescriptionFr != null ? !goodsDescriptionFr.equals(good.goodsDescriptionFr) : good.goodsDescriptionFr != null)
            return false;
        if (goodsDescriptionRu != null ? !goodsDescriptionRu.equals(good.goodsDescriptionRu) : good.goodsDescriptionRu != null)
            return false;
        if (goodsUnitQualifier != null ? !goodsUnitQualifier.equals(good.goodsUnitQualifier) : good.goodsUnitQualifier != null)
            return false;
        if (item != null ? !item.equals(good.item) : good.item != null) return false;
        if (model != null ? !model.equals(good.model) : good.model != null) return false;
        if (placeDimensionH != null ? !placeDimensionH.equals(good.placeDimensionH) : good.placeDimensionH != null)
            return false;
        if (placeDimensionL != null ? !placeDimensionL.equals(good.placeDimensionL) : good.placeDimensionL != null)
            return false;
        if (placeDimensionW != null ? !placeDimensionW.equals(good.placeDimensionW) : good.placeDimensionW != null)
            return false;
        if (placeGoodsQuantity != null ? !placeGoodsQuantity.equals(good.placeGoodsQuantity) : good.placeGoodsQuantity != null)
            return false;
        if (placeGrossWeight != null ? !placeGrossWeight.equals(good.placeGrossWeight) : good.placeGrossWeight != null)
            return false;
        if (placeNetWeight != null ? !placeNetWeight.equals(good.placeNetWeight) : good.placeNetWeight != null)
            return false;
        if (placePackingInfo != null ? !placePackingInfo.equals(good.placePackingInfo) : good.placePackingInfo != null)
            return false;
        if (placeVolume != null ? !placeVolume.equals(good.placeVolume) : good.placeVolume != null) return false;
        if (placeVolumeUnitQualifier != null ? !placeVolumeUnitQualifier.equals(good.placeVolumeUnitQualifier) : good.placeVolumeUnitQualifier != null)
            return false;
        if (tnvedCode != null ? !tnvedCode.equals(good.tnvedCode) : good.tnvedCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (goodsDescriptionRu != null ? goodsDescriptionRu.hashCode() : 0);
        result = 31 * result + (goodsDescriptionFr != null ? goodsDescriptionFr.hashCode() : 0);
        result = 31 * result + (tnvedCode != null ? tnvedCode.hashCode() : 0);
        result = 31 * result + (goodsUnitQualifier != null ? goodsUnitQualifier.hashCode() : 0);
        result = 31 * result + (placeGoodsQuantity != null ? placeGoodsQuantity.hashCode() : 0);
        result = 31 * result + (placeGrossWeight != null ? placeGrossWeight.hashCode() : 0);
        result = 31 * result + (placeNetWeight != null ? placeNetWeight.hashCode() : 0);
        result = 31 * result + (placeVolume != null ? placeVolume.hashCode() : 0);
        result = 31 * result + (placeVolumeUnitQualifier != null ? placeVolumeUnitQualifier.hashCode() : 0);
        result = 31 * result + (placeDimensionL != null ? placeDimensionL.hashCode() : 0);
        result = 31 * result + (placeDimensionW != null ? placeDimensionW.hashCode() : 0);
        result = 31 * result + (placeDimensionH != null ? placeDimensionH.hashCode() : 0);
        result = 31 * result + (placePackingInfo != null ? placePackingInfo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "placePackingInfo", referencedColumnName = "id", insertable = false, updatable = false)
    public PackingInfo getPackingInfoByPlacePackingInfo() {
        return packingInfoByPlacePackingInfo;
    }

    public void setPackingInfoByPlacePackingInfo(PackingInfo packingInfoByPlacePackingInfo) {
        this.packingInfoByPlacePackingInfo = packingInfoByPlacePackingInfo;
    }

    @ManyToOne
    @JoinColumn(name = "tnvedCode", referencedColumnName = "id", insertable = false, updatable = false)
    public TnvedCode getTnvedCodeByTnvedCode() {
        return tnvedCodeByTnvedCode;
    }

    public void setTnvedCodeByTnvedCode(TnvedCode tnvedCodeByTnvedCode) {
        this.tnvedCodeByTnvedCode = tnvedCodeByTnvedCode;
    }

    @ManyToOne
    @JoinColumn(name = "goodsUnitQualifier", referencedColumnName = "id", insertable = false, updatable = false)
    public UnitQualifier getUnitQualifierByGoodsUnitQualifier() {
        return unitQualifierByGoodsUnitQualifier;
    }

    public void setUnitQualifierByGoodsUnitQualifier(UnitQualifier unitQualifierByGoodsUnitQualifier) {
        this.unitQualifierByGoodsUnitQualifier = unitQualifierByGoodsUnitQualifier;
    }

    @ManyToOne
    @JoinColumn(name = "placeVolumeUnitQualifier", referencedColumnName = "id", insertable = false, updatable = false)
    public UnitQualifier getUnitQualifierByPlaceVolumeUnitQualifier() {
        return unitQualifierByPlaceVolumeUnitQualifier;
    }

    public void setUnitQualifierByPlaceVolumeUnitQualifier(UnitQualifier unitQualifierByPlaceVolumeUnitQualifier) {
        this.unitQualifierByPlaceVolumeUnitQualifier = unitQualifierByPlaceVolumeUnitQualifier;
    }

    @OneToMany(mappedBy = "goodByGood")
    public Collection<ProcurementGood> getProcurementGoodsById() {
        return procurementGoodsById;
    }

    public void setProcurementGoodsById(Collection<ProcurementGood> procurementGoodsById) {
        this.procurementGoodsById = procurementGoodsById;
    }
}

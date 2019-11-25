package com.globallogic.technicaltest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertiesModel {

    private Double mag;
    private String place;
    private Long time;
    private Long updated;
    private Integer tz;
    private String url;
    private String detail;
    private String felt;
    private Double cdi;
    private Double mmi;
    private String alert;
    private String status;
    private Integer tsunami;
    private Integer sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private String nst;
    private Double dmin;
    private Double rms;
    private Double gap;
    private String magType;
    private String type;
    private String title;

    public Double getMag() {
        return mag;
    }

    public void setMag(Double mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Integer getTz() {
        return tz;
    }

    public void setTz(Integer tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFelt() {
        return felt;
    }

    public void setFelt(String felt) {
        this.felt = felt;
    }

    public Double getCdi() {
        return cdi;
    }

    public void setCdi(Double cdi) {
        this.cdi = cdi;
    }

    public Double getMmi() {
        return mmi;
    }

    public void setMmi(Double mmi) {
        this.mmi = mmi;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTsunami() {
        return tsunami;
    }

    public void setTsunami(Integer tsunami) {
        this.tsunami = tsunami;
    }

    public Integer getSig() {
        return sig;
    }

    public void setSig(Integer sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getNst() {
        return nst;
    }

    public void setNst(String nst) {
        this.nst = nst;
    }

    public Double getDmin() {
        return dmin;
    }

    public void setDmin(Double dmin) {
        this.dmin = dmin;
    }

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public Double getGap() {
        return gap;
    }

    public void setGap(Double gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("mag", mag)
                .append("place", place)
                .append("time", time)
                .append("updated", updated)
                .append("tz", tz)
                .append("url", url)
                .append("detail", detail)
                .append("felt", felt)
                .append("cdi", cdi)
                .append("mmi", mmi)
                .append("alert", alert)
                .append("status", status)
                .append("tsunami", tsunami)
                .append("sig", sig)
                .append("net", net)
                .append("code", code)
                .append("ids", ids)
                .append("sources", sources)
                .append("types", types)
                .append("nst", nst)
                .append("dmin", dmin)
                .append("rms", rms)
                .append("gap", gap)
                .append("magType", magType)
                .append("type", type)
                .append("title", title)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PropertiesModel that = (PropertiesModel) o;

        return new EqualsBuilder()
                .append(mag, that.mag)
                .append(place, that.place)
                .append(time, that.time)
                .append(updated, that.updated)
                .append(tz, that.tz)
                .append(url, that.url)
                .append(detail, that.detail)
                .append(felt, that.felt)
                .append(cdi, that.cdi)
                .append(mmi, that.mmi)
                .append(alert, that.alert)
                .append(status, that.status)
                .append(tsunami, that.tsunami)
                .append(sig, that.sig)
                .append(net, that.net)
                .append(code, that.code)
                .append(ids, that.ids)
                .append(sources, that.sources)
                .append(types, that.types)
                .append(nst, that.nst)
                .append(dmin, that.dmin)
                .append(rms, that.rms)
                .append(gap, that.gap)
                .append(magType, that.magType)
                .append(type, that.type)
                .append(title, that.title)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(mag)
                .append(place)
                .append(time)
                .append(updated)
                .append(tz)
                .append(url)
                .append(detail)
                .append(felt)
                .append(cdi)
                .append(mmi)
                .append(alert)
                .append(status)
                .append(tsunami)
                .append(sig)
                .append(net)
                .append(code)
                .append(ids)
                .append(sources)
                .append(types)
                .append(nst)
                .append(dmin)
                .append(rms)
                .append(gap)
                .append(magType)
                .append(type)
                .append(title)
                .toHashCode();
    }
}
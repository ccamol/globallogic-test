package com.globallogic.technicaltest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturesModel {

    private String type;
    private PropertiesModel properties;
    private GeometryModel geometry;
    private String id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(PropertiesModel properties) {
        this.properties = properties;
    }

    public GeometryModel getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryModel geometry) {
        this.geometry = geometry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("properties", properties)
                .append("geometry", geometry)
                .append("id", id)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FeaturesModel features = (FeaturesModel) o;

        return new EqualsBuilder()
                .append(type, features.type)
                .append(properties, features.properties)
                .append(geometry, features.geometry)
                .append(id, features.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(properties)
                .append(geometry)
                .append(id)
                .toHashCode();
    }
}
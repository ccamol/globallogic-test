package com.globallogic.technicaltest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class GeometryModel {

    private String type;
    private List<Long> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Long> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Long> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("coordinates", coordinates)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        GeometryModel geometry = (GeometryModel) o;

        return new EqualsBuilder()
                .append(type, geometry.type)
                .append(coordinates, geometry.coordinates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(coordinates)
                .toHashCode();
    }
}
package com.globallogic.technicaltest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private String type;
    private MetadataModel metadata;
    private List<FeaturesModel> features;
    private List<Integer> bbox;

    public Response() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MetadataModel getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataModel metadata) {
        this.metadata = metadata;
    }

    public List<FeaturesModel> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeaturesModel> features) {
        this.features = features;
    }

    public List<Integer> getBbox() {
        return bbox;
    }

    public void setBbox(List<Integer> bbox) {
        this.bbox = bbox;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("metadata", metadata)
                .append("features", features)
                .append("bbox", bbox)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Response quote = (Response) o;

        return new EqualsBuilder()
                .append(type, quote.type)
                .append(metadata, quote.metadata)
                .append(features, quote.features)
                .append(bbox, quote.bbox)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(metadata)
                .append(features)
                .append(bbox)
                .toHashCode();
    }

}
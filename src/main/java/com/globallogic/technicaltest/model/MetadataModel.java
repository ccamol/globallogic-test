package com.globallogic.technicaltest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetadataModel {

    private Long generated;
    private String url;
    private String title;
    private int status;
    private String api;
    private int count;

    public MetadataModel() {
    }

    public Long getGenerated() {
        return generated;
    }

    public void setGenerated(Long generated) {
        this.generated = generated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("generated", generated)
                .append("url", url)
                .append("title", title)
                .append("status", status)
                .append("api", api)
                .append("count", count)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MetadataModel metadata = (MetadataModel) o;

        return new EqualsBuilder()
                .append(status, metadata.status)
                .append(count, metadata.count)
                .append(generated, metadata.generated)
                .append(url, metadata.url)
                .append(title, metadata.title)
                .append(api, metadata.api)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(generated)
                .append(url)
                .append(title)
                .append(status)
                .append(api)
                .append(count)
                .toHashCode();
    }
}
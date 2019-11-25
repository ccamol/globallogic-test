package com.globallogic.technicaltest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("endpoint")
public class AppConfig {

    private String earthquake;
    private String earthquakedates;
    private String earthquakemagnitude;
    private String formatdate;

    public String getEarthquake() {
        return earthquake;
    }

    public void setEarthquake(String earthquake) {
        this.earthquake = earthquake;
    }

    public String getEarthquakedates() {
        return earthquakedates;
    }

    public void setEarthquakedates(String earthquakedates) {
        this.earthquakedates = earthquakedates;
    }

    public String getEarthquakemagnitude() {
        return earthquakemagnitude;
    }

    public void setEarthquakemagnitude(String earthquakemagnitude) {
        this.earthquakemagnitude = earthquakemagnitude;
    }

    public String getFormatdate() {
        return formatdate;
    }

    public void setFormatdate(String formatdate) {
        this.formatdate = formatdate;
    }

}
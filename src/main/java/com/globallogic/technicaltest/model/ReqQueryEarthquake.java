package com.globallogic.technicaltest.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ReqQueryEarthquake {

    /**
     * Por definicion de negocio (o documento expreso) se mantienen estos fields con sus respectivos nombres
     */
    private String fechaInicioR1;
    private String fechaTerminoR1;
    private String fechaInicioR2;
    private String fechaTerminoR2;

    /**
     * Definicion de fields segun el estandar
     */
    private String magnitudInicioR1;
    private String magnitudTerminoR1;
    private String paisR1;
    private String paisR2;

    public String getMagnitudInicioR1() {
        return magnitudInicioR1;
    }

    public void setMagnitudInicioR1(String magnitudInicioR1) {
        this.magnitudInicioR1 = magnitudInicioR1;
    }

    public String getMagnitudTerminoR1() {
        return magnitudTerminoR1;
    }

    public void setMagnitudTerminoR1(String magnitudTerminoR1) {
        this.magnitudTerminoR1 = magnitudTerminoR1;
    }

    public String getPaisR1() {
        return paisR1;
    }

    public void setPaisR1(String paisR1) {
        this.paisR1 = paisR1;
    }

    public String getPaisR2() {
        return paisR2;
    }

    public void setPaisR2(String paisR2) {
        this.paisR2 = paisR2;
    }

    public String getFechaInicioR2() {
        return fechaInicioR2;
    }

    public void setFechaInicioR2(String fechaInicioR2) {
        this.fechaInicioR2 = fechaInicioR2;
    }

    public String getFechaTerminoR2() {
        return fechaTerminoR2;
    }

    public void setFechaTerminoR2(String fechaTerminoR2) {
        this.fechaTerminoR2 = fechaTerminoR2;
    }

    public String getFechaInicioR1() {
        return fechaInicioR1;
    }

    public void setFechaInicioR1(String fechaInicioR1) {
        this.fechaInicioR1 = fechaInicioR1;
    }

    public String getFechaTerminoR1() {
        return fechaTerminoR1;
    }

    public void setFechaTerminoR1(String fechaTerminoR1) {
        this.fechaTerminoR1 = fechaTerminoR1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("fechaInicioR1", fechaInicioR1)
                .append("fechaTerminoR1", fechaTerminoR1)
                .append("fechaInicioR2", fechaInicioR2)
                .append("fechaTerminoR2", fechaTerminoR2)
                .append("magnitudInicioR1", magnitudInicioR1)
                .append("magnitudTerminoR1", magnitudTerminoR1)
                .append("paisR1", paisR1)
                .append("paisR2", paisR2)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ReqQueryEarthquake that = (ReqQueryEarthquake) o;

        return new EqualsBuilder()
                .append(fechaInicioR1, that.fechaInicioR1)
                .append(fechaTerminoR1, that.fechaTerminoR1)
                .append(fechaInicioR2, that.fechaInicioR2)
                .append(fechaTerminoR2, that.fechaTerminoR2)
                .append(magnitudInicioR1, that.magnitudInicioR1)
                .append(magnitudTerminoR1, that.magnitudTerminoR1)
                .append(paisR1, that.paisR1)
                .append(paisR2, that.paisR2)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(fechaInicioR1)
                .append(fechaTerminoR1)
                .append(fechaInicioR2)
                .append(fechaTerminoR2)
                .append(magnitudInicioR1)
                .append(magnitudTerminoR1)
                .append(paisR1)
                .append(paisR2)
                .toHashCode();
    }
}

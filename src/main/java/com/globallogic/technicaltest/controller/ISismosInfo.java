package com.globallogic.technicaltest.controller;

import com.globallogic.technicaltest.exception.SismoException;
import com.globallogic.technicaltest.model.Response;
import com.globallogic.technicaltest.model.ReqQueryEarthquake;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ISismosInfo {

    /**
     * Obtienes los sismos mediante el filtro de fechas
     * Principio SOLID -> Metodo abstracto que debe ser implementado para ??? TODO
     * @param reqQuery
     * @return
     */
    List<Response> getEarthQuakeByDates(ReqQueryEarthquake reqQuery, boolean is4Dates) throws SismoException;

    /**
     * Obtiene los sismos mediante el filtro de magnitudes
     * @param reqQuery
     * @return
     */
    Response getEarthQuakeByMagnitudes(ReqQueryEarthquake reqQuery) throws SismoException;

    /**
     * Obtiene los sismos mediante el filtro de pais
     * @param reqQuery
     * @return
     */
    Response getEarthQuakeByCountry(ReqQueryEarthquake reqQuery) throws SismoException;

    /**
     * Obtiene los sismos mediante el filtro de pais y fecha
     * @param reqQuery
     * @return
     */
    Response getEarthQuakeByCountriesDates(ReqQueryEarthquake reqQuery) throws SismoException;

}

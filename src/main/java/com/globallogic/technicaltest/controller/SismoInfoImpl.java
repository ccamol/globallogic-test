package com.globallogic.technicaltest.controller;

import com.globallogic.technicaltest.exception.SismoException;
import com.globallogic.technicaltest.model.Response;
import com.globallogic.technicaltest.model.ReqQueryEarthquake;
import com.globallogic.technicaltest.service.EarthquakeService;
import com.globallogic.technicaltest.util.IUtilApp;
import com.globallogic.technicaltest.util.ValidatorDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SismoInfoImpl implements ISismosInfo {

    private static final Logger log = LoggerFactory.getLogger(SismoInfoImpl.class);

    private String earthquake;
    private String formatdate;

    public SismoInfoImpl(
            String earthquake,
            String formatdate) {
        this.earthquake = earthquake;
        this.formatdate = formatdate;
    }

    /**
     * Obtiene lo sismos entre fechas
     * @param reqQuery
     * @param is4Dates
     * @return
     * @throws SismoException
     */
    @Override
    public List<Response> getEarthQuakeByDates(ReqQueryEarthquake reqQuery, boolean is4Dates) throws SismoException {

        IUtilApp validator = new ValidatorDate(formatdate);

        if (is4Dates) {
            return getInfoBy4Dates(reqQuery, validator);
        } else {
            return getInfoBy2Dates(reqQuery, validator);
        }
    }

    private List<Response> getInfoBy2Dates(ReqQueryEarthquake reqQuery, IUtilApp validator) throws SismoException {
        Response result;
        List<Response> list = new ArrayList<>();
        Objects.requireNonNull(reqQuery.getFechaInicioR1());
        Objects.requireNonNull(reqQuery.getFechaTerminoR1());

        if (!validator.isInputDateValid(reqQuery.getFechaInicioR1())
                || !validator.isInputDateValid(reqQuery.getFechaTerminoR1())) {
            throw new SismoException("Fechas en formato invalido - formato debe ser [yyyy-mm-dd]");
        }

        result =
                EarthquakeService.
                        getEarthQuakeBetweenTwoDates(earthquake,
                                reqQuery.getFechaInicioR1(),
                                reqQuery.getFechaTerminoR1());

        list.add(result);

        return list;
    }

    private List<Response> getInfoBy4Dates(ReqQueryEarthquake reqQuery, IUtilApp validator) throws SismoException {
        Response result1;
        Response result2;
        List<Response> list = new ArrayList<>();
        Objects.requireNonNull(reqQuery.getFechaInicioR1());
        Objects.requireNonNull(reqQuery.getFechaTerminoR1());
        Objects.requireNonNull(reqQuery.getFechaInicioR2());
        Objects.requireNonNull(reqQuery.getFechaTerminoR2());

        if (!validator.isInputDateValid(reqQuery.getFechaInicioR1())
                || !validator.isInputDateValid(reqQuery.getFechaTerminoR1())
                || !validator.isInputDateValid(reqQuery.getFechaInicioR2())
                || !validator.isInputDateValid(reqQuery.getFechaTerminoR2())) {
            throw new SismoException("Fechas en formato invalido - formato debe ser [yyyy-mm-dd]");
        }

        result1 =
                EarthquakeService.
                        getEarthQuakeBetweenTwoDates(earthquake,
                                reqQuery.getFechaInicioR1(),
                                reqQuery.getFechaTerminoR1());

        list.add(result1);

        result2 =
                EarthquakeService.
                        getEarthQuakeBetweenTwoDates(earthquake,
                                reqQuery.getFechaInicioR2(),
                                reqQuery.getFechaTerminoR2());

        list.add(result2);

        return list;
    }

    /**
     * Obtiene los sismos entre magnitudes
     * @param reqQuery
     * @return
     * @throws SismoException
     */
    @Override
    public Response getEarthQuakeByMagnitudes(ReqQueryEarthquake reqQuery) throws SismoException {
        Response result =
                EarthquakeService.getEarthQuakeByMagnitudes(
                        earthquake,
                        reqQuery.getMagnitudInicioR1(),
                        reqQuery.getMagnitudTerminoR1());

        return result;
    }

    /**
     * Obtiene los sismos en relacion a un pais consultado
     * @param reqQuery
     * @return
     * @throws SismoException
     */
    @Override
    public Response getEarthQuakeByCountry(ReqQueryEarthquake reqQuery) throws SismoException {
        //TODO implements
        return null;
    }

    /**
     * Obtiene los sismos en relacion a pais y fechas consultadas
     * @param reqQuery
     * @return
     * @throws SismoException
     */
    @Override
    public Response getEarthQuakeByCountriesDates(ReqQueryEarthquake reqQuery) throws SismoException {
        //TODO implements
        return null;
    }
}

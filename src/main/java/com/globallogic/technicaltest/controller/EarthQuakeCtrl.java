package com.globallogic.technicaltest.controller;

import com.globallogic.technicaltest.exception.SismoException;
import com.globallogic.technicaltest.model.Response;
import com.globallogic.technicaltest.model.ReqQueryEarthquake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EarthQuakeCtrl {

    private static final Logger log = LoggerFactory.getLogger(EarthQuakeCtrl.class);

    @Value("${endpoint.earthquake}")
    private String earthquakeEndpoint;

    @Value("${endpoint.formatdate}")
    private String formatdate;

    @RequestMapping(value = "/conultarSismosEntre2Fechas", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
            MediaType.APPLICATION_JSON_VALUE }, method = { RequestMethod.GET })
    public List<Response> conultarSismosEntre2Fechas(@RequestBody ReqQueryEarthquake reqQuery) {

        List<Response> result = null;

        SismoInfoImpl sismoInfo = new SismoInfoImpl(earthquakeEndpoint, formatdate);
        try {
            result = sismoInfo.getEarthQuakeByDates(reqQuery, false);
        } catch (SismoException e) {
            log.error(e.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/conultarSismosEntre4Fechas", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
            MediaType.APPLICATION_JSON_VALUE }, method = { RequestMethod.GET })
    public List<Response> conultarSismosEntre4Fechas(@RequestBody ReqQueryEarthquake reqQuery) {

        List<Response> result = null;

        SismoInfoImpl sismoInfo = new SismoInfoImpl(earthquakeEndpoint, formatdate);
        try {
            result = sismoInfo.getEarthQuakeByDates(reqQuery, true);

        } catch (SismoException e) {
            log.error(e.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/conultarSismosEntreMagnitudes", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
            MediaType.APPLICATION_JSON_VALUE }, method = { RequestMethod.GET })
    public Response conultarSismosEntreMagnitudes(@RequestBody ReqQueryEarthquake reqQuery) {

        Response result = null;

        SismoInfoImpl sismoInfo = new SismoInfoImpl(earthquakeEndpoint, formatdate);
        try {
             result = sismoInfo.getEarthQuakeByMagnitudes(reqQuery);
        } catch (SismoException e) {
            log.error(e.getMessage());
        }

        return result;
    }

}

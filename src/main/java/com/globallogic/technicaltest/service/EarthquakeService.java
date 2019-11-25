package com.globallogic.technicaltest.service;

import com.globallogic.technicaltest.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EarthquakeService {

	private static final Logger log = LoggerFactory.getLogger(EarthquakeService.class);

	/**
	 * Metodo que establece la url final para la peticion hacia la api de sismos con la consulta entre 2 fechas
	 * @param uri
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Response getEarthQuakeBetweenTwoDates(String uri, String startDate, String endDate){
		StringBuilder sb = new StringBuilder();
		sb.append(uri);
		sb.append("/query?format=geojson&starttime=");
		sb.append(startDate);
		sb.append("&endtime=");
		sb.append(endDate);

		RestTemplate rt = new RestTemplate();
		final String url = sb.toString();
		Response result = rt.getForObject(url, Response.class);

		return result;
	}

	/**
	 * Metodo que establece la url final para la peticion hacia la api de sismos con la consulta entre 2 magnitudes
	 * @param uri
	 * @param startMagnitude
	 * @param endMagnitude
	 * @return
	 */
	public static Response getEarthQuakeByMagnitudes(String uri, String startMagnitude, String endMagnitude){
		StringBuilder sb = new StringBuilder();
		sb.append(uri);
		sb.append("/query?format=geojson&minmagnitude=");
		sb.append(startMagnitude);
		sb.append("&maxmagnitude=");
		sb.append(endMagnitude);

		RestTemplate rt = new RestTemplate();
		final String url = sb.toString();
		Response result = rt.getForObject(url, Response.class);

		return result;
	}

}

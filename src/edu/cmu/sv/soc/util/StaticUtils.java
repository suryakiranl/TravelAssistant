package edu.cmu.sv.soc.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StaticUtils {
	private static final Logger log = Logger
			.getLogger(StaticUtils.class);
	
	public static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	
	/**
	 * Method to encode the parameter value so that spaces are being taken care
	 * of when city names are queried.
	 * 
	 * @param param
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String encodeParameter(String param)
			throws UnsupportedEncodingException {
		param = URLEncoder.encode(param, Charset.defaultCharset().name());
		log.trace("Encoded Param value = " + param);

		return param;
	}
}

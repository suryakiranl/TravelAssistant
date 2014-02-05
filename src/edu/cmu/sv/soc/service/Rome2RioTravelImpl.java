package edu.cmu.sv.soc.service;

import java.io.IOException;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.TravelSearchRequest;
import edu.cmu.sv.soc.dto.TravelSearchResponse;
import edu.cmu.sv.soc.util.HttpHelper;
import edu.cmu.sv.soc.util.StaticUtils;

public class Rome2RioTravelImpl implements ITravel {
	private static final Logger log = Logger
			.getLogger(Rome2RioTravelImpl.class);

	private static final String URL_PREFIX = "http://free.rome2rio.com/api/1.2/json/Search?";

	@Override
	public TravelSearchResponse findTravelPaths(TravelSearchRequest travelReq) {
		TravelSearchResponse travelData = null;

		try {
			String url = URL_PREFIX + travelReq.getForURL();
			String response = HttpHelper.httpGet(url);
			log.trace("Travel information = " + response);

			travelData = StaticUtils.gson.fromJson(response,
					TravelSearchResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return travelData;
	}
}

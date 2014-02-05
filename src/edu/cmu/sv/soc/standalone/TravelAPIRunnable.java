package edu.cmu.sv.soc.standalone;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.TravelSearchRequest;
import edu.cmu.sv.soc.dto.TravelSearchResponse;
import edu.cmu.sv.soc.service.ITravel;
import edu.cmu.sv.soc.service.Rome2RioTravelImpl;

public class TravelAPIRunnable {
	private static final Logger log = Logger.getLogger(TravelAPIRunnable.class);
	
	public static void main(String[] args) {
		TravelSearchRequest travelReq = new TravelSearchRequest("San Jose", "San Francisco");
		ITravel service = new Rome2RioTravelImpl();
		
		TravelSearchResponse resp = service.findTravelPaths(travelReq);
		log.trace("Response == > " + resp);
		
	}

}

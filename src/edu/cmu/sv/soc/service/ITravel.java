package edu.cmu.sv.soc.service;

import edu.cmu.sv.soc.dto.TravelSearchRequest;
import edu.cmu.sv.soc.dto.TravelSearchResponse;

public interface ITravel {
	TravelSearchResponse findTravelPaths(TravelSearchRequest travelReq);
}

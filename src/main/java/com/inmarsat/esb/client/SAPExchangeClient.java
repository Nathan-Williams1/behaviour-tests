package com.inmarsat.esb.client;

import com.inmarsat.esb.client.EXCHANGERATEREQUEST;

import com.inmarsat.esb.client.SAPExchangeService;
import com.inmarsat.esb.client.SAPExchangeServiceEndpoint;

public class SAPExchangeClient {
	public static void main(String[] args) {
		SAPExchangeService sapExchangeService = new SAPExchangeService();
		SAPExchangeServiceEndpoint sapExchangeServiceEnpoint;
		sapExchangeServiceEnpoint = sapExchangeService.getSAPExchangeServicePort();
		EXCHANGERATEREQUEST exchangeRateRequest = new EXCHANGERATEREQUEST();
		sapExchangeServiceEnpoint.processSAPExchangeRate(exchangeRateRequest);
	}
}

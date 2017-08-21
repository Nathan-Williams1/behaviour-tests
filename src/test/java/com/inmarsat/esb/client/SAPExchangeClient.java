package com.inmarsat.esb.client;

import com.inmarsat.oneitbtp.esb.exchange_adapter.EXCHANGERATE01;
import com.inmarsat.oneitbtp.esb.exchange_adapter.EXCHANGERATEREQUEST;
import com.inmarsat.oneitbtp.esb.exchange_adapter.EXCHANGERATERESPONSE;
import com.inmarsat.oneitbtp.esb.exchange_adapter.HEADERINFO;
import com.inmarsat.oneitbtp.esb.exchange_adapter.ObjectFactory;
import com.inmarsat.oneitbtp.esb.exchange_adapter.SAPExchangeService;
import com.inmarsat.oneitbtp.esb.exchange_adapter.SAPExchangeServiceEndpoint;

public class SAPExchangeClient {
	SAPExchangeService sapExchangeService = new SAPExchangeService();
	SAPExchangeServiceEndpoint sapExchangeServiceEndpoint;
	sapExchangeServiceEndpoint = sapExchangeService.getSAPExchangeServicePort();
}

package com.inmarsat.esb;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.StringTokenizer;

import org.apache.log4j.BasicConfigurator;

import org.junit.Test;

import com.inmarsat.esb.requests.HTTPRequests;
import com.inmarsat.esb.requests.SOAPRequest;

public class BehaviourTest {

	@Test
	public void bodyTest() {

		BasicConfigurator.configure();
		String name = "this";
		String originalCurrency = "CAD";
		String convertCurrency = "USD";
		String conversionRate = "1.223";
		String effectiveDate = "1/1/2001";
		BasicConfigurator.configure();
		HTTPRequests.delete();
		HTTPRequests.post(name, originalCurrency, convertCurrency, conversionRate, effectiveDate);
		SOAPRequest.soap();
		String response = HTTPRequests.get();
		StringTokenizer stringTokenizer = new StringTokenizer(response, "{:,}\"\\ ");
		String currentToken = stringTokenizer.nextToken();
		while (stringTokenizer.hasMoreTokens()) {
			currentToken = stringTokenizer.nextToken();
			if (currentToken.equals("convertCurrency")) {
				assertTrue(stringTokenizer.nextToken().equals(convertCurrency));
			} else if (currentToken.equals("effectiveDate")) {
				assertTrue(stringTokenizer.nextToken().equals(effectiveDate));
			} else if (currentToken.equals("originalCurrency")) {
				assertTrue(stringTokenizer.nextToken().equals(originalCurrency));
			} else if (currentToken.equals("conversionRate")) {
				assertTrue(stringTokenizer.nextToken().equals(conversionRate));
			} else if (currentToken.equals("name")) {
				assertTrue(stringTokenizer.nextToken().equals(name));
			} else {
				fail();
			}

		}

	}

}

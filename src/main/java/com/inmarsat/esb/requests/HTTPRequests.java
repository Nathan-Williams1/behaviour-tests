package com.inmarsat.esb.requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author nathan.williams
 *
 */
public class HTTPRequests {
	private HTTPRequests() {
	}

	private static final Logger logger = Logger.getLogger(HTTPRequests.class);

	/**
	 * Sends HTTP POST request to
	 * http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters
	 * 
	 * @param name
	 * @param originalCurrency
	 * @param convertCurrency
	 * @param conversionRate
	 * @param effectiveDate
	 */
	public static void post(String name, String originalCurrency, String convertCurrency, String conversionRate,
			String effectiveDate) {
		BasicConfigurator.configure();
		Logger.getLogger("org.apache.http").setLevel(org.apache.log4j.Level.OFF);
		String payload = "{ \"protocol\": \"http\", \"port\": 9080, \"numberOfRequests\": 0, \"name\": \"Simple CRM Service\", \"requests\": [], \"stubs\": [ { \"responses\": [ { \"is\": { \"statusCode\": 200, \"headers\": { \"Content-Type\": \"application/json\" }, \"body\": { \"status\": \"ok\" } } } ], \"predicates\": [ { \"equals\": { \"method\": \"POST\", \"path\": \"/CRMService/CurrencyConversion\", \"body\": { \"Name\": \""
				+ name + "\", \"OriginalCurrency\": \"" + originalCurrency + "\", \"ConvertCurrency\": \""
				+ convertCurrency + "\", \"ConversionRate\": \"" + conversionRate + "\", \"EffectiveDate\": \""
				+ effectiveDate
				+ "\" } } } ] } ], \"_links\": { \"self\": { \"href\": \"http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080\" } } }";
		StringEntity entity = new StringEntity(payload, ContentType.APPLICATION_FORM_URLENCODED);

		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(
				"http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters");
		request.setEntity(entity);
		try {
			httpClient.execute(request);
		} catch (ClientProtocolException e) {
			logger.error("ClientProtocolException", e);
		} catch (IOException e) {
			logger.error("IOException", e);
		}

	}

	/**
	 * Sends HTTP DELETE request to
	 * http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080
	 */
	public static void delete() {
		try {
			URL url = new URL(
					"http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080");
			HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
			httpCon.setDoOutput(true);
			httpCon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			httpCon.setRequestMethod("DELETE");
			httpCon.connect();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL Exception", e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("IO Exception", e);
			e.printStackTrace();
		}
	}

	/**
	 * Sends HTTP GET request to
	 * http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080
	 * 
	 * @return requests body
	 */
	public static String get() {
		String url = "http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080";
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				if (inputLine.equals("  \"requests\": [")) {
					while ((inputLine = in.readLine()) != "]") {
						if (inputLine.startsWith("      \"body\":")) {
							return inputLine;
						}
					}
				}
			}
			in.close();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL Exception", e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("IO Exception", e);
			e.printStackTrace();
		}
		return null;
	}

}

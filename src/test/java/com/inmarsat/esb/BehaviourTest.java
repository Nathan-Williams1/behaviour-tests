package com.inmarsat.esb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.unix4j.Unix4j;

import com.inmarsat.esb.client.EXCHANGERATE01;
import com.inmarsat.esb.client.EXCHANGERATEREQUEST;
import com.inmarsat.esb.client.HEADERINFO;
import com.inmarsat.esb.client.SAPExchangeService;
import com.inmarsat.esb.client.SAPExchangeServiceEndpoint;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC.E1EXCHANGERATE;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC.EDIDC40;

public class BehaviourTest
{
  private static final Logger logger = Logger.getLogger(BehaviourTest.class);
  
  @Test
  public void bodyTest()
  {
	BasicConfigurator.configure();
	delete();
	post();
	soap();
    get();
    File file = new File("src/test/resources/response.txt");
    String name = Unix4j.grep("Name", new File[] { file }).toStringResult();
    name = name.trim();
    Assert.assertTrue(name.equals("\"Name\": \"this\","));
    String originalCurrency = Unix4j.grep("OriginalCurrency", new File[] { file }).toStringResult();
    originalCurrency = originalCurrency.trim();
    Assert.assertTrue(originalCurrency.equals("\"OriginalCurrency\": \"CAD\","));
    String convertCurrency = Unix4j.grep("ConvertCurrency", new File[] { file }).toStringResult();
    convertCurrency = convertCurrency.trim();
    Assert.assertTrue(convertCurrency.equals("\"ConvertCurrency\": \"USD\","));
    String conversionRate = Unix4j.grep("ConversionRate", new File[] { file }).toStringResult();
    conversionRate = conversionRate.trim();
    Assert.assertTrue(conversionRate.equals("\"ConversionRate\": \"1.223\","));
    String effectiveDate = Unix4j.grep("EffectiveDate", new File[] { file }).toStringResult();
    effectiveDate = effectiveDate.trim();
    Assert.assertTrue(effectiveDate.equals("\"EffectiveDate\": \"1/1/2001\""));
  }
  
  public static void delete()
  {
    try
    {
      URL url = new URL(
        "http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080");
      HttpURLConnection httpCon = (HttpURLConnection)url.openConnection();
      httpCon.setDoOutput(true);
      httpCon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      httpCon.setRequestMethod("DELETE");
      httpCon.connect();
    }
    catch (MalformedURLException e)
    {
      logger.error("Malformed URL Exception", e);
      e.printStackTrace();
    }
    catch (IOException e)
    {
      logger.error("IO Exception", e);
      e.printStackTrace();
    }
  }
  
  public static void post()
  {
    BasicConfigurator.configure();
    String payload = "{ \"protocol\": \"http\", \"port\": 9080, \"numberOfRequests\": 0, \"name\": \"Simple CRM Service\", \"requests\": [], \"stubs\": [ { \"responses\": [ { \"is\": { \"statusCode\": 200, \"headers\": { \"Content-Type\": \"application/json\" }, \"body\": { \"status\": \"ok\" } } } ], \"predicates\": [ { \"equals\": { \"method\": \"POST\", \"path\": \"/CRMService/CurrencyConversion\", \"body\": { \"Name\": \"this\", \"OriginalCurrency\": \"CAD\", \"ConvertCurrency\": \"USD\", \"ConversionRate\": \"1.223\", \"EffectiveDate\": \"1/1/2001\" } } } ] } ], \"_links\": { \"self\": { \"href\": \"http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080\" } } }";
    StringEntity entity = new StringEntity(payload, ContentType.APPLICATION_FORM_URLENCODED);
    
    HttpClient httpClient = HttpClientBuilder.create().build();
    HttpPost request = new HttpPost(
      "http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters");
    request.setEntity(entity);
    HttpResponse response = null;
    try
    {
      response = httpClient.execute(request);
    }
    catch (ClientProtocolException e)
    {
      logger.error("ClientProtocolException", e);
    }
    catch (IOException e)
    {
      logger.error("IOException", e);
    }
    try
    {
      int responseCode = response.getStatusLine().getStatusCode();
      logger.info("POST response code: " + responseCode);
    }
    catch (NullPointerException e)
    {
      logger.error("NullPointerException", e);
    }
  }
  
  public static void get()
  {
    String url = "http://mountebank-vs-esb-virtual-services-dev.89d9.dev-inmarsat.openshiftapps.com/imposters/9080";
    try
    {
      URL obj = new URL(url);
      HttpURLConnection con = (HttpURLConnection)obj.openConnection();
      
      con.setRequestMethod("GET");
      con.setRequestProperty("Accept", "application/json");
      
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuffer response = new StringBuffer();
      String inputLine;
      while ((inputLine = in.readLine()) != null)
      {
        response.append(inputLine);
        response.append(System.getProperty("line.separator"));
      }
      in.close();
      BufferedWriter bw = null;
      FileWriter fw = null;
      
      String content = response.toString();
      
      fw = new FileWriter("src/test/resources/response.txt");
      bw = new BufferedWriter(fw);
      bw.write(content);
      if (bw != null) {
        bw.close();
      }
      if (fw != null) {
        fw.close();
      }
    }
    catch (MalformedURLException e)
    {
      logger.error("Malformed URL Exception", e);
      e.printStackTrace();
    }
    catch (IOException e)
    {
      logger.error("IO Exception", e);
      e.printStackTrace();
    }
  }
  public static void soap() {
	  SAPExchangeService sapExchangeService = new SAPExchangeService();
		SAPExchangeServiceEndpoint sapExchangeServiceEndpoint;
		sapExchangeServiceEndpoint = sapExchangeService.getSAPExchangeServicePort();
		EXCHANGERATEREQUEST exchangeRateRequest = new EXCHANGERATEREQUEST();
		HEADERINFO headerinfo = new HEADERINFO();
		headerinfo.setORIGINALSYSTEM("SAP");
		XMLGregorianCalendar calendar;
		try {
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			calendar.setYear(2001);
			calendar.setMonth(10);
			calendar.setDay(26);
			calendar.setTime(21, 32, 52);
			headerinfo.setORIGINALSTYSTEMDATETIME(calendar);
			headerinfo.setSENDERSYSTEMDATETIME(calendar);
		} catch (DatatypeConfigurationException e) {
			logger.error("Datatype Configuration Exception", e);
		}
		headerinfo.setSENDERSYSTEM("SAP");
		headerinfo.setSPAREATTR1("att1");
		headerinfo.setSPAREATTR2("att2");
		headerinfo.setSPAREATTR3("att3");
		headerinfo.setSPAREATTR4("att4");
		headerinfo.setSPAREATTR5("att5");
		exchangeRateRequest.setHEADERINFO(headerinfo);
		EXCHANGERATE01 exchangeRate01 = new EXCHANGERATE01();
		IDOC idoc = new IDOC();
		idoc.setBEGIN("1");
		EDIDC40 edidc40 = new EDIDC40();
		edidc40.setSEGMENT("1");
		edidc40.setTABNAM("EDI_DC40");
		edidc40.setMANDT("200");
		edidc40.setDOCNUM("0000000004389344");
		edidc40.setDOCREL("740");
		edidc40.setSTATUS("03");
		edidc40.setDIRECT("1");
		edidc40.setOUTMOD("2");
		edidc40.setEXPRSS("0");
		edidc40.setTEST("1");
		edidc40.setIDOCTYP("EXCHANGE_RATE01");
		edidc40.setCIMTYP("");
		edidc40.setMESTYP("EXCHANGE_RATE");
		edidc40.setMESCOD("mes");
		edidc40.setMESFCT("mes");
		edidc40.setSTD("1");
		edidc40.setSTDVRS("stdvrs");
		edidc40.setSTDMES("stdmes");
		edidc40.setSNDPOR("SAPDE1");
		edidc40.setSNDPRT("LS");
		edidc40.setSNDPFC("sn");
		edidc40.setSNDPRN("DE1CLNT200");
		edidc40.setSNDSAD("sndsad");
		edidc40.setSNDLAD("sndlad");
		edidc40.setRCVPOR("SAPDE1");
		edidc40.setRCVPRT("LS");
		edidc40.setRCVPFC("r");
		edidc40.setRCVPRN("EXECCPISV");
		edidc40.setRCVSAD("rcvsad");
		edidc40.setRCVLAD("rcvlad");
		edidc40.setCREDAT("20161211");
		edidc40.setCRETIM("133306");
		edidc40.setREFINT("refint");
		edidc40.setREFGRP("refgrp");
		edidc40.setREFMES("refmes");
		edidc40.setARCKEY("arckey");
		edidc40.setSERIAL("20161211133306");
		idoc.setEDIDC40(edidc40);
		E1EXCHANGERATE e1ExchangeRate = new E1EXCHANGERATE();
		e1ExchangeRate.setSEGMENT("1");
		e1ExchangeRate.setLOGSYSTEM("DE1CLNT200");
		e1ExchangeRate.setUPDALLOW("0");
		e1ExchangeRate.setCHGFIXED("1");
		e1ExchangeRate.setDEVALLOW("de1");
		idoc.setE1EXCHANGERATE(e1ExchangeRate);
		exchangeRate01.setIDOC(idoc);
		exchangeRateRequest.setEXCHANGERATE01(exchangeRate01);
		sapExchangeServiceEndpoint.processSAPExchangeRate(exchangeRateRequest);
  }
}

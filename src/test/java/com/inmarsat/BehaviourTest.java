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
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
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
import org.unix4j.builder.Unix4jCommandBuilder;

public class BehaviourTest
{
  private static final Logger logger = Logger.getLogger(BehaviourTest.class);
  
  @Test
  public void bodyTest()
  {
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
        String inputLine;
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
}

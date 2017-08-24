package com.inmarsat.esb.requests;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.inmarsat.esb.client.EXCHANGERATE01;
import com.inmarsat.esb.client.EXCHANGERATEREQUEST;
import com.inmarsat.esb.client.HEADERINFO;
import com.inmarsat.esb.client.ObjectFactory;
import com.inmarsat.esb.client.SAPExchangeService;
import com.inmarsat.esb.client.SAPExchangeServiceEndpoint;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC.E1EXCHANGERATE;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC.EDIDC40;
import com.inmarsat.esb.client.EXCHANGERATE01.IDOC.E1EXCHANGERATE.E1BP10930;

public class SOAPRequest {
	private SOAPRequest() {
	}

	private static final Logger logger = Logger.getLogger(SOAPRequest.class);

	/**
	 * Sends a SOAP request to collections-currency-exchange service
	 */
	public static void soap() {
		BasicConfigurator.configure();
		SAPExchangeService sapExchangeService = new SAPExchangeService();
		SAPExchangeServiceEndpoint sapExchangeServiceEndpoint;
		sapExchangeServiceEndpoint = sapExchangeService.getSAPExchangeServicePort();
		ObjectFactory objectFactory = new ObjectFactory();
		EXCHANGERATEREQUEST exchangeRateRequest = prepareExchangeRateRequest(objectFactory);
		sapExchangeServiceEndpoint.processSAPExchangeRate(exchangeRateRequest);
	}

	/**
	 * @param objectFactory
	 * @return EXCHANGERATEREQUEST
	 */
	private static EXCHANGERATEREQUEST prepareExchangeRateRequest(ObjectFactory objectFactory) {
		EXCHANGERATEREQUEST exchangeRateRequest = objectFactory.createEXCHANGERATEREQUEST();
		HEADERINFO headerinfo = prepareHeaderInfo(objectFactory);
		exchangeRateRequest.setHEADERINFO(headerinfo);
		EXCHANGERATE01 exchangeRate01 = prepareExcahngeRate01(objectFactory);
		exchangeRateRequest.setEXCHANGERATE01(exchangeRate01);
		return exchangeRateRequest;
	}

	/**
	 * @param objectFactory
	 * @return EXCHANGERATE01
	 */
	private static EXCHANGERATE01 prepareExcahngeRate01(ObjectFactory objectFactory) {
		EXCHANGERATE01 exchangeRate01 = objectFactory.createEXCHANGERATE01();
		IDOC idoc = prepareIDOC(objectFactory);
		exchangeRate01.setIDOC(idoc);
		return exchangeRate01;
	}

	/**
	 * @param objectFactory
	 * @return IDOC
	 */
	private static IDOC prepareIDOC(ObjectFactory objectFactory) {
		IDOC idoc = objectFactory.createEXCHANGERATE01IDOC();
		idoc.setBEGIN("1");
		EDIDC40 edidc40 = prepareEDIDC40(objectFactory);
		idoc.setEDIDC40(edidc40);
		E1EXCHANGERATE e1ExchangeRate = prepareE1ExchangeRate(objectFactory);
		idoc.setE1EXCHANGERATE(e1ExchangeRate);
		return idoc;
	}

	/**
	 * @param objectFactory
	 * @return E1EXCHANGERATE
	 */
	private static E1EXCHANGERATE prepareE1ExchangeRate(ObjectFactory objectFactory) {
		E1EXCHANGERATE e1ExchangeRate = objectFactory.createEXCHANGERATE01IDOCE1EXCHANGERATE();
		e1ExchangeRate.setSEGMENT("1");
		e1ExchangeRate.setLOGSYSTEM("DE1CLNT200");
		e1ExchangeRate.setUPDALLOW("0");
		e1ExchangeRate.setCHGFIXED("1");
		e1ExchangeRate.setDEVALLOW("de1");
		prepareE1BP10930(objectFactory, e1ExchangeRate);
		prepareE1BP109301(objectFactory, e1ExchangeRate);
		return e1ExchangeRate;
	}

	/**
	 * @param objectFactory
	 * @param e1ExchangeRate
	 */
	private static void prepareE1BP109301(ObjectFactory objectFactory, E1EXCHANGERATE e1ExchangeRate) {
		E1BP10930 e1bp109301 = objectFactory.createEXCHANGERATE01IDOCE1EXCHANGERATEE1BP10930();
		e1bp109301.setSEGMENT("1");
		e1bp109301.setRATETYPE("M");
		e1bp109301.setFROMCURR("AUD");
		e1bp109301.setTOCURRNCY("NOK");
		e1bp109301.setVALIDFROM("20151231");
		e1bp109301.setEXCHRATE("6.42585");
		e1bp109301.setFROMFACTOR("1");
		e1bp109301.setTOFACTOR("1");
		e1bp109301.setEXCHRATEV("0.0000");
		e1bp109301.setFROMFACTORV("0");
		e1bp109301.setTOFACTORV("7");
		e1ExchangeRate.getE1BP10930().add(e1bp109301);
	}

	/**
	 * @param objectFactory
	 * @param e1ExchangeRate
	 */
	private static void prepareE1BP10930(ObjectFactory objectFactory, E1EXCHANGERATE e1ExchangeRate) {
		E1BP10930 e1bp10930 = objectFactory.createEXCHANGERATE01IDOCE1EXCHANGERATEE1BP10930();
		e1bp10930.setSEGMENT("1");
		e1bp10930.setRATETYPE("M");
		e1bp10930.setFROMCURR("AUD");
		e1bp10930.setTOCURRNCY("NOK");
		e1bp10930.setVALIDFROM("20151231");
		e1bp10930.setEXCHRATE("6.42585");
		e1bp10930.setFROMFACTOR("1");
		e1bp10930.setTOFACTOR("1");
		e1bp10930.setEXCHRATEV("0.0000");
		e1bp10930.setFROMFACTORV("0");
		e1bp10930.setTOFACTORV("0");
		e1ExchangeRate.getE1BP10930().add(e1bp10930);
	}

	/**
	 * @param objectFactory
	 * @return EDIDC40
	 */
	private static EDIDC40 prepareEDIDC40(ObjectFactory objectFactory) {
		EDIDC40 edidc40 = objectFactory.createEXCHANGERATE01IDOCEDIDC40();
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
		return edidc40;
	}

	/**
	 * @param objectFactory
	 * @return HEADERINFO
	 */
	private static HEADERINFO prepareHeaderInfo(ObjectFactory objectFactory) {
		HEADERINFO headerinfo = objectFactory.createHEADERINFO();
		headerinfo.setORIGINALSYSTEM("SAP");
		XMLGregorianCalendar calendar;
		try {
			calendar = prepareXMLGregorianCalendar();
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
		return headerinfo;
	}

	/**
	 * @return XMLGregorianCalendar
	 * @throws DatatypeConfigurationException
	 */
	private static XMLGregorianCalendar prepareXMLGregorianCalendar() throws DatatypeConfigurationException {
		XMLGregorianCalendar calendar;
		calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();
		calendar.setYear(2001);
		calendar.setMonth(10);
		calendar.setDay(26);
		calendar.setTime(21, 32, 52);
		return calendar;
	}
}

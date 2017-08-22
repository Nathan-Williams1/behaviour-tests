
package com.inmarsat.esb.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inmarsat.esb.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _EXCHANGERATERESPONSE_QNAME = new QName("http://esb.oneitbtp.inmarsat.com/exchange_adapter", "EXCHANGE_RATE_RESPONSE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inmarsat.esb.client
     * 
     */
    public ObjectFactory() {
    	//generated method
    }

    /**
     * Create an instance of {@link EXCHANGERATE01 }
     * 
     */
    public EXCHANGERATE01 createEXCHANGERATE01() {
        return new EXCHANGERATE01();
    }

    /**
     * Create an instance of {@link EXCHANGERATERESPONSE }
     * 
     */
    public EXCHANGERATERESPONSE createEXCHANGERATERESPONSE() {
        return new EXCHANGERATERESPONSE();
    }

    /**
     * Create an instance of {@link EXCHANGERATE01 .IDOC }
     * 
     */
    public EXCHANGERATE01 .IDOC createEXCHANGERATE01IDOC() {
        return new EXCHANGERATE01 .IDOC();
    }

    /**
     * Create an instance of {@link EXCHANGERATE01 .IDOC.E1EXCHANGERATE }
     * 
     */
    public EXCHANGERATE01 .IDOC.E1EXCHANGERATE createEXCHANGERATE01IDOCE1EXCHANGERATE() {
        return new EXCHANGERATE01 .IDOC.E1EXCHANGERATE();
    }

    /**
     * Create an instance of {@link EXCHANGERATEREQUEST }
     * 
     */
    public EXCHANGERATEREQUEST createEXCHANGERATEREQUEST() {
        return new EXCHANGERATEREQUEST();
    }

    /**
     * Create an instance of {@link HEADERINFO }
     * 
     */
    public HEADERINFO createHEADERINFO() {
        return new HEADERINFO();
    }

    /**
     * Create an instance of {@link EXCHANGERATERESPONSE.ERRORDETAIL }
     * 
     */
    public EXCHANGERATERESPONSE.ERRORDETAIL createEXCHANGERATERESPONSEERRORDETAIL() {
        return new EXCHANGERATERESPONSE.ERRORDETAIL();
    }

    /**
     * Create an instance of {@link EXCHANGERATE01 .IDOC.EDIDC40 }
     * 
     */
    public EXCHANGERATE01 .IDOC.EDIDC40 createEXCHANGERATE01IDOCEDIDC40() {
        return new EXCHANGERATE01 .IDOC.EDIDC40();
    }

    /**
     * Create an instance of {@link EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930 }
     * 
     */
    public EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930 createEXCHANGERATE01IDOCE1EXCHANGERATEE1BP10930() {
        return new EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXCHANGERATERESPONSE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.oneitbtp.inmarsat.com/exchange_adapter", name = "EXCHANGE_RATE_RESPONSE")
    public JAXBElement<EXCHANGERATERESPONSE> createEXCHANGERATERESPONSE(EXCHANGERATERESPONSE value) {
    	return new JAXBElement<>(_EXCHANGERATERESPONSE_QNAME, EXCHANGERATERESPONSE.class, null, value);
    }

}

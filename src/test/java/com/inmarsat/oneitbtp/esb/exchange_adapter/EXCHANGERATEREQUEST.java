
package com.inmarsat.oneitbtp.esb.exchange_adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER_INFO" type="{http://esb.oneitbtp.inmarsat.com/exchange_adapter}HEADER_INFO"/>
 *         &lt;element ref="{http://esb.oneitbtp.inmarsat.com/exchange_adapter}EXCHANGE_RATE01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerinfo",
    "exchangerate01"
})
@XmlRootElement(name = "EXCHANGE_RATE_REQUEST")
public class EXCHANGERATEREQUEST {

    @XmlElement(name = "HEADER_INFO", namespace = "", required = true)
    protected HEADERINFO headerinfo;
    @XmlElement(name = "EXCHANGE_RATE01", required = true)
    protected EXCHANGERATE01 exchangerate01;

    /**
     * Gets the value of the headerinfo property.
     * 
     * @return
     *     possible object is
     *     {@link HEADERINFO }
     *     
     */
    public HEADERINFO getHEADERINFO() {
        return headerinfo;
    }

    /**
     * Sets the value of the headerinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERINFO }
     *     
     */
    public void setHEADERINFO(HEADERINFO value) {
        this.headerinfo = value;
    }

    /**
     * Gets the value of the exchangerate01 property.
     * 
     * @return
     *     possible object is
     *     {@link EXCHANGERATE01 }
     *     
     */
    public EXCHANGERATE01 getEXCHANGERATE01() {
        return exchangerate01;
    }

    /**
     * Sets the value of the exchangerate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXCHANGERATE01 }
     *     
     */
    public void setEXCHANGERATE01(EXCHANGERATE01 value) {
        this.exchangerate01 = value;
    }

}

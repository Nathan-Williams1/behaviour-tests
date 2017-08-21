
package com.inmarsat.esb.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXCHANGE_RATE_RESPONSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXCHANGE_RATE_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STATUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Success"/>
 *               &lt;enumeration value="Failure"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ERROR_DETAIL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXCHANGE_RATE_RESPONSE", propOrder = {
    "status",
    "errorcode",
    "errordetail"
})
public class EXCHANGERATERESPONSE {

    @XmlElement(name = "STATUS", namespace = "", required = true)
    protected String status;
    @XmlElement(name = "ERROR_CODE", namespace = "")
    protected int errorcode;
    @XmlElement(name = "ERROR_DETAIL", namespace = "")
    protected EXCHANGERATERESPONSE.ERRORDETAIL errordetail;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     */
    public int getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     */
    public void setERRORCODE(int value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the errordetail property.
     * 
     * @return
     *     possible object is
     *     {@link EXCHANGERATERESPONSE.ERRORDETAIL }
     *     
     */
    public EXCHANGERATERESPONSE.ERRORDETAIL getERRORDETAIL() {
        return errordetail;
    }

    /**
     * Sets the value of the errordetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXCHANGERATERESPONSE.ERRORDETAIL }
     *     
     */
    public void setERRORDETAIL(EXCHANGERATERESPONSE.ERRORDETAIL value) {
        this.errordetail = value;
    }


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
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "description"
    })
    public static class ERRORDETAIL {

        @XmlElement(name = "DESCRIPTION", namespace = "")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }

}

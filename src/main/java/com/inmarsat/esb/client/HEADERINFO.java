
package com.inmarsat.esb.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HEADER_INFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HEADER_INFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIGINAL_SYSTEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORIGINAL_STYSTEM_DATE_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SENDER_SYSTEM_DATE_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SENDER_SYSTEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SAP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPARE_ATTR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPARE_ATTR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPARE_ATTR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPARE_ATTR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPARE_ATTR5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HEADER_INFO", propOrder = {
    "originalsystem",
    "originalstystemdatetime",
    "sendersystemdatetime",
    "sendersystem",
    "spareattr1",
    "spareattr2",
    "spareattr3",
    "spareattr4",
    "spareattr5"
})
public class HEADERINFO {

    @XmlElement(name = "ORIGINAL_SYSTEM", namespace = "")
    protected String originalsystem;
    @XmlElement(name = "ORIGINAL_STYSTEM_DATE_TIME", namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalstystemdatetime;
    @XmlElement(name = "SENDER_SYSTEM_DATE_TIME", namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendersystemdatetime;
    @XmlElement(name = "SENDER_SYSTEM", namespace = "")
    protected String sendersystem;
    @XmlElement(name = "SPARE_ATTR1", namespace = "")
    protected String spareattr1;
    @XmlElement(name = "SPARE_ATTR2", namespace = "")
    protected String spareattr2;
    @XmlElement(name = "SPARE_ATTR3", namespace = "")
    protected String spareattr3;
    @XmlElement(name = "SPARE_ATTR4", namespace = "")
    protected String spareattr4;
    @XmlElement(name = "SPARE_ATTR5", namespace = "")
    protected String spareattr5;

    /**
     * Gets the value of the originalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINALSYSTEM() {
        return originalsystem;
    }

    /**
     * Sets the value of the originalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINALSYSTEM(String value) {
        this.originalsystem = value;
    }

    /**
     * Gets the value of the originalstystemdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getORIGINALSTYSTEMDATETIME() {
        return originalstystemdatetime;
    }

    /**
     * Sets the value of the originalstystemdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setORIGINALSTYSTEMDATETIME(XMLGregorianCalendar value) {
        this.originalstystemdatetime = value;
    }

    /**
     * Gets the value of the sendersystemdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSENDERSYSTEMDATETIME() {
        return sendersystemdatetime;
    }

    /**
     * Sets the value of the sendersystemdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSENDERSYSTEMDATETIME(XMLGregorianCalendar value) {
        this.sendersystemdatetime = value;
    }

    /**
     * Gets the value of the sendersystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERSYSTEM() {
        return sendersystem;
    }

    /**
     * Sets the value of the sendersystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERSYSTEM(String value) {
        this.sendersystem = value;
    }

    /**
     * Gets the value of the spareattr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAREATTR1() {
        return spareattr1;
    }

    /**
     * Sets the value of the spareattr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAREATTR1(String value) {
        this.spareattr1 = value;
    }

    /**
     * Gets the value of the spareattr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAREATTR2() {
        return spareattr2;
    }

    /**
     * Sets the value of the spareattr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAREATTR2(String value) {
        this.spareattr2 = value;
    }

    /**
     * Gets the value of the spareattr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAREATTR3() {
        return spareattr3;
    }

    /**
     * Sets the value of the spareattr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAREATTR3(String value) {
        this.spareattr3 = value;
    }

    /**
     * Gets the value of the spareattr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAREATTR4() {
        return spareattr4;
    }

    /**
     * Sets the value of the spareattr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAREATTR4(String value) {
        this.spareattr4 = value;
    }

    /**
     * Gets the value of the spareattr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAREATTR5() {
        return spareattr5;
    }

    /**
     * Sets the value of the spareattr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAREATTR5(String value) {
        this.spareattr5 = value;
    }

}

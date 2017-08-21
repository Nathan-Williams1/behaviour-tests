
package com.inmarsat.esb.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="IDOC">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EDI_DC40">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TABNAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MANDT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DOCNUM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="16"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DOCREL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STATUS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DIRECT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OUTMOD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EXPRSS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TEST" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="IDOCTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CIMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MESTYP" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MESCOD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MESFCT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STDVRS" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STDMES" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SNDPOR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SNDPRT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SNDPFC" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SNDPRN">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SNDSAD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="21"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SNDLAD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RCVPOR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RCVPRT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RCVPFC" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RCVPRN">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RCVSAD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="21"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RCVLAD" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CREDAT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CRETIM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="REFINT" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="REFGRP" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="REFMES" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ARCKEY" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SERIAL" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SEGMENT" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="E1EXCHANGE_RATE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LOG_SYSTEM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UPD_ALLOW" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CHG_FIXED" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DEV_ALLOW" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="E1BP1093_0" maxOccurs="999999" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RATE_TYPE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FROM_CURR" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TO_CURRNCY" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="VALID_FROM" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="8"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EXCH_RATE" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FROM_FACTOR" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TO_FACTOR" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EXCH_RATE_V" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FROM_FACTOR_V" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TO_FACTOR_V" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="SEGMENT" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SEGMENT" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BEGIN" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "", propOrder = {
    "idoc"
})
@XmlRootElement(name = "EXCHANGE_RATE01")
public class EXCHANGERATE01 {

    @XmlElement(name = "IDOC", required = true)
    protected EXCHANGERATE01 .IDOC idoc;

    /**
     * Gets the value of the idoc property.
     * 
     * @return
     *     possible object is
     *     {@link EXCHANGERATE01 .IDOC }
     *     
     */
    public EXCHANGERATE01 .IDOC getIDOC() {
        return idoc;
    }

    /**
     * Sets the value of the idoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXCHANGERATE01 .IDOC }
     *     
     */
    public void setIDOC(EXCHANGERATE01 .IDOC value) {
        this.idoc = value;
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
     *         &lt;element name="EDI_DC40">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TABNAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MANDT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DOCNUM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="16"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DOCREL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STATUS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DIRECT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OUTMOD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EXPRSS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TEST" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="IDOCTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CIMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MESTYP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MESCOD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MESFCT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STDVRS" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STDMES" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SNDPOR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SNDPRT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SNDPFC" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SNDPRN">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SNDSAD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="21"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SNDLAD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RCVPOR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RCVPRT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RCVPFC" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RCVPRN">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RCVSAD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="21"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RCVLAD" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CREDAT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CRETIM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="REFINT" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="REFGRP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="REFMES" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ARCKEY" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SERIAL" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SEGMENT" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="E1EXCHANGE_RATE" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LOG_SYSTEM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UPD_ALLOW" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CHG_FIXED" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DEV_ALLOW" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="E1BP1093_0" maxOccurs="999999" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RATE_TYPE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FROM_CURR" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TO_CURRNCY" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="VALID_FROM" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="8"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EXCH_RATE" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FROM_FACTOR" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TO_FACTOR" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EXCH_RATE_V" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FROM_FACTOR_V" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TO_FACTOR_V" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="SEGMENT" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SEGMENT" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BEGIN" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "edidc40",
        "e1EXCHANGERATE"
    })
    public static class IDOC {

        @XmlElement(name = "EDI_DC40", required = true)
        protected EXCHANGERATE01 .IDOC.EDIDC40 edidc40;
        @XmlElement(name = "E1EXCHANGE_RATE")
        protected EXCHANGERATE01 .IDOC.E1EXCHANGERATE e1EXCHANGERATE;
        @XmlAttribute(name = "BEGIN", required = true)
        protected String begin;

        /**
         * Gets the value of the edidc40 property.
         * 
         * @return
         *     possible object is
         *     {@link EXCHANGERATE01 .IDOC.EDIDC40 }
         *     
         */
        public EXCHANGERATE01 .IDOC.EDIDC40 getEDIDC40() {
            return edidc40;
        }

        /**
         * Sets the value of the edidc40 property.
         * 
         * @param value
         *     allowed object is
         *     {@link EXCHANGERATE01 .IDOC.EDIDC40 }
         *     
         */
        public void setEDIDC40(EXCHANGERATE01 .IDOC.EDIDC40 value) {
            this.edidc40 = value;
        }

        /**
         * Gets the value of the e1EXCHANGERATE property.
         * 
         * @return
         *     possible object is
         *     {@link EXCHANGERATE01 .IDOC.E1EXCHANGERATE }
         *     
         */
        public EXCHANGERATE01 .IDOC.E1EXCHANGERATE getE1EXCHANGERATE() {
            return e1EXCHANGERATE;
        }

        /**
         * Sets the value of the e1EXCHANGERATE property.
         * 
         * @param value
         *     allowed object is
         *     {@link EXCHANGERATE01 .IDOC.E1EXCHANGERATE }
         *     
         */
        public void setE1EXCHANGERATE(EXCHANGERATE01 .IDOC.E1EXCHANGERATE value) {
            this.e1EXCHANGERATE = value;
        }

        /**
         * Gets the value of the begin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBEGIN() {
            return begin;
        }

        /**
         * Sets the value of the begin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBEGIN(String value) {
            this.begin = value;
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
         *         &lt;element name="LOG_SYSTEM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UPD_ALLOW" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CHG_FIXED" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DEV_ALLOW" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="E1BP1093_0" maxOccurs="999999" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RATE_TYPE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FROM_CURR" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TO_CURRNCY" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="VALID_FROM" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="8"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EXCH_RATE" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FROM_FACTOR" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TO_FACTOR" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EXCH_RATE_V" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FROM_FACTOR_V" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TO_FACTOR_V" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="SEGMENT" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SEGMENT" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "logsystem",
            "updallow",
            "chgfixed",
            "devallow",
            "e1BP10930"
        })
        public static class E1EXCHANGERATE {

            @XmlElement(name = "LOG_SYSTEM")
            protected String logsystem;
            @XmlElement(name = "UPD_ALLOW")
            protected String updallow;
            @XmlElement(name = "CHG_FIXED")
            protected String chgfixed;
            @XmlElement(name = "DEV_ALLOW")
            protected String devallow;
            @XmlElement(name = "E1BP1093_0")
            protected List<EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930> e1BP10930;
            @XmlAttribute(name = "SEGMENT", required = true)
            protected String segment;

            /**
             * Gets the value of the logsystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOGSYSTEM() {
                return logsystem;
            }

            /**
             * Sets the value of the logsystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOGSYSTEM(String value) {
                this.logsystem = value;
            }

            /**
             * Gets the value of the updallow property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUPDALLOW() {
                return updallow;
            }

            /**
             * Sets the value of the updallow property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUPDALLOW(String value) {
                this.updallow = value;
            }

            /**
             * Gets the value of the chgfixed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGFIXED() {
                return chgfixed;
            }

            /**
             * Sets the value of the chgfixed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGFIXED(String value) {
                this.chgfixed = value;
            }

            /**
             * Gets the value of the devallow property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEVALLOW() {
                return devallow;
            }

            /**
             * Sets the value of the devallow property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEVALLOW(String value) {
                this.devallow = value;
            }

            /**
             * Gets the value of the e1BP10930 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the e1BP10930 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getE1BP10930().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930 }
             * 
             * 
             */
            public List<EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930> getE1BP10930() {
                if (e1BP10930 == null) {
                    e1BP10930 = new ArrayList<EXCHANGERATE01 .IDOC.E1EXCHANGERATE.E1BP10930>();
                }
                return this.e1BP10930;
            }

            /**
             * Gets the value of the segment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEGMENT() {
                return segment;
            }

            /**
             * Sets the value of the segment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEGMENT(String value) {
                this.segment = value;
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
             *         &lt;element name="RATE_TYPE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FROM_CURR" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TO_CURRNCY" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="VALID_FROM" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="8"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EXCH_RATE" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FROM_FACTOR" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TO_FACTOR" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EXCH_RATE_V" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FROM_FACTOR_V" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TO_FACTOR_V" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="10"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="SEGMENT" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ratetype",
                "fromcurr",
                "tocurrncy",
                "validfrom",
                "exchrate",
                "fromfactor",
                "tofactor",
                "exchratev",
                "fromfactorv",
                "tofactorv"
            })
            public static class E1BP10930 {

                @XmlElement(name = "RATE_TYPE")
                protected String ratetype;
                @XmlElement(name = "FROM_CURR")
                protected String fromcurr;
                @XmlElement(name = "TO_CURRNCY")
                protected String tocurrncy;
                @XmlElement(name = "VALID_FROM")
                protected String validfrom;
                @XmlElement(name = "EXCH_RATE")
                protected String exchrate;
                @XmlElement(name = "FROM_FACTOR")
                protected String fromfactor;
                @XmlElement(name = "TO_FACTOR")
                protected String tofactor;
                @XmlElement(name = "EXCH_RATE_V")
                protected String exchratev;
                @XmlElement(name = "FROM_FACTOR_V")
                protected String fromfactorv;
                @XmlElement(name = "TO_FACTOR_V")
                protected String tofactorv;
                @XmlAttribute(name = "SEGMENT", required = true)
                protected String segment;

                /**
                 * Gets the value of the ratetype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRATETYPE() {
                    return ratetype;
                }

                /**
                 * Sets the value of the ratetype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRATETYPE(String value) {
                    this.ratetype = value;
                }

                /**
                 * Gets the value of the fromcurr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFROMCURR() {
                    return fromcurr;
                }

                /**
                 * Sets the value of the fromcurr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFROMCURR(String value) {
                    this.fromcurr = value;
                }

                /**
                 * Gets the value of the tocurrncy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTOCURRNCY() {
                    return tocurrncy;
                }

                /**
                 * Sets the value of the tocurrncy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTOCURRNCY(String value) {
                    this.tocurrncy = value;
                }

                /**
                 * Gets the value of the validfrom property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVALIDFROM() {
                    return validfrom;
                }

                /**
                 * Sets the value of the validfrom property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVALIDFROM(String value) {
                    this.validfrom = value;
                }

                /**
                 * Gets the value of the exchrate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEXCHRATE() {
                    return exchrate;
                }

                /**
                 * Sets the value of the exchrate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEXCHRATE(String value) {
                    this.exchrate = value;
                }

                /**
                 * Gets the value of the fromfactor property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFROMFACTOR() {
                    return fromfactor;
                }

                /**
                 * Sets the value of the fromfactor property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFROMFACTOR(String value) {
                    this.fromfactor = value;
                }

                /**
                 * Gets the value of the tofactor property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTOFACTOR() {
                    return tofactor;
                }

                /**
                 * Sets the value of the tofactor property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTOFACTOR(String value) {
                    this.tofactor = value;
                }

                /**
                 * Gets the value of the exchratev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEXCHRATEV() {
                    return exchratev;
                }

                /**
                 * Sets the value of the exchratev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEXCHRATEV(String value) {
                    this.exchratev = value;
                }

                /**
                 * Gets the value of the fromfactorv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFROMFACTORV() {
                    return fromfactorv;
                }

                /**
                 * Sets the value of the fromfactorv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFROMFACTORV(String value) {
                    this.fromfactorv = value;
                }

                /**
                 * Gets the value of the tofactorv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTOFACTORV() {
                    return tofactorv;
                }

                /**
                 * Sets the value of the tofactorv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTOFACTORV(String value) {
                    this.tofactorv = value;
                }

                /**
                 * Gets the value of the segment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSEGMENT() {
                    return segment;
                }

                /**
                 * Sets the value of the segment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSEGMENT(String value) {
                    this.segment = value;
                }

            }

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
         *         &lt;element name="TABNAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MANDT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DOCNUM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="16"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DOCREL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STATUS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DIRECT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OUTMOD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EXPRSS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TEST" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="IDOCTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CIMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MESTYP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MESCOD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MESFCT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STDVRS" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STDMES" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SNDPOR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SNDPRT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SNDPFC" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SNDPRN">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SNDSAD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="21"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SNDLAD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RCVPOR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RCVPRT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RCVPFC" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RCVPRN">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RCVSAD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="21"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RCVLAD" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CREDAT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CRETIM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="REFINT" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="REFGRP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="REFMES" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ARCKEY" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SERIAL" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SEGMENT" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tabnam",
            "mandt",
            "docnum",
            "docrel",
            "status",
            "direct",
            "outmod",
            "exprss",
            "test",
            "idoctyp",
            "cimtyp",
            "mestyp",
            "mescod",
            "mesfct",
            "std",
            "stdvrs",
            "stdmes",
            "sndpor",
            "sndprt",
            "sndpfc",
            "sndprn",
            "sndsad",
            "sndlad",
            "rcvpor",
            "rcvprt",
            "rcvpfc",
            "rcvprn",
            "rcvsad",
            "rcvlad",
            "credat",
            "cretim",
            "refint",
            "refgrp",
            "refmes",
            "arckey",
            "serial"
        })
        public static class EDIDC40 {

            @XmlElement(name = "TABNAM", required = true)
            protected String tabnam;
            @XmlElement(name = "MANDT")
            protected String mandt;
            @XmlElement(name = "DOCNUM")
            protected String docnum;
            @XmlElement(name = "DOCREL")
            protected String docrel;
            @XmlElement(name = "STATUS")
            protected String status;
            @XmlElement(name = "DIRECT", required = true)
            protected String direct;
            @XmlElement(name = "OUTMOD")
            protected String outmod;
            @XmlElement(name = "EXPRSS")
            protected String exprss;
            @XmlElement(name = "TEST")
            protected String test;
            @XmlElement(name = "IDOCTYP", required = true)
            protected String idoctyp;
            @XmlElement(name = "CIMTYP")
            protected String cimtyp;
            @XmlElement(name = "MESTYP")
            protected String mestyp;
            @XmlElement(name = "MESCOD")
            protected String mescod;
            @XmlElement(name = "MESFCT")
            protected String mesfct;
            @XmlElement(name = "STD")
            protected String std;
            @XmlElement(name = "STDVRS")
            protected String stdvrs;
            @XmlElement(name = "STDMES")
            protected String stdmes;
            @XmlElement(name = "SNDPOR", required = true)
            protected String sndpor;
            @XmlElement(name = "SNDPRT", required = true)
            protected String sndprt;
            @XmlElement(name = "SNDPFC")
            protected String sndpfc;
            @XmlElement(name = "SNDPRN", required = true)
            protected String sndprn;
            @XmlElement(name = "SNDSAD")
            protected String sndsad;
            @XmlElement(name = "SNDLAD")
            protected String sndlad;
            @XmlElement(name = "RCVPOR", required = true)
            protected String rcvpor;
            @XmlElement(name = "RCVPRT")
            protected String rcvprt;
            @XmlElement(name = "RCVPFC")
            protected String rcvpfc;
            @XmlElement(name = "RCVPRN", required = true)
            protected String rcvprn;
            @XmlElement(name = "RCVSAD")
            protected String rcvsad;
            @XmlElement(name = "RCVLAD")
            protected String rcvlad;
            @XmlElement(name = "CREDAT")
            protected String credat;
            @XmlElement(name = "CRETIM")
            protected String cretim;
            @XmlElement(name = "REFINT")
            protected String refint;
            @XmlElement(name = "REFGRP")
            protected String refgrp;
            @XmlElement(name = "REFMES")
            protected String refmes;
            @XmlElement(name = "ARCKEY")
            protected String arckey;
            @XmlElement(name = "SERIAL")
            protected String serial;
            @XmlAttribute(name = "SEGMENT", required = true)
            protected String segment;

            /**
             * Gets the value of the tabnam property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTABNAM() {
                return tabnam;
            }

            /**
             * Sets the value of the tabnam property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTABNAM(String value) {
                this.tabnam = value;
            }

            /**
             * Gets the value of the mandt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMANDT() {
                return mandt;
            }

            /**
             * Sets the value of the mandt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMANDT(String value) {
                this.mandt = value;
            }

            /**
             * Gets the value of the docnum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCNUM() {
                return docnum;
            }

            /**
             * Sets the value of the docnum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCNUM(String value) {
                this.docnum = value;
            }

            /**
             * Gets the value of the docrel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCREL() {
                return docrel;
            }

            /**
             * Sets the value of the docrel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCREL(String value) {
                this.docrel = value;
            }

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
             * Gets the value of the direct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIRECT() {
                return direct;
            }

            /**
             * Sets the value of the direct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIRECT(String value) {
                this.direct = value;
            }

            /**
             * Gets the value of the outmod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOUTMOD() {
                return outmod;
            }

            /**
             * Sets the value of the outmod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOUTMOD(String value) {
                this.outmod = value;
            }

            /**
             * Gets the value of the exprss property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXPRSS() {
                return exprss;
            }

            /**
             * Sets the value of the exprss property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXPRSS(String value) {
                this.exprss = value;
            }

            /**
             * Gets the value of the test property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTEST() {
                return test;
            }

            /**
             * Sets the value of the test property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTEST(String value) {
                this.test = value;
            }

            /**
             * Gets the value of the idoctyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDOCTYP() {
                return idoctyp;
            }

            /**
             * Sets the value of the idoctyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDOCTYP(String value) {
                this.idoctyp = value;
            }

            /**
             * Gets the value of the cimtyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCIMTYP() {
                return cimtyp;
            }

            /**
             * Sets the value of the cimtyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCIMTYP(String value) {
                this.cimtyp = value;
            }

            /**
             * Gets the value of the mestyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESTYP() {
                return mestyp;
            }

            /**
             * Sets the value of the mestyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESTYP(String value) {
                this.mestyp = value;
            }

            /**
             * Gets the value of the mescod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESCOD() {
                return mescod;
            }

            /**
             * Sets the value of the mescod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESCOD(String value) {
                this.mescod = value;
            }

            /**
             * Gets the value of the mesfct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESFCT() {
                return mesfct;
            }

            /**
             * Sets the value of the mesfct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESFCT(String value) {
                this.mesfct = value;
            }

            /**
             * Gets the value of the std property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTD() {
                return std;
            }

            /**
             * Sets the value of the std property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTD(String value) {
                this.std = value;
            }

            /**
             * Gets the value of the stdvrs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTDVRS() {
                return stdvrs;
            }

            /**
             * Sets the value of the stdvrs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTDVRS(String value) {
                this.stdvrs = value;
            }

            /**
             * Gets the value of the stdmes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTDMES() {
                return stdmes;
            }

            /**
             * Sets the value of the stdmes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTDMES(String value) {
                this.stdmes = value;
            }

            /**
             * Gets the value of the sndpor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDPOR() {
                return sndpor;
            }

            /**
             * Sets the value of the sndpor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDPOR(String value) {
                this.sndpor = value;
            }

            /**
             * Gets the value of the sndprt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDPRT() {
                return sndprt;
            }

            /**
             * Sets the value of the sndprt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDPRT(String value) {
                this.sndprt = value;
            }

            /**
             * Gets the value of the sndpfc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDPFC() {
                return sndpfc;
            }

            /**
             * Sets the value of the sndpfc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDPFC(String value) {
                this.sndpfc = value;
            }

            /**
             * Gets the value of the sndprn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDPRN() {
                return sndprn;
            }

            /**
             * Sets the value of the sndprn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDPRN(String value) {
                this.sndprn = value;
            }

            /**
             * Gets the value of the sndsad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDSAD() {
                return sndsad;
            }

            /**
             * Sets the value of the sndsad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDSAD(String value) {
                this.sndsad = value;
            }

            /**
             * Gets the value of the sndlad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDLAD() {
                return sndlad;
            }

            /**
             * Sets the value of the sndlad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDLAD(String value) {
                this.sndlad = value;
            }

            /**
             * Gets the value of the rcvpor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVPOR() {
                return rcvpor;
            }

            /**
             * Sets the value of the rcvpor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVPOR(String value) {
                this.rcvpor = value;
            }

            /**
             * Gets the value of the rcvprt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVPRT() {
                return rcvprt;
            }

            /**
             * Sets the value of the rcvprt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVPRT(String value) {
                this.rcvprt = value;
            }

            /**
             * Gets the value of the rcvpfc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVPFC() {
                return rcvpfc;
            }

            /**
             * Sets the value of the rcvpfc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVPFC(String value) {
                this.rcvpfc = value;
            }

            /**
             * Gets the value of the rcvprn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVPRN() {
                return rcvprn;
            }

            /**
             * Sets the value of the rcvprn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVPRN(String value) {
                this.rcvprn = value;
            }

            /**
             * Gets the value of the rcvsad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVSAD() {
                return rcvsad;
            }

            /**
             * Sets the value of the rcvsad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVSAD(String value) {
                this.rcvsad = value;
            }

            /**
             * Gets the value of the rcvlad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVLAD() {
                return rcvlad;
            }

            /**
             * Sets the value of the rcvlad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVLAD(String value) {
                this.rcvlad = value;
            }

            /**
             * Gets the value of the credat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCREDAT() {
                return credat;
            }

            /**
             * Sets the value of the credat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCREDAT(String value) {
                this.credat = value;
            }

            /**
             * Gets the value of the cretim property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRETIM() {
                return cretim;
            }

            /**
             * Sets the value of the cretim property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRETIM(String value) {
                this.cretim = value;
            }

            /**
             * Gets the value of the refint property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFINT() {
                return refint;
            }

            /**
             * Sets the value of the refint property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFINT(String value) {
                this.refint = value;
            }

            /**
             * Gets the value of the refgrp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFGRP() {
                return refgrp;
            }

            /**
             * Sets the value of the refgrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFGRP(String value) {
                this.refgrp = value;
            }

            /**
             * Gets the value of the refmes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFMES() {
                return refmes;
            }

            /**
             * Sets the value of the refmes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFMES(String value) {
                this.refmes = value;
            }

            /**
             * Gets the value of the arckey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getARCKEY() {
                return arckey;
            }

            /**
             * Sets the value of the arckey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setARCKEY(String value) {
                this.arckey = value;
            }

            /**
             * Gets the value of the serial property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERIAL() {
                return serial;
            }

            /**
             * Sets the value of the serial property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERIAL(String value) {
                this.serial = value;
            }

            /**
             * Gets the value of the segment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEGMENT() {
                return segment;
            }

            /**
             * Sets the value of the segment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEGMENT(String value) {
                this.segment = value;
            }

        }

    }

}

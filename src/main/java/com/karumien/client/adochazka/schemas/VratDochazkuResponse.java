//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 01:23:44 PM CET 
//


package com.karumien.client.adochazka.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VratDochazkuResult" type="{http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer}CustomerDataDochazka" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vratDochazkuResult"
})
@XmlRootElement(name = "VratDochazkuResponse", namespace = "http://schemas.holypos.com/holyattendance")
public class VratDochazkuResponse {

    @XmlElementRef(name = "VratDochazkuResult", namespace = "http://schemas.holypos.com/holyattendance", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerDataDochazka> vratDochazkuResult;

    /**
     * Gets the value of the vratDochazkuResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerDataDochazka }{@code >}
     *     
     */
    public JAXBElement<CustomerDataDochazka> getVratDochazkuResult() {
        return vratDochazkuResult;
    }

    /**
     * Sets the value of the vratDochazkuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerDataDochazka }{@code >}
     *     
     */
    public void setVratDochazkuResult(JAXBElement<CustomerDataDochazka> value) {
        this.vratDochazkuResult = value;
    }

}

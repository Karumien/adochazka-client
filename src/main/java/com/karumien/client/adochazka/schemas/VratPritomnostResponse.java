//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.03 at 09:09:30 AM CET 
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
 *         &lt;element name="VratPritomnostResult" type="{http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer}CustomerDataPritomnost" minOccurs="0"/&gt;
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
    "vratPritomnostResult"
})
@XmlRootElement(name = "VratPritomnostResponse", namespace = "http://schemas.holypos.com/holyattendance")
public class VratPritomnostResponse {

    @XmlElementRef(name = "VratPritomnostResult", namespace = "http://schemas.holypos.com/holyattendance", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerDataPritomnost> vratPritomnostResult;

    /**
     * Gets the value of the vratPritomnostResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerDataPritomnost }{@code >}
     *     
     */
    public JAXBElement<CustomerDataPritomnost> getVratPritomnostResult() {
        return vratPritomnostResult;
    }

    /**
     * Sets the value of the vratPritomnostResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerDataPritomnost }{@code >}
     *     
     */
    public void setVratPritomnostResult(JAXBElement<CustomerDataPritomnost> value) {
        this.vratPritomnostResult = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.08 at 07:44:31 PM CEST 
//


package com.karumien.client.adochazka.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDataUzivatele complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDataUzivatele"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uzivatele" type="{http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer}ArrayOfUzivatel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDataUzivatele", propOrder = {
    "uzivatele"
})
public class CustomerDataUzivatele {

    @XmlElementRef(name = "Uzivatele", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUzivatel> uzivatele;

    /**
     * Gets the value of the uzivatele property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUzivatel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUzivatel> getUzivatele() {
        return uzivatele;
    }

    /**
     * Sets the value of the uzivatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUzivatel }{@code >}
     *     
     */
    public void setUzivatele(JAXBElement<ArrayOfUzivatel> value) {
        this.uzivatele = value;
    }

}

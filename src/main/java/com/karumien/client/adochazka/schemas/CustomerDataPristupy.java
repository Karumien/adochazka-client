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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDataPristupy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDataPristupy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pristupy" type="{http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer}ArrayOfPristup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDataPristupy", propOrder = {
    "pristupy"
})
public class CustomerDataPristupy {

    @XmlElementRef(name = "Pristupy", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPristup> pristupy;

    /**
     * Gets the value of the pristupy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPristup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPristup> getPristupy() {
        return pristupy;
    }

    /**
     * Sets the value of the pristupy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPristup }{@code >}
     *     
     */
    public void setPristupy(JAXBElement<ArrayOfPristup> value) {
        this.pristupy = value;
    }

}

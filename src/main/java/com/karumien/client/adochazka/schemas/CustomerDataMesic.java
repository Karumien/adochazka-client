//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.12 at 12:20:30 PM CET 
//


package com.karumien.client.adochazka.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDataMesic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDataMesic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerDataDen" type="{http://schemas.datacontract.org/2004/07/HolyAttendanceWS.WS.Customer}ArrayOfCustomerDataDen" minOccurs="0"/&gt;
 *         &lt;element name="Mesic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rok" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UzivatelCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UzivatelJmeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UzivatelPrijmeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDataMesic", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceWS.WS.Customer", propOrder = {
    "customerDataDen",
    "mesic",
    "rok",
    "uzivatelCislo",
    "uzivatelJmeno",
    "uzivatelPrijmeni"
})
public class CustomerDataMesic {

    @XmlElementRef(name = "CustomerDataDen", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceWS.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerDataDen> customerDataDen;
    @XmlElement(name = "Mesic")
    protected Integer mesic;
    @XmlElement(name = "Rok")
    protected Integer rok;
    @XmlElementRef(name = "UzivatelCislo", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceWS.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uzivatelCislo;
    @XmlElementRef(name = "UzivatelJmeno", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceWS.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uzivatelJmeno;
    @XmlElementRef(name = "UzivatelPrijmeni", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendanceWS.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uzivatelPrijmeni;

    /**
     * Gets the value of the customerDataDen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerDataDen }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerDataDen> getCustomerDataDen() {
        return customerDataDen;
    }

    /**
     * Sets the value of the customerDataDen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerDataDen }{@code >}
     *     
     */
    public void setCustomerDataDen(JAXBElement<ArrayOfCustomerDataDen> value) {
        this.customerDataDen = value;
    }

    /**
     * Gets the value of the mesic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesic() {
        return mesic;
    }

    /**
     * Sets the value of the mesic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesic(Integer value) {
        this.mesic = value;
    }

    /**
     * Gets the value of the rok property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRok() {
        return rok;
    }

    /**
     * Sets the value of the rok property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRok(Integer value) {
        this.rok = value;
    }

    /**
     * Gets the value of the uzivatelCislo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUzivatelCislo() {
        return uzivatelCislo;
    }

    /**
     * Sets the value of the uzivatelCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUzivatelCislo(JAXBElement<String> value) {
        this.uzivatelCislo = value;
    }

    /**
     * Gets the value of the uzivatelJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUzivatelJmeno() {
        return uzivatelJmeno;
    }

    /**
     * Sets the value of the uzivatelJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUzivatelJmeno(JAXBElement<String> value) {
        this.uzivatelJmeno = value;
    }

    /**
     * Gets the value of the uzivatelPrijmeni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUzivatelPrijmeni() {
        return uzivatelPrijmeni;
    }

    /**
     * Sets the value of the uzivatelPrijmeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUzivatelPrijmeni(JAXBElement<String> value) {
        this.uzivatelPrijmeni = value;
    }

}

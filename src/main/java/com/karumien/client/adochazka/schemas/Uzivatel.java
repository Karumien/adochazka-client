//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.03 at 09:09:30 AM CET 
//


package com.karumien.client.adochazka.schemas;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Uzivatel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Uzivatel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Aktivni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Cislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatumNarozeni" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Heslo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HodinovaSazba" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Jmeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Karta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kategorie" type="{http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer}ArrayOfKategorie" minOccurs="0"/&gt;
 *         &lt;element name="Oddeleni" type="{http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer}ArrayOfOddeleni" minOccurs="0"/&gt;
 *         &lt;element name="Prijmeni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypUzivatele" type="{http://schemas.datacontract.org/2004/07/HolyAttendanceCore.Models}TypUzivatele" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Uzivatel", propOrder = {
    "aktivni",
    "cislo",
    "datumNarozeni",
    "eMail",
    "heslo",
    "hodinovaSazba",
    "id",
    "jmeno",
    "karta",
    "kategorie",
    "oddeleni",
    "prijmeni",
    "telefon",
    "typUzivatele"
})
public class Uzivatel {

    @XmlElement(name = "Aktivni")
    protected Boolean aktivni;
    @XmlElementRef(name = "Cislo", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cislo;
    @XmlElementRef(name = "DatumNarozeni", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datumNarozeni;
    @XmlElementRef(name = "EMail", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eMail;
    @XmlElementRef(name = "Heslo", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> heslo;
    @XmlElementRef(name = "HodinovaSazba", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hodinovaSazba;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Jmeno", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jmeno;
    @XmlElementRef(name = "Karta", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> karta;
    @XmlElementRef(name = "Kategorie", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKategorie> kategorie;
    @XmlElementRef(name = "Oddeleni", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOddeleni> oddeleni;
    @XmlElementRef(name = "Prijmeni", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prijmeni;
    @XmlElementRef(name = "Telefon", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefon;
    @XmlElementRef(name = "TypUzivatele", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<TypUzivatele> typUzivatele;

    /**
     * Gets the value of the aktivni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAktivni() {
        return aktivni;
    }

    /**
     * Sets the value of the aktivni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAktivni(Boolean value) {
        this.aktivni = value;
    }

    /**
     * Gets the value of the cislo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCislo() {
        return cislo;
    }

    /**
     * Sets the value of the cislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCislo(JAXBElement<String> value) {
        this.cislo = value;
    }

    /**
     * Gets the value of the datumNarozeni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatumNarozeni() {
        return datumNarozeni;
    }

    /**
     * Sets the value of the datumNarozeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatumNarozeni(JAXBElement<XMLGregorianCalendar> value) {
        this.datumNarozeni = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMail(JAXBElement<String> value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the heslo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeslo() {
        return heslo;
    }

    /**
     * Sets the value of the heslo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeslo(JAXBElement<String> value) {
        this.heslo = value;
    }

    /**
     * Gets the value of the hodinovaSazba property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHodinovaSazba() {
        return hodinovaSazba;
    }

    /**
     * Sets the value of the hodinovaSazba property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHodinovaSazba(JAXBElement<BigDecimal> value) {
        this.hodinovaSazba = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the jmeno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJmeno() {
        return jmeno;
    }

    /**
     * Sets the value of the jmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJmeno(JAXBElement<String> value) {
        this.jmeno = value;
    }

    /**
     * Gets the value of the karta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKarta() {
        return karta;
    }

    /**
     * Sets the value of the karta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKarta(JAXBElement<String> value) {
        this.karta = value;
    }

    /**
     * Gets the value of the kategorie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKategorie }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKategorie> getKategorie() {
        return kategorie;
    }

    /**
     * Sets the value of the kategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKategorie }{@code >}
     *     
     */
    public void setKategorie(JAXBElement<ArrayOfKategorie> value) {
        this.kategorie = value;
    }

    /**
     * Gets the value of the oddeleni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOddeleni }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOddeleni> getOddeleni() {
        return oddeleni;
    }

    /**
     * Sets the value of the oddeleni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOddeleni }{@code >}
     *     
     */
    public void setOddeleni(JAXBElement<ArrayOfOddeleni> value) {
        this.oddeleni = value;
    }

    /**
     * Gets the value of the prijmeni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrijmeni() {
        return prijmeni;
    }

    /**
     * Sets the value of the prijmeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrijmeni(JAXBElement<String> value) {
        this.prijmeni = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefon(JAXBElement<String> value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the typUzivatele property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TypUzivatele }{@code >}
     *     
     */
    public JAXBElement<TypUzivatele> getTypUzivatele() {
        return typUzivatele;
    }

    /**
     * Sets the value of the typUzivatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypUzivatele }{@code >}
     *     
     */
    public void setTypUzivatele(JAXBElement<TypUzivatele> value) {
        this.typUzivatele = value;
    }

}

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dochazka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dochazka"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatumOdchod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatumOdchodSkutecny" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatumPrichod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatumPrichodSkutecny" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DelkaIntervalu" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DochazkaDen_Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Orezan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Poznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypCinnosti" type="{http://schemas.datacontract.org/2004/07/HolyAttendanceCore.Models}TypCinnosti" minOccurs="0"/&gt;
 *         &lt;element name="TypUzivatelskeCinnosti_Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UpravenoUzivatelem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UzivatelCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Uzivatel_Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Vygenerovan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dochazka", propOrder = {
    "datumOdchod",
    "datumOdchodSkutecny",
    "datumPrichod",
    "datumPrichodSkutecny",
    "delkaIntervalu",
    "dochazkaDenId",
    "id",
    "orezan",
    "poznamka",
    "typCinnosti",
    "typUzivatelskeCinnostiId",
    "upravenoUzivatelem",
    "uzivatelCislo",
    "uzivatelId",
    "vygenerovan"
})
public class Dochazka {

    @XmlElementRef(name = "DatumOdchod", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datumOdchod;
    @XmlElementRef(name = "DatumOdchodSkutecny", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datumOdchodSkutecny;
    @XmlElementRef(name = "DatumPrichod", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datumPrichod;
    @XmlElementRef(name = "DatumPrichodSkutecny", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> datumPrichodSkutecny;
    @XmlElement(name = "DelkaIntervalu")
    protected Duration delkaIntervalu;
    @XmlElementRef(name = "DochazkaDen_Id", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dochazkaDenId;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Orezan")
    protected Boolean orezan;
    @XmlElementRef(name = "Poznamka", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poznamka;
    @XmlElement(name = "TypCinnosti")
    @XmlSchemaType(name = "string")
    protected TypCinnosti typCinnosti;
    @XmlElementRef(name = "TypUzivatelskeCinnosti_Id", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> typUzivatelskeCinnostiId;
    @XmlElement(name = "UpravenoUzivatelem")
    protected Boolean upravenoUzivatelem;
    @XmlElementRef(name = "UzivatelCislo", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uzivatelCislo;
    @XmlElementRef(name = "Uzivatel_Id", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uzivatelId;
    @XmlElement(name = "Vygenerovan")
    protected Boolean vygenerovan;

    /**
     * Gets the value of the datumOdchod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatumOdchod() {
        return datumOdchod;
    }

    /**
     * Sets the value of the datumOdchod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatumOdchod(JAXBElement<XMLGregorianCalendar> value) {
        this.datumOdchod = value;
    }

    /**
     * Gets the value of the datumOdchodSkutecny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatumOdchodSkutecny() {
        return datumOdchodSkutecny;
    }

    /**
     * Sets the value of the datumOdchodSkutecny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatumOdchodSkutecny(JAXBElement<XMLGregorianCalendar> value) {
        this.datumOdchodSkutecny = value;
    }

    /**
     * Gets the value of the datumPrichod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatumPrichod() {
        return datumPrichod;
    }

    /**
     * Sets the value of the datumPrichod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatumPrichod(JAXBElement<XMLGregorianCalendar> value) {
        this.datumPrichod = value;
    }

    /**
     * Gets the value of the datumPrichodSkutecny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDatumPrichodSkutecny() {
        return datumPrichodSkutecny;
    }

    /**
     * Sets the value of the datumPrichodSkutecny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDatumPrichodSkutecny(JAXBElement<XMLGregorianCalendar> value) {
        this.datumPrichodSkutecny = value;
    }

    /**
     * Gets the value of the delkaIntervalu property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelkaIntervalu() {
        return delkaIntervalu;
    }

    /**
     * Sets the value of the delkaIntervalu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelkaIntervalu(Duration value) {
        this.delkaIntervalu = value;
    }

    /**
     * Gets the value of the dochazkaDenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDochazkaDenId() {
        return dochazkaDenId;
    }

    /**
     * Sets the value of the dochazkaDenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDochazkaDenId(JAXBElement<Integer> value) {
        this.dochazkaDenId = value;
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
     * Gets the value of the orezan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrezan() {
        return orezan;
    }

    /**
     * Sets the value of the orezan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrezan(Boolean value) {
        this.orezan = value;
    }

    /**
     * Gets the value of the poznamka property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoznamka() {
        return poznamka;
    }

    /**
     * Sets the value of the poznamka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoznamka(JAXBElement<String> value) {
        this.poznamka = value;
    }

    /**
     * Gets the value of the typCinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link TypCinnosti }
     *     
     */
    public TypCinnosti getTypCinnosti() {
        return typCinnosti;
    }

    /**
     * Sets the value of the typCinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypCinnosti }
     *     
     */
    public void setTypCinnosti(TypCinnosti value) {
        this.typCinnosti = value;
    }

    /**
     * Gets the value of the typUzivatelskeCinnostiId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTypUzivatelskeCinnostiId() {
        return typUzivatelskeCinnostiId;
    }

    /**
     * Sets the value of the typUzivatelskeCinnostiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTypUzivatelskeCinnostiId(JAXBElement<Integer> value) {
        this.typUzivatelskeCinnostiId = value;
    }

    /**
     * Gets the value of the upravenoUzivatelem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpravenoUzivatelem() {
        return upravenoUzivatelem;
    }

    /**
     * Sets the value of the upravenoUzivatelem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpravenoUzivatelem(Boolean value) {
        this.upravenoUzivatelem = value;
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
     * Gets the value of the uzivatelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUzivatelId() {
        return uzivatelId;
    }

    /**
     * Sets the value of the uzivatelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUzivatelId(JAXBElement<Integer> value) {
        this.uzivatelId = value;
    }

    /**
     * Gets the value of the vygenerovan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVygenerovan() {
        return vygenerovan;
    }

    /**
     * Sets the value of the vygenerovan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVygenerovan(Boolean value) {
        this.vygenerovan = value;
    }

}

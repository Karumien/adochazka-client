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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pristup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pristup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CisloUzivatele" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Dochazka_Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KartaUzivatele" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Klavesa1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Klavesa2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KodPrace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Smazano" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TypVerifikace" type="{http://schemas.datacontract.org/2004/07/HolyAttendanceCore.Models}TypVerifikace" minOccurs="0"/&gt;
 *         &lt;element name="Uzivatel_Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VytvorilUzivatel_Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Zpracovano" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pristup", propOrder = {
    "cisloUzivatele",
    "datum",
    "dochazkaId",
    "id",
    "kartaUzivatele",
    "klavesa1",
    "klavesa2",
    "kodPrace",
    "smazano",
    "terminalId",
    "typVerifikace",
    "uzivatelId",
    "vytvorilUzivatelId",
    "zpracovano"
})
public class Pristup {

    @XmlElementRef(name = "CisloUzivatele", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cisloUzivatele;
    @XmlElement(name = "Datum")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datum;
    @XmlElementRef(name = "Dochazka_Id", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dochazkaId;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "KartaUzivatele", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kartaUzivatele;
    @XmlElementRef(name = "Klavesa1", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> klavesa1;
    @XmlElementRef(name = "Klavesa2", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> klavesa2;
    @XmlElementRef(name = "KodPrace", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> kodPrace;
    @XmlElement(name = "Smazano")
    protected Boolean smazano;
    @XmlElementRef(name = "TerminalId", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> terminalId;
    @XmlElement(name = "TypVerifikace")
    @XmlSchemaType(name = "string")
    protected TypVerifikace typVerifikace;
    @XmlElementRef(name = "Uzivatel_Id", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uzivatelId;
    @XmlElementRef(name = "VytvorilUzivatel_Id", namespace = "http://schemas.datacontract.org/2004/07/HolyAttendance.WS.Customer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vytvorilUzivatelId;
    @XmlElement(name = "Zpracovano")
    protected Boolean zpracovano;

    /**
     * Gets the value of the cisloUzivatele property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCisloUzivatele() {
        return cisloUzivatele;
    }

    /**
     * Sets the value of the cisloUzivatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCisloUzivatele(JAXBElement<String> value) {
        this.cisloUzivatele = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the dochazkaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDochazkaId() {
        return dochazkaId;
    }

    /**
     * Sets the value of the dochazkaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDochazkaId(JAXBElement<Integer> value) {
        this.dochazkaId = value;
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
     * Gets the value of the kartaUzivatele property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKartaUzivatele() {
        return kartaUzivatele;
    }

    /**
     * Sets the value of the kartaUzivatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKartaUzivatele(JAXBElement<String> value) {
        this.kartaUzivatele = value;
    }

    /**
     * Gets the value of the klavesa1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKlavesa1() {
        return klavesa1;
    }

    /**
     * Sets the value of the klavesa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKlavesa1(JAXBElement<Integer> value) {
        this.klavesa1 = value;
    }

    /**
     * Gets the value of the klavesa2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKlavesa2() {
        return klavesa2;
    }

    /**
     * Sets the value of the klavesa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKlavesa2(JAXBElement<Integer> value) {
        this.klavesa2 = value;
    }

    /**
     * Gets the value of the kodPrace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKodPrace() {
        return kodPrace;
    }

    /**
     * Sets the value of the kodPrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKodPrace(JAXBElement<Integer> value) {
        this.kodPrace = value;
    }

    /**
     * Gets the value of the smazano property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmazano() {
        return smazano;
    }

    /**
     * Sets the value of the smazano property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmazano(Boolean value) {
        this.smazano = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTerminalId(JAXBElement<Integer> value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the typVerifikace property.
     * 
     * @return
     *     possible object is
     *     {@link TypVerifikace }
     *     
     */
    public TypVerifikace getTypVerifikace() {
        return typVerifikace;
    }

    /**
     * Sets the value of the typVerifikace property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypVerifikace }
     *     
     */
    public void setTypVerifikace(TypVerifikace value) {
        this.typVerifikace = value;
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
     * Gets the value of the vytvorilUzivatelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVytvorilUzivatelId() {
        return vytvorilUzivatelId;
    }

    /**
     * Sets the value of the vytvorilUzivatelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVytvorilUzivatelId(JAXBElement<Integer> value) {
        this.vytvorilUzivatelId = value;
    }

    /**
     * Gets the value of the zpracovano property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZpracovano() {
        return zpracovano;
    }

    /**
     * Sets the value of the zpracovano property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZpracovano(Boolean value) {
        this.zpracovano = value;
    }

}

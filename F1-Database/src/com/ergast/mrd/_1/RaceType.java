//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.04 alle 06:00:27 PM CET 
//


package com.ergast.mrd._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per RaceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RaceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="Circuit" type="{http://ergast.com/mrd/1.4}CircuitType"/>
 *           &lt;element name="CircuitIdRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="QualifyingList" type="{http://ergast.com/mrd/1.4}QualifyingListType" minOccurs="0"/>
 *         &lt;element name="ResultsList" type="{http://ergast.com/mrd/1.4}ResultsListType" minOccurs="0"/>
 *         &lt;element name="LapsList" type="{http://ergast.com/mrd/1.4}LapsListType" minOccurs="0"/>
 *         &lt;element name="PitStopsList" type="{http://ergast.com/mrd/1.4}PitStopsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="season" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="round" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceType", propOrder = {
    "raceName",
    "circuit",
    "circuitIdRef",
    "date",
    "time",
    "qualifyingList",
    "resultsList",
    "lapsList",
    "pitStopsList"
})
public class RaceType {

    @XmlElement(name = "RaceName", required = true)
    protected String raceName;
    @XmlElement(name = "Circuit")
    protected CircuitType circuit;
    @XmlElement(name = "CircuitIdRef")
    protected String circuitIdRef;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "QualifyingList")
    protected QualifyingListType qualifyingList;
    @XmlElement(name = "ResultsList")
    protected ResultsListType resultsList;
    @XmlElement(name = "LapsList")
    protected LapsListType lapsList;
    @XmlElement(name = "PitStopsList")
    protected PitStopsListType pitStopsList;
    @XmlAttribute(name = "season", required = true)
    protected BigInteger season;
    @XmlAttribute(name = "round", required = true)
    protected BigInteger round;
    @XmlAttribute(name = "url")
    protected String url;

    /**
     * Recupera il valore della proprietà raceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceName() {
        return raceName;
    }

    /**
     * Imposta il valore della proprietà raceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceName(String value) {
        this.raceName = value;
    }

    /**
     * Recupera il valore della proprietà circuit.
     * 
     * @return
     *     possible object is
     *     {@link CircuitType }
     *     
     */
    public CircuitType getCircuit() {
        return circuit;
    }

    /**
     * Imposta il valore della proprietà circuit.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitType }
     *     
     */
    public void setCircuit(CircuitType value) {
        this.circuit = value;
    }

    /**
     * Recupera il valore della proprietà circuitIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitIdRef() {
        return circuitIdRef;
    }

    /**
     * Imposta il valore della proprietà circuitIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitIdRef(String value) {
        this.circuitIdRef = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Imposta il valore della proprietà time.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Recupera il valore della proprietà qualifyingList.
     * 
     * @return
     *     possible object is
     *     {@link QualifyingListType }
     *     
     */
    public QualifyingListType getQualifyingList() {
        return qualifyingList;
    }

    /**
     * Imposta il valore della proprietà qualifyingList.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifyingListType }
     *     
     */
    public void setQualifyingList(QualifyingListType value) {
        this.qualifyingList = value;
    }

    /**
     * Recupera il valore della proprietà resultsList.
     * 
     * @return
     *     possible object is
     *     {@link ResultsListType }
     *     
     */
    public ResultsListType getResultsList() {
        return resultsList;
    }

    /**
     * Imposta il valore della proprietà resultsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsListType }
     *     
     */
    public void setResultsList(ResultsListType value) {
        this.resultsList = value;
    }

    /**
     * Recupera il valore della proprietà lapsList.
     * 
     * @return
     *     possible object is
     *     {@link LapsListType }
     *     
     */
    public LapsListType getLapsList() {
        return lapsList;
    }

    /**
     * Imposta il valore della proprietà lapsList.
     * 
     * @param value
     *     allowed object is
     *     {@link LapsListType }
     *     
     */
    public void setLapsList(LapsListType value) {
        this.lapsList = value;
    }

    /**
     * Recupera il valore della proprietà pitStopsList.
     * 
     * @return
     *     possible object is
     *     {@link PitStopsListType }
     *     
     */
    public PitStopsListType getPitStopsList() {
        return pitStopsList;
    }

    /**
     * Imposta il valore della proprietà pitStopsList.
     * 
     * @param value
     *     allowed object is
     *     {@link PitStopsListType }
     *     
     */
    public void setPitStopsList(PitStopsListType value) {
        this.pitStopsList = value;
    }

    /**
     * Recupera il valore della proprietà season.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeason() {
        return season;
    }

    /**
     * Imposta il valore della proprietà season.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeason(BigInteger value) {
        this.season = value;
    }

    /**
     * Recupera il valore della proprietà round.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRound() {
        return round;
    }

    /**
     * Imposta il valore della proprietà round.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRound(BigInteger value) {
        this.round = value;
    }

    /**
     * Recupera il valore della proprietà url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Imposta il valore della proprietà url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}

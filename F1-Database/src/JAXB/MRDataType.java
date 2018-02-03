//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.03 alle 04:04:49 PM CET 
//


package JAXB;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MRDataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MRDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeasonTable" type="{http://ergast.com/mrd/1.4}SeasonTableType" minOccurs="0"/>
 *         &lt;element name="RaceTable" type="{http://ergast.com/mrd/1.4}RaceTableType" minOccurs="0"/>
 *         &lt;element name="StandingsTable" type="{http://ergast.com/mrd/1.4}StandingsTableType" minOccurs="0"/>
 *         &lt;element name="DriverTable" type="{http://ergast.com/mrd/1.4}DriverTableType" minOccurs="0"/>
 *         &lt;element name="ConstructorTable" type="{http://ergast.com/mrd/1.4}ConstructorTableType" minOccurs="0"/>
 *         &lt;element name="CircuitTable" type="{http://ergast.com/mrd/1.4}CircuitTableType" minOccurs="0"/>
 *         &lt;element name="StatusTable" type="{http://ergast.com/mrd/1.4}StatusTableType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="series" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="limit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MRDataType", propOrder = {
    "seasonTable",
    "raceTable",
    "standingsTable",
    "driverTable",
    "constructorTable",
    "circuitTable",
    "statusTable"
})
public class MRDataType {

    @XmlElement(name = "SeasonTable")
    protected SeasonTableType seasonTable;
    @XmlElement(name = "RaceTable")
    protected RaceTableType raceTable;
    @XmlElement(name = "StandingsTable")
    protected StandingsTableType standingsTable;
    @XmlElement(name = "DriverTable")
    protected DriverTableType driverTable;
    @XmlElement(name = "ConstructorTable")
    protected ConstructorTableType constructorTable;
    @XmlElement(name = "CircuitTable")
    protected CircuitTableType circuitTable;
    @XmlElement(name = "StatusTable")
    protected StatusTableType statusTable;
    @XmlAttribute(name = "series")
    protected String series;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "limit")
    protected BigInteger limit;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;
    @XmlAttribute(name = "total")
    protected BigInteger total;

    /**
     * Recupera il valore della proprietà seasonTable.
     * 
     * @return
     *     possible object is
     *     {@link SeasonTableType }
     *     
     */
    public SeasonTableType getSeasonTable() {
        return seasonTable;
    }

    /**
     * Imposta il valore della proprietà seasonTable.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonTableType }
     *     
     */
    public void setSeasonTable(SeasonTableType value) {
        this.seasonTable = value;
    }

    /**
     * Recupera il valore della proprietà raceTable.
     * 
     * @return
     *     possible object is
     *     {@link RaceTableType }
     *     
     */
    public RaceTableType getRaceTable() {
        return raceTable;
    }

    /**
     * Imposta il valore della proprietà raceTable.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceTableType }
     *     
     */
    public void setRaceTable(RaceTableType value) {
        this.raceTable = value;
    }

    /**
     * Recupera il valore della proprietà standingsTable.
     * 
     * @return
     *     possible object is
     *     {@link StandingsTableType }
     *     
     */
    public StandingsTableType getStandingsTable() {
        return standingsTable;
    }

    /**
     * Imposta il valore della proprietà standingsTable.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingsTableType }
     *     
     */
    public void setStandingsTable(StandingsTableType value) {
        this.standingsTable = value;
    }

    /**
     * Recupera il valore della proprietà driverTable.
     * 
     * @return
     *     possible object is
     *     {@link DriverTableType }
     *     
     */
    public DriverTableType getDriverTable() {
        return driverTable;
    }

    /**
     * Imposta il valore della proprietà driverTable.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverTableType }
     *     
     */
    public void setDriverTable(DriverTableType value) {
        this.driverTable = value;
    }

    /**
     * Recupera il valore della proprietà constructorTable.
     * 
     * @return
     *     possible object is
     *     {@link ConstructorTableType }
     *     
     */
    public ConstructorTableType getConstructorTable() {
        return constructorTable;
    }

    /**
     * Imposta il valore della proprietà constructorTable.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructorTableType }
     *     
     */
    public void setConstructorTable(ConstructorTableType value) {
        this.constructorTable = value;
    }

    /**
     * Recupera il valore della proprietà circuitTable.
     * 
     * @return
     *     possible object is
     *     {@link CircuitTableType }
     *     
     */
    public CircuitTableType getCircuitTable() {
        return circuitTable;
    }

    /**
     * Imposta il valore della proprietà circuitTable.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitTableType }
     *     
     */
    public void setCircuitTable(CircuitTableType value) {
        this.circuitTable = value;
    }

    /**
     * Recupera il valore della proprietà statusTable.
     * 
     * @return
     *     possible object is
     *     {@link StatusTableType }
     *     
     */
    public StatusTableType getStatusTable() {
        return statusTable;
    }

    /**
     * Imposta il valore della proprietà statusTable.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTableType }
     *     
     */
    public void setStatusTable(StatusTableType value) {
        this.statusTable = value;
    }

    /**
     * Recupera il valore della proprietà series.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Imposta il valore della proprietà series.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
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

    /**
     * Recupera il valore della proprietà limit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimit() {
        return limit;
    }

    /**
     * Imposta il valore della proprietà limit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimit(BigInteger value) {
        this.limit = value;
    }

    /**
     * Recupera il valore della proprietà offset.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Imposta il valore della proprietà offset.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    /**
     * Recupera il valore della proprietà total.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Imposta il valore della proprietà total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

}

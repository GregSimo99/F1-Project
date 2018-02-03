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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TableType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="season" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="round" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="circuitId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="constructorId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="statusId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableType")
@XmlSeeAlso({
    StatusTableType.class,
    DriverTableType.class,
    CircuitTableType.class,
    StandingsTableType.class,
    SeasonTableType.class,
    RaceTableType.class,
    ConstructorTableType.class
})
public abstract class TableType {

    @XmlAttribute(name = "season")
    protected BigInteger season;
    @XmlAttribute(name = "round")
    protected BigInteger round;
    @XmlAttribute(name = "circuitId")
    protected String circuitId;
    @XmlAttribute(name = "constructorId")
    protected String constructorId;
    @XmlAttribute(name = "driverId")
    protected String driverId;
    @XmlAttribute(name = "grid")
    protected BigInteger grid;
    @XmlAttribute(name = "position")
    protected BigInteger position;
    @XmlAttribute(name = "statusId")
    protected BigInteger statusId;

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
     * Recupera il valore della proprietà circuitId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitId() {
        return circuitId;
    }

    /**
     * Imposta il valore della proprietà circuitId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitId(String value) {
        this.circuitId = value;
    }

    /**
     * Recupera il valore della proprietà constructorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructorId() {
        return constructorId;
    }

    /**
     * Imposta il valore della proprietà constructorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructorId(String value) {
        this.constructorId = value;
    }

    /**
     * Recupera il valore della proprietà driverId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Imposta il valore della proprietà driverId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
    }

    /**
     * Recupera il valore della proprietà grid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrid() {
        return grid;
    }

    /**
     * Imposta il valore della proprietà grid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrid(BigInteger value) {
        this.grid = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà statusId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusId() {
        return statusId;
    }

    /**
     * Imposta il valore della proprietà statusId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusId(BigInteger value) {
        this.statusId = value;
    }

}

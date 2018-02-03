//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.03 alle 04:04:49 PM CET 
//


package JAXB;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Driver" type="{http://ergast.com/mrd/1.4}DriverType" maxOccurs="unbounded"/>
 *           &lt;element name="DriverIdRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Constructor" type="{http://ergast.com/mrd/1.4}ConstructorType"/>
 *           &lt;element name="ConstructorIdRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="Grid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Laps" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Status" type="{http://ergast.com/mrd/1.4}StatusType"/>
 *         &lt;element name="Time" type="{http://ergast.com/mrd/1.4}DurationType" minOccurs="0"/>
 *         &lt;element name="FastestLap" type="{http://ergast.com/mrd/1.4}FastestLapType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="points" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "driver",
    "driverIdRef",
    "constructor",
    "constructorIdRef",
    "grid",
    "laps",
    "status",
    "time",
    "fastestLap"
})
public class ResultType {

    @XmlElement(name = "Driver")
    protected List<DriverType> driver;
    @XmlElement(name = "DriverIdRef")
    protected List<String> driverIdRef;
    @XmlElement(name = "Constructor")
    protected ConstructorType constructor;
    @XmlElement(name = "ConstructorIdRef")
    protected String constructorIdRef;
    @XmlElement(name = "Grid", required = true)
    protected BigInteger grid;
    @XmlElement(name = "Laps", required = true)
    protected BigInteger laps;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "Time")
    protected DurationType time;
    @XmlElement(name = "FastestLap")
    protected FastestLapType fastestLap;
    @XmlAttribute(name = "number")
    protected BigInteger number;
    @XmlAttribute(name = "position", required = true)
    protected BigInteger position;
    @XmlAttribute(name = "points")
    protected Float points;

    /**
     * Gets the value of the driver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverType }
     * 
     * 
     */
    public List<DriverType> getDriver() {
        if (driver == null) {
            driver = new ArrayList<DriverType>();
        }
        return this.driver;
    }

    /**
     * Gets the value of the driverIdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverIdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverIdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDriverIdRef() {
        if (driverIdRef == null) {
            driverIdRef = new ArrayList<String>();
        }
        return this.driverIdRef;
    }

    /**
     * Recupera il valore della proprietà constructor.
     * 
     * @return
     *     possible object is
     *     {@link ConstructorType }
     *     
     */
    public ConstructorType getConstructor() {
        return constructor;
    }

    /**
     * Imposta il valore della proprietà constructor.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructorType }
     *     
     */
    public void setConstructor(ConstructorType value) {
        this.constructor = value;
    }

    /**
     * Recupera il valore della proprietà constructorIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructorIdRef() {
        return constructorIdRef;
    }

    /**
     * Imposta il valore della proprietà constructorIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructorIdRef(String value) {
        this.constructorIdRef = value;
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
     * Recupera il valore della proprietà laps.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLaps() {
        return laps;
    }

    /**
     * Imposta il valore della proprietà laps.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLaps(BigInteger value) {
        this.laps = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà time.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getTime() {
        return time;
    }

    /**
     * Imposta il valore della proprietà time.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setTime(DurationType value) {
        this.time = value;
    }

    /**
     * Recupera il valore della proprietà fastestLap.
     * 
     * @return
     *     possible object is
     *     {@link FastestLapType }
     *     
     */
    public FastestLapType getFastestLap() {
        return fastestLap;
    }

    /**
     * Imposta il valore della proprietà fastestLap.
     * 
     * @param value
     *     allowed object is
     *     {@link FastestLapType }
     *     
     */
    public void setFastestLap(FastestLapType value) {
        this.fastestLap = value;
    }

    /**
     * Recupera il valore della proprietà number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Imposta il valore della proprietà number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
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
     * Recupera il valore della proprietà points.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPoints() {
        return points;
    }

    /**
     * Imposta il valore della proprietà points.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPoints(Float value) {
        this.points = value;
    }

}

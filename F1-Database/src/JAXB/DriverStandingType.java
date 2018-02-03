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
 * <p>Classe Java per DriverStandingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DriverStandingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Driver" type="{http://ergast.com/mrd/1.4}DriverType"/>
 *           &lt;element name="DriverIdRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Constructor" type="{http://ergast.com/mrd/1.4}ConstructorType" maxOccurs="unbounded"/>
 *           &lt;element name="ConstructorIdRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="points" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="wins" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverStandingType", propOrder = {
    "driver",
    "driverIdRef",
    "constructor",
    "constructorIdRef"
})
public class DriverStandingType {

    @XmlElement(name = "Driver")
    protected DriverType driver;
    @XmlElement(name = "DriverIdRef")
    protected String driverIdRef;
    @XmlElement(name = "Constructor")
    protected List<ConstructorType> constructor;
    @XmlElement(name = "ConstructorIdRef")
    protected List<String> constructorIdRef;
    @XmlAttribute(name = "position", required = true)
    protected BigInteger position;
    @XmlAttribute(name = "points", required = true)
    protected float points;
    @XmlAttribute(name = "wins", required = true)
    protected BigInteger wins;

    /**
     * Recupera il valore della proprietà driver.
     * 
     * @return
     *     possible object is
     *     {@link DriverType }
     *     
     */
    public DriverType getDriver() {
        return driver;
    }

    /**
     * Imposta il valore della proprietà driver.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverType }
     *     
     */
    public void setDriver(DriverType value) {
        this.driver = value;
    }

    /**
     * Recupera il valore della proprietà driverIdRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverIdRef() {
        return driverIdRef;
    }

    /**
     * Imposta il valore della proprietà driverIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverIdRef(String value) {
        this.driverIdRef = value;
    }

    /**
     * Gets the value of the constructor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructorType }
     * 
     * 
     */
    public List<ConstructorType> getConstructor() {
        if (constructor == null) {
            constructor = new ArrayList<ConstructorType>();
        }
        return this.constructor;
    }

    /**
     * Gets the value of the constructorIdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructorIdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructorIdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConstructorIdRef() {
        if (constructorIdRef == null) {
            constructorIdRef = new ArrayList<String>();
        }
        return this.constructorIdRef;
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
     */
    public float getPoints() {
        return points;
    }

    /**
     * Imposta il valore della proprietà points.
     * 
     */
    public void setPoints(float value) {
        this.points = value;
    }

    /**
     * Recupera il valore della proprietà wins.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWins() {
        return wins;
    }

    /**
     * Imposta il valore della proprietà wins.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWins(BigInteger value) {
        this.wins = value;
    }

}

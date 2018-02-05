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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per QualifyingResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QualifyingResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Driver" type="{http://ergast.com/mrd/1.4}DriverType"/>
 *           &lt;element name="DriverIdRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Constructor" type="{http://ergast.com/mrd/1.4}ConstructorType"/>
 *           &lt;element name="ConstructorIdRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="Q1" type="{http://ergast.com/mrd/1.4}DurationType"/>
 *         &lt;element name="Q2" type="{http://ergast.com/mrd/1.4}DurationType" minOccurs="0"/>
 *         &lt;element name="Q3" type="{http://ergast.com/mrd/1.4}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingResultType", propOrder = {
    "driver",
    "driverIdRef",
    "constructor",
    "constructorIdRef",
    "q1",
    "q2",
    "q3"
})
public class QualifyingResultType {

    @XmlElement(name = "Driver")
    protected DriverType driver;
    @XmlElement(name = "DriverIdRef")
    protected String driverIdRef;
    @XmlElement(name = "Constructor")
    protected ConstructorType constructor;
    @XmlElement(name = "ConstructorIdRef")
    protected String constructorIdRef;
    @XmlElement(name = "Q1", required = true)
    protected DurationType q1;
    @XmlElement(name = "Q2")
    protected DurationType q2;
    @XmlElement(name = "Q3")
    protected DurationType q3;
    @XmlAttribute(name = "number")
    protected BigInteger number;
    @XmlAttribute(name = "position", required = true)
    protected BigInteger position;

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
     * Recupera il valore della proprietà q1.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getQ1() {
        return q1;
    }

    /**
     * Imposta il valore della proprietà q1.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setQ1(DurationType value) {
        this.q1 = value;
    }

    /**
     * Recupera il valore della proprietà q2.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getQ2() {
        return q2;
    }

    /**
     * Imposta il valore della proprietà q2.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setQ2(DurationType value) {
        this.q2 = value;
    }

    /**
     * Recupera il valore della proprietà q3.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getQ3() {
        return q3;
    }

    /**
     * Imposta il valore della proprietà q3.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setQ3(DurationType value) {
        this.q3 = value;
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

}

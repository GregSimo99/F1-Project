//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.04 alle 06:00:27 PM CET 
//


package com.ergast.mrd._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CircuitType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CircuitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CircuitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Location" type="{http://ergast.com/mrd/1.4}LocationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="circuitId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircuitType", propOrder = {
    "circuitName",
    "location"
})
public class CircuitType {

    @XmlElement(name = "CircuitName", required = true)
    protected String circuitName;
    @XmlElement(name = "Location", required = true)
    protected LocationType location;
    @XmlAttribute(name = "circuitId", required = true)
    protected String circuitId;
    @XmlAttribute(name = "url")
    protected String url;

    /**
     * Recupera il valore della propriet� circuitName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitName() {
        return circuitName;
    }

    /**
     * Imposta il valore della propriet� circuitName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitName(String value) {
        this.circuitName = value;
    }

    /**
     * Recupera il valore della propriet� location.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Imposta il valore della propriet� location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Recupera il valore della propriet� circuitId.
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
     * Imposta il valore della propriet� circuitId.
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
     * Recupera il valore della propriet� url.
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
     * Imposta il valore della propriet� url.
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

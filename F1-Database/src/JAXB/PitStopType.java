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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PitStopType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PitStopType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="driverId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stop" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lap" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PitStopType")
public class PitStopType {

    @XmlAttribute(name = "driverId", required = true)
    protected String driverId;
    @XmlAttribute(name = "stop", required = true)
    protected BigInteger stop;
    @XmlAttribute(name = "lap", required = true)
    protected BigInteger lap;
    @XmlAttribute(name = "time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "duration")
    protected Duration duration;

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
     * Recupera il valore della proprietà stop.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStop() {
        return stop;
    }

    /**
     * Imposta il valore della proprietà stop.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStop(BigInteger value) {
        this.stop = value;
    }

    /**
     * Recupera il valore della proprietà lap.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLap() {
        return lap;
    }

    /**
     * Imposta il valore della proprietà lap.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLap(BigInteger value) {
        this.lap = value;
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
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}

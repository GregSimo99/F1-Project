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
 * <p>Classe Java per FastestLapType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FastestLapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{http://ergast.com/mrd/1.4}DurationType"/>
 *         &lt;element name="AverageSpeed" type="{http://ergast.com/mrd/1.4}SpeedType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lap" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FastestLapType", propOrder = {
    "time",
    "averageSpeed"
})
public class FastestLapType {

    @XmlElement(name = "Time", required = true)
    protected DurationType time;
    @XmlElement(name = "AverageSpeed", required = true)
    protected SpeedType averageSpeed;
    @XmlAttribute(name = "rank", required = true)
    protected BigInteger rank;
    @XmlAttribute(name = "lap", required = true)
    protected BigInteger lap;

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
     * Recupera il valore della proprietà averageSpeed.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Imposta il valore della proprietà averageSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setAverageSpeed(SpeedType value) {
        this.averageSpeed = value;
    }

    /**
     * Recupera il valore della proprietà rank.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        return rank;
    }

    /**
     * Imposta il valore della proprietà rank.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
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

}

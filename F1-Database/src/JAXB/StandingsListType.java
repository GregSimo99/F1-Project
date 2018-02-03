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
 * <p>Classe Java per StandingsListType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StandingsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverStanding" type="{http://ergast.com/mrd/1.4}DriverStandingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConstructorStanding" type="{http://ergast.com/mrd/1.4}ConstructorStandingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="season" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="round" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingsListType", propOrder = {
    "driverStanding",
    "constructorStanding"
})
public class StandingsListType {

    @XmlElement(name = "DriverStanding")
    protected List<DriverStandingType> driverStanding;
    @XmlElement(name = "ConstructorStanding")
    protected List<ConstructorStandingType> constructorStanding;
    @XmlAttribute(name = "season", required = true)
    protected BigInteger season;
    @XmlAttribute(name = "round")
    protected BigInteger round;

    /**
     * Gets the value of the driverStanding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverStanding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverStanding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverStandingType }
     * 
     * 
     */
    public List<DriverStandingType> getDriverStanding() {
        if (driverStanding == null) {
            driverStanding = new ArrayList<DriverStandingType>();
        }
        return this.driverStanding;
    }

    /**
     * Gets the value of the constructorStanding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructorStanding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructorStanding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructorStandingType }
     * 
     * 
     */
    public List<ConstructorStandingType> getConstructorStanding() {
        if (constructorStanding == null) {
            constructorStanding = new ArrayList<ConstructorStandingType>();
        }
        return this.constructorStanding;
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

}

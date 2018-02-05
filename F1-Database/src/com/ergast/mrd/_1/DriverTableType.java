//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.04 alle 06:00:27 PM CET 
//


package com.ergast.mrd._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DriverTableType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DriverTableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ergast.com/mrd/1.4}TableType">
 *       &lt;sequence>
 *         &lt;element name="Driver" type="{http://ergast.com/mrd/1.4}DriverType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverTableType", propOrder = {
    "driver"
})
public class DriverTableType
    extends TableType
{

    @XmlElement(name = "Driver")
    protected List<DriverType> driver;

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

}

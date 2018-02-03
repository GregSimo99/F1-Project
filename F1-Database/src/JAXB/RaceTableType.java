//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.03 alle 04:04:49 PM CET 
//


package JAXB;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RaceTableType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RaceTableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ergast.com/mrd/1.4}TableType">
 *       &lt;sequence>
 *         &lt;element name="Race" type="{http://ergast.com/mrd/1.4}RaceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceTableType", propOrder = {
    "race"
})
public class RaceTableType
    extends TableType
{

    @XmlElement(name = "Race")
    protected List<RaceType> race;

    /**
     * Gets the value of the race property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the race property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceType }
     * 
     * 
     */
    public List<RaceType> getRace() {
        if (race == null) {
            race = new ArrayList<RaceType>();
        }
        return this.race;
    }

}

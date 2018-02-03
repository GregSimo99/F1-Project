//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.03 alle 04:04:49 PM CET 
//


package JAXB;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SeasonTableType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SeasonTableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ergast.com/mrd/1.4}TableType">
 *       &lt;sequence>
 *         &lt;element name="Season" type="{http://ergast.com/mrd/1.4}SeasonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeasonTableType", propOrder = {
    "rest"
})
public class SeasonTableType
    extends TableType
{

    @XmlElementRef(name = "Season", namespace = "http://ergast.com/mrd/1.4", type = JAXBElement.class, required = false)
    protected List<JAXBElement<SeasonType>> rest;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "Season" è usato da due diverse parti di uno schema. Vedere: 
     * riga 37 di file:/C:/Users/simon/Desktop/mrd-1.4.xsd
     * riga 24 di file:/C:/Users/simon/Desktop/mrd-1.4.xsd
     * <p>
     * Per eliminare questa proprietà, applicare una personalizzazione della proprietà a una 
     * delle seguenti due dichiarazioni per modificarne il nome: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SeasonType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<SeasonType>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<SeasonType>>();
        }
        return this.rest;
    }

}

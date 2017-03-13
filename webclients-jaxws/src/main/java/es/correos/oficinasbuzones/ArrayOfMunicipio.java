
package es.correos.oficinasbuzones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMunicipio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMunicipio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Municipio" type="{http://tempuri.org/}Municipio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMunicipio", propOrder = {
    "municipio"
})
public class ArrayOfMunicipio {

    @XmlElement(name = "Municipio", nillable = true)
    protected List<Municipio> municipio;

    /**
     * Gets the value of the municipio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMunicipio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Municipio }
     * 
     * 
     */
    public List<Municipio> getMunicipio() {
        if (municipio == null) {
            municipio = new ArrayList<Municipio>();
        }
        return this.municipio;
    }

}

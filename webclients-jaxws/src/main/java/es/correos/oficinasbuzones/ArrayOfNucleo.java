
package es.correos.oficinasbuzones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNucleo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNucleo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nucleo" type="{http://tempuri.org/}Nucleo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNucleo", propOrder = {
    "nucleo"
})
public class ArrayOfNucleo {

    @XmlElement(name = "Nucleo", nillable = true)
    protected List<Nucleo> nucleo;

    /**
     * Gets the value of the nucleo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nucleo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNucleo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nucleo }
     * 
     * 
     */
    public List<Nucleo> getNucleo() {
        if (nucleo == null) {
            nucleo = new ArrayList<Nucleo>();
        }
        return this.nucleo;
    }

}

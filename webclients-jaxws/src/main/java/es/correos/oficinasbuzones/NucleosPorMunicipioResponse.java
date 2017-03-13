
package es.correos.oficinasbuzones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NucleosPorMunicipioResult" type="{http://tempuri.org/}ArrayOfNucleo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nucleosPorMunicipioResult"
})
@XmlRootElement(name = "NucleosPorMunicipioResponse")
public class NucleosPorMunicipioResponse {

    @XmlElement(name = "NucleosPorMunicipioResult")
    protected ArrayOfNucleo nucleosPorMunicipioResult;

    /**
     * Gets the value of the nucleosPorMunicipioResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNucleo }
     *     
     */
    public ArrayOfNucleo getNucleosPorMunicipioResult() {
        return nucleosPorMunicipioResult;
    }

    /**
     * Sets the value of the nucleosPorMunicipioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNucleo }
     *     
     */
    public void setNucleosPorMunicipioResult(ArrayOfNucleo value) {
        this.nucleosPorMunicipioResult = value;
    }

}


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
 *         &lt;element name="EnvoltorioMunicipioResult" type="{http://tempuri.org/}ArrayOfInt" minOccurs="0"/>
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
    "envoltorioMunicipioResult"
})
@XmlRootElement(name = "EnvoltorioMunicipioResponse")
public class EnvoltorioMunicipioResponse {

    @XmlElement(name = "EnvoltorioMunicipioResult")
    protected ArrayOfInt envoltorioMunicipioResult;

    /**
     * Gets the value of the envoltorioMunicipioResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getEnvoltorioMunicipioResult() {
        return envoltorioMunicipioResult;
    }

    /**
     * Sets the value of the envoltorioMunicipioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setEnvoltorioMunicipioResult(ArrayOfInt value) {
        this.envoltorioMunicipioResult = value;
    }

}

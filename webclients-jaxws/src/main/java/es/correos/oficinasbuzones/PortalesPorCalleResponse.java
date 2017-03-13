
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
 *         &lt;element name="PortalesPorCalleResult" type="{http://tempuri.org/}ArrayOfPortal" minOccurs="0"/>
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
    "portalesPorCalleResult"
})
@XmlRootElement(name = "PortalesPorCalleResponse")
public class PortalesPorCalleResponse {

    @XmlElement(name = "PortalesPorCalleResult")
    protected ArrayOfPortal portalesPorCalleResult;

    /**
     * Gets the value of the portalesPorCalleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPortal }
     *     
     */
    public ArrayOfPortal getPortalesPorCalleResult() {
        return portalesPorCalleResult;
    }

    /**
     * Sets the value of the portalesPorCalleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPortal }
     *     
     */
    public void setPortalesPorCalleResult(ArrayOfPortal value) {
        this.portalesPorCalleResult = value;
    }

}

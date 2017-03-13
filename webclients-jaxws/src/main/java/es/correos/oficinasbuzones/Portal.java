
package es.correos.oficinasbuzones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Portal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Portal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPortal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portal", propOrder = {
    "idPortal",
    "texto",
    "x",
    "y",
    "idCalle",
    "observacio"
})
public class Portal {

    protected String idPortal;
    @XmlElement(name = "Texto")
    protected String texto;
    @XmlElement(name = "X")
    protected int x;
    @XmlElement(name = "Y")
    protected int y;
    @XmlElement(name = "IdCalle")
    protected String idCalle;
    protected String observacio;

    /**
     * Gets the value of the idPortal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPortal() {
        return idPortal;
    }

    /**
     * Sets the value of the idPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPortal(String value) {
        this.idPortal = value;
    }

    /**
     * Gets the value of the texto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Gets the value of the idCalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCalle() {
        return idCalle;
    }

    /**
     * Sets the value of the idCalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCalle(String value) {
        this.idCalle = value;
    }

    /**
     * Gets the value of the observacio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacio() {
        return observacio;
    }

    /**
     * Sets the value of the observacio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacio(String value) {
        this.observacio = value;
    }

}


package tds.testpackage.legacy.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}identifier"/>
 *         &lt;element ref="{}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}computationruleparametervalue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="parametertype">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="int"/>
 *             &lt;enumeration value="double"/>
 *             &lt;enumeration value="string"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifier",
    "property",
    "computationruleparametervalue"
})
@XmlRootElement(name = "computationruleparameter")
public class Computationruleparameter {

    @XmlElement(required = true)
    protected Identifier identifier;
    protected List<Property> property;
    protected List<Computationruleparametervalue> computationruleparametervalue;
    @XmlAttribute(name = "position", required = true)
    protected BigInteger position;
    @XmlAttribute(name = "parametertype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String parametertype;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the computationruleparametervalue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computationruleparametervalue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputationruleparametervalue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Computationruleparametervalue }
     * 
     * 
     */
    public List<Computationruleparametervalue> getComputationruleparametervalue() {
        if (computationruleparametervalue == null) {
            computationruleparametervalue = new ArrayList<Computationruleparametervalue>();
        }
        return this.computationruleparametervalue;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the parametertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametertype() {
        return parametertype;
    }

    /**
     * Sets the value of the parametertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametertype(String value) {
        this.parametertype = value;
    }

}
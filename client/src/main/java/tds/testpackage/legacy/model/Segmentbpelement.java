
package tds.testpackage.legacy.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="maxftitems" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="bpelementid" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="minopitems" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxopitems" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="minftitems" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
@XmlRootElement(name = "segmentbpelement")
public class Segmentbpelement {

    protected List<Property> property;
    @XmlAttribute(name = "maxftitems")
    protected BigInteger maxftitems;
    @XmlAttribute(name = "bpelementid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bpelementid;
    @XmlAttribute(name = "minopitems", required = true)
    protected BigInteger minopitems;
    @XmlAttribute(name = "maxopitems", required = true)
    protected BigInteger maxopitems;
    @XmlAttribute(name = "minftitems")
    protected BigInteger minftitems;

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
     * Gets the value of the maxftitems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxftitems() {
        return maxftitems;
    }

    /**
     * Sets the value of the maxftitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxftitems(BigInteger value) {
        this.maxftitems = value;
    }

    /**
     * Gets the value of the bpelementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpelementid() {
        return bpelementid;
    }

    /**
     * Sets the value of the bpelementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpelementid(String value) {
        this.bpelementid = value;
    }

    /**
     * Gets the value of the minopitems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinopitems() {
        return minopitems;
    }

    /**
     * Sets the value of the minopitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinopitems(BigInteger value) {
        this.minopitems = value;
    }

    /**
     * Gets the value of the maxopitems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxopitems() {
        return maxopitems;
    }

    /**
     * Sets the value of the maxopitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxopitems(BigInteger value) {
        this.maxopitems = value;
    }

    /**
     * Gets the value of the minftitems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinftitems() {
        return minftitems;
    }

    /**
     * Sets the value of the minftitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinftitems(BigInteger value) {
        this.minftitems = value;
    }

}

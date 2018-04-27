
package tds.testpackage.legacy.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}poolproperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}registrationform" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}registrationsegment" maxOccurs="unbounded"/>
 *         &lt;element ref="{}comment" minOccurs="0"/>
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
    "poolproperty",
    "registrationform",
    "registrationsegment",
    "comment"
})
@XmlRootElement(name = "registration")
public class Registration {

    protected List<Poolproperty> poolproperty;
    protected List<Registrationform> registrationform;
    @XmlElement(required = true)
    protected List<Registrationsegment> registrationsegment;
    protected Comment comment;

    /**
     * Gets the value of the poolproperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poolproperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolproperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Poolproperty }
     * 
     * 
     */
    public List<Poolproperty> getPoolproperty() {
        if (poolproperty == null) {
            poolproperty = new ArrayList<Poolproperty>();
        }
        return this.poolproperty;
    }

    /**
     * Gets the value of the registrationform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registrationform }
     * 
     * 
     */
    public List<Registrationform> getRegistrationform() {
        if (registrationform == null) {
            registrationform = new ArrayList<Registrationform>();
        }
        return this.registrationform;
    }

    /**
     * Gets the value of the registrationsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationsegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registrationsegment }
     * 
     * 
     */
    public List<Registrationsegment> getRegistrationsegment() {
        if (registrationsegment == null) {
            registrationsegment = new ArrayList<Registrationsegment>();
        }
        return this.registrationsegment;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

}

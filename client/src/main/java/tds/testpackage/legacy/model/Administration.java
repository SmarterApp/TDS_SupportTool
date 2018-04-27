
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
 *         &lt;element ref="{}testblueprint"/>
 *         &lt;element ref="{}poolproperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}itempool"/>
 *         &lt;element ref="{}testform" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}adminsegment" maxOccurs="unbounded"/>
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
    "testblueprint",
    "poolproperty",
    "itempool",
    "testform",
    "adminsegment",
    "comment"
})
@XmlRootElement(name = "administration")
public class Administration {

    @XmlElement(required = true)
    protected Testblueprint testblueprint;
    protected List<Poolproperty> poolproperty;
    @XmlElement(required = true)
    protected Itempool itempool;
    protected List<Testform> testform;
    @XmlElement(required = true)
    protected List<Adminsegment> adminsegment;
    protected Comment comment;

    /**
     * Gets the value of the testblueprint property.
     * 
     * @return
     *     possible object is
     *     {@link Testblueprint }
     *     
     */
    public Testblueprint getTestblueprint() {
        return testblueprint;
    }

    /**
     * Sets the value of the testblueprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Testblueprint }
     *     
     */
    public void setTestblueprint(Testblueprint value) {
        this.testblueprint = value;
    }

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
     * Gets the value of the itempool property.
     * 
     * @return
     *     possible object is
     *     {@link Itempool }
     *     
     */
    public Itempool getItempool() {
        return itempool;
    }

    /**
     * Sets the value of the itempool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Itempool }
     *     
     */
    public void setItempool(Itempool value) {
        this.itempool = value;
    }

    /**
     * Gets the value of the testform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testform }
     * 
     * 
     */
    public List<Testform> getTestform() {
        if (testform == null) {
            testform = new ArrayList<Testform>();
        }
        return this.testform;
    }

    /**
     * Gets the value of the adminsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminsegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adminsegment }
     * 
     * 
     */
    public List<Adminsegment> getAdminsegment() {
        if (adminsegment == null) {
            adminsegment = new ArrayList<Adminsegment>();
        }
        return this.adminsegment;
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


package tds.trt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ScoreInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreRationale" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubScoreList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ScoreInfo" type="{}ScoreInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="scorePoint" use="required" type="{}UFloatAllowNegativeOne" />
 *       &lt;attribute name="maxScore" use="required" type="{}UFloatAllowNegativeOne" />
 *       &lt;attribute name="scoreDimension" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="scoreStatus" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Scored"/>
 *             &lt;enumeration value="NotScored"/>
 *             &lt;enumeration value="WaitingForMachineScore"/>
 *             &lt;enumeration value="ScoringError"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="conditionCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="1"/>
 *             &lt;pattern value="[A-Z]"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sequence" type="{}UIntOneBased" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreInfoType", propOrder = {
    "scoreRationale",
    "subScoreList"
})
public class ScoreInfoType {

    @XmlElement(name = "ScoreRationale")
    protected ScoreInfoType.ScoreRationale scoreRationale;
    @XmlElement(name = "SubScoreList")
    protected ScoreInfoType.SubScoreList subScoreList;
    @XmlAttribute(name = "scorePoint", required = true)
    protected String scorePoint;
    @XmlAttribute(name = "maxScore", required = true)
    protected String maxScore;
    @XmlAttribute(name = "scoreDimension", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String scoreDimension;
    @XmlAttribute(name = "scoreStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scoreStatus;
    @XmlAttribute(name = "conditionCode")
    protected String conditionCode;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;

    /**
     * Gets the value of the scoreRationale property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreInfoType.ScoreRationale }
     *     
     */
    public ScoreInfoType.ScoreRationale getScoreRationale() {
        return scoreRationale;
    }

    /**
     * Sets the value of the scoreRationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreInfoType.ScoreRationale }
     *     
     */
    public void setScoreRationale(ScoreInfoType.ScoreRationale value) {
        this.scoreRationale = value;
    }

    /**
     * Gets the value of the subScoreList property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreInfoType.SubScoreList }
     *     
     */
    public ScoreInfoType.SubScoreList getSubScoreList() {
        return subScoreList;
    }

    /**
     * Sets the value of the subScoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreInfoType.SubScoreList }
     *     
     */
    public void setSubScoreList(ScoreInfoType.SubScoreList value) {
        this.subScoreList = value;
    }

    /**
     * Gets the value of the scorePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorePoint() {
        return scorePoint;
    }

    /**
     * Sets the value of the scorePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorePoint(String value) {
        this.scorePoint = value;
    }

    /**
     * Gets the value of the maxScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxScore() {
        return maxScore;
    }

    /**
     * Sets the value of the maxScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxScore(String value) {
        this.maxScore = value;
    }

    /**
     * Gets the value of the scoreDimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreDimension() {
        return scoreDimension;
    }

    /**
     * Sets the value of the scoreDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreDimension(String value) {
        this.scoreDimension = value;
    }

    /**
     * Gets the value of the scoreStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreStatus() {
        return scoreStatus;
    }

    /**
     * Sets the value of the scoreStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreStatus(String value) {
        this.scoreStatus = value;
    }

    /**
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionCode(String value) {
        this.conditionCode = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }


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
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "content"
    })
    public static class ScoreRationale {

        @XmlElementRef(name = "Message", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }


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
     *         &lt;element name="ScoreInfo" type="{}ScoreInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
        "scoreInfo"
    })
    public static class SubScoreList {

        @XmlElement(name = "ScoreInfo")
        protected List<ScoreInfoType> scoreInfo;

        /**
         * Gets the value of the scoreInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scoreInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScoreInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScoreInfoType }
         * 
         * 
         */
        public List<ScoreInfoType> getScoreInfo() {
            if (scoreInfo == null) {
                scoreInfo = new ArrayList<ScoreInfoType>();
            }
            return this.scoreInfo;
        }

    }

}

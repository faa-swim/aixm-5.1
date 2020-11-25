//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObstructionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ObstructionPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractObstructionExtension"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstructionType", propOrder = {
    "requiredClearance",
    "minimumAltitude",
    "surfacePenetration",
    "slopePenetration",
    "controlling",
    "closeIn",
    "theVerticalStructure",
    "adjustment",
    "obstaclePlacement",
    "annotation",
    "extension"
})
public class ObstructionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "requiredClearance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> requiredClearance;
    @XmlElementRef(name = "minimumAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumAltitude;
    @XmlElementRef(name = "surfacePenetration", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> surfacePenetration;
    @XmlElementRef(name = "slopePenetration", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopePenetration;
    @XmlElementRef(name = "controlling", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> controlling;
    @XmlElementRef(name = "closeIn", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> closeIn;
    @XmlElementRef(name = "theVerticalStructure", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<VerticalStructurePropertyType> theVerticalStructure;
    @XmlElement(nillable = true)
    protected List<AltitudeAdjustmentPropertyType> adjustment;
    @XmlElement(nillable = true)
    protected List<ObstaclePlacementPropertyType> obstaclePlacement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstructionType.Extension> extension;

    /**
     * Gets the value of the requiredClearance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRequiredClearance() {
        return requiredClearance;
    }

    /**
     * Sets the value of the requiredClearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRequiredClearance(JAXBElement<ValDistanceType> value) {
        this.requiredClearance = value;
    }

    /**
     * Gets the value of the minimumAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumAltitude() {
        return minimumAltitude;
    }

    /**
     * Sets the value of the minimumAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumAltitude = value;
    }

    /**
     * Gets the value of the surfacePenetration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSurfacePenetration() {
        return surfacePenetration;
    }

    /**
     * Sets the value of the surfacePenetration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSurfacePenetration(JAXBElement<CodeYesNoType> value) {
        this.surfacePenetration = value;
    }

    /**
     * Gets the value of the slopePenetration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlopePenetration() {
        return slopePenetration;
    }

    /**
     * Sets the value of the slopePenetration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopePenetration(JAXBElement<ValAngleType> value) {
        this.slopePenetration = value;
    }

    /**
     * Gets the value of the controlling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getControlling() {
        return controlling;
    }

    /**
     * Sets the value of the controlling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setControlling(JAXBElement<CodeYesNoType> value) {
        this.controlling = value;
    }

    /**
     * Gets the value of the closeIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getCloseIn() {
        return closeIn;
    }

    /**
     * Sets the value of the closeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCloseIn(JAXBElement<CodeYesNoType> value) {
        this.closeIn = value;
    }

    /**
     * Gets the value of the theVerticalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalStructurePropertyType> getTheVerticalStructure() {
        return theVerticalStructure;
    }

    /**
     * Sets the value of the theVerticalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePropertyType }{@code >}
     *     
     */
    public void setTheVerticalStructure(JAXBElement<VerticalStructurePropertyType> value) {
        this.theVerticalStructure = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltitudeAdjustmentPropertyType }
     * 
     * 
     */
    public List<AltitudeAdjustmentPropertyType> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<AltitudeAdjustmentPropertyType>();
        }
        return this.adjustment;
    }

    /**
     * Gets the value of the obstaclePlacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstaclePlacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstaclePlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstaclePlacementPropertyType }
     * 
     * 
     */
    public List<ObstaclePlacementPropertyType> getObstaclePlacement() {
        if (obstaclePlacement == null) {
            obstaclePlacement = new ArrayList<ObstaclePlacementPropertyType>();
        }
        return this.obstaclePlacement;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionType.Extension }
     * 
     * 
     */
    public List<ObstructionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ObstructionType.Extension>();
        }
        return this.extension;
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractObstructionExtension"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractObstructionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractObstructionExtension", required = true)
        protected AbstractExtensionType abstractObstructionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractObstructionExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractObstructionExtension() {
            return abstractObstructionExtension;
        }

        /**
         * Sets the value of the abstractObstructionExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractObstructionExtension(AbstractExtensionType value) {
            this.abstractObstructionExtension = value;
        }

        /**
         * Gets the value of the owns property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Sets the value of the owns property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(Boolean value) {
            this.owns = value;
        }

    }

}
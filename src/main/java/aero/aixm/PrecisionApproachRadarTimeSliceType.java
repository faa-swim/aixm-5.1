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
import aero.aixm.event.PrecisionApproachRadarExtensionType;
import aero.aixm.event.RadarEquipmentExtensionType;


/**
 * <p>Java class for PrecisionApproachRadarTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionApproachRadarTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}PrecisionApproachRadarPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPrecisionApproachRadarExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadarEquipmentExtension"/>
 *                 &lt;/choice>
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
@XmlType(name = "PrecisionApproachRadarTimeSliceType", propOrder = {
    "aixmName",
    "serialNumber",
    "range",
    "rangeAccuracy",
    "dualChannel",
    "movingTargetIndicator",
    "standbyPower",
    "digital",
    "militaryUseOnly",
    "specialUseOnly",
    "specialAircraftOnly",
    "magneticVariation",
    "magneticVariationAccuracy",
    "dateMagneticVariation",
    "contact",
    "location",
    "annotation",
    "precisionApproachRadarType",
    "slope",
    "slopeAccuracy",
    "reflector",
    "extension"
})
public class PrecisionApproachRadarTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "serialNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> serialNumber;
    @XmlElementRef(name = "range", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> range;
    @XmlElementRef(name = "rangeAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> rangeAccuracy;
    @XmlElementRef(name = "dualChannel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dualChannel;
    @XmlElementRef(name = "movingTargetIndicator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> movingTargetIndicator;
    @XmlElementRef(name = "standbyPower", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStandbyPowerType> standbyPower;
    @XmlElementRef(name = "digital", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> digital;
    @XmlElementRef(name = "militaryUseOnly", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> militaryUseOnly;
    @XmlElementRef(name = "specialUseOnly", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialUseOnly;
    @XmlElementRef(name = "specialAircraftOnly", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialAircraftOnly;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> magneticVariationAccuracy;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "precisionApproachRadarType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePARType> precisionApproachRadarType;
    @XmlElementRef(name = "slope", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slope;
    @XmlElementRef(name = "slopeAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopeAccuracy;
    @XmlElement(nillable = true)
    protected List<ReflectorPropertyType> reflector;
    protected List<PrecisionApproachRadarTimeSliceType.Extension> extension;

    /**
     * Gets the value of the aixmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getAIXMName() {
        return aixmName;
    }

    /**
     * Sets the value of the aixmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAIXMName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<TextDesignatorType> value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRange(JAXBElement<ValDistanceType> value) {
        this.range = value;
    }

    /**
     * Gets the value of the rangeAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRangeAccuracy() {
        return rangeAccuracy;
    }

    /**
     * Sets the value of the rangeAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRangeAccuracy(JAXBElement<ValDistanceType> value) {
        this.rangeAccuracy = value;
    }

    /**
     * Gets the value of the dualChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDualChannel() {
        return dualChannel;
    }

    /**
     * Sets the value of the dualChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDualChannel(JAXBElement<CodeYesNoType> value) {
        this.dualChannel = value;
    }

    /**
     * Gets the value of the movingTargetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMovingTargetIndicator() {
        return movingTargetIndicator;
    }

    /**
     * Sets the value of the movingTargetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMovingTargetIndicator(JAXBElement<CodeYesNoType> value) {
        this.movingTargetIndicator = value;
    }

    /**
     * Gets the value of the standbyPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     *     
     */
    public JAXBElement<CodeStandbyPowerType> getStandbyPower() {
        return standbyPower;
    }

    /**
     * Sets the value of the standbyPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     *     
     */
    public void setStandbyPower(JAXBElement<CodeStandbyPowerType> value) {
        this.standbyPower = value;
    }

    /**
     * Gets the value of the digital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDigital() {
        return digital;
    }

    /**
     * Sets the value of the digital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDigital(JAXBElement<CodeYesNoType> value) {
        this.digital = value;
    }

    /**
     * Gets the value of the militaryUseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMilitaryUseOnly() {
        return militaryUseOnly;
    }

    /**
     * Sets the value of the militaryUseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMilitaryUseOnly(JAXBElement<CodeYesNoType> value) {
        this.militaryUseOnly = value;
    }

    /**
     * Gets the value of the specialUseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSpecialUseOnly() {
        return specialUseOnly;
    }

    /**
     * Sets the value of the specialUseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialUseOnly(JAXBElement<CodeYesNoType> value) {
        this.specialUseOnly = value;
    }

    /**
     * Gets the value of the specialAircraftOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSpecialAircraftOnly() {
        return specialAircraftOnly;
    }

    /**
     * Sets the value of the specialAircraftOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialAircraftOnly(JAXBElement<CodeYesNoType> value) {
        this.specialAircraftOnly = value;
    }

    /**
     * Gets the value of the magneticVariation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public JAXBElement<ValMagneticVariationType> getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Sets the value of the magneticVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public void setMagneticVariation(JAXBElement<ValMagneticVariationType> value) {
        this.magneticVariation = value;
    }

    /**
     * Gets the value of the magneticVariationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getMagneticVariationAccuracy() {
        return magneticVariationAccuracy;
    }

    /**
     * Sets the value of the magneticVariationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setMagneticVariationAccuracy(JAXBElement<ValAngleType> value) {
        this.magneticVariationAccuracy = value;
    }

    /**
     * Gets the value of the dateMagneticVariation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getDateMagneticVariation() {
        return dateMagneticVariation;
    }

    /**
     * Sets the value of the dateMagneticVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setDateMagneticVariation(JAXBElement<DateYearType> value) {
        this.dateMagneticVariation = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    public List<ContactInformationPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactInformationPropertyType>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<ElevatedPointPropertyType> value) {
        this.location = value;
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
     * Gets the value of the precisionApproachRadarType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePARType }{@code >}
     *     
     */
    public JAXBElement<CodePARType> getPrecisionApproachRadarType() {
        return precisionApproachRadarType;
    }

    /**
     * Sets the value of the precisionApproachRadarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePARType }{@code >}
     *     
     */
    public void setPrecisionApproachRadarType(JAXBElement<CodePARType> value) {
        this.precisionApproachRadarType = value;
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlope(JAXBElement<ValAngleType> value) {
        this.slope = value;
    }

    /**
     * Gets the value of the slopeAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlopeAccuracy() {
        return slopeAccuracy;
    }

    /**
     * Sets the value of the slopeAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopeAccuracy(JAXBElement<ValAngleType> value) {
        this.slopeAccuracy = value;
    }

    /**
     * Gets the value of the reflector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectorPropertyType }
     * 
     * 
     */
    public List<ReflectorPropertyType> getReflector() {
        if (reflector == null) {
            reflector = new ArrayList<ReflectorPropertyType>();
        }
        return this.reflector;
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
     * {@link PrecisionApproachRadarTimeSliceType.Extension }
     * 
     * 
     */
    public List<PrecisionApproachRadarTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<PrecisionApproachRadarTimeSliceType.Extension>();
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPrecisionApproachRadarExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadarEquipmentExtension"/>
     *       &lt;/choice>
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
        "abstractPrecisionApproachRadarExtension",
        "abstractRadarEquipmentExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractPrecisionApproachRadarExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractPrecisionApproachRadarExtension;
        @XmlElementRef(name = "AbstractRadarEquipmentExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractRadarEquipmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractPrecisionApproachRadarExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractPrecisionApproachRadarExtension() {
            return abstractPrecisionApproachRadarExtension;
        }

        /**
         * Sets the value of the abstractPrecisionApproachRadarExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractPrecisionApproachRadarExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractPrecisionApproachRadarExtension = value;
        }

        /**
         * Gets the value of the abstractRadarEquipmentExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RadarEquipmentExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRadarEquipmentExtension() {
            return abstractRadarEquipmentExtension;
        }

        /**
         * Sets the value of the abstractRadarEquipmentExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RadarEquipmentExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRadarEquipmentExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRadarEquipmentExtension = value;
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

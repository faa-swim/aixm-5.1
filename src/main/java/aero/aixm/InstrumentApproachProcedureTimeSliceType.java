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
 * <p>Java class for InstrumentApproachProcedureTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentApproachProcedureTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}InstrumentApproachProcedurePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractInstrumentApproachProcedureExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractProcedureExtension"/>
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
@XmlType(name = "InstrumentApproachProcedureTimeSliceType", propOrder = {
    "communicationFailureInstruction",
    "instruction",
    "designCriteria",
    "codingStandard",
    "flightChecked",
    "aixmName",
    "rnav",
    "availability",
    "airportHeliport",
    "aircraftCharacteristic",
    "flightTransition",
    "guidanceFacilityNavaid",
    "guidanceFacilitySpecialNavigationSystem",
    "guidanceFacilityRadar",
    "annotation",
    "safeAltitude",
    "approachPrefix",
    "approachType",
    "multipleIdentification",
    "copterTrack",
    "circlingIdentification",
    "courseReversalInstruction",
    "additionalEquipment",
    "channelGNSS",
    "waasReliable",
    "landing",
    "missedInstruction",
    "finalProfile",
    "extension"
})
public class InstrumentApproachProcedureTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "communicationFailureInstruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> communicationFailureInstruction;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "designCriteria", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesignStandardType> designCriteria;
    @XmlElementRef(name = "codingStandard", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureCodingStandardType> codingStandard;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "RNAV", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> rnav;
    @XmlElement(nillable = true)
    protected List<ProcedureAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCharacteristic;
    @XmlElement(nillable = true)
    protected List<ProcedureTransitionPropertyType> flightTransition;
    @XmlElementRef(name = "guidanceFacility_navaid", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> guidanceFacilityNavaid;
    @XmlElementRef(name = "guidanceFacility_specialNavigationSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationSystemPropertyType> guidanceFacilitySpecialNavigationSystem;
    @XmlElementRef(name = "guidanceFacility_radar", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadarSystemPropertyType> guidanceFacilityRadar;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "safeAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SafeAltitudeAreaPropertyType> safeAltitude;
    @XmlElementRef(name = "approachPrefix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachPrefixType> approachPrefix;
    @XmlElementRef(name = "approachType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachType> approachType;
    @XmlElementRef(name = "multipleIdentification", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> multipleIdentification;
    @XmlElementRef(name = "copterTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> copterTrack;
    @XmlElementRef(name = "circlingIdentification", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> circlingIdentification;
    @XmlElementRef(name = "courseReversalInstruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> courseReversalInstruction;
    @XmlElementRef(name = "additionalEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachEquipmentAdditionalType> additionalEquipment;
    @XmlElementRef(name = "channelGNSS", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValChannelNumberType> channelGNSS;
    @XmlElementRef(name = "WAASReliable", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> waasReliable;
    @XmlElementRef(name = "landing", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> landing;
    @XmlElement(nillable = true)
    protected List<MissedApproachGroupPropertyType> missedInstruction;
    @XmlElementRef(name = "finalProfile", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FinalProfilePropertyType> finalProfile;
    protected List<InstrumentApproachProcedureTimeSliceType.Extension> extension;

    /**
     * Gets the value of the communicationFailureInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getCommunicationFailureInstruction() {
        return communicationFailureInstruction;
    }

    /**
     * Sets the value of the communicationFailureInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setCommunicationFailureInstruction(JAXBElement<TextInstructionType> value) {
        this.communicationFailureInstruction = value;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the designCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignStandardType }{@code >}
     *     
     */
    public JAXBElement<CodeDesignStandardType> getDesignCriteria() {
        return designCriteria;
    }

    /**
     * Sets the value of the designCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignStandardType }{@code >}
     *     
     */
    public void setDesignCriteria(JAXBElement<CodeDesignStandardType> value) {
        this.designCriteria = value;
    }

    /**
     * Gets the value of the codingStandard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *     
     */
    public JAXBElement<CodeProcedureCodingStandardType> getCodingStandard() {
        return codingStandard;
    }

    /**
     * Sets the value of the codingStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *     
     */
    public void setCodingStandard(JAXBElement<CodeProcedureCodingStandardType> value) {
        this.codingStandard = value;
    }

    /**
     * Gets the value of the flightChecked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFlightChecked() {
        return flightChecked;
    }

    /**
     * Sets the value of the flightChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

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
     * Gets the value of the rnav property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRNAV() {
        return rnav;
    }

    /**
     * Sets the value of the rnav property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRNAV(JAXBElement<CodeYesNoType> value) {
        this.rnav = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureAvailabilityPropertyType }
     * 
     * 
     */
    public List<ProcedureAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<ProcedureAvailabilityPropertyType>();
        }
        return this.availability;
    }

    /**
     * Gets the value of the airportHeliport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportHeliport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportHeliport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    public List<AirportHeliportPropertyType> getAirportHeliport() {
        if (airportHeliport == null) {
            airportHeliport = new ArrayList<AirportHeliportPropertyType>();
        }
        return this.airportHeliport;
    }

    /**
     * Gets the value of the aircraftCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    public List<AircraftCharacteristicPropertyType> getAircraftCharacteristic() {
        if (aircraftCharacteristic == null) {
            aircraftCharacteristic = new ArrayList<AircraftCharacteristicPropertyType>();
        }
        return this.aircraftCharacteristic;
    }

    /**
     * Gets the value of the flightTransition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTransition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureTransitionPropertyType }
     * 
     * 
     */
    public List<ProcedureTransitionPropertyType> getFlightTransition() {
        if (flightTransition == null) {
            flightTransition = new ArrayList<ProcedureTransitionPropertyType>();
        }
        return this.flightTransition;
    }

    /**
     * Gets the value of the guidanceFacilityNavaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getGuidanceFacilityNavaid() {
        return guidanceFacilityNavaid;
    }

    /**
     * Sets the value of the guidanceFacilityNavaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilityNavaid(JAXBElement<NavaidPropertyType> value) {
        this.guidanceFacilityNavaid = value;
    }

    /**
     * Gets the value of the guidanceFacilitySpecialNavigationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<SpecialNavigationSystemPropertyType> getGuidanceFacilitySpecialNavigationSystem() {
        return guidanceFacilitySpecialNavigationSystem;
    }

    /**
     * Sets the value of the guidanceFacilitySpecialNavigationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilitySpecialNavigationSystem(JAXBElement<SpecialNavigationSystemPropertyType> value) {
        this.guidanceFacilitySpecialNavigationSystem = value;
    }

    /**
     * Gets the value of the guidanceFacilityRadar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadarSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<RadarSystemPropertyType> getGuidanceFacilityRadar() {
        return guidanceFacilityRadar;
    }

    /**
     * Sets the value of the guidanceFacilityRadar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadarSystemPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilityRadar(JAXBElement<RadarSystemPropertyType> value) {
        this.guidanceFacilityRadar = value;
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
     * Gets the value of the safeAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaPropertyType }{@code >}
     *     
     */
    public JAXBElement<SafeAltitudeAreaPropertyType> getSafeAltitude() {
        return safeAltitude;
    }

    /**
     * Sets the value of the safeAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaPropertyType }{@code >}
     *     
     */
    public void setSafeAltitude(JAXBElement<SafeAltitudeAreaPropertyType> value) {
        this.safeAltitude = value;
    }

    /**
     * Gets the value of the approachPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrefixType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachPrefixType> getApproachPrefix() {
        return approachPrefix;
    }

    /**
     * Sets the value of the approachPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrefixType }{@code >}
     *     
     */
    public void setApproachPrefix(JAXBElement<CodeApproachPrefixType> value) {
        this.approachPrefix = value;
    }

    /**
     * Gets the value of the approachType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachType> getApproachType() {
        return approachType;
    }

    /**
     * Sets the value of the approachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public void setApproachType(JAXBElement<CodeApproachType> value) {
        this.approachType = value;
    }

    /**
     * Gets the value of the multipleIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getMultipleIdentification() {
        return multipleIdentification;
    }

    /**
     * Sets the value of the multipleIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setMultipleIdentification(JAXBElement<CodeUpperAlphaType> value) {
        this.multipleIdentification = value;
    }

    /**
     * Gets the value of the copterTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getCopterTrack() {
        return copterTrack;
    }

    /**
     * Sets the value of the copterTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCopterTrack(JAXBElement<ValBearingType> value) {
        this.copterTrack = value;
    }

    /**
     * Gets the value of the circlingIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getCirclingIdentification() {
        return circlingIdentification;
    }

    /**
     * Sets the value of the circlingIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setCirclingIdentification(JAXBElement<CodeUpperAlphaType> value) {
        this.circlingIdentification = value;
    }

    /**
     * Gets the value of the courseReversalInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getCourseReversalInstruction() {
        return courseReversalInstruction;
    }

    /**
     * Sets the value of the courseReversalInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setCourseReversalInstruction(JAXBElement<TextInstructionType> value) {
        this.courseReversalInstruction = value;
    }

    /**
     * Gets the value of the additionalEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachEquipmentAdditionalType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachEquipmentAdditionalType> getAdditionalEquipment() {
        return additionalEquipment;
    }

    /**
     * Sets the value of the additionalEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachEquipmentAdditionalType }{@code >}
     *     
     */
    public void setAdditionalEquipment(JAXBElement<CodeApproachEquipmentAdditionalType> value) {
        this.additionalEquipment = value;
    }

    /**
     * Gets the value of the channelGNSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValChannelNumberType }{@code >}
     *     
     */
    public JAXBElement<ValChannelNumberType> getChannelGNSS() {
        return channelGNSS;
    }

    /**
     * Sets the value of the channelGNSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValChannelNumberType }{@code >}
     *     
     */
    public void setChannelGNSS(JAXBElement<ValChannelNumberType> value) {
        this.channelGNSS = value;
    }

    /**
     * Gets the value of the waasReliable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getWAASReliable() {
        return waasReliable;
    }

    /**
     * Sets the value of the waasReliable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWAASReliable(JAXBElement<CodeYesNoType> value) {
        this.waasReliable = value;
    }

    /**
     * Gets the value of the landing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<LandingTakeoffAreaCollectionPropertyType> getLanding() {
        return landing;
    }

    /**
     * Sets the value of the landing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public void setLanding(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.landing = value;
    }

    /**
     * Gets the value of the missedInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missedInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissedInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissedApproachGroupPropertyType }
     * 
     * 
     */
    public List<MissedApproachGroupPropertyType> getMissedInstruction() {
        if (missedInstruction == null) {
            missedInstruction = new ArrayList<MissedApproachGroupPropertyType>();
        }
        return this.missedInstruction;
    }

    /**
     * Gets the value of the finalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinalProfilePropertyType }{@code >}
     *     
     */
    public JAXBElement<FinalProfilePropertyType> getFinalProfile() {
        return finalProfile;
    }

    /**
     * Sets the value of the finalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinalProfilePropertyType }{@code >}
     *     
     */
    public void setFinalProfile(JAXBElement<FinalProfilePropertyType> value) {
        this.finalProfile = value;
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
     * {@link InstrumentApproachProcedureTimeSliceType.Extension }
     * 
     * 
     */
    public List<InstrumentApproachProcedureTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<InstrumentApproachProcedureTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractInstrumentApproachProcedureExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractProcedureExtension"/>
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
        "abstractInstrumentApproachProcedureExtension",
        "abstractProcedureExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractInstrumentApproachProcedureExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractInstrumentApproachProcedureExtension;
        @XmlElementRef(name = "AbstractProcedureExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractProcedureExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractInstrumentApproachProcedureExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.event.InstrumentApproachProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.extension.fns.InstrumentApproachProcedureExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractInstrumentApproachProcedureExtension() {
            return abstractInstrumentApproachProcedureExtension;
        }

        /**
         * Sets the value of the abstractInstrumentApproachProcedureExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.event.InstrumentApproachProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.extension.fns.InstrumentApproachProcedureExtensionType }{@code >}
         *     
         */
        public void setAbstractInstrumentApproachProcedureExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractInstrumentApproachProcedureExtension = value;
        }

        /**
         * Gets the value of the abstractProcedureExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link aero.aixm.event.ProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.extension.fns.ProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractProcedureExtension() {
            return abstractProcedureExtension;
        }

        /**
         * Sets the value of the abstractProcedureExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link aero.aixm.event.ProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.extension.fns.ProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractProcedureExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractProcedureExtension = value;
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

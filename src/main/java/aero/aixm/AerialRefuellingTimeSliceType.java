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
import aero.aixm.event.AerialRefuellingExtensionType;


/**
 * <p>Java class for AerialRefuellingTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerialRefuellingTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AerialRefuellingPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAerialRefuellingExtension"/>
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
@XmlType(name = "AerialRefuellingTimeSliceType", propOrder = {
    "designatorPrefix",
    "designatorNumber",
    "designatorSuffix",
    "designatorDirection",
    "aixmName",
    "type",
    "radarBeaconSetting",
    "xbandRadarSetting",
    "tankerChannel",
    "receiverChannel",
    "helicopterRoute",
    "specialRefuelling",
    "bidirectionalUse",
    "reverseDirectionTurn",
    "availability",
    "protectingAirspace",
    "track",
    "anchor",
    "oppositeTrack",
    "managingOrganisation",
    "annotation",
    "extension"
})
public class AerialRefuellingTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designatorPrefix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAerialRefuellingPrefixType> designatorPrefix;
    @XmlElementRef(name = "designatorNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> designatorNumber;
    @XmlElementRef(name = "designatorSuffix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designatorSuffix;
    @XmlElementRef(name = "designatorDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> designatorDirection;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAerialRefuellingType> type;
    @XmlElementRef(name = "radarBeaconSetting", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> radarBeaconSetting;
    @XmlElementRef(name = "xbandRadarSetting", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> xbandRadarSetting;
    @XmlElementRef(name = "tankerChannel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTACANChannelType> tankerChannel;
    @XmlElementRef(name = "receiverChannel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTACANChannelType> receiverChannel;
    @XmlElementRef(name = "helicopterRoute", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> helicopterRoute;
    @XmlElementRef(name = "specialRefuelling", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialRefuelling;
    @XmlElementRef(name = "bidirectionalUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> bidirectionalUse;
    @XmlElementRef(name = "reverseDirectionTurn", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> reverseDirectionTurn;
    @XmlElement(nillable = true)
    protected List<RouteAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> protectingAirspace;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingTrackPropertyType> track;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingAnchorPropertyType> anchor;
    @XmlElementRef(name = "oppositeTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> oppositeTrack;
    @XmlElement(nillable = true)
    protected List<AuthorityForAerialRefuellingPropertyType> managingOrganisation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AerialRefuellingTimeSliceType.Extension> extension;

    /**
     * Gets the value of the designatorPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPrefixType }{@code >}
     *     
     */
    public JAXBElement<CodeAerialRefuellingPrefixType> getDesignatorPrefix() {
        return designatorPrefix;
    }

    /**
     * Sets the value of the designatorPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPrefixType }{@code >}
     *     
     */
    public void setDesignatorPrefix(JAXBElement<CodeAerialRefuellingPrefixType> value) {
        this.designatorPrefix = value;
    }

    /**
     * Gets the value of the designatorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getDesignatorNumber() {
        return designatorNumber;
    }

    /**
     * Sets the value of the designatorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setDesignatorNumber(JAXBElement<NoNumberType> value) {
        this.designatorNumber = value;
    }

    /**
     * Gets the value of the designatorSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getDesignatorSuffix() {
        return designatorSuffix;
    }

    /**
     * Sets the value of the designatorSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignatorSuffix(JAXBElement<TextDesignatorType> value) {
        this.designatorSuffix = value;
    }

    /**
     * Gets the value of the designatorDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeCardinalDirectionType> getDesignatorDirection() {
        return designatorDirection;
    }

    /**
     * Sets the value of the designatorDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setDesignatorDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.designatorDirection = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingType }{@code >}
     *     
     */
    public JAXBElement<CodeAerialRefuellingType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAerialRefuellingType> value) {
        this.type = value;
    }

    /**
     * Gets the value of the radarBeaconSetting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getRadarBeaconSetting() {
        return radarBeaconSetting;
    }

    /**
     * Sets the value of the radarBeaconSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setRadarBeaconSetting(JAXBElement<NoNumberType> value) {
        this.radarBeaconSetting = value;
    }

    /**
     * Gets the value of the xbandRadarSetting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getXbandRadarSetting() {
        return xbandRadarSetting;
    }

    /**
     * Sets the value of the xbandRadarSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setXbandRadarSetting(JAXBElement<NoNumberType> value) {
        this.xbandRadarSetting = value;
    }

    /**
     * Gets the value of the tankerChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    public JAXBElement<CodeTACANChannelType> getTankerChannel() {
        return tankerChannel;
    }

    /**
     * Sets the value of the tankerChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    public void setTankerChannel(JAXBElement<CodeTACANChannelType> value) {
        this.tankerChannel = value;
    }

    /**
     * Gets the value of the receiverChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    public JAXBElement<CodeTACANChannelType> getReceiverChannel() {
        return receiverChannel;
    }

    /**
     * Sets the value of the receiverChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    public void setReceiverChannel(JAXBElement<CodeTACANChannelType> value) {
        this.receiverChannel = value;
    }

    /**
     * Gets the value of the helicopterRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getHelicopterRoute() {
        return helicopterRoute;
    }

    /**
     * Sets the value of the helicopterRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setHelicopterRoute(JAXBElement<CodeYesNoType> value) {
        this.helicopterRoute = value;
    }

    /**
     * Gets the value of the specialRefuelling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSpecialRefuelling() {
        return specialRefuelling;
    }

    /**
     * Sets the value of the specialRefuelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialRefuelling(JAXBElement<CodeYesNoType> value) {
        this.specialRefuelling = value;
    }

    /**
     * Gets the value of the bidirectionalUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getBidirectionalUse() {
        return bidirectionalUse;
    }

    /**
     * Sets the value of the bidirectionalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setBidirectionalUse(JAXBElement<CodeYesNoType> value) {
        this.bidirectionalUse = value;
    }

    /**
     * Gets the value of the reverseDirectionTurn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionTurnType> getReverseDirectionTurn() {
        return reverseDirectionTurn;
    }

    /**
     * Sets the value of the reverseDirectionTurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setReverseDirectionTurn(JAXBElement<CodeDirectionTurnType> value) {
        this.reverseDirectionTurn = value;
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
     * {@link RouteAvailabilityPropertyType }
     * 
     * 
     */
    public List<RouteAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<RouteAvailabilityPropertyType>();
        }
        return this.availability;
    }

    /**
     * Gets the value of the protectingAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectingAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectingAirspace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    public List<AirspacePropertyType> getProtectingAirspace() {
        if (protectingAirspace == null) {
            protectingAirspace = new ArrayList<AirspacePropertyType>();
        }
        return this.protectingAirspace;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingTrackPropertyType }
     * 
     * 
     */
    public List<AerialRefuellingTrackPropertyType> getTrack() {
        if (track == null) {
            track = new ArrayList<AerialRefuellingTrackPropertyType>();
        }
        return this.track;
    }

    /**
     * Gets the value of the anchor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnchor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingAnchorPropertyType }
     * 
     * 
     */
    public List<AerialRefuellingAnchorPropertyType> getAnchor() {
        if (anchor == null) {
            anchor = new ArrayList<AerialRefuellingAnchorPropertyType>();
        }
        return this.anchor;
    }

    /**
     * Gets the value of the oppositeTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerialRefuellingPropertyType> getOppositeTrack() {
        return oppositeTrack;
    }

    /**
     * Sets the value of the oppositeTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setOppositeTrack(JAXBElement<AerialRefuellingPropertyType> value) {
        this.oppositeTrack = value;
    }

    /**
     * Gets the value of the managingOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managingOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagingOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityForAerialRefuellingPropertyType }
     * 
     * 
     */
    public List<AuthorityForAerialRefuellingPropertyType> getManagingOrganisation() {
        if (managingOrganisation == null) {
            managingOrganisation = new ArrayList<AuthorityForAerialRefuellingPropertyType>();
        }
        return this.managingOrganisation;
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
     * {@link AerialRefuellingTimeSliceType.Extension }
     * 
     * 
     */
    public List<AerialRefuellingTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AerialRefuellingTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAerialRefuellingExtension"/>
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
        "abstractAerialRefuellingExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAerialRefuellingExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractAerialRefuellingExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractAerialRefuellingExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AerialRefuellingExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAerialRefuellingExtension() {
            return abstractAerialRefuellingExtension;
        }

        /**
         * Sets the value of the abstractAerialRefuellingExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AerialRefuellingExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractAerialRefuellingExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAerialRefuellingExtension = value;
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
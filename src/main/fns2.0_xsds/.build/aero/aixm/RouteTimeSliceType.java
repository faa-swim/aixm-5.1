//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
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
import aero.aixm.event.RouteExtensionType;


/**
 * <p>Java class for RouteTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RoutePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRouteExtension"/>
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
@XmlType(name = "RouteTimeSliceType", propOrder = {
    "designatorPrefix",
    "designatorSecondLetter",
    "designatorNumber",
    "multipleIdentifier",
    "locationDesignator",
    "aixmName",
    "type",
    "flightRule",
    "internationalUse",
    "militaryUse",
    "militaryTrainingType",
    "userOrganisation",
    "annotation",
    "extension"
})
public class RouteTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designatorPrefix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorPrefixType> designatorPrefix;
    @XmlElementRef(name = "designatorSecondLetter", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorLetterType> designatorSecondLetter;
    @XmlElementRef(name = "designatorNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> designatorNumber;
    @XmlElementRef(name = "multipleIdentifier", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> multipleIdentifier;
    @XmlElementRef(name = "locationDesignator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> locationDesignator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteType> type;
    @XmlElementRef(name = "flightRule", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightRuleType> flightRule;
    @XmlElementRef(name = "internationalUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteOriginType> internationalUse;
    @XmlElementRef(name = "militaryUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryStatusType> militaryUse;
    @XmlElementRef(name = "militaryTrainingType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryTrainingType> militaryTrainingType;
    @XmlElementRef(name = "userOrganisation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> userOrganisation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RouteTimeSliceType.Extension> extension;

    /**
     * Gets the value of the designatorPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorPrefixType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteDesignatorPrefixType> getDesignatorPrefix() {
        return designatorPrefix;
    }

    /**
     * Sets the value of the designatorPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorPrefixType }{@code >}
     *     
     */
    public void setDesignatorPrefix(JAXBElement<CodeRouteDesignatorPrefixType> value) {
        this.designatorPrefix = value;
    }

    public boolean isSetDesignatorPrefix() {
        return (this.designatorPrefix!= null);
    }

    /**
     * Gets the value of the designatorSecondLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorLetterType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteDesignatorLetterType> getDesignatorSecondLetter() {
        return designatorSecondLetter;
    }

    /**
     * Sets the value of the designatorSecondLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorLetterType }{@code >}
     *     
     */
    public void setDesignatorSecondLetter(JAXBElement<CodeRouteDesignatorLetterType> value) {
        this.designatorSecondLetter = value;
    }

    public boolean isSetDesignatorSecondLetter() {
        return (this.designatorSecondLetter!= null);
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

    public boolean isSetDesignatorNumber() {
        return (this.designatorNumber!= null);
    }

    /**
     * Gets the value of the multipleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getMultipleIdentifier() {
        return multipleIdentifier;
    }

    /**
     * Sets the value of the multipleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setMultipleIdentifier(JAXBElement<CodeUpperAlphaType> value) {
        this.multipleIdentifier = value;
    }

    public boolean isSetMultipleIdentifier() {
        return (this.multipleIdentifier!= null);
    }

    /**
     * Gets the value of the locationDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getLocationDesignator() {
        return locationDesignator;
    }

    /**
     * Sets the value of the locationDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setLocationDesignator(JAXBElement<TextDesignatorType> value) {
        this.locationDesignator = value;
    }

    public boolean isSetLocationDesignator() {
        return (this.locationDesignator!= null);
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

    public boolean isSetAIXMName() {
        return (this.aixmName!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRouteType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the flightRule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public JAXBElement<CodeFlightRuleType> getFlightRule() {
        return flightRule;
    }

    /**
     * Sets the value of the flightRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public void setFlightRule(JAXBElement<CodeFlightRuleType> value) {
        this.flightRule = value;
    }

    public boolean isSetFlightRule() {
        return (this.flightRule!= null);
    }

    /**
     * Gets the value of the internationalUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteOriginType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteOriginType> getInternationalUse() {
        return internationalUse;
    }

    /**
     * Sets the value of the internationalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteOriginType }{@code >}
     *     
     */
    public void setInternationalUse(JAXBElement<CodeRouteOriginType> value) {
        this.internationalUse = value;
    }

    public boolean isSetInternationalUse() {
        return (this.internationalUse!= null);
    }

    /**
     * Gets the value of the militaryUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryStatusType> getMilitaryUse() {
        return militaryUse;
    }

    /**
     * Sets the value of the militaryUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    public void setMilitaryUse(JAXBElement<CodeMilitaryStatusType> value) {
        this.militaryUse = value;
    }

    public boolean isSetMilitaryUse() {
        return (this.militaryUse!= null);
    }

    /**
     * Gets the value of the militaryTrainingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryTrainingType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryTrainingType> getMilitaryTrainingType() {
        return militaryTrainingType;
    }

    /**
     * Sets the value of the militaryTrainingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryTrainingType }{@code >}
     *     
     */
    public void setMilitaryTrainingType(JAXBElement<CodeMilitaryTrainingType> value) {
        this.militaryTrainingType = value;
    }

    public boolean isSetMilitaryTrainingType() {
        return (this.militaryTrainingType!= null);
    }

    /**
     * Gets the value of the userOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public JAXBElement<OrganisationAuthorityPropertyType> getUserOrganisation() {
        return userOrganisation;
    }

    /**
     * Sets the value of the userOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setUserOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.userOrganisation = value;
    }

    public boolean isSetUserOrganisation() {
        return (this.userOrganisation!= null);
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

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
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
     * {@link RouteTimeSliceType.Extension }
     * 
     * 
     */
    public List<RouteTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RouteTimeSliceType.Extension>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRouteExtension"/>
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
        "abstractRouteExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRouteExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRouteExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractRouteExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RouteExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRouteExtension() {
            return abstractRouteExtension;
        }

        /**
         * Sets the value of the abstractRouteExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RouteExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRouteExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRouteExtension = value;
        }

        public boolean isSetAbstractRouteExtension() {
            return (this.abstractRouteExtension!= null);
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
        public void setOwns(boolean value) {
            this.owns = value;
        }

        public boolean isSetOwns() {
            return (this.owns!= null);
        }

        public void unsetOwns() {
            this.owns = null;
        }

    }

}

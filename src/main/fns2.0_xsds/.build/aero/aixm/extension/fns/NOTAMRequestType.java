//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm.extension.fns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMObjectType;
import aero.aixm.AbstractExtensionType;
import aero.aixm.TextPhoneType;


/**
 * <p>Java class for NOTAMRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOTAMRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us.gov.dot.faa.aim.fns}NOTAMRequestPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{urn:us.gov.dot.faa.aim.fns}AbstractNOTAMRequestExtension"/>
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
@XmlType(name = "NOTAMRequestType", propOrder = {
    "scenarioType",
    "requestAction",
    "originatorFirstName",
    "originatorLastName",
    "originatorEmail",
    "originatorPhone",
    "originatorRemark",
    "fnsnotam",
    "extension"
})
public class NOTAMRequestType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "scenarioType", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scenarioType;
    @XmlElementRef(name = "requestAction", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNOTAMRequestActionBaseType> requestAction;
    @XmlElementRef(name = "originatorFirstName", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originatorFirstName;
    @XmlElementRef(name = "originatorLastName", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originatorLastName;
    @XmlElementRef(name = "originatorEmail", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originatorEmail;
    @XmlElementRef(name = "originatorPhone", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<TextPhoneType> originatorPhone;
    @XmlElementRef(name = "originatorRemark", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originatorRemark;
    @XmlElementRef(name = "FNS_NOTAM", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<FNSNOTAMPropertyType> fnsnotam;
    protected List<NOTAMRequestType.Extension> extension;

    /**
     * Gets the value of the scenarioType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScenarioType() {
        return scenarioType;
    }

    /**
     * Sets the value of the scenarioType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScenarioType(JAXBElement<String> value) {
        this.scenarioType = value;
    }

    public boolean isSetScenarioType() {
        return (this.scenarioType!= null);
    }

    /**
     * Gets the value of the requestAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMRequestActionBaseType }{@code >}
     *     
     */
    public JAXBElement<CodeNOTAMRequestActionBaseType> getRequestAction() {
        return requestAction;
    }

    /**
     * Sets the value of the requestAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMRequestActionBaseType }{@code >}
     *     
     */
    public void setRequestAction(JAXBElement<CodeNOTAMRequestActionBaseType> value) {
        this.requestAction = value;
    }

    public boolean isSetRequestAction() {
        return (this.requestAction!= null);
    }

    /**
     * Gets the value of the originatorFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginatorFirstName() {
        return originatorFirstName;
    }

    /**
     * Sets the value of the originatorFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginatorFirstName(JAXBElement<String> value) {
        this.originatorFirstName = value;
    }

    public boolean isSetOriginatorFirstName() {
        return (this.originatorFirstName!= null);
    }

    /**
     * Gets the value of the originatorLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginatorLastName() {
        return originatorLastName;
    }

    /**
     * Sets the value of the originatorLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginatorLastName(JAXBElement<String> value) {
        this.originatorLastName = value;
    }

    public boolean isSetOriginatorLastName() {
        return (this.originatorLastName!= null);
    }

    /**
     * Gets the value of the originatorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginatorEmail() {
        return originatorEmail;
    }

    /**
     * Sets the value of the originatorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginatorEmail(JAXBElement<String> value) {
        this.originatorEmail = value;
    }

    public boolean isSetOriginatorEmail() {
        return (this.originatorEmail!= null);
    }

    /**
     * Gets the value of the originatorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextPhoneType }{@code >}
     *     
     */
    public JAXBElement<TextPhoneType> getOriginatorPhone() {
        return originatorPhone;
    }

    /**
     * Sets the value of the originatorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextPhoneType }{@code >}
     *     
     */
    public void setOriginatorPhone(JAXBElement<TextPhoneType> value) {
        this.originatorPhone = value;
    }

    public boolean isSetOriginatorPhone() {
        return (this.originatorPhone!= null);
    }

    /**
     * Gets the value of the originatorRemark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginatorRemark() {
        return originatorRemark;
    }

    /**
     * Sets the value of the originatorRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginatorRemark(JAXBElement<String> value) {
        this.originatorRemark = value;
    }

    public boolean isSetOriginatorRemark() {
        return (this.originatorRemark!= null);
    }

    /**
     * Gets the value of the fnsnotam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FNSNOTAMPropertyType }{@code >}
     *     
     */
    public JAXBElement<FNSNOTAMPropertyType> getFNSNOTAM() {
        return fnsnotam;
    }

    /**
     * Sets the value of the fnsnotam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FNSNOTAMPropertyType }{@code >}
     *     
     */
    public void setFNSNOTAM(JAXBElement<FNSNOTAMPropertyType> value) {
        this.fnsnotam = value;
    }

    public boolean isSetFNSNOTAM() {
        return (this.fnsnotam!= null);
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
     * {@link NOTAMRequestType.Extension }
     * 
     * 
     */
    public List<NOTAMRequestType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NOTAMRequestType.Extension>();
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
     *         &lt;element ref="{urn:us.gov.dot.faa.aim.fns}AbstractNOTAMRequestExtension"/>
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
        "abstractNOTAMRequestExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractNOTAMRequestExtension", required = true)
        protected AbstractExtensionType abstractNOTAMRequestExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractNOTAMRequestExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractNOTAMRequestExtension() {
            return abstractNOTAMRequestExtension;
        }

        /**
         * Sets the value of the abstractNOTAMRequestExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractNOTAMRequestExtension(AbstractExtensionType value) {
            this.abstractNOTAMRequestExtension = value;
        }

        public boolean isSetAbstractNOTAMRequestExtension() {
            return (this.abstractNOTAMRequestExtension!= null);
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

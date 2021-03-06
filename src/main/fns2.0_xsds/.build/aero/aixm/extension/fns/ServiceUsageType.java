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
import aero.aixm.AbstractExtensionType;
import aero.aixm.AbstractUsageConditionType;
import aero.aixm.CodeUsageLimitationType;
import aero.aixm.ConditionCombinationPropertyType;
import aero.aixm.ContactInformationPropertyType;
import aero.aixm.NotePropertyType;
import aero.aixm.ValDurationType;


/**
 * <p>Java class for ServiceUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceUsageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractUsageConditionType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}UsageConditionPropertyGroup"/>
 *         &lt;group ref="{urn:us.gov.dot.faa.aim.fns}ServiceUsagePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractUsageConditionExtension"/>
 *                   &lt;element ref="{urn:us.gov.dot.faa.aim.fns}AbstractServiceUsageExtension"/>
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
@XmlType(name = "ServiceUsageType", propOrder = {
    "type",
    "priorPermission",
    "contact",
    "selection",
    "annotation",
    "extension"
})
public class ServiceUsageType
    extends AbstractUsageConditionType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUsageLimitationType> type;
    @XmlElementRef(name = "priorPermission", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> priorPermission;
    @XmlElement(namespace = "http://www.aixm.aero/schema/5.1", nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElementRef(name = "selection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionCombinationPropertyType> selection;
    @XmlElement(namespace = "http://www.aixm.aero/schema/5.1", nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ServiceUsageType.Extension> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUsageLimitationType }{@code >}
     *     
     */
    public JAXBElement<CodeUsageLimitationType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUsageLimitationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeUsageLimitationType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the priorPermission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getPriorPermission() {
        return priorPermission;
    }

    /**
     * Sets the value of the priorPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setPriorPermission(JAXBElement<ValDurationType> value) {
        this.priorPermission = value;
    }

    public boolean isSetPriorPermission() {
        return (this.priorPermission!= null);
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

    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationPropertyType }{@code >}
     *     
     */
    public JAXBElement<ConditionCombinationPropertyType> getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationPropertyType }{@code >}
     *     
     */
    public void setSelection(JAXBElement<ConditionCombinationPropertyType> value) {
        this.selection = value;
    }

    public boolean isSetSelection() {
        return (this.selection!= null);
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
     * {@link ServiceUsageType.Extension }
     * 
     * 
     */
    public List<ServiceUsageType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ServiceUsageType.Extension>();
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractUsageConditionExtension"/>
     *         &lt;element ref="{urn:us.gov.dot.faa.aim.fns}AbstractServiceUsageExtension"/>
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
        "abstractUsageConditionExtension",
        "abstractServiceUsageExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractUsageConditionExtension", namespace = "http://www.aixm.aero/schema/5.1")
        protected AbstractExtensionType abstractUsageConditionExtension;
        @XmlElement(name = "AbstractServiceUsageExtension")
        protected AbstractExtensionType abstractServiceUsageExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractUsageConditionExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractUsageConditionExtension() {
            return abstractUsageConditionExtension;
        }

        /**
         * Sets the value of the abstractUsageConditionExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractUsageConditionExtension(AbstractExtensionType value) {
            this.abstractUsageConditionExtension = value;
        }

        public boolean isSetAbstractUsageConditionExtension() {
            return (this.abstractUsageConditionExtension!= null);
        }

        /**
         * Gets the value of the abstractServiceUsageExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractServiceUsageExtension() {
            return abstractServiceUsageExtension;
        }

        /**
         * Sets the value of the abstractServiceUsageExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractServiceUsageExtension(AbstractExtensionType value) {
            this.abstractServiceUsageExtension = value;
        }

        public boolean isSetAbstractServiceUsageExtension() {
            return (this.abstractServiceUsageExtension!= null);
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

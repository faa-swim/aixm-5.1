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
import aero.aixm.event.StandardLevelColumnExtensionType;


/**
 * <p>Java class for StandardLevelColumnTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardLevelColumnTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}StandardLevelColumnPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardLevelColumnExtension"/>
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
@XmlType(name = "StandardLevelColumnTimeSliceType", propOrder = {
    "series",
    "unitOfMeasurement",
    "separation",
    "level",
    "levelTable",
    "annotation",
    "extension"
})
public class StandardLevelColumnTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "series", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLevelSeriesType> series;
    @XmlElementRef(name = "unitOfMeasurement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasurement;
    @XmlElementRef(name = "separation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRVSMType> separation;
    @XmlElement(nillable = true)
    protected List<StandardLevelPropertyType> level;
    @XmlElementRef(name = "levelTable", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardLevelTablePropertyType> levelTable;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<StandardLevelColumnTimeSliceType.Extension> extension;

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelSeriesType }{@code >}
     *     
     */
    public JAXBElement<CodeLevelSeriesType> getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelSeriesType }{@code >}
     *     
     */
    public void setSeries(JAXBElement<CodeLevelSeriesType> value) {
        this.series = value;
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasurement(JAXBElement<String> value) {
        this.unitOfMeasurement = value;
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public JAXBElement<CodeRVSMType> getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public void setSeparation(JAXBElement<CodeRVSMType> value) {
        this.separation = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardLevelPropertyType }
     * 
     * 
     */
    public List<StandardLevelPropertyType> getLevel() {
        if (level == null) {
            level = new ArrayList<StandardLevelPropertyType>();
        }
        return this.level;
    }

    /**
     * Gets the value of the levelTable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelTablePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardLevelTablePropertyType> getLevelTable() {
        return levelTable;
    }

    /**
     * Sets the value of the levelTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelTablePropertyType }{@code >}
     *     
     */
    public void setLevelTable(JAXBElement<StandardLevelTablePropertyType> value) {
        this.levelTable = value;
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
     * {@link StandardLevelColumnTimeSliceType.Extension }
     * 
     * 
     */
    public List<StandardLevelColumnTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<StandardLevelColumnTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardLevelColumnExtension"/>
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
        "abstractStandardLevelColumnExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractStandardLevelColumnExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractStandardLevelColumnExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractStandardLevelColumnExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StandardLevelColumnExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractStandardLevelColumnExtension() {
            return abstractStandardLevelColumnExtension;
        }

        /**
         * Sets the value of the abstractStandardLevelColumnExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StandardLevelColumnExtensionType }{@code >}
         *     
         */
        public void setAbstractStandardLevelColumnExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractStandardLevelColumnExtension = value;
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
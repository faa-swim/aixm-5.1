//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirTrafficControlServiceTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTrafficControlServiceTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirTrafficControlServiceTimeSlice"/>
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
@XmlType(name = "AirTrafficControlServiceTimeSlicePropertyType", propOrder = {
    "airTrafficControlServiceTimeSlice"
})
public class AirTrafficControlServiceTimeSlicePropertyType {

    @XmlElement(name = "AirTrafficControlServiceTimeSlice", required = true)
    protected AirTrafficControlServiceTimeSliceType airTrafficControlServiceTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the airTrafficControlServiceTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link AirTrafficControlServiceTimeSliceType }
     *     
     */
    public AirTrafficControlServiceTimeSliceType getAirTrafficControlServiceTimeSlice() {
        return airTrafficControlServiceTimeSlice;
    }

    /**
     * Sets the value of the airTrafficControlServiceTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTrafficControlServiceTimeSliceType }
     *     
     */
    public void setAirTrafficControlServiceTimeSlice(AirTrafficControlServiceTimeSliceType value) {
        this.airTrafficControlServiceTimeSlice = value;
    }

    public boolean isSetAirTrafficControlServiceTimeSlice() {
        return (this.airTrafficControlServiceTimeSlice!= null);
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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirspaceLayerPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirspaceLayerPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirspaceLayer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceLayerPropertyType", propOrder = {
    "airspaceLayer"
})
public class AirspaceLayerPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceLayer", required = true)
    protected AirspaceLayerType airspaceLayer;

    /**
     * Gets the value of the airspaceLayer property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceLayerType }
     *     
     */
    public AirspaceLayerType getAirspaceLayer() {
        return airspaceLayer;
    }

    /**
     * Sets the value of the airspaceLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceLayerType }
     *     
     */
    public void setAirspaceLayer(AirspaceLayerType value) {
        this.airspaceLayer = value;
    }

}
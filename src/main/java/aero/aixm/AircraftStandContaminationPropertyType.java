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
 * <p>Java class for AircraftStandContaminationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftStandContaminationPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AircraftStandContamination"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftStandContaminationPropertyType", propOrder = {
    "aircraftStandContamination"
})
public class AircraftStandContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AircraftStandContamination", required = true)
    protected AircraftStandContaminationType aircraftStandContamination;

    /**
     * Gets the value of the aircraftStandContamination property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public AircraftStandContaminationType getAircraftStandContamination() {
        return aircraftStandContamination;
    }

    /**
     * Sets the value of the aircraftStandContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public void setAircraftStandContamination(AircraftStandContaminationType value) {
        this.aircraftStandContamination = value;
    }

}
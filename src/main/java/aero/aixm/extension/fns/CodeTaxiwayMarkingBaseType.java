//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm.extension.fns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeTaxiwayMarkingBaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeTaxiwayMarkingBaseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHOULDER"/>
 *     &lt;enumeration value="DIRECTION"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="GEOGRAPHIC_POS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodeTaxiwayMarkingBaseType")
@XmlEnum
public enum CodeTaxiwayMarkingBaseType {

    SHOULDER,
    DIRECTION,
    LOCATION,
    GEOGRAPHIC_POS;

    public String value() {
        return name();
    }

    public static CodeTaxiwayMarkingBaseType fromValue(String v) {
        return valueOf(v);
    }

}
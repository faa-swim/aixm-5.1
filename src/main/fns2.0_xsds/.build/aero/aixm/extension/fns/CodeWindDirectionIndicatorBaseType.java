//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm.extension.fns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeWindDirectionIndicatorBaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeWindDirectionIndicatorBaseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WINDCONE"/>
 *     &lt;enumeration value="TETRAHEDRON"/>
 *     &lt;enumeration value="WIND_TEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodeWindDirectionIndicatorBaseType")
@XmlEnum
public enum CodeWindDirectionIndicatorBaseType {

    WINDCONE,
    TETRAHEDRON,
    WIND_TEE;

    public String value() {
        return name();
    }

    public static CodeWindDirectionIndicatorBaseType fromValue(String v) {
        return valueOf(v);
    }

}

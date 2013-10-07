//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 11:36:33 AM BST 
//


package ibm.soatest.config.jms;

import ibm.soatest.config.jms.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 *                 Currently supporting only one module and connection factory per JMS server.
 *                 
 *             
 * 
 * <p>Java class for JMSServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JMSServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="User identification information" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JMSServer", propOrder = {
    "serverName"
})
public class JMSServer {

    @XmlElement(required = true)
    protected String serverName;
    @XmlAttribute(name = "identificator")
    protected String identificator;

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the identificator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificator() {
        if (identificator == null) {
            return "User identification information";
        } else {
            return identificator;
        }
    }

    /**
     * Sets the value of the identificator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificator(String value) {
        this.identificator = value;
    }

}

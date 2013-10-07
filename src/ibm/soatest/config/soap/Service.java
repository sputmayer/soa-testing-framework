//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 11:36:33 AM BST 
//


package ibm.soatest.config.soap;

import ibm.soatest.config.soap.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 *                 SOAP protocol configuration.
 *                 
 *                 Currently only transport over HTTP protocol supported!
 *                 
 *                 SMTP and JMS protocol should be supported in future.
 *                 
 *             
 * 
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endPointUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wsdlUriSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="User identification name of the service" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "serviceName",
    "endPointUri",
    "wsdlUriSuffix",
    "operationName",
    "requestName"
})
public class Service {

    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String endPointUri;
    @XmlElement(required = true, defaultValue = "?wsdl")
    protected String wsdlUriSuffix;
    @XmlElement(required = true)
    protected String operationName;
    @XmlElement(required = true, defaultValue = "request")
    protected String requestName;
    @XmlAttribute(name = "identificator")
    protected String identificator;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the endPointUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPointUri() {
        return endPointUri;
    }

    /**
     * Sets the value of the endPointUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPointUri(String value) {
        this.endPointUri = value;
    }

    /**
     * Gets the value of the wsdlUriSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlUriSuffix() {
        return wsdlUriSuffix;
    }

    /**
     * Sets the value of the wsdlUriSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlUriSuffix(String value) {
        this.wsdlUriSuffix = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the requestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestName() {
        return requestName;
    }

    /**
     * Sets the value of the requestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestName(String value) {
        this.requestName = value;
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
            return "User identification name of the service";
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

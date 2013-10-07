//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 01:37:36 PM BST 
//


package ibm.soatest.config.jms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionFactory" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="Custom user identification information" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="queue" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="Custom user identification information" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="topic" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="Custom user identification information" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resources", propOrder = {
    "connectionFactory",
    "queue",
    "topic"
})
public class Resources {

    @XmlElement(required = true)
    protected List<Resources.ConnectionFactory> connectionFactory;
    protected List<Resources.Queue> queue;
    protected List<Resources.Topic> topic;

    /**
     * Gets the value of the connectionFactory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionFactory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resources.ConnectionFactory }
     * 
     * 
     */
    public List<Resources.ConnectionFactory> getConnectionFactory() {
        if (connectionFactory == null) {
            connectionFactory = new ArrayList<Resources.ConnectionFactory>();
        }
        return this.connectionFactory;
    }

    /**
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resources.Queue }
     * 
     * 
     */
    public List<Resources.Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<Resources.Queue>();
        }
        return this.queue;
    }

    /**
     * Gets the value of the topic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resources.Topic }
     * 
     * 
     */
    public List<Resources.Topic> getTopic() {
        if (topic == null) {
            topic = new ArrayList<Resources.Topic>();
        }
        return this.topic;
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
     *       &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="Custom user identification information" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConnectionFactory {

        @XmlAttribute(name = "identificator")
        protected String identificator;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "jndiName")
        protected String jndiName;

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
                return "Custom user identification information";
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

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the jndiName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJndiName() {
            return jndiName;
        }

        /**
         * Sets the value of the jndiName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJndiName(String value) {
            this.jndiName = value;
        }

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
     *       &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="Custom user identification information" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Queue {

        @XmlAttribute(name = "identificator")
        protected String identificator;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "jndiName")
        protected String jndiName;

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
                return "Custom user identification information";
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

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the jndiName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJndiName() {
            return jndiName;
        }

        /**
         * Sets the value of the jndiName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJndiName(String value) {
            this.jndiName = value;
        }

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
     *       &lt;attribute name="identificator" type="{http://www.w3.org/2001/XMLSchema}string" default="Custom user identification information" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Topic {

        @XmlAttribute(name = "identificator")
        protected String identificator;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "jndiName")
        protected String jndiName;

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
                return "Custom user identification information";
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

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the jndiName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJndiName() {
            return jndiName;
        }

        /**
         * Sets the value of the jndiName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJndiName(String value) {
            this.jndiName = value;
        }

    }

}

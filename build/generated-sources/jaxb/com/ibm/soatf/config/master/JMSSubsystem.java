//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.02 at 10:57:17 AM BST 
//


package com.ibm.soatf.config.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JMSSubsystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JMSSubsystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="server" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subdeployments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subdeployment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="jmsModule">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resources">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="type">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Connection Factory"/>
 *                                   &lt;enumeration value="Queue"/>
 *                                   &lt;enumeration value="Topic"/>
 *                                   &lt;enumeration value="Uniform Distributed Queue"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="targets" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "JMSSubsystem", propOrder = {
    "servers",
    "subdeployments",
    "jmsModule"
})
public class JMSSubsystem {

    @XmlElement(required = true)
    protected JMSSubsystem.Servers servers;
    @XmlElement(required = true)
    protected JMSSubsystem.Subdeployments subdeployments;
    @XmlElement(required = true)
    protected JMSSubsystem.JmsModule jmsModule;

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link JMSSubsystem.Servers }
     *     
     */
    public JMSSubsystem.Servers getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JMSSubsystem.Servers }
     *     
     */
    public void setServers(JMSSubsystem.Servers value) {
        this.servers = value;
    }

    /**
     * Gets the value of the subdeployments property.
     * 
     * @return
     *     possible object is
     *     {@link JMSSubsystem.Subdeployments }
     *     
     */
    public JMSSubsystem.Subdeployments getSubdeployments() {
        return subdeployments;
    }

    /**
     * Sets the value of the subdeployments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JMSSubsystem.Subdeployments }
     *     
     */
    public void setSubdeployments(JMSSubsystem.Subdeployments value) {
        this.subdeployments = value;
    }

    /**
     * Gets the value of the jmsModule property.
     * 
     * @return
     *     possible object is
     *     {@link JMSSubsystem.JmsModule }
     *     
     */
    public JMSSubsystem.JmsModule getJmsModule() {
        return jmsModule;
    }

    /**
     * Sets the value of the jmsModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JMSSubsystem.JmsModule }
     *     
     */
    public void setJmsModule(JMSSubsystem.JmsModule value) {
        this.jmsModule = value;
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
     *         &lt;element name="resources">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="type">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Connection Factory"/>
     *                         &lt;enumeration value="Queue"/>
     *                         &lt;enumeration value="Topic"/>
     *                         &lt;enumeration value="Uniform Distributed Queue"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="targets" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resources"
    })
    public static class JmsModule {

        @XmlElement(required = true)
        protected JMSSubsystem.JmsModule.Resources resources;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the resources property.
         * 
         * @return
         *     possible object is
         *     {@link JMSSubsystem.JmsModule.Resources }
         *     
         */
        public JMSSubsystem.JmsModule.Resources getResources() {
            return resources;
        }

        /**
         * Sets the value of the resources property.
         * 
         * @param value
         *     allowed object is
         *     {@link JMSSubsystem.JmsModule.Resources }
         *     
         */
        public void setResources(JMSSubsystem.JmsModule.Resources value) {
            this.resources = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="type">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Connection Factory"/>
         *               &lt;enumeration value="Queue"/>
         *               &lt;enumeration value="Topic"/>
         *               &lt;enumeration value="Uniform Distributed Queue"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="targets" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "type",
            "jndiName",
            "targets"
        })
        public static class Resources {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String type;
            @XmlElement(required = true)
            protected String jndiName;
            @XmlElement(required = true)
            protected String targets;

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
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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

            /**
             * Gets the value of the targets property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargets() {
                return targets;
            }

            /**
             * Sets the value of the targets property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargets(String value) {
                this.targets = value;
            }

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
     *       &lt;sequence>
     *         &lt;element name="server" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "server"
    })
    public static class Servers {

        protected List<JMSSubsystem.Servers.Server> server;

        /**
         * Gets the value of the server property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the server property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JMSSubsystem.Servers.Server }
         * 
         * 
         */
        public List<JMSSubsystem.Servers.Server> getServer() {
            if (server == null) {
                server = new ArrayList<JMSSubsystem.Servers.Server>();
            }
            return this.server;
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
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Server {

            @XmlAttribute(name = "name")
            protected String name;

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
     *       &lt;sequence>
     *         &lt;element name="subdeployment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "subdeployment"
    })
    public static class Subdeployments {

        @XmlElement(required = true)
        protected JMSSubsystem.Subdeployments.Subdeployment subdeployment;

        /**
         * Gets the value of the subdeployment property.
         * 
         * @return
         *     possible object is
         *     {@link JMSSubsystem.Subdeployments.Subdeployment }
         *     
         */
        public JMSSubsystem.Subdeployments.Subdeployment getSubdeployment() {
            return subdeployment;
        }

        /**
         * Sets the value of the subdeployment property.
         * 
         * @param value
         *     allowed object is
         *     {@link JMSSubsystem.Subdeployments.Subdeployment }
         *     
         */
        public void setSubdeployment(JMSSubsystem.Subdeployments.Subdeployment value) {
            this.subdeployment = value;
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
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Subdeployment {

            @XmlAttribute(name = "name")
            protected String name;

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

        }

    }

}
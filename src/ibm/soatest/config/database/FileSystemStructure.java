//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 01:37:36 PM BST 
//


package ibm.soatest.config.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSystemStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSystemStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootFolder">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selectStatementFolder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="selectStatementFile">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select.sql" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="insertStatementFolder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="insertStatementFile">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert.sql" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="updateStatementFolder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="updateStatementFile">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update.sql" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deleteStatementFolder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="deleteStatementFile">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete.sql" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="database" />
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
@XmlType(name = "FileSystemStructure", propOrder = {
    "rootFolder"
})
public class FileSystemStructure {

    @XmlElement(required = true)
    protected FileSystemStructure.RootFolder rootFolder;

    /**
     * Gets the value of the rootFolder property.
     * 
     * @return
     *     possible object is
     *     {@link FileSystemStructure.RootFolder }
     *     
     */
    public FileSystemStructure.RootFolder getRootFolder() {
        return rootFolder;
    }

    /**
     * Sets the value of the rootFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSystemStructure.RootFolder }
     *     
     */
    public void setRootFolder(FileSystemStructure.RootFolder value) {
        this.rootFolder = value;
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
     *         &lt;element name="selectStatementFolder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="selectStatementFile">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select.sql" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="insertStatementFolder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="insertStatementFile">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert.sql" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="updateStatementFolder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="updateStatementFile">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update.sql" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deleteStatementFolder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="deleteStatementFile">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete.sql" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="database" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selectStatementFolder",
        "insertStatementFolder",
        "updateStatementFolder",
        "deleteStatementFolder"
    })
    public static class RootFolder {

        @XmlElement(required = true)
        protected FileSystemStructure.RootFolder.SelectStatementFolder selectStatementFolder;
        @XmlElement(required = true)
        protected FileSystemStructure.RootFolder.InsertStatementFolder insertStatementFolder;
        @XmlElement(required = true)
        protected FileSystemStructure.RootFolder.UpdateStatementFolder updateStatementFolder;
        @XmlElement(required = true)
        protected FileSystemStructure.RootFolder.DeleteStatementFolder deleteStatementFolder;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the selectStatementFolder property.
         * 
         * @return
         *     possible object is
         *     {@link FileSystemStructure.RootFolder.SelectStatementFolder }
         *     
         */
        public FileSystemStructure.RootFolder.SelectStatementFolder getSelectStatementFolder() {
            return selectStatementFolder;
        }

        /**
         * Sets the value of the selectStatementFolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileSystemStructure.RootFolder.SelectStatementFolder }
         *     
         */
        public void setSelectStatementFolder(FileSystemStructure.RootFolder.SelectStatementFolder value) {
            this.selectStatementFolder = value;
        }

        /**
         * Gets the value of the insertStatementFolder property.
         * 
         * @return
         *     possible object is
         *     {@link FileSystemStructure.RootFolder.InsertStatementFolder }
         *     
         */
        public FileSystemStructure.RootFolder.InsertStatementFolder getInsertStatementFolder() {
            return insertStatementFolder;
        }

        /**
         * Sets the value of the insertStatementFolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileSystemStructure.RootFolder.InsertStatementFolder }
         *     
         */
        public void setInsertStatementFolder(FileSystemStructure.RootFolder.InsertStatementFolder value) {
            this.insertStatementFolder = value;
        }

        /**
         * Gets the value of the updateStatementFolder property.
         * 
         * @return
         *     possible object is
         *     {@link FileSystemStructure.RootFolder.UpdateStatementFolder }
         *     
         */
        public FileSystemStructure.RootFolder.UpdateStatementFolder getUpdateStatementFolder() {
            return updateStatementFolder;
        }

        /**
         * Sets the value of the updateStatementFolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileSystemStructure.RootFolder.UpdateStatementFolder }
         *     
         */
        public void setUpdateStatementFolder(FileSystemStructure.RootFolder.UpdateStatementFolder value) {
            this.updateStatementFolder = value;
        }

        /**
         * Gets the value of the deleteStatementFolder property.
         * 
         * @return
         *     possible object is
         *     {@link FileSystemStructure.RootFolder.DeleteStatementFolder }
         *     
         */
        public FileSystemStructure.RootFolder.DeleteStatementFolder getDeleteStatementFolder() {
            return deleteStatementFolder;
        }

        /**
         * Sets the value of the deleteStatementFolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link FileSystemStructure.RootFolder.DeleteStatementFolder }
         *     
         */
        public void setDeleteStatementFolder(FileSystemStructure.RootFolder.DeleteStatementFolder value) {
            this.deleteStatementFolder = value;
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
            if (name == null) {
                return "database";
            } else {
                return name;
            }
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
         *         &lt;element name="deleteStatementFile">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete.sql" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "deleteStatementFile"
        })
        public static class DeleteStatementFolder {

            @XmlElement(required = true)
            protected FileSystemStructure.RootFolder.DeleteStatementFolder.DeleteStatementFile deleteStatementFile;
            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Gets the value of the deleteStatementFile property.
             * 
             * @return
             *     possible object is
             *     {@link FileSystemStructure.RootFolder.DeleteStatementFolder.DeleteStatementFile }
             *     
             */
            public FileSystemStructure.RootFolder.DeleteStatementFolder.DeleteStatementFile getDeleteStatementFile() {
                return deleteStatementFile;
            }

            /**
             * Sets the value of the deleteStatementFile property.
             * 
             * @param value
             *     allowed object is
             *     {@link FileSystemStructure.RootFolder.DeleteStatementFolder.DeleteStatementFile }
             *     
             */
            public void setDeleteStatementFile(FileSystemStructure.RootFolder.DeleteStatementFolder.DeleteStatementFile value) {
                this.deleteStatementFile = value;
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
                if (name == null) {
                    return "delete";
                } else {
                    return name;
                }
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
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="delete.sql" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DeleteStatementFile {

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
                    if (name == null) {
                        return "delete.sql";
                    } else {
                        return name;
                    }
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
         *         &lt;element name="insertStatementFile">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert.sql" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "insertStatementFile"
        })
        public static class InsertStatementFolder {

            @XmlElement(required = true)
            protected FileSystemStructure.RootFolder.InsertStatementFolder.InsertStatementFile insertStatementFile;
            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Gets the value of the insertStatementFile property.
             * 
             * @return
             *     possible object is
             *     {@link FileSystemStructure.RootFolder.InsertStatementFolder.InsertStatementFile }
             *     
             */
            public FileSystemStructure.RootFolder.InsertStatementFolder.InsertStatementFile getInsertStatementFile() {
                return insertStatementFile;
            }

            /**
             * Sets the value of the insertStatementFile property.
             * 
             * @param value
             *     allowed object is
             *     {@link FileSystemStructure.RootFolder.InsertStatementFolder.InsertStatementFile }
             *     
             */
            public void setInsertStatementFile(FileSystemStructure.RootFolder.InsertStatementFolder.InsertStatementFile value) {
                this.insertStatementFile = value;
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
                if (name == null) {
                    return "insert";
                } else {
                    return name;
                }
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
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="insert.sql" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class InsertStatementFile {

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
                    if (name == null) {
                        return "insert.sql";
                    } else {
                        return name;
                    }
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
         *         &lt;element name="selectStatementFile">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select.sql" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "selectStatementFile"
        })
        public static class SelectStatementFolder {

            @XmlElement(required = true)
            protected FileSystemStructure.RootFolder.SelectStatementFolder.SelectStatementFile selectStatementFile;
            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Gets the value of the selectStatementFile property.
             * 
             * @return
             *     possible object is
             *     {@link FileSystemStructure.RootFolder.SelectStatementFolder.SelectStatementFile }
             *     
             */
            public FileSystemStructure.RootFolder.SelectStatementFolder.SelectStatementFile getSelectStatementFile() {
                return selectStatementFile;
            }

            /**
             * Sets the value of the selectStatementFile property.
             * 
             * @param value
             *     allowed object is
             *     {@link FileSystemStructure.RootFolder.SelectStatementFolder.SelectStatementFile }
             *     
             */
            public void setSelectStatementFile(FileSystemStructure.RootFolder.SelectStatementFolder.SelectStatementFile value) {
                this.selectStatementFile = value;
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
                if (name == null) {
                    return "select";
                } else {
                    return name;
                }
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
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="select.sql" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SelectStatementFile {

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
                    if (name == null) {
                        return "select.sql";
                    } else {
                        return name;
                    }
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
         *         &lt;element name="updateStatementFile">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update.sql" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "updateStatementFile"
        })
        public static class UpdateStatementFolder {

            @XmlElement(required = true)
            protected FileSystemStructure.RootFolder.UpdateStatementFolder.UpdateStatementFile updateStatementFile;
            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Gets the value of the updateStatementFile property.
             * 
             * @return
             *     possible object is
             *     {@link FileSystemStructure.RootFolder.UpdateStatementFolder.UpdateStatementFile }
             *     
             */
            public FileSystemStructure.RootFolder.UpdateStatementFolder.UpdateStatementFile getUpdateStatementFile() {
                return updateStatementFile;
            }

            /**
             * Sets the value of the updateStatementFile property.
             * 
             * @param value
             *     allowed object is
             *     {@link FileSystemStructure.RootFolder.UpdateStatementFolder.UpdateStatementFile }
             *     
             */
            public void setUpdateStatementFile(FileSystemStructure.RootFolder.UpdateStatementFolder.UpdateStatementFile value) {
                this.updateStatementFile = value;
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
                if (name == null) {
                    return "update";
                } else {
                    return name;
                }
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
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="update.sql" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class UpdateStatementFile {

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
                    if (name == null) {
                        return "update.sql";
                    } else {
                        return name;
                    }
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

}

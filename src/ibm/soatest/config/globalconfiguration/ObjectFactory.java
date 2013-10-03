//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.03 at 02:56:41 PM BST 
//


package ibm.soatest.config.globalconfiguration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.archenroot.soatestingframework.globalconfiguration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.archenroot.soatestingframework.globalconfiguration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileSystemStructure }
     * 
     */
    public FileSystemStructure createFileSystemStructure() {
        return new FileSystemStructure();
    }

    /**
     * Create an instance of {@link FileSystemStructure.RootFolder }
     * 
     */
    public FileSystemStructure.RootFolder createFileSystemStructureRootFolder() {
        return new FileSystemStructure.RootFolder();
    }

    /**
     * Create an instance of {@link FileSystemStructure.RootFolder.ReportFolder }
     * 
     */
    public FileSystemStructure.RootFolder.ReportFolder createFileSystemStructureRootFolderReportFolder() {
        return new FileSystemStructure.RootFolder.ReportFolder();
    }

    /**
     * Create an instance of {@link GlobalConfiguration }
     * 
     */
    public GlobalConfiguration createGlobalConfiguration() {
        return new GlobalConfiguration();
    }

    /**
     * Create an instance of {@link FileSystemStructure.RootFolder.ReportFolder.JUnitFolder }
     * 
     */
    public FileSystemStructure.RootFolder.ReportFolder.JUnitFolder createFileSystemStructureRootFolderReportFolderJUnitFolder() {
        return new FileSystemStructure.RootFolder.ReportFolder.JUnitFolder();
    }

    /**
     * Create an instance of {@link FileSystemStructure.RootFolder.ReportFolder.HttpFolder }
     * 
     */
    public FileSystemStructure.RootFolder.ReportFolder.HttpFolder createFileSystemStructureRootFolderReportFolderHttpFolder() {
        return new FileSystemStructure.RootFolder.ReportFolder.HttpFolder();
    }

    /**
     * Create an instance of {@link FileSystemStructure.RootFolder.ReportFolder.PdfFolder }
     * 
     */
    public FileSystemStructure.RootFolder.ReportFolder.PdfFolder createFileSystemStructureRootFolderReportFolderPdfFolder() {
        return new FileSystemStructure.RootFolder.ReportFolder.PdfFolder();
    }

    /**
     * Create an instance of {@link FileSystemStructure.RootFolder.ReportFolder.XmlFolder }
     * 
     */
    public FileSystemStructure.RootFolder.ReportFolder.XmlFolder createFileSystemStructureRootFolderReportFolderXmlFolder() {
        return new FileSystemStructure.RootFolder.ReportFolder.XmlFolder();
    }

}

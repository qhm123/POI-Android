/*
 * An XML document type.
 * Localname: clippath
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ClippathDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one clippath(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ClippathDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClippathDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("clippath2eacdoctype");
    
    /**
     * Gets the "clippath" element
     */
    schemasMicrosoftComOfficeOffice.CTClipPath getClippath();
    
    /**
     * Sets the "clippath" element
     */
    void setClippath(schemasMicrosoftComOfficeOffice.CTClipPath clippath);
    
    /**
     * Appends and returns a new empty "clippath" element
     */
    schemasMicrosoftComOfficeOffice.CTClipPath addNewClippath();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

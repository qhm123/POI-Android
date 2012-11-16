/*
 * An XML document type.
 * Localname: ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.InkDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one ink(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface InkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("inkd58bdoctype");
    
    /**
     * Gets the "ink" element
     */
    schemasMicrosoftComOfficeOffice.CTInk getInk();
    
    /**
     * Sets the "ink" element
     */
    void setInk(schemasMicrosoftComOfficeOffice.CTInk ink);
    
    /**
     * Appends and returns a new empty "ink" element
     */
    schemasMicrosoftComOfficeOffice.CTInk addNewInk();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML document type.
 * Localname: complex
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ComplexDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one complex(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ComplexDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComplexDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("complex44d5doctype");
    
    /**
     * Gets the "complex" element
     */
    schemasMicrosoftComOfficeOffice.CTComplex getComplex();
    
    /**
     * Sets the "complex" element
     */
    void setComplex(schemasMicrosoftComOfficeOffice.CTComplex complex);
    
    /**
     * Appends and returns a new empty "complex" element
     */
    schemasMicrosoftComOfficeOffice.CTComplex addNewComplex();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

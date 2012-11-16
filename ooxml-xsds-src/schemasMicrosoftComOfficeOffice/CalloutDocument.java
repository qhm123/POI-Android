/*
 * An XML document type.
 * Localname: callout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CalloutDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one callout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface CalloutDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalloutDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("callout1055doctype");
    
    /**
     * Gets the "callout" element
     */
    schemasMicrosoftComOfficeOffice.CTCallout getCallout();
    
    /**
     * Sets the "callout" element
     */
    void setCallout(schemasMicrosoftComOfficeOffice.CTCallout callout);
    
    /**
     * Appends and returns a new empty "callout" element
     */
    schemasMicrosoftComOfficeOffice.CTCallout addNewCallout();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

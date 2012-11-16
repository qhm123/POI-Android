/*
 * An XML document type.
 * Localname: signatureline
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SignaturelineDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one signatureline(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface SignaturelineDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignaturelineDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("signaturelineb791doctype");
    
    /**
     * Gets the "signatureline" element
     */
    schemasMicrosoftComOfficeOffice.CTSignatureLine getSignatureline();
    
    /**
     * Sets the "signatureline" element
     */
    void setSignatureline(schemasMicrosoftComOfficeOffice.CTSignatureLine signatureline);
    
    /**
     * Appends and returns a new empty "signatureline" element
     */
    schemasMicrosoftComOfficeOffice.CTSignatureLine addNewSignatureline();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

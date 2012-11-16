/*
 * An XML document type.
 * Localname: skew
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SkewDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one skew(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface SkewDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SkewDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("skew5fc1doctype");
    
    /**
     * Gets the "skew" element
     */
    schemasMicrosoftComOfficeOffice.CTSkew getSkew();
    
    /**
     * Sets the "skew" element
     */
    void setSkew(schemasMicrosoftComOfficeOffice.CTSkew skew);
    
    /**
     * Appends and returns a new empty "skew" element
     */
    schemasMicrosoftComOfficeOffice.CTSkew addNewSkew();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

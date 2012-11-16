/*
 * An XML document type.
 * Localname: fill
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.FillDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one fill(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface FillDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FillDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("fillc33adoctype");
    
    /**
     * Gets the "fill" element
     */
    schemasMicrosoftComOfficeOffice.CTFill getFill();
    
    /**
     * Sets the "fill" element
     */
    void setFill(schemasMicrosoftComOfficeOffice.CTFill fill);
    
    /**
     * Appends and returns a new empty "fill" element
     */
    schemasMicrosoftComOfficeOffice.CTFill addNewFill();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

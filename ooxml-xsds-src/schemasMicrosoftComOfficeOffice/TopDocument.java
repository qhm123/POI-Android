/*
 * An XML document type.
 * Localname: top
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.TopDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one top(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface TopDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("topa3fadoctype");
    
    /**
     * Gets the "top" element
     */
    schemasMicrosoftComOfficeOffice.CTStrokeChild getTop();
    
    /**
     * Sets the "top" element
     */
    void setTop(schemasMicrosoftComOfficeOffice.CTStrokeChild top);
    
    /**
     * Appends and returns a new empty "top" element
     */
    schemasMicrosoftComOfficeOffice.CTStrokeChild addNewTop();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

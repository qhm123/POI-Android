/*
 * An XML document type.
 * Localname: extrusion
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ExtrusionDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one extrusion(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ExtrusionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtrusionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("extrusion863edoctype");
    
    /**
     * Gets the "extrusion" element
     */
    schemasMicrosoftComOfficeOffice.CTExtrusion getExtrusion();
    
    /**
     * Sets the "extrusion" element
     */
    void setExtrusion(schemasMicrosoftComOfficeOffice.CTExtrusion extrusion);
    
    /**
     * Appends and returns a new empty "extrusion" element
     */
    schemasMicrosoftComOfficeOffice.CTExtrusion addNewExtrusion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

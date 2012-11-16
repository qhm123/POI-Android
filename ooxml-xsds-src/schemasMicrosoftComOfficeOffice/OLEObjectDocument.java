/*
 * An XML document type.
 * Localname: OLEObject
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OLEObjectDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one OLEObject(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface OLEObjectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OLEObjectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("oleobjectbaccdoctype");
    
    /**
     * Gets the "OLEObject" element
     */
    schemasMicrosoftComOfficeOffice.CTOLEObject getOLEObject();
    
    /**
     * Sets the "OLEObject" element
     */
    void setOLEObject(schemasMicrosoftComOfficeOffice.CTOLEObject oleObject);
    
    /**
     * Appends and returns a new empty "OLEObject" element
     */
    schemasMicrosoftComOfficeOffice.CTOLEObject addNewOLEObject();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

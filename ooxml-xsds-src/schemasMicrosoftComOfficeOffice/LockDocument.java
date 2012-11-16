/*
 * An XML document type.
 * Localname: lock
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.LockDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one lock(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface LockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("lockcae2doctype");
    
    /**
     * Gets the "lock" element
     */
    schemasMicrosoftComOfficeOffice.CTLock getLock();
    
    /**
     * Sets the "lock" element
     */
    void setLock(schemasMicrosoftComOfficeOffice.CTLock lock);
    
    /**
     * Appends and returns a new empty "lock" element
     */
    schemasMicrosoftComOfficeOffice.CTLock addNewLock();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

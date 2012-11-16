/*
 * An XML document type.
 * Localname: anchorlock
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.AnchorlockDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * A document containing one anchorlock(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface AnchorlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnchorlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("anchorlock2665doctype");
    
    /**
     * Gets the "anchorlock" element
     */
    schemasMicrosoftComOfficeWord.CTAnchorLock getAnchorlock();
    
    /**
     * Sets the "anchorlock" element
     */
    void setAnchorlock(schemasMicrosoftComOfficeWord.CTAnchorLock anchorlock);
    
    /**
     * Appends and returns a new empty "anchorlock" element
     */
    schemasMicrosoftComOfficeWord.CTAnchorLock addNewAnchorlock();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

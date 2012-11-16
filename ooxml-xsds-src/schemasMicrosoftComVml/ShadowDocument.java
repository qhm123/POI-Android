/*
 * An XML document type.
 * Localname: shadow
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ShadowDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one shadow(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ShadowDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShadowDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("shadowd332doctype");
    
    /**
     * Gets the "shadow" element
     */
    schemasMicrosoftComVml.CTShadow getShadow();
    
    /**
     * Sets the "shadow" element
     */
    void setShadow(schemasMicrosoftComVml.CTShadow shadow);
    
    /**
     * Appends and returns a new empty "shadow" element
     */
    schemasMicrosoftComVml.CTShadow addNewShadow();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

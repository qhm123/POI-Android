/*
 * An XML document type.
 * Localname: background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.BackgroundDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one background(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface BackgroundDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BackgroundDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("backgroundfe40doctype");
    
    /**
     * Gets the "background" element
     */
    schemasMicrosoftComVml.CTBackground getBackground();
    
    /**
     * Sets the "background" element
     */
    void setBackground(schemasMicrosoftComVml.CTBackground background);
    
    /**
     * Appends and returns a new empty "background" element
     */
    schemasMicrosoftComVml.CTBackground addNewBackground();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

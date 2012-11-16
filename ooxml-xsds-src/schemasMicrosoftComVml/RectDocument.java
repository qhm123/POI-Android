/*
 * An XML document type.
 * Localname: rect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.RectDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one rect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface RectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("rectaf36doctype");
    
    /**
     * Gets the "rect" element
     */
    schemasMicrosoftComVml.CTRect getRect();
    
    /**
     * Sets the "rect" element
     */
    void setRect(schemasMicrosoftComVml.CTRect rect);
    
    /**
     * Appends and returns a new empty "rect" element
     */
    schemasMicrosoftComVml.CTRect addNewRect();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

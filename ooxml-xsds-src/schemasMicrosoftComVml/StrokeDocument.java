/*
 * An XML document type.
 * Localname: stroke
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.StrokeDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one stroke(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface StrokeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrokeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stroked64adoctype");
    
    /**
     * Gets the "stroke" element
     */
    schemasMicrosoftComVml.CTStroke getStroke();
    
    /**
     * Sets the "stroke" element
     */
    void setStroke(schemasMicrosoftComVml.CTStroke stroke);
    
    /**
     * Appends and returns a new empty "stroke" element
     */
    schemasMicrosoftComVml.CTStroke addNewStroke();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

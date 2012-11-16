/*
 * An XML document type.
 * Localname: line
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.LineDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one line(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface LineDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LineDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("line0946doctype");
    
    /**
     * Gets the "line" element
     */
    schemasMicrosoftComVml.CTLine getLine();
    
    /**
     * Sets the "line" element
     */
    void setLine(schemasMicrosoftComVml.CTLine line);
    
    /**
     * Appends and returns a new empty "line" element
     */
    schemasMicrosoftComVml.CTLine addNewLine();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

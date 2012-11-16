/*
 * An XML document type.
 * Localname: borderright
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BorderrightDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * A document containing one borderright(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BorderrightDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BorderrightDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("borderright28a3doctype");
    
    /**
     * Gets the "borderright" element
     */
    schemasMicrosoftComOfficeWord.CTBorder getBorderright();
    
    /**
     * Sets the "borderright" element
     */
    void setBorderright(schemasMicrosoftComOfficeWord.CTBorder borderright);
    
    /**
     * Appends and returns a new empty "borderright" element
     */
    schemasMicrosoftComOfficeWord.CTBorder addNewBorderright();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

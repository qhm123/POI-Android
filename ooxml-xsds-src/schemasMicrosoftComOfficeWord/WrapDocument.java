/*
 * An XML document type.
 * Localname: wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.WrapDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * A document containing one wrap(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface WrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("wrape08fdoctype");
    
    /**
     * Gets the "wrap" element
     */
    schemasMicrosoftComOfficeWord.CTWrap getWrap();
    
    /**
     * Sets the "wrap" element
     */
    void setWrap(schemasMicrosoftComOfficeWord.CTWrap wrap);
    
    /**
     * Appends and returns a new empty "wrap" element
     */
    schemasMicrosoftComOfficeWord.CTWrap addNewWrap();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

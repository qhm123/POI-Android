/*
 * An XML document type.
 * Localname: borderleft
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BorderleftDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * A document containing one borderleft(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BorderleftDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BorderleftDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("borderlefte8f8doctype");
    
    /**
     * Gets the "borderleft" element
     */
    schemasMicrosoftComOfficeWord.CTBorder getBorderleft();
    
    /**
     * Sets the "borderleft" element
     */
    void setBorderleft(schemasMicrosoftComOfficeWord.CTBorder borderleft);
    
    /**
     * Appends and returns a new empty "borderleft" element
     */
    schemasMicrosoftComOfficeWord.CTBorder addNewBorderleft();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

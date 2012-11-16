/*
 * An XML document type.
 * Localname: bordertop
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BordertopDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * A document containing one bordertop(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BordertopDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BordertopDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("bordertopf7dcdoctype");
    
    /**
     * Gets the "bordertop" element
     */
    schemasMicrosoftComOfficeWord.CTBorder getBordertop();
    
    /**
     * Sets the "bordertop" element
     */
    void setBordertop(schemasMicrosoftComOfficeWord.CTBorder bordertop);
    
    /**
     * Appends and returns a new empty "bordertop" element
     */
    schemasMicrosoftComOfficeWord.CTBorder addNewBordertop();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

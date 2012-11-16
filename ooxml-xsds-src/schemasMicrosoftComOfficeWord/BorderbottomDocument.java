/*
 * An XML document type.
 * Localname: borderbottom
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BorderbottomDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * A document containing one borderbottom(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BorderbottomDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BorderbottomDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("borderbottomd2dcdoctype");
    
    /**
     * Gets the "borderbottom" element
     */
    schemasMicrosoftComOfficeWord.CTBorder getBorderbottom();
    
    /**
     * Sets the "borderbottom" element
     */
    void setBorderbottom(schemasMicrosoftComOfficeWord.CTBorder borderbottom);
    
    /**
     * Appends and returns a new empty "borderbottom" element
     */
    schemasMicrosoftComOfficeWord.CTBorder addNewBorderbottom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

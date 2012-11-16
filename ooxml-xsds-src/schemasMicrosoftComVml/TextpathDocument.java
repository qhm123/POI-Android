/*
 * An XML document type.
 * Localname: textpath
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.TextpathDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one textpath(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface TextpathDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextpathDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("textpath0724doctype");
    
    /**
     * Gets the "textpath" element
     */
    schemasMicrosoftComVml.CTTextPath getTextpath();
    
    /**
     * Sets the "textpath" element
     */
    void setTextpath(schemasMicrosoftComVml.CTTextPath textpath);
    
    /**
     * Appends and returns a new empty "textpath" element
     */
    schemasMicrosoftComVml.CTTextPath addNewTextpath();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

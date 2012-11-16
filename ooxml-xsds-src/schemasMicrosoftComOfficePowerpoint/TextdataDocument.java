/*
 * An XML document type.
 * Localname: textdata
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: schemasMicrosoftComOfficePowerpoint.TextdataDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficePowerpoint;


/**
 * A document containing one textdata(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public interface TextdataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextdataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("textdatacb7ddoctype");
    
    /**
     * Gets the "textdata" element
     */
    schemasMicrosoftComOfficePowerpoint.CTRel getTextdata();
    
    /**
     * Sets the "textdata" element
     */
    void setTextdata(schemasMicrosoftComOfficePowerpoint.CTRel textdata);
    
    /**
     * Appends and returns a new empty "textdata" element
     */
    schemasMicrosoftComOfficePowerpoint.CTRel addNewTextdata();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

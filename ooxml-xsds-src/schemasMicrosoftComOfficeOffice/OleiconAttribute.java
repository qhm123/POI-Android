/*
 * An XML attribute type.
 * Localname: oleicon
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OleiconAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one oleicon(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface OleiconAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OleiconAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("oleicon5dd4attrtypetype");
    
    /**
     * Gets the "oleicon" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getOleicon();
    
    /**
     * Gets (as xml) the "oleicon" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetOleicon();
    
    /**
     * True if has "oleicon" attribute
     */
    boolean isSetOleicon();
    
    /**
     * Sets the "oleicon" attribute
     */
    void setOleicon(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum oleicon);
    
    /**
     * Sets (as xml) the "oleicon" attribute
     */
    void xsetOleicon(schemasMicrosoftComOfficeOffice.STTrueFalse oleicon);
    
    /**
     * Unsets the "oleicon" attribute
     */
    void unsetOleicon();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML attribute type.
 * Localname: hr
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HrAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one hr(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface HrAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HrAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("hrb533attrtypetype");
    
    /**
     * Gets the "hr" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHr();
    
    /**
     * Gets (as xml) the "hr" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetHr();
    
    /**
     * True if has "hr" attribute
     */
    boolean isSetHr();
    
    /**
     * Sets the "hr" attribute
     */
    void setHr(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hr);
    
    /**
     * Sets (as xml) the "hr" attribute
     */
    void xsetHr(schemasMicrosoftComOfficeOffice.STTrueFalse hr);
    
    /**
     * Unsets the "hr" attribute
     */
    void unsetHr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

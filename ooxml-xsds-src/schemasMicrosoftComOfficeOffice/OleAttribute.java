/*
 * An XML attribute type.
 * Localname: ole
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OleAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one ole(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface OleAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OleAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("olea4dbattrtypetype");
    
    /**
     * Gets the "ole" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum getOle();
    
    /**
     * Gets (as xml) the "ole" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalseBlank xgetOle();
    
    /**
     * True if has "ole" attribute
     */
    boolean isSetOle();
    
    /**
     * Sets the "ole" attribute
     */
    void setOle(schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum ole);
    
    /**
     * Sets (as xml) the "ole" attribute
     */
    void xsetOle(schemasMicrosoftComOfficeOffice.STTrueFalseBlank ole);
    
    /**
     * Unsets the "ole" attribute
     */
    void unsetOle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

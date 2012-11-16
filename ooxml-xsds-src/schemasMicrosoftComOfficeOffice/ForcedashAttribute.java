/*
 * An XML attribute type.
 * Localname: forcedash
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ForcedashAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one forcedash(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ForcedashAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ForcedashAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("forcedash7ef0attrtypetype");
    
    /**
     * Gets the "forcedash" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getForcedash();
    
    /**
     * Gets (as xml) the "forcedash" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetForcedash();
    
    /**
     * True if has "forcedash" attribute
     */
    boolean isSetForcedash();
    
    /**
     * Sets the "forcedash" attribute
     */
    void setForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum forcedash);
    
    /**
     * Sets (as xml) the "forcedash" attribute
     */
    void xsetForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse forcedash);
    
    /**
     * Unsets the "forcedash" attribute
     */
    void unsetForcedash();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

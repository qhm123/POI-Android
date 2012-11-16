/*
 * An XML attribute type.
 * Localname: userdrawn
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.UserdrawnAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one userdrawn(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface UserdrawnAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserdrawnAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("userdrawn3eb2attrtypetype");
    
    /**
     * Gets the "userdrawn" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUserdrawn();
    
    /**
     * Gets (as xml) the "userdrawn" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetUserdrawn();
    
    /**
     * True if has "userdrawn" attribute
     */
    boolean isSetUserdrawn();
    
    /**
     * Sets the "userdrawn" attribute
     */
    void setUserdrawn(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum userdrawn);
    
    /**
     * Sets (as xml) the "userdrawn" attribute
     */
    void xsetUserdrawn(schemasMicrosoftComOfficeOffice.STTrueFalse userdrawn);
    
    /**
     * Unsets the "userdrawn" attribute
     */
    void unsetUserdrawn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

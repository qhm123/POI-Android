/*
 * An XML attribute type.
 * Localname: userhidden
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.UserhiddenAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one userhidden(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface UserhiddenAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserhiddenAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("userhidden8b5eattrtypetype");
    
    /**
     * Gets the "userhidden" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUserhidden();
    
    /**
     * Gets (as xml) the "userhidden" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetUserhidden();
    
    /**
     * True if has "userhidden" attribute
     */
    boolean isSetUserhidden();
    
    /**
     * Sets the "userhidden" attribute
     */
    void setUserhidden(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum userhidden);
    
    /**
     * Sets (as xml) the "userhidden" attribute
     */
    void xsetUserhidden(schemasMicrosoftComOfficeOffice.STTrueFalse userhidden);
    
    /**
     * Unsets the "userhidden" attribute
     */
    void unsetUserhidden();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

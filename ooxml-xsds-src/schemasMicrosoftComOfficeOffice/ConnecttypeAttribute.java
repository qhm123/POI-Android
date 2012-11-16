/*
 * An XML attribute type.
 * Localname: connecttype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ConnecttypeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one connecttype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ConnecttypeAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConnecttypeAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("connecttype08d7attrtypetype");
    
    /**
     * Gets the "connecttype" attribute
     */
    schemasMicrosoftComOfficeOffice.STConnectType.Enum getConnecttype();
    
    /**
     * Gets (as xml) the "connecttype" attribute
     */
    schemasMicrosoftComOfficeOffice.STConnectType xgetConnecttype();
    
    /**
     * True if has "connecttype" attribute
     */
    boolean isSetConnecttype();
    
    /**
     * Sets the "connecttype" attribute
     */
    void setConnecttype(schemasMicrosoftComOfficeOffice.STConnectType.Enum connecttype);
    
    /**
     * Sets (as xml) the "connecttype" attribute
     */
    void xsetConnecttype(schemasMicrosoftComOfficeOffice.STConnectType connecttype);
    
    /**
     * Unsets the "connecttype" attribute
     */
    void unsetConnecttype();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

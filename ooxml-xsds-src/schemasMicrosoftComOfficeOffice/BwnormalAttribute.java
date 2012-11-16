/*
 * An XML attribute type.
 * Localname: bwnormal
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BwnormalAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one bwnormal(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BwnormalAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BwnormalAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("bwnormal0765attrtypetype");
    
    /**
     * Gets the "bwnormal" attribute
     */
    schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwnormal();
    
    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    schemasMicrosoftComOfficeOffice.STBWMode xgetBwnormal();
    
    /**
     * True if has "bwnormal" attribute
     */
    boolean isSetBwnormal();
    
    /**
     * Sets the "bwnormal" attribute
     */
    void setBwnormal(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwnormal);
    
    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    void xsetBwnormal(schemasMicrosoftComOfficeOffice.STBWMode bwnormal);
    
    /**
     * Unsets the "bwnormal" attribute
     */
    void unsetBwnormal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML attribute type.
 * Localname: bwmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BwmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one bwmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BwmodeAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BwmodeAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("bwmode0821attrtypetype");
    
    /**
     * Gets the "bwmode" attribute
     */
    schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwmode();
    
    /**
     * Gets (as xml) the "bwmode" attribute
     */
    schemasMicrosoftComOfficeOffice.STBWMode xgetBwmode();
    
    /**
     * True if has "bwmode" attribute
     */
    boolean isSetBwmode();
    
    /**
     * Sets the "bwmode" attribute
     */
    void setBwmode(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwmode);
    
    /**
     * Sets (as xml) the "bwmode" attribute
     */
    void xsetBwmode(schemasMicrosoftComOfficeOffice.STBWMode bwmode);
    
    /**
     * Unsets the "bwmode" attribute
     */
    void unsetBwmode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

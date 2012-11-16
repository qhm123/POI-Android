/*
 * An XML attribute type.
 * Localname: gfxdata
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.GfxdataAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one gfxdata(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface GfxdataAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GfxdataAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("gfxdata37d6attrtypetype");
    
    /**
     * Gets the "gfxdata" attribute
     */
    byte[] getGfxdata();
    
    /**
     * Gets (as xml) the "gfxdata" attribute
     */
    org.apache.xmlbeans.XmlBase64Binary xgetGfxdata();
    
    /**
     * True if has "gfxdata" attribute
     */
    boolean isSetGfxdata();
    
    /**
     * Sets the "gfxdata" attribute
     */
    void setGfxdata(byte[] gfxdata);
    
    /**
     * Sets (as xml) the "gfxdata" attribute
     */
    void xsetGfxdata(org.apache.xmlbeans.XmlBase64Binary gfxdata);
    
    /**
     * Unsets the "gfxdata" attribute
     */
    void unsetGfxdata();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

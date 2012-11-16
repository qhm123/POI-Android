/*
 * XML Type:  CT_ColorMru
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTColorMru
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_ColorMru(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTColorMru extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorMru.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolormrue2f0type");
    
    /**
     * Gets the "ext" attribute
     */
    schemasMicrosoftComVml.STExt.Enum getExt();
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    schemasMicrosoftComVml.STExt xgetExt();
    
    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();
    
    /**
     * Sets the "ext" attribute
     */
    void setExt(schemasMicrosoftComVml.STExt.Enum ext);
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(schemasMicrosoftComVml.STExt ext);
    
    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();
    
    /**
     * Gets the "colors" attribute
     */
    java.lang.String getColors();
    
    /**
     * Gets (as xml) the "colors" attribute
     */
    org.apache.xmlbeans.XmlString xgetColors();
    
    /**
     * True if has "colors" attribute
     */
    boolean isSetColors();
    
    /**
     * Sets the "colors" attribute
     */
    void setColors(java.lang.String colors);
    
    /**
     * Sets (as xml) the "colors" attribute
     */
    void xsetColors(org.apache.xmlbeans.XmlString colors);
    
    /**
     * Unsets the "colors" attribute
     */
    void unsetColors();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

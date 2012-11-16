/*
 * XML Type:  CT_Border
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.CTBorder
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord;


/**
 * An XML CT_Border(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public interface CTBorder extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBorder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctborderc15dtype");
    
    /**
     * Gets the "type" attribute
     */
    schemasMicrosoftComOfficeWord.STBorderType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    schemasMicrosoftComOfficeWord.STBorderType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(schemasMicrosoftComOfficeWord.STBorderType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(schemasMicrosoftComOfficeWord.STBorderType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "width" attribute
     */
    java.math.BigInteger getWidth();
    
    /**
     * Gets (as xml) the "width" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetWidth();
    
    /**
     * True if has "width" attribute
     */
    boolean isSetWidth();
    
    /**
     * Sets the "width" attribute
     */
    void setWidth(java.math.BigInteger width);
    
    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(org.apache.xmlbeans.XmlPositiveInteger width);
    
    /**
     * Unsets the "width" attribute
     */
    void unsetWidth();
    
    /**
     * Gets the "shadow" attribute
     */
    schemasMicrosoftComOfficeWord.STBorderShadow.Enum getShadow();
    
    /**
     * Gets (as xml) the "shadow" attribute
     */
    schemasMicrosoftComOfficeWord.STBorderShadow xgetShadow();
    
    /**
     * True if has "shadow" attribute
     */
    boolean isSetShadow();
    
    /**
     * Sets the "shadow" attribute
     */
    void setShadow(schemasMicrosoftComOfficeWord.STBorderShadow.Enum shadow);
    
    /**
     * Sets (as xml) the "shadow" attribute
     */
    void xsetShadow(schemasMicrosoftComOfficeWord.STBorderShadow shadow);
    
    /**
     * Unsets the "shadow" attribute
     */
    void unsetShadow();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

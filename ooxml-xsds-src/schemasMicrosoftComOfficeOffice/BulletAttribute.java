/*
 * An XML attribute type.
 * Localname: bullet
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BulletAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one bullet(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BulletAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BulletAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("bullet87abattrtypetype");
    
    /**
     * Gets the "bullet" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getBullet();
    
    /**
     * Gets (as xml) the "bullet" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetBullet();
    
    /**
     * True if has "bullet" attribute
     */
    boolean isSetBullet();
    
    /**
     * Sets the "bullet" attribute
     */
    void setBullet(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum bullet);
    
    /**
     * Sets (as xml) the "bullet" attribute
     */
    void xsetBullet(schemasMicrosoftComOfficeOffice.STTrueFalse bullet);
    
    /**
     * Unsets the "bullet" attribute
     */
    void unsetBullet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

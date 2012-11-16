/*
 * An XML attribute type.
 * Localname: clip
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ClipAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one clip(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ClipAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClipAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("clip9eb9attrtypetype");
    
    /**
     * Gets the "clip" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getClip();
    
    /**
     * Gets (as xml) the "clip" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetClip();
    
    /**
     * True if has "clip" attribute
     */
    boolean isSetClip();
    
    /**
     * Sets the "clip" attribute
     */
    void setClip(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum clip);
    
    /**
     * Sets (as xml) the "clip" attribute
     */
    void xsetClip(schemasMicrosoftComOfficeOffice.STTrueFalse clip);
    
    /**
     * Unsets the "clip" attribute
     */
    void unsetClip();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

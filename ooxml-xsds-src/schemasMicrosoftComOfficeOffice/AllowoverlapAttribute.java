/*
 * An XML attribute type.
 * Localname: allowoverlap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.AllowoverlapAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one allowoverlap(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface AllowoverlapAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllowoverlapAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("allowoverlap0747attrtypetype");
    
    /**
     * Gets the "allowoverlap" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowoverlap();
    
    /**
     * Gets (as xml) the "allowoverlap" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowoverlap();
    
    /**
     * True if has "allowoverlap" attribute
     */
    boolean isSetAllowoverlap();
    
    /**
     * Sets the "allowoverlap" attribute
     */
    void setAllowoverlap(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowoverlap);
    
    /**
     * Sets (as xml) the "allowoverlap" attribute
     */
    void xsetAllowoverlap(schemasMicrosoftComOfficeOffice.STTrueFalse allowoverlap);
    
    /**
     * Unsets the "allowoverlap" attribute
     */
    void unsetAllowoverlap();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

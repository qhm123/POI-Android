/*
 * An XML attribute type.
 * Localname: hralign
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.HralignAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one hralign(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface HralignAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HralignAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("hralignc56eattrtypetype");
    
    /**
     * Gets the "hralign" attribute
     */
    schemasMicrosoftComOfficeOffice.STHrAlign.Enum getHralign();
    
    /**
     * Gets (as xml) the "hralign" attribute
     */
    schemasMicrosoftComOfficeOffice.STHrAlign xgetHralign();
    
    /**
     * True if has "hralign" attribute
     */
    boolean isSetHralign();
    
    /**
     * Sets the "hralign" attribute
     */
    void setHralign(schemasMicrosoftComOfficeOffice.STHrAlign.Enum hralign);
    
    /**
     * Sets (as xml) the "hralign" attribute
     */
    void xsetHralign(schemasMicrosoftComOfficeOffice.STHrAlign hralign);
    
    /**
     * Unsets the "hralign" attribute
     */
    void unsetHralign();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

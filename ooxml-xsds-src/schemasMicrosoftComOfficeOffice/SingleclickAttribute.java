/*
 * An XML attribute type.
 * Localname: singleclick
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SingleclickAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one singleclick(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface SingleclickAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SingleclickAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("singleclicke7f3attrtypetype");
    
    /**
     * Gets the "singleclick" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getSingleclick();
    
    /**
     * Gets (as xml) the "singleclick" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetSingleclick();
    
    /**
     * True if has "singleclick" attribute
     */
    boolean isSetSingleclick();
    
    /**
     * Sets the "singleclick" attribute
     */
    void setSingleclick(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum singleclick);
    
    /**
     * Sets (as xml) the "singleclick" attribute
     */
    void xsetSingleclick(schemasMicrosoftComOfficeOffice.STTrueFalse singleclick);
    
    /**
     * Unsets the "singleclick" attribute
     */
    void unsetSingleclick();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * An XML attribute type.
 * Localname: relid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.RelidAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one relid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface RelidAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelidAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("relid54e7attrtypetype");
    
    /**
     * Gets the "relid" attribute
     */
    java.lang.String getRelid();
    
    /**
     * Gets (as xml) the "relid" attribute
     */
    schemasMicrosoftComOfficeOffice.STRelationshipId xgetRelid();
    
    /**
     * True if has "relid" attribute
     */
    boolean isSetRelid();
    
    /**
     * Sets the "relid" attribute
     */
    void setRelid(java.lang.String relid);
    
    /**
     * Sets (as xml) the "relid" attribute
     */
    void xsetRelid(schemasMicrosoftComOfficeOffice.STRelationshipId relid);
    
    /**
     * Unsets the "relid" attribute
     */
    void unsetRelid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

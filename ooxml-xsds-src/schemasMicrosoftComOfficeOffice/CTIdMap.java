/*
 * XML Type:  CT_IdMap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTIdMap
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_IdMap(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTIdMap extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTIdMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctidmap63fatype");
    
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
     * Gets the "data" attribute
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "data" attribute
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "data" attribute
     */
    boolean isSetData();
    
    /**
     * Sets the "data" attribute
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "data" attribute
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "data" attribute
     */
    void unsetData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

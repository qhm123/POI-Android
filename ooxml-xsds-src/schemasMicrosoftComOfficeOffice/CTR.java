/*
 * XML Type:  CT_R
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTR
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_R(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTR extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctr0eabtype");
    
    /**
     * Gets a List of "proxy" elements
     */
    java.util.List<schemasMicrosoftComOfficeOffice.CTProxy> getProxyList();
    
    /**
     * Gets array of all "proxy" elements
     * @deprecated
     */
    schemasMicrosoftComOfficeOffice.CTProxy[] getProxyArray();
    
    /**
     * Gets ith "proxy" element
     */
    schemasMicrosoftComOfficeOffice.CTProxy getProxyArray(int i);
    
    /**
     * Returns number of "proxy" element
     */
    int sizeOfProxyArray();
    
    /**
     * Sets array of all "proxy" element
     */
    void setProxyArray(schemasMicrosoftComOfficeOffice.CTProxy[] proxyArray);
    
    /**
     * Sets ith "proxy" element
     */
    void setProxyArray(int i, schemasMicrosoftComOfficeOffice.CTProxy proxy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "proxy" element
     */
    schemasMicrosoftComOfficeOffice.CTProxy insertNewProxy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "proxy" element
     */
    schemasMicrosoftComOfficeOffice.CTProxy addNewProxy();
    
    /**
     * Removes the ith "proxy" element
     */
    void removeProxy(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "type" attribute
     */
    schemasMicrosoftComOfficeOffice.STRType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    schemasMicrosoftComOfficeOffice.STRType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(schemasMicrosoftComOfficeOffice.STRType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(schemasMicrosoftComOfficeOffice.STRType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "how" attribute
     */
    schemasMicrosoftComOfficeOffice.STHow.Enum getHow();
    
    /**
     * Gets (as xml) the "how" attribute
     */
    schemasMicrosoftComOfficeOffice.STHow xgetHow();
    
    /**
     * True if has "how" attribute
     */
    boolean isSetHow();
    
    /**
     * Sets the "how" attribute
     */
    void setHow(schemasMicrosoftComOfficeOffice.STHow.Enum how);
    
    /**
     * Sets (as xml) the "how" attribute
     */
    void xsetHow(schemasMicrosoftComOfficeOffice.STHow how);
    
    /**
     * Unsets the "how" attribute
     */
    void unsetHow();
    
    /**
     * Gets the "idref" attribute
     */
    java.lang.String getIdref();
    
    /**
     * Gets (as xml) the "idref" attribute
     */
    org.apache.xmlbeans.XmlString xgetIdref();
    
    /**
     * True if has "idref" attribute
     */
    boolean isSetIdref();
    
    /**
     * Sets the "idref" attribute
     */
    void setIdref(java.lang.String idref);
    
    /**
     * Sets (as xml) the "idref" attribute
     */
    void xsetIdref(org.apache.xmlbeans.XmlString idref);
    
    /**
     * Unsets the "idref" attribute
     */
    void unsetIdref();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

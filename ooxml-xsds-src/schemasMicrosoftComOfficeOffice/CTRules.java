/*
 * XML Type:  CT_Rules
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRules
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_Rules(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRules extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrulesf8b0type");
    
    /**
     * Gets a List of "r" elements
     */
    java.util.List<schemasMicrosoftComOfficeOffice.CTR> getRList();
    
    /**
     * Gets array of all "r" elements
     * @deprecated
     */
    schemasMicrosoftComOfficeOffice.CTR[] getRArray();
    
    /**
     * Gets ith "r" element
     */
    schemasMicrosoftComOfficeOffice.CTR getRArray(int i);
    
    /**
     * Returns number of "r" element
     */
    int sizeOfRArray();
    
    /**
     * Sets array of all "r" element
     */
    void setRArray(schemasMicrosoftComOfficeOffice.CTR[] rArray);
    
    /**
     * Sets ith "r" element
     */
    void setRArray(int i, schemasMicrosoftComOfficeOffice.CTR r);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    schemasMicrosoftComOfficeOffice.CTR insertNewR(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    schemasMicrosoftComOfficeOffice.CTR addNewR();
    
    /**
     * Removes the ith "r" element
     */
    void removeR(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

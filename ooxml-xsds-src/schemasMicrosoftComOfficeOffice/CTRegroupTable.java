/*
 * XML Type:  CT_RegroupTable
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRegroupTable
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_RegroupTable(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRegroupTable extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRegroupTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctregrouptable0565type");
    
    /**
     * Gets a List of "entry" elements
     */
    java.util.List<schemasMicrosoftComOfficeOffice.CTEntry> getEntryList();
    
    /**
     * Gets array of all "entry" elements
     * @deprecated
     */
    schemasMicrosoftComOfficeOffice.CTEntry[] getEntryArray();
    
    /**
     * Gets ith "entry" element
     */
    schemasMicrosoftComOfficeOffice.CTEntry getEntryArray(int i);
    
    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();
    
    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(schemasMicrosoftComOfficeOffice.CTEntry[] entryArray);
    
    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, schemasMicrosoftComOfficeOffice.CTEntry entry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    schemasMicrosoftComOfficeOffice.CTEntry insertNewEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    schemasMicrosoftComOfficeOffice.CTEntry addNewEntry();
    
    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);
    
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

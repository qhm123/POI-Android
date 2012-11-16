/*
 * XML Type:  CT_FFDDList
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_FFDDList(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFFDDList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFFDDList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctffddlist3acatype");
    
    /**
     * Gets the "result" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getResult();
    
    /**
     * True if has "result" element
     */
    boolean isSetResult();
    
    /**
     * Sets the "result" element
     */
    void setResult(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber result);
    
    /**
     * Appends and returns a new empty "result" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewResult();
    
    /**
     * Unsets the "result" element
     */
    void unsetResult();
    
    /**
     * Gets the "default" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getDefault();
    
    /**
     * True if has "default" element
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" element
     */
    void setDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber xdefault);
    
    /**
     * Appends and returns a new empty "default" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewDefault();
    
    /**
     * Unsets the "default" element
     */
    void unsetDefault();
    
    /**
     * Gets a List of "listEntry" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getListEntryList();
    
    /**
     * Gets array of all "listEntry" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getListEntryArray();
    
    /**
     * Gets ith "listEntry" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getListEntryArray(int i);
    
    /**
     * Returns number of "listEntry" element
     */
    int sizeOfListEntryArray();
    
    /**
     * Sets array of all "listEntry" element
     */
    void setListEntryArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] listEntryArray);
    
    /**
     * Sets ith "listEntry" element
     */
    void setListEntryArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString listEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listEntry" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewListEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listEntry" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewListEntry();
    
    /**
     * Removes the ith "listEntry" element
     */
    void removeListEntry(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

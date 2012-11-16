/*
 * XML Type:  CT_IgnoredErrors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_IgnoredErrors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTIgnoredErrors extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTIgnoredErrors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctignorederrorsbebctype");
    
    /**
     * Gets a List of "ignoredError" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError> getIgnoredErrorList();
    
    /**
     * Gets array of all "ignoredError" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError[] getIgnoredErrorArray();
    
    /**
     * Gets ith "ignoredError" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError getIgnoredErrorArray(int i);
    
    /**
     * Returns number of "ignoredError" element
     */
    int sizeOfIgnoredErrorArray();
    
    /**
     * Sets array of all "ignoredError" element
     */
    void setIgnoredErrorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError[] ignoredErrorArray);
    
    /**
     * Sets ith "ignoredError" element
     */
    void setIgnoredErrorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError ignoredError);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ignoredError" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError insertNewIgnoredError(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ignoredError" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError addNewIgnoredError();
    
    /**
     * Removes the ith "ignoredError" element
     */
    void removeIgnoredError(int i);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

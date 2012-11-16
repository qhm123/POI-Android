/*
 * XML Type:  CT_AutoFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_AutoFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAutoFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAutoFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctautofiltera8d0type");
    
    /**
     * Gets a List of "filterColumn" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn> getFilterColumnList();
    
    /**
     * Gets array of all "filterColumn" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn[] getFilterColumnArray();
    
    /**
     * Gets ith "filterColumn" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn getFilterColumnArray(int i);
    
    /**
     * Returns number of "filterColumn" element
     */
    int sizeOfFilterColumnArray();
    
    /**
     * Sets array of all "filterColumn" element
     */
    void setFilterColumnArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn[] filterColumnArray);
    
    /**
     * Sets ith "filterColumn" element
     */
    void setFilterColumnArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn filterColumn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filterColumn" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn insertNewFilterColumn(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filterColumn" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn addNewFilterColumn();
    
    /**
     * Removes the ith "filterColumn" element
     */
    void removeFilterColumn(int i);
    
    /**
     * Gets the "sortState" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState getSortState();
    
    /**
     * True if has "sortState" element
     */
    boolean isSetSortState();
    
    /**
     * Sets the "sortState" element
     */
    void setSortState(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState sortState);
    
    /**
     * Appends and returns a new empty "sortState" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState addNewSortState();
    
    /**
     * Unsets the "sortState" element
     */
    void unsetSortState();
    
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
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();
    
    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);
    
    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

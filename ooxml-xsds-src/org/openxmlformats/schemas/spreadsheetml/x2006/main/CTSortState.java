/*
 * XML Type:  CT_SortState
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SortState(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSortState extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSortState.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsortstatea372type");
    
    /**
     * Gets a List of "sortCondition" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition> getSortConditionList();
    
    /**
     * Gets array of all "sortCondition" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition[] getSortConditionArray();
    
    /**
     * Gets ith "sortCondition" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition getSortConditionArray(int i);
    
    /**
     * Returns number of "sortCondition" element
     */
    int sizeOfSortConditionArray();
    
    /**
     * Sets array of all "sortCondition" element
     */
    void setSortConditionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition[] sortConditionArray);
    
    /**
     * Sets ith "sortCondition" element
     */
    void setSortConditionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition sortCondition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sortCondition" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition insertNewSortCondition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sortCondition" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition addNewSortCondition();
    
    /**
     * Removes the ith "sortCondition" element
     */
    void removeSortCondition(int i);
    
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
     * Gets the "columnSort" attribute
     */
    boolean getColumnSort();
    
    /**
     * Gets (as xml) the "columnSort" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetColumnSort();
    
    /**
     * True if has "columnSort" attribute
     */
    boolean isSetColumnSort();
    
    /**
     * Sets the "columnSort" attribute
     */
    void setColumnSort(boolean columnSort);
    
    /**
     * Sets (as xml) the "columnSort" attribute
     */
    void xsetColumnSort(org.apache.xmlbeans.XmlBoolean columnSort);
    
    /**
     * Unsets the "columnSort" attribute
     */
    void unsetColumnSort();
    
    /**
     * Gets the "caseSensitive" attribute
     */
    boolean getCaseSensitive();
    
    /**
     * Gets (as xml) the "caseSensitive" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCaseSensitive();
    
    /**
     * True if has "caseSensitive" attribute
     */
    boolean isSetCaseSensitive();
    
    /**
     * Sets the "caseSensitive" attribute
     */
    void setCaseSensitive(boolean caseSensitive);
    
    /**
     * Sets (as xml) the "caseSensitive" attribute
     */
    void xsetCaseSensitive(org.apache.xmlbeans.XmlBoolean caseSensitive);
    
    /**
     * Unsets the "caseSensitive" attribute
     */
    void unsetCaseSensitive();
    
    /**
     * Gets the "sortMethod" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod.Enum getSortMethod();
    
    /**
     * Gets (as xml) the "sortMethod" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod xgetSortMethod();
    
    /**
     * True if has "sortMethod" attribute
     */
    boolean isSetSortMethod();
    
    /**
     * Sets the "sortMethod" attribute
     */
    void setSortMethod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod.Enum sortMethod);
    
    /**
     * Sets (as xml) the "sortMethod" attribute
     */
    void xsetSortMethod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod sortMethod);
    
    /**
     * Unsets the "sortMethod" attribute
     */
    void unsetSortMethod();
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

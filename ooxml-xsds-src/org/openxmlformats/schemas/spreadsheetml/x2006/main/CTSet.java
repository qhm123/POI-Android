/*
 * XML Type:  CT_Set
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Set(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctset25c1type");
    
    /**
     * Gets a List of "tpls" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples> getTplsList();
    
    /**
     * Gets array of all "tpls" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] getTplsArray();
    
    /**
     * Gets ith "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getTplsArray(int i);
    
    /**
     * Returns number of "tpls" element
     */
    int sizeOfTplsArray();
    
    /**
     * Sets array of all "tpls" element
     */
    void setTplsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] tplsArray);
    
    /**
     * Sets ith "tpls" element
     */
    void setTplsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples tpls);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples insertNewTpls(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewTpls();
    
    /**
     * Removes the ith "tpls" element
     */
    void removeTpls(int i);
    
    /**
     * Gets the "sortByTuple" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getSortByTuple();
    
    /**
     * True if has "sortByTuple" element
     */
    boolean isSetSortByTuple();
    
    /**
     * Sets the "sortByTuple" element
     */
    void setSortByTuple(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples sortByTuple);
    
    /**
     * Appends and returns a new empty "sortByTuple" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewSortByTuple();
    
    /**
     * Unsets the "sortByTuple" element
     */
    void unsetSortByTuple();
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * Gets the "maxRank" attribute
     */
    int getMaxRank();
    
    /**
     * Gets (as xml) the "maxRank" attribute
     */
    org.apache.xmlbeans.XmlInt xgetMaxRank();
    
    /**
     * Sets the "maxRank" attribute
     */
    void setMaxRank(int maxRank);
    
    /**
     * Sets (as xml) the "maxRank" attribute
     */
    void xsetMaxRank(org.apache.xmlbeans.XmlInt maxRank);
    
    /**
     * Gets the "setDefinition" attribute
     */
    java.lang.String getSetDefinition();
    
    /**
     * Gets (as xml) the "setDefinition" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSetDefinition();
    
    /**
     * Sets the "setDefinition" attribute
     */
    void setSetDefinition(java.lang.String setDefinition);
    
    /**
     * Sets (as xml) the "setDefinition" attribute
     */
    void xsetSetDefinition(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring setDefinition);
    
    /**
     * Gets the "sortType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType.Enum getSortType();
    
    /**
     * Gets (as xml) the "sortType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType xgetSortType();
    
    /**
     * True if has "sortType" attribute
     */
    boolean isSetSortType();
    
    /**
     * Sets the "sortType" attribute
     */
    void setSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType.Enum sortType);
    
    /**
     * Sets (as xml) the "sortType" attribute
     */
    void xsetSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType sortType);
    
    /**
     * Unsets the "sortType" attribute
     */
    void unsetSortType();
    
    /**
     * Gets the "queryFailed" attribute
     */
    boolean getQueryFailed();
    
    /**
     * Gets (as xml) the "queryFailed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetQueryFailed();
    
    /**
     * True if has "queryFailed" attribute
     */
    boolean isSetQueryFailed();
    
    /**
     * Sets the "queryFailed" attribute
     */
    void setQueryFailed(boolean queryFailed);
    
    /**
     * Sets (as xml) the "queryFailed" attribute
     */
    void xsetQueryFailed(org.apache.xmlbeans.XmlBoolean queryFailed);
    
    /**
     * Unsets the "queryFailed" attribute
     */
    void unsetQueryFailed();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

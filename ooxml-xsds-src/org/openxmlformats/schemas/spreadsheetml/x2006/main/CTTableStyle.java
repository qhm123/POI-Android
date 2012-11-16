/*
 * XML Type:  CT_TableStyle
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_TableStyle(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableStyle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablestylea24ctype");
    
    /**
     * Gets a List of "tableStyleElement" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement> getTableStyleElementList();
    
    /**
     * Gets array of all "tableStyleElement" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement[] getTableStyleElementArray();
    
    /**
     * Gets ith "tableStyleElement" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement getTableStyleElementArray(int i);
    
    /**
     * Returns number of "tableStyleElement" element
     */
    int sizeOfTableStyleElementArray();
    
    /**
     * Sets array of all "tableStyleElement" element
     */
    void setTableStyleElementArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement[] tableStyleElementArray);
    
    /**
     * Sets ith "tableStyleElement" element
     */
    void setTableStyleElementArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement tableStyleElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tableStyleElement" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement insertNewTableStyleElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tableStyleElement" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement addNewTableStyleElement();
    
    /**
     * Removes the ith "tableStyleElement" element
     */
    void removeTableStyleElement(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "pivot" attribute
     */
    boolean getPivot();
    
    /**
     * Gets (as xml) the "pivot" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPivot();
    
    /**
     * True if has "pivot" attribute
     */
    boolean isSetPivot();
    
    /**
     * Sets the "pivot" attribute
     */
    void setPivot(boolean pivot);
    
    /**
     * Sets (as xml) the "pivot" attribute
     */
    void xsetPivot(org.apache.xmlbeans.XmlBoolean pivot);
    
    /**
     * Unsets the "pivot" attribute
     */
    void unsetPivot();
    
    /**
     * Gets the "table" attribute
     */
    boolean getTable();
    
    /**
     * Gets (as xml) the "table" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTable();
    
    /**
     * True if has "table" attribute
     */
    boolean isSetTable();
    
    /**
     * Sets the "table" attribute
     */
    void setTable(boolean table);
    
    /**
     * Sets (as xml) the "table" attribute
     */
    void xsetTable(org.apache.xmlbeans.XmlBoolean table);
    
    /**
     * Unsets the "table" attribute
     */
    void unsetTable();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

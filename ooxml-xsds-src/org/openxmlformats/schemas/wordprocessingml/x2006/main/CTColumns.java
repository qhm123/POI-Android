/*
 * XML Type:  CT_Columns
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Columns(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTColumns extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColumns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolumns51d5type");
    
    /**
     * Gets a List of "col" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn> getColList();
    
    /**
     * Gets array of all "col" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn[] getColArray();
    
    /**
     * Gets ith "col" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn getColArray(int i);
    
    /**
     * Returns number of "col" element
     */
    int sizeOfColArray();
    
    /**
     * Sets array of all "col" element
     */
    void setColArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn[] colArray);
    
    /**
     * Sets ith "col" element
     */
    void setColArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn col);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn insertNewCol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn addNewCol();
    
    /**
     * Removes the ith "col" element
     */
    void removeCol(int i);
    
    /**
     * Gets the "equalWidth" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getEqualWidth();
    
    /**
     * Gets (as xml) the "equalWidth" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetEqualWidth();
    
    /**
     * True if has "equalWidth" attribute
     */
    boolean isSetEqualWidth();
    
    /**
     * Sets the "equalWidth" attribute
     */
    void setEqualWidth(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum equalWidth);
    
    /**
     * Sets (as xml) the "equalWidth" attribute
     */
    void xsetEqualWidth(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff equalWidth);
    
    /**
     * Unsets the "equalWidth" attribute
     */
    void unsetEqualWidth();
    
    /**
     * Gets the "space" attribute
     */
    java.math.BigInteger getSpace();
    
    /**
     * Gets (as xml) the "space" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetSpace();
    
    /**
     * True if has "space" attribute
     */
    boolean isSetSpace();
    
    /**
     * Sets the "space" attribute
     */
    void setSpace(java.math.BigInteger space);
    
    /**
     * Sets (as xml) the "space" attribute
     */
    void xsetSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure space);
    
    /**
     * Unsets the "space" attribute
     */
    void unsetSpace();
    
    /**
     * Gets the "num" attribute
     */
    java.math.BigInteger getNum();
    
    /**
     * Gets (as xml) the "num" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetNum();
    
    /**
     * True if has "num" attribute
     */
    boolean isSetNum();
    
    /**
     * Sets the "num" attribute
     */
    void setNum(java.math.BigInteger num);
    
    /**
     * Sets (as xml) the "num" attribute
     */
    void xsetNum(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber num);
    
    /**
     * Unsets the "num" attribute
     */
    void unsetNum();
    
    /**
     * Gets the "sep" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getSep();
    
    /**
     * Gets (as xml) the "sep" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetSep();
    
    /**
     * True if has "sep" attribute
     */
    boolean isSetSep();
    
    /**
     * Sets the "sep" attribute
     */
    void setSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum sep);
    
    /**
     * Sets (as xml) the "sep" attribute
     */
    void xsetSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff sep);
    
    /**
     * Unsets the "sep" attribute
     */
    void unsetSep();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

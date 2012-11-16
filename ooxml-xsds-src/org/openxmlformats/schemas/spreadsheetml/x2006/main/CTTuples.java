/*
 * XML Type:  CT_Tuples
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Tuples(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTuples extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTuples.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttuples49f4type");
    
    /**
     * Gets a List of "tpl" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple> getTplList();
    
    /**
     * Gets array of all "tpl" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple[] getTplArray();
    
    /**
     * Gets ith "tpl" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple getTplArray(int i);
    
    /**
     * Returns number of "tpl" element
     */
    int sizeOfTplArray();
    
    /**
     * Sets array of all "tpl" element
     */
    void setTplArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple[] tplArray);
    
    /**
     * Sets ith "tpl" element
     */
    void setTplArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple tpl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tpl" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple insertNewTpl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tpl" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple addNewTpl();
    
    /**
     * Removes the ith "tpl" element
     */
    void removeTpl(int i);
    
    /**
     * Gets the "c" attribute
     */
    long getC();
    
    /**
     * Gets (as xml) the "c" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetC();
    
    /**
     * True if has "c" attribute
     */
    boolean isSetC();
    
    /**
     * Sets the "c" attribute
     */
    void setC(long c);
    
    /**
     * Sets (as xml) the "c" attribute
     */
    void xsetC(org.apache.xmlbeans.XmlUnsignedInt c);
    
    /**
     * Unsets the "c" attribute
     */
    void unsetC();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

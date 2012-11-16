/*
 * XML Type:  CT_DdeValue
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DdeValue(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDdeValue extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDdeValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctddevaluedc55type");
    
    /**
     * Gets the "val" element
     */
    java.lang.String getVal();
    
    /**
     * Gets (as xml) the "val" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetVal();
    
    /**
     * Sets the "val" element
     */
    void setVal(java.lang.String val);
    
    /**
     * Sets (as xml) the "val" element
     */
    void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring val);
    
    /**
     * Gets the "t" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType.Enum getT();
    
    /**
     * Gets (as xml) the "t" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType xgetT();
    
    /**
     * True if has "t" attribute
     */
    boolean isSetT();
    
    /**
     * Sets the "t" attribute
     */
    void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType.Enum t);
    
    /**
     * Sets (as xml) the "t" attribute
     */
    void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType t);
    
    /**
     * Unsets the "t" attribute
     */
    void unsetT();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

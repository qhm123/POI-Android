/*
 * XML Type:  CT_CustomFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CustomFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomfilterb152type");
    
    /**
     * Gets the "operator" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator.Enum getOperator();
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator xgetOperator();
    
    /**
     * True if has "operator" attribute
     */
    boolean isSetOperator();
    
    /**
     * Sets the "operator" attribute
     */
    void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator.Enum operator);
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator operator);
    
    /**
     * Unsets the "operator" attribute
     */
    void unsetOperator();
    
    /**
     * Gets the "val" attribute
     */
    java.lang.String getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(java.lang.String val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

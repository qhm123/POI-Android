/*
 * XML Type:  CT_DynamicFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDynamicFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DynamicFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDynamicFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDynamicFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdynamicfilter3bf6type");
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDynamicFilterType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDynamicFilterType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDynamicFilterType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDynamicFilterType type);
    
    /**
     * Gets the "val" attribute
     */
    double getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(double val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.apache.xmlbeans.XmlDouble val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * Gets the "maxVal" attribute
     */
    double getMaxVal();
    
    /**
     * Gets (as xml) the "maxVal" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetMaxVal();
    
    /**
     * True if has "maxVal" attribute
     */
    boolean isSetMaxVal();
    
    /**
     * Sets the "maxVal" attribute
     */
    void setMaxVal(double maxVal);
    
    /**
     * Sets (as xml) the "maxVal" attribute
     */
    void xsetMaxVal(org.apache.xmlbeans.XmlDouble maxVal);
    
    /**
     * Unsets the "maxVal" attribute
     */
    void unsetMaxVal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

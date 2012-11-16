/*
 * XML Type:  CT_StrRef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_StrRef(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTStrRef extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStrRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstrref5d1atype");
    
    /**
     * Gets the "f" element
     */
    java.lang.String getF();
    
    /**
     * Gets (as xml) the "f" element
     */
    org.apache.xmlbeans.XmlString xgetF();
    
    /**
     * Sets the "f" element
     */
    void setF(java.lang.String f);
    
    /**
     * Sets (as xml) the "f" element
     */
    void xsetF(org.apache.xmlbeans.XmlString f);
    
    /**
     * Gets the "strCache" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData getStrCache();
    
    /**
     * True if has "strCache" element
     */
    boolean isSetStrCache();
    
    /**
     * Sets the "strCache" element
     */
    void setStrCache(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData strCache);
    
    /**
     * Appends and returns a new empty "strCache" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData addNewStrCache();
    
    /**
     * Unsets the "strCache" element
     */
    void unsetStrCache();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

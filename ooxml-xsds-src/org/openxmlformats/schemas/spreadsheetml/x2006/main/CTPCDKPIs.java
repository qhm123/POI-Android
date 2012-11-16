/*
 * XML Type:  CT_PCDKPIs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PCDKPIs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPCDKPIs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPCDKPIs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpcdkpis8c1ftype");
    
    /**
     * Gets a List of "kpi" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI> getKpiList();
    
    /**
     * Gets array of all "kpi" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI[] getKpiArray();
    
    /**
     * Gets ith "kpi" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI getKpiArray(int i);
    
    /**
     * Returns number of "kpi" element
     */
    int sizeOfKpiArray();
    
    /**
     * Sets array of all "kpi" element
     */
    void setKpiArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI[] kpiArray);
    
    /**
     * Sets ith "kpi" element
     */
    void setKpiArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI kpi);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "kpi" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI insertNewKpi(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "kpi" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI addNewKpi();
    
    /**
     * Removes the ith "kpi" element
     */
    void removeKpi(int i);
    
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

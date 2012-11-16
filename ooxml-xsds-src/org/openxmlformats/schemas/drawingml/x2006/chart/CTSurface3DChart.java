/*
 * XML Type:  CT_Surface3DChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Surface3DChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTSurface3DChart extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSurface3DChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsurface3dchartae5ctype");
    
    /**
     * Gets the "wireframe" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getWireframe();
    
    /**
     * True if has "wireframe" element
     */
    boolean isSetWireframe();
    
    /**
     * Sets the "wireframe" element
     */
    void setWireframe(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean wireframe);
    
    /**
     * Appends and returns a new empty "wireframe" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewWireframe();
    
    /**
     * Unsets the "wireframe" element
     */
    void unsetWireframe();
    
    /**
     * Gets a List of "ser" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer> getSerList();
    
    /**
     * Gets array of all "ser" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer[] getSerArray();
    
    /**
     * Gets ith "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer getSerArray(int i);
    
    /**
     * Returns number of "ser" element
     */
    int sizeOfSerArray();
    
    /**
     * Sets array of all "ser" element
     */
    void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer[] serArray);
    
    /**
     * Sets ith "ser" element
     */
    void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer ser);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer insertNewSer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer addNewSer();
    
    /**
     * Removes the ith "ser" element
     */
    void removeSer(int i);
    
    /**
     * Gets the "bandFmts" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts getBandFmts();
    
    /**
     * True if has "bandFmts" element
     */
    boolean isSetBandFmts();
    
    /**
     * Sets the "bandFmts" element
     */
    void setBandFmts(org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts bandFmts);
    
    /**
     * Appends and returns a new empty "bandFmts" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts addNewBandFmts();
    
    /**
     * Unsets the "bandFmts" element
     */
    void unsetBandFmts();
    
    /**
     * Gets a List of "axId" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getAxIdList();
    
    /**
     * Gets array of all "axId" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] getAxIdArray();
    
    /**
     * Gets ith "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getAxIdArray(int i);
    
    /**
     * Returns number of "axId" element
     */
    int sizeOfAxIdArray();
    
    /**
     * Sets array of all "axId" element
     */
    void setAxIdArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] axIdArray);
    
    /**
     * Sets ith "axId" element
     */
    void setAxIdArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt axId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt insertNewAxId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewAxId();
    
    /**
     * Removes the ith "axId" element
     */
    void removeAxId(int i);
    
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

/*
 * XML Type:  CT_AnimationGraphicalObjectBuildProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_AnimationGraphicalObjectBuildProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAnimationGraphicalObjectBuildProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAnimationGraphicalObjectBuildProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctanimationgraphicalobjectbuildpropertiesd944type");
    
    /**
     * Gets the "bldDgm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties getBldDgm();
    
    /**
     * True if has "bldDgm" element
     */
    boolean isSetBldDgm();
    
    /**
     * Sets the "bldDgm" element
     */
    void setBldDgm(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties bldDgm);
    
    /**
     * Appends and returns a new empty "bldDgm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties addNewBldDgm();
    
    /**
     * Unsets the "bldDgm" element
     */
    void unsetBldDgm();
    
    /**
     * Gets the "bldChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties getBldChart();
    
    /**
     * True if has "bldChart" element
     */
    boolean isSetBldChart();
    
    /**
     * Sets the "bldChart" element
     */
    void setBldChart(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties bldChart);
    
    /**
     * Appends and returns a new empty "bldChart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties addNewBldChart();
    
    /**
     * Unsets the "bldChart" element
     */
    void unsetBldChart();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

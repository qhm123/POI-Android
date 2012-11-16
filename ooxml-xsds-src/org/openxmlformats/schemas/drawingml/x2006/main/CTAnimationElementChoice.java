/*
 * XML Type:  CT_AnimationElementChoice
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_AnimationElementChoice(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAnimationElementChoice extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAnimationElementChoice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctanimationelementchoice9db4type");
    
    /**
     * Gets the "dgm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement getDgm();
    
    /**
     * True if has "dgm" element
     */
    boolean isSetDgm();
    
    /**
     * Sets the "dgm" element
     */
    void setDgm(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement dgm);
    
    /**
     * Appends and returns a new empty "dgm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement addNewDgm();
    
    /**
     * Unsets the "dgm" element
     */
    void unsetDgm();
    
    /**
     * Gets the "chart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement getChart();
    
    /**
     * True if has "chart" element
     */
    boolean isSetChart();
    
    /**
     * Sets the "chart" element
     */
    void setChart(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement chart);
    
    /**
     * Appends and returns a new empty "chart" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement addNewChart();
    
    /**
     * Unsets the "chart" element
     */
    void unsetChart();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

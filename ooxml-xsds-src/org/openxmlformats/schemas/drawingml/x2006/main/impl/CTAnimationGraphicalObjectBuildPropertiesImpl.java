/*
 * XML Type:  CT_AnimationGraphicalObjectBuildProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AnimationGraphicalObjectBuildProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAnimationGraphicalObjectBuildPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties
{
    
    public CTAnimationGraphicalObjectBuildPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLDDGM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bldDgm");
    private static final javax.xml.namespace.QName BLDCHART$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bldChart");
    
    
    /**
     * Gets the "bldDgm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties getBldDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties)get_store().find_element_user(BLDDGM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bldDgm" element
     */
    public boolean isSetBldDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDDGM$0) != 0;
        }
    }
    
    /**
     * Sets the "bldDgm" element
     */
    public void setBldDgm(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties bldDgm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties)get_store().find_element_user(BLDDGM$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties)get_store().add_element_user(BLDDGM$0);
            }
            target.set(bldDgm);
        }
    }
    
    /**
     * Appends and returns a new empty "bldDgm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties addNewBldDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmBuildProperties)get_store().add_element_user(BLDDGM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bldDgm" element
     */
    public void unsetBldDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDDGM$0, 0);
        }
    }
    
    /**
     * Gets the "bldChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties getBldChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties)get_store().find_element_user(BLDCHART$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bldChart" element
     */
    public boolean isSetBldChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDCHART$2) != 0;
        }
    }
    
    /**
     * Sets the "bldChart" element
     */
    public void setBldChart(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties bldChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties)get_store().find_element_user(BLDCHART$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties)get_store().add_element_user(BLDCHART$2);
            }
            target.set(bldChart);
        }
    }
    
    /**
     * Appends and returns a new empty "bldChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties addNewBldChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartBuildProperties)get_store().add_element_user(BLDCHART$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bldChart" element
     */
    public void unsetBldChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDCHART$2, 0);
        }
    }
}

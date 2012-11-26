/*
 * XML Type:  CT_AnimationElementChoice
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AnimationElementChoice(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAnimationElementChoiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice
{
    
    public CTAnimationElementChoiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DGM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "dgm");
    private static final javax.xml.namespace.QName CHART$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "chart");
    
    
    /**
     * Gets the "dgm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement getDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement)get_store().find_element_user(DGM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dgm" element
     */
    public boolean isSetDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DGM$0) != 0;
        }
    }
    
    /**
     * Sets the "dgm" element
     */
    public void setDgm(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement dgm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement)get_store().find_element_user(DGM$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement)get_store().add_element_user(DGM$0);
            }
            target.set(dgm);
        }
    }
    
    /**
     * Appends and returns a new empty "dgm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement addNewDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement)get_store().add_element_user(DGM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dgm" element
     */
    public void unsetDgm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DGM$0, 0);
        }
    }
    
    /**
     * Gets the "chart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement getChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement)get_store().find_element_user(CHART$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chart" element
     */
    public boolean isSetChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHART$2) != 0;
        }
    }
    
    /**
     * Sets the "chart" element
     */
    public void setChart(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement chart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement)get_store().find_element_user(CHART$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement)get_store().add_element_user(CHART$2);
            }
            target.set(chart);
        }
    }
    
    /**
     * Appends and returns a new empty "chart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement addNewChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement)get_store().add_element_user(CHART$2);
            return target;
        }
    }
    
    /**
     * Unsets the "chart" element
     */
    public void unsetChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHART$2, 0);
        }
    }
}

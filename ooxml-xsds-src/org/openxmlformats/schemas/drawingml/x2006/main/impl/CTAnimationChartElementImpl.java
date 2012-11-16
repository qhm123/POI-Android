/*
 * XML Type:  CT_AnimationChartElement
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AnimationChartElement(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAnimationChartElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationChartElement
{
    
    public CTAnimationChartElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIESIDX$0 = 
        new javax.xml.namespace.QName("", "seriesIdx");
    private static final javax.xml.namespace.QName CATEGORYIDX$2 = 
        new javax.xml.namespace.QName("", "categoryIdx");
    private static final javax.xml.namespace.QName BLDSTEP$4 = 
        new javax.xml.namespace.QName("", "bldStep");
    
    
    /**
     * Gets the "seriesIdx" attribute
     */
    public int getSeriesIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIESIDX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERIESIDX$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "seriesIdx" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetSeriesIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SERIESIDX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(SERIESIDX$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "seriesIdx" attribute
     */
    public boolean isSetSeriesIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERIESIDX$0) != null;
        }
    }
    
    /**
     * Sets the "seriesIdx" attribute
     */
    public void setSeriesIdx(int seriesIdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIESIDX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIESIDX$0);
            }
            target.setIntValue(seriesIdx);
        }
    }
    
    /**
     * Sets (as xml) the "seriesIdx" attribute
     */
    public void xsetSeriesIdx(org.apache.xmlbeans.XmlInt seriesIdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SERIESIDX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(SERIESIDX$0);
            }
            target.set(seriesIdx);
        }
    }
    
    /**
     * Unsets the "seriesIdx" attribute
     */
    public void unsetSeriesIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERIESIDX$0);
        }
    }
    
    /**
     * Gets the "categoryIdx" attribute
     */
    public int getCategoryIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYIDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CATEGORYIDX$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoryIdx" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCategoryIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CATEGORYIDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(CATEGORYIDX$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "categoryIdx" attribute
     */
    public boolean isSetCategoryIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATEGORYIDX$2) != null;
        }
    }
    
    /**
     * Sets the "categoryIdx" attribute
     */
    public void setCategoryIdx(int categoryIdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYIDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYIDX$2);
            }
            target.setIntValue(categoryIdx);
        }
    }
    
    /**
     * Sets (as xml) the "categoryIdx" attribute
     */
    public void xsetCategoryIdx(org.apache.xmlbeans.XmlInt categoryIdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CATEGORYIDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CATEGORYIDX$2);
            }
            target.set(categoryIdx);
        }
    }
    
    /**
     * Unsets the "categoryIdx" attribute
     */
    public void unsetCategoryIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATEGORYIDX$2);
        }
    }
    
    /**
     * Gets the "bldStep" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep.Enum getBldStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDSTEP$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bldStep" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep xgetBldStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep)get_store().find_attribute_user(BLDSTEP$4);
            return target;
        }
    }
    
    /**
     * Sets the "bldStep" attribute
     */
    public void setBldStep(org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep.Enum bldStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDSTEP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLDSTEP$4);
            }
            target.setEnumValue(bldStep);
        }
    }
    
    /**
     * Sets (as xml) the "bldStep" attribute
     */
    public void xsetBldStep(org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep bldStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep)get_store().find_attribute_user(BLDSTEP$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STChartBuildStep)get_store().add_attribute_user(BLDSTEP$4);
            }
            target.set(bldStep);
        }
    }
}

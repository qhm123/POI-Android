/*
 * XML Type:  CT_Scaling
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Scaling(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTScalingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling
{
    
    public CTScalingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "logBase");
    private static final javax.xml.namespace.QName ORIENTATION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "orientation");
    private static final javax.xml.namespace.QName MAX$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "max");
    private static final javax.xml.namespace.QName MIN$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "min");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "logBase" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase getLogBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase)get_store().find_element_user(LOGBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "logBase" element
     */
    public boolean isSetLogBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGBASE$0) != 0;
        }
    }
    
    /**
     * Sets the "logBase" element
     */
    public void setLogBase(org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase logBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase)get_store().find_element_user(LOGBASE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase)get_store().add_element_user(LOGBASE$0);
            }
            target.set(logBase);
        }
    }
    
    /**
     * Appends and returns a new empty "logBase" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase addNewLogBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase)get_store().add_element_user(LOGBASE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "logBase" element
     */
    public void unsetLogBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGBASE$0, 0);
        }
    }
    
    /**
     * Gets the "orientation" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation getOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation)get_store().find_element_user(ORIENTATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orientation" element
     */
    public boolean isSetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIENTATION$2) != 0;
        }
    }
    
    /**
     * Sets the "orientation" element
     */
    public void setOrientation(org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation)get_store().find_element_user(ORIENTATION$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation)get_store().add_element_user(ORIENTATION$2);
            }
            target.set(orientation);
        }
    }
    
    /**
     * Appends and returns a new empty "orientation" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation addNewOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation)get_store().add_element_user(ORIENTATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "orientation" element
     */
    public void unsetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIENTATION$2, 0);
        }
    }
    
    /**
     * Gets the "max" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(MAX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "max" element
     */
    public boolean isSetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAX$4) != 0;
        }
    }
    
    /**
     * Sets the "max" element
     */
    public void setMax(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(MAX$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(MAX$4);
            }
            target.set(max);
        }
    }
    
    /**
     * Appends and returns a new empty "max" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(MAX$4);
            return target;
        }
    }
    
    /**
     * Unsets the "max" element
     */
    public void unsetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAX$4, 0);
        }
    }
    
    /**
     * Gets the "min" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(MIN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "min" element
     */
    public boolean isSetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIN$6) != 0;
        }
    }
    
    /**
     * Sets the "min" element
     */
    public void setMin(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(MIN$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(MIN$6);
            }
            target.set(min);
        }
    }
    
    /**
     * Appends and returns a new empty "min" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(MIN$6);
            return target;
        }
    }
    
    /**
     * Unsets the "min" element
     */
    public void unsetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIN$6, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$8) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$8);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$8, 0);
        }
    }
}

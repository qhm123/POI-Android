/*
 * XML Type:  CT_Protection
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Protection(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTProtectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection
{
    
    public CTProtectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARTOBJECT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "chartObject");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "data");
    private static final javax.xml.namespace.QName FORMATTING$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "formatting");
    private static final javax.xml.namespace.QName SELECTION$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "selection");
    private static final javax.xml.namespace.QName USERINTERFACE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "userInterface");
    
    
    /**
     * Gets the "chartObject" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getChartObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(CHARTOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chartObject" element
     */
    public boolean isSetChartObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARTOBJECT$0) != 0;
        }
    }
    
    /**
     * Sets the "chartObject" element
     */
    public void setChartObject(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean chartObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(CHARTOBJECT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(CHARTOBJECT$0);
            }
            target.set(chartObject);
        }
    }
    
    /**
     * Appends and returns a new empty "chartObject" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewChartObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(CHARTOBJECT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "chartObject" element
     */
    public void unsetChartObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARTOBJECT$0, 0);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$2) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DATA$2);
            }
            target.set(data);
        }
    }
    
    /**
     * Appends and returns a new empty "data" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DATA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$2, 0);
        }
    }
    
    /**
     * Gets the "formatting" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(FORMATTING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formatting" element
     */
    public boolean isSetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATTING$4) != 0;
        }
    }
    
    /**
     * Sets the "formatting" element
     */
    public void setFormatting(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean formatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(FORMATTING$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(FORMATTING$4);
            }
            target.set(formatting);
        }
    }
    
    /**
     * Appends and returns a new empty "formatting" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(FORMATTING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "formatting" element
     */
    public void unsetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATTING$4, 0);
        }
    }
    
    /**
     * Gets the "selection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SELECTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "selection" element
     */
    public boolean isSetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTION$6) != 0;
        }
    }
    
    /**
     * Sets the "selection" element
     */
    public void setSelection(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean selection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SELECTION$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SELECTION$6);
            }
            target.set(selection);
        }
    }
    
    /**
     * Appends and returns a new empty "selection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SELECTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "selection" element
     */
    public void unsetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTION$6, 0);
        }
    }
    
    /**
     * Gets the "userInterface" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getUserInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(USERINTERFACE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userInterface" element
     */
    public boolean isSetUserInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERINTERFACE$8) != 0;
        }
    }
    
    /**
     * Sets the "userInterface" element
     */
    public void setUserInterface(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean userInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(USERINTERFACE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(USERINTERFACE$8);
            }
            target.set(userInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "userInterface" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewUserInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(USERINTERFACE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "userInterface" element
     */
    public void unsetUserInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERINTERFACE$8, 0);
        }
    }
}

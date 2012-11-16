/*
 * XML Type:  CT_SheetCalcPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetCalcPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetCalcPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr
{
    
    public CTSheetCalcPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLCALCONLOAD$0 = 
        new javax.xml.namespace.QName("", "fullCalcOnLoad");
    
    
    /**
     * Gets the "fullCalcOnLoad" attribute
     */
    public boolean getFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLCALCONLOAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FULLCALCONLOAD$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullCalcOnLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLCALCONLOAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FULLCALCONLOAD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "fullCalcOnLoad" attribute
     */
    public boolean isSetFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLCALCONLOAD$0) != null;
        }
    }
    
    /**
     * Sets the "fullCalcOnLoad" attribute
     */
    public void setFullCalcOnLoad(boolean fullCalcOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLCALCONLOAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLCALCONLOAD$0);
            }
            target.setBooleanValue(fullCalcOnLoad);
        }
    }
    
    /**
     * Sets (as xml) the "fullCalcOnLoad" attribute
     */
    public void xsetFullCalcOnLoad(org.apache.xmlbeans.XmlBoolean fullCalcOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLCALCONLOAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FULLCALCONLOAD$0);
            }
            target.set(fullCalcOnLoad);
        }
    }
    
    /**
     * Unsets the "fullCalcOnLoad" attribute
     */
    public void unsetFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLCALCONLOAD$0);
        }
    }
}

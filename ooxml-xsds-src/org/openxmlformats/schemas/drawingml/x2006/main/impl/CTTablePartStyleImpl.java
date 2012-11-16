/*
 * XML Type:  CT_TablePartStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TablePartStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTablePartStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle
{
    
    public CTTablePartStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCTXSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcTxStyle");
    private static final javax.xml.namespace.QName TCSTYLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcStyle");
    
    
    /**
     * Gets the "tcTxStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle getTcTxStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle)get_store().find_element_user(TCTXSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcTxStyle" element
     */
    public boolean isSetTcTxStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCTXSTYLE$0) != 0;
        }
    }
    
    /**
     * Sets the "tcTxStyle" element
     */
    public void setTcTxStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle tcTxStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle)get_store().find_element_user(TCTXSTYLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle)get_store().add_element_user(TCTXSTYLE$0);
            }
            target.set(tcTxStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "tcTxStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle addNewTcTxStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle)get_store().add_element_user(TCTXSTYLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tcTxStyle" element
     */
    public void unsetTcTxStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCTXSTYLE$0, 0);
        }
    }
    
    /**
     * Gets the "tcStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle getTcStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle)get_store().find_element_user(TCSTYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcStyle" element
     */
    public boolean isSetTcStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCSTYLE$2) != 0;
        }
    }
    
    /**
     * Sets the "tcStyle" element
     */
    public void setTcStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle tcStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle)get_store().find_element_user(TCSTYLE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle)get_store().add_element_user(TCSTYLE$2);
            }
            target.set(tcStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "tcStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle addNewTcStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle)get_store().add_element_user(TCSTYLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tcStyle" element
     */
    public void unsetTcStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCSTYLE$2, 0);
        }
    }
}

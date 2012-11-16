/*
 * XML Type:  CT_ColorFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ColorFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorFilter
{
    
    public CTColorFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DXFID$0 = 
        new javax.xml.namespace.QName("", "dxfId");
    private static final javax.xml.namespace.QName CELLCOLOR$2 = 
        new javax.xml.namespace.QName("", "cellColor");
    
    
    /**
     * Gets the "dxfId" attribute
     */
    public long getDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$0);
            return target;
        }
    }
    
    /**
     * True if has "dxfId" attribute
     */
    public boolean isSetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DXFID$0) != null;
        }
    }
    
    /**
     * Sets the "dxfId" attribute
     */
    public void setDxfId(long dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DXFID$0);
            }
            target.setLongValue(dxfId);
        }
    }
    
    /**
     * Sets (as xml) the "dxfId" attribute
     */
    public void xsetDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(DXFID$0);
            }
            target.set(dxfId);
        }
    }
    
    /**
     * Unsets the "dxfId" attribute
     */
    public void unsetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DXFID$0);
        }
    }
    
    /**
     * Gets the "cellColor" attribute
     */
    public boolean getCellColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLCOLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CELLCOLOR$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cellColor" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCellColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CELLCOLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CELLCOLOR$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "cellColor" attribute
     */
    public boolean isSetCellColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELLCOLOR$2) != null;
        }
    }
    
    /**
     * Sets the "cellColor" attribute
     */
    public void setCellColor(boolean cellColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLCOLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLCOLOR$2);
            }
            target.setBooleanValue(cellColor);
        }
    }
    
    /**
     * Sets (as xml) the "cellColor" attribute
     */
    public void xsetCellColor(org.apache.xmlbeans.XmlBoolean cellColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CELLCOLOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CELLCOLOR$2);
            }
            target.set(cellColor);
        }
    }
    
    /**
     * Unsets the "cellColor" attribute
     */
    public void unsetCellColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELLCOLOR$2);
        }
    }
}

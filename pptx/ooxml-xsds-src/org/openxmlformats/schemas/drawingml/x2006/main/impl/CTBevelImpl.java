/*
 * XML Type:  CT_Bevel
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBevel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Bevel(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBevelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBevel
{
    
    public CTBevelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName W$0 = 
        new javax.xml.namespace.QName("", "w");
    private static final javax.xml.namespace.QName H$2 = 
        new javax.xml.namespace.QName("", "h");
    private static final javax.xml.namespace.QName PRST$4 = 
        new javax.xml.namespace.QName("", "prst");
    
    
    /**
     * Gets the "w" attribute
     */
    public long getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(W$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(W$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "w" attribute
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(W$0) != null;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(long w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$0);
            }
            target.setLongValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(W$0);
            }
            target.set(w);
        }
    }
    
    /**
     * Unsets the "w" attribute
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(W$0);
        }
    }
    
    /**
     * Gets the "h" attribute
     */
    public long getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(H$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "h" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(H$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(H$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "h" attribute
     */
    public boolean isSetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(H$2) != null;
        }
    }
    
    /**
     * Sets the "h" attribute
     */
    public void setH(long h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(H$2);
            }
            target.setLongValue(h);
        }
    }
    
    /**
     * Sets (as xml) the "h" attribute
     */
    public void xsetH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(H$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(H$2);
            }
            target.set(h);
        }
    }
    
    /**
     * Unsets the "h" attribute
     */
    public void unsetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(H$2);
        }
    }
    
    /**
     * Gets the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.Enum getPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRST$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType xgetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType)get_default_attribute_value(PRST$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "prst" attribute
     */
    public boolean isSetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRST$4) != null;
        }
    }
    
    /**
     * Sets the "prst" attribute
     */
    public void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType.Enum prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRST$4);
            }
            target.setEnumValue(prst);
        }
    }
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    public void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBevelPresetType)get_store().add_attribute_user(PRST$4);
            }
            target.set(prst);
        }
    }
    
    /**
     * Unsets the "prst" attribute
     */
    public void unsetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRST$4);
        }
    }
}

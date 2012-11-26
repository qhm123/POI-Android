/*
 * XML Type:  CT_RelativeOffsetEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_RelativeOffsetEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRelativeOffsetEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect
{
    
    public CTRelativeOffsetEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TX$0 = 
        new javax.xml.namespace.QName("", "tx");
    private static final javax.xml.namespace.QName TY$2 = 
        new javax.xml.namespace.QName("", "ty");
    
    
    /**
     * Gets the "tx" attribute
     */
    public int getTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TX$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(TX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(TX$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "tx" attribute
     */
    public boolean isSetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TX$0) != null;
        }
    }
    
    /**
     * Sets the "tx" attribute
     */
    public void setTx(int tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TX$0);
            }
            target.setIntValue(tx);
        }
    }
    
    /**
     * Sets (as xml) the "tx" attribute
     */
    public void xsetTx(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(TX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(TX$0);
            }
            target.set(tx);
        }
    }
    
    /**
     * Unsets the "tx" attribute
     */
    public void unsetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TX$0);
        }
    }
    
    /**
     * Gets the "ty" attribute
     */
    public int getTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TY$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ty" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(TY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(TY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "ty" attribute
     */
    public boolean isSetTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TY$2) != null;
        }
    }
    
    /**
     * Sets the "ty" attribute
     */
    public void setTy(int ty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TY$2);
            }
            target.setIntValue(ty);
        }
    }
    
    /**
     * Sets (as xml) the "ty" attribute
     */
    public void xsetTy(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage ty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(TY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(TY$2);
            }
            target.set(ty);
        }
    }
    
    /**
     * Unsets the "ty" attribute
     */
    public void unsetTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TY$2);
        }
    }
}

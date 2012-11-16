/*
 * XML Type:  CT_FlatText
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_FlatText(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFlatTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText
{
    
    public CTFlatTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName Z$0 = 
        new javax.xml.namespace.QName("", "z");
    
    
    /**
     * Gets the "z" attribute
     */
    public long getZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Z$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(Z$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "z" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(Z$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_default_attribute_value(Z$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "z" attribute
     */
    public boolean isSetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(Z$0) != null;
        }
    }
    
    /**
     * Sets the "z" attribute
     */
    public void setZ(long z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Z$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(Z$0);
            }
            target.setLongValue(z);
        }
    }
    
    /**
     * Sets (as xml) the "z" attribute
     */
    public void xsetZ(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(Z$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(Z$0);
            }
            target.set(z);
        }
    }
    
    /**
     * Unsets the "z" attribute
     */
    public void unsetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(Z$0);
        }
    }
}

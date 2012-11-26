/*
 * XML Type:  CT_LineEndProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LineEndProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLineEndPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties
{
    
    public CTLineEndPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName W$2 = 
        new javax.xml.namespace.QName("", "w");
    private static final javax.xml.namespace.QName LEN$4 = 
        new javax.xml.namespace.QName("", "len");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "w" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth.Enum getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth)get_store().find_attribute_user(W$2);
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
            return get_store().find_attribute_user(W$2) != null;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth.Enum w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$2);
            }
            target.setEnumValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth)get_store().find_attribute_user(W$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth)get_store().add_attribute_user(W$2);
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
            get_store().remove_attribute(W$2);
        }
    }
    
    /**
     * Gets the "len" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength.Enum getLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEN$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "len" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength xgetLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength)get_store().find_attribute_user(LEN$4);
            return target;
        }
    }
    
    /**
     * True if has "len" attribute
     */
    public boolean isSetLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEN$4) != null;
        }
    }
    
    /**
     * Sets the "len" attribute
     */
    public void setLen(org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength.Enum len)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEN$4);
            }
            target.setEnumValue(len);
        }
    }
    
    /**
     * Sets (as xml) the "len" attribute
     */
    public void xsetLen(org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength len)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength)get_store().find_attribute_user(LEN$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength)get_store().add_attribute_user(LEN$4);
            }
            target.set(len);
        }
    }
    
    /**
     * Unsets the "len" attribute
     */
    public void unsetLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEN$4);
        }
    }
}

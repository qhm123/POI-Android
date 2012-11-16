/*
 * XML Type:  CT_Br
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Br(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr
{
    
    public CTBrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName CLEAR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "clear");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType.Enum getType()
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
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType)get_store().find_attribute_user(TYPE$0);
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
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType.Enum type)
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
    public void xsetType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType)get_store().add_attribute_user(TYPE$0);
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
     * Gets the "clear" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear.Enum getClear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEAR$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "clear" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear xgetClear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear)get_store().find_attribute_user(CLEAR$2);
            return target;
        }
    }
    
    /**
     * True if has "clear" attribute
     */
    public boolean isSetClear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLEAR$2) != null;
        }
    }
    
    /**
     * Sets the "clear" attribute
     */
    public void setClear(org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear.Enum clear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLEAR$2);
            }
            target.setEnumValue(clear);
        }
    }
    
    /**
     * Sets (as xml) the "clear" attribute
     */
    public void xsetClear(org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear clear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear)get_store().find_attribute_user(CLEAR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear)get_store().add_attribute_user(CLEAR$2);
            }
            target.set(clear);
        }
    }
    
    /**
     * Unsets the "clear" attribute
     */
    public void unsetClear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLEAR$2);
        }
    }
}

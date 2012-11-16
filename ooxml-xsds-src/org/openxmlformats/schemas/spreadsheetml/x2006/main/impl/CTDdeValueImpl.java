/*
 * XML Type:  CT_DdeValue
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DdeValue(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDdeValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue
{
    
    public CTDdeValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "val");
    private static final javax.xml.namespace.QName T$2 = 
        new javax.xml.namespace.QName("", "t");
    
    
    /**
     * Gets the "val" element
     */
    public java.lang.String getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(VAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "val" element
     */
    public void setVal(java.lang.String val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAL$0);
            }
            target.setStringValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" element
     */
    public void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(VAL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType)get_default_attribute_value(T$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "t" attribute
     */
    public boolean isSetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(T$2) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$2);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDdeValueType)get_store().add_attribute_user(T$2);
            }
            target.set(t);
        }
    }
    
    /**
     * Unsets the "t" attribute
     */
    public void unsetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(T$2);
        }
    }
}

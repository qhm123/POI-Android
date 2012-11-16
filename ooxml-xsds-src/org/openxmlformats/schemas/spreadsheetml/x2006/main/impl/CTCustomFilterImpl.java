/*
 * XML Type:  CT_CustomFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomFilter
{
    
    public CTCustomFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("", "operator");
    private static final javax.xml.namespace.QName VAL$2 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets the "operator" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator)get_default_attribute_value(OPERATOR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$0) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$0);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFilterOperator)get_store().add_attribute_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$0);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public java.lang.String getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(VAL$2);
            return target;
        }
    }
    
    /**
     * True if has "val" attribute
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAL$2) != null;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.lang.String val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$2);
            }
            target.setStringValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(VAL$2);
            }
            target.set(val);
        }
    }
    
    /**
     * Unsets the "val" attribute
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAL$2);
        }
    }
}

/*
 * XML Type:  CT_UnderlineProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_UnderlineProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTUnderlinePropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty
{
    
    public CTUnderlinePropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VAL$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues)get_default_attribute_value(VAL$0);
            }
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
            return get_store().find_attribute_user(VAL$0) != null;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setEnumValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues)get_store().add_attribute_user(VAL$0);
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
            get_store().remove_attribute(VAL$0);
        }
    }
}

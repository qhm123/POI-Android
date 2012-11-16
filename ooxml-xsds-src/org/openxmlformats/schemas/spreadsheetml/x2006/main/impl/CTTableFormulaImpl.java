/*
 * XML Type:  CT_TableFormula
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableFormula(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula.
 */
public class CTTableFormulaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula
{
    
    public CTTableFormulaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CTTableFormulaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("", "array");
    
    
    /**
     * Gets the "array" attribute
     */
    public boolean getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ARRAY$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "array" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ARRAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ARRAY$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "array" attribute
     */
    public boolean isSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARRAY$0) != null;
        }
    }
    
    /**
     * Sets the "array" attribute
     */
    public void setArray(boolean array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARRAY$0);
            }
            target.setBooleanValue(array);
        }
    }
    
    /**
     * Sets (as xml) the "array" attribute
     */
    public void xsetArray(org.apache.xmlbeans.XmlBoolean array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ARRAY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ARRAY$0);
            }
            target.set(array);
        }
    }
    
    /**
     * Unsets the "array" attribute
     */
    public void unsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARRAY$0);
        }
    }
}

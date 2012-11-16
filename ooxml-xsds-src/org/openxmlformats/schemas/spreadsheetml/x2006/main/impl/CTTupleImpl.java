/*
 * XML Type:  CT_Tuple
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Tuple(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTupleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple
{
    
    public CTTupleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLD$0 = 
        new javax.xml.namespace.QName("", "fld");
    private static final javax.xml.namespace.QName HIER$2 = 
        new javax.xml.namespace.QName("", "hier");
    private static final javax.xml.namespace.QName ITEM$4 = 
        new javax.xml.namespace.QName("", "item");
    
    
    /**
     * Gets the "fld" attribute
     */
    public long getFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLD$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fld" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FLD$0);
            return target;
        }
    }
    
    /**
     * True if has "fld" attribute
     */
    public boolean isSetFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLD$0) != null;
        }
    }
    
    /**
     * Sets the "fld" attribute
     */
    public void setFld(long fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLD$0);
            }
            target.setLongValue(fld);
        }
    }
    
    /**
     * Sets (as xml) the "fld" attribute
     */
    public void xsetFld(org.apache.xmlbeans.XmlUnsignedInt fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FLD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FLD$0);
            }
            target.set(fld);
        }
    }
    
    /**
     * Unsets the "fld" attribute
     */
    public void unsetFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLD$0);
        }
    }
    
    /**
     * Gets the "hier" attribute
     */
    public long getHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIER$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "hier" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HIER$2);
            return target;
        }
    }
    
    /**
     * True if has "hier" attribute
     */
    public boolean isSetHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIER$2) != null;
        }
    }
    
    /**
     * Sets the "hier" attribute
     */
    public void setHier(long hier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIER$2);
            }
            target.setLongValue(hier);
        }
    }
    
    /**
     * Sets (as xml) the "hier" attribute
     */
    public void xsetHier(org.apache.xmlbeans.XmlUnsignedInt hier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HIER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(HIER$2);
            }
            target.set(hier);
        }
    }
    
    /**
     * Unsets the "hier" attribute
     */
    public void unsetHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIER$2);
        }
    }
    
    /**
     * Gets the "item" attribute
     */
    public long getItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEM$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "item" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ITEM$4);
            return target;
        }
    }
    
    /**
     * Sets the "item" attribute
     */
    public void setItem(long item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEM$4);
            }
            target.setLongValue(item);
        }
    }
    
    /**
     * Sets (as xml) the "item" attribute
     */
    public void xsetItem(org.apache.xmlbeans.XmlUnsignedInt item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ITEM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ITEM$4);
            }
            target.set(item);
        }
    }
}

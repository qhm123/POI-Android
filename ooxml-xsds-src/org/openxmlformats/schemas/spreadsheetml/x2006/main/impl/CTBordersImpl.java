/*
 * XML Type:  CT_Borders
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Borders(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBordersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders
{
    
    public CTBordersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "border");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "border" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder> getBorderList()
    {
        final class BorderList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder get(int i)
                { return CTBordersImpl.this.getBorderArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder old = CTBordersImpl.this.getBorderArray(i);
                CTBordersImpl.this.setBorderArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder o)
                { CTBordersImpl.this.insertNewBorder(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder old = CTBordersImpl.this.getBorderArray(i);
                CTBordersImpl.this.removeBorder(i);
                return old;
            }
            
            public int size()
                { return CTBordersImpl.this.sizeOfBorderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BorderList();
        }
    }
    
    /**
     * Gets array of all "border" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder[] getBorderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BORDER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "border" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder getBorderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().find_element_user(BORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "border" element
     */
    public int sizeOfBorderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDER$0);
        }
    }
    
    /**
     * Sets array of all "border" element
     */
    public void setBorderArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder[] borderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(borderArray, BORDER$0);
        }
    }
    
    /**
     * Sets ith "border" element
     */
    public void setBorderArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder border)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().find_element_user(BORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(border);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "border" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder insertNewBorder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().insert_element_user(BORDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "border" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder addNewBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().add_element_user(BORDER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "border" element
     */
    public void removeBorder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDER$0, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$2) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$2);
        }
    }
}

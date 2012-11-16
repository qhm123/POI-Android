/*
 * XML Type:  CT_TableStyle
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableStyle(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle
{
    
    public CTTableStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLESTYLEELEMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyleElement");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName PIVOT$4 = 
        new javax.xml.namespace.QName("", "pivot");
    private static final javax.xml.namespace.QName TABLE$6 = 
        new javax.xml.namespace.QName("", "table");
    private static final javax.xml.namespace.QName COUNT$8 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "tableStyleElement" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement> getTableStyleElementList()
    {
        final class TableStyleElementList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement get(int i)
                { return CTTableStyleImpl.this.getTableStyleElementArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement old = CTTableStyleImpl.this.getTableStyleElementArray(i);
                CTTableStyleImpl.this.setTableStyleElementArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement o)
                { CTTableStyleImpl.this.insertNewTableStyleElement(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement old = CTTableStyleImpl.this.getTableStyleElementArray(i);
                CTTableStyleImpl.this.removeTableStyleElement(i);
                return old;
            }
            
            public int size()
                { return CTTableStyleImpl.this.sizeOfTableStyleElementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TableStyleElementList();
        }
    }
    
    /**
     * Gets array of all "tableStyleElement" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement[] getTableStyleElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLESTYLEELEMENT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tableStyleElement" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement getTableStyleElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement)get_store().find_element_user(TABLESTYLEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tableStyleElement" element
     */
    public int sizeOfTableStyleElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLESTYLEELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "tableStyleElement" element
     */
    public void setTableStyleElementArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement[] tableStyleElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tableStyleElementArray, TABLESTYLEELEMENT$0);
        }
    }
    
    /**
     * Sets ith "tableStyleElement" element
     */
    public void setTableStyleElementArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement tableStyleElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement)get_store().find_element_user(TABLESTYLEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tableStyleElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tableStyleElement" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement insertNewTableStyleElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement)get_store().insert_element_user(TABLESTYLEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tableStyleElement" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement addNewTableStyleElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement)get_store().add_element_user(TABLESTYLEELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tableStyleElement" element
     */
    public void removeTableStyleElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLESTYLEELEMENT$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "pivot" attribute
     */
    public boolean getPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PIVOT$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pivot" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PIVOT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "pivot" attribute
     */
    public boolean isSetPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PIVOT$4) != null;
        }
    }
    
    /**
     * Sets the "pivot" attribute
     */
    public void setPivot(boolean pivot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PIVOT$4);
            }
            target.setBooleanValue(pivot);
        }
    }
    
    /**
     * Sets (as xml) the "pivot" attribute
     */
    public void xsetPivot(org.apache.xmlbeans.XmlBoolean pivot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PIVOT$4);
            }
            target.set(pivot);
        }
    }
    
    /**
     * Unsets the "pivot" attribute
     */
    public void unsetPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PIVOT$4);
        }
    }
    
    /**
     * Gets the "table" attribute
     */
    public boolean getTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TABLE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "table" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TABLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TABLE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "table" attribute
     */
    public boolean isSetTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLE$6) != null;
        }
    }
    
    /**
     * Sets the "table" attribute
     */
    public void setTable(boolean table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLE$6);
            }
            target.setBooleanValue(table);
        }
    }
    
    /**
     * Sets (as xml) the "table" attribute
     */
    public void xsetTable(org.apache.xmlbeans.XmlBoolean table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TABLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TABLE$6);
            }
            target.set(table);
        }
    }
    
    /**
     * Unsets the "table" attribute
     */
    public void unsetTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$8);
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
            return get_store().find_attribute_user(COUNT$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$8);
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
            get_store().remove_attribute(COUNT$8);
        }
    }
}

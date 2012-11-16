/*
 * XML Type:  CT_TableStyles
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableStyles(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStylesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles
{
    
    public CTTableStylesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLESTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyle");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName DEFAULTTABLESTYLE$4 = 
        new javax.xml.namespace.QName("", "defaultTableStyle");
    private static final javax.xml.namespace.QName DEFAULTPIVOTSTYLE$6 = 
        new javax.xml.namespace.QName("", "defaultPivotStyle");
    
    
    /**
     * Gets a List of "tableStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle> getTableStyleList()
    {
        final class TableStyleList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle get(int i)
                { return CTTableStylesImpl.this.getTableStyleArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle old = CTTableStylesImpl.this.getTableStyleArray(i);
                CTTableStylesImpl.this.setTableStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle o)
                { CTTableStylesImpl.this.insertNewTableStyle(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle old = CTTableStylesImpl.this.getTableStyleArray(i);
                CTTableStylesImpl.this.removeTableStyle(i);
                return old;
            }
            
            public int size()
                { return CTTableStylesImpl.this.sizeOfTableStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TableStyleList();
        }
    }
    
    /**
     * Gets array of all "tableStyle" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle[] getTableStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLESTYLE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tableStyle" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle getTableStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle)get_store().find_element_user(TABLESTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tableStyle" element
     */
    public int sizeOfTableStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLESTYLE$0);
        }
    }
    
    /**
     * Sets array of all "tableStyle" element
     */
    public void setTableStyleArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle[] tableStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tableStyleArray, TABLESTYLE$0);
        }
    }
    
    /**
     * Sets ith "tableStyle" element
     */
    public void setTableStyleArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle tableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle)get_store().find_element_user(TABLESTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tableStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tableStyle" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle insertNewTableStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle)get_store().insert_element_user(TABLESTYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tableStyle" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle addNewTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle)get_store().add_element_user(TABLESTYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tableStyle" element
     */
    public void removeTableStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLESTYLE$0, i);
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
    
    /**
     * Gets the "defaultTableStyle" attribute
     */
    public java.lang.String getDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTABLESTYLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultTableStyle" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTABLESTYLE$4);
            return target;
        }
    }
    
    /**
     * True if has "defaultTableStyle" attribute
     */
    public boolean isSetDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTTABLESTYLE$4) != null;
        }
    }
    
    /**
     * Sets the "defaultTableStyle" attribute
     */
    public void setDefaultTableStyle(java.lang.String defaultTableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTABLESTYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTABLESTYLE$4);
            }
            target.setStringValue(defaultTableStyle);
        }
    }
    
    /**
     * Sets (as xml) the "defaultTableStyle" attribute
     */
    public void xsetDefaultTableStyle(org.apache.xmlbeans.XmlString defaultTableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTABLESTYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTABLESTYLE$4);
            }
            target.set(defaultTableStyle);
        }
    }
    
    /**
     * Unsets the "defaultTableStyle" attribute
     */
    public void unsetDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTTABLESTYLE$4);
        }
    }
    
    /**
     * Gets the "defaultPivotStyle" attribute
     */
    public java.lang.String getDefaultPivotStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPIVOTSTYLE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultPivotStyle" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefaultPivotStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTPIVOTSTYLE$6);
            return target;
        }
    }
    
    /**
     * True if has "defaultPivotStyle" attribute
     */
    public boolean isSetDefaultPivotStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTPIVOTSTYLE$6) != null;
        }
    }
    
    /**
     * Sets the "defaultPivotStyle" attribute
     */
    public void setDefaultPivotStyle(java.lang.String defaultPivotStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPIVOTSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTPIVOTSTYLE$6);
            }
            target.setStringValue(defaultPivotStyle);
        }
    }
    
    /**
     * Sets (as xml) the "defaultPivotStyle" attribute
     */
    public void xsetDefaultPivotStyle(org.apache.xmlbeans.XmlString defaultPivotStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTPIVOTSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTPIVOTSTYLE$6);
            }
            target.set(defaultPivotStyle);
        }
    }
    
    /**
     * Unsets the "defaultPivotStyle" attribute
     */
    public void unsetDefaultPivotStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTPIVOTSTYLE$6);
        }
    }
}

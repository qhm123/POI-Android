/*
 * XML Type:  CT_PageBreak
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PageBreak(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageBreakImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak
{
    
    public CTPageBreakImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "brk");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName MANUALBREAKCOUNT$4 = 
        new javax.xml.namespace.QName("", "manualBreakCount");
    
    
    /**
     * Gets a List of "brk" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak> getBrkList()
    {
        final class BrkList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak get(int i)
                { return CTPageBreakImpl.this.getBrkArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak old = CTPageBreakImpl.this.getBrkArray(i);
                CTPageBreakImpl.this.setBrkArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak o)
                { CTPageBreakImpl.this.insertNewBrk(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak old = CTPageBreakImpl.this.getBrkArray(i);
                CTPageBreakImpl.this.removeBrk(i);
                return old;
            }
            
            public int size()
                { return CTPageBreakImpl.this.sizeOfBrkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BrkList();
        }
    }
    
    /**
     * Gets array of all "brk" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak[] getBrkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BRK$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "brk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak getBrkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak)get_store().find_element_user(BRK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "brk" element
     */
    public int sizeOfBrkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRK$0);
        }
    }
    
    /**
     * Sets array of all "brk" element
     */
    public void setBrkArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak[] brkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brkArray, BRK$0);
        }
    }
    
    /**
     * Sets ith "brk" element
     */
    public void setBrkArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak brk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak)get_store().find_element_user(BRK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(brk);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "brk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak insertNewBrk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak)get_store().insert_element_user(BRK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "brk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak addNewBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak)get_store().add_element_user(BRK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "brk" element
     */
    public void removeBrk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRK$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$2);
            }
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
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$2);
            }
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
     * Gets the "manualBreakCount" attribute
     */
    public long getManualBreakCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUALBREAKCOUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MANUALBREAKCOUNT$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "manualBreakCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetManualBreakCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MANUALBREAKCOUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MANUALBREAKCOUNT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "manualBreakCount" attribute
     */
    public boolean isSetManualBreakCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MANUALBREAKCOUNT$4) != null;
        }
    }
    
    /**
     * Sets the "manualBreakCount" attribute
     */
    public void setManualBreakCount(long manualBreakCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUALBREAKCOUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUALBREAKCOUNT$4);
            }
            target.setLongValue(manualBreakCount);
        }
    }
    
    /**
     * Sets (as xml) the "manualBreakCount" attribute
     */
    public void xsetManualBreakCount(org.apache.xmlbeans.XmlUnsignedInt manualBreakCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MANUALBREAKCOUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MANUALBREAKCOUNT$4);
            }
            target.set(manualBreakCount);
        }
    }
    
    /**
     * Unsets the "manualBreakCount" attribute
     */
    public void unsetManualBreakCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MANUALBREAKCOUNT$4);
        }
    }
}

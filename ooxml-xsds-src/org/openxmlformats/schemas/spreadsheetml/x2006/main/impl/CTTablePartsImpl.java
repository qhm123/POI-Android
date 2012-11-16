/*
 * XML Type:  CT_TableParts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableParts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTablePartsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts
{
    
    public CTTablePartsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLEPART$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tablePart");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "tablePart" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart> getTablePartList()
    {
        final class TablePartList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart get(int i)
                { return CTTablePartsImpl.this.getTablePartArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart old = CTTablePartsImpl.this.getTablePartArray(i);
                CTTablePartsImpl.this.setTablePartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart o)
                { CTTablePartsImpl.this.insertNewTablePart(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart old = CTTablePartsImpl.this.getTablePartArray(i);
                CTTablePartsImpl.this.removeTablePart(i);
                return old;
            }
            
            public int size()
                { return CTTablePartsImpl.this.sizeOfTablePartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TablePartList();
        }
    }
    
    /**
     * Gets array of all "tablePart" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart[] getTablePartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLEPART$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tablePart" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart getTablePartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart)get_store().find_element_user(TABLEPART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tablePart" element
     */
    public int sizeOfTablePartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLEPART$0);
        }
    }
    
    /**
     * Sets array of all "tablePart" element
     */
    public void setTablePartArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart[] tablePartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tablePartArray, TABLEPART$0);
        }
    }
    
    /**
     * Sets ith "tablePart" element
     */
    public void setTablePartArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart tablePart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart)get_store().find_element_user(TABLEPART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tablePart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tablePart" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart insertNewTablePart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart)get_store().insert_element_user(TABLEPART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tablePart" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart addNewTablePart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart)get_store().add_element_user(TABLEPART$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tablePart" element
     */
    public void removeTablePart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLEPART$0, i);
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

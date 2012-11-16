/*
 * XML Type:  CT_SheetIdMap
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetIdMap(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetIdMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap
{
    
    public CTSheetIdMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetId");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "sheetId" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId> getSheetIdList()
    {
        final class SheetIdList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId get(int i)
                { return CTSheetIdMapImpl.this.getSheetIdArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId old = CTSheetIdMapImpl.this.getSheetIdArray(i);
                CTSheetIdMapImpl.this.setSheetIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId o)
                { CTSheetIdMapImpl.this.insertNewSheetId(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId old = CTSheetIdMapImpl.this.getSheetIdArray(i);
                CTSheetIdMapImpl.this.removeSheetId(i);
                return old;
            }
            
            public int size()
                { return CTSheetIdMapImpl.this.sizeOfSheetIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SheetIdList();
        }
    }
    
    /**
     * Gets array of all "sheetId" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId[] getSheetIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHEETID$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sheetId" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId getSheetIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId)get_store().find_element_user(SHEETID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sheetId" element
     */
    public int sizeOfSheetIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETID$0);
        }
    }
    
    /**
     * Sets array of all "sheetId" element
     */
    public void setSheetIdArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId[] sheetIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sheetIdArray, SHEETID$0);
        }
    }
    
    /**
     * Sets ith "sheetId" element
     */
    public void setSheetIdArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId)get_store().find_element_user(SHEETID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sheetId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetId" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId insertNewSheetId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId)get_store().insert_element_user(SHEETID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetId" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId addNewSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetId)get_store().add_element_user(SHEETID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sheetId" element
     */
    public void removeSheetId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETID$0, i);
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

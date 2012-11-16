/*
 * XML Type:  CT_CellStyles
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellStyles(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellStylesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles
{
    
    public CTCellStylesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyle");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "cellStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle> getCellStyleList()
    {
        final class CellStyleList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle get(int i)
                { return CTCellStylesImpl.this.getCellStyleArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle old = CTCellStylesImpl.this.getCellStyleArray(i);
                CTCellStylesImpl.this.setCellStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle o)
                { CTCellStylesImpl.this.insertNewCellStyle(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle old = CTCellStylesImpl.this.getCellStyleArray(i);
                CTCellStylesImpl.this.removeCellStyle(i);
                return old;
            }
            
            public int size()
                { return CTCellStylesImpl.this.sizeOfCellStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CellStyleList();
        }
    }
    
    /**
     * Gets array of all "cellStyle" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle[] getCellStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELLSTYLE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cellStyle" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle getCellStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle)get_store().find_element_user(CELLSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cellStyle" element
     */
    public int sizeOfCellStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLSTYLE$0);
        }
    }
    
    /**
     * Sets array of all "cellStyle" element
     */
    public void setCellStyleArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle[] cellStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellStyleArray, CELLSTYLE$0);
        }
    }
    
    /**
     * Sets ith "cellStyle" element
     */
    public void setCellStyleArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle cellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle)get_store().find_element_user(CELLSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cellStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellStyle" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle insertNewCellStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle)get_store().insert_element_user(CELLSTYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellStyle" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle addNewCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle)get_store().add_element_user(CELLSTYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cellStyle" element
     */
    public void removeCellStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLSTYLE$0, i);
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

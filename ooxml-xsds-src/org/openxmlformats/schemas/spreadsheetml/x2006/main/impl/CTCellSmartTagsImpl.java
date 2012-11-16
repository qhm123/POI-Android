/*
 * XML Type:  CT_CellSmartTags
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellSmartTags(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellSmartTagsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags
{
    
    public CTCellSmartTagsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLSMARTTAG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellSmartTag");
    private static final javax.xml.namespace.QName R$2 = 
        new javax.xml.namespace.QName("", "r");
    
    
    /**
     * Gets a List of "cellSmartTag" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag> getCellSmartTagList()
    {
        final class CellSmartTagList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag get(int i)
                { return CTCellSmartTagsImpl.this.getCellSmartTagArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag old = CTCellSmartTagsImpl.this.getCellSmartTagArray(i);
                CTCellSmartTagsImpl.this.setCellSmartTagArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag o)
                { CTCellSmartTagsImpl.this.insertNewCellSmartTag(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag old = CTCellSmartTagsImpl.this.getCellSmartTagArray(i);
                CTCellSmartTagsImpl.this.removeCellSmartTag(i);
                return old;
            }
            
            public int size()
                { return CTCellSmartTagsImpl.this.sizeOfCellSmartTagArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CellSmartTagList();
        }
    }
    
    /**
     * Gets array of all "cellSmartTag" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag[] getCellSmartTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELLSMARTTAG$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cellSmartTag" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag getCellSmartTagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag)get_store().find_element_user(CELLSMARTTAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cellSmartTag" element
     */
    public int sizeOfCellSmartTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLSMARTTAG$0);
        }
    }
    
    /**
     * Sets array of all "cellSmartTag" element
     */
    public void setCellSmartTagArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag[] cellSmartTagArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellSmartTagArray, CELLSMARTTAG$0);
        }
    }
    
    /**
     * Sets ith "cellSmartTag" element
     */
    public void setCellSmartTagArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag cellSmartTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag)get_store().find_element_user(CELLSMARTTAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cellSmartTag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellSmartTag" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag insertNewCellSmartTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag)get_store().insert_element_user(CELLSMARTTAG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellSmartTag" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag addNewCellSmartTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag)get_store().add_element_user(CELLSMARTTAG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cellSmartTag" element
     */
    public void removeCellSmartTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLSMARTTAG$0, i);
        }
    }
    
    /**
     * Gets the "r" attribute
     */
    public java.lang.String getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$2);
            return target;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(java.lang.String r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$2);
            }
            target.setStringValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(R$2);
            }
            target.set(r);
        }
    }
}

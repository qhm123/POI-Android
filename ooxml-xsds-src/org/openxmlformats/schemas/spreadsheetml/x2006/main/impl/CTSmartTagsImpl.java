/*
 * XML Type:  CT_SmartTags
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SmartTags(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSmartTagsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags
{
    
    public CTSmartTagsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLSMARTTAGS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellSmartTags");
    
    
    /**
     * Gets a List of "cellSmartTags" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags> getCellSmartTagsList()
    {
        final class CellSmartTagsList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags get(int i)
                { return CTSmartTagsImpl.this.getCellSmartTagsArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags old = CTSmartTagsImpl.this.getCellSmartTagsArray(i);
                CTSmartTagsImpl.this.setCellSmartTagsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags o)
                { CTSmartTagsImpl.this.insertNewCellSmartTags(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags old = CTSmartTagsImpl.this.getCellSmartTagsArray(i);
                CTSmartTagsImpl.this.removeCellSmartTags(i);
                return old;
            }
            
            public int size()
                { return CTSmartTagsImpl.this.sizeOfCellSmartTagsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CellSmartTagsList();
        }
    }
    
    /**
     * Gets array of all "cellSmartTags" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags[] getCellSmartTagsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELLSMARTTAGS$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cellSmartTags" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags getCellSmartTagsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags)get_store().find_element_user(CELLSMARTTAGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cellSmartTags" element
     */
    public int sizeOfCellSmartTagsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLSMARTTAGS$0);
        }
    }
    
    /**
     * Sets array of all "cellSmartTags" element
     */
    public void setCellSmartTagsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags[] cellSmartTagsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellSmartTagsArray, CELLSMARTTAGS$0);
        }
    }
    
    /**
     * Sets ith "cellSmartTags" element
     */
    public void setCellSmartTagsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags cellSmartTags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags)get_store().find_element_user(CELLSMARTTAGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cellSmartTags);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellSmartTags" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags insertNewCellSmartTags(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags)get_store().insert_element_user(CELLSMARTTAGS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellSmartTags" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags addNewCellSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTags)get_store().add_element_user(CELLSMARTTAGS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cellSmartTags" element
     */
    public void removeCellSmartTags(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLSMARTTAGS$0, i);
        }
    }
}

/*
 * XML Type:  CT_CellWatches
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellWatches(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellWatchesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches
{
    
    public CTCellWatchesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLWATCH$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellWatch");
    
    
    /**
     * Gets a List of "cellWatch" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch> getCellWatchList()
    {
        final class CellWatchList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch get(int i)
                { return CTCellWatchesImpl.this.getCellWatchArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch old = CTCellWatchesImpl.this.getCellWatchArray(i);
                CTCellWatchesImpl.this.setCellWatchArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch o)
                { CTCellWatchesImpl.this.insertNewCellWatch(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch old = CTCellWatchesImpl.this.getCellWatchArray(i);
                CTCellWatchesImpl.this.removeCellWatch(i);
                return old;
            }
            
            public int size()
                { return CTCellWatchesImpl.this.sizeOfCellWatchArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CellWatchList();
        }
    }
    
    /**
     * Gets array of all "cellWatch" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch[] getCellWatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELLWATCH$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cellWatch" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch getCellWatchArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch)get_store().find_element_user(CELLWATCH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cellWatch" element
     */
    public int sizeOfCellWatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLWATCH$0);
        }
    }
    
    /**
     * Sets array of all "cellWatch" element
     */
    public void setCellWatchArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch[] cellWatchArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellWatchArray, CELLWATCH$0);
        }
    }
    
    /**
     * Sets ith "cellWatch" element
     */
    public void setCellWatchArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch cellWatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch)get_store().find_element_user(CELLWATCH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cellWatch);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellWatch" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch insertNewCellWatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch)get_store().insert_element_user(CELLWATCH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellWatch" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch addNewCellWatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatch)get_store().add_element_user(CELLWATCH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cellWatch" element
     */
    public void removeCellWatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLWATCH$0, i);
        }
    }
}

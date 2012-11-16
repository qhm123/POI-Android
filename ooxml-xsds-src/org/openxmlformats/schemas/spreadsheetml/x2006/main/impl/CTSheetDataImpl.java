/*
 * XML Type:  CT_SheetData
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetData(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData
{
    
    public CTSheetDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "row");
    
    
    /**
     * Gets a List of "row" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow> getRowList()
    {
        final class RowList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow get(int i)
                { return CTSheetDataImpl.this.getRowArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow old = CTSheetDataImpl.this.getRowArray(i);
                CTSheetDataImpl.this.setRowArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow o)
                { CTSheetDataImpl.this.insertNewRow(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow old = CTSheetDataImpl.this.getRowArray(i);
                CTSheetDataImpl.this.removeRow(i);
                return old;
            }
            
            public int size()
                { return CTSheetDataImpl.this.sizeOfRowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RowList();
        }
    }
    
    /**
     * Gets array of all "row" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow[] getRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROW$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "row" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow getRowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "row" element
     */
    public int sizeOfRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROW$0);
        }
    }
    
    /**
     * Sets array of all "row" element
     */
    public void setRowArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow[] rowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rowArray, ROW$0);
        }
    }
    
    /**
     * Sets ith "row" element
     */
    public void setRowArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow row)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(row);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow insertNewRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow)get_store().insert_element_user(ROW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow addNewRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow)get_store().add_element_user(ROW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "row" element
     */
    public void removeRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROW$0, i);
        }
    }
}

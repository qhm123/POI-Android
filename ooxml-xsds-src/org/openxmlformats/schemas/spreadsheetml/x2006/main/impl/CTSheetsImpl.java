/*
 * XML Type:  CT_Sheets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Sheets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets
{
    
    public CTSheetsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheet");
    
    
    /**
     * Gets a List of "sheet" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet> getSheetList()
    {
        final class SheetList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet get(int i)
                { return CTSheetsImpl.this.getSheetArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet old = CTSheetsImpl.this.getSheetArray(i);
                CTSheetsImpl.this.setSheetArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet o)
                { CTSheetsImpl.this.insertNewSheet(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet old = CTSheetsImpl.this.getSheetArray(i);
                CTSheetsImpl.this.removeSheet(i);
                return old;
            }
            
            public int size()
                { return CTSheetsImpl.this.sizeOfSheetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SheetList();
        }
    }
    
    /**
     * Gets array of all "sheet" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[] getSheetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHEET$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet getSheetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet)get_store().find_element_user(SHEET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sheet" element
     */
    public int sizeOfSheetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEET$0);
        }
    }
    
    /**
     * Sets array of all "sheet" element
     */
    public void setSheetArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[] sheetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sheetArray, SHEET$0);
        }
    }
    
    /**
     * Sets ith "sheet" element
     */
    public void setSheetArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet sheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet)get_store().find_element_user(SHEET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sheet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet insertNewSheet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet)get_store().insert_element_user(SHEET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet addNewSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet)get_store().add_element_user(SHEET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sheet" element
     */
    public void removeSheet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEET$0, i);
        }
    }
}

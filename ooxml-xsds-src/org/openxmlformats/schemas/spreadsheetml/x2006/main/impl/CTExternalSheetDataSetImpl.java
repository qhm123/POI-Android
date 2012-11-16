/*
 * XML Type:  CT_ExternalSheetDataSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalSheetDataSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalSheetDataSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet
{
    
    public CTExternalSheetDataSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetData");
    
    
    /**
     * Gets a List of "sheetData" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData> getSheetDataList()
    {
        final class SheetDataList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData get(int i)
                { return CTExternalSheetDataSetImpl.this.getSheetDataArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData old = CTExternalSheetDataSetImpl.this.getSheetDataArray(i);
                CTExternalSheetDataSetImpl.this.setSheetDataArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData o)
                { CTExternalSheetDataSetImpl.this.insertNewSheetData(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData old = CTExternalSheetDataSetImpl.this.getSheetDataArray(i);
                CTExternalSheetDataSetImpl.this.removeSheetData(i);
                return old;
            }
            
            public int size()
                { return CTExternalSheetDataSetImpl.this.sizeOfSheetDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SheetDataList();
        }
    }
    
    /**
     * Gets array of all "sheetData" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] getSheetDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHEETDATA$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sheetData" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData getSheetDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().find_element_user(SHEETDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sheetData" element
     */
    public int sizeOfSheetDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETDATA$0);
        }
    }
    
    /**
     * Sets array of all "sheetData" element
     */
    public void setSheetDataArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData[] sheetDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sheetDataArray, SHEETDATA$0);
        }
    }
    
    /**
     * Sets ith "sheetData" element
     */
    public void setSheetDataArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData sheetData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().find_element_user(SHEETDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sheetData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetData" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData insertNewSheetData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().insert_element_user(SHEETDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetData" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData addNewSheetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData)get_store().add_element_user(SHEETDATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sheetData" element
     */
    public void removeSheetData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETDATA$0, i);
        }
    }
}

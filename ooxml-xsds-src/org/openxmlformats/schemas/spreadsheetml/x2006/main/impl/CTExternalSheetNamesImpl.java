/*
 * XML Type:  CT_ExternalSheetNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalSheetNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalSheetNamesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames
{
    
    public CTExternalSheetNamesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetName");
    
    
    /**
     * Gets a List of "sheetName" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName> getSheetNameList()
    {
        final class SheetNameList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName get(int i)
                { return CTExternalSheetNamesImpl.this.getSheetNameArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName old = CTExternalSheetNamesImpl.this.getSheetNameArray(i);
                CTExternalSheetNamesImpl.this.setSheetNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName o)
                { CTExternalSheetNamesImpl.this.insertNewSheetName(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName old = CTExternalSheetNamesImpl.this.getSheetNameArray(i);
                CTExternalSheetNamesImpl.this.removeSheetName(i);
                return old;
            }
            
            public int size()
                { return CTExternalSheetNamesImpl.this.sizeOfSheetNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SheetNameList();
        }
    }
    
    /**
     * Gets array of all "sheetName" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName[] getSheetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHEETNAME$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sheetName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName getSheetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName)get_store().find_element_user(SHEETNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sheetName" element
     */
    public int sizeOfSheetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETNAME$0);
        }
    }
    
    /**
     * Sets array of all "sheetName" element
     */
    public void setSheetNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName[] sheetNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sheetNameArray, SHEETNAME$0);
        }
    }
    
    /**
     * Sets ith "sheetName" element
     */
    public void setSheetNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName sheetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName)get_store().find_element_user(SHEETNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sheetName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName insertNewSheetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName)get_store().insert_element_user(SHEETNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName addNewSheetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName)get_store().add_element_user(SHEETNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sheetName" element
     */
    public void removeSheetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETNAME$0, i);
        }
    }
}

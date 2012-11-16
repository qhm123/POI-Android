/*
 * XML Type:  CT_ExternalSheetData
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalSheetData(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalSheetDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetData
{
    
    public CTExternalSheetDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "row");
    private static final javax.xml.namespace.QName SHEETID$2 = 
        new javax.xml.namespace.QName("", "sheetId");
    private static final javax.xml.namespace.QName REFRESHERROR$4 = 
        new javax.xml.namespace.QName("", "refreshError");
    
    
    /**
     * Gets a List of "row" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow> getRowList()
    {
        final class RowList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow get(int i)
                { return CTExternalSheetDataImpl.this.getRowArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow old = CTExternalSheetDataImpl.this.getRowArray(i);
                CTExternalSheetDataImpl.this.setRowArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow o)
                { CTExternalSheetDataImpl.this.insertNewRow(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow old = CTExternalSheetDataImpl.this.getRowArray(i);
                CTExternalSheetDataImpl.this.removeRow(i);
                return old;
            }
            
            public int size()
                { return CTExternalSheetDataImpl.this.sizeOfRowArray(); }
            
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow[] getRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROW$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "row" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow getRowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow)get_store().find_element_user(ROW$0, i);
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
    public void setRowArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow[] rowArray)
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
    public void setRowArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow row)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow)get_store().find_element_user(ROW$0, i);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow insertNewRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow)get_store().insert_element_user(ROW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow addNewRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow)get_store().add_element_user(ROW$0);
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
    
    /**
     * Gets the "sheetId" attribute
     */
    public long getSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$2);
            return target;
        }
    }
    
    /**
     * Sets the "sheetId" attribute
     */
    public void setSheetId(long sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEETID$2);
            }
            target.setLongValue(sheetId);
        }
    }
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    public void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHEETID$2);
            }
            target.set(sheetId);
        }
    }
    
    /**
     * Gets the "refreshError" attribute
     */
    public boolean getRefreshError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHERROR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHERROR$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshError" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefreshError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHERROR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REFRESHERROR$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "refreshError" attribute
     */
    public boolean isSetRefreshError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHERROR$4) != null;
        }
    }
    
    /**
     * Sets the "refreshError" attribute
     */
    public void setRefreshError(boolean refreshError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHERROR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHERROR$4);
            }
            target.setBooleanValue(refreshError);
        }
    }
    
    /**
     * Sets (as xml) the "refreshError" attribute
     */
    public void xsetRefreshError(org.apache.xmlbeans.XmlBoolean refreshError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHERROR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REFRESHERROR$4);
            }
            target.set(refreshError);
        }
    }
    
    /**
     * Unsets the "refreshError" attribute
     */
    public void unsetRefreshError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHERROR$4);
        }
    }
}

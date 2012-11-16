/*
 * XML Type:  CT_Cols
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Cols(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols
{
    
    public CTColsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "col");
    
    
    /**
     * Gets a List of "col" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol> getColList()
    {
        final class ColList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol get(int i)
                { return CTColsImpl.this.getColArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol old = CTColsImpl.this.getColArray(i);
                CTColsImpl.this.setColArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol o)
                { CTColsImpl.this.insertNewCol(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol old = CTColsImpl.this.getColArray(i);
                CTColsImpl.this.removeCol(i);
                return old;
            }
            
            public int size()
                { return CTColsImpl.this.sizeOfColArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColList();
        }
    }
    
    /**
     * Gets array of all "col" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol[] getColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol getColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol)get_store().find_element_user(COL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col" element
     */
    public int sizeOfColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COL$0);
        }
    }
    
    /**
     * Sets array of all "col" element
     */
    public void setColArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol[] colArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colArray, COL$0);
        }
    }
    
    /**
     * Sets ith "col" element
     */
    public void setColArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol col)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol)get_store().find_element_user(COL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(col);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol insertNewCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol)get_store().insert_element_user(COL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol addNewCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol)get_store().add_element_user(COL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "col" element
     */
    public void removeCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COL$0, i);
        }
    }
}

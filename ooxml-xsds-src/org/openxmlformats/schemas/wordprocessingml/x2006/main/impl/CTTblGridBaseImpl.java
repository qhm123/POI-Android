/*
 * XML Type:  CT_TblGridBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblGridBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblGridBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase
{
    
    public CTTblGridBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDCOL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridCol");
    
    
    /**
     * Gets a List of "gridCol" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol> getGridColList()
    {
        final class GridColList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol get(int i)
                { return CTTblGridBaseImpl.this.getGridColArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol old = CTTblGridBaseImpl.this.getGridColArray(i);
                CTTblGridBaseImpl.this.setGridColArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol o)
                { CTTblGridBaseImpl.this.insertNewGridCol(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol old = CTTblGridBaseImpl.this.getGridColArray(i);
                CTTblGridBaseImpl.this.removeGridCol(i);
                return old;
            }
            
            public int size()
                { return CTTblGridBaseImpl.this.sizeOfGridColArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GridColList();
        }
    }
    
    /**
     * Gets array of all "gridCol" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol[] getGridColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRIDCOL$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gridCol" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol getGridColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol)get_store().find_element_user(GRIDCOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gridCol" element
     */
    public int sizeOfGridColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDCOL$0);
        }
    }
    
    /**
     * Sets array of all "gridCol" element
     */
    public void setGridColArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol[] gridColArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gridColArray, GRIDCOL$0);
        }
    }
    
    /**
     * Sets ith "gridCol" element
     */
    public void setGridColArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol gridCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol)get_store().find_element_user(GRIDCOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gridCol);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gridCol" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol insertNewGridCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol)get_store().insert_element_user(GRIDCOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gridCol" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol addNewGridCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol)get_store().add_element_user(GRIDCOL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "gridCol" element
     */
    public void removeGridCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDCOL$0, i);
        }
    }
}

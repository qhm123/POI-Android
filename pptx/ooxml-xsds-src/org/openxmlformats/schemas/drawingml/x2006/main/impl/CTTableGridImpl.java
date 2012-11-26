/*
 * XML Type:  CT_TableGrid
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableGrid(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableGridImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid
{
    
    public CTTableGridImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDCOL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gridCol");
    
    
    /**
     * Gets a List of "gridCol" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol> getGridColList()
    {
        final class GridColList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol get(int i)
                { return CTTableGridImpl.this.getGridColArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol old = CTTableGridImpl.this.getGridColArray(i);
                CTTableGridImpl.this.setGridColArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol o)
                { CTTableGridImpl.this.insertNewGridCol(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol old = CTTableGridImpl.this.getGridColArray(i);
                CTTableGridImpl.this.removeGridCol(i);
                return old;
            }
            
            public int size()
                { return CTTableGridImpl.this.sizeOfGridColArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol[] getGridColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRIDCOL$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gridCol" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol getGridColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol)get_store().find_element_user(GRIDCOL$0, i);
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
    public void setGridColArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol[] gridColArray)
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
    public void setGridColArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol gridCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol)get_store().find_element_user(GRIDCOL$0, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol insertNewGridCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol)get_store().insert_element_user(GRIDCOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gridCol" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol addNewGridCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol)get_store().add_element_user(GRIDCOL$0);
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

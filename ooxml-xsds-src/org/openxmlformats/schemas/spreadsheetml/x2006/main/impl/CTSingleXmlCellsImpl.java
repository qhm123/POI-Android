/*
 * XML Type:  CT_SingleXmlCells
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SingleXmlCells(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSingleXmlCellsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells
{
    
    public CTSingleXmlCellsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLEXMLCELL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "singleXmlCell");
    
    
    /**
     * Gets a List of "singleXmlCell" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell> getSingleXmlCellList()
    {
        final class SingleXmlCellList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell get(int i)
                { return CTSingleXmlCellsImpl.this.getSingleXmlCellArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell old = CTSingleXmlCellsImpl.this.getSingleXmlCellArray(i);
                CTSingleXmlCellsImpl.this.setSingleXmlCellArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell o)
                { CTSingleXmlCellsImpl.this.insertNewSingleXmlCell(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell old = CTSingleXmlCellsImpl.this.getSingleXmlCellArray(i);
                CTSingleXmlCellsImpl.this.removeSingleXmlCell(i);
                return old;
            }
            
            public int size()
                { return CTSingleXmlCellsImpl.this.sizeOfSingleXmlCellArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SingleXmlCellList();
        }
    }
    
    /**
     * Gets array of all "singleXmlCell" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell[] getSingleXmlCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SINGLEXMLCELL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "singleXmlCell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell getSingleXmlCellArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell)get_store().find_element_user(SINGLEXMLCELL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "singleXmlCell" element
     */
    public int sizeOfSingleXmlCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SINGLEXMLCELL$0);
        }
    }
    
    /**
     * Sets array of all "singleXmlCell" element
     */
    public void setSingleXmlCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell[] singleXmlCellArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(singleXmlCellArray, SINGLEXMLCELL$0);
        }
    }
    
    /**
     * Sets ith "singleXmlCell" element
     */
    public void setSingleXmlCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell singleXmlCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell)get_store().find_element_user(SINGLEXMLCELL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(singleXmlCell);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "singleXmlCell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell insertNewSingleXmlCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell)get_store().insert_element_user(SINGLEXMLCELL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "singleXmlCell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell addNewSingleXmlCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell)get_store().add_element_user(SINGLEXMLCELL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "singleXmlCell" element
     */
    public void removeSingleXmlCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SINGLEXMLCELL$0, i);
        }
    }
}

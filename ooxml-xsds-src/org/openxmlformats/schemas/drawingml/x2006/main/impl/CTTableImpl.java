/*
 * XML Type:  CT_Table
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Table(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTable
{
    
    public CTTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblPr");
    private static final javax.xml.namespace.QName TBLGRID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblGrid");
    private static final javax.xml.namespace.QName TR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tr");
    
    
    /**
     * Gets the "tblPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties getTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties)get_store().find_element_user(TBLPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblPr" element
     */
    public boolean isSetTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLPR$0) != 0;
        }
    }
    
    /**
     * Sets the "tblPr" element
     */
    public void setTblPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties tblPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties)get_store().find_element_user(TBLPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties)get_store().add_element_user(TBLPR$0);
            }
            target.set(tblPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties addNewTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties)get_store().add_element_user(TBLPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblPr" element
     */
    public void unsetTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLPR$0, 0);
        }
    }
    
    /**
     * Gets the "tblGrid" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid getTblGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid)get_store().find_element_user(TBLGRID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblGrid" element
     */
    public void setTblGrid(org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid tblGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid)get_store().find_element_user(TBLGRID$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid)get_store().add_element_user(TBLGRID$2);
            }
            target.set(tblGrid);
        }
    }
    
    /**
     * Appends and returns a new empty "tblGrid" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid addNewTblGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid)get_store().add_element_user(TBLGRID$2);
            return target;
        }
    }
    
    /**
     * Gets a List of "tr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow> getTrList()
    {
        final class TrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow get(int i)
                { return CTTableImpl.this.getTrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow old = CTTableImpl.this.getTrArray(i);
                CTTableImpl.this.setTrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow o)
                { CTTableImpl.this.insertNewTr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow old = CTTableImpl.this.getTrArray(i);
                CTTableImpl.this.removeTr(i);
                return old;
            }
            
            public int size()
                { return CTTableImpl.this.sizeOfTrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrList();
        }
    }
    
    /**
     * Gets array of all "tr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow[] getTrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TR$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow getTrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow)get_store().find_element_user(TR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tr" element
     */
    public int sizeOfTrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TR$4);
        }
    }
    
    /**
     * Sets array of all "tr" element
     */
    public void setTrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow[] trArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trArray, TR$4);
        }
    }
    
    /**
     * Sets ith "tr" element
     */
    public void setTrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow tr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow)get_store().find_element_user(TR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow insertNewTr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow)get_store().insert_element_user(TR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow addNewTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow)get_store().add_element_user(TR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "tr" element
     */
    public void removeTr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TR$4, i);
        }
    }
}

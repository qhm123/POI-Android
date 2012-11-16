/*
 * XML Type:  CT_ExternalRow
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalRow(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalRow
{
    
    public CTExternalRowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cell");
    private static final javax.xml.namespace.QName R$2 = 
        new javax.xml.namespace.QName("", "r");
    
    
    /**
     * Gets a List of "cell" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell> getCellList()
    {
        final class CellList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell get(int i)
                { return CTExternalRowImpl.this.getCellArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell old = CTExternalRowImpl.this.getCellArray(i);
                CTExternalRowImpl.this.setCellArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell o)
                { CTExternalRowImpl.this.insertNewCell(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell old = CTExternalRowImpl.this.getCellArray(i);
                CTExternalRowImpl.this.removeCell(i);
                return old;
            }
            
            public int size()
                { return CTExternalRowImpl.this.sizeOfCellArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CellList();
        }
    }
    
    /**
     * Gets array of all "cell" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell[] getCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell getCellArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell)get_store().find_element_user(CELL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cell" element
     */
    public int sizeOfCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELL$0);
        }
    }
    
    /**
     * Sets array of all "cell" element
     */
    public void setCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell[] cellArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellArray, CELL$0);
        }
    }
    
    /**
     * Sets ith "cell" element
     */
    public void setCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell cell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell)get_store().find_element_user(CELL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cell);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell insertNewCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell)get_store().insert_element_user(CELL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell addNewCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell)get_store().add_element_user(CELL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cell" element
     */
    public void removeCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELL$0, i);
        }
    }
    
    /**
     * Gets the "r" attribute
     */
    public long getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(R$2);
            return target;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(long r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$2);
            }
            target.setLongValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.apache.xmlbeans.XmlUnsignedInt r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(R$2);
            }
            target.set(r);
        }
    }
}

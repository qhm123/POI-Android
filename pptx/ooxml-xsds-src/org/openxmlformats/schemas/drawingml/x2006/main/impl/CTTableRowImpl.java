/*
 * XML Type:  CT_TableRow
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableRow(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow
{
    
    public CTTableRowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tc");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName H$4 = 
        new javax.xml.namespace.QName("", "h");
    
    
    /**
     * Gets a List of "tc" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell> getTcList()
    {
        final class TcList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell get(int i)
                { return CTTableRowImpl.this.getTcArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell old = CTTableRowImpl.this.getTcArray(i);
                CTTableRowImpl.this.setTcArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell o)
                { CTTableRowImpl.this.insertNewTc(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell old = CTTableRowImpl.this.getTcArray(i);
                CTTableRowImpl.this.removeTc(i);
                return old;
            }
            
            public int size()
                { return CTTableRowImpl.this.sizeOfTcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TcList();
        }
    }
    
    /**
     * Gets array of all "tc" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell[] getTcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TC$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell getTcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell)get_store().find_element_user(TC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tc" element
     */
    public int sizeOfTcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TC$0);
        }
    }
    
    /**
     * Sets array of all "tc" element
     */
    public void setTcArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell[] tcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tcArray, TC$0);
        }
    }
    
    /**
     * Sets ith "tc" element
     */
    public void setTcArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell tc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell)get_store().find_element_user(TC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell insertNewTc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell)get_store().insert_element_user(TC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell addNewTc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell)get_store().add_element_user(TC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tc" element
     */
    public void removeTc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TC$0, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "h" attribute
     */
    public long getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "h" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(H$4);
            return target;
        }
    }
    
    /**
     * Sets the "h" attribute
     */
    public void setH(long h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(H$4);
            }
            target.setLongValue(h);
        }
    }
    
    /**
     * Sets (as xml) the "h" attribute
     */
    public void xsetH(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(H$4);
            }
            target.set(h);
        }
    }
}

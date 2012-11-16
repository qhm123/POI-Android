/*
 * XML Type:  CT_CalcChain
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CalcChain(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCalcChainImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain
{
    
    public CTCalcChainImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName C$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "c");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets a List of "c" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell> getCList()
    {
        final class CList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell get(int i)
                { return CTCalcChainImpl.this.getCArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell old = CTCalcChainImpl.this.getCArray(i);
                CTCalcChainImpl.this.setCArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell o)
                { CTCalcChainImpl.this.insertNewC(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell old = CTCalcChainImpl.this.getCArray(i);
                CTCalcChainImpl.this.removeC(i);
                return old;
            }
            
            public int size()
                { return CTCalcChainImpl.this.sizeOfCArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CList();
        }
    }
    
    /**
     * Gets array of all "c" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[] getCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(C$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "c" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell getCArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().find_element_user(C$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "c" element
     */
    public int sizeOfCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(C$0);
        }
    }
    
    /**
     * Sets array of all "c" element
     */
    public void setCArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell[] cArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cArray, C$0);
        }
    }
    
    /**
     * Sets ith "c" element
     */
    public void setCArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().find_element_user(C$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(c);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "c" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell insertNewC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().insert_element_user(C$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "c" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell addNewC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell)get_store().add_element_user(C$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "c" element
     */
    public void removeC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(C$0, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
}

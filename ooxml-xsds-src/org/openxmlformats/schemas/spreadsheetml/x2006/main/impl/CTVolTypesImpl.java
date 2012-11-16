/*
 * XML Type:  CT_VolTypes
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_VolTypes(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTVolTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes
{
    
    public CTVolTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOLTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "volType");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets a List of "volType" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType> getVolTypeList()
    {
        final class VolTypeList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType get(int i)
                { return CTVolTypesImpl.this.getVolTypeArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType old = CTVolTypesImpl.this.getVolTypeArray(i);
                CTVolTypesImpl.this.setVolTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType o)
                { CTVolTypesImpl.this.insertNewVolType(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType old = CTVolTypesImpl.this.getVolTypeArray(i);
                CTVolTypesImpl.this.removeVolType(i);
                return old;
            }
            
            public int size()
                { return CTVolTypesImpl.this.sizeOfVolTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VolTypeList();
        }
    }
    
    /**
     * Gets array of all "volType" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType[] getVolTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VOLTYPE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "volType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType getVolTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType)get_store().find_element_user(VOLTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "volType" element
     */
    public int sizeOfVolTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOLTYPE$0);
        }
    }
    
    /**
     * Sets array of all "volType" element
     */
    public void setVolTypeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType[] volTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(volTypeArray, VOLTYPE$0);
        }
    }
    
    /**
     * Sets ith "volType" element
     */
    public void setVolTypeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType volType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType)get_store().find_element_user(VOLTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(volType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "volType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType insertNewVolType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType)get_store().insert_element_user(VOLTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "volType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType addNewVolType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType)get_store().add_element_user(VOLTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "volType" element
     */
    public void removeVolType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOLTYPE$0, i);
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

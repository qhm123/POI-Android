/*
 * XML Type:  CT_IgnoredErrors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_IgnoredErrors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIgnoredErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors
{
    
    public CTIgnoredErrorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IGNOREDERROR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ignoredError");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets a List of "ignoredError" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError> getIgnoredErrorList()
    {
        final class IgnoredErrorList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError get(int i)
                { return CTIgnoredErrorsImpl.this.getIgnoredErrorArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError old = CTIgnoredErrorsImpl.this.getIgnoredErrorArray(i);
                CTIgnoredErrorsImpl.this.setIgnoredErrorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError o)
                { CTIgnoredErrorsImpl.this.insertNewIgnoredError(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError old = CTIgnoredErrorsImpl.this.getIgnoredErrorArray(i);
                CTIgnoredErrorsImpl.this.removeIgnoredError(i);
                return old;
            }
            
            public int size()
                { return CTIgnoredErrorsImpl.this.sizeOfIgnoredErrorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IgnoredErrorList();
        }
    }
    
    /**
     * Gets array of all "ignoredError" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError[] getIgnoredErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IGNOREDERROR$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ignoredError" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError getIgnoredErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError)get_store().find_element_user(IGNOREDERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ignoredError" element
     */
    public int sizeOfIgnoredErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IGNOREDERROR$0);
        }
    }
    
    /**
     * Sets array of all "ignoredError" element
     */
    public void setIgnoredErrorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError[] ignoredErrorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ignoredErrorArray, IGNOREDERROR$0);
        }
    }
    
    /**
     * Sets ith "ignoredError" element
     */
    public void setIgnoredErrorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError ignoredError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError)get_store().find_element_user(IGNOREDERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ignoredError);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ignoredError" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError insertNewIgnoredError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError)get_store().insert_element_user(IGNOREDERROR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ignoredError" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError addNewIgnoredError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError)get_store().add_element_user(IGNOREDERROR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ignoredError" element
     */
    public void removeIgnoredError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IGNOREDERROR$0, i);
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

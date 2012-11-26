/*
 * XML Type:  CT_ConnectionSiteList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ConnectionSiteList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTConnectionSiteListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList
{
    
    public CTConnectionSiteListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CXN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxn");
    
    
    /**
     * Gets a List of "cxn" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite> getCxnList()
    {
        final class CxnList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite get(int i)
                { return CTConnectionSiteListImpl.this.getCxnArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite old = CTConnectionSiteListImpl.this.getCxnArray(i);
                CTConnectionSiteListImpl.this.setCxnArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite o)
                { CTConnectionSiteListImpl.this.insertNewCxn(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite old = CTConnectionSiteListImpl.this.getCxnArray(i);
                CTConnectionSiteListImpl.this.removeCxn(i);
                return old;
            }
            
            public int size()
                { return CTConnectionSiteListImpl.this.sizeOfCxnArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CxnList();
        }
    }
    
    /**
     * Gets array of all "cxn" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite[] getCxnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CXN$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite getCxnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite)get_store().find_element_user(CXN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cxn" element
     */
    public int sizeOfCxnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXN$0);
        }
    }
    
    /**
     * Sets array of all "cxn" element
     */
    public void setCxnArray(org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite[] cxnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cxnArray, CXN$0);
        }
    }
    
    /**
     * Sets ith "cxn" element
     */
    public void setCxnArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite cxn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite)get_store().find_element_user(CXN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cxn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite insertNewCxn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite)get_store().insert_element_user(CXN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite addNewCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite)get_store().add_element_user(CXN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cxn" element
     */
    public void removeCxn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXN$0, i);
        }
    }
}

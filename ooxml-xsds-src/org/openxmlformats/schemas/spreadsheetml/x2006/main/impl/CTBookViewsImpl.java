/*
 * XML Type:  CT_BookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_BookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBookViewsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews
{
    
    public CTBookViewsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKBOOKVIEW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookView");
    
    
    /**
     * Gets a List of "workbookView" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView> getWorkbookViewList()
    {
        final class WorkbookViewList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView get(int i)
                { return CTBookViewsImpl.this.getWorkbookViewArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView old = CTBookViewsImpl.this.getWorkbookViewArray(i);
                CTBookViewsImpl.this.setWorkbookViewArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView o)
                { CTBookViewsImpl.this.insertNewWorkbookView(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView old = CTBookViewsImpl.this.getWorkbookViewArray(i);
                CTBookViewsImpl.this.removeWorkbookView(i);
                return old;
            }
            
            public int size()
                { return CTBookViewsImpl.this.sizeOfWorkbookViewArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WorkbookViewList();
        }
    }
    
    /**
     * Gets array of all "workbookView" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[] getWorkbookViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WORKBOOKVIEW$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "workbookView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView getWorkbookViewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView)get_store().find_element_user(WORKBOOKVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "workbookView" element
     */
    public int sizeOfWorkbookViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKBOOKVIEW$0);
        }
    }
    
    /**
     * Sets array of all "workbookView" element
     */
    public void setWorkbookViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[] workbookViewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(workbookViewArray, WORKBOOKVIEW$0);
        }
    }
    
    /**
     * Sets ith "workbookView" element
     */
    public void setWorkbookViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView workbookView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView)get_store().find_element_user(WORKBOOKVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(workbookView);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "workbookView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView insertNewWorkbookView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView)get_store().insert_element_user(WORKBOOKVIEW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "workbookView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView addNewWorkbookView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView)get_store().add_element_user(WORKBOOKVIEW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "workbookView" element
     */
    public void removeWorkbookView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKBOOKVIEW$0, i);
        }
    }
}

/*
 * XML Type:  CT_CustomWorkbookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomWorkbookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomWorkbookViewsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews
{
    
    public CTCustomWorkbookViewsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMWORKBOOKVIEW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customWorkbookView");
    
    
    /**
     * Gets a List of "customWorkbookView" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView> getCustomWorkbookViewList()
    {
        final class CustomWorkbookViewList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView get(int i)
                { return CTCustomWorkbookViewsImpl.this.getCustomWorkbookViewArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView old = CTCustomWorkbookViewsImpl.this.getCustomWorkbookViewArray(i);
                CTCustomWorkbookViewsImpl.this.setCustomWorkbookViewArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView o)
                { CTCustomWorkbookViewsImpl.this.insertNewCustomWorkbookView(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView old = CTCustomWorkbookViewsImpl.this.getCustomWorkbookViewArray(i);
                CTCustomWorkbookViewsImpl.this.removeCustomWorkbookView(i);
                return old;
            }
            
            public int size()
                { return CTCustomWorkbookViewsImpl.this.sizeOfCustomWorkbookViewArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomWorkbookViewList();
        }
    }
    
    /**
     * Gets array of all "customWorkbookView" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] getCustomWorkbookViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMWORKBOOKVIEW$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customWorkbookView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView getCustomWorkbookViewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().find_element_user(CUSTOMWORKBOOKVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customWorkbookView" element
     */
    public int sizeOfCustomWorkbookViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMWORKBOOKVIEW$0);
        }
    }
    
    /**
     * Sets array of all "customWorkbookView" element
     */
    public void setCustomWorkbookViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] customWorkbookViewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customWorkbookViewArray, CUSTOMWORKBOOKVIEW$0);
        }
    }
    
    /**
     * Sets ith "customWorkbookView" element
     */
    public void setCustomWorkbookViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView customWorkbookView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().find_element_user(CUSTOMWORKBOOKVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customWorkbookView);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customWorkbookView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView insertNewCustomWorkbookView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().insert_element_user(CUSTOMWORKBOOKVIEW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customWorkbookView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView addNewCustomWorkbookView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().add_element_user(CUSTOMWORKBOOKVIEW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "customWorkbookView" element
     */
    public void removeCustomWorkbookView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMWORKBOOKVIEW$0, i);
        }
    }
}

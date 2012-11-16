/*
 * XML Type:  CT_CustomChartsheetViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomChartsheetViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomChartsheetViewsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews
{
    
    public CTCustomChartsheetViewsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMSHEETVIEW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetView");
    
    
    /**
     * Gets a List of "customSheetView" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView> getCustomSheetViewList()
    {
        final class CustomSheetViewList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView get(int i)
                { return CTCustomChartsheetViewsImpl.this.getCustomSheetViewArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView old = CTCustomChartsheetViewsImpl.this.getCustomSheetViewArray(i);
                CTCustomChartsheetViewsImpl.this.setCustomSheetViewArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView o)
                { CTCustomChartsheetViewsImpl.this.insertNewCustomSheetView(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView old = CTCustomChartsheetViewsImpl.this.getCustomSheetViewArray(i);
                CTCustomChartsheetViewsImpl.this.removeCustomSheetView(i);
                return old;
            }
            
            public int size()
                { return CTCustomChartsheetViewsImpl.this.sizeOfCustomSheetViewArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomSheetViewList();
        }
    }
    
    /**
     * Gets array of all "customSheetView" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView[] getCustomSheetViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMSHEETVIEW$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customSheetView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView getCustomSheetViewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView)get_store().find_element_user(CUSTOMSHEETVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customSheetView" element
     */
    public int sizeOfCustomSheetViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMSHEETVIEW$0);
        }
    }
    
    /**
     * Sets array of all "customSheetView" element
     */
    public void setCustomSheetViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView[] customSheetViewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customSheetViewArray, CUSTOMSHEETVIEW$0);
        }
    }
    
    /**
     * Sets ith "customSheetView" element
     */
    public void setCustomSheetViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView customSheetView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView)get_store().find_element_user(CUSTOMSHEETVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customSheetView);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customSheetView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView insertNewCustomSheetView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView)get_store().insert_element_user(CUSTOMSHEETVIEW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customSheetView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView addNewCustomSheetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView)get_store().add_element_user(CUSTOMSHEETVIEW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "customSheetView" element
     */
    public void removeCustomSheetView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMSHEETVIEW$0, i);
        }
    }
}

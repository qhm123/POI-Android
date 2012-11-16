/*
 * XML Type:  CT_ChartsheetViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ChartsheetViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTChartsheetViewsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews
{
    
    public CTChartsheetViewsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETVIEW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetView");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets a List of "sheetView" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView> getSheetViewList()
    {
        final class SheetViewList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView get(int i)
                { return CTChartsheetViewsImpl.this.getSheetViewArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView old = CTChartsheetViewsImpl.this.getSheetViewArray(i);
                CTChartsheetViewsImpl.this.setSheetViewArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView o)
                { CTChartsheetViewsImpl.this.insertNewSheetView(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView old = CTChartsheetViewsImpl.this.getSheetViewArray(i);
                CTChartsheetViewsImpl.this.removeSheetView(i);
                return old;
            }
            
            public int size()
                { return CTChartsheetViewsImpl.this.sizeOfSheetViewArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SheetViewList();
        }
    }
    
    /**
     * Gets array of all "sheetView" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView[] getSheetViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHEETVIEW$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sheetView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView getSheetViewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView)get_store().find_element_user(SHEETVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sheetView" element
     */
    public int sizeOfSheetViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETVIEW$0);
        }
    }
    
    /**
     * Sets array of all "sheetView" element
     */
    public void setSheetViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView[] sheetViewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sheetViewArray, SHEETVIEW$0);
        }
    }
    
    /**
     * Sets ith "sheetView" element
     */
    public void setSheetViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView sheetView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView)get_store().find_element_user(SHEETVIEW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sheetView);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sheetView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView insertNewSheetView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView)get_store().insert_element_user(SHEETVIEW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sheetView" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView addNewSheetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView)get_store().add_element_user(SHEETVIEW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sheetView" element
     */
    public void removeSheetView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETVIEW$0, i);
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

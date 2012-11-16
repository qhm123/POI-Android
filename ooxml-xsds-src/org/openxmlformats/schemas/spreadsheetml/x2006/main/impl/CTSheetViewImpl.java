/*
 * XML Type:  CT_SheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView
{
    
    public CTSheetViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PANE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pane");
    private static final javax.xml.namespace.QName SELECTION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "selection");
    private static final javax.xml.namespace.QName PIVOTSELECTION$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotSelection");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName WINDOWPROTECTION$8 = 
        new javax.xml.namespace.QName("", "windowProtection");
    private static final javax.xml.namespace.QName SHOWFORMULAS$10 = 
        new javax.xml.namespace.QName("", "showFormulas");
    private static final javax.xml.namespace.QName SHOWGRIDLINES$12 = 
        new javax.xml.namespace.QName("", "showGridLines");
    private static final javax.xml.namespace.QName SHOWROWCOLHEADERS$14 = 
        new javax.xml.namespace.QName("", "showRowColHeaders");
    private static final javax.xml.namespace.QName SHOWZEROS$16 = 
        new javax.xml.namespace.QName("", "showZeros");
    private static final javax.xml.namespace.QName RIGHTTOLEFT$18 = 
        new javax.xml.namespace.QName("", "rightToLeft");
    private static final javax.xml.namespace.QName TABSELECTED$20 = 
        new javax.xml.namespace.QName("", "tabSelected");
    private static final javax.xml.namespace.QName SHOWRULER$22 = 
        new javax.xml.namespace.QName("", "showRuler");
    private static final javax.xml.namespace.QName SHOWOUTLINESYMBOLS$24 = 
        new javax.xml.namespace.QName("", "showOutlineSymbols");
    private static final javax.xml.namespace.QName DEFAULTGRIDCOLOR$26 = 
        new javax.xml.namespace.QName("", "defaultGridColor");
    private static final javax.xml.namespace.QName SHOWWHITESPACE$28 = 
        new javax.xml.namespace.QName("", "showWhiteSpace");
    private static final javax.xml.namespace.QName VIEW$30 = 
        new javax.xml.namespace.QName("", "view");
    private static final javax.xml.namespace.QName TOPLEFTCELL$32 = 
        new javax.xml.namespace.QName("", "topLeftCell");
    private static final javax.xml.namespace.QName COLORID$34 = 
        new javax.xml.namespace.QName("", "colorId");
    private static final javax.xml.namespace.QName ZOOMSCALE$36 = 
        new javax.xml.namespace.QName("", "zoomScale");
    private static final javax.xml.namespace.QName ZOOMSCALENORMAL$38 = 
        new javax.xml.namespace.QName("", "zoomScaleNormal");
    private static final javax.xml.namespace.QName ZOOMSCALESHEETLAYOUTVIEW$40 = 
        new javax.xml.namespace.QName("", "zoomScaleSheetLayoutView");
    private static final javax.xml.namespace.QName ZOOMSCALEPAGELAYOUTVIEW$42 = 
        new javax.xml.namespace.QName("", "zoomScalePageLayoutView");
    private static final javax.xml.namespace.QName WORKBOOKVIEWID$44 = 
        new javax.xml.namespace.QName("", "workbookViewId");
    
    
    /**
     * Gets the "pane" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane getPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().find_element_user(PANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pane" element
     */
    public boolean isSetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PANE$0) != 0;
        }
    }
    
    /**
     * Sets the "pane" element
     */
    public void setPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane pane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().find_element_user(PANE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().add_element_user(PANE$0);
            }
            target.set(pane);
        }
    }
    
    /**
     * Appends and returns a new empty "pane" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane addNewPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().add_element_user(PANE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pane" element
     */
    public void unsetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PANE$0, 0);
        }
    }
    
    /**
     * Gets a List of "selection" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection> getSelectionList()
    {
        final class SelectionList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection get(int i)
                { return CTSheetViewImpl.this.getSelectionArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection old = CTSheetViewImpl.this.getSelectionArray(i);
                CTSheetViewImpl.this.setSelectionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection o)
                { CTSheetViewImpl.this.insertNewSelection(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection old = CTSheetViewImpl.this.getSelectionArray(i);
                CTSheetViewImpl.this.removeSelection(i);
                return old;
            }
            
            public int size()
                { return CTSheetViewImpl.this.sizeOfSelectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SelectionList();
        }
    }
    
    /**
     * Gets array of all "selection" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection[] getSelectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTION$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "selection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection getSelectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().find_element_user(SELECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "selection" element
     */
    public int sizeOfSelectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTION$2);
        }
    }
    
    /**
     * Sets array of all "selection" element
     */
    public void setSelectionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection[] selectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(selectionArray, SELECTION$2);
        }
    }
    
    /**
     * Sets ith "selection" element
     */
    public void setSelectionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection selection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().find_element_user(SELECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(selection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "selection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection insertNewSelection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().insert_element_user(SELECTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "selection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection addNewSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().add_element_user(SELECTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "selection" element
     */
    public void removeSelection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTION$2, i);
        }
    }
    
    /**
     * Gets a List of "pivotSelection" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection> getPivotSelectionList()
    {
        final class PivotSelectionList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection get(int i)
                { return CTSheetViewImpl.this.getPivotSelectionArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection old = CTSheetViewImpl.this.getPivotSelectionArray(i);
                CTSheetViewImpl.this.setPivotSelectionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection o)
                { CTSheetViewImpl.this.insertNewPivotSelection(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection old = CTSheetViewImpl.this.getPivotSelectionArray(i);
                CTSheetViewImpl.this.removePivotSelection(i);
                return old;
            }
            
            public int size()
                { return CTSheetViewImpl.this.sizeOfPivotSelectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PivotSelectionList();
        }
    }
    
    /**
     * Gets array of all "pivotSelection" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection[] getPivotSelectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIVOTSELECTION$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pivotSelection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection getPivotSelectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection)get_store().find_element_user(PIVOTSELECTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pivotSelection" element
     */
    public int sizeOfPivotSelectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTSELECTION$4);
        }
    }
    
    /**
     * Sets array of all "pivotSelection" element
     */
    public void setPivotSelectionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection[] pivotSelectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pivotSelectionArray, PIVOTSELECTION$4);
        }
    }
    
    /**
     * Sets ith "pivotSelection" element
     */
    public void setPivotSelectionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection pivotSelection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection)get_store().find_element_user(PIVOTSELECTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pivotSelection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotSelection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection insertNewPivotSelection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection)get_store().insert_element_user(PIVOTSELECTION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotSelection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection addNewPivotSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection)get_store().add_element_user(PIVOTSELECTION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "pivotSelection" element
     */
    public void removePivotSelection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTSELECTION$4, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
    
    /**
     * Gets the "windowProtection" attribute
     */
    public boolean getWindowProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWPROTECTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(WINDOWPROTECTION$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "windowProtection" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWindowProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WINDOWPROTECTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(WINDOWPROTECTION$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "windowProtection" attribute
     */
    public boolean isSetWindowProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WINDOWPROTECTION$8) != null;
        }
    }
    
    /**
     * Sets the "windowProtection" attribute
     */
    public void setWindowProtection(boolean windowProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWPROTECTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WINDOWPROTECTION$8);
            }
            target.setBooleanValue(windowProtection);
        }
    }
    
    /**
     * Sets (as xml) the "windowProtection" attribute
     */
    public void xsetWindowProtection(org.apache.xmlbeans.XmlBoolean windowProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WINDOWPROTECTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WINDOWPROTECTION$8);
            }
            target.set(windowProtection);
        }
    }
    
    /**
     * Unsets the "windowProtection" attribute
     */
    public void unsetWindowProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WINDOWPROTECTION$8);
        }
    }
    
    /**
     * Gets the "showFormulas" attribute
     */
    public boolean getShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFORMULAS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWFORMULAS$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showFormulas" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFORMULAS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWFORMULAS$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "showFormulas" attribute
     */
    public boolean isSetShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWFORMULAS$10) != null;
        }
    }
    
    /**
     * Sets the "showFormulas" attribute
     */
    public void setShowFormulas(boolean showFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFORMULAS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWFORMULAS$10);
            }
            target.setBooleanValue(showFormulas);
        }
    }
    
    /**
     * Sets (as xml) the "showFormulas" attribute
     */
    public void xsetShowFormulas(org.apache.xmlbeans.XmlBoolean showFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFORMULAS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWFORMULAS$10);
            }
            target.set(showFormulas);
        }
    }
    
    /**
     * Unsets the "showFormulas" attribute
     */
    public void unsetShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWFORMULAS$10);
        }
    }
    
    /**
     * Gets the "showGridLines" attribute
     */
    public boolean getShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWGRIDLINES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWGRIDLINES$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showGridLines" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWGRIDLINES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWGRIDLINES$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "showGridLines" attribute
     */
    public boolean isSetShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWGRIDLINES$12) != null;
        }
    }
    
    /**
     * Sets the "showGridLines" attribute
     */
    public void setShowGridLines(boolean showGridLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWGRIDLINES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWGRIDLINES$12);
            }
            target.setBooleanValue(showGridLines);
        }
    }
    
    /**
     * Sets (as xml) the "showGridLines" attribute
     */
    public void xsetShowGridLines(org.apache.xmlbeans.XmlBoolean showGridLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWGRIDLINES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWGRIDLINES$12);
            }
            target.set(showGridLines);
        }
    }
    
    /**
     * Unsets the "showGridLines" attribute
     */
    public void unsetShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWGRIDLINES$12);
        }
    }
    
    /**
     * Gets the "showRowColHeaders" attribute
     */
    public boolean getShowRowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWROWCOLHEADERS$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showRowColHeaders" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowRowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWROWCOLHEADERS$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "showRowColHeaders" attribute
     */
    public boolean isSetShowRowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWROWCOLHEADERS$14) != null;
        }
    }
    
    /**
     * Sets the "showRowColHeaders" attribute
     */
    public void setShowRowColHeaders(boolean showRowColHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWROWCOLHEADERS$14);
            }
            target.setBooleanValue(showRowColHeaders);
        }
    }
    
    /**
     * Sets (as xml) the "showRowColHeaders" attribute
     */
    public void xsetShowRowColHeaders(org.apache.xmlbeans.XmlBoolean showRowColHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWROWCOLHEADERS$14);
            }
            target.set(showRowColHeaders);
        }
    }
    
    /**
     * Unsets the "showRowColHeaders" attribute
     */
    public void unsetShowRowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWROWCOLHEADERS$14);
        }
    }
    
    /**
     * Gets the "showZeros" attribute
     */
    public boolean getShowZeros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWZEROS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWZEROS$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showZeros" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowZeros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWZEROS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWZEROS$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "showZeros" attribute
     */
    public boolean isSetShowZeros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWZEROS$16) != null;
        }
    }
    
    /**
     * Sets the "showZeros" attribute
     */
    public void setShowZeros(boolean showZeros)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWZEROS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWZEROS$16);
            }
            target.setBooleanValue(showZeros);
        }
    }
    
    /**
     * Sets (as xml) the "showZeros" attribute
     */
    public void xsetShowZeros(org.apache.xmlbeans.XmlBoolean showZeros)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWZEROS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWZEROS$16);
            }
            target.set(showZeros);
        }
    }
    
    /**
     * Unsets the "showZeros" attribute
     */
    public void unsetShowZeros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWZEROS$16);
        }
    }
    
    /**
     * Gets the "rightToLeft" attribute
     */
    public boolean getRightToLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTTOLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RIGHTTOLEFT$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rightToLeft" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRightToLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RIGHTTOLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RIGHTTOLEFT$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "rightToLeft" attribute
     */
    public boolean isSetRightToLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RIGHTTOLEFT$18) != null;
        }
    }
    
    /**
     * Sets the "rightToLeft" attribute
     */
    public void setRightToLeft(boolean rightToLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTTOLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHTTOLEFT$18);
            }
            target.setBooleanValue(rightToLeft);
        }
    }
    
    /**
     * Sets (as xml) the "rightToLeft" attribute
     */
    public void xsetRightToLeft(org.apache.xmlbeans.XmlBoolean rightToLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RIGHTTOLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RIGHTTOLEFT$18);
            }
            target.set(rightToLeft);
        }
    }
    
    /**
     * Unsets the "rightToLeft" attribute
     */
    public void unsetRightToLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RIGHTTOLEFT$18);
        }
    }
    
    /**
     * Gets the "tabSelected" attribute
     */
    public boolean getTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABSELECTED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TABSELECTED$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tabSelected" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TABSELECTED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TABSELECTED$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "tabSelected" attribute
     */
    public boolean isSetTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABSELECTED$20) != null;
        }
    }
    
    /**
     * Sets the "tabSelected" attribute
     */
    public void setTabSelected(boolean tabSelected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABSELECTED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABSELECTED$20);
            }
            target.setBooleanValue(tabSelected);
        }
    }
    
    /**
     * Sets (as xml) the "tabSelected" attribute
     */
    public void xsetTabSelected(org.apache.xmlbeans.XmlBoolean tabSelected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TABSELECTED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TABSELECTED$20);
            }
            target.set(tabSelected);
        }
    }
    
    /**
     * Unsets the "tabSelected" attribute
     */
    public void unsetTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABSELECTED$20);
        }
    }
    
    /**
     * Gets the "showRuler" attribute
     */
    public boolean getShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWRULER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWRULER$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showRuler" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWRULER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWRULER$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "showRuler" attribute
     */
    public boolean isSetShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWRULER$22) != null;
        }
    }
    
    /**
     * Sets the "showRuler" attribute
     */
    public void setShowRuler(boolean showRuler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWRULER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWRULER$22);
            }
            target.setBooleanValue(showRuler);
        }
    }
    
    /**
     * Sets (as xml) the "showRuler" attribute
     */
    public void xsetShowRuler(org.apache.xmlbeans.XmlBoolean showRuler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWRULER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWRULER$22);
            }
            target.set(showRuler);
        }
    }
    
    /**
     * Unsets the "showRuler" attribute
     */
    public void unsetShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWRULER$22);
        }
    }
    
    /**
     * Gets the "showOutlineSymbols" attribute
     */
    public boolean getShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWOUTLINESYMBOLS$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showOutlineSymbols" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWOUTLINESYMBOLS$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "showOutlineSymbols" attribute
     */
    public boolean isSetShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24) != null;
        }
    }
    
    /**
     * Sets the "showOutlineSymbols" attribute
     */
    public void setShowOutlineSymbols(boolean showOutlineSymbols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWOUTLINESYMBOLS$24);
            }
            target.setBooleanValue(showOutlineSymbols);
        }
    }
    
    /**
     * Sets (as xml) the "showOutlineSymbols" attribute
     */
    public void xsetShowOutlineSymbols(org.apache.xmlbeans.XmlBoolean showOutlineSymbols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWOUTLINESYMBOLS$24);
            }
            target.set(showOutlineSymbols);
        }
    }
    
    /**
     * Unsets the "showOutlineSymbols" attribute
     */
    public void unsetShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWOUTLINESYMBOLS$24);
        }
    }
    
    /**
     * Gets the "defaultGridColor" attribute
     */
    public boolean getDefaultGridColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTGRIDCOLOR$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultGridColor" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDefaultGridColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTGRIDCOLOR$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultGridColor" attribute
     */
    public boolean isSetDefaultGridColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTGRIDCOLOR$26) != null;
        }
    }
    
    /**
     * Sets the "defaultGridColor" attribute
     */
    public void setDefaultGridColor(boolean defaultGridColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTGRIDCOLOR$26);
            }
            target.setBooleanValue(defaultGridColor);
        }
    }
    
    /**
     * Sets (as xml) the "defaultGridColor" attribute
     */
    public void xsetDefaultGridColor(org.apache.xmlbeans.XmlBoolean defaultGridColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTGRIDCOLOR$26);
            }
            target.set(defaultGridColor);
        }
    }
    
    /**
     * Unsets the "defaultGridColor" attribute
     */
    public void unsetDefaultGridColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTGRIDCOLOR$26);
        }
    }
    
    /**
     * Gets the "showWhiteSpace" attribute
     */
    public boolean getShowWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWWHITESPACE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWWHITESPACE$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showWhiteSpace" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWWHITESPACE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWWHITESPACE$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "showWhiteSpace" attribute
     */
    public boolean isSetShowWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWWHITESPACE$28) != null;
        }
    }
    
    /**
     * Sets the "showWhiteSpace" attribute
     */
    public void setShowWhiteSpace(boolean showWhiteSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWWHITESPACE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWWHITESPACE$28);
            }
            target.setBooleanValue(showWhiteSpace);
        }
    }
    
    /**
     * Sets (as xml) the "showWhiteSpace" attribute
     */
    public void xsetShowWhiteSpace(org.apache.xmlbeans.XmlBoolean showWhiteSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWWHITESPACE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWWHITESPACE$28);
            }
            target.set(showWhiteSpace);
        }
    }
    
    /**
     * Unsets the "showWhiteSpace" attribute
     */
    public void unsetShowWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWWHITESPACE$28);
        }
    }
    
    /**
     * Gets the "view" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum getView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VIEW$30);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "view" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType xgetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_store().find_attribute_user(VIEW$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_default_attribute_value(VIEW$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "view" attribute
     */
    public boolean isSetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VIEW$30) != null;
        }
    }
    
    /**
     * Sets the "view" attribute
     */
    public void setView(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum view)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEW$30);
            }
            target.setEnumValue(view);
        }
    }
    
    /**
     * Sets (as xml) the "view" attribute
     */
    public void xsetView(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType view)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_store().find_attribute_user(VIEW$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_store().add_attribute_user(VIEW$30);
            }
            target.set(view);
        }
    }
    
    /**
     * Unsets the "view" attribute
     */
    public void unsetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VIEW$30);
        }
    }
    
    /**
     * Gets the "topLeftCell" attribute
     */
    public java.lang.String getTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLEFTCELL$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topLeftCell" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(TOPLEFTCELL$32);
            return target;
        }
    }
    
    /**
     * True if has "topLeftCell" attribute
     */
    public boolean isSetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPLEFTCELL$32) != null;
        }
    }
    
    /**
     * Sets the "topLeftCell" attribute
     */
    public void setTopLeftCell(java.lang.String topLeftCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLEFTCELL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPLEFTCELL$32);
            }
            target.setStringValue(topLeftCell);
        }
    }
    
    /**
     * Sets (as xml) the "topLeftCell" attribute
     */
    public void xsetTopLeftCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef topLeftCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(TOPLEFTCELL$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(TOPLEFTCELL$32);
            }
            target.set(topLeftCell);
        }
    }
    
    /**
     * Unsets the "topLeftCell" attribute
     */
    public void unsetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPLEFTCELL$32);
        }
    }
    
    /**
     * Gets the "colorId" attribute
     */
    public long getColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLORID$34);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "colorId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLORID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COLORID$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "colorId" attribute
     */
    public boolean isSetColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLORID$34) != null;
        }
    }
    
    /**
     * Sets the "colorId" attribute
     */
    public void setColorId(long colorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLORID$34);
            }
            target.setLongValue(colorId);
        }
    }
    
    /**
     * Sets (as xml) the "colorId" attribute
     */
    public void xsetColorId(org.apache.xmlbeans.XmlUnsignedInt colorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLORID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COLORID$34);
            }
            target.set(colorId);
        }
    }
    
    /**
     * Unsets the "colorId" attribute
     */
    public void unsetColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLORID$34);
        }
    }
    
    /**
     * Gets the "zoomScale" attribute
     */
    public long getZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMSCALE$36);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomScale" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ZOOMSCALE$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoomScale" attribute
     */
    public boolean isSetZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMSCALE$36) != null;
        }
    }
    
    /**
     * Sets the "zoomScale" attribute
     */
    public void setZoomScale(long zoomScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMSCALE$36);
            }
            target.setLongValue(zoomScale);
        }
    }
    
    /**
     * Sets (as xml) the "zoomScale" attribute
     */
    public void xsetZoomScale(org.apache.xmlbeans.XmlUnsignedInt zoomScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ZOOMSCALE$36);
            }
            target.set(zoomScale);
        }
    }
    
    /**
     * Unsets the "zoomScale" attribute
     */
    public void unsetZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMSCALE$36);
        }
    }
    
    /**
     * Gets the "zoomScaleNormal" attribute
     */
    public long getZoomScaleNormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALENORMAL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMSCALENORMAL$38);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomScaleNormal" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetZoomScaleNormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALENORMAL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ZOOMSCALENORMAL$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoomScaleNormal" attribute
     */
    public boolean isSetZoomScaleNormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMSCALENORMAL$38) != null;
        }
    }
    
    /**
     * Sets the "zoomScaleNormal" attribute
     */
    public void setZoomScaleNormal(long zoomScaleNormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALENORMAL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMSCALENORMAL$38);
            }
            target.setLongValue(zoomScaleNormal);
        }
    }
    
    /**
     * Sets (as xml) the "zoomScaleNormal" attribute
     */
    public void xsetZoomScaleNormal(org.apache.xmlbeans.XmlUnsignedInt zoomScaleNormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALENORMAL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ZOOMSCALENORMAL$38);
            }
            target.set(zoomScaleNormal);
        }
    }
    
    /**
     * Unsets the "zoomScaleNormal" attribute
     */
    public void unsetZoomScaleNormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMSCALENORMAL$38);
        }
    }
    
    /**
     * Gets the "zoomScaleSheetLayoutView" attribute
     */
    public long getZoomScaleSheetLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMSCALESHEETLAYOUTVIEW$40);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomScaleSheetLayoutView" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetZoomScaleSheetLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ZOOMSCALESHEETLAYOUTVIEW$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoomScaleSheetLayoutView" attribute
     */
    public boolean isSetZoomScaleSheetLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40) != null;
        }
    }
    
    /**
     * Sets the "zoomScaleSheetLayoutView" attribute
     */
    public void setZoomScaleSheetLayoutView(long zoomScaleSheetLayoutView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
            }
            target.setLongValue(zoomScaleSheetLayoutView);
        }
    }
    
    /**
     * Sets (as xml) the "zoomScaleSheetLayoutView" attribute
     */
    public void xsetZoomScaleSheetLayoutView(org.apache.xmlbeans.XmlUnsignedInt zoomScaleSheetLayoutView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
            }
            target.set(zoomScaleSheetLayoutView);
        }
    }
    
    /**
     * Unsets the "zoomScaleSheetLayoutView" attribute
     */
    public void unsetZoomScaleSheetLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMSCALESHEETLAYOUTVIEW$40);
        }
    }
    
    /**
     * Gets the "zoomScalePageLayoutView" attribute
     */
    public long getZoomScalePageLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMSCALEPAGELAYOUTVIEW$42);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomScalePageLayoutView" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetZoomScalePageLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ZOOMSCALEPAGELAYOUTVIEW$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoomScalePageLayoutView" attribute
     */
    public boolean isSetZoomScalePageLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42) != null;
        }
    }
    
    /**
     * Sets the "zoomScalePageLayoutView" attribute
     */
    public void setZoomScalePageLayoutView(long zoomScalePageLayoutView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
            }
            target.setLongValue(zoomScalePageLayoutView);
        }
    }
    
    /**
     * Sets (as xml) the "zoomScalePageLayoutView" attribute
     */
    public void xsetZoomScalePageLayoutView(org.apache.xmlbeans.XmlUnsignedInt zoomScalePageLayoutView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
            }
            target.set(zoomScalePageLayoutView);
        }
    }
    
    /**
     * Unsets the "zoomScalePageLayoutView" attribute
     */
    public void unsetZoomScalePageLayoutView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMSCALEPAGELAYOUTVIEW$42);
        }
    }
    
    /**
     * Gets the "workbookViewId" attribute
     */
    public long getWorkbookViewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKVIEWID$44);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "workbookViewId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetWorkbookViewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WORKBOOKVIEWID$44);
            return target;
        }
    }
    
    /**
     * Sets the "workbookViewId" attribute
     */
    public void setWorkbookViewId(long workbookViewId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKVIEWID$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WORKBOOKVIEWID$44);
            }
            target.setLongValue(workbookViewId);
        }
    }
    
    /**
     * Sets (as xml) the "workbookViewId" attribute
     */
    public void xsetWorkbookViewId(org.apache.xmlbeans.XmlUnsignedInt workbookViewId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WORKBOOKVIEWID$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(WORKBOOKVIEWID$44);
            }
            target.set(workbookViewId);
        }
    }
}

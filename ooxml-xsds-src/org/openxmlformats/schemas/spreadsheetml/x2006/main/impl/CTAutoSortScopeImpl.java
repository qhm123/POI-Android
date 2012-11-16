/*
 * XML Type:  CT_AutoSortScope
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_AutoSortScope(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTAutoSortScopeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope
{
    
    public CTAutoSortScopeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTAREA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotArea");
    
    
    /**
     * Gets the "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pivotArea" element
     */
    public void setPivotArea(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            }
            target.set(pivotArea);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: pivotTableDefinition
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.PivotTableDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one pivotTableDefinition(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class PivotTableDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.PivotTableDefinitionDocument
{
    
    public PivotTableDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTTABLEDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotTableDefinition");
    
    
    /**
     * Gets the "pivotTableDefinition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition getPivotTableDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition)get_store().find_element_user(PIVOTTABLEDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pivotTableDefinition" element
     */
    public void setPivotTableDefinition(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition pivotTableDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition)get_store().find_element_user(PIVOTTABLEDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition)get_store().add_element_user(PIVOTTABLEDEFINITION$0);
            }
            target.set(pivotTableDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotTableDefinition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition addNewPivotTableDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition)get_store().add_element_user(PIVOTTABLEDEFINITION$0);
            return target;
        }
    }
}

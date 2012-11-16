/*
 * An XML document type.
 * Localname: pivotCacheDefinition
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.PivotCacheDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one pivotCacheDefinition(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class PivotCacheDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.PivotCacheDefinitionDocument
{
    
    public PivotCacheDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTCACHEDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCacheDefinition");
    
    
    /**
     * Gets the "pivotCacheDefinition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition getPivotCacheDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition)get_store().find_element_user(PIVOTCACHEDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pivotCacheDefinition" element
     */
    public void setPivotCacheDefinition(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition pivotCacheDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition)get_store().find_element_user(PIVOTCACHEDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition)get_store().add_element_user(PIVOTCACHEDEFINITION$0);
            }
            target.set(pivotCacheDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotCacheDefinition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition addNewPivotCacheDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition)get_store().add_element_user(PIVOTCACHEDEFINITION$0);
            return target;
        }
    }
}

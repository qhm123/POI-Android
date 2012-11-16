/*
 * An XML document type.
 * Localname: pivotCacheRecords
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.PivotCacheRecordsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one pivotCacheRecords(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class PivotCacheRecordsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.PivotCacheRecordsDocument
{
    
    public PivotCacheRecordsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTCACHERECORDS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCacheRecords");
    
    
    /**
     * Gets the "pivotCacheRecords" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords getPivotCacheRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords)get_store().find_element_user(PIVOTCACHERECORDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pivotCacheRecords" element
     */
    public void setPivotCacheRecords(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords pivotCacheRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords)get_store().find_element_user(PIVOTCACHERECORDS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords)get_store().add_element_user(PIVOTCACHERECORDS$0);
            }
            target.set(pivotCacheRecords);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotCacheRecords" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords addNewPivotCacheRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords)get_store().add_element_user(PIVOTCACHERECORDS$0);
            return target;
        }
    }
}

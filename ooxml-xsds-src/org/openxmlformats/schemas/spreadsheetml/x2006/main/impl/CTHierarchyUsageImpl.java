/*
 * XML Type:  CT_HierarchyUsage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_HierarchyUsage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTHierarchyUsageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHierarchyUsage
{
    
    public CTHierarchyUsageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHYUSAGE$0 = 
        new javax.xml.namespace.QName("", "hierarchyUsage");
    
    
    /**
     * Gets the "hierarchyUsage" attribute
     */
    public int getHierarchyUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIERARCHYUSAGE$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hierarchyUsage" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetHierarchyUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(HIERARCHYUSAGE$0);
            return target;
        }
    }
    
    /**
     * Sets the "hierarchyUsage" attribute
     */
    public void setHierarchyUsage(int hierarchyUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIERARCHYUSAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIERARCHYUSAGE$0);
            }
            target.setIntValue(hierarchyUsage);
        }
    }
    
    /**
     * Sets (as xml) the "hierarchyUsage" attribute
     */
    public void xsetHierarchyUsage(org.apache.xmlbeans.XmlInt hierarchyUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(HIERARCHYUSAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(HIERARCHYUSAGE$0);
            }
            target.set(hierarchyUsage);
        }
    }
}

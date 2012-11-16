/*
 * An XML document type.
 * Localname: volTypes
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.VolTypesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one volTypes(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class VolTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.VolTypesDocument
{
    
    public VolTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOLTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "volTypes");
    
    
    /**
     * Gets the "volTypes" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes getVolTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes)get_store().find_element_user(VOLTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "volTypes" element
     */
    public void setVolTypes(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes volTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes)get_store().find_element_user(VOLTYPES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes)get_store().add_element_user(VOLTYPES$0);
            }
            target.set(volTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "volTypes" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes addNewVolTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTypes)get_store().add_element_user(VOLTYPES$0);
            return target;
        }
    }
}

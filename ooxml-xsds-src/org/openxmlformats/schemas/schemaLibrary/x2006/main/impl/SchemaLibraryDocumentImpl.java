/*
 * An XML document type.
 * Localname: schemaLibrary
 * Namespace: http://schemas.openxmlformats.org/schemaLibrary/2006/main
 * Java type: org.openxmlformats.schemas.schemaLibrary.x2006.main.SchemaLibraryDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.schemaLibrary.x2006.main.impl;
/**
 * A document containing one schemaLibrary(@http://schemas.openxmlformats.org/schemaLibrary/2006/main) element.
 *
 * This is a complex type.
 */
public class SchemaLibraryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.schemaLibrary.x2006.main.SchemaLibraryDocument
{
    
    public SchemaLibraryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMALIBRARY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "schemaLibrary");
    
    
    /**
     * Gets the "schemaLibrary" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary getSchemaLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().find_element_user(SCHEMALIBRARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "schemaLibrary" element
     */
    public void setSchemaLibrary(org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary schemaLibrary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().find_element_user(SCHEMALIBRARY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().add_element_user(SCHEMALIBRARY$0);
            }
            target.set(schemaLibrary);
        }
    }
    
    /**
     * Appends and returns a new empty "schemaLibrary" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary addNewSchemaLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().add_element_user(SCHEMALIBRARY$0);
            return target;
        }
    }
}

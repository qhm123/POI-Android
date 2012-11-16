/*
 * An XML document type.
 * Localname: metadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.MetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one metadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class MetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.MetadataDocument
{
    
    public MetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "metadata");
    
    
    /**
     * Gets the "metadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "metadata" element
     */
    public void setMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata)get_store().add_element_user(METADATA$0);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Appends and returns a new empty "metadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata addNewMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
}

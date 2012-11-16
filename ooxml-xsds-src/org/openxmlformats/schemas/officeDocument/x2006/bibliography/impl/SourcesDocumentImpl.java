/*
 * An XML document type.
 * Localname: Sources
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.SourcesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * A document containing one Sources(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography) element.
 *
 * This is a complex type.
 */
public class SourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.SourcesDocument
{
    
    public SourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Sources");
    
    
    /**
     * Gets the "Sources" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources getSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources)get_store().find_element_user(SOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sources" element
     */
    public void setSources(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources sources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources)get_store().find_element_user(SOURCES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources)get_store().add_element_user(SOURCES$0);
            }
            target.set(sources);
        }
    }
    
    /**
     * Appends and returns a new empty "Sources" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources addNewSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources)get_store().add_element_user(SOURCES$0);
            return target;
        }
    }
}

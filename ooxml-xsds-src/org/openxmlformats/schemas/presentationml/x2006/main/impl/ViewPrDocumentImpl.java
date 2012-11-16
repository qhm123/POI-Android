/*
 * An XML document type.
 * Localname: viewPr
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.ViewPrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one viewPr(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class ViewPrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.ViewPrDocument
{
    
    public ViewPrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "viewPr");
    
    
    /**
     * Gets the "viewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties getViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties)get_store().find_element_user(VIEWPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "viewPr" element
     */
    public void setViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties viewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties)get_store().find_element_user(VIEWPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties)get_store().add_element_user(VIEWPR$0);
            }
            target.set(viewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "viewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties addNewViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties)get_store().add_element_user(VIEWPR$0);
            return target;
        }
    }
}

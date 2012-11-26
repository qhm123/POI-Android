/*
 * An XML document type.
 * Localname: presentationPr
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.PresentationPrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one presentationPr(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class PresentationPrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.PresentationPrDocument
{
    
    public PresentationPrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRESENTATIONPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "presentationPr");
    
    
    /**
     * Gets the "presentationPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties getPresentationPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties)get_store().find_element_user(PRESENTATIONPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "presentationPr" element
     */
    public void setPresentationPr(org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties presentationPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties)get_store().find_element_user(PRESENTATIONPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties)get_store().add_element_user(PRESENTATIONPR$0);
            }
            target.set(presentationPr);
        }
    }
    
    /**
     * Appends and returns a new empty "presentationPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties addNewPresentationPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties)get_store().add_element_user(PRESENTATIONPR$0);
            return target;
        }
    }
}

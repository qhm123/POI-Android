/*
 * An XML document type.
 * Localname: presentationPr
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.PresentationPrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * A document containing one presentationPr(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public interface PresentationPrDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PresentationPrDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("presentationpr6c55doctype");
    
    /**
     * Gets the "presentationPr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties getPresentationPr();
    
    /**
     * Sets the "presentationPr" element
     */
    void setPresentationPr(org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties presentationPr);
    
    /**
     * Appends and returns a new empty "presentationPr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties addNewPresentationPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

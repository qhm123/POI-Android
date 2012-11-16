/*
 * An XML document type.
 * Localname: viewPr
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.ViewPrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * A document containing one viewPr(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public interface ViewPrDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewPrDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("viewpr43aadoctype");
    
    /**
     * Gets the "viewPr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties getViewPr();
    
    /**
     * Sets the "viewPr" element
     */
    void setViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties viewPr);
    
    /**
     * Appends and returns a new empty "viewPr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties addNewViewPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

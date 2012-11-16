/*
 * XML Type:  CT_PPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_PPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPPrChange extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPPrChange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpprchange29b0type");
    
    /**
     * Gets the "pPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase getPPr();
    
    /**
     * Sets the "pPr" element
     */
    void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase pPr);
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase addNewPPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

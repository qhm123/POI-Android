/*
 * XML Type:  CT_TcPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_TcPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTcPr extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTcPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttcpree37type");
    
    /**
     * Gets the "tcPrChange" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange getTcPrChange();
    
    /**
     * True if has "tcPrChange" element
     */
    boolean isSetTcPrChange();
    
    /**
     * Sets the "tcPrChange" element
     */
    void setTcPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange tcPrChange);
    
    /**
     * Appends and returns a new empty "tcPrChange" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange addNewTcPrChange();
    
    /**
     * Unsets the "tcPrChange" element
     */
    void unsetTcPrChange();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

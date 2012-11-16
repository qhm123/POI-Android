/*
 * XML Type:  CT_RElt
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RElt(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRElt extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRElt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrelt6464type");
    
    /**
     * Gets the "rPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt getRPr();
    
    /**
     * True if has "rPr" element
     */
    boolean isSetRPr();
    
    /**
     * Sets the "rPr" element
     */
    void setRPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt rPr);
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt addNewRPr();
    
    /**
     * Unsets the "rPr" element
     */
    void unsetRPr();
    
    /**
     * Gets the "t" element
     */
    java.lang.String getT();
    
    /**
     * Gets (as xml) the "t" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetT();
    
    /**
     * Sets the "t" element
     */
    void setT(java.lang.String t);
    
    /**
     * Sets (as xml) the "t" element
     */
    void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring t);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_Query
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Query(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTQuery extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTQuery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctquery43e7type");
    
    /**
     * Gets the "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getTpls();
    
    /**
     * True if has "tpls" element
     */
    boolean isSetTpls();
    
    /**
     * Sets the "tpls" element
     */
    void setTpls(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples tpls);
    
    /**
     * Appends and returns a new empty "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewTpls();
    
    /**
     * Unsets the "tpls" element
     */
    void unsetTpls();
    
    /**
     * Gets the "mdx" attribute
     */
    java.lang.String getMdx();
    
    /**
     * Gets (as xml) the "mdx" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetMdx();
    
    /**
     * Sets the "mdx" attribute
     */
    void setMdx(java.lang.String mdx);
    
    /**
     * Sets (as xml) the "mdx" attribute
     */
    void xsetMdx(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring mdx);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

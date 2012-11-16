/*
 * XML Type:  CT_MCPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_MCPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTMCPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMCPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmcpr6d9atype");
    
    /**
     * Gets the "count" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 getCount();
    
    /**
     * True if has "count" element
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" element
     */
    void setCount(org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 count);
    
    /**
     * Appends and returns a new empty "count" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 addNewCount();
    
    /**
     * Unsets the "count" element
     */
    void unsetCount();
    
    /**
     * Gets the "mcJc" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign getMcJc();
    
    /**
     * True if has "mcJc" element
     */
    boolean isSetMcJc();
    
    /**
     * Sets the "mcJc" element
     */
    void setMcJc(org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign mcJc);
    
    /**
     * Appends and returns a new empty "mcJc" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign addNewMcJc();
    
    /**
     * Unsets the "mcJc" element
     */
    void unsetMcJc();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

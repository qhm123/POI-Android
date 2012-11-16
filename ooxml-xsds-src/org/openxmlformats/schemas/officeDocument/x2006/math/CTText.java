/*
 * XML Type:  CT_Text
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTText
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_Text(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.math.CTText.
 */
public interface CTText extends org.openxmlformats.schemas.officeDocument.x2006.math.STString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttext8965type");
    
    /**
     * Gets the "space" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum getSpace();
    
    /**
     * Gets (as xml) the "space" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space xgetSpace();
    
    /**
     * True if has "space" attribute
     */
    boolean isSetSpace();
    
    /**
     * Sets the "space" attribute
     */
    void setSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum space);
    
    /**
     * Sets (as xml) the "space" attribute
     */
    void xsetSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space space);
    
    /**
     * Unsets the "space" attribute
     */
    void unsetSpace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

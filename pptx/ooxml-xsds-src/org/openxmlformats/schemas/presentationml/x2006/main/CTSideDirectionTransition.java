/*
 * XML Type:  CT_SideDirectionTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_SideDirectionTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSideDirectionTransition extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSideDirectionTransition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsidedirectiontransition1752type");
    
    /**
     * Gets the "dir" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSideDirectionType.Enum getDir();
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSideDirectionType xgetDir();
    
    /**
     * True if has "dir" attribute
     */
    boolean isSetDir();
    
    /**
     * Sets the "dir" attribute
     */
    void setDir(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSideDirectionType.Enum dir);
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    void xsetDir(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSideDirectionType dir);
    
    /**
     * Unsets the "dir" attribute
     */
    void unsetDir();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_TLSetBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLSetBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLSetBehavior extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLSetBehavior.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlsetbehaviord633type");
    
    /**
     * Gets the "cBhvr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData getCBhvr();
    
    /**
     * Sets the "cBhvr" element
     */
    void setCBhvr(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData cBhvr);
    
    /**
     * Appends and returns a new empty "cBhvr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData addNewCBhvr();
    
    /**
     * Gets the "to" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant getTo();
    
    /**
     * True if has "to" element
     */
    boolean isSetTo();
    
    /**
     * Sets the "to" element
     */
    void setTo(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant to);
    
    /**
     * Appends and returns a new empty "to" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant addNewTo();
    
    /**
     * Unsets the "to" element
     */
    void unsetTo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

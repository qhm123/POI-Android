/*
 * XML Type:  CT_TLTemplate
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLTemplate(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLTemplate extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLTemplate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttltemplate3ab3type");
    
    /**
     * Gets the "tnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getTnLst();
    
    /**
     * Sets the "tnLst" element
     */
    void setTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList tnLst);
    
    /**
     * Appends and returns a new empty "tnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewTnLst();
    
    /**
     * Gets the "lvl" attribute
     */
    long getLvl();
    
    /**
     * Gets (as xml) the "lvl" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetLvl();
    
    /**
     * True if has "lvl" attribute
     */
    boolean isSetLvl();
    
    /**
     * Sets the "lvl" attribute
     */
    void setLvl(long lvl);
    
    /**
     * Sets (as xml) the "lvl" attribute
     */
    void xsetLvl(org.apache.xmlbeans.XmlUnsignedInt lvl);
    
    /**
     * Unsets the "lvl" attribute
     */
    void unsetLvl();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

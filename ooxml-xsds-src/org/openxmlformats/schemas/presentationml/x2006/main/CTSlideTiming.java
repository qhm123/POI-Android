/*
 * XML Type:  CT_SlideTiming
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_SlideTiming(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSlideTiming extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSlideTiming.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctslidetiming4214type");
    
    /**
     * Gets the "tnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getTnLst();
    
    /**
     * True if has "tnLst" element
     */
    boolean isSetTnLst();
    
    /**
     * Sets the "tnLst" element
     */
    void setTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList tnLst);
    
    /**
     * Appends and returns a new empty "tnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewTnLst();
    
    /**
     * Unsets the "tnLst" element
     */
    void unsetTnLst();
    
    /**
     * Gets the "bldLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList getBldLst();
    
    /**
     * True if has "bldLst" element
     */
    boolean isSetBldLst();
    
    /**
     * Sets the "bldLst" element
     */
    void setBldLst(org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList bldLst);
    
    /**
     * Appends and returns a new empty "bldLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList addNewBldLst();
    
    /**
     * Unsets the "bldLst" element
     */
    void unsetBldLst();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

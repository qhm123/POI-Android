/*
 * XML Type:  CT_CommonSlideData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_CommonSlideData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCommonSlideData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCommonSlideData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcommonslidedata8c7ftype");
    
    /**
     * Gets the "bg" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTBackground getBg();
    
    /**
     * True if has "bg" element
     */
    boolean isSetBg();
    
    /**
     * Sets the "bg" element
     */
    void setBg(org.openxmlformats.schemas.presentationml.x2006.main.CTBackground bg);
    
    /**
     * Appends and returns a new empty "bg" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTBackground addNewBg();
    
    /**
     * Unsets the "bg" element
     */
    void unsetBg();
    
    /**
     * Gets the "spTree" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape getSpTree();
    
    /**
     * Sets the "spTree" element
     */
    void setSpTree(org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape spTree);
    
    /**
     * Appends and returns a new empty "spTree" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape addNewSpTree();
    
    /**
     * Gets the "custDataLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList getCustDataLst();
    
    /**
     * True if has "custDataLst" element
     */
    boolean isSetCustDataLst();
    
    /**
     * Sets the "custDataLst" element
     */
    void setCustDataLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList custDataLst);
    
    /**
     * Appends and returns a new empty "custDataLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList addNewCustDataLst();
    
    /**
     * Unsets the "custDataLst" element
     */
    void unsetCustDataLst();
    
    /**
     * Gets the "controls" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTControlList getControls();
    
    /**
     * True if has "controls" element
     */
    boolean isSetControls();
    
    /**
     * Sets the "controls" element
     */
    void setControls(org.openxmlformats.schemas.presentationml.x2006.main.CTControlList controls);
    
    /**
     * Appends and returns a new empty "controls" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTControlList addNewControls();
    
    /**
     * Unsets the "controls" element
     */
    void unsetControls();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

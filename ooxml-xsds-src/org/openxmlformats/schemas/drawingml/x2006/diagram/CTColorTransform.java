/*
 * XML Type:  CT_ColorTransform
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_ColorTransform(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTColorTransform extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorTransform.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolortransform8f48type");
    
    /**
     * Gets a List of "title" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName> getTitleList();
    
    /**
     * Gets array of all "title" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] getTitleArray();
    
    /**
     * Gets ith "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName getTitleArray(int i);
    
    /**
     * Returns number of "title" element
     */
    int sizeOfTitleArray();
    
    /**
     * Sets array of all "title" element
     */
    void setTitleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] titleArray);
    
    /**
     * Sets ith "title" element
     */
    void setTitleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName title);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName insertNewTitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName addNewTitle();
    
    /**
     * Removes the ith "title" element
     */
    void removeTitle(int i);
    
    /**
     * Gets a List of "desc" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription> getDescList();
    
    /**
     * Gets array of all "desc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] getDescArray();
    
    /**
     * Gets ith "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription getDescArray(int i);
    
    /**
     * Returns number of "desc" element
     */
    int sizeOfDescArray();
    
    /**
     * Sets array of all "desc" element
     */
    void setDescArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] descArray);
    
    /**
     * Sets ith "desc" element
     */
    void setDescArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription desc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription insertNewDesc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription addNewDesc();
    
    /**
     * Removes the ith "desc" element
     */
    void removeDesc(int i);
    
    /**
     * Gets the "catLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories getCatLst();
    
    /**
     * True if has "catLst" element
     */
    boolean isSetCatLst();
    
    /**
     * Sets the "catLst" element
     */
    void setCatLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories catLst);
    
    /**
     * Appends and returns a new empty "catLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories addNewCatLst();
    
    /**
     * Unsets the "catLst" element
     */
    void unsetCatLst();
    
    /**
     * Gets a List of "styleLbl" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel> getStyleLblList();
    
    /**
     * Gets array of all "styleLbl" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel[] getStyleLblArray();
    
    /**
     * Gets ith "styleLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel getStyleLblArray(int i);
    
    /**
     * Returns number of "styleLbl" element
     */
    int sizeOfStyleLblArray();
    
    /**
     * Sets array of all "styleLbl" element
     */
    void setStyleLblArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel[] styleLblArray);
    
    /**
     * Sets ith "styleLbl" element
     */
    void setStyleLblArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel styleLbl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel insertNewStyleLbl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleLbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel addNewStyleLbl();
    
    /**
     * Removes the ith "styleLbl" element
     */
    void removeStyleLbl(int i);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "uniqueId" attribute
     */
    java.lang.String getUniqueId();
    
    /**
     * Gets (as xml) the "uniqueId" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueId();
    
    /**
     * True if has "uniqueId" attribute
     */
    boolean isSetUniqueId();
    
    /**
     * Sets the "uniqueId" attribute
     */
    void setUniqueId(java.lang.String uniqueId);
    
    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId);
    
    /**
     * Unsets the "uniqueId" attribute
     */
    void unsetUniqueId();
    
    /**
     * Gets the "minVer" attribute
     */
    java.lang.String getMinVer();
    
    /**
     * Gets (as xml) the "minVer" attribute
     */
    org.apache.xmlbeans.XmlString xgetMinVer();
    
    /**
     * True if has "minVer" attribute
     */
    boolean isSetMinVer();
    
    /**
     * Sets the "minVer" attribute
     */
    void setMinVer(java.lang.String minVer);
    
    /**
     * Sets (as xml) the "minVer" attribute
     */
    void xsetMinVer(org.apache.xmlbeans.XmlString minVer);
    
    /**
     * Unsets the "minVer" attribute
     */
    void unsetMinVer();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

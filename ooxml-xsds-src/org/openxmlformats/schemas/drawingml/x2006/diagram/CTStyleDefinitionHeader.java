/*
 * XML Type:  CT_StyleDefinitionHeader
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_StyleDefinitionHeader(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTStyleDefinitionHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStyleDefinitionHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstyledefinitionheader172atype");
    
    /**
     * Gets a List of "title" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName> getTitleList();
    
    /**
     * Gets array of all "title" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName[] getTitleArray();
    
    /**
     * Gets ith "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName getTitleArray(int i);
    
    /**
     * Returns number of "title" element
     */
    int sizeOfTitleArray();
    
    /**
     * Sets array of all "title" element
     */
    void setTitleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName[] titleArray);
    
    /**
     * Sets ith "title" element
     */
    void setTitleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName title);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName insertNewTitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName addNewTitle();
    
    /**
     * Removes the ith "title" element
     */
    void removeTitle(int i);
    
    /**
     * Gets a List of "desc" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription> getDescList();
    
    /**
     * Gets array of all "desc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription[] getDescArray();
    
    /**
     * Gets ith "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription getDescArray(int i);
    
    /**
     * Returns number of "desc" element
     */
    int sizeOfDescArray();
    
    /**
     * Sets array of all "desc" element
     */
    void setDescArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription[] descArray);
    
    /**
     * Sets ith "desc" element
     */
    void setDescArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription desc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription insertNewDesc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription addNewDesc();
    
    /**
     * Removes the ith "desc" element
     */
    void removeDesc(int i);
    
    /**
     * Gets the "catLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories getCatLst();
    
    /**
     * True if has "catLst" element
     */
    boolean isSetCatLst();
    
    /**
     * Sets the "catLst" element
     */
    void setCatLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories catLst);
    
    /**
     * Appends and returns a new empty "catLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories addNewCatLst();
    
    /**
     * Unsets the "catLst" element
     */
    void unsetCatLst();
    
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
     * Sets the "uniqueId" attribute
     */
    void setUniqueId(java.lang.String uniqueId);
    
    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId);
    
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
     * Gets the "resId" attribute
     */
    int getResId();
    
    /**
     * Gets (as xml) the "resId" attribute
     */
    org.apache.xmlbeans.XmlInt xgetResId();
    
    /**
     * True if has "resId" attribute
     */
    boolean isSetResId();
    
    /**
     * Sets the "resId" attribute
     */
    void setResId(int resId);
    
    /**
     * Sets (as xml) the "resId" attribute
     */
    void xsetResId(org.apache.xmlbeans.XmlInt resId);
    
    /**
     * Unsets the "resId" attribute
     */
    void unsetResId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

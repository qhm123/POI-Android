/*
 * XML Type:  CT_TableCell
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TableCell(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableCell extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableCell.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablecell3ac1type");
    
    /**
     * Gets the "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody();
    
    /**
     * True if has "txBody" element
     */
    boolean isSetTxBody();
    
    /**
     * Sets the "txBody" element
     */
    void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody);
    
    /**
     * Appends and returns a new empty "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody();
    
    /**
     * Unsets the "txBody" element
     */
    void unsetTxBody();
    
    /**
     * Gets the "tcPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties getTcPr();
    
    /**
     * True if has "tcPr" element
     */
    boolean isSetTcPr();
    
    /**
     * Sets the "tcPr" element
     */
    void setTcPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties tcPr);
    
    /**
     * Appends and returns a new empty "tcPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties addNewTcPr();
    
    /**
     * Unsets the "tcPr" element
     */
    void unsetTcPr();
    
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
     * Gets the "rowSpan" attribute
     */
    int getRowSpan();
    
    /**
     * Gets (as xml) the "rowSpan" attribute
     */
    org.apache.xmlbeans.XmlInt xgetRowSpan();
    
    /**
     * True if has "rowSpan" attribute
     */
    boolean isSetRowSpan();
    
    /**
     * Sets the "rowSpan" attribute
     */
    void setRowSpan(int rowSpan);
    
    /**
     * Sets (as xml) the "rowSpan" attribute
     */
    void xsetRowSpan(org.apache.xmlbeans.XmlInt rowSpan);
    
    /**
     * Unsets the "rowSpan" attribute
     */
    void unsetRowSpan();
    
    /**
     * Gets the "gridSpan" attribute
     */
    int getGridSpan();
    
    /**
     * Gets (as xml) the "gridSpan" attribute
     */
    org.apache.xmlbeans.XmlInt xgetGridSpan();
    
    /**
     * True if has "gridSpan" attribute
     */
    boolean isSetGridSpan();
    
    /**
     * Sets the "gridSpan" attribute
     */
    void setGridSpan(int gridSpan);
    
    /**
     * Sets (as xml) the "gridSpan" attribute
     */
    void xsetGridSpan(org.apache.xmlbeans.XmlInt gridSpan);
    
    /**
     * Unsets the "gridSpan" attribute
     */
    void unsetGridSpan();
    
    /**
     * Gets the "hMerge" attribute
     */
    boolean getHMerge();
    
    /**
     * Gets (as xml) the "hMerge" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHMerge();
    
    /**
     * True if has "hMerge" attribute
     */
    boolean isSetHMerge();
    
    /**
     * Sets the "hMerge" attribute
     */
    void setHMerge(boolean hMerge);
    
    /**
     * Sets (as xml) the "hMerge" attribute
     */
    void xsetHMerge(org.apache.xmlbeans.XmlBoolean hMerge);
    
    /**
     * Unsets the "hMerge" attribute
     */
    void unsetHMerge();
    
    /**
     * Gets the "vMerge" attribute
     */
    boolean getVMerge();
    
    /**
     * Gets (as xml) the "vMerge" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetVMerge();
    
    /**
     * True if has "vMerge" attribute
     */
    boolean isSetVMerge();
    
    /**
     * Sets the "vMerge" attribute
     */
    void setVMerge(boolean vMerge);
    
    /**
     * Sets (as xml) the "vMerge" attribute
     */
    void xsetVMerge(org.apache.xmlbeans.XmlBoolean vMerge);
    
    /**
     * Unsets the "vMerge" attribute
     */
    void unsetVMerge();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

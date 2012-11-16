/*
 * XML Type:  CT_TcPrInner
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_TcPrInner(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTcPrInner extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTcPrInner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttcprinnerc56dtype");
    
    /**
     * Gets the "cellIns" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCellIns();
    
    /**
     * True if has "cellIns" element
     */
    boolean isSetCellIns();
    
    /**
     * Sets the "cellIns" element
     */
    void setCellIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange cellIns);
    
    /**
     * Appends and returns a new empty "cellIns" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCellIns();
    
    /**
     * Unsets the "cellIns" element
     */
    void unsetCellIns();
    
    /**
     * Gets the "cellDel" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCellDel();
    
    /**
     * True if has "cellDel" element
     */
    boolean isSetCellDel();
    
    /**
     * Sets the "cellDel" element
     */
    void setCellDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange cellDel);
    
    /**
     * Appends and returns a new empty "cellDel" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCellDel();
    
    /**
     * Unsets the "cellDel" element
     */
    void unsetCellDel();
    
    /**
     * Gets the "cellMerge" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange getCellMerge();
    
    /**
     * True if has "cellMerge" element
     */
    boolean isSetCellMerge();
    
    /**
     * Sets the "cellMerge" element
     */
    void setCellMerge(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange cellMerge);
    
    /**
     * Appends and returns a new empty "cellMerge" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange addNewCellMerge();
    
    /**
     * Unsets the "cellMerge" element
     */
    void unsetCellMerge();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

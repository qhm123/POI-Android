/*
 * XML Type:  CT_PresentationOf
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_PresentationOf(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTPresentationOf extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPresentationOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpresentationof4100type");
    
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
     * Gets the "axis" attribute
     */
    java.util.List getAxis();
    
    /**
     * Gets (as xml) the "axis" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes xgetAxis();
    
    /**
     * True if has "axis" attribute
     */
    boolean isSetAxis();
    
    /**
     * Sets the "axis" attribute
     */
    void setAxis(java.util.List axis);
    
    /**
     * Sets (as xml) the "axis" attribute
     */
    void xsetAxis(org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes axis);
    
    /**
     * Unsets the "axis" attribute
     */
    void unsetAxis();
    
    /**
     * Gets the "ptType" attribute
     */
    java.util.List getPtType();
    
    /**
     * Gets (as xml) the "ptType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes xgetPtType();
    
    /**
     * True if has "ptType" attribute
     */
    boolean isSetPtType();
    
    /**
     * Sets the "ptType" attribute
     */
    void setPtType(java.util.List ptType);
    
    /**
     * Sets (as xml) the "ptType" attribute
     */
    void xsetPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes ptType);
    
    /**
     * Unsets the "ptType" attribute
     */
    void unsetPtType();
    
    /**
     * Gets the "hideLastTrans" attribute
     */
    java.util.List getHideLastTrans();
    
    /**
     * Gets (as xml) the "hideLastTrans" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans xgetHideLastTrans();
    
    /**
     * True if has "hideLastTrans" attribute
     */
    boolean isSetHideLastTrans();
    
    /**
     * Sets the "hideLastTrans" attribute
     */
    void setHideLastTrans(java.util.List hideLastTrans);
    
    /**
     * Sets (as xml) the "hideLastTrans" attribute
     */
    void xsetHideLastTrans(org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans hideLastTrans);
    
    /**
     * Unsets the "hideLastTrans" attribute
     */
    void unsetHideLastTrans();
    
    /**
     * Gets the "st" attribute
     */
    java.util.List getSt();
    
    /**
     * Gets (as xml) the "st" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STInts xgetSt();
    
    /**
     * True if has "st" attribute
     */
    boolean isSetSt();
    
    /**
     * Sets the "st" attribute
     */
    void setSt(java.util.List st);
    
    /**
     * Sets (as xml) the "st" attribute
     */
    void xsetSt(org.openxmlformats.schemas.drawingml.x2006.diagram.STInts st);
    
    /**
     * Unsets the "st" attribute
     */
    void unsetSt();
    
    /**
     * Gets the "cnt" attribute
     */
    java.util.List getCnt();
    
    /**
     * Gets (as xml) the "cnt" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts xgetCnt();
    
    /**
     * True if has "cnt" attribute
     */
    boolean isSetCnt();
    
    /**
     * Sets the "cnt" attribute
     */
    void setCnt(java.util.List cnt);
    
    /**
     * Sets (as xml) the "cnt" attribute
     */
    void xsetCnt(org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts cnt);
    
    /**
     * Unsets the "cnt" attribute
     */
    void unsetCnt();
    
    /**
     * Gets the "step" attribute
     */
    java.util.List getStep();
    
    /**
     * Gets (as xml) the "step" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STInts xgetStep();
    
    /**
     * True if has "step" attribute
     */
    boolean isSetStep();
    
    /**
     * Sets the "step" attribute
     */
    void setStep(java.util.List step);
    
    /**
     * Sets (as xml) the "step" attribute
     */
    void xsetStep(org.openxmlformats.schemas.drawingml.x2006.diagram.STInts step);
    
    /**
     * Unsets the "step" attribute
     */
    void unsetStep();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_Cxn
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_Cxn(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTCxn extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCxn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcxn0662type");
    
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
     * Gets the "modelId" attribute
     */
    java.lang.Object getModelId();
    
    /**
     * Gets (as xml) the "modelId" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetModelId();
    
    /**
     * Sets the "modelId" attribute
     */
    void setModelId(java.lang.Object modelId);
    
    /**
     * Sets (as xml) the "modelId" attribute
     */
    void xsetModelId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId modelId);
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "srcId" attribute
     */
    java.lang.Object getSrcId();
    
    /**
     * Gets (as xml) the "srcId" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetSrcId();
    
    /**
     * Sets the "srcId" attribute
     */
    void setSrcId(java.lang.Object srcId);
    
    /**
     * Sets (as xml) the "srcId" attribute
     */
    void xsetSrcId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId srcId);
    
    /**
     * Gets the "destId" attribute
     */
    java.lang.Object getDestId();
    
    /**
     * Gets (as xml) the "destId" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetDestId();
    
    /**
     * Sets the "destId" attribute
     */
    void setDestId(java.lang.Object destId);
    
    /**
     * Sets (as xml) the "destId" attribute
     */
    void xsetDestId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId destId);
    
    /**
     * Gets the "srcOrd" attribute
     */
    long getSrcOrd();
    
    /**
     * Gets (as xml) the "srcOrd" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSrcOrd();
    
    /**
     * Sets the "srcOrd" attribute
     */
    void setSrcOrd(long srcOrd);
    
    /**
     * Sets (as xml) the "srcOrd" attribute
     */
    void xsetSrcOrd(org.apache.xmlbeans.XmlUnsignedInt srcOrd);
    
    /**
     * Gets the "destOrd" attribute
     */
    long getDestOrd();
    
    /**
     * Gets (as xml) the "destOrd" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDestOrd();
    
    /**
     * Sets the "destOrd" attribute
     */
    void setDestOrd(long destOrd);
    
    /**
     * Sets (as xml) the "destOrd" attribute
     */
    void xsetDestOrd(org.apache.xmlbeans.XmlUnsignedInt destOrd);
    
    /**
     * Gets the "parTransId" attribute
     */
    java.lang.Object getParTransId();
    
    /**
     * Gets (as xml) the "parTransId" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetParTransId();
    
    /**
     * True if has "parTransId" attribute
     */
    boolean isSetParTransId();
    
    /**
     * Sets the "parTransId" attribute
     */
    void setParTransId(java.lang.Object parTransId);
    
    /**
     * Sets (as xml) the "parTransId" attribute
     */
    void xsetParTransId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId parTransId);
    
    /**
     * Unsets the "parTransId" attribute
     */
    void unsetParTransId();
    
    /**
     * Gets the "sibTransId" attribute
     */
    java.lang.Object getSibTransId();
    
    /**
     * Gets (as xml) the "sibTransId" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetSibTransId();
    
    /**
     * True if has "sibTransId" attribute
     */
    boolean isSetSibTransId();
    
    /**
     * Sets the "sibTransId" attribute
     */
    void setSibTransId(java.lang.Object sibTransId);
    
    /**
     * Sets (as xml) the "sibTransId" attribute
     */
    void xsetSibTransId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId sibTransId);
    
    /**
     * Unsets the "sibTransId" attribute
     */
    void unsetSibTransId();
    
    /**
     * Gets the "presId" attribute
     */
    java.lang.String getPresId();
    
    /**
     * Gets (as xml) the "presId" attribute
     */
    org.apache.xmlbeans.XmlString xgetPresId();
    
    /**
     * True if has "presId" attribute
     */
    boolean isSetPresId();
    
    /**
     * Sets the "presId" attribute
     */
    void setPresId(java.lang.String presId);
    
    /**
     * Sets (as xml) the "presId" attribute
     */
    void xsetPresId(org.apache.xmlbeans.XmlString presId);
    
    /**
     * Unsets the "presId" attribute
     */
    void unsetPresId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

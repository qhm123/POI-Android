/*
 * XML Type:  CT_TLBuildDiagram
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLBuildDiagram(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLBuildDiagram extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLBuildDiagram.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlbuilddiagram4048type");
    
    /**
     * Gets the "spid" attribute
     */
    java.lang.String getSpid();
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid();
    
    /**
     * Sets the "spid" attribute
     */
    void setSpid(java.lang.String spid);
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid);
    
    /**
     * Gets the "grpId" attribute
     */
    long getGrpId();
    
    /**
     * Gets (as xml) the "grpId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetGrpId();
    
    /**
     * Sets the "grpId" attribute
     */
    void setGrpId(long grpId);
    
    /**
     * Sets (as xml) the "grpId" attribute
     */
    void xsetGrpId(org.apache.xmlbeans.XmlUnsignedInt grpId);
    
    /**
     * Gets the "uiExpand" attribute
     */
    boolean getUiExpand();
    
    /**
     * Gets (as xml) the "uiExpand" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUiExpand();
    
    /**
     * True if has "uiExpand" attribute
     */
    boolean isSetUiExpand();
    
    /**
     * Sets the "uiExpand" attribute
     */
    void setUiExpand(boolean uiExpand);
    
    /**
     * Sets (as xml) the "uiExpand" attribute
     */
    void xsetUiExpand(org.apache.xmlbeans.XmlBoolean uiExpand);
    
    /**
     * Unsets the "uiExpand" attribute
     */
    void unsetUiExpand();
    
    /**
     * Gets the "bld" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.Enum getBld();
    
    /**
     * Gets (as xml) the "bld" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType xgetBld();
    
    /**
     * True if has "bld" attribute
     */
    boolean isSetBld();
    
    /**
     * Sets the "bld" attribute
     */
    void setBld(org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.Enum bld);
    
    /**
     * Sets (as xml) the "bld" attribute
     */
    void xsetBld(org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType bld);
    
    /**
     * Unsets the "bld" attribute
     */
    void unsetBld();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

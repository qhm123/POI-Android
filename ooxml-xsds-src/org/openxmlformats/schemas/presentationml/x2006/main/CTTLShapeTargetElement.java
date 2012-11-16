/*
 * XML Type:  CT_TLShapeTargetElement
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLShapeTargetElement(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLShapeTargetElement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLShapeTargetElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlshapetargetelement2763type");
    
    /**
     * Gets the "bg" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getBg();
    
    /**
     * True if has "bg" element
     */
    boolean isSetBg();
    
    /**
     * Sets the "bg" element
     */
    void setBg(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty bg);
    
    /**
     * Appends and returns a new empty "bg" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewBg();
    
    /**
     * Unsets the "bg" element
     */
    void unsetBg();
    
    /**
     * Gets the "subSp" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId getSubSp();
    
    /**
     * True if has "subSp" element
     */
    boolean isSetSubSp();
    
    /**
     * Sets the "subSp" element
     */
    void setSubSp(org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId subSp);
    
    /**
     * Appends and returns a new empty "subSp" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId addNewSubSp();
    
    /**
     * Unsets the "subSp" element
     */
    void unsetSubSp();
    
    /**
     * Gets the "oleChartEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement getOleChartEl();
    
    /**
     * True if has "oleChartEl" element
     */
    boolean isSetOleChartEl();
    
    /**
     * Sets the "oleChartEl" element
     */
    void setOleChartEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement oleChartEl);
    
    /**
     * Appends and returns a new empty "oleChartEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement addNewOleChartEl();
    
    /**
     * Unsets the "oleChartEl" element
     */
    void unsetOleChartEl();
    
    /**
     * Gets the "txEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement getTxEl();
    
    /**
     * True if has "txEl" element
     */
    boolean isSetTxEl();
    
    /**
     * Sets the "txEl" element
     */
    void setTxEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement txEl);
    
    /**
     * Appends and returns a new empty "txEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement addNewTxEl();
    
    /**
     * Unsets the "txEl" element
     */
    void unsetTxEl();
    
    /**
     * Gets the "graphicEl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice getGraphicEl();
    
    /**
     * True if has "graphicEl" element
     */
    boolean isSetGraphicEl();
    
    /**
     * Sets the "graphicEl" element
     */
    void setGraphicEl(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice graphicEl);
    
    /**
     * Appends and returns a new empty "graphicEl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice addNewGraphicEl();
    
    /**
     * Unsets the "graphicEl" element
     */
    void unsetGraphicEl();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

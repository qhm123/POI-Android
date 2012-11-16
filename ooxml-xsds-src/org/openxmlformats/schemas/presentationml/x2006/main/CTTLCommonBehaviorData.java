/*
 * XML Type:  CT_TLCommonBehaviorData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLCommonBehaviorData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLCommonBehaviorData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLCommonBehaviorData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlcommonbehaviordata6ca6type");
    
    /**
     * Gets the "cTn" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData getCTn();
    
    /**
     * Sets the "cTn" element
     */
    void setCTn(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData cTn);
    
    /**
     * Appends and returns a new empty "cTn" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData addNewCTn();
    
    /**
     * Gets the "tgtEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement getTgtEl();
    
    /**
     * Sets the "tgtEl" element
     */
    void setTgtEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement tgtEl);
    
    /**
     * Appends and returns a new empty "tgtEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement addNewTgtEl();
    
    /**
     * Gets the "attrNameLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList getAttrNameLst();
    
    /**
     * True if has "attrNameLst" element
     */
    boolean isSetAttrNameLst();
    
    /**
     * Sets the "attrNameLst" element
     */
    void setAttrNameLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList attrNameLst);
    
    /**
     * Appends and returns a new empty "attrNameLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList addNewAttrNameLst();
    
    /**
     * Unsets the "attrNameLst" element
     */
    void unsetAttrNameLst();
    
    /**
     * Gets the "additive" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType.Enum getAdditive();
    
    /**
     * Gets (as xml) the "additive" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType xgetAdditive();
    
    /**
     * True if has "additive" attribute
     */
    boolean isSetAdditive();
    
    /**
     * Sets the "additive" attribute
     */
    void setAdditive(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType.Enum additive);
    
    /**
     * Sets (as xml) the "additive" attribute
     */
    void xsetAdditive(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType additive);
    
    /**
     * Unsets the "additive" attribute
     */
    void unsetAdditive();
    
    /**
     * Gets the "accumulate" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType.Enum getAccumulate();
    
    /**
     * Gets (as xml) the "accumulate" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType xgetAccumulate();
    
    /**
     * True if has "accumulate" attribute
     */
    boolean isSetAccumulate();
    
    /**
     * Sets the "accumulate" attribute
     */
    void setAccumulate(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType.Enum accumulate);
    
    /**
     * Sets (as xml) the "accumulate" attribute
     */
    void xsetAccumulate(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType accumulate);
    
    /**
     * Unsets the "accumulate" attribute
     */
    void unsetAccumulate();
    
    /**
     * Gets the "xfrmType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType.Enum getXfrmType();
    
    /**
     * Gets (as xml) the "xfrmType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType xgetXfrmType();
    
    /**
     * True if has "xfrmType" attribute
     */
    boolean isSetXfrmType();
    
    /**
     * Sets the "xfrmType" attribute
     */
    void setXfrmType(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType.Enum xfrmType);
    
    /**
     * Sets (as xml) the "xfrmType" attribute
     */
    void xsetXfrmType(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType xfrmType);
    
    /**
     * Unsets the "xfrmType" attribute
     */
    void unsetXfrmType();
    
    /**
     * Gets the "from" attribute
     */
    java.lang.String getFrom();
    
    /**
     * Gets (as xml) the "from" attribute
     */
    org.apache.xmlbeans.XmlString xgetFrom();
    
    /**
     * True if has "from" attribute
     */
    boolean isSetFrom();
    
    /**
     * Sets the "from" attribute
     */
    void setFrom(java.lang.String from);
    
    /**
     * Sets (as xml) the "from" attribute
     */
    void xsetFrom(org.apache.xmlbeans.XmlString from);
    
    /**
     * Unsets the "from" attribute
     */
    void unsetFrom();
    
    /**
     * Gets the "to" attribute
     */
    java.lang.String getTo();
    
    /**
     * Gets (as xml) the "to" attribute
     */
    org.apache.xmlbeans.XmlString xgetTo();
    
    /**
     * True if has "to" attribute
     */
    boolean isSetTo();
    
    /**
     * Sets the "to" attribute
     */
    void setTo(java.lang.String to);
    
    /**
     * Sets (as xml) the "to" attribute
     */
    void xsetTo(org.apache.xmlbeans.XmlString to);
    
    /**
     * Unsets the "to" attribute
     */
    void unsetTo();
    
    /**
     * Gets the "by" attribute
     */
    java.lang.String getBy();
    
    /**
     * Gets (as xml) the "by" attribute
     */
    org.apache.xmlbeans.XmlString xgetBy();
    
    /**
     * True if has "by" attribute
     */
    boolean isSetBy();
    
    /**
     * Sets the "by" attribute
     */
    void setBy(java.lang.String by);
    
    /**
     * Sets (as xml) the "by" attribute
     */
    void xsetBy(org.apache.xmlbeans.XmlString by);
    
    /**
     * Unsets the "by" attribute
     */
    void unsetBy();
    
    /**
     * Gets the "rctx" attribute
     */
    java.lang.String getRctx();
    
    /**
     * Gets (as xml) the "rctx" attribute
     */
    org.apache.xmlbeans.XmlString xgetRctx();
    
    /**
     * True if has "rctx" attribute
     */
    boolean isSetRctx();
    
    /**
     * Sets the "rctx" attribute
     */
    void setRctx(java.lang.String rctx);
    
    /**
     * Sets (as xml) the "rctx" attribute
     */
    void xsetRctx(org.apache.xmlbeans.XmlString rctx);
    
    /**
     * Unsets the "rctx" attribute
     */
    void unsetRctx();
    
    /**
     * Gets the "override" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType.Enum getOverride();
    
    /**
     * Gets (as xml) the "override" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType xgetOverride();
    
    /**
     * True if has "override" attribute
     */
    boolean isSetOverride();
    
    /**
     * Sets the "override" attribute
     */
    void setOverride(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType.Enum override);
    
    /**
     * Sets (as xml) the "override" attribute
     */
    void xsetOverride(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType override);
    
    /**
     * Unsets the "override" attribute
     */
    void unsetOverride();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

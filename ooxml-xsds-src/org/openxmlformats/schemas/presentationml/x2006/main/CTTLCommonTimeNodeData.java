/*
 * XML Type:  CT_TLCommonTimeNodeData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLCommonTimeNodeData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLCommonTimeNodeData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLCommonTimeNodeData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlcommontimenodedatac8e9type");
    
    /**
     * Gets the "stCondLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList getStCondLst();
    
    /**
     * True if has "stCondLst" element
     */
    boolean isSetStCondLst();
    
    /**
     * Sets the "stCondLst" element
     */
    void setStCondLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList stCondLst);
    
    /**
     * Appends and returns a new empty "stCondLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList addNewStCondLst();
    
    /**
     * Unsets the "stCondLst" element
     */
    void unsetStCondLst();
    
    /**
     * Gets the "endCondLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList getEndCondLst();
    
    /**
     * True if has "endCondLst" element
     */
    boolean isSetEndCondLst();
    
    /**
     * Sets the "endCondLst" element
     */
    void setEndCondLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList endCondLst);
    
    /**
     * Appends and returns a new empty "endCondLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList addNewEndCondLst();
    
    /**
     * Unsets the "endCondLst" element
     */
    void unsetEndCondLst();
    
    /**
     * Gets the "endSync" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition getEndSync();
    
    /**
     * True if has "endSync" element
     */
    boolean isSetEndSync();
    
    /**
     * Sets the "endSync" element
     */
    void setEndSync(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition endSync);
    
    /**
     * Appends and returns a new empty "endSync" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition addNewEndSync();
    
    /**
     * Unsets the "endSync" element
     */
    void unsetEndSync();
    
    /**
     * Gets the "iterate" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData getIterate();
    
    /**
     * True if has "iterate" element
     */
    boolean isSetIterate();
    
    /**
     * Sets the "iterate" element
     */
    void setIterate(org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData iterate);
    
    /**
     * Appends and returns a new empty "iterate" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData addNewIterate();
    
    /**
     * Unsets the "iterate" element
     */
    void unsetIterate();
    
    /**
     * Gets the "childTnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getChildTnLst();
    
    /**
     * True if has "childTnLst" element
     */
    boolean isSetChildTnLst();
    
    /**
     * Sets the "childTnLst" element
     */
    void setChildTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList childTnLst);
    
    /**
     * Appends and returns a new empty "childTnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewChildTnLst();
    
    /**
     * Unsets the "childTnLst" element
     */
    void unsetChildTnLst();
    
    /**
     * Gets the "subTnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getSubTnLst();
    
    /**
     * True if has "subTnLst" element
     */
    boolean isSetSubTnLst();
    
    /**
     * Sets the "subTnLst" element
     */
    void setSubTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList subTnLst);
    
    /**
     * Appends and returns a new empty "subTnLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewSubTnLst();
    
    /**
     * Unsets the "subTnLst" element
     */
    void unsetSubTnLst();
    
    /**
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "presetID" attribute
     */
    int getPresetID();
    
    /**
     * Gets (as xml) the "presetID" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPresetID();
    
    /**
     * True if has "presetID" attribute
     */
    boolean isSetPresetID();
    
    /**
     * Sets the "presetID" attribute
     */
    void setPresetID(int presetID);
    
    /**
     * Sets (as xml) the "presetID" attribute
     */
    void xsetPresetID(org.apache.xmlbeans.XmlInt presetID);
    
    /**
     * Unsets the "presetID" attribute
     */
    void unsetPresetID();
    
    /**
     * Gets the "presetClass" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType.Enum getPresetClass();
    
    /**
     * Gets (as xml) the "presetClass" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType xgetPresetClass();
    
    /**
     * True if has "presetClass" attribute
     */
    boolean isSetPresetClass();
    
    /**
     * Sets the "presetClass" attribute
     */
    void setPresetClass(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType.Enum presetClass);
    
    /**
     * Sets (as xml) the "presetClass" attribute
     */
    void xsetPresetClass(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType presetClass);
    
    /**
     * Unsets the "presetClass" attribute
     */
    void unsetPresetClass();
    
    /**
     * Gets the "presetSubtype" attribute
     */
    int getPresetSubtype();
    
    /**
     * Gets (as xml) the "presetSubtype" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPresetSubtype();
    
    /**
     * True if has "presetSubtype" attribute
     */
    boolean isSetPresetSubtype();
    
    /**
     * Sets the "presetSubtype" attribute
     */
    void setPresetSubtype(int presetSubtype);
    
    /**
     * Sets (as xml) the "presetSubtype" attribute
     */
    void xsetPresetSubtype(org.apache.xmlbeans.XmlInt presetSubtype);
    
    /**
     * Unsets the "presetSubtype" attribute
     */
    void unsetPresetSubtype();
    
    /**
     * Gets the "dur" attribute
     */
    java.lang.Object getDur();
    
    /**
     * Gets (as xml) the "dur" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetDur();
    
    /**
     * True if has "dur" attribute
     */
    boolean isSetDur();
    
    /**
     * Sets the "dur" attribute
     */
    void setDur(java.lang.Object dur);
    
    /**
     * Sets (as xml) the "dur" attribute
     */
    void xsetDur(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime dur);
    
    /**
     * Unsets the "dur" attribute
     */
    void unsetDur();
    
    /**
     * Gets the "repeatCount" attribute
     */
    java.lang.Object getRepeatCount();
    
    /**
     * Gets (as xml) the "repeatCount" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetRepeatCount();
    
    /**
     * True if has "repeatCount" attribute
     */
    boolean isSetRepeatCount();
    
    /**
     * Sets the "repeatCount" attribute
     */
    void setRepeatCount(java.lang.Object repeatCount);
    
    /**
     * Sets (as xml) the "repeatCount" attribute
     */
    void xsetRepeatCount(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime repeatCount);
    
    /**
     * Unsets the "repeatCount" attribute
     */
    void unsetRepeatCount();
    
    /**
     * Gets the "repeatDur" attribute
     */
    java.lang.Object getRepeatDur();
    
    /**
     * Gets (as xml) the "repeatDur" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetRepeatDur();
    
    /**
     * True if has "repeatDur" attribute
     */
    boolean isSetRepeatDur();
    
    /**
     * Sets the "repeatDur" attribute
     */
    void setRepeatDur(java.lang.Object repeatDur);
    
    /**
     * Sets (as xml) the "repeatDur" attribute
     */
    void xsetRepeatDur(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime repeatDur);
    
    /**
     * Unsets the "repeatDur" attribute
     */
    void unsetRepeatDur();
    
    /**
     * Gets the "spd" attribute
     */
    int getSpd();
    
    /**
     * Gets (as xml) the "spd" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSpd();
    
    /**
     * True if has "spd" attribute
     */
    boolean isSetSpd();
    
    /**
     * Sets the "spd" attribute
     */
    void setSpd(int spd);
    
    /**
     * Sets (as xml) the "spd" attribute
     */
    void xsetSpd(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage spd);
    
    /**
     * Unsets the "spd" attribute
     */
    void unsetSpd();
    
    /**
     * Gets the "accel" attribute
     */
    int getAccel();
    
    /**
     * Gets (as xml) the "accel" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetAccel();
    
    /**
     * True if has "accel" attribute
     */
    boolean isSetAccel();
    
    /**
     * Sets the "accel" attribute
     */
    void setAccel(int accel);
    
    /**
     * Sets (as xml) the "accel" attribute
     */
    void xsetAccel(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage accel);
    
    /**
     * Unsets the "accel" attribute
     */
    void unsetAccel();
    
    /**
     * Gets the "decel" attribute
     */
    int getDecel();
    
    /**
     * Gets (as xml) the "decel" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetDecel();
    
    /**
     * True if has "decel" attribute
     */
    boolean isSetDecel();
    
    /**
     * Sets the "decel" attribute
     */
    void setDecel(int decel);
    
    /**
     * Sets (as xml) the "decel" attribute
     */
    void xsetDecel(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage decel);
    
    /**
     * Unsets the "decel" attribute
     */
    void unsetDecel();
    
    /**
     * Gets the "autoRev" attribute
     */
    boolean getAutoRev();
    
    /**
     * Gets (as xml) the "autoRev" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoRev();
    
    /**
     * True if has "autoRev" attribute
     */
    boolean isSetAutoRev();
    
    /**
     * Sets the "autoRev" attribute
     */
    void setAutoRev(boolean autoRev);
    
    /**
     * Sets (as xml) the "autoRev" attribute
     */
    void xsetAutoRev(org.apache.xmlbeans.XmlBoolean autoRev);
    
    /**
     * Unsets the "autoRev" attribute
     */
    void unsetAutoRev();
    
    /**
     * Gets the "restart" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType.Enum getRestart();
    
    /**
     * Gets (as xml) the "restart" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType xgetRestart();
    
    /**
     * True if has "restart" attribute
     */
    boolean isSetRestart();
    
    /**
     * Sets the "restart" attribute
     */
    void setRestart(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType.Enum restart);
    
    /**
     * Sets (as xml) the "restart" attribute
     */
    void xsetRestart(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType restart);
    
    /**
     * Unsets the "restart" attribute
     */
    void unsetRestart();
    
    /**
     * Gets the "fill" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType.Enum getFill();
    
    /**
     * Gets (as xml) the "fill" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType xgetFill();
    
    /**
     * True if has "fill" attribute
     */
    boolean isSetFill();
    
    /**
     * Sets the "fill" attribute
     */
    void setFill(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType.Enum fill);
    
    /**
     * Sets (as xml) the "fill" attribute
     */
    void xsetFill(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType fill);
    
    /**
     * Unsets the "fill" attribute
     */
    void unsetFill();
    
    /**
     * Gets the "syncBehavior" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType.Enum getSyncBehavior();
    
    /**
     * Gets (as xml) the "syncBehavior" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType xgetSyncBehavior();
    
    /**
     * True if has "syncBehavior" attribute
     */
    boolean isSetSyncBehavior();
    
    /**
     * Sets the "syncBehavior" attribute
     */
    void setSyncBehavior(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType.Enum syncBehavior);
    
    /**
     * Sets (as xml) the "syncBehavior" attribute
     */
    void xsetSyncBehavior(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType syncBehavior);
    
    /**
     * Unsets the "syncBehavior" attribute
     */
    void unsetSyncBehavior();
    
    /**
     * Gets the "tmFilter" attribute
     */
    java.lang.String getTmFilter();
    
    /**
     * Gets (as xml) the "tmFilter" attribute
     */
    org.apache.xmlbeans.XmlString xgetTmFilter();
    
    /**
     * True if has "tmFilter" attribute
     */
    boolean isSetTmFilter();
    
    /**
     * Sets the "tmFilter" attribute
     */
    void setTmFilter(java.lang.String tmFilter);
    
    /**
     * Sets (as xml) the "tmFilter" attribute
     */
    void xsetTmFilter(org.apache.xmlbeans.XmlString tmFilter);
    
    /**
     * Unsets the "tmFilter" attribute
     */
    void unsetTmFilter();
    
    /**
     * Gets the "evtFilter" attribute
     */
    java.lang.String getEvtFilter();
    
    /**
     * Gets (as xml) the "evtFilter" attribute
     */
    org.apache.xmlbeans.XmlString xgetEvtFilter();
    
    /**
     * True if has "evtFilter" attribute
     */
    boolean isSetEvtFilter();
    
    /**
     * Sets the "evtFilter" attribute
     */
    void setEvtFilter(java.lang.String evtFilter);
    
    /**
     * Sets (as xml) the "evtFilter" attribute
     */
    void xsetEvtFilter(org.apache.xmlbeans.XmlString evtFilter);
    
    /**
     * Unsets the "evtFilter" attribute
     */
    void unsetEvtFilter();
    
    /**
     * Gets the "display" attribute
     */
    boolean getDisplay();
    
    /**
     * Gets (as xml) the "display" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDisplay();
    
    /**
     * True if has "display" attribute
     */
    boolean isSetDisplay();
    
    /**
     * Sets the "display" attribute
     */
    void setDisplay(boolean display);
    
    /**
     * Sets (as xml) the "display" attribute
     */
    void xsetDisplay(org.apache.xmlbeans.XmlBoolean display);
    
    /**
     * Unsets the "display" attribute
     */
    void unsetDisplay();
    
    /**
     * Gets the "masterRel" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation.Enum getMasterRel();
    
    /**
     * Gets (as xml) the "masterRel" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation xgetMasterRel();
    
    /**
     * True if has "masterRel" attribute
     */
    boolean isSetMasterRel();
    
    /**
     * Sets the "masterRel" attribute
     */
    void setMasterRel(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation.Enum masterRel);
    
    /**
     * Sets (as xml) the "masterRel" attribute
     */
    void xsetMasterRel(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation masterRel);
    
    /**
     * Unsets the "masterRel" attribute
     */
    void unsetMasterRel();
    
    /**
     * Gets the "bldLvl" attribute
     */
    int getBldLvl();
    
    /**
     * Gets (as xml) the "bldLvl" attribute
     */
    org.apache.xmlbeans.XmlInt xgetBldLvl();
    
    /**
     * True if has "bldLvl" attribute
     */
    boolean isSetBldLvl();
    
    /**
     * Sets the "bldLvl" attribute
     */
    void setBldLvl(int bldLvl);
    
    /**
     * Sets (as xml) the "bldLvl" attribute
     */
    void xsetBldLvl(org.apache.xmlbeans.XmlInt bldLvl);
    
    /**
     * Unsets the "bldLvl" attribute
     */
    void unsetBldLvl();
    
    /**
     * Gets the "grpId" attribute
     */
    long getGrpId();
    
    /**
     * Gets (as xml) the "grpId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetGrpId();
    
    /**
     * True if has "grpId" attribute
     */
    boolean isSetGrpId();
    
    /**
     * Sets the "grpId" attribute
     */
    void setGrpId(long grpId);
    
    /**
     * Sets (as xml) the "grpId" attribute
     */
    void xsetGrpId(org.apache.xmlbeans.XmlUnsignedInt grpId);
    
    /**
     * Unsets the "grpId" attribute
     */
    void unsetGrpId();
    
    /**
     * Gets the "afterEffect" attribute
     */
    boolean getAfterEffect();
    
    /**
     * Gets (as xml) the "afterEffect" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAfterEffect();
    
    /**
     * True if has "afterEffect" attribute
     */
    boolean isSetAfterEffect();
    
    /**
     * Sets the "afterEffect" attribute
     */
    void setAfterEffect(boolean afterEffect);
    
    /**
     * Sets (as xml) the "afterEffect" attribute
     */
    void xsetAfterEffect(org.apache.xmlbeans.XmlBoolean afterEffect);
    
    /**
     * Unsets the "afterEffect" attribute
     */
    void unsetAfterEffect();
    
    /**
     * Gets the "nodeType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.Enum getNodeType();
    
    /**
     * Gets (as xml) the "nodeType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType xgetNodeType();
    
    /**
     * True if has "nodeType" attribute
     */
    boolean isSetNodeType();
    
    /**
     * Sets the "nodeType" attribute
     */
    void setNodeType(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.Enum nodeType);
    
    /**
     * Sets (as xml) the "nodeType" attribute
     */
    void xsetNodeType(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType nodeType);
    
    /**
     * Unsets the "nodeType" attribute
     */
    void unsetNodeType();
    
    /**
     * Gets the "nodePh" attribute
     */
    boolean getNodePh();
    
    /**
     * Gets (as xml) the "nodePh" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNodePh();
    
    /**
     * True if has "nodePh" attribute
     */
    boolean isSetNodePh();
    
    /**
     * Sets the "nodePh" attribute
     */
    void setNodePh(boolean nodePh);
    
    /**
     * Sets (as xml) the "nodePh" attribute
     */
    void xsetNodePh(org.apache.xmlbeans.XmlBoolean nodePh);
    
    /**
     * Unsets the "nodePh" attribute
     */
    void unsetNodePh();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

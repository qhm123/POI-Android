/*
 * XML Type:  CT_TLAnimateBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLAnimateBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLAnimateBehavior extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLAnimateBehavior.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlanimatebehavior3cd4type");
    
    /**
     * Gets the "cBhvr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData getCBhvr();
    
    /**
     * Sets the "cBhvr" element
     */
    void setCBhvr(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData cBhvr);
    
    /**
     * Appends and returns a new empty "cBhvr" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData addNewCBhvr();
    
    /**
     * Gets the "tavLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList getTavLst();
    
    /**
     * True if has "tavLst" element
     */
    boolean isSetTavLst();
    
    /**
     * Sets the "tavLst" element
     */
    void setTavLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList tavLst);
    
    /**
     * Appends and returns a new empty "tavLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList addNewTavLst();
    
    /**
     * Unsets the "tavLst" element
     */
    void unsetTavLst();
    
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
     * Gets the "calcmode" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode.Enum getCalcmode();
    
    /**
     * Gets (as xml) the "calcmode" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode xgetCalcmode();
    
    /**
     * True if has "calcmode" attribute
     */
    boolean isSetCalcmode();
    
    /**
     * Sets the "calcmode" attribute
     */
    void setCalcmode(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode.Enum calcmode);
    
    /**
     * Sets (as xml) the "calcmode" attribute
     */
    void xsetCalcmode(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode calcmode);
    
    /**
     * Unsets the "calcmode" attribute
     */
    void unsetCalcmode();
    
    /**
     * Gets the "valueType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType.Enum getValueType();
    
    /**
     * Gets (as xml) the "valueType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType xgetValueType();
    
    /**
     * True if has "valueType" attribute
     */
    boolean isSetValueType();
    
    /**
     * Sets the "valueType" attribute
     */
    void setValueType(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType.Enum valueType);
    
    /**
     * Sets (as xml) the "valueType" attribute
     */
    void xsetValueType(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType valueType);
    
    /**
     * Unsets the "valueType" attribute
     */
    void unsetValueType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

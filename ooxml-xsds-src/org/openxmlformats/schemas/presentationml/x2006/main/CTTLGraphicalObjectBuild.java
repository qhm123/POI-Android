/*
 * XML Type:  CT_TLGraphicalObjectBuild
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLGraphicalObjectBuild(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLGraphicalObjectBuild extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLGraphicalObjectBuild.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlgraphicalobjectbuild9a11type");
    
    /**
     * Gets the "bldAsOne" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getBldAsOne();
    
    /**
     * True if has "bldAsOne" element
     */
    boolean isSetBldAsOne();
    
    /**
     * Sets the "bldAsOne" element
     */
    void setBldAsOne(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty bldAsOne);
    
    /**
     * Appends and returns a new empty "bldAsOne" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewBldAsOne();
    
    /**
     * Unsets the "bldAsOne" element
     */
    void unsetBldAsOne();
    
    /**
     * Gets the "bldSub" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties getBldSub();
    
    /**
     * True if has "bldSub" element
     */
    boolean isSetBldSub();
    
    /**
     * Sets the "bldSub" element
     */
    void setBldSub(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties bldSub);
    
    /**
     * Appends and returns a new empty "bldSub" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties addNewBldSub();
    
    /**
     * Unsets the "bldSub" element
     */
    void unsetBldSub();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

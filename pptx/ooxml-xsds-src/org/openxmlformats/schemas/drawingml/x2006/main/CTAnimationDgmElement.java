/*
 * XML Type:  CT_AnimationDgmElement
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_AnimationDgmElement(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAnimationDgmElement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAnimationDgmElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctanimationdgmelemente027type");
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STGuid xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.drawingml.x2006.main.STGuid id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "bldStep" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep.Enum getBldStep();
    
    /**
     * Gets (as xml) the "bldStep" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep xgetBldStep();
    
    /**
     * True if has "bldStep" attribute
     */
    boolean isSetBldStep();
    
    /**
     * Sets the "bldStep" attribute
     */
    void setBldStep(org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep.Enum bldStep);
    
    /**
     * Sets (as xml) the "bldStep" attribute
     */
    void xsetBldStep(org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep bldStep);
    
    /**
     * Unsets the "bldStep" attribute
     */
    void unsetBldStep();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

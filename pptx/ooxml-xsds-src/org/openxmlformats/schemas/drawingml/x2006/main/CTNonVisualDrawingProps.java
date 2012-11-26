/*
 * XML Type:  CT_NonVisualDrawingProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_NonVisualDrawingProps(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNonVisualDrawingProps extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNonVisualDrawingProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnonvisualdrawingprops8fb0type");
    
    /**
     * Gets the "hlinkClick" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink getHlinkClick();
    
    /**
     * True if has "hlinkClick" element
     */
    boolean isSetHlinkClick();
    
    /**
     * Sets the "hlinkClick" element
     */
    void setHlinkClick(org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink hlinkClick);
    
    /**
     * Appends and returns a new empty "hlinkClick" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink addNewHlinkClick();
    
    /**
     * Unsets the "hlinkClick" element
     */
    void unsetHlinkClick();
    
    /**
     * Gets the "hlinkHover" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink getHlinkHover();
    
    /**
     * True if has "hlinkHover" element
     */
    boolean isSetHlinkHover();
    
    /**
     * Sets the "hlinkHover" element
     */
    void setHlinkHover(org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink hlinkHover);
    
    /**
     * Appends and returns a new empty "hlinkHover" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink addNewHlinkHover();
    
    /**
     * Unsets the "hlinkHover" element
     */
    void unsetHlinkHover();
    
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
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId id);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "descr" attribute
     */
    java.lang.String getDescr();
    
    /**
     * Gets (as xml) the "descr" attribute
     */
    org.apache.xmlbeans.XmlString xgetDescr();
    
    /**
     * True if has "descr" attribute
     */
    boolean isSetDescr();
    
    /**
     * Sets the "descr" attribute
     */
    void setDescr(java.lang.String descr);
    
    /**
     * Sets (as xml) the "descr" attribute
     */
    void xsetDescr(org.apache.xmlbeans.XmlString descr);
    
    /**
     * Unsets the "descr" attribute
     */
    void unsetDescr();
    
    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHidden();
    
    /**
     * True if has "hidden" attribute
     */
    boolean isSetHidden();
    
    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden);
    
    /**
     * Unsets the "hidden" attribute
     */
    void unsetHidden();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

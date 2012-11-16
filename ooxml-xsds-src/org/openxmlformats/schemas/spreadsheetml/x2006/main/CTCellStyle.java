/*
 * XML Type:  CT_CellStyle
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CellStyle(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellStyle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCellStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcellstyle584etype");
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "xfId" attribute
     */
    long getXfId();
    
    /**
     * Gets (as xml) the "xfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId xgetXfId();
    
    /**
     * Sets the "xfId" attribute
     */
    void setXfId(long xfId);
    
    /**
     * Sets (as xml) the "xfId" attribute
     */
    void xsetXfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId xfId);
    
    /**
     * Gets the "builtinId" attribute
     */
    long getBuiltinId();
    
    /**
     * Gets (as xml) the "builtinId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetBuiltinId();
    
    /**
     * True if has "builtinId" attribute
     */
    boolean isSetBuiltinId();
    
    /**
     * Sets the "builtinId" attribute
     */
    void setBuiltinId(long builtinId);
    
    /**
     * Sets (as xml) the "builtinId" attribute
     */
    void xsetBuiltinId(org.apache.xmlbeans.XmlUnsignedInt builtinId);
    
    /**
     * Unsets the "builtinId" attribute
     */
    void unsetBuiltinId();
    
    /**
     * Gets the "iLevel" attribute
     */
    long getILevel();
    
    /**
     * Gets (as xml) the "iLevel" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetILevel();
    
    /**
     * True if has "iLevel" attribute
     */
    boolean isSetILevel();
    
    /**
     * Sets the "iLevel" attribute
     */
    void setILevel(long iLevel);
    
    /**
     * Sets (as xml) the "iLevel" attribute
     */
    void xsetILevel(org.apache.xmlbeans.XmlUnsignedInt iLevel);
    
    /**
     * Unsets the "iLevel" attribute
     */
    void unsetILevel();
    
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
     * Gets the "customBuiltin" attribute
     */
    boolean getCustomBuiltin();
    
    /**
     * Gets (as xml) the "customBuiltin" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCustomBuiltin();
    
    /**
     * True if has "customBuiltin" attribute
     */
    boolean isSetCustomBuiltin();
    
    /**
     * Sets the "customBuiltin" attribute
     */
    void setCustomBuiltin(boolean customBuiltin);
    
    /**
     * Sets (as xml) the "customBuiltin" attribute
     */
    void xsetCustomBuiltin(org.apache.xmlbeans.XmlBoolean customBuiltin);
    
    /**
     * Unsets the "customBuiltin" attribute
     */
    void unsetCustomBuiltin();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

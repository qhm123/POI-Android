/*
 * XML Type:  CT_RevisionFormatting
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionFormatting(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionFormatting extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionFormatting.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisionformattingb229type");
    
    /**
     * Gets the "dxf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf getDxf();
    
    /**
     * True if has "dxf" element
     */
    boolean isSetDxf();
    
    /**
     * Sets the "dxf" element
     */
    void setDxf(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf dxf);
    
    /**
     * Appends and returns a new empty "dxf" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf addNewDxf();
    
    /**
     * Unsets the "dxf" element
     */
    void unsetDxf();
    
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
     * Gets the "sheetId" attribute
     */
    long getSheetId();
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSheetId();
    
    /**
     * Sets the "sheetId" attribute
     */
    void setSheetId(long sheetId);
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId);
    
    /**
     * Gets the "xfDxf" attribute
     */
    boolean getXfDxf();
    
    /**
     * Gets (as xml) the "xfDxf" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetXfDxf();
    
    /**
     * True if has "xfDxf" attribute
     */
    boolean isSetXfDxf();
    
    /**
     * Sets the "xfDxf" attribute
     */
    void setXfDxf(boolean xfDxf);
    
    /**
     * Sets (as xml) the "xfDxf" attribute
     */
    void xsetXfDxf(org.apache.xmlbeans.XmlBoolean xfDxf);
    
    /**
     * Unsets the "xfDxf" attribute
     */
    void unsetXfDxf();
    
    /**
     * Gets the "s" attribute
     */
    boolean getS();
    
    /**
     * Gets (as xml) the "s" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetS();
    
    /**
     * True if has "s" attribute
     */
    boolean isSetS();
    
    /**
     * Sets the "s" attribute
     */
    void setS(boolean s);
    
    /**
     * Sets (as xml) the "s" attribute
     */
    void xsetS(org.apache.xmlbeans.XmlBoolean s);
    
    /**
     * Unsets the "s" attribute
     */
    void unsetS();
    
    /**
     * Gets the "sqref" attribute
     */
    java.util.List getSqref();
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref();
    
    /**
     * Sets the "sqref" attribute
     */
    void setSqref(java.util.List sqref);
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref);
    
    /**
     * Gets the "start" attribute
     */
    long getStart();
    
    /**
     * Gets (as xml) the "start" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetStart();
    
    /**
     * True if has "start" attribute
     */
    boolean isSetStart();
    
    /**
     * Sets the "start" attribute
     */
    void setStart(long start);
    
    /**
     * Sets (as xml) the "start" attribute
     */
    void xsetStart(org.apache.xmlbeans.XmlUnsignedInt start);
    
    /**
     * Unsets the "start" attribute
     */
    void unsetStart();
    
    /**
     * Gets the "length" attribute
     */
    long getLength();
    
    /**
     * Gets (as xml) the "length" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetLength();
    
    /**
     * True if has "length" attribute
     */
    boolean isSetLength();
    
    /**
     * Sets the "length" attribute
     */
    void setLength(long length);
    
    /**
     * Sets (as xml) the "length" attribute
     */
    void xsetLength(org.apache.xmlbeans.XmlUnsignedInt length);
    
    /**
     * Unsets the "length" attribute
     */
    void unsetLength();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_Xf
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Xf(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTXf extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTXf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctxf97f7type");
    
    /**
     * Gets the "alignment" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment getAlignment();
    
    /**
     * True if has "alignment" element
     */
    boolean isSetAlignment();
    
    /**
     * Sets the "alignment" element
     */
    void setAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment alignment);
    
    /**
     * Appends and returns a new empty "alignment" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment addNewAlignment();
    
    /**
     * Unsets the "alignment" element
     */
    void unsetAlignment();
    
    /**
     * Gets the "protection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection getProtection();
    
    /**
     * True if has "protection" element
     */
    boolean isSetProtection();
    
    /**
     * Sets the "protection" element
     */
    void setProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection protection);
    
    /**
     * Appends and returns a new empty "protection" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection addNewProtection();
    
    /**
     * Unsets the "protection" element
     */
    void unsetProtection();
    
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
     * Gets the "numFmtId" attribute
     */
    long getNumFmtId();
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId();
    
    /**
     * True if has "numFmtId" attribute
     */
    boolean isSetNumFmtId();
    
    /**
     * Sets the "numFmtId" attribute
     */
    void setNumFmtId(long numFmtId);
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId);
    
    /**
     * Unsets the "numFmtId" attribute
     */
    void unsetNumFmtId();
    
    /**
     * Gets the "fontId" attribute
     */
    long getFontId();
    
    /**
     * Gets (as xml) the "fontId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId xgetFontId();
    
    /**
     * True if has "fontId" attribute
     */
    boolean isSetFontId();
    
    /**
     * Sets the "fontId" attribute
     */
    void setFontId(long fontId);
    
    /**
     * Sets (as xml) the "fontId" attribute
     */
    void xsetFontId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId fontId);
    
    /**
     * Unsets the "fontId" attribute
     */
    void unsetFontId();
    
    /**
     * Gets the "fillId" attribute
     */
    long getFillId();
    
    /**
     * Gets (as xml) the "fillId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId xgetFillId();
    
    /**
     * True if has "fillId" attribute
     */
    boolean isSetFillId();
    
    /**
     * Sets the "fillId" attribute
     */
    void setFillId(long fillId);
    
    /**
     * Sets (as xml) the "fillId" attribute
     */
    void xsetFillId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId fillId);
    
    /**
     * Unsets the "fillId" attribute
     */
    void unsetFillId();
    
    /**
     * Gets the "borderId" attribute
     */
    long getBorderId();
    
    /**
     * Gets (as xml) the "borderId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId xgetBorderId();
    
    /**
     * True if has "borderId" attribute
     */
    boolean isSetBorderId();
    
    /**
     * Sets the "borderId" attribute
     */
    void setBorderId(long borderId);
    
    /**
     * Sets (as xml) the "borderId" attribute
     */
    void xsetBorderId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId borderId);
    
    /**
     * Unsets the "borderId" attribute
     */
    void unsetBorderId();
    
    /**
     * Gets the "xfId" attribute
     */
    long getXfId();
    
    /**
     * Gets (as xml) the "xfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId xgetXfId();
    
    /**
     * True if has "xfId" attribute
     */
    boolean isSetXfId();
    
    /**
     * Sets the "xfId" attribute
     */
    void setXfId(long xfId);
    
    /**
     * Sets (as xml) the "xfId" attribute
     */
    void xsetXfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId xfId);
    
    /**
     * Unsets the "xfId" attribute
     */
    void unsetXfId();
    
    /**
     * Gets the "quotePrefix" attribute
     */
    boolean getQuotePrefix();
    
    /**
     * Gets (as xml) the "quotePrefix" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetQuotePrefix();
    
    /**
     * True if has "quotePrefix" attribute
     */
    boolean isSetQuotePrefix();
    
    /**
     * Sets the "quotePrefix" attribute
     */
    void setQuotePrefix(boolean quotePrefix);
    
    /**
     * Sets (as xml) the "quotePrefix" attribute
     */
    void xsetQuotePrefix(org.apache.xmlbeans.XmlBoolean quotePrefix);
    
    /**
     * Unsets the "quotePrefix" attribute
     */
    void unsetQuotePrefix();
    
    /**
     * Gets the "pivotButton" attribute
     */
    boolean getPivotButton();
    
    /**
     * Gets (as xml) the "pivotButton" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPivotButton();
    
    /**
     * True if has "pivotButton" attribute
     */
    boolean isSetPivotButton();
    
    /**
     * Sets the "pivotButton" attribute
     */
    void setPivotButton(boolean pivotButton);
    
    /**
     * Sets (as xml) the "pivotButton" attribute
     */
    void xsetPivotButton(org.apache.xmlbeans.XmlBoolean pivotButton);
    
    /**
     * Unsets the "pivotButton" attribute
     */
    void unsetPivotButton();
    
    /**
     * Gets the "applyNumberFormat" attribute
     */
    boolean getApplyNumberFormat();
    
    /**
     * Gets (as xml) the "applyNumberFormat" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyNumberFormat();
    
    /**
     * True if has "applyNumberFormat" attribute
     */
    boolean isSetApplyNumberFormat();
    
    /**
     * Sets the "applyNumberFormat" attribute
     */
    void setApplyNumberFormat(boolean applyNumberFormat);
    
    /**
     * Sets (as xml) the "applyNumberFormat" attribute
     */
    void xsetApplyNumberFormat(org.apache.xmlbeans.XmlBoolean applyNumberFormat);
    
    /**
     * Unsets the "applyNumberFormat" attribute
     */
    void unsetApplyNumberFormat();
    
    /**
     * Gets the "applyFont" attribute
     */
    boolean getApplyFont();
    
    /**
     * Gets (as xml) the "applyFont" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyFont();
    
    /**
     * True if has "applyFont" attribute
     */
    boolean isSetApplyFont();
    
    /**
     * Sets the "applyFont" attribute
     */
    void setApplyFont(boolean applyFont);
    
    /**
     * Sets (as xml) the "applyFont" attribute
     */
    void xsetApplyFont(org.apache.xmlbeans.XmlBoolean applyFont);
    
    /**
     * Unsets the "applyFont" attribute
     */
    void unsetApplyFont();
    
    /**
     * Gets the "applyFill" attribute
     */
    boolean getApplyFill();
    
    /**
     * Gets (as xml) the "applyFill" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyFill();
    
    /**
     * True if has "applyFill" attribute
     */
    boolean isSetApplyFill();
    
    /**
     * Sets the "applyFill" attribute
     */
    void setApplyFill(boolean applyFill);
    
    /**
     * Sets (as xml) the "applyFill" attribute
     */
    void xsetApplyFill(org.apache.xmlbeans.XmlBoolean applyFill);
    
    /**
     * Unsets the "applyFill" attribute
     */
    void unsetApplyFill();
    
    /**
     * Gets the "applyBorder" attribute
     */
    boolean getApplyBorder();
    
    /**
     * Gets (as xml) the "applyBorder" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyBorder();
    
    /**
     * True if has "applyBorder" attribute
     */
    boolean isSetApplyBorder();
    
    /**
     * Sets the "applyBorder" attribute
     */
    void setApplyBorder(boolean applyBorder);
    
    /**
     * Sets (as xml) the "applyBorder" attribute
     */
    void xsetApplyBorder(org.apache.xmlbeans.XmlBoolean applyBorder);
    
    /**
     * Unsets the "applyBorder" attribute
     */
    void unsetApplyBorder();
    
    /**
     * Gets the "applyAlignment" attribute
     */
    boolean getApplyAlignment();
    
    /**
     * Gets (as xml) the "applyAlignment" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyAlignment();
    
    /**
     * True if has "applyAlignment" attribute
     */
    boolean isSetApplyAlignment();
    
    /**
     * Sets the "applyAlignment" attribute
     */
    void setApplyAlignment(boolean applyAlignment);
    
    /**
     * Sets (as xml) the "applyAlignment" attribute
     */
    void xsetApplyAlignment(org.apache.xmlbeans.XmlBoolean applyAlignment);
    
    /**
     * Unsets the "applyAlignment" attribute
     */
    void unsetApplyAlignment();
    
    /**
     * Gets the "applyProtection" attribute
     */
    boolean getApplyProtection();
    
    /**
     * Gets (as xml) the "applyProtection" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyProtection();
    
    /**
     * True if has "applyProtection" attribute
     */
    boolean isSetApplyProtection();
    
    /**
     * Sets the "applyProtection" attribute
     */
    void setApplyProtection(boolean applyProtection);
    
    /**
     * Sets (as xml) the "applyProtection" attribute
     */
    void xsetApplyProtection(org.apache.xmlbeans.XmlBoolean applyProtection);
    
    /**
     * Unsets the "applyProtection" attribute
     */
    void unsetApplyProtection();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

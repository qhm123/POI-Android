/*
 * XML Type:  CT_RevisionComment
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionComment(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionComment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionComment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisioncomment6c63type");
    
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
     * Gets the "cell" attribute
     */
    java.lang.String getCell();
    
    /**
     * Gets (as xml) the "cell" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetCell();
    
    /**
     * Sets the "cell" attribute
     */
    void setCell(java.lang.String cell);
    
    /**
     * Sets (as xml) the "cell" attribute
     */
    void xsetCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef cell);
    
    /**
     * Gets the "guid" attribute
     */
    java.lang.String getGuid();
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid();
    
    /**
     * Sets the "guid" attribute
     */
    void setGuid(java.lang.String guid);
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid);
    
    /**
     * Gets the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction xgetAction();
    
    /**
     * True if has "action" attribute
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction action);
    
    /**
     * Unsets the "action" attribute
     */
    void unsetAction();
    
    /**
     * Gets the "alwaysShow" attribute
     */
    boolean getAlwaysShow();
    
    /**
     * Gets (as xml) the "alwaysShow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAlwaysShow();
    
    /**
     * True if has "alwaysShow" attribute
     */
    boolean isSetAlwaysShow();
    
    /**
     * Sets the "alwaysShow" attribute
     */
    void setAlwaysShow(boolean alwaysShow);
    
    /**
     * Sets (as xml) the "alwaysShow" attribute
     */
    void xsetAlwaysShow(org.apache.xmlbeans.XmlBoolean alwaysShow);
    
    /**
     * Unsets the "alwaysShow" attribute
     */
    void unsetAlwaysShow();
    
    /**
     * Gets the "old" attribute
     */
    boolean getOld();
    
    /**
     * Gets (as xml) the "old" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOld();
    
    /**
     * True if has "old" attribute
     */
    boolean isSetOld();
    
    /**
     * Sets the "old" attribute
     */
    void setOld(boolean old);
    
    /**
     * Sets (as xml) the "old" attribute
     */
    void xsetOld(org.apache.xmlbeans.XmlBoolean old);
    
    /**
     * Unsets the "old" attribute
     */
    void unsetOld();
    
    /**
     * Gets the "hiddenRow" attribute
     */
    boolean getHiddenRow();
    
    /**
     * Gets (as xml) the "hiddenRow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHiddenRow();
    
    /**
     * True if has "hiddenRow" attribute
     */
    boolean isSetHiddenRow();
    
    /**
     * Sets the "hiddenRow" attribute
     */
    void setHiddenRow(boolean hiddenRow);
    
    /**
     * Sets (as xml) the "hiddenRow" attribute
     */
    void xsetHiddenRow(org.apache.xmlbeans.XmlBoolean hiddenRow);
    
    /**
     * Unsets the "hiddenRow" attribute
     */
    void unsetHiddenRow();
    
    /**
     * Gets the "hiddenColumn" attribute
     */
    boolean getHiddenColumn();
    
    /**
     * Gets (as xml) the "hiddenColumn" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHiddenColumn();
    
    /**
     * True if has "hiddenColumn" attribute
     */
    boolean isSetHiddenColumn();
    
    /**
     * Sets the "hiddenColumn" attribute
     */
    void setHiddenColumn(boolean hiddenColumn);
    
    /**
     * Sets (as xml) the "hiddenColumn" attribute
     */
    void xsetHiddenColumn(org.apache.xmlbeans.XmlBoolean hiddenColumn);
    
    /**
     * Unsets the "hiddenColumn" attribute
     */
    void unsetHiddenColumn();
    
    /**
     * Gets the "author" attribute
     */
    java.lang.String getAuthor();
    
    /**
     * Gets (as xml) the "author" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetAuthor();
    
    /**
     * Sets the "author" attribute
     */
    void setAuthor(java.lang.String author);
    
    /**
     * Sets (as xml) the "author" attribute
     */
    void xsetAuthor(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring author);
    
    /**
     * Gets the "oldLength" attribute
     */
    long getOldLength();
    
    /**
     * Gets (as xml) the "oldLength" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetOldLength();
    
    /**
     * True if has "oldLength" attribute
     */
    boolean isSetOldLength();
    
    /**
     * Sets the "oldLength" attribute
     */
    void setOldLength(long oldLength);
    
    /**
     * Sets (as xml) the "oldLength" attribute
     */
    void xsetOldLength(org.apache.xmlbeans.XmlUnsignedInt oldLength);
    
    /**
     * Unsets the "oldLength" attribute
     */
    void unsetOldLength();
    
    /**
     * Gets the "newLength" attribute
     */
    long getNewLength();
    
    /**
     * Gets (as xml) the "newLength" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetNewLength();
    
    /**
     * True if has "newLength" attribute
     */
    boolean isSetNewLength();
    
    /**
     * Sets the "newLength" attribute
     */
    void setNewLength(long newLength);
    
    /**
     * Sets (as xml) the "newLength" attribute
     */
    void xsetNewLength(org.apache.xmlbeans.XmlUnsignedInt newLength);
    
    /**
     * Unsets the "newLength" attribute
     */
    void unsetNewLength();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

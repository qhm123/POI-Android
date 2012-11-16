/*
 * XML Type:  CT_RevisionMove
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionMove(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionMove extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionMove.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisionmoveef95type");
    
    /**
     * Gets a List of "undo" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo> getUndoList();
    
    /**
     * Gets array of all "undo" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo[] getUndoArray();
    
    /**
     * Gets ith "undo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo getUndoArray(int i);
    
    /**
     * Returns number of "undo" element
     */
    int sizeOfUndoArray();
    
    /**
     * Sets array of all "undo" element
     */
    void setUndoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo[] undoArray);
    
    /**
     * Sets ith "undo" element
     */
    void setUndoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo undo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "undo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo insertNewUndo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "undo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo addNewUndo();
    
    /**
     * Removes the ith "undo" element
     */
    void removeUndo(int i);
    
    /**
     * Gets a List of "rcc" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange> getRccList();
    
    /**
     * Gets array of all "rcc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] getRccArray();
    
    /**
     * Gets ith "rcc" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange getRccArray(int i);
    
    /**
     * Returns number of "rcc" element
     */
    int sizeOfRccArray();
    
    /**
     * Sets array of all "rcc" element
     */
    void setRccArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] rccArray);
    
    /**
     * Sets ith "rcc" element
     */
    void setRccArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange rcc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rcc" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange insertNewRcc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rcc" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange addNewRcc();
    
    /**
     * Removes the ith "rcc" element
     */
    void removeRcc(int i);
    
    /**
     * Gets a List of "rfmt" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting> getRfmtList();
    
    /**
     * Gets array of all "rfmt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] getRfmtArray();
    
    /**
     * Gets ith "rfmt" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting getRfmtArray(int i);
    
    /**
     * Returns number of "rfmt" element
     */
    int sizeOfRfmtArray();
    
    /**
     * Sets array of all "rfmt" element
     */
    void setRfmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] rfmtArray);
    
    /**
     * Sets ith "rfmt" element
     */
    void setRfmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting rfmt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rfmt" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting insertNewRfmt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rfmt" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting addNewRfmt();
    
    /**
     * Removes the ith "rfmt" element
     */
    void removeRfmt(int i);
    
    /**
     * Gets the "rId" attribute
     */
    long getRId();
    
    /**
     * Gets (as xml) the "rId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRId();
    
    /**
     * Sets the "rId" attribute
     */
    void setRId(long rId);
    
    /**
     * Sets (as xml) the "rId" attribute
     */
    void xsetRId(org.apache.xmlbeans.XmlUnsignedInt rId);
    
    /**
     * Gets the "ua" attribute
     */
    boolean getUa();
    
    /**
     * Gets (as xml) the "ua" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUa();
    
    /**
     * True if has "ua" attribute
     */
    boolean isSetUa();
    
    /**
     * Sets the "ua" attribute
     */
    void setUa(boolean ua);
    
    /**
     * Sets (as xml) the "ua" attribute
     */
    void xsetUa(org.apache.xmlbeans.XmlBoolean ua);
    
    /**
     * Unsets the "ua" attribute
     */
    void unsetUa();
    
    /**
     * Gets the "ra" attribute
     */
    boolean getRa();
    
    /**
     * Gets (as xml) the "ra" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRa();
    
    /**
     * True if has "ra" attribute
     */
    boolean isSetRa();
    
    /**
     * Sets the "ra" attribute
     */
    void setRa(boolean ra);
    
    /**
     * Sets (as xml) the "ra" attribute
     */
    void xsetRa(org.apache.xmlbeans.XmlBoolean ra);
    
    /**
     * Unsets the "ra" attribute
     */
    void unsetRa();
    
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
     * Gets the "source" attribute
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef source);
    
    /**
     * Gets the "destination" attribute
     */
    java.lang.String getDestination();
    
    /**
     * Gets (as xml) the "destination" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetDestination();
    
    /**
     * Sets the "destination" attribute
     */
    void setDestination(java.lang.String destination);
    
    /**
     * Sets (as xml) the "destination" attribute
     */
    void xsetDestination(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef destination);
    
    /**
     * Gets the "sourceSheetId" attribute
     */
    long getSourceSheetId();
    
    /**
     * Gets (as xml) the "sourceSheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSourceSheetId();
    
    /**
     * True if has "sourceSheetId" attribute
     */
    boolean isSetSourceSheetId();
    
    /**
     * Sets the "sourceSheetId" attribute
     */
    void setSourceSheetId(long sourceSheetId);
    
    /**
     * Sets (as xml) the "sourceSheetId" attribute
     */
    void xsetSourceSheetId(org.apache.xmlbeans.XmlUnsignedInt sourceSheetId);
    
    /**
     * Unsets the "sourceSheetId" attribute
     */
    void unsetSourceSheetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

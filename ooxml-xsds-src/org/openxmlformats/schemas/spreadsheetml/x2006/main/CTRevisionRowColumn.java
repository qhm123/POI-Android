/*
 * XML Type:  CT_RevisionRowColumn
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionRowColumn(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionRowColumn extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionRowColumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisionrowcolumn5494type");
    
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
     * Gets the "sId" attribute
     */
    long getSId();
    
    /**
     * Gets (as xml) the "sId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSId();
    
    /**
     * Sets the "sId" attribute
     */
    void setSId(long sId);
    
    /**
     * Sets (as xml) the "sId" attribute
     */
    void xsetSId(org.apache.xmlbeans.XmlUnsignedInt sId);
    
    /**
     * Gets the "eol" attribute
     */
    boolean getEol();
    
    /**
     * Gets (as xml) the "eol" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEol();
    
    /**
     * True if has "eol" attribute
     */
    boolean isSetEol();
    
    /**
     * Sets the "eol" attribute
     */
    void setEol(boolean eol);
    
    /**
     * Sets (as xml) the "eol" attribute
     */
    void xsetEol(org.apache.xmlbeans.XmlBoolean eol);
    
    /**
     * Unsets the "eol" attribute
     */
    void unsetEol();
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);
    
    /**
     * Gets the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType.Enum getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType xgetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType.Enum action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType action);
    
    /**
     * Gets the "edge" attribute
     */
    boolean getEdge();
    
    /**
     * Gets (as xml) the "edge" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEdge();
    
    /**
     * True if has "edge" attribute
     */
    boolean isSetEdge();
    
    /**
     * Sets the "edge" attribute
     */
    void setEdge(boolean edge);
    
    /**
     * Sets (as xml) the "edge" attribute
     */
    void xsetEdge(org.apache.xmlbeans.XmlBoolean edge);
    
    /**
     * Unsets the "edge" attribute
     */
    void unsetEdge();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

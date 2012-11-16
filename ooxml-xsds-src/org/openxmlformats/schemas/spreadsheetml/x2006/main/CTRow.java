/*
 * XML Type:  CT_Row
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Row(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRow extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrowdd39type");
    
    /**
     * Gets a List of "c" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell> getCList();
    
    /**
     * Gets array of all "c" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell[] getCArray();
    
    /**
     * Gets ith "c" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell getCArray(int i);
    
    /**
     * Returns number of "c" element
     */
    int sizeOfCArray();
    
    /**
     * Sets array of all "c" element
     */
    void setCArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell[] cArray);
    
    /**
     * Sets ith "c" element
     */
    void setCArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell c);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "c" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell insertNewC(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "c" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell addNewC();
    
    /**
     * Removes the ith "c" element
     */
    void removeC(int i);
    
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
     * Gets the "r" attribute
     */
    long getR();
    
    /**
     * Gets (as xml) the "r" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetR();
    
    /**
     * True if has "r" attribute
     */
    boolean isSetR();
    
    /**
     * Sets the "r" attribute
     */
    void setR(long r);
    
    /**
     * Sets (as xml) the "r" attribute
     */
    void xsetR(org.apache.xmlbeans.XmlUnsignedInt r);
    
    /**
     * Unsets the "r" attribute
     */
    void unsetR();
    
    /**
     * Gets the "spans" attribute
     */
    java.util.List getSpans();
    
    /**
     * Gets (as xml) the "spans" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans xgetSpans();
    
    /**
     * True if has "spans" attribute
     */
    boolean isSetSpans();
    
    /**
     * Sets the "spans" attribute
     */
    void setSpans(java.util.List spans);
    
    /**
     * Sets (as xml) the "spans" attribute
     */
    void xsetSpans(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans spans);
    
    /**
     * Unsets the "spans" attribute
     */
    void unsetSpans();
    
    /**
     * Gets the "s" attribute
     */
    long getS();
    
    /**
     * Gets (as xml) the "s" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetS();
    
    /**
     * True if has "s" attribute
     */
    boolean isSetS();
    
    /**
     * Sets the "s" attribute
     */
    void setS(long s);
    
    /**
     * Sets (as xml) the "s" attribute
     */
    void xsetS(org.apache.xmlbeans.XmlUnsignedInt s);
    
    /**
     * Unsets the "s" attribute
     */
    void unsetS();
    
    /**
     * Gets the "customFormat" attribute
     */
    boolean getCustomFormat();
    
    /**
     * Gets (as xml) the "customFormat" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCustomFormat();
    
    /**
     * True if has "customFormat" attribute
     */
    boolean isSetCustomFormat();
    
    /**
     * Sets the "customFormat" attribute
     */
    void setCustomFormat(boolean customFormat);
    
    /**
     * Sets (as xml) the "customFormat" attribute
     */
    void xsetCustomFormat(org.apache.xmlbeans.XmlBoolean customFormat);
    
    /**
     * Unsets the "customFormat" attribute
     */
    void unsetCustomFormat();
    
    /**
     * Gets the "ht" attribute
     */
    double getHt();
    
    /**
     * Gets (as xml) the "ht" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetHt();
    
    /**
     * True if has "ht" attribute
     */
    boolean isSetHt();
    
    /**
     * Sets the "ht" attribute
     */
    void setHt(double ht);
    
    /**
     * Sets (as xml) the "ht" attribute
     */
    void xsetHt(org.apache.xmlbeans.XmlDouble ht);
    
    /**
     * Unsets the "ht" attribute
     */
    void unsetHt();
    
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
     * Gets the "customHeight" attribute
     */
    boolean getCustomHeight();
    
    /**
     * Gets (as xml) the "customHeight" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCustomHeight();
    
    /**
     * True if has "customHeight" attribute
     */
    boolean isSetCustomHeight();
    
    /**
     * Sets the "customHeight" attribute
     */
    void setCustomHeight(boolean customHeight);
    
    /**
     * Sets (as xml) the "customHeight" attribute
     */
    void xsetCustomHeight(org.apache.xmlbeans.XmlBoolean customHeight);
    
    /**
     * Unsets the "customHeight" attribute
     */
    void unsetCustomHeight();
    
    /**
     * Gets the "outlineLevel" attribute
     */
    short getOutlineLevel();
    
    /**
     * Gets (as xml) the "outlineLevel" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetOutlineLevel();
    
    /**
     * True if has "outlineLevel" attribute
     */
    boolean isSetOutlineLevel();
    
    /**
     * Sets the "outlineLevel" attribute
     */
    void setOutlineLevel(short outlineLevel);
    
    /**
     * Sets (as xml) the "outlineLevel" attribute
     */
    void xsetOutlineLevel(org.apache.xmlbeans.XmlUnsignedByte outlineLevel);
    
    /**
     * Unsets the "outlineLevel" attribute
     */
    void unsetOutlineLevel();
    
    /**
     * Gets the "collapsed" attribute
     */
    boolean getCollapsed();
    
    /**
     * Gets (as xml) the "collapsed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCollapsed();
    
    /**
     * True if has "collapsed" attribute
     */
    boolean isSetCollapsed();
    
    /**
     * Sets the "collapsed" attribute
     */
    void setCollapsed(boolean collapsed);
    
    /**
     * Sets (as xml) the "collapsed" attribute
     */
    void xsetCollapsed(org.apache.xmlbeans.XmlBoolean collapsed);
    
    /**
     * Unsets the "collapsed" attribute
     */
    void unsetCollapsed();
    
    /**
     * Gets the "thickTop" attribute
     */
    boolean getThickTop();
    
    /**
     * Gets (as xml) the "thickTop" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetThickTop();
    
    /**
     * True if has "thickTop" attribute
     */
    boolean isSetThickTop();
    
    /**
     * Sets the "thickTop" attribute
     */
    void setThickTop(boolean thickTop);
    
    /**
     * Sets (as xml) the "thickTop" attribute
     */
    void xsetThickTop(org.apache.xmlbeans.XmlBoolean thickTop);
    
    /**
     * Unsets the "thickTop" attribute
     */
    void unsetThickTop();
    
    /**
     * Gets the "thickBot" attribute
     */
    boolean getThickBot();
    
    /**
     * Gets (as xml) the "thickBot" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetThickBot();
    
    /**
     * True if has "thickBot" attribute
     */
    boolean isSetThickBot();
    
    /**
     * Sets the "thickBot" attribute
     */
    void setThickBot(boolean thickBot);
    
    /**
     * Sets (as xml) the "thickBot" attribute
     */
    void xsetThickBot(org.apache.xmlbeans.XmlBoolean thickBot);
    
    /**
     * Unsets the "thickBot" attribute
     */
    void unsetThickBot();
    
    /**
     * Gets the "ph" attribute
     */
    boolean getPh();
    
    /**
     * Gets (as xml) the "ph" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPh();
    
    /**
     * True if has "ph" attribute
     */
    boolean isSetPh();
    
    /**
     * Sets the "ph" attribute
     */
    void setPh(boolean ph);
    
    /**
     * Sets (as xml) the "ph" attribute
     */
    void xsetPh(org.apache.xmlbeans.XmlBoolean ph);
    
    /**
     * Unsets the "ph" attribute
     */
    void unsetPh();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

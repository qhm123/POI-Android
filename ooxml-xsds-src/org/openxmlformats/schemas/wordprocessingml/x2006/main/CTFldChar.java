/*
 * XML Type:  CT_FldChar
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_FldChar(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFldChar extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFldChar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfldchare83etype");
    
    /**
     * Gets the "fldData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText getFldData();
    
    /**
     * True if has "fldData" element
     */
    boolean isSetFldData();
    
    /**
     * Sets the "fldData" element
     */
    void setFldData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText fldData);
    
    /**
     * Appends and returns a new empty "fldData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText addNewFldData();
    
    /**
     * Unsets the "fldData" element
     */
    void unsetFldData();
    
    /**
     * Gets the "ffData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData getFfData();
    
    /**
     * True if has "ffData" element
     */
    boolean isSetFfData();
    
    /**
     * Sets the "ffData" element
     */
    void setFfData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData ffData);
    
    /**
     * Appends and returns a new empty "ffData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData addNewFfData();
    
    /**
     * Unsets the "ffData" element
     */
    void unsetFfData();
    
    /**
     * Gets the "numberingChange" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering getNumberingChange();
    
    /**
     * True if has "numberingChange" element
     */
    boolean isSetNumberingChange();
    
    /**
     * Sets the "numberingChange" element
     */
    void setNumberingChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering numberingChange);
    
    /**
     * Appends and returns a new empty "numberingChange" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering addNewNumberingChange();
    
    /**
     * Unsets the "numberingChange" element
     */
    void unsetNumberingChange();
    
    /**
     * Gets the "fldCharType" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType.Enum getFldCharType();
    
    /**
     * Gets (as xml) the "fldCharType" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType xgetFldCharType();
    
    /**
     * Sets the "fldCharType" attribute
     */
    void setFldCharType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType.Enum fldCharType);
    
    /**
     * Sets (as xml) the "fldCharType" attribute
     */
    void xsetFldCharType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType fldCharType);
    
    /**
     * Gets the "fldLock" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getFldLock();
    
    /**
     * Gets (as xml) the "fldLock" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetFldLock();
    
    /**
     * True if has "fldLock" attribute
     */
    boolean isSetFldLock();
    
    /**
     * Sets the "fldLock" attribute
     */
    void setFldLock(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum fldLock);
    
    /**
     * Sets (as xml) the "fldLock" attribute
     */
    void xsetFldLock(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff fldLock);
    
    /**
     * Unsets the "fldLock" attribute
     */
    void unsetFldLock();
    
    /**
     * Gets the "dirty" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDirty();
    
    /**
     * Gets (as xml) the "dirty" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDirty();
    
    /**
     * True if has "dirty" attribute
     */
    boolean isSetDirty();
    
    /**
     * Sets the "dirty" attribute
     */
    void setDirty(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum dirty);
    
    /**
     * Sets (as xml) the "dirty" attribute
     */
    void xsetDirty(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff dirty);
    
    /**
     * Unsets the "dirty" attribute
     */
    void unsetDirty();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

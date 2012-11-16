/*
 * XML Type:  CT_TrPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_TrPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTrPr extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTrPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttrpr2848type");
    
    /**
     * Gets the "ins" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getIns();
    
    /**
     * True if has "ins" element
     */
    boolean isSetIns();
    
    /**
     * Sets the "ins" element
     */
    void setIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange ins);
    
    /**
     * Appends and returns a new empty "ins" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewIns();
    
    /**
     * Unsets the "ins" element
     */
    void unsetIns();
    
    /**
     * Gets the "del" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getDel();
    
    /**
     * True if has "del" element
     */
    boolean isSetDel();
    
    /**
     * Sets the "del" element
     */
    void setDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange del);
    
    /**
     * Appends and returns a new empty "del" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewDel();
    
    /**
     * Unsets the "del" element
     */
    void unsetDel();
    
    /**
     * Gets the "trPrChange" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange getTrPrChange();
    
    /**
     * True if has "trPrChange" element
     */
    boolean isSetTrPrChange();
    
    /**
     * Sets the "trPrChange" element
     */
    void setTrPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange trPrChange);
    
    /**
     * Appends and returns a new empty "trPrChange" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange addNewTrPrChange();
    
    /**
     * Unsets the "trPrChange" element
     */
    void unsetTrPrChange();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

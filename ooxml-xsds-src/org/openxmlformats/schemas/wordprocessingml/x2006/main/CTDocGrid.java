/*
 * XML Type:  CT_DocGrid
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocGrid(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocGrid extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocGrid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocgride8b4type");
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "linePitch" attribute
     */
    java.math.BigInteger getLinePitch();
    
    /**
     * Gets (as xml) the "linePitch" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetLinePitch();
    
    /**
     * True if has "linePitch" attribute
     */
    boolean isSetLinePitch();
    
    /**
     * Sets the "linePitch" attribute
     */
    void setLinePitch(java.math.BigInteger linePitch);
    
    /**
     * Sets (as xml) the "linePitch" attribute
     */
    void xsetLinePitch(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber linePitch);
    
    /**
     * Unsets the "linePitch" attribute
     */
    void unsetLinePitch();
    
    /**
     * Gets the "charSpace" attribute
     */
    java.math.BigInteger getCharSpace();
    
    /**
     * Gets (as xml) the "charSpace" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCharSpace();
    
    /**
     * True if has "charSpace" attribute
     */
    boolean isSetCharSpace();
    
    /**
     * Sets the "charSpace" attribute
     */
    void setCharSpace(java.math.BigInteger charSpace);
    
    /**
     * Sets (as xml) the "charSpace" attribute
     */
    void xsetCharSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber charSpace);
    
    /**
     * Unsets the "charSpace" attribute
     */
    void unsetCharSpace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

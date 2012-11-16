/*
 * XML Type:  CT_LatentStyles
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_LatentStyles(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTLatentStyles extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLatentStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctlatentstyles2e3atype");
    
    /**
     * Gets a List of "lsdException" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException> getLsdExceptionList();
    
    /**
     * Gets array of all "lsdException" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException[] getLsdExceptionArray();
    
    /**
     * Gets ith "lsdException" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException getLsdExceptionArray(int i);
    
    /**
     * Returns number of "lsdException" element
     */
    int sizeOfLsdExceptionArray();
    
    /**
     * Sets array of all "lsdException" element
     */
    void setLsdExceptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException[] lsdExceptionArray);
    
    /**
     * Sets ith "lsdException" element
     */
    void setLsdExceptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException lsdException);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lsdException" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException insertNewLsdException(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lsdException" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException addNewLsdException();
    
    /**
     * Removes the ith "lsdException" element
     */
    void removeLsdException(int i);
    
    /**
     * Gets the "defLockedState" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefLockedState();
    
    /**
     * Gets (as xml) the "defLockedState" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefLockedState();
    
    /**
     * True if has "defLockedState" attribute
     */
    boolean isSetDefLockedState();
    
    /**
     * Sets the "defLockedState" attribute
     */
    void setDefLockedState(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defLockedState);
    
    /**
     * Sets (as xml) the "defLockedState" attribute
     */
    void xsetDefLockedState(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defLockedState);
    
    /**
     * Unsets the "defLockedState" attribute
     */
    void unsetDefLockedState();
    
    /**
     * Gets the "defUIPriority" attribute
     */
    java.math.BigInteger getDefUIPriority();
    
    /**
     * Gets (as xml) the "defUIPriority" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetDefUIPriority();
    
    /**
     * True if has "defUIPriority" attribute
     */
    boolean isSetDefUIPriority();
    
    /**
     * Sets the "defUIPriority" attribute
     */
    void setDefUIPriority(java.math.BigInteger defUIPriority);
    
    /**
     * Sets (as xml) the "defUIPriority" attribute
     */
    void xsetDefUIPriority(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber defUIPriority);
    
    /**
     * Unsets the "defUIPriority" attribute
     */
    void unsetDefUIPriority();
    
    /**
     * Gets the "defSemiHidden" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefSemiHidden();
    
    /**
     * Gets (as xml) the "defSemiHidden" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefSemiHidden();
    
    /**
     * True if has "defSemiHidden" attribute
     */
    boolean isSetDefSemiHidden();
    
    /**
     * Sets the "defSemiHidden" attribute
     */
    void setDefSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defSemiHidden);
    
    /**
     * Sets (as xml) the "defSemiHidden" attribute
     */
    void xsetDefSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defSemiHidden);
    
    /**
     * Unsets the "defSemiHidden" attribute
     */
    void unsetDefSemiHidden();
    
    /**
     * Gets the "defUnhideWhenUsed" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefUnhideWhenUsed();
    
    /**
     * Gets (as xml) the "defUnhideWhenUsed" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefUnhideWhenUsed();
    
    /**
     * True if has "defUnhideWhenUsed" attribute
     */
    boolean isSetDefUnhideWhenUsed();
    
    /**
     * Sets the "defUnhideWhenUsed" attribute
     */
    void setDefUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defUnhideWhenUsed);
    
    /**
     * Sets (as xml) the "defUnhideWhenUsed" attribute
     */
    void xsetDefUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defUnhideWhenUsed);
    
    /**
     * Unsets the "defUnhideWhenUsed" attribute
     */
    void unsetDefUnhideWhenUsed();
    
    /**
     * Gets the "defQFormat" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefQFormat();
    
    /**
     * Gets (as xml) the "defQFormat" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefQFormat();
    
    /**
     * True if has "defQFormat" attribute
     */
    boolean isSetDefQFormat();
    
    /**
     * Sets the "defQFormat" attribute
     */
    void setDefQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defQFormat);
    
    /**
     * Sets (as xml) the "defQFormat" attribute
     */
    void xsetDefQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defQFormat);
    
    /**
     * Unsets the "defQFormat" attribute
     */
    void unsetDefQFormat();
    
    /**
     * Gets the "count" attribute
     */
    java.math.BigInteger getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(java.math.BigInteger count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

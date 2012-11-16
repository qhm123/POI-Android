/*
 * XML Type:  CT_M
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTM
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_M(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTM extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTM.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctm3f8ftype");
    
    /**
     * Gets the "mPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr getMPr();
    
    /**
     * True if has "mPr" element
     */
    boolean isSetMPr();
    
    /**
     * Sets the "mPr" element
     */
    void setMPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr mPr);
    
    /**
     * Appends and returns a new empty "mPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr addNewMPr();
    
    /**
     * Unsets the "mPr" element
     */
    void unsetMPr();
    
    /**
     * Gets a List of "mr" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTMR> getMrList();
    
    /**
     * Gets array of all "mr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMR[] getMrArray();
    
    /**
     * Gets ith "mr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMR getMrArray(int i);
    
    /**
     * Returns number of "mr" element
     */
    int sizeOfMrArray();
    
    /**
     * Sets array of all "mr" element
     */
    void setMrArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTMR[] mrArray);
    
    /**
     * Sets ith "mr" element
     */
    void setMrArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMR mr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMR insertNewMr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMR addNewMr();
    
    /**
     * Removes the ith "mr" element
     */
    void removeMr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

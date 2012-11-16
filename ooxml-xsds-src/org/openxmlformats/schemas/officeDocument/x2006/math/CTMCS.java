/*
 * XML Type:  CT_MCS
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_MCS(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTMCS extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMCS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmcs4b1ftype");
    
    /**
     * Gets a List of "mc" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTMC> getMcList();
    
    /**
     * Gets array of all "mc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMC[] getMcArray();
    
    /**
     * Gets ith "mc" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMC getMcArray(int i);
    
    /**
     * Returns number of "mc" element
     */
    int sizeOfMcArray();
    
    /**
     * Sets array of all "mc" element
     */
    void setMcArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTMC[] mcArray);
    
    /**
     * Sets ith "mc" element
     */
    void setMcArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTMC mc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mc" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMC insertNewMc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mc" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTMC addNewMc();
    
    /**
     * Removes the ith "mc" element
     */
    void removeMc(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

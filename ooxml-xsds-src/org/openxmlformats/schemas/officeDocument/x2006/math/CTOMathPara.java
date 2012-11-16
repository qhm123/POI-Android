/*
 * XML Type:  CT_OMathPara
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_OMathPara(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTOMathPara extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOMathPara.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctomathpara8825type");
    
    /**
     * Gets the "oMathParaPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr getOMathParaPr();
    
    /**
     * True if has "oMathParaPr" element
     */
    boolean isSetOMathParaPr();
    
    /**
     * Sets the "oMathParaPr" element
     */
    void setOMathParaPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr oMathParaPr);
    
    /**
     * Appends and returns a new empty "oMathParaPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr addNewOMathParaPr();
    
    /**
     * Unsets the "oMathParaPr" element
     */
    void unsetOMathParaPr();
    
    /**
     * Gets a List of "oMath" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath> getOMathList();
    
    /**
     * Gets array of all "oMath" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] getOMathArray();
    
    /**
     * Gets ith "oMath" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath getOMathArray(int i);
    
    /**
     * Returns number of "oMath" element
     */
    int sizeOfOMathArray();
    
    /**
     * Sets array of all "oMath" element
     */
    void setOMathArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] oMathArray);
    
    /**
     * Sets ith "oMath" element
     */
    void setOMathArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath oMath);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oMath" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath insertNewOMath(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oMath" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath addNewOMath();
    
    /**
     * Removes the ith "oMath" element
     */
    void removeOMath(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

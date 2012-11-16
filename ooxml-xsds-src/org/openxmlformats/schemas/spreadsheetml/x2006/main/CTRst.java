/*
 * XML Type:  CT_Rst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Rst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRst extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrsta472type");
    
    /**
     * Gets the "t" element
     */
    java.lang.String getT();
    
    /**
     * Gets (as xml) the "t" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetT();
    
    /**
     * True if has "t" element
     */
    boolean isSetT();
    
    /**
     * Sets the "t" element
     */
    void setT(java.lang.String t);
    
    /**
     * Sets (as xml) the "t" element
     */
    void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring t);
    
    /**
     * Unsets the "t" element
     */
    void unsetT();
    
    /**
     * Gets a List of "r" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt> getRList();
    
    /**
     * Gets array of all "r" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] getRArray();
    
    /**
     * Gets ith "r" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt getRArray(int i);
    
    /**
     * Returns number of "r" element
     */
    int sizeOfRArray();
    
    /**
     * Sets array of all "r" element
     */
    void setRArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] rArray);
    
    /**
     * Sets ith "r" element
     */
    void setRArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt r);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt insertNewR(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt addNewR();
    
    /**
     * Removes the ith "r" element
     */
    void removeR(int i);
    
    /**
     * Gets a List of "rPh" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun> getRPhList();
    
    /**
     * Gets array of all "rPh" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun[] getRPhArray();
    
    /**
     * Gets ith "rPh" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun getRPhArray(int i);
    
    /**
     * Returns number of "rPh" element
     */
    int sizeOfRPhArray();
    
    /**
     * Sets array of all "rPh" element
     */
    void setRPhArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun[] rPhArray);
    
    /**
     * Sets ith "rPh" element
     */
    void setRPhArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun rPh);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rPh" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun insertNewRPh(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rPh" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun addNewRPh();
    
    /**
     * Removes the ith "rPh" element
     */
    void removeRPh(int i);
    
    /**
     * Gets the "phoneticPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr getPhoneticPr();
    
    /**
     * True if has "phoneticPr" element
     */
    boolean isSetPhoneticPr();
    
    /**
     * Sets the "phoneticPr" element
     */
    void setPhoneticPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr phoneticPr);
    
    /**
     * Appends and returns a new empty "phoneticPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr addNewPhoneticPr();
    
    /**
     * Unsets the "phoneticPr" element
     */
    void unsetPhoneticPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

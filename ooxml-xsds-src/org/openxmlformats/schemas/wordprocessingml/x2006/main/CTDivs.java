/*
 * XML Type:  CT_Divs
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Divs(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDivs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDivs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdivs96a6type");
    
    /**
     * Gets a List of "div" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv> getDivList();
    
    /**
     * Gets array of all "div" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv[] getDivArray();
    
    /**
     * Gets ith "div" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv getDivArray(int i);
    
    /**
     * Returns number of "div" element
     */
    int sizeOfDivArray();
    
    /**
     * Sets array of all "div" element
     */
    void setDivArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv[] divArray);
    
    /**
     * Sets ith "div" element
     */
    void setDivArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv div);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "div" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv insertNewDiv(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "div" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv addNewDiv();
    
    /**
     * Removes the ith "div" element
     */
    void removeDiv(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

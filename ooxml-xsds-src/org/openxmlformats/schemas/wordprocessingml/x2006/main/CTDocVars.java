/*
 * XML Type:  CT_DocVars
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocVars(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocVars extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocVars.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocvarsdf8etype");
    
    /**
     * Gets a List of "docVar" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar> getDocVarList();
    
    /**
     * Gets array of all "docVar" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar[] getDocVarArray();
    
    /**
     * Gets ith "docVar" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar getDocVarArray(int i);
    
    /**
     * Returns number of "docVar" element
     */
    int sizeOfDocVarArray();
    
    /**
     * Sets array of all "docVar" element
     */
    void setDocVarArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar[] docVarArray);
    
    /**
     * Sets ith "docVar" element
     */
    void setDocVarArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar docVar);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docVar" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar insertNewDocVar(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docVar" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVar addNewDocVar();
    
    /**
     * Removes the ith "docVar" element
     */
    void removeDocVar(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

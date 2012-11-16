/*
 * XML Type:  CT_EdnDocProps
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_EdnDocProps(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTEdnDocProps extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEdnDocProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctedndocprops478btype");
    
    /**
     * Gets a List of "endnote" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef> getEndnoteList();
    
    /**
     * Gets array of all "endnote" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] getEndnoteArray();
    
    /**
     * Gets ith "endnote" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef getEndnoteArray(int i);
    
    /**
     * Returns number of "endnote" element
     */
    int sizeOfEndnoteArray();
    
    /**
     * Sets array of all "endnote" element
     */
    void setEndnoteArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] endnoteArray);
    
    /**
     * Sets ith "endnote" element
     */
    void setEndnoteArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef endnote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endnote" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef insertNewEndnote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endnote" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef addNewEndnote();
    
    /**
     * Removes the ith "endnote" element
     */
    void removeEndnote(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

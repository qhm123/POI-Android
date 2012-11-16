/*
 * XML Type:  CT_CustomShowList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_CustomShowList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomShowList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomShowList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomshowlist3419type");
    
    /**
     * Gets a List of "custShow" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow> getCustShowList();
    
    /**
     * Gets array of all "custShow" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow[] getCustShowArray();
    
    /**
     * Gets ith "custShow" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow getCustShowArray(int i);
    
    /**
     * Returns number of "custShow" element
     */
    int sizeOfCustShowArray();
    
    /**
     * Sets array of all "custShow" element
     */
    void setCustShowArray(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow[] custShowArray);
    
    /**
     * Sets ith "custShow" element
     */
    void setCustShowArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow custShow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "custShow" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow insertNewCustShow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "custShow" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShow addNewCustShow();
    
    /**
     * Removes the ith "custShow" element
     */
    void removeCustShow(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

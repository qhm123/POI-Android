/*
 * XML Type:  CT_ExtensionList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_ExtensionList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExtensionList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExtensionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctextensionlist4772type");
    
    /**
     * Gets a List of "ext" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTExtension> getExtList();
    
    /**
     * Gets array of all "ext" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtension[] getExtArray();
    
    /**
     * Gets ith "ext" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtension getExtArray(int i);
    
    /**
     * Returns number of "ext" element
     */
    int sizeOfExtArray();
    
    /**
     * Sets array of all "ext" element
     */
    void setExtArray(org.openxmlformats.schemas.presentationml.x2006.main.CTExtension[] extArray);
    
    /**
     * Sets ith "ext" element
     */
    void setExtArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTExtension ext);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ext" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtension insertNewExt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ext" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtension addNewExt();
    
    /**
     * Removes the ith "ext" element
     */
    void removeExt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

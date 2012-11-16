/*
 * XML Type:  CT_OfficeArtExtensionList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_OfficeArtExtensionList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOfficeArtExtensionList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOfficeArtExtensionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctofficeartextensionlista211type");
    
    /**
     * Gets a List of "ext" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension> getExtList();
    
    /**
     * Gets array of all "ext" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension[] getExtArray();
    
    /**
     * Gets ith "ext" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension getExtArray(int i);
    
    /**
     * Returns number of "ext" element
     */
    int sizeOfExtArray();
    
    /**
     * Sets array of all "ext" element
     */
    void setExtArray(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension[] extArray);
    
    /**
     * Sets ith "ext" element
     */
    void setExtArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension ext);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ext" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension insertNewExt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ext" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension addNewExt();
    
    /**
     * Removes the ith "ext" element
     */
    void removeExt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

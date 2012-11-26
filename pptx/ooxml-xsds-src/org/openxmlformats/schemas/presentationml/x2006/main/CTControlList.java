/*
 * XML Type:  CT_ControlList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTControlList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_ControlList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTControlList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTControlList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcontrollist97d4type");
    
    /**
     * Gets a List of "control" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTControl> getControlList();
    
    /**
     * Gets array of all "control" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTControl[] getControlArray();
    
    /**
     * Gets ith "control" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTControl getControlArray(int i);
    
    /**
     * Returns number of "control" element
     */
    int sizeOfControlArray();
    
    /**
     * Sets array of all "control" element
     */
    void setControlArray(org.openxmlformats.schemas.presentationml.x2006.main.CTControl[] controlArray);
    
    /**
     * Sets ith "control" element
     */
    void setControlArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTControl control);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "control" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTControl insertNewControl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "control" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTControl addNewControl();
    
    /**
     * Removes the ith "control" element
     */
    void removeControl(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

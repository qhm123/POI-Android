/*
 * XML Type:  CT_CustomColorList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_CustomColorList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomColorList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomColorList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomcolorlist6661type");
    
    /**
     * Gets a List of "custClr" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor> getCustClrList();
    
    /**
     * Gets array of all "custClr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor[] getCustClrArray();
    
    /**
     * Gets ith "custClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor getCustClrArray(int i);
    
    /**
     * Returns number of "custClr" element
     */
    int sizeOfCustClrArray();
    
    /**
     * Sets array of all "custClr" element
     */
    void setCustClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor[] custClrArray);
    
    /**
     * Sets ith "custClr" element
     */
    void setCustClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor custClr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "custClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor insertNewCustClr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "custClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor addNewCustClr();
    
    /**
     * Removes the ith "custClr" element
     */
    void removeCustClr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

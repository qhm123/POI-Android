/*
 * XML Type:  CT_CTCategories
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_CTCategories(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTCTCategories extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCTCategories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctctcategories7c84type");
    
    /**
     * Gets a List of "cat" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory> getCatList();
    
    /**
     * Gets array of all "cat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory[] getCatArray();
    
    /**
     * Gets ith "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory getCatArray(int i);
    
    /**
     * Returns number of "cat" element
     */
    int sizeOfCatArray();
    
    /**
     * Sets array of all "cat" element
     */
    void setCatArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory[] catArray);
    
    /**
     * Sets ith "cat" element
     */
    void setCatArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory cat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory insertNewCat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory addNewCat();
    
    /**
     * Removes the ith "cat" element
     */
    void removeCat(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

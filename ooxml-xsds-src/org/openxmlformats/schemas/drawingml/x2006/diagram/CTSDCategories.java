/*
 * XML Type:  CT_SDCategories
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_SDCategories(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTSDCategories extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSDCategories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsdcategoriesaea4type");
    
    /**
     * Gets a List of "cat" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory> getCatList();
    
    /**
     * Gets array of all "cat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory[] getCatArray();
    
    /**
     * Gets ith "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory getCatArray(int i);
    
    /**
     * Returns number of "cat" element
     */
    int sizeOfCatArray();
    
    /**
     * Sets array of all "cat" element
     */
    void setCatArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory[] catArray);
    
    /**
     * Sets ith "cat" element
     */
    void setCatArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory cat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory insertNewCat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategory addNewCat();
    
    /**
     * Removes the ith "cat" element
     */
    void removeCat(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

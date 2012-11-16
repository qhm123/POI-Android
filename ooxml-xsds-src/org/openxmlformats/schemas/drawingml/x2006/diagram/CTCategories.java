/*
 * XML Type:  CT_Categories
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_Categories(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTCategories extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCategories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcategories6955type");
    
    /**
     * Gets a List of "cat" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory> getCatList();
    
    /**
     * Gets array of all "cat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory[] getCatArray();
    
    /**
     * Gets ith "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory getCatArray(int i);
    
    /**
     * Returns number of "cat" element
     */
    int sizeOfCatArray();
    
    /**
     * Sets array of all "cat" element
     */
    void setCatArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory[] catArray);
    
    /**
     * Sets ith "cat" element
     */
    void setCatArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory cat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory insertNewCat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory addNewCat();
    
    /**
     * Removes the ith "cat" element
     */
    void removeCat(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

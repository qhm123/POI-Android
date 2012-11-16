/*
 * XML Type:  CT_GeomGuideList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GeomGuideList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGeomGuideList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGeomGuideList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgeomguidelist364ftype");
    
    /**
     * Gets a List of "gd" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide> getGdList();
    
    /**
     * Gets array of all "gd" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide[] getGdArray();
    
    /**
     * Gets ith "gd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide getGdArray(int i);
    
    /**
     * Returns number of "gd" element
     */
    int sizeOfGdArray();
    
    /**
     * Sets array of all "gd" element
     */
    void setGdArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide[] gdArray);
    
    /**
     * Sets ith "gd" element
     */
    void setGdArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide gd);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide insertNewGd(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide addNewGd();
    
    /**
     * Removes the ith "gd" element
     */
    void removeGd(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

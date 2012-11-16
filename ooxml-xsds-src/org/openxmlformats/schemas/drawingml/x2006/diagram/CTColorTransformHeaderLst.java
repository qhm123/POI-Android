/*
 * XML Type:  CT_ColorTransformHeaderLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_ColorTransformHeaderLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTColorTransformHeaderLst extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorTransformHeaderLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolortransformheaderlstd184type");
    
    /**
     * Gets a List of "colorsDefHdr" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader> getColorsDefHdrList();
    
    /**
     * Gets array of all "colorsDefHdr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader[] getColorsDefHdrArray();
    
    /**
     * Gets ith "colorsDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader getColorsDefHdrArray(int i);
    
    /**
     * Returns number of "colorsDefHdr" element
     */
    int sizeOfColorsDefHdrArray();
    
    /**
     * Sets array of all "colorsDefHdr" element
     */
    void setColorsDefHdrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader[] colorsDefHdrArray);
    
    /**
     * Sets ith "colorsDefHdr" element
     */
    void setColorsDefHdrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader colorsDefHdr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colorsDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader insertNewColorsDefHdr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colorsDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader addNewColorsDefHdr();
    
    /**
     * Removes the ith "colorsDefHdr" element
     */
    void removeColorsDefHdr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

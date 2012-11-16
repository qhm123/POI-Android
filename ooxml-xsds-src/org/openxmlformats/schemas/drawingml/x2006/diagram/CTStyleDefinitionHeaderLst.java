/*
 * XML Type:  CT_StyleDefinitionHeaderLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_StyleDefinitionHeaderLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTStyleDefinitionHeaderLst extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStyleDefinitionHeaderLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstyledefinitionheaderlst1bb5type");
    
    /**
     * Gets a List of "styleDefHdr" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader> getStyleDefHdrList();
    
    /**
     * Gets array of all "styleDefHdr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader[] getStyleDefHdrArray();
    
    /**
     * Gets ith "styleDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader getStyleDefHdrArray(int i);
    
    /**
     * Returns number of "styleDefHdr" element
     */
    int sizeOfStyleDefHdrArray();
    
    /**
     * Sets array of all "styleDefHdr" element
     */
    void setStyleDefHdrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader[] styleDefHdrArray);
    
    /**
     * Sets ith "styleDefHdr" element
     */
    void setStyleDefHdrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader styleDefHdr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader insertNewStyleDefHdr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleDefHdr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader addNewStyleDefHdr();
    
    /**
     * Removes the ith "styleDefHdr" element
     */
    void removeStyleDefHdr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

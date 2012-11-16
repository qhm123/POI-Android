/*
 * XML Type:  CT_CxnList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_CxnList(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTCxnList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCxnList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcxnlist1564type");
    
    /**
     * Gets a List of "cxn" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn> getCxnList();
    
    /**
     * Gets array of all "cxn" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn[] getCxnArray();
    
    /**
     * Gets ith "cxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn getCxnArray(int i);
    
    /**
     * Returns number of "cxn" element
     */
    int sizeOfCxnArray();
    
    /**
     * Sets array of all "cxn" element
     */
    void setCxnArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn[] cxnArray);
    
    /**
     * Sets ith "cxn" element
     */
    void setCxnArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn cxn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn insertNewCxn(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn addNewCxn();
    
    /**
     * Removes the ith "cxn" element
     */
    void removeCxn(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

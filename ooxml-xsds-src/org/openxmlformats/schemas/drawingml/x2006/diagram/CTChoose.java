/*
 * XML Type:  CT_Choose
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_Choose(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTChoose extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChoose.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchoose5b3atype");
    
    /**
     * Gets a List of "if" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen> getIfList();
    
    /**
     * Gets array of all "if" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen[] getIfArray();
    
    /**
     * Gets ith "if" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen getIfArray(int i);
    
    /**
     * Returns number of "if" element
     */
    int sizeOfIfArray();
    
    /**
     * Sets array of all "if" element
     */
    void setIfArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen[] xifArray);
    
    /**
     * Sets ith "if" element
     */
    void setIfArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen xif);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "if" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen insertNewIf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "if" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen addNewIf();
    
    /**
     * Removes the ith "if" element
     */
    void removeIf(int i);
    
    /**
     * Gets the "else" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise getElse();
    
    /**
     * True if has "else" element
     */
    boolean isSetElse();
    
    /**
     * Sets the "else" element
     */
    void setElse(org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise xelse);
    
    /**
     * Appends and returns a new empty "else" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise addNewElse();
    
    /**
     * Unsets the "else" element
     */
    void unsetElse();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

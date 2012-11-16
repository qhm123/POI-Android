/*
 * XML Type:  CT_Constraints
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_Constraints(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTConstraints extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTConstraints.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctconstraintsfc65type");
    
    /**
     * Gets a List of "constr" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint> getConstrList();
    
    /**
     * Gets array of all "constr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint[] getConstrArray();
    
    /**
     * Gets ith "constr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint getConstrArray(int i);
    
    /**
     * Returns number of "constr" element
     */
    int sizeOfConstrArray();
    
    /**
     * Sets array of all "constr" element
     */
    void setConstrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint[] constrArray);
    
    /**
     * Sets ith "constr" element
     */
    void setConstrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint constr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint insertNewConstr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint addNewConstr();
    
    /**
     * Removes the ith "constr" element
     */
    void removeConstr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

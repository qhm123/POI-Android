/*
 * XML Type:  CT_Rules
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_Rules(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTRules extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrulesa884type");
    
    /**
     * Gets a List of "rule" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule> getRuleList();
    
    /**
     * Gets array of all "rule" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule[] getRuleArray();
    
    /**
     * Gets ith "rule" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule getRuleArray(int i);
    
    /**
     * Returns number of "rule" element
     */
    int sizeOfRuleArray();
    
    /**
     * Sets array of all "rule" element
     */
    void setRuleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule[] ruleArray);
    
    /**
     * Sets ith "rule" element
     */
    void setRuleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule rule);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rule" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule insertNewRule(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rule" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule addNewRule();
    
    /**
     * Removes the ith "rule" element
     */
    void removeRule(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

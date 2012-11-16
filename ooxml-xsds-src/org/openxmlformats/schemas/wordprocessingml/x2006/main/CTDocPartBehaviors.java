/*
 * XML Type:  CT_DocPartBehaviors
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_DocPartBehaviors(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDocPartBehaviors extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDocPartBehaviors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdocpartbehaviors0952type");
    
    /**
     * Gets a List of "behavior" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior> getBehaviorList();
    
    /**
     * Gets array of all "behavior" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior[] getBehaviorArray();
    
    /**
     * Gets ith "behavior" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior getBehaviorArray(int i);
    
    /**
     * Returns number of "behavior" element
     */
    int sizeOfBehaviorArray();
    
    /**
     * Sets array of all "behavior" element
     */
    void setBehaviorArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior[] behaviorArray);
    
    /**
     * Sets ith "behavior" element
     */
    void setBehaviorArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior behavior);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "behavior" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior insertNewBehavior(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "behavior" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehavior addNewBehavior();
    
    /**
     * Removes the ith "behavior" element
     */
    void removeBehavior(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_TLTimeConditionList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLTimeConditionList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLTimeConditionList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLTimeConditionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttltimeconditionlistebbbtype");
    
    /**
     * Gets a List of "cond" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition> getCondList();
    
    /**
     * Gets array of all "cond" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition[] getCondArray();
    
    /**
     * Gets ith "cond" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition getCondArray(int i);
    
    /**
     * Returns number of "cond" element
     */
    int sizeOfCondArray();
    
    /**
     * Sets array of all "cond" element
     */
    void setCondArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition[] condArray);
    
    /**
     * Sets ith "cond" element
     */
    void setCondArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition cond);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cond" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition insertNewCond(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cond" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition addNewCond();
    
    /**
     * Removes the ith "cond" element
     */
    void removeCond(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

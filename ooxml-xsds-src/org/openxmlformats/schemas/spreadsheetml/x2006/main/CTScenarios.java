/*
 * XML Type:  CT_Scenarios
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Scenarios(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTScenarios extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTScenarios.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctscenariosacc2type");
    
    /**
     * Gets a List of "scenario" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario> getScenarioList();
    
    /**
     * Gets array of all "scenario" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario[] getScenarioArray();
    
    /**
     * Gets ith "scenario" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario getScenarioArray(int i);
    
    /**
     * Returns number of "scenario" element
     */
    int sizeOfScenarioArray();
    
    /**
     * Sets array of all "scenario" element
     */
    void setScenarioArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario[] scenarioArray);
    
    /**
     * Sets ith "scenario" element
     */
    void setScenarioArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario scenario);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scenario" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario insertNewScenario(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scenario" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario addNewScenario();
    
    /**
     * Removes the ith "scenario" element
     */
    void removeScenario(int i);
    
    /**
     * Gets the "current" attribute
     */
    long getCurrent();
    
    /**
     * Gets (as xml) the "current" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCurrent();
    
    /**
     * True if has "current" attribute
     */
    boolean isSetCurrent();
    
    /**
     * Sets the "current" attribute
     */
    void setCurrent(long current);
    
    /**
     * Sets (as xml) the "current" attribute
     */
    void xsetCurrent(org.apache.xmlbeans.XmlUnsignedInt current);
    
    /**
     * Unsets the "current" attribute
     */
    void unsetCurrent();
    
    /**
     * Gets the "show" attribute
     */
    long getShow();
    
    /**
     * Gets (as xml) the "show" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetShow();
    
    /**
     * True if has "show" attribute
     */
    boolean isSetShow();
    
    /**
     * Sets the "show" attribute
     */
    void setShow(long show);
    
    /**
     * Sets (as xml) the "show" attribute
     */
    void xsetShow(org.apache.xmlbeans.XmlUnsignedInt show);
    
    /**
     * Unsets the "show" attribute
     */
    void unsetShow();
    
    /**
     * Gets the "sqref" attribute
     */
    java.util.List getSqref();
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref();
    
    /**
     * True if has "sqref" attribute
     */
    boolean isSetSqref();
    
    /**
     * Sets the "sqref" attribute
     */
    void setSqref(java.util.List sqref);
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref);
    
    /**
     * Unsets the "sqref" attribute
     */
    void unsetSqref();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

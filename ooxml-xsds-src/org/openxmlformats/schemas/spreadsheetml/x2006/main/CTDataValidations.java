/*
 * XML Type:  CT_DataValidations
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DataValidations(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataValidations extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDataValidations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatavalidationse46ftype");
    
    /**
     * Gets a List of "dataValidation" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation> getDataValidationList();
    
    /**
     * Gets array of all "dataValidation" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation[] getDataValidationArray();
    
    /**
     * Gets ith "dataValidation" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation getDataValidationArray(int i);
    
    /**
     * Returns number of "dataValidation" element
     */
    int sizeOfDataValidationArray();
    
    /**
     * Sets array of all "dataValidation" element
     */
    void setDataValidationArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation[] dataValidationArray);
    
    /**
     * Sets ith "dataValidation" element
     */
    void setDataValidationArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation dataValidation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataValidation" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation insertNewDataValidation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataValidation" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation addNewDataValidation();
    
    /**
     * Removes the ith "dataValidation" element
     */
    void removeDataValidation(int i);
    
    /**
     * Gets the "disablePrompts" attribute
     */
    boolean getDisablePrompts();
    
    /**
     * Gets (as xml) the "disablePrompts" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDisablePrompts();
    
    /**
     * True if has "disablePrompts" attribute
     */
    boolean isSetDisablePrompts();
    
    /**
     * Sets the "disablePrompts" attribute
     */
    void setDisablePrompts(boolean disablePrompts);
    
    /**
     * Sets (as xml) the "disablePrompts" attribute
     */
    void xsetDisablePrompts(org.apache.xmlbeans.XmlBoolean disablePrompts);
    
    /**
     * Unsets the "disablePrompts" attribute
     */
    void unsetDisablePrompts();
    
    /**
     * Gets the "xWindow" attribute
     */
    long getXWindow();
    
    /**
     * Gets (as xml) the "xWindow" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetXWindow();
    
    /**
     * True if has "xWindow" attribute
     */
    boolean isSetXWindow();
    
    /**
     * Sets the "xWindow" attribute
     */
    void setXWindow(long xWindow);
    
    /**
     * Sets (as xml) the "xWindow" attribute
     */
    void xsetXWindow(org.apache.xmlbeans.XmlUnsignedInt xWindow);
    
    /**
     * Unsets the "xWindow" attribute
     */
    void unsetXWindow();
    
    /**
     * Gets the "yWindow" attribute
     */
    long getYWindow();
    
    /**
     * Gets (as xml) the "yWindow" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetYWindow();
    
    /**
     * True if has "yWindow" attribute
     */
    boolean isSetYWindow();
    
    /**
     * Sets the "yWindow" attribute
     */
    void setYWindow(long yWindow);
    
    /**
     * Sets (as xml) the "yWindow" attribute
     */
    void xsetYWindow(org.apache.xmlbeans.XmlUnsignedInt yWindow);
    
    /**
     * Unsets the "yWindow" attribute
     */
    void unsetYWindow();
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

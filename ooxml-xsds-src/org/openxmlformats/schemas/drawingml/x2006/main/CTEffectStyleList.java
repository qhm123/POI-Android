/*
 * XML Type:  CT_EffectStyleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_EffectStyleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTEffectStyleList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEffectStyleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cteffectstylelistc50ftype");
    
    /**
     * Gets a List of "effectStyle" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem> getEffectStyleList();
    
    /**
     * Gets array of all "effectStyle" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem[] getEffectStyleArray();
    
    /**
     * Gets ith "effectStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem getEffectStyleArray(int i);
    
    /**
     * Returns number of "effectStyle" element
     */
    int sizeOfEffectStyleArray();
    
    /**
     * Sets array of all "effectStyle" element
     */
    void setEffectStyleArray(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem[] effectStyleArray);
    
    /**
     * Sets ith "effectStyle" element
     */
    void setEffectStyleArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem effectStyle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "effectStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem insertNewEffectStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "effectStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem addNewEffectStyle();
    
    /**
     * Removes the ith "effectStyle" element
     */
    void removeEffectStyle(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

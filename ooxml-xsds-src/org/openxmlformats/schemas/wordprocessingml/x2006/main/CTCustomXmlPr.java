/*
 * XML Type:  CT_CustomXmlPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_CustomXmlPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomXmlPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomXmlPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomxmlpr4b8atype");
    
    /**
     * Gets the "placeholder" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getPlaceholder();
    
    /**
     * True if has "placeholder" element
     */
    boolean isSetPlaceholder();
    
    /**
     * Sets the "placeholder" element
     */
    void setPlaceholder(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString placeholder);
    
    /**
     * Appends and returns a new empty "placeholder" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewPlaceholder();
    
    /**
     * Unsets the "placeholder" element
     */
    void unsetPlaceholder();
    
    /**
     * Gets a List of "attr" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr> getAttrList();
    
    /**
     * Gets array of all "attr" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr[] getAttrArray();
    
    /**
     * Gets ith "attr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr getAttrArray(int i);
    
    /**
     * Returns number of "attr" element
     */
    int sizeOfAttrArray();
    
    /**
     * Sets array of all "attr" element
     */
    void setAttrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr[] attrArray);
    
    /**
     * Sets ith "attr" element
     */
    void setAttrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr attr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr insertNewAttr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr addNewAttr();
    
    /**
     * Removes the ith "attr" element
     */
    void removeAttr(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_TLTemplateList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLTemplateList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLTemplateList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLTemplateList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttltemplatelist7ab5type");
    
    /**
     * Gets a List of "tmpl" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate> getTmplList();
    
    /**
     * Gets array of all "tmpl" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate[] getTmplArray();
    
    /**
     * Gets ith "tmpl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate getTmplArray(int i);
    
    /**
     * Returns number of "tmpl" element
     */
    int sizeOfTmplArray();
    
    /**
     * Sets array of all "tmpl" element
     */
    void setTmplArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate[] tmplArray);
    
    /**
     * Sets ith "tmpl" element
     */
    void setTmplArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate tmpl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tmpl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate insertNewTmpl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tmpl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate addNewTmpl();
    
    /**
     * Removes the ith "tmpl" element
     */
    void removeTmpl(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

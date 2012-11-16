/*
 * XML Type:  CT_MdxMetadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MdxMetadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMdxMetadata extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMdxMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmdxmetadatadceftype");
    
    /**
     * Gets a List of "mdx" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx> getMdxList();
    
    /**
     * Gets array of all "mdx" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx[] getMdxArray();
    
    /**
     * Gets ith "mdx" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx getMdxArray(int i);
    
    /**
     * Returns number of "mdx" element
     */
    int sizeOfMdxArray();
    
    /**
     * Sets array of all "mdx" element
     */
    void setMdxArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx[] mdxArray);
    
    /**
     * Sets ith "mdx" element
     */
    void setMdxArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx mdx);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mdx" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx insertNewMdx(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mdx" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx addNewMdx();
    
    /**
     * Removes the ith "mdx" element
     */
    void removeMdx(int i);
    
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

/*
 * XML Type:  CT_DataConsolidate
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DataConsolidate(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataConsolidate extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDataConsolidate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdataconsolidate941etype");
    
    /**
     * Gets the "dataRefs" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs getDataRefs();
    
    /**
     * True if has "dataRefs" element
     */
    boolean isSetDataRefs();
    
    /**
     * Sets the "dataRefs" element
     */
    void setDataRefs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs dataRefs);
    
    /**
     * Appends and returns a new empty "dataRefs" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs addNewDataRefs();
    
    /**
     * Unsets the "dataRefs" element
     */
    void unsetDataRefs();
    
    /**
     * Gets the "function" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum getFunction();
    
    /**
     * Gets (as xml) the "function" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction xgetFunction();
    
    /**
     * True if has "function" attribute
     */
    boolean isSetFunction();
    
    /**
     * Sets the "function" attribute
     */
    void setFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum function);
    
    /**
     * Sets (as xml) the "function" attribute
     */
    void xsetFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction function);
    
    /**
     * Unsets the "function" attribute
     */
    void unsetFunction();
    
    /**
     * Gets the "leftLabels" attribute
     */
    boolean getLeftLabels();
    
    /**
     * Gets (as xml) the "leftLabels" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLeftLabels();
    
    /**
     * True if has "leftLabels" attribute
     */
    boolean isSetLeftLabels();
    
    /**
     * Sets the "leftLabels" attribute
     */
    void setLeftLabels(boolean leftLabels);
    
    /**
     * Sets (as xml) the "leftLabels" attribute
     */
    void xsetLeftLabels(org.apache.xmlbeans.XmlBoolean leftLabels);
    
    /**
     * Unsets the "leftLabels" attribute
     */
    void unsetLeftLabels();
    
    /**
     * Gets the "topLabels" attribute
     */
    boolean getTopLabels();
    
    /**
     * Gets (as xml) the "topLabels" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTopLabels();
    
    /**
     * True if has "topLabels" attribute
     */
    boolean isSetTopLabels();
    
    /**
     * Sets the "topLabels" attribute
     */
    void setTopLabels(boolean topLabels);
    
    /**
     * Sets (as xml) the "topLabels" attribute
     */
    void xsetTopLabels(org.apache.xmlbeans.XmlBoolean topLabels);
    
    /**
     * Unsets the "topLabels" attribute
     */
    void unsetTopLabels();
    
    /**
     * Gets the "link" attribute
     */
    boolean getLink();
    
    /**
     * Gets (as xml) the "link" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLink();
    
    /**
     * True if has "link" attribute
     */
    boolean isSetLink();
    
    /**
     * Sets the "link" attribute
     */
    void setLink(boolean link);
    
    /**
     * Sets (as xml) the "link" attribute
     */
    void xsetLink(org.apache.xmlbeans.XmlBoolean link);
    
    /**
     * Unsets the "link" attribute
     */
    void unsetLink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

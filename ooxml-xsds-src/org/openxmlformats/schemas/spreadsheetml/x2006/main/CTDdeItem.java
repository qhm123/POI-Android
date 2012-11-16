/*
 * XML Type:  CT_DdeItem
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DdeItem(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDdeItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDdeItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctddeitem9cf7type");
    
    /**
     * Gets the "values" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues getValues();
    
    /**
     * True if has "values" element
     */
    boolean isSetValues();
    
    /**
     * Sets the "values" element
     */
    void setValues(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues values);
    
    /**
     * Appends and returns a new empty "values" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues addNewValues();
    
    /**
     * Unsets the "values" element
     */
    void unsetValues();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "ole" attribute
     */
    boolean getOle();
    
    /**
     * Gets (as xml) the "ole" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOle();
    
    /**
     * True if has "ole" attribute
     */
    boolean isSetOle();
    
    /**
     * Sets the "ole" attribute
     */
    void setOle(boolean ole);
    
    /**
     * Sets (as xml) the "ole" attribute
     */
    void xsetOle(org.apache.xmlbeans.XmlBoolean ole);
    
    /**
     * Unsets the "ole" attribute
     */
    void unsetOle();
    
    /**
     * Gets the "advise" attribute
     */
    boolean getAdvise();
    
    /**
     * Gets (as xml) the "advise" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAdvise();
    
    /**
     * True if has "advise" attribute
     */
    boolean isSetAdvise();
    
    /**
     * Sets the "advise" attribute
     */
    void setAdvise(boolean advise);
    
    /**
     * Sets (as xml) the "advise" attribute
     */
    void xsetAdvise(org.apache.xmlbeans.XmlBoolean advise);
    
    /**
     * Unsets the "advise" attribute
     */
    void unsetAdvise();
    
    /**
     * Gets the "preferPic" attribute
     */
    boolean getPreferPic();
    
    /**
     * Gets (as xml) the "preferPic" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPreferPic();
    
    /**
     * True if has "preferPic" attribute
     */
    boolean isSetPreferPic();
    
    /**
     * Sets the "preferPic" attribute
     */
    void setPreferPic(boolean preferPic);
    
    /**
     * Sets (as xml) the "preferPic" attribute
     */
    void xsetPreferPic(org.apache.xmlbeans.XmlBoolean preferPic);
    
    /**
     * Unsets the "preferPic" attribute
     */
    void unsetPreferPic();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_FieldGroup
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_FieldGroup(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFieldGroup extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFieldGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfieldgroupe2eetype");
    
    /**
     * Gets the "rangePr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr getRangePr();
    
    /**
     * True if has "rangePr" element
     */
    boolean isSetRangePr();
    
    /**
     * Sets the "rangePr" element
     */
    void setRangePr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr rangePr);
    
    /**
     * Appends and returns a new empty "rangePr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr addNewRangePr();
    
    /**
     * Unsets the "rangePr" element
     */
    void unsetRangePr();
    
    /**
     * Gets the "discretePr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr getDiscretePr();
    
    /**
     * True if has "discretePr" element
     */
    boolean isSetDiscretePr();
    
    /**
     * Sets the "discretePr" element
     */
    void setDiscretePr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr discretePr);
    
    /**
     * Appends and returns a new empty "discretePr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr addNewDiscretePr();
    
    /**
     * Unsets the "discretePr" element
     */
    void unsetDiscretePr();
    
    /**
     * Gets the "groupItems" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems getGroupItems();
    
    /**
     * True if has "groupItems" element
     */
    boolean isSetGroupItems();
    
    /**
     * Sets the "groupItems" element
     */
    void setGroupItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems groupItems);
    
    /**
     * Appends and returns a new empty "groupItems" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems addNewGroupItems();
    
    /**
     * Unsets the "groupItems" element
     */
    void unsetGroupItems();
    
    /**
     * Gets the "par" attribute
     */
    long getPar();
    
    /**
     * Gets (as xml) the "par" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetPar();
    
    /**
     * True if has "par" attribute
     */
    boolean isSetPar();
    
    /**
     * Sets the "par" attribute
     */
    void setPar(long par);
    
    /**
     * Sets (as xml) the "par" attribute
     */
    void xsetPar(org.apache.xmlbeans.XmlUnsignedInt par);
    
    /**
     * Unsets the "par" attribute
     */
    void unsetPar();
    
    /**
     * Gets the "base" attribute
     */
    long getBase();
    
    /**
     * Gets (as xml) the "base" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetBase();
    
    /**
     * True if has "base" attribute
     */
    boolean isSetBase();
    
    /**
     * Sets the "base" attribute
     */
    void setBase(long base);
    
    /**
     * Sets (as xml) the "base" attribute
     */
    void xsetBase(org.apache.xmlbeans.XmlUnsignedInt base);
    
    /**
     * Unsets the "base" attribute
     */
    void unsetBase();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

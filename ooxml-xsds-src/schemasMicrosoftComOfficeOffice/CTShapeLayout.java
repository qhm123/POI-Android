/*
 * XML Type:  CT_ShapeLayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTShapeLayout
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_ShapeLayout(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTShapeLayout extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTShapeLayout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctshapelayoutbda4type");
    
    /**
     * Gets the "idmap" element
     */
    schemasMicrosoftComOfficeOffice.CTIdMap getIdmap();
    
    /**
     * True if has "idmap" element
     */
    boolean isSetIdmap();
    
    /**
     * Sets the "idmap" element
     */
    void setIdmap(schemasMicrosoftComOfficeOffice.CTIdMap idmap);
    
    /**
     * Appends and returns a new empty "idmap" element
     */
    schemasMicrosoftComOfficeOffice.CTIdMap addNewIdmap();
    
    /**
     * Unsets the "idmap" element
     */
    void unsetIdmap();
    
    /**
     * Gets the "regrouptable" element
     */
    schemasMicrosoftComOfficeOffice.CTRegroupTable getRegrouptable();
    
    /**
     * True if has "regrouptable" element
     */
    boolean isSetRegrouptable();
    
    /**
     * Sets the "regrouptable" element
     */
    void setRegrouptable(schemasMicrosoftComOfficeOffice.CTRegroupTable regrouptable);
    
    /**
     * Appends and returns a new empty "regrouptable" element
     */
    schemasMicrosoftComOfficeOffice.CTRegroupTable addNewRegrouptable();
    
    /**
     * Unsets the "regrouptable" element
     */
    void unsetRegrouptable();
    
    /**
     * Gets the "rules" element
     */
    schemasMicrosoftComOfficeOffice.CTRules getRules();
    
    /**
     * True if has "rules" element
     */
    boolean isSetRules();
    
    /**
     * Sets the "rules" element
     */
    void setRules(schemasMicrosoftComOfficeOffice.CTRules rules);
    
    /**
     * Appends and returns a new empty "rules" element
     */
    schemasMicrosoftComOfficeOffice.CTRules addNewRules();
    
    /**
     * Unsets the "rules" element
     */
    void unsetRules();
    
    /**
     * Gets the "ext" attribute
     */
    schemasMicrosoftComVml.STExt.Enum getExt();
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    schemasMicrosoftComVml.STExt xgetExt();
    
    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();
    
    /**
     * Sets the "ext" attribute
     */
    void setExt(schemasMicrosoftComVml.STExt.Enum ext);
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(schemasMicrosoftComVml.STExt ext);
    
    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_RelationTable
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRelationTable
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_RelationTable(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRelationTable extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRelationTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrelationtable9cebtype");
    
    /**
     * Gets a List of "rel" elements
     */
    java.util.List<schemasMicrosoftComOfficeOffice.CTRelation> getRelList();
    
    /**
     * Gets array of all "rel" elements
     * @deprecated
     */
    schemasMicrosoftComOfficeOffice.CTRelation[] getRelArray();
    
    /**
     * Gets ith "rel" element
     */
    schemasMicrosoftComOfficeOffice.CTRelation getRelArray(int i);
    
    /**
     * Returns number of "rel" element
     */
    int sizeOfRelArray();
    
    /**
     * Sets array of all "rel" element
     */
    void setRelArray(schemasMicrosoftComOfficeOffice.CTRelation[] relArray);
    
    /**
     * Sets ith "rel" element
     */
    void setRelArray(int i, schemasMicrosoftComOfficeOffice.CTRelation rel);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rel" element
     */
    schemasMicrosoftComOfficeOffice.CTRelation insertNewRel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rel" element
     */
    schemasMicrosoftComOfficeOffice.CTRelation addNewRel();
    
    /**
     * Removes the ith "rel" element
     */
    void removeRel(int i);
    
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

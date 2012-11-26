/*
 * XML Type:  CT_NonVisualConnectorProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_NonVisualConnectorProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNonVisualConnectorProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNonVisualConnectorProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnonvisualconnectorproperties6f8etype");
    
    /**
     * Gets the "cxnSpLocks" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking getCxnSpLocks();
    
    /**
     * True if has "cxnSpLocks" element
     */
    boolean isSetCxnSpLocks();
    
    /**
     * Sets the "cxnSpLocks" element
     */
    void setCxnSpLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking cxnSpLocks);
    
    /**
     * Appends and returns a new empty "cxnSpLocks" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking addNewCxnSpLocks();
    
    /**
     * Unsets the "cxnSpLocks" element
     */
    void unsetCxnSpLocks();
    
    /**
     * Gets the "stCxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnection getStCxn();
    
    /**
     * True if has "stCxn" element
     */
    boolean isSetStCxn();
    
    /**
     * Sets the "stCxn" element
     */
    void setStCxn(org.openxmlformats.schemas.drawingml.x2006.main.CTConnection stCxn);
    
    /**
     * Appends and returns a new empty "stCxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnection addNewStCxn();
    
    /**
     * Unsets the "stCxn" element
     */
    void unsetStCxn();
    
    /**
     * Gets the "endCxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnection getEndCxn();
    
    /**
     * True if has "endCxn" element
     */
    boolean isSetEndCxn();
    
    /**
     * Sets the "endCxn" element
     */
    void setEndCxn(org.openxmlformats.schemas.drawingml.x2006.main.CTConnection endCxn);
    
    /**
     * Appends and returns a new empty "endCxn" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnection addNewEndCxn();
    
    /**
     * Unsets the "endCxn" element
     */
    void unsetEndCxn();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

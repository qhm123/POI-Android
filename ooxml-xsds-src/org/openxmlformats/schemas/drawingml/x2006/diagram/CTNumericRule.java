/*
 * XML Type:  CT_NumericRule
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_NumericRule(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTNumericRule extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNumericRule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnumericrule4e52type");
    
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
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType type);
    
    /**
     * Gets the "for" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum getFor();
    
    /**
     * Gets (as xml) the "for" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship xgetFor();
    
    /**
     * True if has "for" attribute
     */
    boolean isSetFor();
    
    /**
     * Sets the "for" attribute
     */
    void setFor(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum xfor);
    
    /**
     * Sets (as xml) the "for" attribute
     */
    void xsetFor(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship xfor);
    
    /**
     * Unsets the "for" attribute
     */
    void unsetFor();
    
    /**
     * Gets the "forName" attribute
     */
    java.lang.String getForName();
    
    /**
     * Gets (as xml) the "forName" attribute
     */
    org.apache.xmlbeans.XmlString xgetForName();
    
    /**
     * True if has "forName" attribute
     */
    boolean isSetForName();
    
    /**
     * Sets the "forName" attribute
     */
    void setForName(java.lang.String forName);
    
    /**
     * Sets (as xml) the "forName" attribute
     */
    void xsetForName(org.apache.xmlbeans.XmlString forName);
    
    /**
     * Unsets the "forName" attribute
     */
    void unsetForName();
    
    /**
     * Gets the "ptType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum getPtType();
    
    /**
     * Gets (as xml) the "ptType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType xgetPtType();
    
    /**
     * True if has "ptType" attribute
     */
    boolean isSetPtType();
    
    /**
     * Sets the "ptType" attribute
     */
    void setPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum ptType);
    
    /**
     * Sets (as xml) the "ptType" attribute
     */
    void xsetPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType ptType);
    
    /**
     * Unsets the "ptType" attribute
     */
    void unsetPtType();
    
    /**
     * Gets the "val" attribute
     */
    double getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(double val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.apache.xmlbeans.XmlDouble val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * Gets the "fact" attribute
     */
    double getFact();
    
    /**
     * Gets (as xml) the "fact" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetFact();
    
    /**
     * True if has "fact" attribute
     */
    boolean isSetFact();
    
    /**
     * Sets the "fact" attribute
     */
    void setFact(double fact);
    
    /**
     * Sets (as xml) the "fact" attribute
     */
    void xsetFact(org.apache.xmlbeans.XmlDouble fact);
    
    /**
     * Unsets the "fact" attribute
     */
    void unsetFact();
    
    /**
     * Gets the "max" attribute
     */
    double getMax();
    
    /**
     * Gets (as xml) the "max" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetMax();
    
    /**
     * True if has "max" attribute
     */
    boolean isSetMax();
    
    /**
     * Sets the "max" attribute
     */
    void setMax(double max);
    
    /**
     * Sets (as xml) the "max" attribute
     */
    void xsetMax(org.apache.xmlbeans.XmlDouble max);
    
    /**
     * Unsets the "max" attribute
     */
    void unsetMax();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

/*
 * XML Type:  CT_Constraint
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_Constraint(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTConstraint extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTConstraint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctconstrainte8b4type");
    
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
     * Gets the "refType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum getRefType();
    
    /**
     * Gets (as xml) the "refType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType xgetRefType();
    
    /**
     * True if has "refType" attribute
     */
    boolean isSetRefType();
    
    /**
     * Sets the "refType" attribute
     */
    void setRefType(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum refType);
    
    /**
     * Sets (as xml) the "refType" attribute
     */
    void xsetRefType(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType refType);
    
    /**
     * Unsets the "refType" attribute
     */
    void unsetRefType();
    
    /**
     * Gets the "refFor" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum getRefFor();
    
    /**
     * Gets (as xml) the "refFor" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship xgetRefFor();
    
    /**
     * True if has "refFor" attribute
     */
    boolean isSetRefFor();
    
    /**
     * Sets the "refFor" attribute
     */
    void setRefFor(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum refFor);
    
    /**
     * Sets (as xml) the "refFor" attribute
     */
    void xsetRefFor(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship refFor);
    
    /**
     * Unsets the "refFor" attribute
     */
    void unsetRefFor();
    
    /**
     * Gets the "refForName" attribute
     */
    java.lang.String getRefForName();
    
    /**
     * Gets (as xml) the "refForName" attribute
     */
    org.apache.xmlbeans.XmlString xgetRefForName();
    
    /**
     * True if has "refForName" attribute
     */
    boolean isSetRefForName();
    
    /**
     * Sets the "refForName" attribute
     */
    void setRefForName(java.lang.String refForName);
    
    /**
     * Sets (as xml) the "refForName" attribute
     */
    void xsetRefForName(org.apache.xmlbeans.XmlString refForName);
    
    /**
     * Unsets the "refForName" attribute
     */
    void unsetRefForName();
    
    /**
     * Gets the "refPtType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum getRefPtType();
    
    /**
     * Gets (as xml) the "refPtType" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType xgetRefPtType();
    
    /**
     * True if has "refPtType" attribute
     */
    boolean isSetRefPtType();
    
    /**
     * Sets the "refPtType" attribute
     */
    void setRefPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum refPtType);
    
    /**
     * Sets (as xml) the "refPtType" attribute
     */
    void xsetRefPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType refPtType);
    
    /**
     * Unsets the "refPtType" attribute
     */
    void unsetRefPtType();
    
    /**
     * Gets the "op" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STBoolOperator.Enum getOp();
    
    /**
     * Gets (as xml) the "op" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STBoolOperator xgetOp();
    
    /**
     * True if has "op" attribute
     */
    boolean isSetOp();
    
    /**
     * Sets the "op" attribute
     */
    void setOp(org.openxmlformats.schemas.drawingml.x2006.diagram.STBoolOperator.Enum op);
    
    /**
     * Sets (as xml) the "op" attribute
     */
    void xsetOp(org.openxmlformats.schemas.drawingml.x2006.diagram.STBoolOperator op);
    
    /**
     * Unsets the "op" attribute
     */
    void unsetOp();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

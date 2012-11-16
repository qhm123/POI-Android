/*
 * XML Type:  CT_Drawing
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Drawing(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDrawing extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDrawing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdrawing8d34type");
    
    /**
     * Gets a List of "anchor" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor> getAnchorList();
    
    /**
     * Gets array of all "anchor" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor[] getAnchorArray();
    
    /**
     * Gets ith "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor getAnchorArray(int i);
    
    /**
     * Returns number of "anchor" element
     */
    int sizeOfAnchorArray();
    
    /**
     * Sets array of all "anchor" element
     */
    void setAnchorArray(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor[] anchorArray);
    
    /**
     * Sets ith "anchor" element
     */
    void setAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor anchor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor insertNewAnchor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor addNewAnchor();
    
    /**
     * Removes the ith "anchor" element
     */
    void removeAnchor(int i);
    
    /**
     * Gets a List of "inline" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline> getInlineList();
    
    /**
     * Gets array of all "inline" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline[] getInlineArray();
    
    /**
     * Gets ith "inline" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline getInlineArray(int i);
    
    /**
     * Returns number of "inline" element
     */
    int sizeOfInlineArray();
    
    /**
     * Sets array of all "inline" element
     */
    void setInlineArray(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline[] inlineArray);
    
    /**
     * Sets ith "inline" element
     */
    void setInlineArray(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline inline);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inline" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline insertNewInline(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inline" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline addNewInline();
    
    /**
     * Removes the ith "inline" element
     */
    void removeInline(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

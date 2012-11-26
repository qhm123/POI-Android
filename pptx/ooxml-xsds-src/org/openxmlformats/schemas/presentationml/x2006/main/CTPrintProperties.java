/*
 * XML Type:  CT_PrintProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_PrintProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPrintProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPrintProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctprintproperties6e0ftype");
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "prnWhat" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.Enum getPrnWhat();
    
    /**
     * Gets (as xml) the "prnWhat" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat xgetPrnWhat();
    
    /**
     * True if has "prnWhat" attribute
     */
    boolean isSetPrnWhat();
    
    /**
     * Sets the "prnWhat" attribute
     */
    void setPrnWhat(org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.Enum prnWhat);
    
    /**
     * Sets (as xml) the "prnWhat" attribute
     */
    void xsetPrnWhat(org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat prnWhat);
    
    /**
     * Unsets the "prnWhat" attribute
     */
    void unsetPrnWhat();
    
    /**
     * Gets the "clrMode" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode.Enum getClrMode();
    
    /**
     * Gets (as xml) the "clrMode" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode xgetClrMode();
    
    /**
     * True if has "clrMode" attribute
     */
    boolean isSetClrMode();
    
    /**
     * Sets the "clrMode" attribute
     */
    void setClrMode(org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode.Enum clrMode);
    
    /**
     * Sets (as xml) the "clrMode" attribute
     */
    void xsetClrMode(org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode clrMode);
    
    /**
     * Unsets the "clrMode" attribute
     */
    void unsetClrMode();
    
    /**
     * Gets the "hiddenSlides" attribute
     */
    boolean getHiddenSlides();
    
    /**
     * Gets (as xml) the "hiddenSlides" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHiddenSlides();
    
    /**
     * True if has "hiddenSlides" attribute
     */
    boolean isSetHiddenSlides();
    
    /**
     * Sets the "hiddenSlides" attribute
     */
    void setHiddenSlides(boolean hiddenSlides);
    
    /**
     * Sets (as xml) the "hiddenSlides" attribute
     */
    void xsetHiddenSlides(org.apache.xmlbeans.XmlBoolean hiddenSlides);
    
    /**
     * Unsets the "hiddenSlides" attribute
     */
    void unsetHiddenSlides();
    
    /**
     * Gets the "scaleToFitPaper" attribute
     */
    boolean getScaleToFitPaper();
    
    /**
     * Gets (as xml) the "scaleToFitPaper" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetScaleToFitPaper();
    
    /**
     * True if has "scaleToFitPaper" attribute
     */
    boolean isSetScaleToFitPaper();
    
    /**
     * Sets the "scaleToFitPaper" attribute
     */
    void setScaleToFitPaper(boolean scaleToFitPaper);
    
    /**
     * Sets (as xml) the "scaleToFitPaper" attribute
     */
    void xsetScaleToFitPaper(org.apache.xmlbeans.XmlBoolean scaleToFitPaper);
    
    /**
     * Unsets the "scaleToFitPaper" attribute
     */
    void unsetScaleToFitPaper();
    
    /**
     * Gets the "frameSlides" attribute
     */
    boolean getFrameSlides();
    
    /**
     * Gets (as xml) the "frameSlides" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFrameSlides();
    
    /**
     * True if has "frameSlides" attribute
     */
    boolean isSetFrameSlides();
    
    /**
     * Sets the "frameSlides" attribute
     */
    void setFrameSlides(boolean frameSlides);
    
    /**
     * Sets (as xml) the "frameSlides" attribute
     */
    void xsetFrameSlides(org.apache.xmlbeans.XmlBoolean frameSlides);
    
    /**
     * Unsets the "frameSlides" attribute
     */
    void unsetFrameSlides();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

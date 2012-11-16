/*
 * XML Type:  CT_PageSetup
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PageSetup(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPageSetup extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPageSetup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpagesetup534dtype");
    
    /**
     * Gets the "paperSize" attribute
     */
    long getPaperSize();
    
    /**
     * Gets (as xml) the "paperSize" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetPaperSize();
    
    /**
     * True if has "paperSize" attribute
     */
    boolean isSetPaperSize();
    
    /**
     * Sets the "paperSize" attribute
     */
    void setPaperSize(long paperSize);
    
    /**
     * Sets (as xml) the "paperSize" attribute
     */
    void xsetPaperSize(org.apache.xmlbeans.XmlUnsignedInt paperSize);
    
    /**
     * Unsets the "paperSize" attribute
     */
    void unsetPaperSize();
    
    /**
     * Gets the "scale" attribute
     */
    long getScale();
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetScale();
    
    /**
     * True if has "scale" attribute
     */
    boolean isSetScale();
    
    /**
     * Sets the "scale" attribute
     */
    void setScale(long scale);
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    void xsetScale(org.apache.xmlbeans.XmlUnsignedInt scale);
    
    /**
     * Unsets the "scale" attribute
     */
    void unsetScale();
    
    /**
     * Gets the "firstPageNumber" attribute
     */
    long getFirstPageNumber();
    
    /**
     * Gets (as xml) the "firstPageNumber" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFirstPageNumber();
    
    /**
     * True if has "firstPageNumber" attribute
     */
    boolean isSetFirstPageNumber();
    
    /**
     * Sets the "firstPageNumber" attribute
     */
    void setFirstPageNumber(long firstPageNumber);
    
    /**
     * Sets (as xml) the "firstPageNumber" attribute
     */
    void xsetFirstPageNumber(org.apache.xmlbeans.XmlUnsignedInt firstPageNumber);
    
    /**
     * Unsets the "firstPageNumber" attribute
     */
    void unsetFirstPageNumber();
    
    /**
     * Gets the "fitToWidth" attribute
     */
    long getFitToWidth();
    
    /**
     * Gets (as xml) the "fitToWidth" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFitToWidth();
    
    /**
     * True if has "fitToWidth" attribute
     */
    boolean isSetFitToWidth();
    
    /**
     * Sets the "fitToWidth" attribute
     */
    void setFitToWidth(long fitToWidth);
    
    /**
     * Sets (as xml) the "fitToWidth" attribute
     */
    void xsetFitToWidth(org.apache.xmlbeans.XmlUnsignedInt fitToWidth);
    
    /**
     * Unsets the "fitToWidth" attribute
     */
    void unsetFitToWidth();
    
    /**
     * Gets the "fitToHeight" attribute
     */
    long getFitToHeight();
    
    /**
     * Gets (as xml) the "fitToHeight" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFitToHeight();
    
    /**
     * True if has "fitToHeight" attribute
     */
    boolean isSetFitToHeight();
    
    /**
     * Sets the "fitToHeight" attribute
     */
    void setFitToHeight(long fitToHeight);
    
    /**
     * Sets (as xml) the "fitToHeight" attribute
     */
    void xsetFitToHeight(org.apache.xmlbeans.XmlUnsignedInt fitToHeight);
    
    /**
     * Unsets the "fitToHeight" attribute
     */
    void unsetFitToHeight();
    
    /**
     * Gets the "pageOrder" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder.Enum getPageOrder();
    
    /**
     * Gets (as xml) the "pageOrder" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder xgetPageOrder();
    
    /**
     * True if has "pageOrder" attribute
     */
    boolean isSetPageOrder();
    
    /**
     * Sets the "pageOrder" attribute
     */
    void setPageOrder(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder.Enum pageOrder);
    
    /**
     * Sets (as xml) the "pageOrder" attribute
     */
    void xsetPageOrder(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder pageOrder);
    
    /**
     * Unsets the "pageOrder" attribute
     */
    void unsetPageOrder();
    
    /**
     * Gets the "orientation" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation.Enum getOrientation();
    
    /**
     * Gets (as xml) the "orientation" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation xgetOrientation();
    
    /**
     * True if has "orientation" attribute
     */
    boolean isSetOrientation();
    
    /**
     * Sets the "orientation" attribute
     */
    void setOrientation(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation.Enum orientation);
    
    /**
     * Sets (as xml) the "orientation" attribute
     */
    void xsetOrientation(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation orientation);
    
    /**
     * Unsets the "orientation" attribute
     */
    void unsetOrientation();
    
    /**
     * Gets the "usePrinterDefaults" attribute
     */
    boolean getUsePrinterDefaults();
    
    /**
     * Gets (as xml) the "usePrinterDefaults" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUsePrinterDefaults();
    
    /**
     * True if has "usePrinterDefaults" attribute
     */
    boolean isSetUsePrinterDefaults();
    
    /**
     * Sets the "usePrinterDefaults" attribute
     */
    void setUsePrinterDefaults(boolean usePrinterDefaults);
    
    /**
     * Sets (as xml) the "usePrinterDefaults" attribute
     */
    void xsetUsePrinterDefaults(org.apache.xmlbeans.XmlBoolean usePrinterDefaults);
    
    /**
     * Unsets the "usePrinterDefaults" attribute
     */
    void unsetUsePrinterDefaults();
    
    /**
     * Gets the "blackAndWhite" attribute
     */
    boolean getBlackAndWhite();
    
    /**
     * Gets (as xml) the "blackAndWhite" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBlackAndWhite();
    
    /**
     * True if has "blackAndWhite" attribute
     */
    boolean isSetBlackAndWhite();
    
    /**
     * Sets the "blackAndWhite" attribute
     */
    void setBlackAndWhite(boolean blackAndWhite);
    
    /**
     * Sets (as xml) the "blackAndWhite" attribute
     */
    void xsetBlackAndWhite(org.apache.xmlbeans.XmlBoolean blackAndWhite);
    
    /**
     * Unsets the "blackAndWhite" attribute
     */
    void unsetBlackAndWhite();
    
    /**
     * Gets the "draft" attribute
     */
    boolean getDraft();
    
    /**
     * Gets (as xml) the "draft" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDraft();
    
    /**
     * True if has "draft" attribute
     */
    boolean isSetDraft();
    
    /**
     * Sets the "draft" attribute
     */
    void setDraft(boolean draft);
    
    /**
     * Sets (as xml) the "draft" attribute
     */
    void xsetDraft(org.apache.xmlbeans.XmlBoolean draft);
    
    /**
     * Unsets the "draft" attribute
     */
    void unsetDraft();
    
    /**
     * Gets the "cellComments" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments.Enum getCellComments();
    
    /**
     * Gets (as xml) the "cellComments" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments xgetCellComments();
    
    /**
     * True if has "cellComments" attribute
     */
    boolean isSetCellComments();
    
    /**
     * Sets the "cellComments" attribute
     */
    void setCellComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments.Enum cellComments);
    
    /**
     * Sets (as xml) the "cellComments" attribute
     */
    void xsetCellComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments cellComments);
    
    /**
     * Unsets the "cellComments" attribute
     */
    void unsetCellComments();
    
    /**
     * Gets the "useFirstPageNumber" attribute
     */
    boolean getUseFirstPageNumber();
    
    /**
     * Gets (as xml) the "useFirstPageNumber" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseFirstPageNumber();
    
    /**
     * True if has "useFirstPageNumber" attribute
     */
    boolean isSetUseFirstPageNumber();
    
    /**
     * Sets the "useFirstPageNumber" attribute
     */
    void setUseFirstPageNumber(boolean useFirstPageNumber);
    
    /**
     * Sets (as xml) the "useFirstPageNumber" attribute
     */
    void xsetUseFirstPageNumber(org.apache.xmlbeans.XmlBoolean useFirstPageNumber);
    
    /**
     * Unsets the "useFirstPageNumber" attribute
     */
    void unsetUseFirstPageNumber();
    
    /**
     * Gets the "errors" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError.Enum getErrors();
    
    /**
     * Gets (as xml) the "errors" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError xgetErrors();
    
    /**
     * True if has "errors" attribute
     */
    boolean isSetErrors();
    
    /**
     * Sets the "errors" attribute
     */
    void setErrors(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError.Enum errors);
    
    /**
     * Sets (as xml) the "errors" attribute
     */
    void xsetErrors(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError errors);
    
    /**
     * Unsets the "errors" attribute
     */
    void unsetErrors();
    
    /**
     * Gets the "horizontalDpi" attribute
     */
    long getHorizontalDpi();
    
    /**
     * Gets (as xml) the "horizontalDpi" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetHorizontalDpi();
    
    /**
     * True if has "horizontalDpi" attribute
     */
    boolean isSetHorizontalDpi();
    
    /**
     * Sets the "horizontalDpi" attribute
     */
    void setHorizontalDpi(long horizontalDpi);
    
    /**
     * Sets (as xml) the "horizontalDpi" attribute
     */
    void xsetHorizontalDpi(org.apache.xmlbeans.XmlUnsignedInt horizontalDpi);
    
    /**
     * Unsets the "horizontalDpi" attribute
     */
    void unsetHorizontalDpi();
    
    /**
     * Gets the "verticalDpi" attribute
     */
    long getVerticalDpi();
    
    /**
     * Gets (as xml) the "verticalDpi" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetVerticalDpi();
    
    /**
     * True if has "verticalDpi" attribute
     */
    boolean isSetVerticalDpi();
    
    /**
     * Sets the "verticalDpi" attribute
     */
    void setVerticalDpi(long verticalDpi);
    
    /**
     * Sets (as xml) the "verticalDpi" attribute
     */
    void xsetVerticalDpi(org.apache.xmlbeans.XmlUnsignedInt verticalDpi);
    
    /**
     * Unsets the "verticalDpi" attribute
     */
    void unsetVerticalDpi();
    
    /**
     * Gets the "copies" attribute
     */
    long getCopies();
    
    /**
     * Gets (as xml) the "copies" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCopies();
    
    /**
     * True if has "copies" attribute
     */
    boolean isSetCopies();
    
    /**
     * Sets the "copies" attribute
     */
    void setCopies(long copies);
    
    /**
     * Sets (as xml) the "copies" attribute
     */
    void xsetCopies(org.apache.xmlbeans.XmlUnsignedInt copies);
    
    /**
     * Unsets the "copies" attribute
     */
    void unsetCopies();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

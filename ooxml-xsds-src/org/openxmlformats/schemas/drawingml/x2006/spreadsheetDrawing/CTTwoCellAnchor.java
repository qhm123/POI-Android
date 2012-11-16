/*
 * XML Type:  CT_TwoCellAnchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;


/**
 * An XML CT_TwoCellAnchor(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public interface CTTwoCellAnchor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTwoCellAnchor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttwocellanchor1e8dtype");
    
    /**
     * Gets the "from" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker getFrom();
    
    /**
     * Sets the "from" element
     */
    void setFrom(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker from);
    
    /**
     * Appends and returns a new empty "from" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker addNewFrom();
    
    /**
     * Gets the "to" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker getTo();
    
    /**
     * Sets the "to" element
     */
    void setTo(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker to);
    
    /**
     * Appends and returns a new empty "to" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker addNewTo();
    
    /**
     * Gets the "sp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape getSp();
    
    /**
     * True if has "sp" element
     */
    boolean isSetSp();
    
    /**
     * Sets the "sp" element
     */
    void setSp(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape sp);
    
    /**
     * Appends and returns a new empty "sp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape addNewSp();
    
    /**
     * Unsets the "sp" element
     */
    void unsetSp();
    
    /**
     * Gets the "grpSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape getGrpSp();
    
    /**
     * True if has "grpSp" element
     */
    boolean isSetGrpSp();
    
    /**
     * Sets the "grpSp" element
     */
    void setGrpSp(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape grpSp);
    
    /**
     * Appends and returns a new empty "grpSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape addNewGrpSp();
    
    /**
     * Unsets the "grpSp" element
     */
    void unsetGrpSp();
    
    /**
     * Gets the "graphicFrame" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame getGraphicFrame();
    
    /**
     * True if has "graphicFrame" element
     */
    boolean isSetGraphicFrame();
    
    /**
     * Sets the "graphicFrame" element
     */
    void setGraphicFrame(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame graphicFrame);
    
    /**
     * Appends and returns a new empty "graphicFrame" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame addNewGraphicFrame();
    
    /**
     * Unsets the "graphicFrame" element
     */
    void unsetGraphicFrame();
    
    /**
     * Gets the "cxnSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector getCxnSp();
    
    /**
     * True if has "cxnSp" element
     */
    boolean isSetCxnSp();
    
    /**
     * Sets the "cxnSp" element
     */
    void setCxnSp(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector cxnSp);
    
    /**
     * Appends and returns a new empty "cxnSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector addNewCxnSp();
    
    /**
     * Unsets the "cxnSp" element
     */
    void unsetCxnSp();
    
    /**
     * Gets the "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture getPic();
    
    /**
     * True if has "pic" element
     */
    boolean isSetPic();
    
    /**
     * Sets the "pic" element
     */
    void setPic(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture pic);
    
    /**
     * Appends and returns a new empty "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture addNewPic();
    
    /**
     * Unsets the "pic" element
     */
    void unsetPic();
    
    /**
     * Gets the "clientData" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData getClientData();
    
    /**
     * Sets the "clientData" element
     */
    void setClientData(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData clientData);
    
    /**
     * Appends and returns a new empty "clientData" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData addNewClientData();
    
    /**
     * Gets the "editAs" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs.Enum getEditAs();
    
    /**
     * Gets (as xml) the "editAs" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs xgetEditAs();
    
    /**
     * True if has "editAs" attribute
     */
    boolean isSetEditAs();
    
    /**
     * Sets the "editAs" attribute
     */
    void setEditAs(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs.Enum editAs);
    
    /**
     * Sets (as xml) the "editAs" attribute
     */
    void xsetEditAs(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs editAs);
    
    /**
     * Unsets the "editAs" attribute
     */
    void unsetEditAs();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

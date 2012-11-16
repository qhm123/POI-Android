/*
 * XML Type:  CT_GroupShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;


/**
 * An XML CT_GroupShape(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public interface CTGroupShape extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGroupShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgroupshape6c36type");
    
    /**
     * Gets the "nvGrpSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual getNvGrpSpPr();
    
    /**
     * Sets the "nvGrpSpPr" element
     */
    void setNvGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual nvGrpSpPr);
    
    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual addNewNvGrpSpPr();
    
    /**
     * Gets the "grpSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties getGrpSpPr();
    
    /**
     * Sets the "grpSpPr" element
     */
    void setGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties grpSpPr);
    
    /**
     * Appends and returns a new empty "grpSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties addNewGrpSpPr();
    
    /**
     * Gets a List of "sp" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape> getSpList();
    
    /**
     * Gets array of all "sp" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape[] getSpArray();
    
    /**
     * Gets ith "sp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape getSpArray(int i);
    
    /**
     * Returns number of "sp" element
     */
    int sizeOfSpArray();
    
    /**
     * Sets array of all "sp" element
     */
    void setSpArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape[] spArray);
    
    /**
     * Sets ith "sp" element
     */
    void setSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape sp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape insertNewSp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape addNewSp();
    
    /**
     * Removes the ith "sp" element
     */
    void removeSp(int i);
    
    /**
     * Gets a List of "grpSp" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape> getGrpSpList();
    
    /**
     * Gets array of all "grpSp" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape[] getGrpSpArray();
    
    /**
     * Gets ith "grpSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape getGrpSpArray(int i);
    
    /**
     * Returns number of "grpSp" element
     */
    int sizeOfGrpSpArray();
    
    /**
     * Sets array of all "grpSp" element
     */
    void setGrpSpArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape[] grpSpArray);
    
    /**
     * Sets ith "grpSp" element
     */
    void setGrpSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape grpSp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "grpSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape insertNewGrpSp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape addNewGrpSp();
    
    /**
     * Removes the ith "grpSp" element
     */
    void removeGrpSp(int i);
    
    /**
     * Gets a List of "graphicFrame" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame> getGraphicFrameList();
    
    /**
     * Gets array of all "graphicFrame" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame[] getGraphicFrameArray();
    
    /**
     * Gets ith "graphicFrame" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame getGraphicFrameArray(int i);
    
    /**
     * Returns number of "graphicFrame" element
     */
    int sizeOfGraphicFrameArray();
    
    /**
     * Sets array of all "graphicFrame" element
     */
    void setGraphicFrameArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame[] graphicFrameArray);
    
    /**
     * Sets ith "graphicFrame" element
     */
    void setGraphicFrameArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame graphicFrame);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "graphicFrame" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame insertNewGraphicFrame(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicFrame" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame addNewGraphicFrame();
    
    /**
     * Removes the ith "graphicFrame" element
     */
    void removeGraphicFrame(int i);
    
    /**
     * Gets a List of "cxnSp" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector> getCxnSpList();
    
    /**
     * Gets array of all "cxnSp" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector[] getCxnSpArray();
    
    /**
     * Gets ith "cxnSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector getCxnSpArray(int i);
    
    /**
     * Returns number of "cxnSp" element
     */
    int sizeOfCxnSpArray();
    
    /**
     * Sets array of all "cxnSp" element
     */
    void setCxnSpArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector[] cxnSpArray);
    
    /**
     * Sets ith "cxnSp" element
     */
    void setCxnSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector cxnSp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cxnSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector insertNewCxnSp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxnSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector addNewCxnSp();
    
    /**
     * Removes the ith "cxnSp" element
     */
    void removeCxnSp(int i);
    
    /**
     * Gets a List of "pic" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture> getPicList();
    
    /**
     * Gets array of all "pic" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture[] getPicArray();
    
    /**
     * Gets ith "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture getPicArray(int i);
    
    /**
     * Returns number of "pic" element
     */
    int sizeOfPicArray();
    
    /**
     * Sets array of all "pic" element
     */
    void setPicArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture[] picArray);
    
    /**
     * Sets ith "pic" element
     */
    void setPicArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture pic);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture insertNewPic(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture addNewPic();
    
    /**
     * Removes the ith "pic" element
     */
    void removePic(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

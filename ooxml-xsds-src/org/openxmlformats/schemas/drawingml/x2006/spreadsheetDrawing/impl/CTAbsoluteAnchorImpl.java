/*
 * XML Type:  CT_AbsoluteAnchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * An XML CT_AbsoluteAnchor(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public class CTAbsoluteAnchorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor
{
    
    public CTAbsoluteAnchorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "pos");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "ext");
    private static final javax.xml.namespace.QName SP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "sp");
    private static final javax.xml.namespace.QName GRPSP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "grpSp");
    private static final javax.xml.namespace.QName GRAPHICFRAME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "graphicFrame");
    private static final javax.xml.namespace.QName CXNSP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cxnSp");
    private static final javax.xml.namespace.QName PIC$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "pic");
    private static final javax.xml.namespace.QName CLIENTDATA$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "clientData");
    
    
    /**
     * Gets the "pos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ext" element
     */
    public void setExt(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXT$2);
            }
            target.set(ext);
        }
    }
    
    /**
     * Appends and returns a new empty "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXT$2);
            return target;
        }
    }
    
    /**
     * Gets the "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape getSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().find_element_user(SP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sp" element
     */
    public boolean isSetSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SP$4) != 0;
        }
    }
    
    /**
     * Sets the "sp" element
     */
    public void setSp(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape sp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().find_element_user(SP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().add_element_user(SP$4);
            }
            target.set(sp);
        }
    }
    
    /**
     * Appends and returns a new empty "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape addNewSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().add_element_user(SP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sp" element
     */
    public void unsetSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SP$4, 0);
        }
    }
    
    /**
     * Gets the "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape getGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grpSp" element
     */
    public boolean isSetGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRPSP$6) != 0;
        }
    }
    
    /**
     * Sets the "grpSp" element
     */
    public void setGrpSp(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape grpSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().add_element_user(GRPSP$6);
            }
            target.set(grpSp);
        }
    }
    
    /**
     * Appends and returns a new empty "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape addNewGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().add_element_user(GRPSP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "grpSp" element
     */
    public void unsetGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRPSP$6, 0);
        }
    }
    
    /**
     * Gets the "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame getGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "graphicFrame" element
     */
    public boolean isSetGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHICFRAME$8) != 0;
        }
    }
    
    /**
     * Sets the "graphicFrame" element
     */
    public void setGraphicFrame(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame graphicFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().add_element_user(GRAPHICFRAME$8);
            }
            target.set(graphicFrame);
        }
    }
    
    /**
     * Appends and returns a new empty "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame addNewGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().add_element_user(GRAPHICFRAME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "graphicFrame" element
     */
    public void unsetGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHICFRAME$8, 0);
        }
    }
    
    /**
     * Gets the "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector getCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().find_element_user(CXNSP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cxnSp" element
     */
    public boolean isSetCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXNSP$10) != 0;
        }
    }
    
    /**
     * Sets the "cxnSp" element
     */
    public void setCxnSp(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector cxnSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().find_element_user(CXNSP$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().add_element_user(CXNSP$10);
            }
            target.set(cxnSp);
        }
    }
    
    /**
     * Appends and returns a new empty "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector addNewCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().add_element_user(CXNSP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "cxnSp" element
     */
    public void unsetCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXNSP$10, 0);
        }
    }
    
    /**
     * Gets the "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture getPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().find_element_user(PIC$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pic" element
     */
    public boolean isSetPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIC$12) != 0;
        }
    }
    
    /**
     * Sets the "pic" element
     */
    public void setPic(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().find_element_user(PIC$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().add_element_user(PIC$12);
            }
            target.set(pic);
        }
    }
    
    /**
     * Appends and returns a new empty "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().add_element_user(PIC$12);
            return target;
        }
    }
    
    /**
     * Unsets the "pic" element
     */
    public void unsetPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIC$12, 0);
        }
    }
    
    /**
     * Gets the "clientData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData getClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData)get_store().find_element_user(CLIENTDATA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clientData" element
     */
    public void setClientData(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData clientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData)get_store().find_element_user(CLIENTDATA$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData)get_store().add_element_user(CLIENTDATA$14);
            }
            target.set(clientData);
        }
    }
    
    /**
     * Appends and returns a new empty "clientData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData addNewClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData)get_store().add_element_user(CLIENTDATA$14);
            return target;
        }
    }
}

/*
 * XML Type:  CT_AbsSizeAnchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing.impl;
/**
 * An XML CT_AbsSizeAnchor(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public class CTAbsSizeAnchorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor
{
    
    public CTAbsSizeAnchorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FROM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "from");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "ext");
    private static final javax.xml.namespace.QName SP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "sp");
    private static final javax.xml.namespace.QName GRPSP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "grpSp");
    private static final javax.xml.namespace.QName GRAPHICFRAME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "graphicFrame");
    private static final javax.xml.namespace.QName CXNSP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "cxnSp");
    private static final javax.xml.namespace.QName PIC$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "pic");
    
    
    /**
     * Gets the "from" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker)get_store().find_element_user(FROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "from" element
     */
    public void setFrom(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker)get_store().find_element_user(FROM$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker)get_store().add_element_user(FROM$0);
            }
            target.set(from);
        }
    }
    
    /**
     * Appends and returns a new empty "from" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker addNewFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTMarker)get_store().add_element_user(FROM$0);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape getSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().find_element_user(SP$4, 0);
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
    public void setSp(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape sp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().find_element_user(SP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().add_element_user(SP$4);
            }
            target.set(sp);
        }
    }
    
    /**
     * Appends and returns a new empty "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape addNewSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().add_element_user(SP$4);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape getGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, 0);
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
    public void setGrpSp(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape grpSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().add_element_user(GRPSP$6);
            }
            target.set(grpSp);
        }
    }
    
    /**
     * Appends and returns a new empty "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape addNewGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().add_element_user(GRPSP$6);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame getGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().find_element_user(GRAPHICFRAME$8, 0);
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
    public void setGraphicFrame(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame graphicFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().find_element_user(GRAPHICFRAME$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().add_element_user(GRAPHICFRAME$8);
            }
            target.set(graphicFrame);
        }
    }
    
    /**
     * Appends and returns a new empty "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame addNewGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().add_element_user(GRAPHICFRAME$8);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector getCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().find_element_user(CXNSP$10, 0);
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
    public void setCxnSp(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector cxnSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().find_element_user(CXNSP$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().add_element_user(CXNSP$10);
            }
            target.set(cxnSp);
        }
    }
    
    /**
     * Appends and returns a new empty "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector addNewCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().add_element_user(CXNSP$10);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture getPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().find_element_user(PIC$12, 0);
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
    public void setPic(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().find_element_user(PIC$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().add_element_user(PIC$12);
            }
            target.set(pic);
        }
    }
    
    /**
     * Appends and returns a new empty "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().add_element_user(PIC$12);
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
}

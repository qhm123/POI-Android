/*
 * XML Type:  CT_ElemPropSet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_ElemPropSet(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTElemPropSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet
{
    
    public CTElemPropSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRESLAYOUTVARS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "presLayoutVars");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "style");
    private static final javax.xml.namespace.QName PRESASSOCID$4 = 
        new javax.xml.namespace.QName("", "presAssocID");
    private static final javax.xml.namespace.QName PRESNAME$6 = 
        new javax.xml.namespace.QName("", "presName");
    private static final javax.xml.namespace.QName PRESSTYLELBL$8 = 
        new javax.xml.namespace.QName("", "presStyleLbl");
    private static final javax.xml.namespace.QName PRESSTYLEIDX$10 = 
        new javax.xml.namespace.QName("", "presStyleIdx");
    private static final javax.xml.namespace.QName PRESSTYLECNT$12 = 
        new javax.xml.namespace.QName("", "presStyleCnt");
    private static final javax.xml.namespace.QName LOTYPEID$14 = 
        new javax.xml.namespace.QName("", "loTypeId");
    private static final javax.xml.namespace.QName LOCATID$16 = 
        new javax.xml.namespace.QName("", "loCatId");
    private static final javax.xml.namespace.QName QSTYPEID$18 = 
        new javax.xml.namespace.QName("", "qsTypeId");
    private static final javax.xml.namespace.QName QSCATID$20 = 
        new javax.xml.namespace.QName("", "qsCatId");
    private static final javax.xml.namespace.QName CSTYPEID$22 = 
        new javax.xml.namespace.QName("", "csTypeId");
    private static final javax.xml.namespace.QName CSCATID$24 = 
        new javax.xml.namespace.QName("", "csCatId");
    private static final javax.xml.namespace.QName COHERENT3DOFF$26 = 
        new javax.xml.namespace.QName("", "coherent3DOff");
    private static final javax.xml.namespace.QName PHLDRT$28 = 
        new javax.xml.namespace.QName("", "phldrT");
    private static final javax.xml.namespace.QName PHLDR$30 = 
        new javax.xml.namespace.QName("", "phldr");
    private static final javax.xml.namespace.QName CUSTANG$32 = 
        new javax.xml.namespace.QName("", "custAng");
    private static final javax.xml.namespace.QName CUSTFLIPVERT$34 = 
        new javax.xml.namespace.QName("", "custFlipVert");
    private static final javax.xml.namespace.QName CUSTFLIPHOR$36 = 
        new javax.xml.namespace.QName("", "custFlipHor");
    private static final javax.xml.namespace.QName CUSTSZX$38 = 
        new javax.xml.namespace.QName("", "custSzX");
    private static final javax.xml.namespace.QName CUSTSZY$40 = 
        new javax.xml.namespace.QName("", "custSzY");
    private static final javax.xml.namespace.QName CUSTSCALEX$42 = 
        new javax.xml.namespace.QName("", "custScaleX");
    private static final javax.xml.namespace.QName CUSTSCALEY$44 = 
        new javax.xml.namespace.QName("", "custScaleY");
    private static final javax.xml.namespace.QName CUSTT$46 = 
        new javax.xml.namespace.QName("", "custT");
    private static final javax.xml.namespace.QName CUSTLINFACTX$48 = 
        new javax.xml.namespace.QName("", "custLinFactX");
    private static final javax.xml.namespace.QName CUSTLINFACTY$50 = 
        new javax.xml.namespace.QName("", "custLinFactY");
    private static final javax.xml.namespace.QName CUSTLINFACTNEIGHBORX$52 = 
        new javax.xml.namespace.QName("", "custLinFactNeighborX");
    private static final javax.xml.namespace.QName CUSTLINFACTNEIGHBORY$54 = 
        new javax.xml.namespace.QName("", "custLinFactNeighborY");
    private static final javax.xml.namespace.QName CUSTRADSCALERAD$56 = 
        new javax.xml.namespace.QName("", "custRadScaleRad");
    private static final javax.xml.namespace.QName CUSTRADSCALEINC$58 = 
        new javax.xml.namespace.QName("", "custRadScaleInc");
    
    
    /**
     * Gets the "presLayoutVars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet getPresLayoutVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet)get_store().find_element_user(PRESLAYOUTVARS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "presLayoutVars" element
     */
    public boolean isSetPresLayoutVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESLAYOUTVARS$0) != 0;
        }
    }
    
    /**
     * Sets the "presLayoutVars" element
     */
    public void setPresLayoutVars(org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet presLayoutVars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet)get_store().find_element_user(PRESLAYOUTVARS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet)get_store().add_element_user(PRESLAYOUTVARS$0);
            }
            target.set(presLayoutVars);
        }
    }
    
    /**
     * Appends and returns a new empty "presLayoutVars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet addNewPresLayoutVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet)get_store().add_element_user(PRESLAYOUTVARS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "presLayoutVars" element
     */
    public void unsetPresLayoutVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESLAYOUTVARS$0, 0);
        }
    }
    
    /**
     * Gets the "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$2) != 0;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$2);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$2, 0);
        }
    }
    
    /**
     * Gets the "presAssocID" attribute
     */
    public java.lang.Object getPresAssocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESASSOCID$4);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "presAssocID" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetPresAssocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(PRESASSOCID$4);
            return target;
        }
    }
    
    /**
     * True if has "presAssocID" attribute
     */
    public boolean isSetPresAssocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESASSOCID$4) != null;
        }
    }
    
    /**
     * Sets the "presAssocID" attribute
     */
    public void setPresAssocID(java.lang.Object presAssocID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESASSOCID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESASSOCID$4);
            }
            target.setObjectValue(presAssocID);
        }
    }
    
    /**
     * Sets (as xml) the "presAssocID" attribute
     */
    public void xsetPresAssocID(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId presAssocID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(PRESASSOCID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(PRESASSOCID$4);
            }
            target.set(presAssocID);
        }
    }
    
    /**
     * Unsets the "presAssocID" attribute
     */
    public void unsetPresAssocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESASSOCID$4);
        }
    }
    
    /**
     * Gets the "presName" attribute
     */
    public java.lang.String getPresName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESNAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "presName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPresName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRESNAME$6);
            return target;
        }
    }
    
    /**
     * True if has "presName" attribute
     */
    public boolean isSetPresName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESNAME$6) != null;
        }
    }
    
    /**
     * Sets the "presName" attribute
     */
    public void setPresName(java.lang.String presName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESNAME$6);
            }
            target.setStringValue(presName);
        }
    }
    
    /**
     * Sets (as xml) the "presName" attribute
     */
    public void xsetPresName(org.apache.xmlbeans.XmlString presName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRESNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRESNAME$6);
            }
            target.set(presName);
        }
    }
    
    /**
     * Unsets the "presName" attribute
     */
    public void unsetPresName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESNAME$6);
        }
    }
    
    /**
     * Gets the "presStyleLbl" attribute
     */
    public java.lang.String getPresStyleLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSTYLELBL$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "presStyleLbl" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPresStyleLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRESSTYLELBL$8);
            return target;
        }
    }
    
    /**
     * True if has "presStyleLbl" attribute
     */
    public boolean isSetPresStyleLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESSTYLELBL$8) != null;
        }
    }
    
    /**
     * Sets the "presStyleLbl" attribute
     */
    public void setPresStyleLbl(java.lang.String presStyleLbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSTYLELBL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESSTYLELBL$8);
            }
            target.setStringValue(presStyleLbl);
        }
    }
    
    /**
     * Sets (as xml) the "presStyleLbl" attribute
     */
    public void xsetPresStyleLbl(org.apache.xmlbeans.XmlString presStyleLbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRESSTYLELBL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRESSTYLELBL$8);
            }
            target.set(presStyleLbl);
        }
    }
    
    /**
     * Unsets the "presStyleLbl" attribute
     */
    public void unsetPresStyleLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESSTYLELBL$8);
        }
    }
    
    /**
     * Gets the "presStyleIdx" attribute
     */
    public int getPresStyleIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSTYLEIDX$10);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "presStyleIdx" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPresStyleIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESSTYLEIDX$10);
            return target;
        }
    }
    
    /**
     * True if has "presStyleIdx" attribute
     */
    public boolean isSetPresStyleIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESSTYLEIDX$10) != null;
        }
    }
    
    /**
     * Sets the "presStyleIdx" attribute
     */
    public void setPresStyleIdx(int presStyleIdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSTYLEIDX$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESSTYLEIDX$10);
            }
            target.setIntValue(presStyleIdx);
        }
    }
    
    /**
     * Sets (as xml) the "presStyleIdx" attribute
     */
    public void xsetPresStyleIdx(org.apache.xmlbeans.XmlInt presStyleIdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESSTYLEIDX$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRESSTYLEIDX$10);
            }
            target.set(presStyleIdx);
        }
    }
    
    /**
     * Unsets the "presStyleIdx" attribute
     */
    public void unsetPresStyleIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESSTYLEIDX$10);
        }
    }
    
    /**
     * Gets the "presStyleCnt" attribute
     */
    public int getPresStyleCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSTYLECNT$12);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "presStyleCnt" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPresStyleCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESSTYLECNT$12);
            return target;
        }
    }
    
    /**
     * True if has "presStyleCnt" attribute
     */
    public boolean isSetPresStyleCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESSTYLECNT$12) != null;
        }
    }
    
    /**
     * Sets the "presStyleCnt" attribute
     */
    public void setPresStyleCnt(int presStyleCnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESSTYLECNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESSTYLECNT$12);
            }
            target.setIntValue(presStyleCnt);
        }
    }
    
    /**
     * Sets (as xml) the "presStyleCnt" attribute
     */
    public void xsetPresStyleCnt(org.apache.xmlbeans.XmlInt presStyleCnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESSTYLECNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRESSTYLECNT$12);
            }
            target.set(presStyleCnt);
        }
    }
    
    /**
     * Unsets the "presStyleCnt" attribute
     */
    public void unsetPresStyleCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESSTYLECNT$12);
        }
    }
    
    /**
     * Gets the "loTypeId" attribute
     */
    public java.lang.String getLoTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOTYPEID$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "loTypeId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLoTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOTYPEID$14);
            return target;
        }
    }
    
    /**
     * True if has "loTypeId" attribute
     */
    public boolean isSetLoTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOTYPEID$14) != null;
        }
    }
    
    /**
     * Sets the "loTypeId" attribute
     */
    public void setLoTypeId(java.lang.String loTypeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOTYPEID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOTYPEID$14);
            }
            target.setStringValue(loTypeId);
        }
    }
    
    /**
     * Sets (as xml) the "loTypeId" attribute
     */
    public void xsetLoTypeId(org.apache.xmlbeans.XmlString loTypeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOTYPEID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOTYPEID$14);
            }
            target.set(loTypeId);
        }
    }
    
    /**
     * Unsets the "loTypeId" attribute
     */
    public void unsetLoTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOTYPEID$14);
        }
    }
    
    /**
     * Gets the "loCatId" attribute
     */
    public java.lang.String getLoCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATID$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "loCatId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLoCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATID$16);
            return target;
        }
    }
    
    /**
     * True if has "loCatId" attribute
     */
    public boolean isSetLoCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCATID$16) != null;
        }
    }
    
    /**
     * Sets the "loCatId" attribute
     */
    public void setLoCatId(java.lang.String loCatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATID$16);
            }
            target.setStringValue(loCatId);
        }
    }
    
    /**
     * Sets (as xml) the "loCatId" attribute
     */
    public void xsetLoCatId(org.apache.xmlbeans.XmlString loCatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATID$16);
            }
            target.set(loCatId);
        }
    }
    
    /**
     * Unsets the "loCatId" attribute
     */
    public void unsetLoCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCATID$16);
        }
    }
    
    /**
     * Gets the "qsTypeId" attribute
     */
    public java.lang.String getQsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSTYPEID$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qsTypeId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetQsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QSTYPEID$18);
            return target;
        }
    }
    
    /**
     * True if has "qsTypeId" attribute
     */
    public boolean isSetQsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QSTYPEID$18) != null;
        }
    }
    
    /**
     * Sets the "qsTypeId" attribute
     */
    public void setQsTypeId(java.lang.String qsTypeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSTYPEID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QSTYPEID$18);
            }
            target.setStringValue(qsTypeId);
        }
    }
    
    /**
     * Sets (as xml) the "qsTypeId" attribute
     */
    public void xsetQsTypeId(org.apache.xmlbeans.XmlString qsTypeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QSTYPEID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QSTYPEID$18);
            }
            target.set(qsTypeId);
        }
    }
    
    /**
     * Unsets the "qsTypeId" attribute
     */
    public void unsetQsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QSTYPEID$18);
        }
    }
    
    /**
     * Gets the "qsCatId" attribute
     */
    public java.lang.String getQsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSCATID$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qsCatId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetQsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QSCATID$20);
            return target;
        }
    }
    
    /**
     * True if has "qsCatId" attribute
     */
    public boolean isSetQsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QSCATID$20) != null;
        }
    }
    
    /**
     * Sets the "qsCatId" attribute
     */
    public void setQsCatId(java.lang.String qsCatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSCATID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QSCATID$20);
            }
            target.setStringValue(qsCatId);
        }
    }
    
    /**
     * Sets (as xml) the "qsCatId" attribute
     */
    public void xsetQsCatId(org.apache.xmlbeans.XmlString qsCatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QSCATID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QSCATID$20);
            }
            target.set(qsCatId);
        }
    }
    
    /**
     * Unsets the "qsCatId" attribute
     */
    public void unsetQsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QSCATID$20);
        }
    }
    
    /**
     * Gets the "csTypeId" attribute
     */
    public java.lang.String getCsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSTYPEID$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "csTypeId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSTYPEID$22);
            return target;
        }
    }
    
    /**
     * True if has "csTypeId" attribute
     */
    public boolean isSetCsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CSTYPEID$22) != null;
        }
    }
    
    /**
     * Sets the "csTypeId" attribute
     */
    public void setCsTypeId(java.lang.String csTypeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSTYPEID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSTYPEID$22);
            }
            target.setStringValue(csTypeId);
        }
    }
    
    /**
     * Sets (as xml) the "csTypeId" attribute
     */
    public void xsetCsTypeId(org.apache.xmlbeans.XmlString csTypeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSTYPEID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CSTYPEID$22);
            }
            target.set(csTypeId);
        }
    }
    
    /**
     * Unsets the "csTypeId" attribute
     */
    public void unsetCsTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CSTYPEID$22);
        }
    }
    
    /**
     * Gets the "csCatId" attribute
     */
    public java.lang.String getCsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSCATID$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "csCatId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSCATID$24);
            return target;
        }
    }
    
    /**
     * True if has "csCatId" attribute
     */
    public boolean isSetCsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CSCATID$24) != null;
        }
    }
    
    /**
     * Sets the "csCatId" attribute
     */
    public void setCsCatId(java.lang.String csCatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSCATID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSCATID$24);
            }
            target.setStringValue(csCatId);
        }
    }
    
    /**
     * Sets (as xml) the "csCatId" attribute
     */
    public void xsetCsCatId(org.apache.xmlbeans.XmlString csCatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSCATID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CSCATID$24);
            }
            target.set(csCatId);
        }
    }
    
    /**
     * Unsets the "csCatId" attribute
     */
    public void unsetCsCatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CSCATID$24);
        }
    }
    
    /**
     * Gets the "coherent3DOff" attribute
     */
    public boolean getCoherent3DOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COHERENT3DOFF$26);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "coherent3DOff" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCoherent3DOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COHERENT3DOFF$26);
            return target;
        }
    }
    
    /**
     * True if has "coherent3DOff" attribute
     */
    public boolean isSetCoherent3DOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COHERENT3DOFF$26) != null;
        }
    }
    
    /**
     * Sets the "coherent3DOff" attribute
     */
    public void setCoherent3DOff(boolean coherent3DOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COHERENT3DOFF$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COHERENT3DOFF$26);
            }
            target.setBooleanValue(coherent3DOff);
        }
    }
    
    /**
     * Sets (as xml) the "coherent3DOff" attribute
     */
    public void xsetCoherent3DOff(org.apache.xmlbeans.XmlBoolean coherent3DOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COHERENT3DOFF$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COHERENT3DOFF$26);
            }
            target.set(coherent3DOff);
        }
    }
    
    /**
     * Unsets the "coherent3DOff" attribute
     */
    public void unsetCoherent3DOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COHERENT3DOFF$26);
        }
    }
    
    /**
     * Gets the "phldrT" attribute
     */
    public java.lang.String getPhldrT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHLDRT$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phldrT" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPhldrT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHLDRT$28);
            return target;
        }
    }
    
    /**
     * True if has "phldrT" attribute
     */
    public boolean isSetPhldrT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PHLDRT$28) != null;
        }
    }
    
    /**
     * Sets the "phldrT" attribute
     */
    public void setPhldrT(java.lang.String phldrT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHLDRT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHLDRT$28);
            }
            target.setStringValue(phldrT);
        }
    }
    
    /**
     * Sets (as xml) the "phldrT" attribute
     */
    public void xsetPhldrT(org.apache.xmlbeans.XmlString phldrT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHLDRT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PHLDRT$28);
            }
            target.set(phldrT);
        }
    }
    
    /**
     * Unsets the "phldrT" attribute
     */
    public void unsetPhldrT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PHLDRT$28);
        }
    }
    
    /**
     * Gets the "phldr" attribute
     */
    public boolean getPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHLDR$30);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "phldr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PHLDR$30);
            return target;
        }
    }
    
    /**
     * True if has "phldr" attribute
     */
    public boolean isSetPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PHLDR$30) != null;
        }
    }
    
    /**
     * Sets the "phldr" attribute
     */
    public void setPhldr(boolean phldr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHLDR$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHLDR$30);
            }
            target.setBooleanValue(phldr);
        }
    }
    
    /**
     * Sets (as xml) the "phldr" attribute
     */
    public void xsetPhldr(org.apache.xmlbeans.XmlBoolean phldr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PHLDR$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PHLDR$30);
            }
            target.set(phldr);
        }
    }
    
    /**
     * Unsets the "phldr" attribute
     */
    public void unsetPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PHLDR$30);
        }
    }
    
    /**
     * Gets the "custAng" attribute
     */
    public int getCustAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTANG$32);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custAng" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTANG$32);
            return target;
        }
    }
    
    /**
     * True if has "custAng" attribute
     */
    public boolean isSetCustAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTANG$32) != null;
        }
    }
    
    /**
     * Sets the "custAng" attribute
     */
    public void setCustAng(int custAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTANG$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTANG$32);
            }
            target.setIntValue(custAng);
        }
    }
    
    /**
     * Sets (as xml) the "custAng" attribute
     */
    public void xsetCustAng(org.apache.xmlbeans.XmlInt custAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTANG$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTANG$32);
            }
            target.set(custAng);
        }
    }
    
    /**
     * Unsets the "custAng" attribute
     */
    public void unsetCustAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTANG$32);
        }
    }
    
    /**
     * Gets the "custFlipVert" attribute
     */
    public boolean getCustFlipVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTFLIPVERT$34);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "custFlipVert" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustFlipVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTFLIPVERT$34);
            return target;
        }
    }
    
    /**
     * True if has "custFlipVert" attribute
     */
    public boolean isSetCustFlipVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTFLIPVERT$34) != null;
        }
    }
    
    /**
     * Sets the "custFlipVert" attribute
     */
    public void setCustFlipVert(boolean custFlipVert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTFLIPVERT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTFLIPVERT$34);
            }
            target.setBooleanValue(custFlipVert);
        }
    }
    
    /**
     * Sets (as xml) the "custFlipVert" attribute
     */
    public void xsetCustFlipVert(org.apache.xmlbeans.XmlBoolean custFlipVert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTFLIPVERT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTFLIPVERT$34);
            }
            target.set(custFlipVert);
        }
    }
    
    /**
     * Unsets the "custFlipVert" attribute
     */
    public void unsetCustFlipVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTFLIPVERT$34);
        }
    }
    
    /**
     * Gets the "custFlipHor" attribute
     */
    public boolean getCustFlipHor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTFLIPHOR$36);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "custFlipHor" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustFlipHor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTFLIPHOR$36);
            return target;
        }
    }
    
    /**
     * True if has "custFlipHor" attribute
     */
    public boolean isSetCustFlipHor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTFLIPHOR$36) != null;
        }
    }
    
    /**
     * Sets the "custFlipHor" attribute
     */
    public void setCustFlipHor(boolean custFlipHor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTFLIPHOR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTFLIPHOR$36);
            }
            target.setBooleanValue(custFlipHor);
        }
    }
    
    /**
     * Sets (as xml) the "custFlipHor" attribute
     */
    public void xsetCustFlipHor(org.apache.xmlbeans.XmlBoolean custFlipHor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTFLIPHOR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTFLIPHOR$36);
            }
            target.set(custFlipHor);
        }
    }
    
    /**
     * Unsets the "custFlipHor" attribute
     */
    public void unsetCustFlipHor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTFLIPHOR$36);
        }
    }
    
    /**
     * Gets the "custSzX" attribute
     */
    public int getCustSzX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSZX$38);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custSzX" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustSzX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSZX$38);
            return target;
        }
    }
    
    /**
     * True if has "custSzX" attribute
     */
    public boolean isSetCustSzX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTSZX$38) != null;
        }
    }
    
    /**
     * Sets the "custSzX" attribute
     */
    public void setCustSzX(int custSzX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSZX$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTSZX$38);
            }
            target.setIntValue(custSzX);
        }
    }
    
    /**
     * Sets (as xml) the "custSzX" attribute
     */
    public void xsetCustSzX(org.apache.xmlbeans.XmlInt custSzX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSZX$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTSZX$38);
            }
            target.set(custSzX);
        }
    }
    
    /**
     * Unsets the "custSzX" attribute
     */
    public void unsetCustSzX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTSZX$38);
        }
    }
    
    /**
     * Gets the "custSzY" attribute
     */
    public int getCustSzY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSZY$40);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custSzY" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustSzY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSZY$40);
            return target;
        }
    }
    
    /**
     * True if has "custSzY" attribute
     */
    public boolean isSetCustSzY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTSZY$40) != null;
        }
    }
    
    /**
     * Sets the "custSzY" attribute
     */
    public void setCustSzY(int custSzY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSZY$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTSZY$40);
            }
            target.setIntValue(custSzY);
        }
    }
    
    /**
     * Sets (as xml) the "custSzY" attribute
     */
    public void xsetCustSzY(org.apache.xmlbeans.XmlInt custSzY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSZY$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTSZY$40);
            }
            target.set(custSzY);
        }
    }
    
    /**
     * Unsets the "custSzY" attribute
     */
    public void unsetCustSzY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTSZY$40);
        }
    }
    
    /**
     * Gets the "custScaleX" attribute
     */
    public int getCustScaleX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSCALEX$42);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custScaleX" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustScaleX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSCALEX$42);
            return target;
        }
    }
    
    /**
     * True if has "custScaleX" attribute
     */
    public boolean isSetCustScaleX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTSCALEX$42) != null;
        }
    }
    
    /**
     * Sets the "custScaleX" attribute
     */
    public void setCustScaleX(int custScaleX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSCALEX$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTSCALEX$42);
            }
            target.setIntValue(custScaleX);
        }
    }
    
    /**
     * Sets (as xml) the "custScaleX" attribute
     */
    public void xsetCustScaleX(org.apache.xmlbeans.XmlInt custScaleX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSCALEX$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTSCALEX$42);
            }
            target.set(custScaleX);
        }
    }
    
    /**
     * Unsets the "custScaleX" attribute
     */
    public void unsetCustScaleX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTSCALEX$42);
        }
    }
    
    /**
     * Gets the "custScaleY" attribute
     */
    public int getCustScaleY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSCALEY$44);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custScaleY" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustScaleY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSCALEY$44);
            return target;
        }
    }
    
    /**
     * True if has "custScaleY" attribute
     */
    public boolean isSetCustScaleY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTSCALEY$44) != null;
        }
    }
    
    /**
     * Sets the "custScaleY" attribute
     */
    public void setCustScaleY(int custScaleY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTSCALEY$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTSCALEY$44);
            }
            target.setIntValue(custScaleY);
        }
    }
    
    /**
     * Sets (as xml) the "custScaleY" attribute
     */
    public void xsetCustScaleY(org.apache.xmlbeans.XmlInt custScaleY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTSCALEY$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTSCALEY$44);
            }
            target.set(custScaleY);
        }
    }
    
    /**
     * Unsets the "custScaleY" attribute
     */
    public void unsetCustScaleY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTSCALEY$44);
        }
    }
    
    /**
     * Gets the "custT" attribute
     */
    public boolean getCustT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTT$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "custT" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTT$46);
            return target;
        }
    }
    
    /**
     * True if has "custT" attribute
     */
    public boolean isSetCustT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTT$46) != null;
        }
    }
    
    /**
     * Sets the "custT" attribute
     */
    public void setCustT(boolean custT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTT$46);
            }
            target.setBooleanValue(custT);
        }
    }
    
    /**
     * Sets (as xml) the "custT" attribute
     */
    public void xsetCustT(org.apache.xmlbeans.XmlBoolean custT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTT$46);
            }
            target.set(custT);
        }
    }
    
    /**
     * Unsets the "custT" attribute
     */
    public void unsetCustT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTT$46);
        }
    }
    
    /**
     * Gets the "custLinFactX" attribute
     */
    public int getCustLinFactX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTX$48);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custLinFactX" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustLinFactX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTX$48);
            return target;
        }
    }
    
    /**
     * True if has "custLinFactX" attribute
     */
    public boolean isSetCustLinFactX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTLINFACTX$48) != null;
        }
    }
    
    /**
     * Sets the "custLinFactX" attribute
     */
    public void setCustLinFactX(int custLinFactX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTX$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTLINFACTX$48);
            }
            target.setIntValue(custLinFactX);
        }
    }
    
    /**
     * Sets (as xml) the "custLinFactX" attribute
     */
    public void xsetCustLinFactX(org.apache.xmlbeans.XmlInt custLinFactX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTX$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTLINFACTX$48);
            }
            target.set(custLinFactX);
        }
    }
    
    /**
     * Unsets the "custLinFactX" attribute
     */
    public void unsetCustLinFactX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTLINFACTX$48);
        }
    }
    
    /**
     * Gets the "custLinFactY" attribute
     */
    public int getCustLinFactY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTY$50);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custLinFactY" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustLinFactY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTY$50);
            return target;
        }
    }
    
    /**
     * True if has "custLinFactY" attribute
     */
    public boolean isSetCustLinFactY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTLINFACTY$50) != null;
        }
    }
    
    /**
     * Sets the "custLinFactY" attribute
     */
    public void setCustLinFactY(int custLinFactY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTY$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTLINFACTY$50);
            }
            target.setIntValue(custLinFactY);
        }
    }
    
    /**
     * Sets (as xml) the "custLinFactY" attribute
     */
    public void xsetCustLinFactY(org.apache.xmlbeans.XmlInt custLinFactY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTY$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTLINFACTY$50);
            }
            target.set(custLinFactY);
        }
    }
    
    /**
     * Unsets the "custLinFactY" attribute
     */
    public void unsetCustLinFactY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTLINFACTY$50);
        }
    }
    
    /**
     * Gets the "custLinFactNeighborX" attribute
     */
    public int getCustLinFactNeighborX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTNEIGHBORX$52);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custLinFactNeighborX" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustLinFactNeighborX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTNEIGHBORX$52);
            return target;
        }
    }
    
    /**
     * True if has "custLinFactNeighborX" attribute
     */
    public boolean isSetCustLinFactNeighborX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTLINFACTNEIGHBORX$52) != null;
        }
    }
    
    /**
     * Sets the "custLinFactNeighborX" attribute
     */
    public void setCustLinFactNeighborX(int custLinFactNeighborX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTNEIGHBORX$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTLINFACTNEIGHBORX$52);
            }
            target.setIntValue(custLinFactNeighborX);
        }
    }
    
    /**
     * Sets (as xml) the "custLinFactNeighborX" attribute
     */
    public void xsetCustLinFactNeighborX(org.apache.xmlbeans.XmlInt custLinFactNeighborX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTNEIGHBORX$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTLINFACTNEIGHBORX$52);
            }
            target.set(custLinFactNeighborX);
        }
    }
    
    /**
     * Unsets the "custLinFactNeighborX" attribute
     */
    public void unsetCustLinFactNeighborX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTLINFACTNEIGHBORX$52);
        }
    }
    
    /**
     * Gets the "custLinFactNeighborY" attribute
     */
    public int getCustLinFactNeighborY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTNEIGHBORY$54);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custLinFactNeighborY" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustLinFactNeighborY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTNEIGHBORY$54);
            return target;
        }
    }
    
    /**
     * True if has "custLinFactNeighborY" attribute
     */
    public boolean isSetCustLinFactNeighborY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTLINFACTNEIGHBORY$54) != null;
        }
    }
    
    /**
     * Sets the "custLinFactNeighborY" attribute
     */
    public void setCustLinFactNeighborY(int custLinFactNeighborY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTLINFACTNEIGHBORY$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTLINFACTNEIGHBORY$54);
            }
            target.setIntValue(custLinFactNeighborY);
        }
    }
    
    /**
     * Sets (as xml) the "custLinFactNeighborY" attribute
     */
    public void xsetCustLinFactNeighborY(org.apache.xmlbeans.XmlInt custLinFactNeighborY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTLINFACTNEIGHBORY$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTLINFACTNEIGHBORY$54);
            }
            target.set(custLinFactNeighborY);
        }
    }
    
    /**
     * Unsets the "custLinFactNeighborY" attribute
     */
    public void unsetCustLinFactNeighborY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTLINFACTNEIGHBORY$54);
        }
    }
    
    /**
     * Gets the "custRadScaleRad" attribute
     */
    public int getCustRadScaleRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTRADSCALERAD$56);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custRadScaleRad" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustRadScaleRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTRADSCALERAD$56);
            return target;
        }
    }
    
    /**
     * True if has "custRadScaleRad" attribute
     */
    public boolean isSetCustRadScaleRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTRADSCALERAD$56) != null;
        }
    }
    
    /**
     * Sets the "custRadScaleRad" attribute
     */
    public void setCustRadScaleRad(int custRadScaleRad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTRADSCALERAD$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTRADSCALERAD$56);
            }
            target.setIntValue(custRadScaleRad);
        }
    }
    
    /**
     * Sets (as xml) the "custRadScaleRad" attribute
     */
    public void xsetCustRadScaleRad(org.apache.xmlbeans.XmlInt custRadScaleRad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTRADSCALERAD$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTRADSCALERAD$56);
            }
            target.set(custRadScaleRad);
        }
    }
    
    /**
     * Unsets the "custRadScaleRad" attribute
     */
    public void unsetCustRadScaleRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTRADSCALERAD$56);
        }
    }
    
    /**
     * Gets the "custRadScaleInc" attribute
     */
    public int getCustRadScaleInc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTRADSCALEINC$58);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "custRadScaleInc" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetCustRadScaleInc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTRADSCALEINC$58);
            return target;
        }
    }
    
    /**
     * True if has "custRadScaleInc" attribute
     */
    public boolean isSetCustRadScaleInc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTRADSCALEINC$58) != null;
        }
    }
    
    /**
     * Sets the "custRadScaleInc" attribute
     */
    public void setCustRadScaleInc(int custRadScaleInc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTRADSCALEINC$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTRADSCALEINC$58);
            }
            target.setIntValue(custRadScaleInc);
        }
    }
    
    /**
     * Sets (as xml) the "custRadScaleInc" attribute
     */
    public void xsetCustRadScaleInc(org.apache.xmlbeans.XmlInt custRadScaleInc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CUSTRADSCALEINC$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CUSTRADSCALEINC$58);
            }
            target.set(custRadScaleInc);
        }
    }
    
    /**
     * Unsets the "custRadScaleInc" attribute
     */
    public void unsetCustRadScaleInc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTRADSCALEINC$58);
        }
    }
}

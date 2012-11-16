/*
 * XML Type:  CT_TLShapeTargetElement
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLShapeTargetElement(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLShapeTargetElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement
{
    
    public CTTLShapeTargetElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bg");
    private static final javax.xml.namespace.QName SUBSP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "subSp");
    private static final javax.xml.namespace.QName OLECHARTEL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "oleChartEl");
    private static final javax.xml.namespace.QName TXEL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "txEl");
    private static final javax.xml.namespace.QName GRAPHICEL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "graphicEl");
    private static final javax.xml.namespace.QName SPID$10 = 
        new javax.xml.namespace.QName("", "spid");
    
    
    /**
     * Gets the "bg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(BG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bg" element
     */
    public boolean isSetBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BG$0) != 0;
        }
    }
    
    /**
     * Sets the "bg" element
     */
    public void setBg(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty bg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(BG$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(BG$0);
            }
            target.set(bg);
        }
    }
    
    /**
     * Appends and returns a new empty "bg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(BG$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bg" element
     */
    public void unsetBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BG$0, 0);
        }
    }
    
    /**
     * Gets the "subSp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId getSubSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().find_element_user(SUBSP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subSp" element
     */
    public boolean isSetSubSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSP$2) != 0;
        }
    }
    
    /**
     * Sets the "subSp" element
     */
    public void setSubSp(org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId subSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().find_element_user(SUBSP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().add_element_user(SUBSP$2);
            }
            target.set(subSp);
        }
    }
    
    /**
     * Appends and returns a new empty "subSp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId addNewSubSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().add_element_user(SUBSP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "subSp" element
     */
    public void unsetSubSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSP$2, 0);
        }
    }
    
    /**
     * Gets the "oleChartEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement getOleChartEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement)get_store().find_element_user(OLECHARTEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oleChartEl" element
     */
    public boolean isSetOleChartEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLECHARTEL$4) != 0;
        }
    }
    
    /**
     * Sets the "oleChartEl" element
     */
    public void setOleChartEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement oleChartEl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement)get_store().find_element_user(OLECHARTEL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement)get_store().add_element_user(OLECHARTEL$4);
            }
            target.set(oleChartEl);
        }
    }
    
    /**
     * Appends and returns a new empty "oleChartEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement addNewOleChartEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement)get_store().add_element_user(OLECHARTEL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "oleChartEl" element
     */
    public void unsetOleChartEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLECHARTEL$4, 0);
        }
    }
    
    /**
     * Gets the "txEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement getTxEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement)get_store().find_element_user(TXEL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txEl" element
     */
    public boolean isSetTxEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXEL$6) != 0;
        }
    }
    
    /**
     * Sets the "txEl" element
     */
    public void setTxEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement txEl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement)get_store().find_element_user(TXEL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement)get_store().add_element_user(TXEL$6);
            }
            target.set(txEl);
        }
    }
    
    /**
     * Appends and returns a new empty "txEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement addNewTxEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement)get_store().add_element_user(TXEL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "txEl" element
     */
    public void unsetTxEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXEL$6, 0);
        }
    }
    
    /**
     * Gets the "graphicEl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice getGraphicEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice)get_store().find_element_user(GRAPHICEL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "graphicEl" element
     */
    public boolean isSetGraphicEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHICEL$8) != 0;
        }
    }
    
    /**
     * Sets the "graphicEl" element
     */
    public void setGraphicEl(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice graphicEl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice)get_store().find_element_user(GRAPHICEL$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice)get_store().add_element_user(GRAPHICEL$8);
            }
            target.set(graphicEl);
        }
    }
    
    /**
     * Appends and returns a new empty "graphicEl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice addNewGraphicEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationElementChoice)get_store().add_element_user(GRAPHICEL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "graphicEl" element
     */
    public void unsetGraphicEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHICEL$8, 0);
        }
    }
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$10);
            return target;
        }
    }
    
    /**
     * Sets the "spid" attribute
     */
    public void setSpid(java.lang.String spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$10);
            }
            target.setStringValue(spid);
        }
    }
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    public void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().add_attribute_user(SPID$10);
            }
            target.set(spid);
        }
    }
}

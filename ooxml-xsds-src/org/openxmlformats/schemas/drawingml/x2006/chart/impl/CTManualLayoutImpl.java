/*
 * XML Type:  CT_ManualLayout
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTManualLayout
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_ManualLayout(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTManualLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTManualLayout
{
    
    public CTManualLayoutImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUTTARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layoutTarget");
    private static final javax.xml.namespace.QName XMODE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "xMode");
    private static final javax.xml.namespace.QName YMODE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "yMode");
    private static final javax.xml.namespace.QName WMODE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "wMode");
    private static final javax.xml.namespace.QName HMODE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "hMode");
    private static final javax.xml.namespace.QName X$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "x");
    private static final javax.xml.namespace.QName Y$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "y");
    private static final javax.xml.namespace.QName W$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "w");
    private static final javax.xml.namespace.QName H$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "h");
    private static final javax.xml.namespace.QName EXTLST$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "layoutTarget" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget getLayoutTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget)get_store().find_element_user(LAYOUTTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "layoutTarget" element
     */
    public boolean isSetLayoutTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUTTARGET$0) != 0;
        }
    }
    
    /**
     * Sets the "layoutTarget" element
     */
    public void setLayoutTarget(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget layoutTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget)get_store().find_element_user(LAYOUTTARGET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget)get_store().add_element_user(LAYOUTTARGET$0);
            }
            target.set(layoutTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "layoutTarget" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget addNewLayoutTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget)get_store().add_element_user(LAYOUTTARGET$0);
            return target;
        }
    }
    
    /**
     * Unsets the "layoutTarget" element
     */
    public void unsetLayoutTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUTTARGET$0, 0);
        }
    }
    
    /**
     * Gets the "xMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode getXMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(XMODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xMode" element
     */
    public boolean isSetXMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMODE$2) != 0;
        }
    }
    
    /**
     * Sets the "xMode" element
     */
    public void setXMode(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode xMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(XMODE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(XMODE$2);
            }
            target.set(xMode);
        }
    }
    
    /**
     * Appends and returns a new empty "xMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode addNewXMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(XMODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "xMode" element
     */
    public void unsetXMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMODE$2, 0);
        }
    }
    
    /**
     * Gets the "yMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode getYMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(YMODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "yMode" element
     */
    public boolean isSetYMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YMODE$4) != 0;
        }
    }
    
    /**
     * Sets the "yMode" element
     */
    public void setYMode(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode yMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(YMODE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(YMODE$4);
            }
            target.set(yMode);
        }
    }
    
    /**
     * Appends and returns a new empty "yMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode addNewYMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(YMODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "yMode" element
     */
    public void unsetYMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YMODE$4, 0);
        }
    }
    
    /**
     * Gets the "wMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode getWMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(WMODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wMode" element
     */
    public boolean isSetWMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WMODE$6) != 0;
        }
    }
    
    /**
     * Sets the "wMode" element
     */
    public void setWMode(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode wMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(WMODE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(WMODE$6);
            }
            target.set(wMode);
        }
    }
    
    /**
     * Appends and returns a new empty "wMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode addNewWMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(WMODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "wMode" element
     */
    public void unsetWMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WMODE$6, 0);
        }
    }
    
    /**
     * Gets the "hMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode getHMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(HMODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hMode" element
     */
    public boolean isSetHMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HMODE$8) != 0;
        }
    }
    
    /**
     * Sets the "hMode" element
     */
    public void setHMode(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode hMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().find_element_user(HMODE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(HMODE$8);
            }
            target.set(hMode);
        }
    }
    
    /**
     * Appends and returns a new empty "hMode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode addNewHMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode)get_store().add_element_user(HMODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "hMode" element
     */
    public void unsetHMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HMODE$8, 0);
        }
    }
    
    /**
     * Gets the "x" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(X$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "x" element
     */
    public boolean isSetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X$10) != 0;
        }
    }
    
    /**
     * Sets the "x" element
     */
    public void setX(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(X$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(X$10);
            }
            target.set(x);
        }
    }
    
    /**
     * Appends and returns a new empty "x" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(X$10);
            return target;
        }
    }
    
    /**
     * Unsets the "x" element
     */
    public void unsetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X$10, 0);
        }
    }
    
    /**
     * Gets the "y" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(Y$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "y" element
     */
    public boolean isSetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(Y$12) != 0;
        }
    }
    
    /**
     * Sets the "y" element
     */
    public void setY(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(Y$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(Y$12);
            }
            target.set(y);
        }
    }
    
    /**
     * Appends and returns a new empty "y" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(Y$12);
            return target;
        }
    }
    
    /**
     * Unsets the "y" element
     */
    public void unsetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(Y$12, 0);
        }
    }
    
    /**
     * Gets the "w" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(W$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "w" element
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(W$14) != 0;
        }
    }
    
    /**
     * Sets the "w" element
     */
    public void setW(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(W$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(W$14);
            }
            target.set(w);
        }
    }
    
    /**
     * Appends and returns a new empty "w" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(W$14);
            return target;
        }
    }
    
    /**
     * Unsets the "w" element
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(W$14, 0);
        }
    }
    
    /**
     * Gets the "h" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(H$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "h" element
     */
    public boolean isSetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H$16) != 0;
        }
    }
    
    /**
     * Sets the "h" element
     */
    public void setH(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(H$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(H$16);
            }
            target.set(h);
        }
    }
    
    /**
     * Appends and returns a new empty "h" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(H$16);
            return target;
        }
    }
    
    /**
     * Unsets the "h" element
     */
    public void unsetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H$16, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$18) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$18);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$18);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$18, 0);
        }
    }
}

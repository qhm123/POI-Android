/*
 * XML Type:  CT_View3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_View3D(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTView3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D
{
    
    public CTView3DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROTX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "rotX");
    private static final javax.xml.namespace.QName HPERCENT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "hPercent");
    private static final javax.xml.namespace.QName ROTY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "rotY");
    private static final javax.xml.namespace.QName DEPTHPERCENT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "depthPercent");
    private static final javax.xml.namespace.QName RANGAX$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "rAngAx");
    private static final javax.xml.namespace.QName PERSPECTIVE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "perspective");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "rotX" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX getRotX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX)get_store().find_element_user(ROTX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rotX" element
     */
    public boolean isSetRotX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROTX$0) != 0;
        }
    }
    
    /**
     * Sets the "rotX" element
     */
    public void setRotX(org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX rotX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX)get_store().find_element_user(ROTX$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX)get_store().add_element_user(ROTX$0);
            }
            target.set(rotX);
        }
    }
    
    /**
     * Appends and returns a new empty "rotX" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX addNewRotX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotX)get_store().add_element_user(ROTX$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rotX" element
     */
    public void unsetRotX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROTX$0, 0);
        }
    }
    
    /**
     * Gets the "hPercent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent getHPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent)get_store().find_element_user(HPERCENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hPercent" element
     */
    public boolean isSetHPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HPERCENT$2) != 0;
        }
    }
    
    /**
     * Sets the "hPercent" element
     */
    public void setHPercent(org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent hPercent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent)get_store().find_element_user(HPERCENT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent)get_store().add_element_user(HPERCENT$2);
            }
            target.set(hPercent);
        }
    }
    
    /**
     * Appends and returns a new empty "hPercent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent addNewHPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHPercent)get_store().add_element_user(HPERCENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "hPercent" element
     */
    public void unsetHPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HPERCENT$2, 0);
        }
    }
    
    /**
     * Gets the "rotY" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY getRotY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY)get_store().find_element_user(ROTY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rotY" element
     */
    public boolean isSetRotY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROTY$4) != 0;
        }
    }
    
    /**
     * Sets the "rotY" element
     */
    public void setRotY(org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY rotY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY)get_store().find_element_user(ROTY$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY)get_store().add_element_user(ROTY$4);
            }
            target.set(rotY);
        }
    }
    
    /**
     * Appends and returns a new empty "rotY" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY addNewRotY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY)get_store().add_element_user(ROTY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "rotY" element
     */
    public void unsetRotY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROTY$4, 0);
        }
    }
    
    /**
     * Gets the "depthPercent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent getDepthPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent)get_store().find_element_user(DEPTHPERCENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "depthPercent" element
     */
    public boolean isSetDepthPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPTHPERCENT$6) != 0;
        }
    }
    
    /**
     * Sets the "depthPercent" element
     */
    public void setDepthPercent(org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent depthPercent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent)get_store().find_element_user(DEPTHPERCENT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent)get_store().add_element_user(DEPTHPERCENT$6);
            }
            target.set(depthPercent);
        }
    }
    
    /**
     * Appends and returns a new empty "depthPercent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent addNewDepthPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDepthPercent)get_store().add_element_user(DEPTHPERCENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "depthPercent" element
     */
    public void unsetDepthPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPTHPERCENT$6, 0);
        }
    }
    
    /**
     * Gets the "rAngAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getRAngAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(RANGAX$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rAngAx" element
     */
    public boolean isSetRAngAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGAX$8) != 0;
        }
    }
    
    /**
     * Sets the "rAngAx" element
     */
    public void setRAngAx(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean rAngAx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(RANGAX$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(RANGAX$8);
            }
            target.set(rAngAx);
        }
    }
    
    /**
     * Appends and returns a new empty "rAngAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewRAngAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(RANGAX$8);
            return target;
        }
    }
    
    /**
     * Unsets the "rAngAx" element
     */
    public void unsetRAngAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGAX$8, 0);
        }
    }
    
    /**
     * Gets the "perspective" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective getPerspective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective)get_store().find_element_user(PERSPECTIVE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "perspective" element
     */
    public boolean isSetPerspective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSPECTIVE$10) != 0;
        }
    }
    
    /**
     * Sets the "perspective" element
     */
    public void setPerspective(org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective perspective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective)get_store().find_element_user(PERSPECTIVE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective)get_store().add_element_user(PERSPECTIVE$10);
            }
            target.set(perspective);
        }
    }
    
    /**
     * Appends and returns a new empty "perspective" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective addNewPerspective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPerspective)get_store().add_element_user(PERSPECTIVE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "perspective" element
     */
    public void unsetPerspective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSPECTIVE$10, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
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
            return get_store().count_elements(EXTLST$12) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            get_store().remove_element(EXTLST$12, 0);
        }
    }
}

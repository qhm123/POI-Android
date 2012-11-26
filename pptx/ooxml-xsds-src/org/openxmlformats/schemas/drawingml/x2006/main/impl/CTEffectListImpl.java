/*
 * XML Type:  CT_EffectList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_EffectList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEffectListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList
{
    
    public CTEffectListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLUR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blur");
    private static final javax.xml.namespace.QName FILLOVERLAY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillOverlay");
    private static final javax.xml.namespace.QName GLOW$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "glow");
    private static final javax.xml.namespace.QName INNERSHDW$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "innerShdw");
    private static final javax.xml.namespace.QName OUTERSHDW$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "outerShdw");
    private static final javax.xml.namespace.QName PRSTSHDW$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstShdw");
    private static final javax.xml.namespace.QName REFLECTION$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "reflection");
    private static final javax.xml.namespace.QName SOFTEDGE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "softEdge");
    
    
    /**
     * Gets the "blur" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect getBlur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().find_element_user(BLUR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "blur" element
     */
    public boolean isSetBlur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLUR$0) != 0;
        }
    }
    
    /**
     * Sets the "blur" element
     */
    public void setBlur(org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect blur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().find_element_user(BLUR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().add_element_user(BLUR$0);
            }
            target.set(blur);
        }
    }
    
    /**
     * Appends and returns a new empty "blur" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect addNewBlur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().add_element_user(BLUR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "blur" element
     */
    public void unsetBlur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLUR$0, 0);
        }
    }
    
    /**
     * Gets the "fillOverlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect getFillOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().find_element_user(FILLOVERLAY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fillOverlay" element
     */
    public boolean isSetFillOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLOVERLAY$2) != 0;
        }
    }
    
    /**
     * Sets the "fillOverlay" element
     */
    public void setFillOverlay(org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect fillOverlay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().find_element_user(FILLOVERLAY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().add_element_user(FILLOVERLAY$2);
            }
            target.set(fillOverlay);
        }
    }
    
    /**
     * Appends and returns a new empty "fillOverlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect addNewFillOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().add_element_user(FILLOVERLAY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fillOverlay" element
     */
    public void unsetFillOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLOVERLAY$2, 0);
        }
    }
    
    /**
     * Gets the "glow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect getGlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().find_element_user(GLOW$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "glow" element
     */
    public boolean isSetGlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOW$4) != 0;
        }
    }
    
    /**
     * Sets the "glow" element
     */
    public void setGlow(org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect glow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().find_element_user(GLOW$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().add_element_user(GLOW$4);
            }
            target.set(glow);
        }
    }
    
    /**
     * Appends and returns a new empty "glow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect addNewGlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().add_element_user(GLOW$4);
            return target;
        }
    }
    
    /**
     * Unsets the "glow" element
     */
    public void unsetGlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOW$4, 0);
        }
    }
    
    /**
     * Gets the "innerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect getInnerShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().find_element_user(INNERSHDW$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "innerShdw" element
     */
    public boolean isSetInnerShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INNERSHDW$6) != 0;
        }
    }
    
    /**
     * Sets the "innerShdw" element
     */
    public void setInnerShdw(org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect innerShdw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().find_element_user(INNERSHDW$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().add_element_user(INNERSHDW$6);
            }
            target.set(innerShdw);
        }
    }
    
    /**
     * Appends and returns a new empty "innerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect addNewInnerShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().add_element_user(INNERSHDW$6);
            return target;
        }
    }
    
    /**
     * Unsets the "innerShdw" element
     */
    public void unsetInnerShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INNERSHDW$6, 0);
        }
    }
    
    /**
     * Gets the "outerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect getOuterShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().find_element_user(OUTERSHDW$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outerShdw" element
     */
    public boolean isSetOuterShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTERSHDW$8) != 0;
        }
    }
    
    /**
     * Sets the "outerShdw" element
     */
    public void setOuterShdw(org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect outerShdw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().find_element_user(OUTERSHDW$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().add_element_user(OUTERSHDW$8);
            }
            target.set(outerShdw);
        }
    }
    
    /**
     * Appends and returns a new empty "outerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect addNewOuterShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().add_element_user(OUTERSHDW$8);
            return target;
        }
    }
    
    /**
     * Unsets the "outerShdw" element
     */
    public void unsetOuterShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTERSHDW$8, 0);
        }
    }
    
    /**
     * Gets the "prstShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect getPrstShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().find_element_user(PRSTSHDW$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prstShdw" element
     */
    public boolean isSetPrstShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTSHDW$10) != 0;
        }
    }
    
    /**
     * Sets the "prstShdw" element
     */
    public void setPrstShdw(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect prstShdw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().find_element_user(PRSTSHDW$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().add_element_user(PRSTSHDW$10);
            }
            target.set(prstShdw);
        }
    }
    
    /**
     * Appends and returns a new empty "prstShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect addNewPrstShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().add_element_user(PRSTSHDW$10);
            return target;
        }
    }
    
    /**
     * Unsets the "prstShdw" element
     */
    public void unsetPrstShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTSHDW$10, 0);
        }
    }
    
    /**
     * Gets the "reflection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect getReflection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().find_element_user(REFLECTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reflection" element
     */
    public boolean isSetReflection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFLECTION$12) != 0;
        }
    }
    
    /**
     * Sets the "reflection" element
     */
    public void setReflection(org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect reflection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().find_element_user(REFLECTION$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().add_element_user(REFLECTION$12);
            }
            target.set(reflection);
        }
    }
    
    /**
     * Appends and returns a new empty "reflection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect addNewReflection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().add_element_user(REFLECTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "reflection" element
     */
    public void unsetReflection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFLECTION$12, 0);
        }
    }
    
    /**
     * Gets the "softEdge" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect getSoftEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().find_element_user(SOFTEDGE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "softEdge" element
     */
    public boolean isSetSoftEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTEDGE$14) != 0;
        }
    }
    
    /**
     * Sets the "softEdge" element
     */
    public void setSoftEdge(org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect softEdge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().find_element_user(SOFTEDGE$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().add_element_user(SOFTEDGE$14);
            }
            target.set(softEdge);
        }
    }
    
    /**
     * Appends and returns a new empty "softEdge" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect addNewSoftEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().add_element_user(SOFTEDGE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "softEdge" element
     */
    public void unsetSoftEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTEDGE$14, 0);
        }
    }
}

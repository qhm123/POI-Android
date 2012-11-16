/*
 * XML Type:  CT_Anchor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_Anchor(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTAnchorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor
{
    
    public CTAnchorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEPOS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "simplePos");
    private static final javax.xml.namespace.QName POSITIONH$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "positionH");
    private static final javax.xml.namespace.QName POSITIONV$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "positionV");
    private static final javax.xml.namespace.QName EXTENT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "extent");
    private static final javax.xml.namespace.QName EFFECTEXTENT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "effectExtent");
    private static final javax.xml.namespace.QName WRAPNONE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapNone");
    private static final javax.xml.namespace.QName WRAPSQUARE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapSquare");
    private static final javax.xml.namespace.QName WRAPTIGHT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapTight");
    private static final javax.xml.namespace.QName WRAPTHROUGH$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapThrough");
    private static final javax.xml.namespace.QName WRAPTOPANDBOTTOM$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapTopAndBottom");
    private static final javax.xml.namespace.QName DOCPR$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "docPr");
    private static final javax.xml.namespace.QName CNVGRAPHICFRAMEPR$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "cNvGraphicFramePr");
    private static final javax.xml.namespace.QName GRAPHIC$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
    private static final javax.xml.namespace.QName DISTT$26 = 
        new javax.xml.namespace.QName("", "distT");
    private static final javax.xml.namespace.QName DISTB$28 = 
        new javax.xml.namespace.QName("", "distB");
    private static final javax.xml.namespace.QName DISTL$30 = 
        new javax.xml.namespace.QName("", "distL");
    private static final javax.xml.namespace.QName DISTR$32 = 
        new javax.xml.namespace.QName("", "distR");
    private static final javax.xml.namespace.QName SIMPLEPOS2$34 = 
        new javax.xml.namespace.QName("", "simplePos");
    private static final javax.xml.namespace.QName RELATIVEHEIGHT$36 = 
        new javax.xml.namespace.QName("", "relativeHeight");
    private static final javax.xml.namespace.QName BEHINDDOC$38 = 
        new javax.xml.namespace.QName("", "behindDoc");
    private static final javax.xml.namespace.QName LOCKED$40 = 
        new javax.xml.namespace.QName("", "locked");
    private static final javax.xml.namespace.QName LAYOUTINCELL$42 = 
        new javax.xml.namespace.QName("", "layoutInCell");
    private static final javax.xml.namespace.QName HIDDEN$44 = 
        new javax.xml.namespace.QName("", "hidden");
    private static final javax.xml.namespace.QName ALLOWOVERLAP$46 = 
        new javax.xml.namespace.QName("", "allowOverlap");
    
    
    /**
     * Gets the "simplePos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getSimplePos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(SIMPLEPOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simplePos" element
     */
    public void setSimplePos(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D simplePos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(SIMPLEPOS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(SIMPLEPOS$0);
            }
            target.set(simplePos);
        }
    }
    
    /**
     * Appends and returns a new empty "simplePos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewSimplePos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(SIMPLEPOS$0);
            return target;
        }
    }
    
    /**
     * Gets the "positionH" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH getPositionH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH)get_store().find_element_user(POSITIONH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "positionH" element
     */
    public void setPositionH(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH positionH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH)get_store().find_element_user(POSITIONH$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH)get_store().add_element_user(POSITIONH$2);
            }
            target.set(positionH);
        }
    }
    
    /**
     * Appends and returns a new empty "positionH" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH addNewPositionH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH)get_store().add_element_user(POSITIONH$2);
            return target;
        }
    }
    
    /**
     * Gets the "positionV" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV getPositionV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV)get_store().find_element_user(POSITIONV$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "positionV" element
     */
    public void setPositionV(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV positionV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV)get_store().find_element_user(POSITIONV$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV)get_store().add_element_user(POSITIONV$4);
            }
            target.set(positionV);
        }
    }
    
    /**
     * Appends and returns a new empty "positionV" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV addNewPositionV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV)get_store().add_element_user(POSITIONV$4);
            return target;
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXTENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(EXTENT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXTENT$6);
            }
            target.set(extent);
        }
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(EXTENT$6);
            return target;
        }
    }
    
    /**
     * Gets the "effectExtent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent getEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().find_element_user(EFFECTEXTENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectExtent" element
     */
    public boolean isSetEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTEXTENT$8) != 0;
        }
    }
    
    /**
     * Sets the "effectExtent" element
     */
    public void setEffectExtent(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent effectExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().find_element_user(EFFECTEXTENT$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().add_element_user(EFFECTEXTENT$8);
            }
            target.set(effectExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "effectExtent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent addNewEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent)get_store().add_element_user(EFFECTEXTENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "effectExtent" element
     */
    public void unsetEffectExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTEXTENT$8, 0);
        }
    }
    
    /**
     * Gets the "wrapNone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone getWrapNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone)get_store().find_element_user(WRAPNONE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapNone" element
     */
    public boolean isSetWrapNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPNONE$10) != 0;
        }
    }
    
    /**
     * Sets the "wrapNone" element
     */
    public void setWrapNone(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone wrapNone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone)get_store().find_element_user(WRAPNONE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone)get_store().add_element_user(WRAPNONE$10);
            }
            target.set(wrapNone);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapNone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone addNewWrapNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone)get_store().add_element_user(WRAPNONE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapNone" element
     */
    public void unsetWrapNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPNONE$10, 0);
        }
    }
    
    /**
     * Gets the "wrapSquare" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare getWrapSquare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare)get_store().find_element_user(WRAPSQUARE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapSquare" element
     */
    public boolean isSetWrapSquare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPSQUARE$12) != 0;
        }
    }
    
    /**
     * Sets the "wrapSquare" element
     */
    public void setWrapSquare(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare wrapSquare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare)get_store().find_element_user(WRAPSQUARE$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare)get_store().add_element_user(WRAPSQUARE$12);
            }
            target.set(wrapSquare);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapSquare" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare addNewWrapSquare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare)get_store().add_element_user(WRAPSQUARE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapSquare" element
     */
    public void unsetWrapSquare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPSQUARE$12, 0);
        }
    }
    
    /**
     * Gets the "wrapTight" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight getWrapTight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight)get_store().find_element_user(WRAPTIGHT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapTight" element
     */
    public boolean isSetWrapTight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPTIGHT$14) != 0;
        }
    }
    
    /**
     * Sets the "wrapTight" element
     */
    public void setWrapTight(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight wrapTight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight)get_store().find_element_user(WRAPTIGHT$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight)get_store().add_element_user(WRAPTIGHT$14);
            }
            target.set(wrapTight);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapTight" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight addNewWrapTight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight)get_store().add_element_user(WRAPTIGHT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapTight" element
     */
    public void unsetWrapTight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPTIGHT$14, 0);
        }
    }
    
    /**
     * Gets the "wrapThrough" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough getWrapThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough)get_store().find_element_user(WRAPTHROUGH$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapThrough" element
     */
    public boolean isSetWrapThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPTHROUGH$16) != 0;
        }
    }
    
    /**
     * Sets the "wrapThrough" element
     */
    public void setWrapThrough(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough wrapThrough)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough)get_store().find_element_user(WRAPTHROUGH$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough)get_store().add_element_user(WRAPTHROUGH$16);
            }
            target.set(wrapThrough);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapThrough" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough addNewWrapThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough)get_store().add_element_user(WRAPTHROUGH$16);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapThrough" element
     */
    public void unsetWrapThrough()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPTHROUGH$16, 0);
        }
    }
    
    /**
     * Gets the "wrapTopAndBottom" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom getWrapTopAndBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom)get_store().find_element_user(WRAPTOPANDBOTTOM$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapTopAndBottom" element
     */
    public boolean isSetWrapTopAndBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPTOPANDBOTTOM$18) != 0;
        }
    }
    
    /**
     * Sets the "wrapTopAndBottom" element
     */
    public void setWrapTopAndBottom(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom wrapTopAndBottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom)get_store().find_element_user(WRAPTOPANDBOTTOM$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom)get_store().add_element_user(WRAPTOPANDBOTTOM$18);
            }
            target.set(wrapTopAndBottom);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapTopAndBottom" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom addNewWrapTopAndBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom)get_store().add_element_user(WRAPTOPANDBOTTOM$18);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapTopAndBottom" element
     */
    public void unsetWrapTopAndBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPTOPANDBOTTOM$18, 0);
        }
    }
    
    /**
     * Gets the "docPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps getDocPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(DOCPR$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "docPr" element
     */
    public void setDocPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps docPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(DOCPR$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(DOCPR$20);
            }
            target.set(docPr);
        }
    }
    
    /**
     * Appends and returns a new empty "docPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps addNewDocPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(DOCPR$20);
            return target;
        }
    }
    
    /**
     * Gets the "cNvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties getCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().find_element_user(CNVGRAPHICFRAMEPR$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cNvGraphicFramePr" element
     */
    public boolean isSetCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNVGRAPHICFRAMEPR$22) != 0;
        }
    }
    
    /**
     * Sets the "cNvGraphicFramePr" element
     */
    public void setCNvGraphicFramePr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties cNvGraphicFramePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().find_element_user(CNVGRAPHICFRAMEPR$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().add_element_user(CNVGRAPHICFRAMEPR$22);
            }
            target.set(cNvGraphicFramePr);
        }
    }
    
    /**
     * Appends and returns a new empty "cNvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties)get_store().add_element_user(CNVGRAPHICFRAMEPR$22);
            return target;
        }
    }
    
    /**
     * Unsets the "cNvGraphicFramePr" element
     */
    public void unsetCNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNVGRAPHICFRAMEPR$22, 0);
        }
    }
    
    /**
     * Gets the "graphic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject getGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "graphic" element
     */
    public void setGraphic(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject graphic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$24);
            }
            target.set(graphic);
        }
    }
    
    /**
     * Appends and returns a new empty "graphic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject addNewGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$24);
            return target;
        }
    }
    
    /**
     * Gets the "distT" attribute
     */
    public long getDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$26);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distT" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$26);
            return target;
        }
    }
    
    /**
     * True if has "distT" attribute
     */
    public boolean isSetDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTT$26) != null;
        }
    }
    
    /**
     * Sets the "distT" attribute
     */
    public void setDistT(long distT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTT$26);
            }
            target.setLongValue(distT);
        }
    }
    
    /**
     * Sets (as xml) the "distT" attribute
     */
    public void xsetDistT(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTT$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTT$26);
            }
            target.set(distT);
        }
    }
    
    /**
     * Unsets the "distT" attribute
     */
    public void unsetDistT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTT$26);
        }
    }
    
    /**
     * Gets the "distB" attribute
     */
    public long getDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$28);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distB" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$28);
            return target;
        }
    }
    
    /**
     * True if has "distB" attribute
     */
    public boolean isSetDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTB$28) != null;
        }
    }
    
    /**
     * Sets the "distB" attribute
     */
    public void setDistB(long distB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTB$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTB$28);
            }
            target.setLongValue(distB);
        }
    }
    
    /**
     * Sets (as xml) the "distB" attribute
     */
    public void xsetDistB(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTB$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTB$28);
            }
            target.set(distB);
        }
    }
    
    /**
     * Unsets the "distB" attribute
     */
    public void unsetDistB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTB$28);
        }
    }
    
    /**
     * Gets the "distL" attribute
     */
    public long getDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$30);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distL" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$30);
            return target;
        }
    }
    
    /**
     * True if has "distL" attribute
     */
    public boolean isSetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTL$30) != null;
        }
    }
    
    /**
     * Sets the "distL" attribute
     */
    public void setDistL(long distL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTL$30);
            }
            target.setLongValue(distL);
        }
    }
    
    /**
     * Sets (as xml) the "distL" attribute
     */
    public void xsetDistL(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTL$30);
            }
            target.set(distL);
        }
    }
    
    /**
     * Unsets the "distL" attribute
     */
    public void unsetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTL$30);
        }
    }
    
    /**
     * Gets the "distR" attribute
     */
    public long getDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$32);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$32);
            return target;
        }
    }
    
    /**
     * True if has "distR" attribute
     */
    public boolean isSetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTR$32) != null;
        }
    }
    
    /**
     * Sets the "distR" attribute
     */
    public void setDistR(long distR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTR$32);
            }
            target.setLongValue(distR);
        }
    }
    
    /**
     * Sets (as xml) the "distR" attribute
     */
    public void xsetDistR(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTR$32);
            }
            target.set(distR);
        }
    }
    
    /**
     * Unsets the "distR" attribute
     */
    public void unsetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTR$32);
        }
    }
    
    /**
     * Gets the "simplePos" attribute
     */
    public boolean getSimplePos2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIMPLEPOS2$34);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "simplePos" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSimplePos2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SIMPLEPOS2$34);
            return target;
        }
    }
    
    /**
     * True if has "simplePos" attribute
     */
    public boolean isSetSimplePos2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIMPLEPOS2$34) != null;
        }
    }
    
    /**
     * Sets the "simplePos" attribute
     */
    public void setSimplePos2(boolean simplePos2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIMPLEPOS2$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIMPLEPOS2$34);
            }
            target.setBooleanValue(simplePos2);
        }
    }
    
    /**
     * Sets (as xml) the "simplePos" attribute
     */
    public void xsetSimplePos2(org.apache.xmlbeans.XmlBoolean simplePos2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SIMPLEPOS2$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SIMPLEPOS2$34);
            }
            target.set(simplePos2);
        }
    }
    
    /**
     * Unsets the "simplePos" attribute
     */
    public void unsetSimplePos2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIMPLEPOS2$34);
        }
    }
    
    /**
     * Gets the "relativeHeight" attribute
     */
    public long getRelativeHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEHEIGHT$36);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "relativeHeight" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRelativeHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RELATIVEHEIGHT$36);
            return target;
        }
    }
    
    /**
     * Sets the "relativeHeight" attribute
     */
    public void setRelativeHeight(long relativeHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEHEIGHT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVEHEIGHT$36);
            }
            target.setLongValue(relativeHeight);
        }
    }
    
    /**
     * Sets (as xml) the "relativeHeight" attribute
     */
    public void xsetRelativeHeight(org.apache.xmlbeans.XmlUnsignedInt relativeHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RELATIVEHEIGHT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RELATIVEHEIGHT$36);
            }
            target.set(relativeHeight);
        }
    }
    
    /**
     * Gets the "behindDoc" attribute
     */
    public boolean getBehindDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEHINDDOC$38);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "behindDoc" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBehindDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BEHINDDOC$38);
            return target;
        }
    }
    
    /**
     * Sets the "behindDoc" attribute
     */
    public void setBehindDoc(boolean behindDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEHINDDOC$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEHINDDOC$38);
            }
            target.setBooleanValue(behindDoc);
        }
    }
    
    /**
     * Sets (as xml) the "behindDoc" attribute
     */
    public void xsetBehindDoc(org.apache.xmlbeans.XmlBoolean behindDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BEHINDDOC$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BEHINDDOC$38);
            }
            target.set(behindDoc);
        }
    }
    
    /**
     * Gets the "locked" attribute
     */
    public boolean getLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$40);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "locked" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKED$40);
            return target;
        }
    }
    
    /**
     * Sets the "locked" attribute
     */
    public void setLocked(boolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKED$40);
            }
            target.setBooleanValue(locked);
        }
    }
    
    /**
     * Sets (as xml) the "locked" attribute
     */
    public void xsetLocked(org.apache.xmlbeans.XmlBoolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKED$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKED$40);
            }
            target.set(locked);
        }
    }
    
    /**
     * Gets the "layoutInCell" attribute
     */
    public boolean getLayoutInCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAYOUTINCELL$42);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "layoutInCell" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLayoutInCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LAYOUTINCELL$42);
            return target;
        }
    }
    
    /**
     * Sets the "layoutInCell" attribute
     */
    public void setLayoutInCell(boolean layoutInCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAYOUTINCELL$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAYOUTINCELL$42);
            }
            target.setBooleanValue(layoutInCell);
        }
    }
    
    /**
     * Sets (as xml) the "layoutInCell" attribute
     */
    public void xsetLayoutInCell(org.apache.xmlbeans.XmlBoolean layoutInCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LAYOUTINCELL$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LAYOUTINCELL$42);
            }
            target.set(layoutInCell);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$44);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$44);
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$44) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$44);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$44);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$44);
        }
    }
    
    /**
     * Gets the "allowOverlap" attribute
     */
    public boolean getAllowOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowOverlap" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWOVERLAP$46);
            return target;
        }
    }
    
    /**
     * Sets the "allowOverlap" attribute
     */
    public void setAllowOverlap(boolean allowOverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWOVERLAP$46);
            }
            target.setBooleanValue(allowOverlap);
        }
    }
    
    /**
     * Sets (as xml) the "allowOverlap" attribute
     */
    public void xsetAllowOverlap(org.apache.xmlbeans.XmlBoolean allowOverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWOVERLAP$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLOWOVERLAP$46);
            }
            target.set(allowOverlap);
        }
    }
}

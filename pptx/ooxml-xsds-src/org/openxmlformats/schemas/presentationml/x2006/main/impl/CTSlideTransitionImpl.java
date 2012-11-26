/*
 * XML Type:  CT_SlideTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideTransitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition
{
    
    public CTSlideTransitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLINDS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "blinds");
    private static final javax.xml.namespace.QName CHECKER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "checker");
    private static final javax.xml.namespace.QName CIRCLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "circle");
    private static final javax.xml.namespace.QName DISSOLVE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "dissolve");
    private static final javax.xml.namespace.QName COMB$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "comb");
    private static final javax.xml.namespace.QName COVER$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cover");
    private static final javax.xml.namespace.QName CUT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cut");
    private static final javax.xml.namespace.QName DIAMOND$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "diamond");
    private static final javax.xml.namespace.QName FADE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "fade");
    private static final javax.xml.namespace.QName NEWSFLASH$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "newsflash");
    private static final javax.xml.namespace.QName PLUS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "plus");
    private static final javax.xml.namespace.QName PULL$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "pull");
    private static final javax.xml.namespace.QName PUSH$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "push");
    private static final javax.xml.namespace.QName RANDOM$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "random");
    private static final javax.xml.namespace.QName RANDOMBAR$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "randomBar");
    private static final javax.xml.namespace.QName SPLIT$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "split");
    private static final javax.xml.namespace.QName STRIPS$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "strips");
    private static final javax.xml.namespace.QName WEDGE$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "wedge");
    private static final javax.xml.namespace.QName WHEEL$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "wheel");
    private static final javax.xml.namespace.QName WIPE$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "wipe");
    private static final javax.xml.namespace.QName ZOOM$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "zoom");
    private static final javax.xml.namespace.QName SNDAC$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sndAc");
    private static final javax.xml.namespace.QName EXTLST$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SPD$46 = 
        new javax.xml.namespace.QName("", "spd");
    private static final javax.xml.namespace.QName ADVCLICK$48 = 
        new javax.xml.namespace.QName("", "advClick");
    private static final javax.xml.namespace.QName ADVTM$50 = 
        new javax.xml.namespace.QName("", "advTm");
    
    
    /**
     * Gets the "blinds" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition getBlinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(BLINDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "blinds" element
     */
    public boolean isSetBlinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLINDS$0) != 0;
        }
    }
    
    /**
     * Sets the "blinds" element
     */
    public void setBlinds(org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition blinds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(BLINDS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(BLINDS$0);
            }
            target.set(blinds);
        }
    }
    
    /**
     * Appends and returns a new empty "blinds" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition addNewBlinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(BLINDS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "blinds" element
     */
    public void unsetBlinds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLINDS$0, 0);
        }
    }
    
    /**
     * Gets the "checker" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition getChecker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(CHECKER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "checker" element
     */
    public boolean isSetChecker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKER$2) != 0;
        }
    }
    
    /**
     * Sets the "checker" element
     */
    public void setChecker(org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition checker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(CHECKER$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(CHECKER$2);
            }
            target.set(checker);
        }
    }
    
    /**
     * Appends and returns a new empty "checker" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition addNewChecker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(CHECKER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "checker" element
     */
    public void unsetChecker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKER$2, 0);
        }
    }
    
    /**
     * Gets the "circle" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(CIRCLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "circle" element
     */
    public boolean isSetCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCLE$4) != 0;
        }
    }
    
    /**
     * Sets the "circle" element
     */
    public void setCircle(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty circle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(CIRCLE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(CIRCLE$4);
            }
            target.set(circle);
        }
    }
    
    /**
     * Appends and returns a new empty "circle" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(CIRCLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "circle" element
     */
    public void unsetCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCLE$4, 0);
        }
    }
    
    /**
     * Gets the "dissolve" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getDissolve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(DISSOLVE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dissolve" element
     */
    public boolean isSetDissolve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISSOLVE$6) != 0;
        }
    }
    
    /**
     * Sets the "dissolve" element
     */
    public void setDissolve(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty dissolve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(DISSOLVE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(DISSOLVE$6);
            }
            target.set(dissolve);
        }
    }
    
    /**
     * Appends and returns a new empty "dissolve" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewDissolve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(DISSOLVE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "dissolve" element
     */
    public void unsetDissolve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISSOLVE$6, 0);
        }
    }
    
    /**
     * Gets the "comb" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition getComb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(COMB$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comb" element
     */
    public boolean isSetComb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMB$8) != 0;
        }
    }
    
    /**
     * Sets the "comb" element
     */
    public void setComb(org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition comb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(COMB$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(COMB$8);
            }
            target.set(comb);
        }
    }
    
    /**
     * Appends and returns a new empty "comb" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition addNewComb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(COMB$8);
            return target;
        }
    }
    
    /**
     * Unsets the "comb" element
     */
    public void unsetComb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMB$8, 0);
        }
    }
    
    /**
     * Gets the "cover" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition getCover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().find_element_user(COVER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cover" element
     */
    public boolean isSetCover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COVER$10) != 0;
        }
    }
    
    /**
     * Sets the "cover" element
     */
    public void setCover(org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition cover)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().find_element_user(COVER$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().add_element_user(COVER$10);
            }
            target.set(cover);
        }
    }
    
    /**
     * Appends and returns a new empty "cover" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition addNewCover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().add_element_user(COVER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "cover" element
     */
    public void unsetCover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COVER$10, 0);
        }
    }
    
    /**
     * Gets the "cut" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition getCut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().find_element_user(CUT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cut" element
     */
    public boolean isSetCut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUT$12) != 0;
        }
    }
    
    /**
     * Sets the "cut" element
     */
    public void setCut(org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition cut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().find_element_user(CUT$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().add_element_user(CUT$12);
            }
            target.set(cut);
        }
    }
    
    /**
     * Appends and returns a new empty "cut" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition addNewCut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().add_element_user(CUT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "cut" element
     */
    public void unsetCut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUT$12, 0);
        }
    }
    
    /**
     * Gets the "diamond" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getDiamond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(DIAMOND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diamond" element
     */
    public boolean isSetDiamond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAMOND$14) != 0;
        }
    }
    
    /**
     * Sets the "diamond" element
     */
    public void setDiamond(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty diamond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(DIAMOND$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(DIAMOND$14);
            }
            target.set(diamond);
        }
    }
    
    /**
     * Appends and returns a new empty "diamond" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewDiamond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(DIAMOND$14);
            return target;
        }
    }
    
    /**
     * Unsets the "diamond" element
     */
    public void unsetDiamond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAMOND$14, 0);
        }
    }
    
    /**
     * Gets the "fade" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition getFade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().find_element_user(FADE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fade" element
     */
    public boolean isSetFade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FADE$16) != 0;
        }
    }
    
    /**
     * Sets the "fade" element
     */
    public void setFade(org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition fade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().find_element_user(FADE$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().add_element_user(FADE$16);
            }
            target.set(fade);
        }
    }
    
    /**
     * Appends and returns a new empty "fade" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition addNewFade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition)get_store().add_element_user(FADE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "fade" element
     */
    public void unsetFade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FADE$16, 0);
        }
    }
    
    /**
     * Gets the "newsflash" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getNewsflash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(NEWSFLASH$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "newsflash" element
     */
    public boolean isSetNewsflash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWSFLASH$18) != 0;
        }
    }
    
    /**
     * Sets the "newsflash" element
     */
    public void setNewsflash(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty newsflash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(NEWSFLASH$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(NEWSFLASH$18);
            }
            target.set(newsflash);
        }
    }
    
    /**
     * Appends and returns a new empty "newsflash" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewNewsflash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(NEWSFLASH$18);
            return target;
        }
    }
    
    /**
     * Unsets the "newsflash" element
     */
    public void unsetNewsflash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWSFLASH$18, 0);
        }
    }
    
    /**
     * Gets the "plus" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getPlus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(PLUS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plus" element
     */
    public boolean isSetPlus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUS$20) != 0;
        }
    }
    
    /**
     * Sets the "plus" element
     */
    public void setPlus(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty plus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(PLUS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(PLUS$20);
            }
            target.set(plus);
        }
    }
    
    /**
     * Appends and returns a new empty "plus" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewPlus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(PLUS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "plus" element
     */
    public void unsetPlus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUS$20, 0);
        }
    }
    
    /**
     * Gets the "pull" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition getPull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().find_element_user(PULL$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pull" element
     */
    public boolean isSetPull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PULL$22) != 0;
        }
    }
    
    /**
     * Sets the "pull" element
     */
    public void setPull(org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition pull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().find_element_user(PULL$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().add_element_user(PULL$22);
            }
            target.set(pull);
        }
    }
    
    /**
     * Appends and returns a new empty "pull" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition addNewPull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition)get_store().add_element_user(PULL$22);
            return target;
        }
    }
    
    /**
     * Unsets the "pull" element
     */
    public void unsetPull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PULL$22, 0);
        }
    }
    
    /**
     * Gets the "push" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition getPush()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().find_element_user(PUSH$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "push" element
     */
    public boolean isSetPush()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUSH$24) != 0;
        }
    }
    
    /**
     * Sets the "push" element
     */
    public void setPush(org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition push)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().find_element_user(PUSH$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().add_element_user(PUSH$24);
            }
            target.set(push);
        }
    }
    
    /**
     * Appends and returns a new empty "push" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition addNewPush()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().add_element_user(PUSH$24);
            return target;
        }
    }
    
    /**
     * Unsets the "push" element
     */
    public void unsetPush()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUSH$24, 0);
        }
    }
    
    /**
     * Gets the "random" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getRandom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(RANDOM$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "random" element
     */
    public boolean isSetRandom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANDOM$26) != 0;
        }
    }
    
    /**
     * Sets the "random" element
     */
    public void setRandom(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty random)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(RANDOM$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(RANDOM$26);
            }
            target.set(random);
        }
    }
    
    /**
     * Appends and returns a new empty "random" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewRandom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(RANDOM$26);
            return target;
        }
    }
    
    /**
     * Unsets the "random" element
     */
    public void unsetRandom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANDOM$26, 0);
        }
    }
    
    /**
     * Gets the "randomBar" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition getRandomBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(RANDOMBAR$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "randomBar" element
     */
    public boolean isSetRandomBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANDOMBAR$28) != 0;
        }
    }
    
    /**
     * Sets the "randomBar" element
     */
    public void setRandomBar(org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition randomBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().find_element_user(RANDOMBAR$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(RANDOMBAR$28);
            }
            target.set(randomBar);
        }
    }
    
    /**
     * Appends and returns a new empty "randomBar" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition addNewRandomBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOrientationTransition)get_store().add_element_user(RANDOMBAR$28);
            return target;
        }
    }
    
    /**
     * Unsets the "randomBar" element
     */
    public void unsetRandomBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANDOMBAR$28, 0);
        }
    }
    
    /**
     * Gets the "split" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition getSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition)get_store().find_element_user(SPLIT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "split" element
     */
    public boolean isSetSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPLIT$30) != 0;
        }
    }
    
    /**
     * Sets the "split" element
     */
    public void setSplit(org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition split)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition)get_store().find_element_user(SPLIT$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition)get_store().add_element_user(SPLIT$30);
            }
            target.set(split);
        }
    }
    
    /**
     * Appends and returns a new empty "split" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition addNewSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition)get_store().add_element_user(SPLIT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "split" element
     */
    public void unsetSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPLIT$30, 0);
        }
    }
    
    /**
     * Gets the "strips" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition getStrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition)get_store().find_element_user(STRIPS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strips" element
     */
    public boolean isSetStrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIPS$32) != 0;
        }
    }
    
    /**
     * Sets the "strips" element
     */
    public void setStrips(org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition strips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition)get_store().find_element_user(STRIPS$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition)get_store().add_element_user(STRIPS$32);
            }
            target.set(strips);
        }
    }
    
    /**
     * Appends and returns a new empty "strips" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition addNewStrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCornerDirectionTransition)get_store().add_element_user(STRIPS$32);
            return target;
        }
    }
    
    /**
     * Unsets the "strips" element
     */
    public void unsetStrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIPS$32, 0);
        }
    }
    
    /**
     * Gets the "wedge" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getWedge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(WEDGE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wedge" element
     */
    public boolean isSetWedge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEDGE$34) != 0;
        }
    }
    
    /**
     * Sets the "wedge" element
     */
    public void setWedge(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty wedge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(WEDGE$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(WEDGE$34);
            }
            target.set(wedge);
        }
    }
    
    /**
     * Appends and returns a new empty "wedge" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewWedge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(WEDGE$34);
            return target;
        }
    }
    
    /**
     * Unsets the "wedge" element
     */
    public void unsetWedge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEDGE$34, 0);
        }
    }
    
    /**
     * Gets the "wheel" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition getWheel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition)get_store().find_element_user(WHEEL$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wheel" element
     */
    public boolean isSetWheel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHEEL$36) != 0;
        }
    }
    
    /**
     * Sets the "wheel" element
     */
    public void setWheel(org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition wheel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition)get_store().find_element_user(WHEEL$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition)get_store().add_element_user(WHEEL$36);
            }
            target.set(wheel);
        }
    }
    
    /**
     * Appends and returns a new empty "wheel" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition addNewWheel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition)get_store().add_element_user(WHEEL$36);
            return target;
        }
    }
    
    /**
     * Unsets the "wheel" element
     */
    public void unsetWheel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHEEL$36, 0);
        }
    }
    
    /**
     * Gets the "wipe" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition getWipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().find_element_user(WIPE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wipe" element
     */
    public boolean isSetWipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WIPE$38) != 0;
        }
    }
    
    /**
     * Sets the "wipe" element
     */
    public void setWipe(org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition wipe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().find_element_user(WIPE$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().add_element_user(WIPE$38);
            }
            target.set(wipe);
        }
    }
    
    /**
     * Appends and returns a new empty "wipe" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition addNewWipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSideDirectionTransition)get_store().add_element_user(WIPE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "wipe" element
     */
    public void unsetWipe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WIPE$38, 0);
        }
    }
    
    /**
     * Gets the "zoom" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition getZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition)get_store().find_element_user(ZOOM$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "zoom" element
     */
    public boolean isSetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZOOM$40) != 0;
        }
    }
    
    /**
     * Sets the "zoom" element
     */
    public void setZoom(org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition zoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition)get_store().find_element_user(ZOOM$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition)get_store().add_element_user(ZOOM$40);
            }
            target.set(zoom);
        }
    }
    
    /**
     * Appends and returns a new empty "zoom" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition addNewZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition)get_store().add_element_user(ZOOM$40);
            return target;
        }
    }
    
    /**
     * Unsets the "zoom" element
     */
    public void unsetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZOOM$40, 0);
        }
    }
    
    /**
     * Gets the "sndAc" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction getSndAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction)get_store().find_element_user(SNDAC$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sndAc" element
     */
    public boolean isSetSndAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SNDAC$42) != 0;
        }
    }
    
    /**
     * Sets the "sndAc" element
     */
    public void setSndAc(org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction sndAc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction)get_store().find_element_user(SNDAC$42, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction)get_store().add_element_user(SNDAC$42);
            }
            target.set(sndAc);
        }
    }
    
    /**
     * Appends and returns a new empty "sndAc" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction addNewSndAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction)get_store().add_element_user(SNDAC$42);
            return target;
        }
    }
    
    /**
     * Unsets the "sndAc" element
     */
    public void unsetSndAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SNDAC$42, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$44, 0);
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
            return get_store().count_elements(EXTLST$44) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$44, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$44);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$44);
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
            get_store().remove_element(EXTLST$44, 0);
        }
    }
    
    /**
     * Gets the "spd" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed.Enum getSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPD$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPD$46);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "spd" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed xgetSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed)get_store().find_attribute_user(SPD$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed)get_default_attribute_value(SPD$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "spd" attribute
     */
    public boolean isSetSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPD$46) != null;
        }
    }
    
    /**
     * Sets the "spd" attribute
     */
    public void setSpd(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed.Enum spd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPD$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPD$46);
            }
            target.setEnumValue(spd);
        }
    }
    
    /**
     * Sets (as xml) the "spd" attribute
     */
    public void xsetSpd(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed spd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed)get_store().find_attribute_user(SPD$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionSpeed)get_store().add_attribute_user(SPD$46);
            }
            target.set(spd);
        }
    }
    
    /**
     * Unsets the "spd" attribute
     */
    public void unsetSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPD$46);
        }
    }
    
    /**
     * Gets the "advClick" attribute
     */
    public boolean getAdvClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVCLICK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADVCLICK$48);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "advClick" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAdvClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVCLICK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ADVCLICK$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "advClick" attribute
     */
    public boolean isSetAdvClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADVCLICK$48) != null;
        }
    }
    
    /**
     * Sets the "advClick" attribute
     */
    public void setAdvClick(boolean advClick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVCLICK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADVCLICK$48);
            }
            target.setBooleanValue(advClick);
        }
    }
    
    /**
     * Sets (as xml) the "advClick" attribute
     */
    public void xsetAdvClick(org.apache.xmlbeans.XmlBoolean advClick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVCLICK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADVCLICK$48);
            }
            target.set(advClick);
        }
    }
    
    /**
     * Unsets the "advClick" attribute
     */
    public void unsetAdvClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADVCLICK$48);
        }
    }
    
    /**
     * Gets the "advTm" attribute
     */
    public long getAdvTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVTM$50);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "advTm" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetAdvTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ADVTM$50);
            return target;
        }
    }
    
    /**
     * True if has "advTm" attribute
     */
    public boolean isSetAdvTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADVTM$50) != null;
        }
    }
    
    /**
     * Sets the "advTm" attribute
     */
    public void setAdvTm(long advTm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVTM$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADVTM$50);
            }
            target.setLongValue(advTm);
        }
    }
    
    /**
     * Sets (as xml) the "advTm" attribute
     */
    public void xsetAdvTm(org.apache.xmlbeans.XmlUnsignedInt advTm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ADVTM$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ADVTM$50);
            }
            target.set(advTm);
        }
    }
    
    /**
     * Unsets the "advTm" attribute
     */
    public void unsetAdvTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADVTM$50);
        }
    }
}

/*
 * XML Type:  CT_BorderBoxPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_BorderBoxPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTBorderBoxPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr
{
    
    public CTBorderBoxPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIDETOP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "hideTop");
    private static final javax.xml.namespace.QName HIDEBOT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "hideBot");
    private static final javax.xml.namespace.QName HIDELEFT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "hideLeft");
    private static final javax.xml.namespace.QName HIDERIGHT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "hideRight");
    private static final javax.xml.namespace.QName STRIKEH$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "strikeH");
    private static final javax.xml.namespace.QName STRIKEV$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "strikeV");
    private static final javax.xml.namespace.QName STRIKEBLTR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "strikeBLTR");
    private static final javax.xml.namespace.QName STRIKETLBR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "strikeTLBR");
    private static final javax.xml.namespace.QName CTRLPR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "hideTop" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getHideTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDETOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideTop" element
     */
    public boolean isSetHideTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDETOP$0) != 0;
        }
    }
    
    /**
     * Sets the "hideTop" element
     */
    public void setHideTop(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff hideTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDETOP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDETOP$0);
            }
            target.set(hideTop);
        }
    }
    
    /**
     * Appends and returns a new empty "hideTop" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewHideTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDETOP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "hideTop" element
     */
    public void unsetHideTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDETOP$0, 0);
        }
    }
    
    /**
     * Gets the "hideBot" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getHideBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDEBOT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideBot" element
     */
    public boolean isSetHideBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDEBOT$2) != 0;
        }
    }
    
    /**
     * Sets the "hideBot" element
     */
    public void setHideBot(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff hideBot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDEBOT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDEBOT$2);
            }
            target.set(hideBot);
        }
    }
    
    /**
     * Appends and returns a new empty "hideBot" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewHideBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDEBOT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "hideBot" element
     */
    public void unsetHideBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDEBOT$2, 0);
        }
    }
    
    /**
     * Gets the "hideLeft" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getHideLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDELEFT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideLeft" element
     */
    public boolean isSetHideLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDELEFT$4) != 0;
        }
    }
    
    /**
     * Sets the "hideLeft" element
     */
    public void setHideLeft(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff hideLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDELEFT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDELEFT$4);
            }
            target.set(hideLeft);
        }
    }
    
    /**
     * Appends and returns a new empty "hideLeft" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewHideLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDELEFT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "hideLeft" element
     */
    public void unsetHideLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDELEFT$4, 0);
        }
    }
    
    /**
     * Gets the "hideRight" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getHideRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDERIGHT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideRight" element
     */
    public boolean isSetHideRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDERIGHT$6) != 0;
        }
    }
    
    /**
     * Sets the "hideRight" element
     */
    public void setHideRight(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff hideRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(HIDERIGHT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDERIGHT$6);
            }
            target.set(hideRight);
        }
    }
    
    /**
     * Appends and returns a new empty "hideRight" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewHideRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(HIDERIGHT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "hideRight" element
     */
    public void unsetHideRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDERIGHT$6, 0);
        }
    }
    
    /**
     * Gets the "strikeH" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getStrikeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKEH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strikeH" element
     */
    public boolean isSetStrikeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKEH$8) != 0;
        }
    }
    
    /**
     * Sets the "strikeH" element
     */
    public void setStrikeH(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff strikeH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKEH$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKEH$8);
            }
            target.set(strikeH);
        }
    }
    
    /**
     * Appends and returns a new empty "strikeH" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewStrikeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKEH$8);
            return target;
        }
    }
    
    /**
     * Unsets the "strikeH" element
     */
    public void unsetStrikeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKEH$8, 0);
        }
    }
    
    /**
     * Gets the "strikeV" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getStrikeV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKEV$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strikeV" element
     */
    public boolean isSetStrikeV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKEV$10) != 0;
        }
    }
    
    /**
     * Sets the "strikeV" element
     */
    public void setStrikeV(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff strikeV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKEV$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKEV$10);
            }
            target.set(strikeV);
        }
    }
    
    /**
     * Appends and returns a new empty "strikeV" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewStrikeV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKEV$10);
            return target;
        }
    }
    
    /**
     * Unsets the "strikeV" element
     */
    public void unsetStrikeV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKEV$10, 0);
        }
    }
    
    /**
     * Gets the "strikeBLTR" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getStrikeBLTR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKEBLTR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strikeBLTR" element
     */
    public boolean isSetStrikeBLTR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKEBLTR$12) != 0;
        }
    }
    
    /**
     * Sets the "strikeBLTR" element
     */
    public void setStrikeBLTR(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff strikeBLTR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKEBLTR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKEBLTR$12);
            }
            target.set(strikeBLTR);
        }
    }
    
    /**
     * Appends and returns a new empty "strikeBLTR" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewStrikeBLTR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKEBLTR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "strikeBLTR" element
     */
    public void unsetStrikeBLTR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKEBLTR$12, 0);
        }
    }
    
    /**
     * Gets the "strikeTLBR" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getStrikeTLBR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKETLBR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strikeTLBR" element
     */
    public boolean isSetStrikeTLBR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKETLBR$14) != 0;
        }
    }
    
    /**
     * Sets the "strikeTLBR" element
     */
    public void setStrikeTLBR(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff strikeTLBR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(STRIKETLBR$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKETLBR$14);
            }
            target.set(strikeTLBR);
        }
    }
    
    /**
     * Appends and returns a new empty "strikeTLBR" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewStrikeTLBR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(STRIKETLBR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "strikeTLBR" element
     */
    public void unsetStrikeTLBR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKETLBR$14, 0);
        }
    }
    
    /**
     * Gets the "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr getCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ctrlPr" element
     */
    public boolean isSetCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CTRLPR$16) != 0;
        }
    }
    
    /**
     * Sets the "ctrlPr" element
     */
    public void setCtrlPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr ctrlPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$16);
            }
            target.set(ctrlPr);
        }
    }
    
    /**
     * Appends and returns a new empty "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr addNewCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$16);
            return target;
        }
    }
    
    /**
     * Unsets the "ctrlPr" element
     */
    public void unsetCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CTRLPR$16, 0);
        }
    }
}

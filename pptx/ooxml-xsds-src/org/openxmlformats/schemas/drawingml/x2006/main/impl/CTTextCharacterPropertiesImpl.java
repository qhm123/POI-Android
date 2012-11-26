/*
 * XML Type:  CT_TextCharacterProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextCharacterProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextCharacterPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties
{
    
    public CTTextCharacterPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");
    private static final javax.xml.namespace.QName NOFILL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
    private static final javax.xml.namespace.QName SOLIDFILL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
    private static final javax.xml.namespace.QName GRADFILL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
    private static final javax.xml.namespace.QName BLIPFILL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
    private static final javax.xml.namespace.QName PATTFILL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
    private static final javax.xml.namespace.QName GRPFILL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
    private static final javax.xml.namespace.QName EFFECTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
    private static final javax.xml.namespace.QName EFFECTDAG$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
    private static final javax.xml.namespace.QName HIGHLIGHT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "highlight");
    private static final javax.xml.namespace.QName ULNTX$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uLnTx");
    private static final javax.xml.namespace.QName ULN$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uLn");
    private static final javax.xml.namespace.QName UFILLTX$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uFillTx");
    private static final javax.xml.namespace.QName UFILL$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uFill");
    private static final javax.xml.namespace.QName LATIN$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "latin");
    private static final javax.xml.namespace.QName EA$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ea");
    private static final javax.xml.namespace.QName CS$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cs");
    private static final javax.xml.namespace.QName SYM$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sym");
    private static final javax.xml.namespace.QName HLINKCLICK$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkClick");
    private static final javax.xml.namespace.QName HLINKMOUSEOVER$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkMouseOver");
    private static final javax.xml.namespace.QName EXTLST$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName KUMIMOJI$42 = 
        new javax.xml.namespace.QName("", "kumimoji");
    private static final javax.xml.namespace.QName LANG$44 = 
        new javax.xml.namespace.QName("", "lang");
    private static final javax.xml.namespace.QName ALTLANG$46 = 
        new javax.xml.namespace.QName("", "altLang");
    private static final javax.xml.namespace.QName SZ$48 = 
        new javax.xml.namespace.QName("", "sz");
    private static final javax.xml.namespace.QName B$50 = 
        new javax.xml.namespace.QName("", "b");
    private static final javax.xml.namespace.QName I$52 = 
        new javax.xml.namespace.QName("", "i");
    private static final javax.xml.namespace.QName U$54 = 
        new javax.xml.namespace.QName("", "u");
    private static final javax.xml.namespace.QName STRIKE$56 = 
        new javax.xml.namespace.QName("", "strike");
    private static final javax.xml.namespace.QName KERN$58 = 
        new javax.xml.namespace.QName("", "kern");
    private static final javax.xml.namespace.QName CAP$60 = 
        new javax.xml.namespace.QName("", "cap");
    private static final javax.xml.namespace.QName SPC$62 = 
        new javax.xml.namespace.QName("", "spc");
    private static final javax.xml.namespace.QName NORMALIZEH$64 = 
        new javax.xml.namespace.QName("", "normalizeH");
    private static final javax.xml.namespace.QName BASELINE$66 = 
        new javax.xml.namespace.QName("", "baseline");
    private static final javax.xml.namespace.QName NOPROOF$68 = 
        new javax.xml.namespace.QName("", "noProof");
    private static final javax.xml.namespace.QName DIRTY$70 = 
        new javax.xml.namespace.QName("", "dirty");
    private static final javax.xml.namespace.QName ERR$72 = 
        new javax.xml.namespace.QName("", "err");
    private static final javax.xml.namespace.QName SMTCLEAN$74 = 
        new javax.xml.namespace.QName("", "smtClean");
    private static final javax.xml.namespace.QName SMTID$76 = 
        new javax.xml.namespace.QName("", "smtId");
    private static final javax.xml.namespace.QName BMK$78 = 
        new javax.xml.namespace.QName("", "bmk");
    
    
    /**
     * Gets the "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ln" element
     */
    public boolean isSetLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LN$0) != 0;
        }
    }
    
    /**
     * Sets the "ln" element
     */
    public void setLn(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties ln)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            }
            target.set(ln);
        }
    }
    
    /**
     * Appends and returns a new empty "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ln" element
     */
    public void unsetLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LN$0, 0);
        }
    }
    
    /**
     * Gets the "noFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties getNoFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noFill" element
     */
    public boolean isSetNoFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOFILL$2) != 0;
        }
    }
    
    /**
     * Sets the "noFill" element
     */
    public void setNoFill(org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties noFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$2);
            }
            target.set(noFill);
        }
    }
    
    /**
     * Appends and returns a new empty "noFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties addNewNoFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "noFill" element
     */
    public void unsetNoFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOFILL$2, 0);
        }
    }
    
    /**
     * Gets the "solidFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getSolidFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "solidFill" element
     */
    public boolean isSetSolidFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLIDFILL$4) != 0;
        }
    }
    
    /**
     * Sets the "solidFill" element
     */
    public void setSolidFill(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties solidFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$4);
            }
            target.set(solidFill);
        }
    }
    
    /**
     * Appends and returns a new empty "solidFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewSolidFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "solidFill" element
     */
    public void unsetSolidFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLIDFILL$4, 0);
        }
    }
    
    /**
     * Gets the "gradFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties getGradFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gradFill" element
     */
    public boolean isSetGradFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRADFILL$6) != 0;
        }
    }
    
    /**
     * Sets the "gradFill" element
     */
    public void setGradFill(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties gradFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$6);
            }
            target.set(gradFill);
        }
    }
    
    /**
     * Appends and returns a new empty "gradFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties addNewGradFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "gradFill" element
     */
    public void unsetGradFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRADFILL$6, 0);
        }
    }
    
    /**
     * Gets the "blipFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties getBlipFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "blipFill" element
     */
    public boolean isSetBlipFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLIPFILL$8) != 0;
        }
    }
    
    /**
     * Sets the "blipFill" element
     */
    public void setBlipFill(org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties blipFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$8);
            }
            target.set(blipFill);
        }
    }
    
    /**
     * Appends and returns a new empty "blipFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties addNewBlipFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "blipFill" element
     */
    public void unsetBlipFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLIPFILL$8, 0);
        }
    }
    
    /**
     * Gets the "pattFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties getPattFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pattFill" element
     */
    public boolean isSetPattFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTFILL$10) != 0;
        }
    }
    
    /**
     * Sets the "pattFill" element
     */
    public void setPattFill(org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties pattFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$10);
            }
            target.set(pattFill);
        }
    }
    
    /**
     * Appends and returns a new empty "pattFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties addNewPattFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "pattFill" element
     */
    public void unsetPattFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTFILL$10, 0);
        }
    }
    
    /**
     * Gets the "grpFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties getGrpFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grpFill" element
     */
    public boolean isSetGrpFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRPFILL$12) != 0;
        }
    }
    
    /**
     * Sets the "grpFill" element
     */
    public void setGrpFill(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties grpFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$12);
            }
            target.set(grpFill);
        }
    }
    
    /**
     * Appends and returns a new empty "grpFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties addNewGrpFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "grpFill" element
     */
    public void unsetGrpFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRPFILL$12, 0);
        }
    }
    
    /**
     * Gets the "effectLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList getEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectLst" element
     */
    public boolean isSetEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTLST$14) != 0;
        }
    }
    
    /**
     * Sets the "effectLst" element
     */
    public void setEffectLst(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList effectLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$14);
            }
            target.set(effectLst);
        }
    }
    
    /**
     * Appends and returns a new empty "effectLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList addNewEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "effectLst" element
     */
    public void unsetEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTLST$14, 0);
        }
    }
    
    /**
     * Gets the "effectDag" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectDag" element
     */
    public boolean isSetEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTDAG$16) != 0;
        }
    }
    
    /**
     * Sets the "effectDag" element
     */
    public void setEffectDag(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer effectDag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$16);
            }
            target.set(effectDag);
        }
    }
    
    /**
     * Appends and returns a new empty "effectDag" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$16);
            return target;
        }
    }
    
    /**
     * Unsets the "effectDag" element
     */
    public void unsetEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTDAG$16, 0);
        }
    }
    
    /**
     * Gets the "highlight" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getHighlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(HIGHLIGHT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "highlight" element
     */
    public boolean isSetHighlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIGHLIGHT$18) != 0;
        }
    }
    
    /**
     * Sets the "highlight" element
     */
    public void setHighlight(org.openxmlformats.schemas.drawingml.x2006.main.CTColor highlight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(HIGHLIGHT$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(HIGHLIGHT$18);
            }
            target.set(highlight);
        }
    }
    
    /**
     * Appends and returns a new empty "highlight" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewHighlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(HIGHLIGHT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "highlight" element
     */
    public void unsetHighlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIGHLIGHT$18, 0);
        }
    }
    
    /**
     * Gets the "uLnTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText getULnTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText)get_store().find_element_user(ULNTX$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uLnTx" element
     */
    public boolean isSetULnTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ULNTX$20) != 0;
        }
    }
    
    /**
     * Sets the "uLnTx" element
     */
    public void setULnTx(org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText uLnTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText)get_store().find_element_user(ULNTX$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText)get_store().add_element_user(ULNTX$20);
            }
            target.set(uLnTx);
        }
    }
    
    /**
     * Appends and returns a new empty "uLnTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText addNewULnTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText)get_store().add_element_user(ULNTX$20);
            return target;
        }
    }
    
    /**
     * Unsets the "uLnTx" element
     */
    public void unsetULnTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ULNTX$20, 0);
        }
    }
    
    /**
     * Gets the "uLn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getULn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(ULN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uLn" element
     */
    public boolean isSetULn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ULN$22) != 0;
        }
    }
    
    /**
     * Sets the "uLn" element
     */
    public void setULn(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties uLn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(ULN$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(ULN$22);
            }
            target.set(uLn);
        }
    }
    
    /**
     * Appends and returns a new empty "uLn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewULn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(ULN$22);
            return target;
        }
    }
    
    /**
     * Unsets the "uLn" element
     */
    public void unsetULn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ULN$22, 0);
        }
    }
    
    /**
     * Gets the "uFillTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText getUFillTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText)get_store().find_element_user(UFILLTX$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uFillTx" element
     */
    public boolean isSetUFillTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UFILLTX$24) != 0;
        }
    }
    
    /**
     * Sets the "uFillTx" element
     */
    public void setUFillTx(org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText uFillTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText)get_store().find_element_user(UFILLTX$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText)get_store().add_element_user(UFILLTX$24);
            }
            target.set(uFillTx);
        }
    }
    
    /**
     * Appends and returns a new empty "uFillTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText addNewUFillTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText)get_store().add_element_user(UFILLTX$24);
            return target;
        }
    }
    
    /**
     * Unsets the "uFillTx" element
     */
    public void unsetUFillTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UFILLTX$24, 0);
        }
    }
    
    /**
     * Gets the "uFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper getUFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper)get_store().find_element_user(UFILL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uFill" element
     */
    public boolean isSetUFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UFILL$26) != 0;
        }
    }
    
    /**
     * Sets the "uFill" element
     */
    public void setUFill(org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper uFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper)get_store().find_element_user(UFILL$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper)get_store().add_element_user(UFILL$26);
            }
            target.set(uFill);
        }
    }
    
    /**
     * Appends and returns a new empty "uFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper addNewUFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper)get_store().add_element_user(UFILL$26);
            return target;
        }
    }
    
    /**
     * Unsets the "uFill" element
     */
    public void unsetUFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UFILL$26, 0);
        }
    }
    
    /**
     * Gets the "latin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getLatin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(LATIN$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "latin" element
     */
    public boolean isSetLatin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATIN$28) != 0;
        }
    }
    
    /**
     * Sets the "latin" element
     */
    public void setLatin(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont latin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(LATIN$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(LATIN$28);
            }
            target.set(latin);
        }
    }
    
    /**
     * Appends and returns a new empty "latin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewLatin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(LATIN$28);
            return target;
        }
    }
    
    /**
     * Unsets the "latin" element
     */
    public void unsetLatin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATIN$28, 0);
        }
    }
    
    /**
     * Gets the "ea" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getEa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(EA$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ea" element
     */
    public boolean isSetEa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EA$30) != 0;
        }
    }
    
    /**
     * Sets the "ea" element
     */
    public void setEa(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont ea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(EA$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(EA$30);
            }
            target.set(ea);
        }
    }
    
    /**
     * Appends and returns a new empty "ea" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewEa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(EA$30);
            return target;
        }
    }
    
    /**
     * Unsets the "ea" element
     */
    public void unsetEa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EA$30, 0);
        }
    }
    
    /**
     * Gets the "cs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(CS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cs" element
     */
    public boolean isSetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CS$32) != 0;
        }
    }
    
    /**
     * Sets the "cs" element
     */
    public void setCs(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(CS$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(CS$32);
            }
            target.set(cs);
        }
    }
    
    /**
     * Appends and returns a new empty "cs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(CS$32);
            return target;
        }
    }
    
    /**
     * Unsets the "cs" element
     */
    public void unsetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CS$32, 0);
        }
    }
    
    /**
     * Gets the "sym" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getSym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(SYM$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sym" element
     */
    public boolean isSetSym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYM$34) != 0;
        }
    }
    
    /**
     * Sets the "sym" element
     */
    public void setSym(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont sym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(SYM$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(SYM$34);
            }
            target.set(sym);
        }
    }
    
    /**
     * Appends and returns a new empty "sym" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewSym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(SYM$34);
            return target;
        }
    }
    
    /**
     * Unsets the "sym" element
     */
    public void unsetSym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYM$34, 0);
        }
    }
    
    /**
     * Gets the "hlinkClick" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink getHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKCLICK$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hlinkClick" element
     */
    public boolean isSetHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HLINKCLICK$36) != 0;
        }
    }
    
    /**
     * Sets the "hlinkClick" element
     */
    public void setHlinkClick(org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink hlinkClick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKCLICK$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKCLICK$36);
            }
            target.set(hlinkClick);
        }
    }
    
    /**
     * Appends and returns a new empty "hlinkClick" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink addNewHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKCLICK$36);
            return target;
        }
    }
    
    /**
     * Unsets the "hlinkClick" element
     */
    public void unsetHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HLINKCLICK$36, 0);
        }
    }
    
    /**
     * Gets the "hlinkMouseOver" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink getHlinkMouseOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKMOUSEOVER$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hlinkMouseOver" element
     */
    public boolean isSetHlinkMouseOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HLINKMOUSEOVER$38) != 0;
        }
    }
    
    /**
     * Sets the "hlinkMouseOver" element
     */
    public void setHlinkMouseOver(org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink hlinkMouseOver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKMOUSEOVER$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKMOUSEOVER$38);
            }
            target.set(hlinkMouseOver);
        }
    }
    
    /**
     * Appends and returns a new empty "hlinkMouseOver" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink addNewHlinkMouseOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKMOUSEOVER$38);
            return target;
        }
    }
    
    /**
     * Unsets the "hlinkMouseOver" element
     */
    public void unsetHlinkMouseOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HLINKMOUSEOVER$38, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$40, 0);
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
            return get_store().count_elements(EXTLST$40) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$40);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$40);
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
            get_store().remove_element(EXTLST$40, 0);
        }
    }
    
    /**
     * Gets the "kumimoji" attribute
     */
    public boolean getKumimoji()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KUMIMOJI$42);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "kumimoji" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetKumimoji()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KUMIMOJI$42);
            return target;
        }
    }
    
    /**
     * True if has "kumimoji" attribute
     */
    public boolean isSetKumimoji()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KUMIMOJI$42) != null;
        }
    }
    
    /**
     * Sets the "kumimoji" attribute
     */
    public void setKumimoji(boolean kumimoji)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KUMIMOJI$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KUMIMOJI$42);
            }
            target.setBooleanValue(kumimoji);
        }
    }
    
    /**
     * Sets (as xml) the "kumimoji" attribute
     */
    public void xsetKumimoji(org.apache.xmlbeans.XmlBoolean kumimoji)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KUMIMOJI$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(KUMIMOJI$42);
            }
            target.set(kumimoji);
        }
    }
    
    /**
     * Unsets the "kumimoji" attribute
     */
    public void unsetKumimoji()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KUMIMOJI$42);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID)get_store().find_attribute_user(LANG$44);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$44) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$44);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID)get_store().find_attribute_user(LANG$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID)get_store().add_attribute_user(LANG$44);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$44);
        }
    }
    
    /**
     * Gets the "altLang" attribute
     */
    public java.lang.String getAltLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTLANG$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "altLang" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID xgetAltLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID)get_store().find_attribute_user(ALTLANG$46);
            return target;
        }
    }
    
    /**
     * True if has "altLang" attribute
     */
    public boolean isSetAltLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALTLANG$46) != null;
        }
    }
    
    /**
     * Sets the "altLang" attribute
     */
    public void setAltLang(java.lang.String altLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTLANG$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTLANG$46);
            }
            target.setStringValue(altLang);
        }
    }
    
    /**
     * Sets (as xml) the "altLang" attribute
     */
    public void xsetAltLang(org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID altLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID)get_store().find_attribute_user(ALTLANG$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID)get_store().add_attribute_user(ALTLANG$46);
            }
            target.set(altLang);
        }
    }
    
    /**
     * Unsets the "altLang" attribute
     */
    public void unsetAltLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALTLANG$46);
        }
    }
    
    /**
     * Gets the "sz" attribute
     */
    public int getSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$48);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sz" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize xgetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize)get_store().find_attribute_user(SZ$48);
            return target;
        }
    }
    
    /**
     * True if has "sz" attribute
     */
    public boolean isSetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SZ$48) != null;
        }
    }
    
    /**
     * Sets the "sz" attribute
     */
    public void setSz(int sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SZ$48);
            }
            target.setIntValue(sz);
        }
    }
    
    /**
     * Sets (as xml) the "sz" attribute
     */
    public void xsetSz(org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize)get_store().find_attribute_user(SZ$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize)get_store().add_attribute_user(SZ$48);
            }
            target.set(sz);
        }
    }
    
    /**
     * Unsets the "sz" attribute
     */
    public void unsetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SZ$48);
        }
    }
    
    /**
     * Gets the "b" attribute
     */
    public boolean getB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$50);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "b" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(B$50);
            return target;
        }
    }
    
    /**
     * True if has "b" attribute
     */
    public boolean isSetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(B$50) != null;
        }
    }
    
    /**
     * Sets the "b" attribute
     */
    public void setB(boolean b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(B$50);
            }
            target.setBooleanValue(b);
        }
    }
    
    /**
     * Sets (as xml) the "b" attribute
     */
    public void xsetB(org.apache.xmlbeans.XmlBoolean b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(B$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(B$50);
            }
            target.set(b);
        }
    }
    
    /**
     * Unsets the "b" attribute
     */
    public void unsetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(B$50);
        }
    }
    
    /**
     * Gets the "i" attribute
     */
    public boolean getI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$52);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "i" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(I$52);
            return target;
        }
    }
    
    /**
     * True if has "i" attribute
     */
    public boolean isSetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(I$52) != null;
        }
    }
    
    /**
     * Sets the "i" attribute
     */
    public void setI(boolean iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$52);
            }
            target.setBooleanValue(iValue);
        }
    }
    
    /**
     * Sets (as xml) the "i" attribute
     */
    public void xsetI(org.apache.xmlbeans.XmlBoolean iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(I$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(I$52);
            }
            target.set(iValue);
        }
    }
    
    /**
     * Unsets the "i" attribute
     */
    public void unsetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(I$52);
        }
    }
    
    /**
     * Gets the "u" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType.Enum getU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(U$54);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "u" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType xgetU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType)get_store().find_attribute_user(U$54);
            return target;
        }
    }
    
    /**
     * True if has "u" attribute
     */
    public boolean isSetU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(U$54) != null;
        }
    }
    
    /**
     * Sets the "u" attribute
     */
    public void setU(org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType.Enum u)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(U$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(U$54);
            }
            target.setEnumValue(u);
        }
    }
    
    /**
     * Sets (as xml) the "u" attribute
     */
    public void xsetU(org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType u)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType)get_store().find_attribute_user(U$54);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType)get_store().add_attribute_user(U$54);
            }
            target.set(u);
        }
    }
    
    /**
     * Unsets the "u" attribute
     */
    public void unsetU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(U$54);
        }
    }
    
    /**
     * Gets the "strike" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType.Enum getStrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRIKE$56);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "strike" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType xgetStrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType)get_store().find_attribute_user(STRIKE$56);
            return target;
        }
    }
    
    /**
     * True if has "strike" attribute
     */
    public boolean isSetStrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRIKE$56) != null;
        }
    }
    
    /**
     * Sets the "strike" attribute
     */
    public void setStrike(org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType.Enum strike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRIKE$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRIKE$56);
            }
            target.setEnumValue(strike);
        }
    }
    
    /**
     * Sets (as xml) the "strike" attribute
     */
    public void xsetStrike(org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType strike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType)get_store().find_attribute_user(STRIKE$56);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType)get_store().add_attribute_user(STRIKE$56);
            }
            target.set(strike);
        }
    }
    
    /**
     * Unsets the "strike" attribute
     */
    public void unsetStrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRIKE$56);
        }
    }
    
    /**
     * Gets the "kern" attribute
     */
    public int getKern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KERN$58);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "kern" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint xgetKern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint)get_store().find_attribute_user(KERN$58);
            return target;
        }
    }
    
    /**
     * True if has "kern" attribute
     */
    public boolean isSetKern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KERN$58) != null;
        }
    }
    
    /**
     * Sets the "kern" attribute
     */
    public void setKern(int kern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KERN$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KERN$58);
            }
            target.setIntValue(kern);
        }
    }
    
    /**
     * Sets (as xml) the "kern" attribute
     */
    public void xsetKern(org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint kern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint)get_store().find_attribute_user(KERN$58);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint)get_store().add_attribute_user(KERN$58);
            }
            target.set(kern);
        }
    }
    
    /**
     * Unsets the "kern" attribute
     */
    public void unsetKern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KERN$58);
        }
    }
    
    /**
     * Gets the "cap" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType.Enum getCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAP$60);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cap" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType xgetCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType)get_store().find_attribute_user(CAP$60);
            return target;
        }
    }
    
    /**
     * True if has "cap" attribute
     */
    public boolean isSetCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CAP$60) != null;
        }
    }
    
    /**
     * Sets the "cap" attribute
     */
    public void setCap(org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType.Enum cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAP$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAP$60);
            }
            target.setEnumValue(cap);
        }
    }
    
    /**
     * Sets (as xml) the "cap" attribute
     */
    public void xsetCap(org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType)get_store().find_attribute_user(CAP$60);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType)get_store().add_attribute_user(CAP$60);
            }
            target.set(cap);
        }
    }
    
    /**
     * Unsets the "cap" attribute
     */
    public void unsetCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CAP$60);
        }
    }
    
    /**
     * Gets the "spc" attribute
     */
    public int getSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPC$62);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "spc" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint xgetSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint)get_store().find_attribute_user(SPC$62);
            return target;
        }
    }
    
    /**
     * True if has "spc" attribute
     */
    public boolean isSetSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPC$62) != null;
        }
    }
    
    /**
     * Sets the "spc" attribute
     */
    public void setSpc(int spc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPC$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPC$62);
            }
            target.setIntValue(spc);
        }
    }
    
    /**
     * Sets (as xml) the "spc" attribute
     */
    public void xsetSpc(org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint spc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint)get_store().find_attribute_user(SPC$62);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint)get_store().add_attribute_user(SPC$62);
            }
            target.set(spc);
        }
    }
    
    /**
     * Unsets the "spc" attribute
     */
    public void unsetSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPC$62);
        }
    }
    
    /**
     * Gets the "normalizeH" attribute
     */
    public boolean getNormalizeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NORMALIZEH$64);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "normalizeH" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNormalizeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NORMALIZEH$64);
            return target;
        }
    }
    
    /**
     * True if has "normalizeH" attribute
     */
    public boolean isSetNormalizeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NORMALIZEH$64) != null;
        }
    }
    
    /**
     * Sets the "normalizeH" attribute
     */
    public void setNormalizeH(boolean normalizeH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NORMALIZEH$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NORMALIZEH$64);
            }
            target.setBooleanValue(normalizeH);
        }
    }
    
    /**
     * Sets (as xml) the "normalizeH" attribute
     */
    public void xsetNormalizeH(org.apache.xmlbeans.XmlBoolean normalizeH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NORMALIZEH$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NORMALIZEH$64);
            }
            target.set(normalizeH);
        }
    }
    
    /**
     * Unsets the "normalizeH" attribute
     */
    public void unsetNormalizeH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NORMALIZEH$64);
        }
    }
    
    /**
     * Gets the "baseline" attribute
     */
    public int getBaseline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASELINE$66);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseline" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetBaseline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(BASELINE$66);
            return target;
        }
    }
    
    /**
     * True if has "baseline" attribute
     */
    public boolean isSetBaseline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASELINE$66) != null;
        }
    }
    
    /**
     * Sets the "baseline" attribute
     */
    public void setBaseline(int baseline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASELINE$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASELINE$66);
            }
            target.setIntValue(baseline);
        }
    }
    
    /**
     * Sets (as xml) the "baseline" attribute
     */
    public void xsetBaseline(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage baseline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(BASELINE$66);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(BASELINE$66);
            }
            target.set(baseline);
        }
    }
    
    /**
     * Unsets the "baseline" attribute
     */
    public void unsetBaseline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASELINE$66);
        }
    }
    
    /**
     * Gets the "noProof" attribute
     */
    public boolean getNoProof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOPROOF$68);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noProof" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoProof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOPROOF$68);
            return target;
        }
    }
    
    /**
     * True if has "noProof" attribute
     */
    public boolean isSetNoProof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOPROOF$68) != null;
        }
    }
    
    /**
     * Sets the "noProof" attribute
     */
    public void setNoProof(boolean noProof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOPROOF$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOPROOF$68);
            }
            target.setBooleanValue(noProof);
        }
    }
    
    /**
     * Sets (as xml) the "noProof" attribute
     */
    public void xsetNoProof(org.apache.xmlbeans.XmlBoolean noProof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOPROOF$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOPROOF$68);
            }
            target.set(noProof);
        }
    }
    
    /**
     * Unsets the "noProof" attribute
     */
    public void unsetNoProof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOPROOF$68);
        }
    }
    
    /**
     * Gets the "dirty" attribute
     */
    public boolean getDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRTY$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIRTY$70);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dirty" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIRTY$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DIRTY$70);
            }
            return target;
        }
    }
    
    /**
     * True if has "dirty" attribute
     */
    public boolean isSetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRTY$70) != null;
        }
    }
    
    /**
     * Sets the "dirty" attribute
     */
    public void setDirty(boolean dirty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRTY$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRTY$70);
            }
            target.setBooleanValue(dirty);
        }
    }
    
    /**
     * Sets (as xml) the "dirty" attribute
     */
    public void xsetDirty(org.apache.xmlbeans.XmlBoolean dirty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIRTY$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DIRTY$70);
            }
            target.set(dirty);
        }
    }
    
    /**
     * Unsets the "dirty" attribute
     */
    public void unsetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRTY$70);
        }
    }
    
    /**
     * Gets the "err" attribute
     */
    public boolean getErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERR$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ERR$72);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "err" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ERR$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ERR$72);
            }
            return target;
        }
    }
    
    /**
     * True if has "err" attribute
     */
    public boolean isSetErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERR$72) != null;
        }
    }
    
    /**
     * Sets the "err" attribute
     */
    public void setErr(boolean err)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERR$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERR$72);
            }
            target.setBooleanValue(err);
        }
    }
    
    /**
     * Sets (as xml) the "err" attribute
     */
    public void xsetErr(org.apache.xmlbeans.XmlBoolean err)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ERR$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ERR$72);
            }
            target.set(err);
        }
    }
    
    /**
     * Unsets the "err" attribute
     */
    public void unsetErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERR$72);
        }
    }
    
    /**
     * Gets the "smtClean" attribute
     */
    public boolean getSmtClean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMTCLEAN$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SMTCLEAN$74);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "smtClean" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSmtClean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SMTCLEAN$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SMTCLEAN$74);
            }
            return target;
        }
    }
    
    /**
     * True if has "smtClean" attribute
     */
    public boolean isSetSmtClean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SMTCLEAN$74) != null;
        }
    }
    
    /**
     * Sets the "smtClean" attribute
     */
    public void setSmtClean(boolean smtClean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMTCLEAN$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SMTCLEAN$74);
            }
            target.setBooleanValue(smtClean);
        }
    }
    
    /**
     * Sets (as xml) the "smtClean" attribute
     */
    public void xsetSmtClean(org.apache.xmlbeans.XmlBoolean smtClean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SMTCLEAN$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SMTCLEAN$74);
            }
            target.set(smtClean);
        }
    }
    
    /**
     * Unsets the "smtClean" attribute
     */
    public void unsetSmtClean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SMTCLEAN$74);
        }
    }
    
    /**
     * Gets the "smtId" attribute
     */
    public long getSmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMTID$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SMTID$76);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "smtId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SMTID$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(SMTID$76);
            }
            return target;
        }
    }
    
    /**
     * True if has "smtId" attribute
     */
    public boolean isSetSmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SMTID$76) != null;
        }
    }
    
    /**
     * Sets the "smtId" attribute
     */
    public void setSmtId(long smtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMTID$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SMTID$76);
            }
            target.setLongValue(smtId);
        }
    }
    
    /**
     * Sets (as xml) the "smtId" attribute
     */
    public void xsetSmtId(org.apache.xmlbeans.XmlUnsignedInt smtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SMTID$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SMTID$76);
            }
            target.set(smtId);
        }
    }
    
    /**
     * Unsets the "smtId" attribute
     */
    public void unsetSmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SMTID$76);
        }
    }
    
    /**
     * Gets the "bmk" attribute
     */
    public java.lang.String getBmk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BMK$78);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bmk" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBmk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BMK$78);
            return target;
        }
    }
    
    /**
     * True if has "bmk" attribute
     */
    public boolean isSetBmk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BMK$78) != null;
        }
    }
    
    /**
     * Sets the "bmk" attribute
     */
    public void setBmk(java.lang.String bmk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BMK$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BMK$78);
            }
            target.setStringValue(bmk);
        }
    }
    
    /**
     * Sets (as xml) the "bmk" attribute
     */
    public void xsetBmk(org.apache.xmlbeans.XmlString bmk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BMK$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BMK$78);
            }
            target.set(bmk);
        }
    }
    
    /**
     * Unsets the "bmk" attribute
     */
    public void unsetBmk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BMK$78);
        }
    }
}

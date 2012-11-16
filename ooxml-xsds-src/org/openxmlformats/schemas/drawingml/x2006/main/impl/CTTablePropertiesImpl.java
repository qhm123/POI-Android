/*
 * XML Type:  CT_TableProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTablePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties
{
    
    public CTTablePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOFILL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
    private static final javax.xml.namespace.QName SOLIDFILL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
    private static final javax.xml.namespace.QName GRADFILL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
    private static final javax.xml.namespace.QName BLIPFILL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
    private static final javax.xml.namespace.QName PATTFILL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
    private static final javax.xml.namespace.QName GRPFILL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
    private static final javax.xml.namespace.QName EFFECTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
    private static final javax.xml.namespace.QName EFFECTDAG$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
    private static final javax.xml.namespace.QName TABLESTYLE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tableStyle");
    private static final javax.xml.namespace.QName TABLESTYLEID$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tableStyleId");
    private static final javax.xml.namespace.QName EXTLST$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName RTL$22 = 
        new javax.xml.namespace.QName("", "rtl");
    private static final javax.xml.namespace.QName FIRSTROW$24 = 
        new javax.xml.namespace.QName("", "firstRow");
    private static final javax.xml.namespace.QName FIRSTCOL$26 = 
        new javax.xml.namespace.QName("", "firstCol");
    private static final javax.xml.namespace.QName LASTROW$28 = 
        new javax.xml.namespace.QName("", "lastRow");
    private static final javax.xml.namespace.QName LASTCOL$30 = 
        new javax.xml.namespace.QName("", "lastCol");
    private static final javax.xml.namespace.QName BANDROW$32 = 
        new javax.xml.namespace.QName("", "bandRow");
    private static final javax.xml.namespace.QName BANDCOL$34 = 
        new javax.xml.namespace.QName("", "bandCol");
    
    
    /**
     * Gets the "noFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties getNoFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$0, 0);
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
            return get_store().count_elements(NOFILL$0) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$0);
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
            get_store().remove_element(NOFILL$0, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$2, 0);
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
            return get_store().count_elements(SOLIDFILL$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$2);
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
            get_store().remove_element(SOLIDFILL$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$4, 0);
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
            return get_store().count_elements(GRADFILL$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$4);
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
            get_store().remove_element(GRADFILL$4, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$6, 0);
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
            return get_store().count_elements(BLIPFILL$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$6);
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
            get_store().remove_element(BLIPFILL$6, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$8, 0);
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
            return get_store().count_elements(PATTFILL$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$8);
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
            get_store().remove_element(PATTFILL$8, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$10, 0);
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
            return get_store().count_elements(GRPFILL$10) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$10);
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
            get_store().remove_element(GRPFILL$10, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$12, 0);
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
            return get_store().count_elements(EFFECTLST$12) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$12);
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
            get_store().remove_element(EFFECTLST$12, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$14, 0);
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
            return get_store().count_elements(EFFECTDAG$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$14);
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
            get_store().remove_element(EFFECTDAG$14, 0);
        }
    }
    
    /**
     * Gets the "tableStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle getTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().find_element_user(TABLESTYLE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tableStyle" element
     */
    public boolean isSetTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLESTYLE$16) != 0;
        }
    }
    
    /**
     * Sets the "tableStyle" element
     */
    public void setTableStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle tableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().find_element_user(TABLESTYLE$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().add_element_user(TABLESTYLE$16);
            }
            target.set(tableStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "tableStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle addNewTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().add_element_user(TABLESTYLE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "tableStyle" element
     */
    public void unsetTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLESTYLE$16, 0);
        }
    }
    
    /**
     * Gets the "tableStyleId" element
     */
    public java.lang.String getTableStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLESTYLEID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableStyleId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGuid xgetTableStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_element_user(TABLESTYLEID$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "tableStyleId" element
     */
    public boolean isSetTableStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLESTYLEID$18) != 0;
        }
    }
    
    /**
     * Sets the "tableStyleId" element
     */
    public void setTableStyleId(java.lang.String tableStyleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLESTYLEID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABLESTYLEID$18);
            }
            target.setStringValue(tableStyleId);
        }
    }
    
    /**
     * Sets (as xml) the "tableStyleId" element
     */
    public void xsetTableStyleId(org.openxmlformats.schemas.drawingml.x2006.main.STGuid tableStyleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_element_user(TABLESTYLEID$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().add_element_user(TABLESTYLEID$18);
            }
            target.set(tableStyleId);
        }
    }
    
    /**
     * Unsets the "tableStyleId" element
     */
    public void unsetTableStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLESTYLEID$18, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$20, 0);
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
            return get_store().count_elements(EXTLST$20) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$20);
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
            get_store().remove_element(EXTLST$20, 0);
        }
    }
    
    /**
     * Gets the "rtl" attribute
     */
    public boolean getRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RTL$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rtl" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RTL$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "rtl" attribute
     */
    public boolean isSetRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RTL$22) != null;
        }
    }
    
    /**
     * Sets the "rtl" attribute
     */
    public void setRtl(boolean rtl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTL$22);
            }
            target.setBooleanValue(rtl);
        }
    }
    
    /**
     * Sets (as xml) the "rtl" attribute
     */
    public void xsetRtl(org.apache.xmlbeans.XmlBoolean rtl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RTL$22);
            }
            target.set(rtl);
        }
    }
    
    /**
     * Unsets the "rtl" attribute
     */
    public void unsetRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RTL$22);
        }
    }
    
    /**
     * Gets the "firstRow" attribute
     */
    public boolean getFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTROW$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIRSTROW$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstRow" attribute
     */
    public boolean isSetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTROW$24) != null;
        }
    }
    
    /**
     * Sets the "firstRow" attribute
     */
    public void setFirstRow(boolean firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTROW$24);
            }
            target.setBooleanValue(firstRow);
        }
    }
    
    /**
     * Sets (as xml) the "firstRow" attribute
     */
    public void xsetFirstRow(org.apache.xmlbeans.XmlBoolean firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIRSTROW$24);
            }
            target.set(firstRow);
        }
    }
    
    /**
     * Unsets the "firstRow" attribute
     */
    public void unsetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTROW$24);
        }
    }
    
    /**
     * Gets the "firstCol" attribute
     */
    public boolean getFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTCOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTCOL$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTCOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIRSTCOL$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstCol" attribute
     */
    public boolean isSetFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTCOL$26) != null;
        }
    }
    
    /**
     * Sets the "firstCol" attribute
     */
    public void setFirstCol(boolean firstCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTCOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTCOL$26);
            }
            target.setBooleanValue(firstCol);
        }
    }
    
    /**
     * Sets (as xml) the "firstCol" attribute
     */
    public void xsetFirstCol(org.apache.xmlbeans.XmlBoolean firstCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTCOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIRSTCOL$26);
            }
            target.set(firstCol);
        }
    }
    
    /**
     * Unsets the "firstCol" attribute
     */
    public void unsetFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTCOL$26);
        }
    }
    
    /**
     * Gets the "lastRow" attribute
     */
    public boolean getLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LASTROW$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LASTROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LASTROW$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "lastRow" attribute
     */
    public boolean isSetLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTROW$28) != null;
        }
    }
    
    /**
     * Sets the "lastRow" attribute
     */
    public void setLastRow(boolean lastRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTROW$28);
            }
            target.setBooleanValue(lastRow);
        }
    }
    
    /**
     * Sets (as xml) the "lastRow" attribute
     */
    public void xsetLastRow(org.apache.xmlbeans.XmlBoolean lastRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LASTROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LASTROW$28);
            }
            target.set(lastRow);
        }
    }
    
    /**
     * Unsets the "lastRow" attribute
     */
    public void unsetLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTROW$28);
        }
    }
    
    /**
     * Gets the "lastCol" attribute
     */
    public boolean getLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LASTCOL$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LASTCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LASTCOL$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "lastCol" attribute
     */
    public boolean isSetLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTCOL$30) != null;
        }
    }
    
    /**
     * Sets the "lastCol" attribute
     */
    public void setLastCol(boolean lastCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTCOL$30);
            }
            target.setBooleanValue(lastCol);
        }
    }
    
    /**
     * Sets (as xml) the "lastCol" attribute
     */
    public void xsetLastCol(org.apache.xmlbeans.XmlBoolean lastCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LASTCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LASTCOL$30);
            }
            target.set(lastCol);
        }
    }
    
    /**
     * Unsets the "lastCol" attribute
     */
    public void unsetLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTCOL$30);
        }
    }
    
    /**
     * Gets the "bandRow" attribute
     */
    public boolean getBandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDROW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BANDROW$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bandRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BANDROW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BANDROW$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "bandRow" attribute
     */
    public boolean isSetBandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BANDROW$32) != null;
        }
    }
    
    /**
     * Sets the "bandRow" attribute
     */
    public void setBandRow(boolean bandRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDROW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANDROW$32);
            }
            target.setBooleanValue(bandRow);
        }
    }
    
    /**
     * Sets (as xml) the "bandRow" attribute
     */
    public void xsetBandRow(org.apache.xmlbeans.XmlBoolean bandRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BANDROW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BANDROW$32);
            }
            target.set(bandRow);
        }
    }
    
    /**
     * Unsets the "bandRow" attribute
     */
    public void unsetBandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BANDROW$32);
        }
    }
    
    /**
     * Gets the "bandCol" attribute
     */
    public boolean getBandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDCOL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BANDCOL$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bandCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BANDCOL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BANDCOL$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "bandCol" attribute
     */
    public boolean isSetBandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BANDCOL$34) != null;
        }
    }
    
    /**
     * Sets the "bandCol" attribute
     */
    public void setBandCol(boolean bandCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDCOL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANDCOL$34);
            }
            target.setBooleanValue(bandCol);
        }
    }
    
    /**
     * Sets (as xml) the "bandCol" attribute
     */
    public void xsetBandCol(org.apache.xmlbeans.XmlBoolean bandCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BANDCOL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BANDCOL$34);
            }
            target.set(bandCol);
        }
    }
    
    /**
     * Unsets the "bandCol" attribute
     */
    public void unsetBandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BANDCOL$34);
        }
    }
}

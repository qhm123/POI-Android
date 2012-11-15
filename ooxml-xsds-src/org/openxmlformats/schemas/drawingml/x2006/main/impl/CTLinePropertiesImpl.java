/*
 * XML Type:  CT_LineProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LineProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLinePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties
{
    
    public CTLinePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOFILL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
    private static final javax.xml.namespace.QName SOLIDFILL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
    private static final javax.xml.namespace.QName GRADFILL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
    private static final javax.xml.namespace.QName PATTFILL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
    private static final javax.xml.namespace.QName PRSTDASH$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstDash");
    private static final javax.xml.namespace.QName CUSTDASH$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "custDash");
    private static final javax.xml.namespace.QName ROUND$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "round");
    private static final javax.xml.namespace.QName BEVEL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bevel");
    private static final javax.xml.namespace.QName MITER$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "miter");
    private static final javax.xml.namespace.QName HEADEND$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "headEnd");
    private static final javax.xml.namespace.QName TAILEND$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tailEnd");
    private static final javax.xml.namespace.QName EXTLST$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName W$24 = 
        new javax.xml.namespace.QName("", "w");
    private static final javax.xml.namespace.QName CAP$26 = 
        new javax.xml.namespace.QName("", "cap");
    private static final javax.xml.namespace.QName CMPD$28 = 
        new javax.xml.namespace.QName("", "cmpd");
    private static final javax.xml.namespace.QName ALGN$30 = 
        new javax.xml.namespace.QName("", "algn");
    
    
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
     * Gets the "pattFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties getPattFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$6, 0);
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
            return get_store().count_elements(PATTFILL$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$6);
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
            get_store().remove_element(PATTFILL$6, 0);
        }
    }
    
    /**
     * Gets the "prstDash" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties getPrstDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties)get_store().find_element_user(PRSTDASH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prstDash" element
     */
    public boolean isSetPrstDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTDASH$8) != 0;
        }
    }
    
    /**
     * Sets the "prstDash" element
     */
    public void setPrstDash(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties prstDash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties)get_store().find_element_user(PRSTDASH$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties)get_store().add_element_user(PRSTDASH$8);
            }
            target.set(prstDash);
        }
    }
    
    /**
     * Appends and returns a new empty "prstDash" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties addNewPrstDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties)get_store().add_element_user(PRSTDASH$8);
            return target;
        }
    }
    
    /**
     * Unsets the "prstDash" element
     */
    public void unsetPrstDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTDASH$8, 0);
        }
    }
    
    /**
     * Gets the "custDash" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList getCustDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList)get_store().find_element_user(CUSTDASH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custDash" element
     */
    public boolean isSetCustDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTDASH$10) != 0;
        }
    }
    
    /**
     * Sets the "custDash" element
     */
    public void setCustDash(org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList custDash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList)get_store().find_element_user(CUSTDASH$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList)get_store().add_element_user(CUSTDASH$10);
            }
            target.set(custDash);
        }
    }
    
    /**
     * Appends and returns a new empty "custDash" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList addNewCustDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList)get_store().add_element_user(CUSTDASH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "custDash" element
     */
    public void unsetCustDash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTDASH$10, 0);
        }
    }
    
    /**
     * Gets the "round" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound getRound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound)get_store().find_element_user(ROUND$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "round" element
     */
    public boolean isSetRound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUND$12) != 0;
        }
    }
    
    /**
     * Sets the "round" element
     */
    public void setRound(org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound round)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound)get_store().find_element_user(ROUND$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound)get_store().add_element_user(ROUND$12);
            }
            target.set(round);
        }
    }
    
    /**
     * Appends and returns a new empty "round" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound addNewRound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound)get_store().add_element_user(ROUND$12);
            return target;
        }
    }
    
    /**
     * Unsets the "round" element
     */
    public void unsetRound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUND$12, 0);
        }
    }
    
    /**
     * Gets the "bevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel getBevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel)get_store().find_element_user(BEVEL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bevel" element
     */
    public boolean isSetBevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEVEL$14) != 0;
        }
    }
    
    /**
     * Sets the "bevel" element
     */
    public void setBevel(org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel bevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel)get_store().find_element_user(BEVEL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel)get_store().add_element_user(BEVEL$14);
            }
            target.set(bevel);
        }
    }
    
    /**
     * Appends and returns a new empty "bevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel addNewBevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel)get_store().add_element_user(BEVEL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "bevel" element
     */
    public void unsetBevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEVEL$14, 0);
        }
    }
    
    /**
     * Gets the "miter" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties getMiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties)get_store().find_element_user(MITER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "miter" element
     */
    public boolean isSetMiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MITER$16) != 0;
        }
    }
    
    /**
     * Sets the "miter" element
     */
    public void setMiter(org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties miter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties)get_store().find_element_user(MITER$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties)get_store().add_element_user(MITER$16);
            }
            target.set(miter);
        }
    }
    
    /**
     * Appends and returns a new empty "miter" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties addNewMiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties)get_store().add_element_user(MITER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "miter" element
     */
    public void unsetMiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MITER$16, 0);
        }
    }
    
    /**
     * Gets the "headEnd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties getHeadEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().find_element_user(HEADEND$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "headEnd" element
     */
    public boolean isSetHeadEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADEND$18) != 0;
        }
    }
    
    /**
     * Sets the "headEnd" element
     */
    public void setHeadEnd(org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties headEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().find_element_user(HEADEND$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().add_element_user(HEADEND$18);
            }
            target.set(headEnd);
        }
    }
    
    /**
     * Appends and returns a new empty "headEnd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties addNewHeadEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().add_element_user(HEADEND$18);
            return target;
        }
    }
    
    /**
     * Unsets the "headEnd" element
     */
    public void unsetHeadEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADEND$18, 0);
        }
    }
    
    /**
     * Gets the "tailEnd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties getTailEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().find_element_user(TAILEND$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tailEnd" element
     */
    public boolean isSetTailEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAILEND$20) != 0;
        }
    }
    
    /**
     * Sets the "tailEnd" element
     */
    public void setTailEnd(org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties tailEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().find_element_user(TAILEND$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().add_element_user(TAILEND$20);
            }
            target.set(tailEnd);
        }
    }
    
    /**
     * Appends and returns a new empty "tailEnd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties addNewTailEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties)get_store().add_element_user(TAILEND$20);
            return target;
        }
    }
    
    /**
     * Unsets the "tailEnd" element
     */
    public void unsetTailEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAILEND$20, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$22, 0);
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
            return get_store().count_elements(EXTLST$22) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$22);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$22);
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
            get_store().remove_element(EXTLST$22, 0);
        }
    }
    
    /**
     * Gets the "w" attribute
     */
    public int getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$24);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth)get_store().find_attribute_user(W$24);
            return target;
        }
    }
    
    /**
     * True if has "w" attribute
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(W$24) != null;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(int w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$24);
            }
            target.setIntValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth)get_store().find_attribute_user(W$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth)get_store().add_attribute_user(W$24);
            }
            target.set(w);
        }
    }
    
    /**
     * Unsets the "w" attribute
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(W$24);
        }
    }
    
    /**
     * Gets the "cap" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineCap.Enum getCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAP$26);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STLineCap.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cap" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineCap xgetCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineCap target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineCap)get_store().find_attribute_user(CAP$26);
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
            return get_store().find_attribute_user(CAP$26) != null;
        }
    }
    
    /**
     * Sets the "cap" attribute
     */
    public void setCap(org.openxmlformats.schemas.drawingml.x2006.main.STLineCap.Enum cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAP$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAP$26);
            }
            target.setEnumValue(cap);
        }
    }
    
    /**
     * Sets (as xml) the "cap" attribute
     */
    public void xsetCap(org.openxmlformats.schemas.drawingml.x2006.main.STLineCap cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineCap target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineCap)get_store().find_attribute_user(CAP$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineCap)get_store().add_attribute_user(CAP$26);
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
            get_store().remove_attribute(CAP$26);
        }
    }
    
    /**
     * Gets the "cmpd" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine.Enum getCmpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CMPD$28);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cmpd" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine xgetCmpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine)get_store().find_attribute_user(CMPD$28);
            return target;
        }
    }
    
    /**
     * True if has "cmpd" attribute
     */
    public boolean isSetCmpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CMPD$28) != null;
        }
    }
    
    /**
     * Sets the "cmpd" attribute
     */
    public void setCmpd(org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine.Enum cmpd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CMPD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CMPD$28);
            }
            target.setEnumValue(cmpd);
        }
    }
    
    /**
     * Sets (as xml) the "cmpd" attribute
     */
    public void xsetCmpd(org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine cmpd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine)get_store().find_attribute_user(CMPD$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine)get_store().add_attribute_user(CMPD$28);
            }
            target.set(cmpd);
        }
    }
    
    /**
     * Unsets the "cmpd" attribute
     */
    public void unsetCmpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CMPD$28);
        }
    }
    
    /**
     * Gets the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment.Enum getAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$30);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment xgetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment)get_store().find_attribute_user(ALGN$30);
            return target;
        }
    }
    
    /**
     * True if has "algn" attribute
     */
    public boolean isSetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGN$30) != null;
        }
    }
    
    /**
     * Sets the "algn" attribute
     */
    public void setAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment.Enum algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGN$30);
            }
            target.setEnumValue(algn);
        }
    }
    
    /**
     * Sets (as xml) the "algn" attribute
     */
    public void xsetAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment)get_store().find_attribute_user(ALGN$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment)get_store().add_attribute_user(ALGN$30);
            }
            target.set(algn);
        }
    }
    
    /**
     * Unsets the "algn" attribute
     */
    public void unsetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGN$30);
        }
    }
}

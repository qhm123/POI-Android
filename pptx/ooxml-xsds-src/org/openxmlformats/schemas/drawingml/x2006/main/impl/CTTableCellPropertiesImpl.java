/*
 * XML Type:  CT_TableCellProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableCellProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableCellPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties
{
    
    public CTTableCellPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LNL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnL");
    private static final javax.xml.namespace.QName LNR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnR");
    private static final javax.xml.namespace.QName LNT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnT");
    private static final javax.xml.namespace.QName LNB$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnB");
    private static final javax.xml.namespace.QName LNTLTOBR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnTlToBr");
    private static final javax.xml.namespace.QName LNBLTOTR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnBlToTr");
    private static final javax.xml.namespace.QName CELL3D$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cell3D");
    private static final javax.xml.namespace.QName NOFILL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
    private static final javax.xml.namespace.QName SOLIDFILL$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
    private static final javax.xml.namespace.QName GRADFILL$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
    private static final javax.xml.namespace.QName BLIPFILL$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
    private static final javax.xml.namespace.QName PATTFILL$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
    private static final javax.xml.namespace.QName GRPFILL$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
    private static final javax.xml.namespace.QName EXTLST$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName MARL$28 = 
        new javax.xml.namespace.QName("", "marL");
    private static final javax.xml.namespace.QName MARR$30 = 
        new javax.xml.namespace.QName("", "marR");
    private static final javax.xml.namespace.QName MART$32 = 
        new javax.xml.namespace.QName("", "marT");
    private static final javax.xml.namespace.QName MARB$34 = 
        new javax.xml.namespace.QName("", "marB");
    private static final javax.xml.namespace.QName VERT$36 = 
        new javax.xml.namespace.QName("", "vert");
    private static final javax.xml.namespace.QName ANCHOR$38 = 
        new javax.xml.namespace.QName("", "anchor");
    private static final javax.xml.namespace.QName ANCHORCTR$40 = 
        new javax.xml.namespace.QName("", "anchorCtr");
    private static final javax.xml.namespace.QName HORZOVERFLOW$42 = 
        new javax.xml.namespace.QName("", "horzOverflow");
    
    
    /**
     * Gets the "lnL" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnL" element
     */
    public boolean isSetLnL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNL$0) != 0;
        }
    }
    
    /**
     * Sets the "lnL" element
     */
    public void setLnL(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties lnL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNL$0);
            }
            target.set(lnL);
        }
    }
    
    /**
     * Appends and returns a new empty "lnL" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLnL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "lnL" element
     */
    public void unsetLnL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNL$0, 0);
        }
    }
    
    /**
     * Gets the "lnR" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnR" element
     */
    public boolean isSetLnR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNR$2) != 0;
        }
    }
    
    /**
     * Sets the "lnR" element
     */
    public void setLnR(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties lnR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNR$2);
            }
            target.set(lnR);
        }
    }
    
    /**
     * Appends and returns a new empty "lnR" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLnR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lnR" element
     */
    public void unsetLnR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNR$2, 0);
        }
    }
    
    /**
     * Gets the "lnT" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnT" element
     */
    public boolean isSetLnT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNT$4) != 0;
        }
    }
    
    /**
     * Sets the "lnT" element
     */
    public void setLnT(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties lnT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNT$4);
            }
            target.set(lnT);
        }
    }
    
    /**
     * Appends and returns a new empty "lnT" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLnT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "lnT" element
     */
    public void unsetLnT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNT$4, 0);
        }
    }
    
    /**
     * Gets the "lnB" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNB$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnB" element
     */
    public boolean isSetLnB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNB$6) != 0;
        }
    }
    
    /**
     * Sets the "lnB" element
     */
    public void setLnB(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties lnB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNB$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNB$6);
            }
            target.set(lnB);
        }
    }
    
    /**
     * Appends and returns a new empty "lnB" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLnB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNB$6);
            return target;
        }
    }
    
    /**
     * Unsets the "lnB" element
     */
    public void unsetLnB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNB$6, 0);
        }
    }
    
    /**
     * Gets the "lnTlToBr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnTlToBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNTLTOBR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnTlToBr" element
     */
    public boolean isSetLnTlToBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNTLTOBR$8) != 0;
        }
    }
    
    /**
     * Sets the "lnTlToBr" element
     */
    public void setLnTlToBr(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties lnTlToBr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNTLTOBR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNTLTOBR$8);
            }
            target.set(lnTlToBr);
        }
    }
    
    /**
     * Appends and returns a new empty "lnTlToBr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLnTlToBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNTLTOBR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "lnTlToBr" element
     */
    public void unsetLnTlToBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNTLTOBR$8, 0);
        }
    }
    
    /**
     * Gets the "lnBlToTr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnBlToTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNBLTOTR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnBlToTr" element
     */
    public boolean isSetLnBlToTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNBLTOTR$10) != 0;
        }
    }
    
    /**
     * Sets the "lnBlToTr" element
     */
    public void setLnBlToTr(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties lnBlToTr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LNBLTOTR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNBLTOTR$10);
            }
            target.set(lnBlToTr);
        }
    }
    
    /**
     * Appends and returns a new empty "lnBlToTr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLnBlToTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LNBLTOTR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "lnBlToTr" element
     */
    public void unsetLnBlToTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNBLTOTR$10, 0);
        }
    }
    
    /**
     * Gets the "cell3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D getCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().find_element_user(CELL3D$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cell3D" element
     */
    public boolean isSetCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELL3D$12) != 0;
        }
    }
    
    /**
     * Sets the "cell3D" element
     */
    public void setCell3D(org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D cell3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().find_element_user(CELL3D$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().add_element_user(CELL3D$12);
            }
            target.set(cell3D);
        }
    }
    
    /**
     * Appends and returns a new empty "cell3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D addNewCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().add_element_user(CELL3D$12);
            return target;
        }
    }
    
    /**
     * Unsets the "cell3D" element
     */
    public void unsetCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELL3D$12, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$14, 0);
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
            return get_store().count_elements(NOFILL$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$14);
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
            get_store().remove_element(NOFILL$14, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$16, 0);
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
            return get_store().count_elements(SOLIDFILL$16) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$16);
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
            get_store().remove_element(SOLIDFILL$16, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$18, 0);
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
            return get_store().count_elements(GRADFILL$18) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$18);
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
            get_store().remove_element(GRADFILL$18, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$20, 0);
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
            return get_store().count_elements(BLIPFILL$20) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$20);
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
            get_store().remove_element(BLIPFILL$20, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$22, 0);
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
            return get_store().count_elements(PATTFILL$22) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$22);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$22);
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
            get_store().remove_element(PATTFILL$22, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$24, 0);
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
            return get_store().count_elements(GRPFILL$24) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$24);
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
            get_store().remove_element(GRPFILL$24, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$26, 0);
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
            return get_store().count_elements(EXTLST$26) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$26);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$26);
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
            get_store().remove_element(EXTLST$26, 0);
        }
    }
    
    /**
     * Gets the "marL" attribute
     */
    public int getMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MARL$28);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marL" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MARL$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_default_attribute_value(MARL$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "marL" attribute
     */
    public boolean isSetMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARL$28) != null;
        }
    }
    
    /**
     * Sets the "marL" attribute
     */
    public void setMarL(int marL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARL$28);
            }
            target.setIntValue(marL);
        }
    }
    
    /**
     * Sets (as xml) the "marL" attribute
     */
    public void xsetMarL(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 marL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MARL$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(MARL$28);
            }
            target.set(marL);
        }
    }
    
    /**
     * Unsets the "marL" attribute
     */
    public void unsetMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARL$28);
        }
    }
    
    /**
     * Gets the "marR" attribute
     */
    public int getMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARR$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MARR$30);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MARR$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_default_attribute_value(MARR$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "marR" attribute
     */
    public boolean isSetMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARR$30) != null;
        }
    }
    
    /**
     * Sets the "marR" attribute
     */
    public void setMarR(int marR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARR$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARR$30);
            }
            target.setIntValue(marR);
        }
    }
    
    /**
     * Sets (as xml) the "marR" attribute
     */
    public void xsetMarR(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 marR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MARR$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(MARR$30);
            }
            target.set(marR);
        }
    }
    
    /**
     * Unsets the "marR" attribute
     */
    public void unsetMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARR$30);
        }
    }
    
    /**
     * Gets the "marT" attribute
     */
    public int getMarT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MART$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MART$32);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marT" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetMarT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MART$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_default_attribute_value(MART$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "marT" attribute
     */
    public boolean isSetMarT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MART$32) != null;
        }
    }
    
    /**
     * Sets the "marT" attribute
     */
    public void setMarT(int marT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MART$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MART$32);
            }
            target.setIntValue(marT);
        }
    }
    
    /**
     * Sets (as xml) the "marT" attribute
     */
    public void xsetMarT(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 marT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MART$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(MART$32);
            }
            target.set(marT);
        }
    }
    
    /**
     * Unsets the "marT" attribute
     */
    public void unsetMarT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MART$32);
        }
    }
    
    /**
     * Gets the "marB" attribute
     */
    public int getMarB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARB$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MARB$34);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marB" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetMarB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MARB$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_default_attribute_value(MARB$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "marB" attribute
     */
    public boolean isSetMarB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARB$34) != null;
        }
    }
    
    /**
     * Sets the "marB" attribute
     */
    public void setMarB(int marB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARB$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARB$34);
            }
            target.setIntValue(marB);
        }
    }
    
    /**
     * Sets (as xml) the "marB" attribute
     */
    public void xsetMarB(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 marB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(MARB$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(MARB$34);
            }
            target.set(marB);
        }
    }
    
    /**
     * Unsets the "marB" attribute
     */
    public void unsetMarB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARB$34);
        }
    }
    
    /**
     * Gets the "vert" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.Enum getVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERT$36);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vert" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType xgetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_store().find_attribute_user(VERT$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_default_attribute_value(VERT$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "vert" attribute
     */
    public boolean isSetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERT$36) != null;
        }
    }
    
    /**
     * Sets the "vert" attribute
     */
    public void setVert(org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.Enum vert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERT$36);
            }
            target.setEnumValue(vert);
        }
    }
    
    /**
     * Sets (as xml) the "vert" attribute
     */
    public void xsetVert(org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType vert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_store().find_attribute_user(VERT$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_store().add_attribute_user(VERT$36);
            }
            target.set(vert);
        }
    }
    
    /**
     * Unsets the "vert" attribute
     */
    public void unsetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERT$36);
        }
    }
    
    /**
     * Gets the "anchor" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType.Enum getAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHOR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ANCHOR$38);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchor" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType xgetAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_store().find_attribute_user(ANCHOR$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_default_attribute_value(ANCHOR$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "anchor" attribute
     */
    public boolean isSetAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHOR$38) != null;
        }
    }
    
    /**
     * Sets the "anchor" attribute
     */
    public void setAnchor(org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType.Enum anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHOR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHOR$38);
            }
            target.setEnumValue(anchor);
        }
    }
    
    /**
     * Sets (as xml) the "anchor" attribute
     */
    public void xsetAnchor(org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_store().find_attribute_user(ANCHOR$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_store().add_attribute_user(ANCHOR$38);
            }
            target.set(anchor);
        }
    }
    
    /**
     * Unsets the "anchor" attribute
     */
    public void unsetAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHOR$38);
        }
    }
    
    /**
     * Gets the "anchorCtr" attribute
     */
    public boolean getAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORCTR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ANCHORCTR$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchorCtr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANCHORCTR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ANCHORCTR$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "anchorCtr" attribute
     */
    public boolean isSetAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHORCTR$40) != null;
        }
    }
    
    /**
     * Sets the "anchorCtr" attribute
     */
    public void setAnchorCtr(boolean anchorCtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORCTR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHORCTR$40);
            }
            target.setBooleanValue(anchorCtr);
        }
    }
    
    /**
     * Sets (as xml) the "anchorCtr" attribute
     */
    public void xsetAnchorCtr(org.apache.xmlbeans.XmlBoolean anchorCtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANCHORCTR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ANCHORCTR$40);
            }
            target.set(anchorCtr);
        }
    }
    
    /**
     * Unsets the "anchorCtr" attribute
     */
    public void unsetAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHORCTR$40);
        }
    }
    
    /**
     * Gets the "horzOverflow" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType.Enum getHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZOVERFLOW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORZOVERFLOW$42);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horzOverflow" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType xgetHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_store().find_attribute_user(HORZOVERFLOW$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_default_attribute_value(HORZOVERFLOW$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "horzOverflow" attribute
     */
    public boolean isSetHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORZOVERFLOW$42) != null;
        }
    }
    
    /**
     * Sets the "horzOverflow" attribute
     */
    public void setHorzOverflow(org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType.Enum horzOverflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZOVERFLOW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORZOVERFLOW$42);
            }
            target.setEnumValue(horzOverflow);
        }
    }
    
    /**
     * Sets (as xml) the "horzOverflow" attribute
     */
    public void xsetHorzOverflow(org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType horzOverflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_store().find_attribute_user(HORZOVERFLOW$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_store().add_attribute_user(HORZOVERFLOW$42);
            }
            target.set(horzOverflow);
        }
    }
    
    /**
     * Unsets the "horzOverflow" attribute
     */
    public void unsetHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORZOVERFLOW$42);
        }
    }
}

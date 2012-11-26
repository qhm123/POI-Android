/*
 * XML Type:  CT_FillEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_FillEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFillEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect
{
    
    public CTFillEffectImpl(org.apache.xmlbeans.SchemaType sType)
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
}

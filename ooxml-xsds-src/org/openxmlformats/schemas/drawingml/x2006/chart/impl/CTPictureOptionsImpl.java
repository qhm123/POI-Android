/*
 * XML Type:  CT_PictureOptions
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_PictureOptions(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPictureOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions
{
    
    public CTPictureOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYTOFRONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "applyToFront");
    private static final javax.xml.namespace.QName APPLYTOSIDES$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "applyToSides");
    private static final javax.xml.namespace.QName APPLYTOEND$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "applyToEnd");
    private static final javax.xml.namespace.QName PICTUREFORMAT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pictureFormat");
    private static final javax.xml.namespace.QName PICTURESTACKUNIT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pictureStackUnit");
    
    
    /**
     * Gets the "applyToFront" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getApplyToFront()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(APPLYTOFRONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "applyToFront" element
     */
    public boolean isSetApplyToFront()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLYTOFRONT$0) != 0;
        }
    }
    
    /**
     * Sets the "applyToFront" element
     */
    public void setApplyToFront(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean applyToFront)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(APPLYTOFRONT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(APPLYTOFRONT$0);
            }
            target.set(applyToFront);
        }
    }
    
    /**
     * Appends and returns a new empty "applyToFront" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewApplyToFront()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(APPLYTOFRONT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "applyToFront" element
     */
    public void unsetApplyToFront()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLYTOFRONT$0, 0);
        }
    }
    
    /**
     * Gets the "applyToSides" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getApplyToSides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(APPLYTOSIDES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "applyToSides" element
     */
    public boolean isSetApplyToSides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLYTOSIDES$2) != 0;
        }
    }
    
    /**
     * Sets the "applyToSides" element
     */
    public void setApplyToSides(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean applyToSides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(APPLYTOSIDES$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(APPLYTOSIDES$2);
            }
            target.set(applyToSides);
        }
    }
    
    /**
     * Appends and returns a new empty "applyToSides" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewApplyToSides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(APPLYTOSIDES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "applyToSides" element
     */
    public void unsetApplyToSides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLYTOSIDES$2, 0);
        }
    }
    
    /**
     * Gets the "applyToEnd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getApplyToEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(APPLYTOEND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "applyToEnd" element
     */
    public boolean isSetApplyToEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLYTOEND$4) != 0;
        }
    }
    
    /**
     * Sets the "applyToEnd" element
     */
    public void setApplyToEnd(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean applyToEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(APPLYTOEND$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(APPLYTOEND$4);
            }
            target.set(applyToEnd);
        }
    }
    
    /**
     * Appends and returns a new empty "applyToEnd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewApplyToEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(APPLYTOEND$4);
            return target;
        }
    }
    
    /**
     * Unsets the "applyToEnd" element
     */
    public void unsetApplyToEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLYTOEND$4, 0);
        }
    }
    
    /**
     * Gets the "pictureFormat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat getPictureFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat)get_store().find_element_user(PICTUREFORMAT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pictureFormat" element
     */
    public boolean isSetPictureFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTUREFORMAT$6) != 0;
        }
    }
    
    /**
     * Sets the "pictureFormat" element
     */
    public void setPictureFormat(org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat pictureFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat)get_store().find_element_user(PICTUREFORMAT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat)get_store().add_element_user(PICTUREFORMAT$6);
            }
            target.set(pictureFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "pictureFormat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat addNewPictureFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureFormat)get_store().add_element_user(PICTUREFORMAT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "pictureFormat" element
     */
    public void unsetPictureFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTUREFORMAT$6, 0);
        }
    }
    
    /**
     * Gets the "pictureStackUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit getPictureStackUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit)get_store().find_element_user(PICTURESTACKUNIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pictureStackUnit" element
     */
    public boolean isSetPictureStackUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTURESTACKUNIT$8) != 0;
        }
    }
    
    /**
     * Sets the "pictureStackUnit" element
     */
    public void setPictureStackUnit(org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit pictureStackUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit)get_store().find_element_user(PICTURESTACKUNIT$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit)get_store().add_element_user(PICTURESTACKUNIT$8);
            }
            target.set(pictureStackUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "pictureStackUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit addNewPictureStackUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureStackUnit)get_store().add_element_user(PICTURESTACKUNIT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "pictureStackUnit" element
     */
    public void unsetPictureStackUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTURESTACKUNIT$8, 0);
        }
    }
}

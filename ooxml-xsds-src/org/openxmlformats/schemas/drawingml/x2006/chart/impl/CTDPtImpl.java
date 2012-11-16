/*
 * XML Type:  CT_DPt
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_DPt(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTDPtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt
{
    
    public CTDPtImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "idx");
    private static final javax.xml.namespace.QName INVERTIFNEGATIVE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "invertIfNegative");
    private static final javax.xml.namespace.QName MARKER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "marker");
    private static final javax.xml.namespace.QName BUBBLE3D$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bubble3D");
    private static final javax.xml.namespace.QName EXPLOSION$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "explosion");
    private static final javax.xml.namespace.QName SPPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName PICTUREOPTIONS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pictureOptions");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "idx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(IDX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idx" element
     */
    public void setIdx(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(IDX$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(IDX$0);
            }
            target.set(idx);
        }
    }
    
    /**
     * Appends and returns a new empty "idx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(IDX$0);
            return target;
        }
    }
    
    /**
     * Gets the "invertIfNegative" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(INVERTIFNEGATIVE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "invertIfNegative" element
     */
    public boolean isSetInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVERTIFNEGATIVE$2) != 0;
        }
    }
    
    /**
     * Sets the "invertIfNegative" element
     */
    public void setInvertIfNegative(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean invertIfNegative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(INVERTIFNEGATIVE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(INVERTIFNEGATIVE$2);
            }
            target.set(invertIfNegative);
        }
    }
    
    /**
     * Appends and returns a new empty "invertIfNegative" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(INVERTIFNEGATIVE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "invertIfNegative" element
     */
    public void unsetInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVERTIFNEGATIVE$2, 0);
        }
    }
    
    /**
     * Gets the "marker" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker getMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker)get_store().find_element_user(MARKER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marker" element
     */
    public boolean isSetMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKER$4) != 0;
        }
    }
    
    /**
     * Sets the "marker" element
     */
    public void setMarker(org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker marker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker)get_store().find_element_user(MARKER$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker)get_store().add_element_user(MARKER$4);
            }
            target.set(marker);
        }
    }
    
    /**
     * Appends and returns a new empty "marker" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker addNewMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker)get_store().add_element_user(MARKER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "marker" element
     */
    public void unsetMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKER$4, 0);
        }
    }
    
    /**
     * Gets the "bubble3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getBubble3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(BUBBLE3D$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bubble3D" element
     */
    public boolean isSetBubble3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUBBLE3D$6) != 0;
        }
    }
    
    /**
     * Sets the "bubble3D" element
     */
    public void setBubble3D(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean bubble3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(BUBBLE3D$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(BUBBLE3D$6);
            }
            target.set(bubble3D);
        }
    }
    
    /**
     * Appends and returns a new empty "bubble3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewBubble3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(BUBBLE3D$6);
            return target;
        }
    }
    
    /**
     * Unsets the "bubble3D" element
     */
    public void unsetBubble3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUBBLE3D$6, 0);
        }
    }
    
    /**
     * Gets the "explosion" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getExplosion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(EXPLOSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "explosion" element
     */
    public boolean isSetExplosion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPLOSION$8) != 0;
        }
    }
    
    /**
     * Sets the "explosion" element
     */
    public void setExplosion(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt explosion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(EXPLOSION$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(EXPLOSION$8);
            }
            target.set(explosion);
        }
    }
    
    /**
     * Appends and returns a new empty "explosion" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewExplosion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(EXPLOSION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "explosion" element
     */
    public void unsetExplosion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPLOSION$8, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$10) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$10);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$10, 0);
        }
    }
    
    /**
     * Gets the "pictureOptions" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions getPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().find_element_user(PICTUREOPTIONS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pictureOptions" element
     */
    public boolean isSetPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTUREOPTIONS$12) != 0;
        }
    }
    
    /**
     * Sets the "pictureOptions" element
     */
    public void setPictureOptions(org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions pictureOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().find_element_user(PICTUREOPTIONS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().add_element_user(PICTUREOPTIONS$12);
            }
            target.set(pictureOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "pictureOptions" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions addNewPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().add_element_user(PICTUREOPTIONS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "pictureOptions" element
     */
    public void unsetPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTUREOPTIONS$12, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
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
            return get_store().count_elements(EXTLST$14) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$14);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
            get_store().remove_element(EXTLST$14, 0);
        }
    }
}

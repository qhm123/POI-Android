/*
 * XML Type:  CT_ErrBars
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_ErrBars(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTErrBarsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars
{
    
    public CTErrBarsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRDIR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "errDir");
    private static final javax.xml.namespace.QName ERRBARTYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "errBarType");
    private static final javax.xml.namespace.QName ERRVALTYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "errValType");
    private static final javax.xml.namespace.QName NOENDCAP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "noEndCap");
    private static final javax.xml.namespace.QName PLUS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "plus");
    private static final javax.xml.namespace.QName MINUS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "minus");
    private static final javax.xml.namespace.QName VAL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "val");
    private static final javax.xml.namespace.QName SPPR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName EXTLST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "errDir" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir getErrDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir)get_store().find_element_user(ERRDIR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errDir" element
     */
    public boolean isSetErrDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRDIR$0) != 0;
        }
    }
    
    /**
     * Sets the "errDir" element
     */
    public void setErrDir(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir errDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir)get_store().find_element_user(ERRDIR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir)get_store().add_element_user(ERRDIR$0);
            }
            target.set(errDir);
        }
    }
    
    /**
     * Appends and returns a new empty "errDir" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir addNewErrDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrDir)get_store().add_element_user(ERRDIR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "errDir" element
     */
    public void unsetErrDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRDIR$0, 0);
        }
    }
    
    /**
     * Gets the "errBarType" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType getErrBarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType)get_store().find_element_user(ERRBARTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errBarType" element
     */
    public void setErrBarType(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType errBarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType)get_store().find_element_user(ERRBARTYPE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType)get_store().add_element_user(ERRBARTYPE$2);
            }
            target.set(errBarType);
        }
    }
    
    /**
     * Appends and returns a new empty "errBarType" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType addNewErrBarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBarType)get_store().add_element_user(ERRBARTYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "errValType" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType getErrValType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType)get_store().find_element_user(ERRVALTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errValType" element
     */
    public void setErrValType(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType errValType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType)get_store().find_element_user(ERRVALTYPE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType)get_store().add_element_user(ERRVALTYPE$4);
            }
            target.set(errValType);
        }
    }
    
    /**
     * Appends and returns a new empty "errValType" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType addNewErrValType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrValType)get_store().add_element_user(ERRVALTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "noEndCap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getNoEndCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(NOENDCAP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noEndCap" element
     */
    public boolean isSetNoEndCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOENDCAP$6) != 0;
        }
    }
    
    /**
     * Sets the "noEndCap" element
     */
    public void setNoEndCap(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean noEndCap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(NOENDCAP$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(NOENDCAP$6);
            }
            target.set(noEndCap);
        }
    }
    
    /**
     * Appends and returns a new empty "noEndCap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewNoEndCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(NOENDCAP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "noEndCap" element
     */
    public void unsetNoEndCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOENDCAP$6, 0);
        }
    }
    
    /**
     * Gets the "plus" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource getPlus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(PLUS$8, 0);
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
            return get_store().count_elements(PLUS$8) != 0;
        }
    }
    
    /**
     * Sets the "plus" element
     */
    public void setPlus(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource plus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(PLUS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(PLUS$8);
            }
            target.set(plus);
        }
    }
    
    /**
     * Appends and returns a new empty "plus" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource addNewPlus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(PLUS$8);
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
            get_store().remove_element(PLUS$8, 0);
        }
    }
    
    /**
     * Gets the "minus" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource getMinus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(MINUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minus" element
     */
    public boolean isSetMinus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINUS$10) != 0;
        }
    }
    
    /**
     * Sets the "minus" element
     */
    public void setMinus(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource minus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(MINUS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(MINUS$10);
            }
            target.set(minus);
        }
    }
    
    /**
     * Appends and returns a new empty "minus" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource addNewMinus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(MINUS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "minus" element
     */
    public void unsetMinus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINUS$10, 0);
        }
    }
    
    /**
     * Gets the "val" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(VAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "val" element
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAL$12) != 0;
        }
    }
    
    /**
     * Sets the "val" element
     */
    public void setVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(VAL$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(VAL$12);
            }
            target.set(val);
        }
    }
    
    /**
     * Appends and returns a new empty "val" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(VAL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "val" element
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAL$12, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$14, 0);
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
            return get_store().count_elements(SPPR$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$14);
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
            get_store().remove_element(SPPR$14, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$16, 0);
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
            return get_store().count_elements(EXTLST$16) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$16);
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
            get_store().remove_element(EXTLST$16, 0);
        }
    }
}

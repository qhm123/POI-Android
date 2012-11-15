/*
 * XML Type:  CT_SlideMaster
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideMaster(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideMasterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster
{
    
    public CTSlideMasterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
    private static final javax.xml.namespace.QName CLRMAP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMap");
    private static final javax.xml.namespace.QName SLDLAYOUTIDLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldLayoutIdLst");
    private static final javax.xml.namespace.QName TRANSITION$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "transition");
    private static final javax.xml.namespace.QName TIMING$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "timing");
    private static final javax.xml.namespace.QName HF$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hf");
    private static final javax.xml.namespace.QName TXSTYLES$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "txStyles");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName PRESERVE$16 = 
        new javax.xml.namespace.QName("", "preserve");
    
    
    /**
     * Gets the "cSld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData getCSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().find_element_user(CSLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cSld" element
     */
    public void setCSld(org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData cSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().find_element_user(CSLD$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().add_element_user(CSLD$0);
            }
            target.set(cSld);
        }
    }
    
    /**
     * Appends and returns a new empty "cSld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData addNewCSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().add_element_user(CSLD$0);
            return target;
        }
    }
    
    /**
     * Gets the "clrMap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrMap" element
     */
    public void setClrMap(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAP$2);
            }
            target.set(clrMap);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAP$2);
            return target;
        }
    }
    
    /**
     * Gets the "sldLayoutIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList getSldLayoutIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList)get_store().find_element_user(SLDLAYOUTIDLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldLayoutIdLst" element
     */
    public boolean isSetSldLayoutIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDLAYOUTIDLST$4) != 0;
        }
    }
    
    /**
     * Sets the "sldLayoutIdLst" element
     */
    public void setSldLayoutIdLst(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList sldLayoutIdLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList)get_store().find_element_user(SLDLAYOUTIDLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList)get_store().add_element_user(SLDLAYOUTIDLST$4);
            }
            target.set(sldLayoutIdLst);
        }
    }
    
    /**
     * Appends and returns a new empty "sldLayoutIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList addNewSldLayoutIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList)get_store().add_element_user(SLDLAYOUTIDLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sldLayoutIdLst" element
     */
    public void unsetSldLayoutIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDLAYOUTIDLST$4, 0);
        }
    }
    
    /**
     * Gets the "transition" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition getTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().find_element_user(TRANSITION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transition" element
     */
    public boolean isSetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSITION$6) != 0;
        }
    }
    
    /**
     * Sets the "transition" element
     */
    public void setTransition(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition transition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().find_element_user(TRANSITION$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().add_element_user(TRANSITION$6);
            }
            target.set(transition);
        }
    }
    
    /**
     * Appends and returns a new empty "transition" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition addNewTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().add_element_user(TRANSITION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "transition" element
     */
    public void unsetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSITION$6, 0);
        }
    }
    
    /**
     * Gets the "timing" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming getTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().find_element_user(TIMING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timing" element
     */
    public boolean isSetTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMING$8) != 0;
        }
    }
    
    /**
     * Sets the "timing" element
     */
    public void setTiming(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming timing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().find_element_user(TIMING$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().add_element_user(TIMING$8);
            }
            target.set(timing);
        }
    }
    
    /**
     * Appends and returns a new empty "timing" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming addNewTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().add_element_user(TIMING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "timing" element
     */
    public void unsetTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMING$8, 0);
        }
    }
    
    /**
     * Gets the "hf" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter getHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().find_element_user(HF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hf" element
     */
    public boolean isSetHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HF$10) != 0;
        }
    }
    
    /**
     * Sets the "hf" element
     */
    public void setHf(org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter hf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().find_element_user(HF$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().add_element_user(HF$10);
            }
            target.set(hf);
        }
    }
    
    /**
     * Appends and returns a new empty "hf" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter addNewHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().add_element_user(HF$10);
            return target;
        }
    }
    
    /**
     * Unsets the "hf" element
     */
    public void unsetHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HF$10, 0);
        }
    }
    
    /**
     * Gets the "txStyles" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles getTxStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles)get_store().find_element_user(TXSTYLES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txStyles" element
     */
    public boolean isSetTxStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXSTYLES$12) != 0;
        }
    }
    
    /**
     * Sets the "txStyles" element
     */
    public void setTxStyles(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles txStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles)get_store().find_element_user(TXSTYLES$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles)get_store().add_element_user(TXSTYLES$12);
            }
            target.set(txStyles);
        }
    }
    
    /**
     * Appends and returns a new empty "txStyles" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles addNewTxStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles)get_store().add_element_user(TXSTYLES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "txStyles" element
     */
    public void unsetTxStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXSTYLES$12, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$14, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$14);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$14);
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
    
    /**
     * Gets the "preserve" attribute
     */
    public boolean getPreserve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESERVE$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preserve" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreserve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRESERVE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "preserve" attribute
     */
    public boolean isSetPreserve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESERVE$16) != null;
        }
    }
    
    /**
     * Sets the "preserve" attribute
     */
    public void setPreserve(boolean preserve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVE$16);
            }
            target.setBooleanValue(preserve);
        }
    }
    
    /**
     * Sets (as xml) the "preserve" attribute
     */
    public void xsetPreserve(org.apache.xmlbeans.XmlBoolean preserve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVE$16);
            }
            target.set(preserve);
        }
    }
    
    /**
     * Unsets the "preserve" attribute
     */
    public void unsetPreserve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESERVE$16);
        }
    }
}

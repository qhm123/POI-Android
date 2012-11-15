/*
 * XML Type:  CT_SlideLayout
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideLayout(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout
{
    
    public CTSlideLayoutImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
    private static final javax.xml.namespace.QName CLRMAPOVR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMapOvr");
    private static final javax.xml.namespace.QName TRANSITION$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "transition");
    private static final javax.xml.namespace.QName TIMING$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "timing");
    private static final javax.xml.namespace.QName HF$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hf");
    private static final javax.xml.namespace.QName EXTLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SHOWMASTERSP$12 = 
        new javax.xml.namespace.QName("", "showMasterSp");
    private static final javax.xml.namespace.QName SHOWMASTERPHANIM$14 = 
        new javax.xml.namespace.QName("", "showMasterPhAnim");
    private static final javax.xml.namespace.QName MATCHINGNAME$16 = 
        new javax.xml.namespace.QName("", "matchingName");
    private static final javax.xml.namespace.QName TYPE$18 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName PRESERVE$20 = 
        new javax.xml.namespace.QName("", "preserve");
    private static final javax.xml.namespace.QName USERDRAWN$22 = 
        new javax.xml.namespace.QName("", "userDrawn");
    
    
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
     * Gets the "clrMapOvr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride getClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().find_element_user(CLRMAPOVR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrMapOvr" element
     */
    public boolean isSetClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRMAPOVR$2) != 0;
        }
    }
    
    /**
     * Sets the "clrMapOvr" element
     */
    public void setClrMapOvr(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride clrMapOvr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().find_element_user(CLRMAPOVR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().add_element_user(CLRMAPOVR$2);
            }
            target.set(clrMapOvr);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMapOvr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride addNewClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().add_element_user(CLRMAPOVR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "clrMapOvr" element
     */
    public void unsetClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRMAPOVR$2, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().find_element_user(TRANSITION$4, 0);
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
            return get_store().count_elements(TRANSITION$4) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().find_element_user(TRANSITION$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().add_element_user(TRANSITION$4);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition)get_store().add_element_user(TRANSITION$4);
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
            get_store().remove_element(TRANSITION$4, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().find_element_user(TIMING$6, 0);
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
            return get_store().count_elements(TIMING$6) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().find_element_user(TIMING$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().add_element_user(TIMING$6);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming)get_store().add_element_user(TIMING$6);
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
            get_store().remove_element(TIMING$6, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().find_element_user(HF$8, 0);
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
            return get_store().count_elements(HF$8) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().find_element_user(HF$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().add_element_user(HF$8);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().add_element_user(HF$8);
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
            get_store().remove_element(HF$8, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$10, 0);
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
            return get_store().count_elements(EXTLST$10) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$10);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$10);
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
            get_store().remove_element(EXTLST$10, 0);
        }
    }
    
    /**
     * Gets the "showMasterSp" attribute
     */
    public boolean getShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERSP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMASTERSP$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMasterSp" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERSP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMASTERSP$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMasterSp" attribute
     */
    public boolean isSetShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMASTERSP$12) != null;
        }
    }
    
    /**
     * Sets the "showMasterSp" attribute
     */
    public void setShowMasterSp(boolean showMasterSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERSP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMASTERSP$12);
            }
            target.setBooleanValue(showMasterSp);
        }
    }
    
    /**
     * Sets (as xml) the "showMasterSp" attribute
     */
    public void xsetShowMasterSp(org.apache.xmlbeans.XmlBoolean showMasterSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERSP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMASTERSP$12);
            }
            target.set(showMasterSp);
        }
    }
    
    /**
     * Unsets the "showMasterSp" attribute
     */
    public void unsetShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMASTERSP$12);
        }
    }
    
    /**
     * Gets the "showMasterPhAnim" attribute
     */
    public boolean getShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERPHANIM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMASTERPHANIM$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMasterPhAnim" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERPHANIM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMASTERPHANIM$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMasterPhAnim" attribute
     */
    public boolean isSetShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMASTERPHANIM$14) != null;
        }
    }
    
    /**
     * Sets the "showMasterPhAnim" attribute
     */
    public void setShowMasterPhAnim(boolean showMasterPhAnim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERPHANIM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMASTERPHANIM$14);
            }
            target.setBooleanValue(showMasterPhAnim);
        }
    }
    
    /**
     * Sets (as xml) the "showMasterPhAnim" attribute
     */
    public void xsetShowMasterPhAnim(org.apache.xmlbeans.XmlBoolean showMasterPhAnim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERPHANIM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMASTERPHANIM$14);
            }
            target.set(showMasterPhAnim);
        }
    }
    
    /**
     * Unsets the "showMasterPhAnim" attribute
     */
    public void unsetShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMASTERPHANIM$14);
        }
    }
    
    /**
     * Gets the "matchingName" attribute
     */
    public java.lang.String getMatchingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCHINGNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MATCHINGNAME$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matchingName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMatchingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCHINGNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(MATCHINGNAME$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "matchingName" attribute
     */
    public boolean isSetMatchingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MATCHINGNAME$16) != null;
        }
    }
    
    /**
     * Sets the "matchingName" attribute
     */
    public void setMatchingName(java.lang.String matchingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCHINGNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATCHINGNAME$16);
            }
            target.setStringValue(matchingName);
        }
    }
    
    /**
     * Sets (as xml) the "matchingName" attribute
     */
    public void xsetMatchingName(org.apache.xmlbeans.XmlString matchingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCHINGNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATCHINGNAME$16);
            }
            target.set(matchingName);
        }
    }
    
    /**
     * Unsets the "matchingName" attribute
     */
    public void unsetMatchingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MATCHINGNAME$16);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$18);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType)get_store().find_attribute_user(TYPE$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType)get_default_attribute_value(TYPE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$18) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$18);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType)get_store().find_attribute_user(TYPE$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType)get_store().add_attribute_user(TYPE$18);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESERVE$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRESERVE$20);
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
            return get_store().find_attribute_user(PRESERVE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVE$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVE$20);
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
            get_store().remove_attribute(PRESERVE$20);
        }
    }
    
    /**
     * Gets the "userDrawn" attribute
     */
    public boolean getUserDrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USERDRAWN$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "userDrawn" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUserDrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USERDRAWN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USERDRAWN$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "userDrawn" attribute
     */
    public boolean isSetUserDrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERDRAWN$22) != null;
        }
    }
    
    /**
     * Sets the "userDrawn" attribute
     */
    public void setUserDrawn(boolean userDrawn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERDRAWN$22);
            }
            target.setBooleanValue(userDrawn);
        }
    }
    
    /**
     * Sets (as xml) the "userDrawn" attribute
     */
    public void xsetUserDrawn(org.apache.xmlbeans.XmlBoolean userDrawn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USERDRAWN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USERDRAWN$22);
            }
            target.set(userDrawn);
        }
    }
    
    /**
     * Unsets the "userDrawn" attribute
     */
    public void unsetUserDrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERDRAWN$22);
        }
    }
}

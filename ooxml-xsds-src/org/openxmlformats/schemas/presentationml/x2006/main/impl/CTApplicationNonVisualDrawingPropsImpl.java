/*
 * XML Type:  CT_ApplicationNonVisualDrawingProps
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ApplicationNonVisualDrawingProps(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTApplicationNonVisualDrawingPropsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps
{
    
    public CTApplicationNonVisualDrawingPropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PH$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "ph");
    private static final javax.xml.namespace.QName AUDIOCD$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "audioCd");
    private static final javax.xml.namespace.QName WAVAUDIOFILE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "wavAudioFile");
    private static final javax.xml.namespace.QName AUDIOFILE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "audioFile");
    private static final javax.xml.namespace.QName VIDEOFILE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "videoFile");
    private static final javax.xml.namespace.QName QUICKTIMEFILE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "quickTimeFile");
    private static final javax.xml.namespace.QName CUSTDATALST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custDataLst");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ISPHOTO$16 = 
        new javax.xml.namespace.QName("", "isPhoto");
    private static final javax.xml.namespace.QName USERDRAWN$18 = 
        new javax.xml.namespace.QName("", "userDrawn");
    
    
    /**
     * Gets the "ph" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder getPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder)get_store().find_element_user(PH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ph" element
     */
    public boolean isSetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PH$0) != 0;
        }
    }
    
    /**
     * Sets the "ph" element
     */
    public void setPh(org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder ph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder)get_store().find_element_user(PH$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder)get_store().add_element_user(PH$0);
            }
            target.set(ph);
        }
    }
    
    /**
     * Appends and returns a new empty "ph" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder addNewPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder)get_store().add_element_user(PH$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ph" element
     */
    public void unsetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PH$0, 0);
        }
    }
    
    /**
     * Gets the "audioCd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD getAudioCd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD)get_store().find_element_user(AUDIOCD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "audioCd" element
     */
    public boolean isSetAudioCd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDIOCD$2) != 0;
        }
    }
    
    /**
     * Sets the "audioCd" element
     */
    public void setAudioCd(org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD audioCd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD)get_store().find_element_user(AUDIOCD$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD)get_store().add_element_user(AUDIOCD$2);
            }
            target.set(audioCd);
        }
    }
    
    /**
     * Appends and returns a new empty "audioCd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD addNewAudioCd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD)get_store().add_element_user(AUDIOCD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "audioCd" element
     */
    public void unsetAudioCd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDIOCD$2, 0);
        }
    }
    
    /**
     * Gets the "wavAudioFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile getWavAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().find_element_user(WAVAUDIOFILE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wavAudioFile" element
     */
    public boolean isSetWavAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAVAUDIOFILE$4) != 0;
        }
    }
    
    /**
     * Sets the "wavAudioFile" element
     */
    public void setWavAudioFile(org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile wavAudioFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().find_element_user(WAVAUDIOFILE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().add_element_user(WAVAUDIOFILE$4);
            }
            target.set(wavAudioFile);
        }
    }
    
    /**
     * Appends and returns a new empty "wavAudioFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile addNewWavAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().add_element_user(WAVAUDIOFILE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "wavAudioFile" element
     */
    public void unsetWavAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAVAUDIOFILE$4, 0);
        }
    }
    
    /**
     * Gets the "audioFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile getAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile)get_store().find_element_user(AUDIOFILE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "audioFile" element
     */
    public boolean isSetAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDIOFILE$6) != 0;
        }
    }
    
    /**
     * Sets the "audioFile" element
     */
    public void setAudioFile(org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile audioFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile)get_store().find_element_user(AUDIOFILE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile)get_store().add_element_user(AUDIOFILE$6);
            }
            target.set(audioFile);
        }
    }
    
    /**
     * Appends and returns a new empty "audioFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile addNewAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile)get_store().add_element_user(AUDIOFILE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "audioFile" element
     */
    public void unsetAudioFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDIOFILE$6, 0);
        }
    }
    
    /**
     * Gets the "videoFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile getVideoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile)get_store().find_element_user(VIDEOFILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "videoFile" element
     */
    public boolean isSetVideoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIDEOFILE$8) != 0;
        }
    }
    
    /**
     * Sets the "videoFile" element
     */
    public void setVideoFile(org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile videoFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile)get_store().find_element_user(VIDEOFILE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile)get_store().add_element_user(VIDEOFILE$8);
            }
            target.set(videoFile);
        }
    }
    
    /**
     * Appends and returns a new empty "videoFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile addNewVideoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile)get_store().add_element_user(VIDEOFILE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "videoFile" element
     */
    public void unsetVideoFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIDEOFILE$8, 0);
        }
    }
    
    /**
     * Gets the "quickTimeFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile getQuickTimeFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile)get_store().find_element_user(QUICKTIMEFILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quickTimeFile" element
     */
    public boolean isSetQuickTimeFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUICKTIMEFILE$10) != 0;
        }
    }
    
    /**
     * Sets the "quickTimeFile" element
     */
    public void setQuickTimeFile(org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile quickTimeFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile)get_store().find_element_user(QUICKTIMEFILE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile)get_store().add_element_user(QUICKTIMEFILE$10);
            }
            target.set(quickTimeFile);
        }
    }
    
    /**
     * Appends and returns a new empty "quickTimeFile" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile addNewQuickTimeFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile)get_store().add_element_user(QUICKTIMEFILE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "quickTimeFile" element
     */
    public void unsetQuickTimeFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUICKTIMEFILE$10, 0);
        }
    }
    
    /**
     * Gets the "custDataLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList getCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().find_element_user(CUSTDATALST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custDataLst" element
     */
    public boolean isSetCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTDATALST$12) != 0;
        }
    }
    
    /**
     * Sets the "custDataLst" element
     */
    public void setCustDataLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList custDataLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().find_element_user(CUSTDATALST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().add_element_user(CUSTDATALST$12);
            }
            target.set(custDataLst);
        }
    }
    
    /**
     * Appends and returns a new empty "custDataLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList addNewCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().add_element_user(CUSTDATALST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "custDataLst" element
     */
    public void unsetCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTDATALST$12, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$14);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
     * Gets the "isPhoto" attribute
     */
    public boolean getIsPhoto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPHOTO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISPHOTO$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPhoto" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPhoto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPHOTO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISPHOTO$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "isPhoto" attribute
     */
    public boolean isSetIsPhoto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISPHOTO$16) != null;
        }
    }
    
    /**
     * Sets the "isPhoto" attribute
     */
    public void setIsPhoto(boolean isPhoto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPHOTO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPHOTO$16);
            }
            target.setBooleanValue(isPhoto);
        }
    }
    
    /**
     * Sets (as xml) the "isPhoto" attribute
     */
    public void xsetIsPhoto(org.apache.xmlbeans.XmlBoolean isPhoto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPHOTO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPHOTO$16);
            }
            target.set(isPhoto);
        }
    }
    
    /**
     * Unsets the "isPhoto" attribute
     */
    public void unsetIsPhoto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISPHOTO$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USERDRAWN$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USERDRAWN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USERDRAWN$18);
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
            return get_store().find_attribute_user(USERDRAWN$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERDRAWN$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USERDRAWN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USERDRAWN$18);
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
            get_store().remove_attribute(USERDRAWN$18);
        }
    }
}

/*
 * XML Type:  CT_WebSettings
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_WebSettings(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebSettingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWebSettings
{
    
    public CTWebSettingsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRAMESET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "frameset");
    private static final javax.xml.namespace.QName DIVS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "divs");
    private static final javax.xml.namespace.QName ENCODING$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "encoding");
    private static final javax.xml.namespace.QName OPTIMIZEFORBROWSER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "optimizeForBrowser");
    private static final javax.xml.namespace.QName RELYONVML$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "relyOnVML");
    private static final javax.xml.namespace.QName ALLOWPNG$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "allowPNG");
    private static final javax.xml.namespace.QName DONOTRELYONCSS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotRelyOnCSS");
    private static final javax.xml.namespace.QName DONOTSAVEASSINGLEFILE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotSaveAsSingleFile");
    private static final javax.xml.namespace.QName DONOTORGANIZEINFOLDER$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotOrganizeInFolder");
    private static final javax.xml.namespace.QName DONOTUSELONGFILENAMES$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotUseLongFileNames");
    private static final javax.xml.namespace.QName PIXELSPERINCH$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pixelsPerInch");
    private static final javax.xml.namespace.QName TARGETSCREENSZ$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "targetScreenSz");
    private static final javax.xml.namespace.QName SAVESMARTTAGSASXML$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveSmartTagsAsXml");
    
    
    /**
     * Gets the "frameset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset getFrameset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().find_element_user(FRAMESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "frameset" element
     */
    public boolean isSetFrameset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMESET$0) != 0;
        }
    }
    
    /**
     * Sets the "frameset" element
     */
    public void setFrameset(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset frameset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().find_element_user(FRAMESET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().add_element_user(FRAMESET$0);
            }
            target.set(frameset);
        }
    }
    
    /**
     * Appends and returns a new empty "frameset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset addNewFrameset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().add_element_user(FRAMESET$0);
            return target;
        }
    }
    
    /**
     * Unsets the "frameset" element
     */
    public void unsetFrameset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMESET$0, 0);
        }
    }
    
    /**
     * Gets the "divs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs getDivs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().find_element_user(DIVS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "divs" element
     */
    public boolean isSetDivs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIVS$2) != 0;
        }
    }
    
    /**
     * Sets the "divs" element
     */
    public void setDivs(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs divs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().find_element_user(DIVS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().add_element_user(DIVS$2);
            }
            target.set(divs);
        }
    }
    
    /**
     * Appends and returns a new empty "divs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs addNewDivs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().add_element_user(DIVS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "divs" element
     */
    public void unsetDivs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIVS$2, 0);
        }
    }
    
    /**
     * Gets the "encoding" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ENCODING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encoding" element
     */
    public boolean isSetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCODING$4) != 0;
        }
    }
    
    /**
     * Sets the "encoding" element
     */
    public void setEncoding(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ENCODING$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ENCODING$4);
            }
            target.set(encoding);
        }
    }
    
    /**
     * Appends and returns a new empty "encoding" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ENCODING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "encoding" element
     */
    public void unsetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCODING$4, 0);
        }
    }
    
    /**
     * Gets the "optimizeForBrowser" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getOptimizeForBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(OPTIMIZEFORBROWSER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "optimizeForBrowser" element
     */
    public boolean isSetOptimizeForBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIMIZEFORBROWSER$6) != 0;
        }
    }
    
    /**
     * Sets the "optimizeForBrowser" element
     */
    public void setOptimizeForBrowser(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff optimizeForBrowser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(OPTIMIZEFORBROWSER$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(OPTIMIZEFORBROWSER$6);
            }
            target.set(optimizeForBrowser);
        }
    }
    
    /**
     * Appends and returns a new empty "optimizeForBrowser" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewOptimizeForBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(OPTIMIZEFORBROWSER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "optimizeForBrowser" element
     */
    public void unsetOptimizeForBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIMIZEFORBROWSER$6, 0);
        }
    }
    
    /**
     * Gets the "relyOnVML" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getRelyOnVML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RELYONVML$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relyOnVML" element
     */
    public boolean isSetRelyOnVML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELYONVML$8) != 0;
        }
    }
    
    /**
     * Sets the "relyOnVML" element
     */
    public void setRelyOnVML(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff relyOnVML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RELYONVML$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RELYONVML$8);
            }
            target.set(relyOnVML);
        }
    }
    
    /**
     * Appends and returns a new empty "relyOnVML" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewRelyOnVML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RELYONVML$8);
            return target;
        }
    }
    
    /**
     * Unsets the "relyOnVML" element
     */
    public void unsetRelyOnVML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELYONVML$8, 0);
        }
    }
    
    /**
     * Gets the "allowPNG" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAllowPNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALLOWPNG$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowPNG" element
     */
    public boolean isSetAllowPNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWPNG$10) != 0;
        }
    }
    
    /**
     * Sets the "allowPNG" element
     */
    public void setAllowPNG(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff allowPNG)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALLOWPNG$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALLOWPNG$10);
            }
            target.set(allowPNG);
        }
    }
    
    /**
     * Appends and returns a new empty "allowPNG" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAllowPNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALLOWPNG$10);
            return target;
        }
    }
    
    /**
     * Unsets the "allowPNG" element
     */
    public void unsetAllowPNG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWPNG$10, 0);
        }
    }
    
    /**
     * Gets the "doNotRelyOnCSS" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotRelyOnCSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTRELYONCSS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotRelyOnCSS" element
     */
    public boolean isSetDoNotRelyOnCSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTRELYONCSS$12) != 0;
        }
    }
    
    /**
     * Sets the "doNotRelyOnCSS" element
     */
    public void setDoNotRelyOnCSS(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotRelyOnCSS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTRELYONCSS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTRELYONCSS$12);
            }
            target.set(doNotRelyOnCSS);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotRelyOnCSS" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotRelyOnCSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTRELYONCSS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotRelyOnCSS" element
     */
    public void unsetDoNotRelyOnCSS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTRELYONCSS$12, 0);
        }
    }
    
    /**
     * Gets the "doNotSaveAsSingleFile" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotSaveAsSingleFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTSAVEASSINGLEFILE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotSaveAsSingleFile" element
     */
    public boolean isSetDoNotSaveAsSingleFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTSAVEASSINGLEFILE$14) != 0;
        }
    }
    
    /**
     * Sets the "doNotSaveAsSingleFile" element
     */
    public void setDoNotSaveAsSingleFile(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotSaveAsSingleFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTSAVEASSINGLEFILE$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTSAVEASSINGLEFILE$14);
            }
            target.set(doNotSaveAsSingleFile);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotSaveAsSingleFile" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotSaveAsSingleFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTSAVEASSINGLEFILE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotSaveAsSingleFile" element
     */
    public void unsetDoNotSaveAsSingleFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTSAVEASSINGLEFILE$14, 0);
        }
    }
    
    /**
     * Gets the "doNotOrganizeInFolder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotOrganizeInFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTORGANIZEINFOLDER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotOrganizeInFolder" element
     */
    public boolean isSetDoNotOrganizeInFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTORGANIZEINFOLDER$16) != 0;
        }
    }
    
    /**
     * Sets the "doNotOrganizeInFolder" element
     */
    public void setDoNotOrganizeInFolder(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotOrganizeInFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTORGANIZEINFOLDER$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTORGANIZEINFOLDER$16);
            }
            target.set(doNotOrganizeInFolder);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotOrganizeInFolder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotOrganizeInFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTORGANIZEINFOLDER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotOrganizeInFolder" element
     */
    public void unsetDoNotOrganizeInFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTORGANIZEINFOLDER$16, 0);
        }
    }
    
    /**
     * Gets the "doNotUseLongFileNames" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotUseLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTUSELONGFILENAMES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotUseLongFileNames" element
     */
    public boolean isSetDoNotUseLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTUSELONGFILENAMES$18) != 0;
        }
    }
    
    /**
     * Sets the "doNotUseLongFileNames" element
     */
    public void setDoNotUseLongFileNames(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotUseLongFileNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTUSELONGFILENAMES$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTUSELONGFILENAMES$18);
            }
            target.set(doNotUseLongFileNames);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotUseLongFileNames" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotUseLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTUSELONGFILENAMES$18);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotUseLongFileNames" element
     */
    public void unsetDoNotUseLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTUSELONGFILENAMES$18, 0);
        }
    }
    
    /**
     * Gets the "pixelsPerInch" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getPixelsPerInch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(PIXELSPERINCH$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pixelsPerInch" element
     */
    public boolean isSetPixelsPerInch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIXELSPERINCH$20) != 0;
        }
    }
    
    /**
     * Sets the "pixelsPerInch" element
     */
    public void setPixelsPerInch(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber pixelsPerInch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(PIXELSPERINCH$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(PIXELSPERINCH$20);
            }
            target.set(pixelsPerInch);
        }
    }
    
    /**
     * Appends and returns a new empty "pixelsPerInch" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewPixelsPerInch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(PIXELSPERINCH$20);
            return target;
        }
    }
    
    /**
     * Unsets the "pixelsPerInch" element
     */
    public void unsetPixelsPerInch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIXELSPERINCH$20, 0);
        }
    }
    
    /**
     * Gets the "targetScreenSz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz getTargetScreenSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz)get_store().find_element_user(TARGETSCREENSZ$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "targetScreenSz" element
     */
    public boolean isSetTargetScreenSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETSCREENSZ$22) != 0;
        }
    }
    
    /**
     * Sets the "targetScreenSz" element
     */
    public void setTargetScreenSz(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz targetScreenSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz)get_store().find_element_user(TARGETSCREENSZ$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz)get_store().add_element_user(TARGETSCREENSZ$22);
            }
            target.set(targetScreenSz);
        }
    }
    
    /**
     * Appends and returns a new empty "targetScreenSz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz addNewTargetScreenSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz)get_store().add_element_user(TARGETSCREENSZ$22);
            return target;
        }
    }
    
    /**
     * Unsets the "targetScreenSz" element
     */
    public void unsetTargetScreenSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETSCREENSZ$22, 0);
        }
    }
    
    /**
     * Gets the "saveSmartTagsAsXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSaveSmartTagsAsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVESMARTTAGSASXML$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveSmartTagsAsXml" element
     */
    public boolean isSetSaveSmartTagsAsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVESMARTTAGSASXML$24) != 0;
        }
    }
    
    /**
     * Sets the "saveSmartTagsAsXml" element
     */
    public void setSaveSmartTagsAsXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff saveSmartTagsAsXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVESMARTTAGSASXML$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVESMARTTAGSASXML$24);
            }
            target.set(saveSmartTagsAsXml);
        }
    }
    
    /**
     * Appends and returns a new empty "saveSmartTagsAsXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSaveSmartTagsAsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVESMARTTAGSASXML$24);
            return target;
        }
    }
    
    /**
     * Unsets the "saveSmartTagsAsXml" element
     */
    public void unsetSaveSmartTagsAsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVESMARTTAGSASXML$24, 0);
        }
    }
}

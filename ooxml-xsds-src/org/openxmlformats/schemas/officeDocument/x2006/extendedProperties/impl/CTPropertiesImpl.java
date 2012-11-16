/*
 * XML Type:  CT_Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/extended-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl;
/**
 * An XML CT_Properties(@http://schemas.openxmlformats.org/officeDocument/2006/extended-properties).
 *
 * This is a complex type.
 */
public class CTPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties
{
    
    public CTPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPLATE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Template");
    private static final javax.xml.namespace.QName MANAGER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Manager");
    private static final javax.xml.namespace.QName COMPANY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Company");
    private static final javax.xml.namespace.QName PAGES$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Pages");
    private static final javax.xml.namespace.QName WORDS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Words");
    private static final javax.xml.namespace.QName CHARACTERS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Characters");
    private static final javax.xml.namespace.QName PRESENTATIONFORMAT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "PresentationFormat");
    private static final javax.xml.namespace.QName LINES$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Lines");
    private static final javax.xml.namespace.QName PARAGRAPHS$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Paragraphs");
    private static final javax.xml.namespace.QName SLIDES$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Slides");
    private static final javax.xml.namespace.QName NOTES$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Notes");
    private static final javax.xml.namespace.QName TOTALTIME$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "TotalTime");
    private static final javax.xml.namespace.QName HIDDENSLIDES$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HiddenSlides");
    private static final javax.xml.namespace.QName MMCLIPS$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "MMClips");
    private static final javax.xml.namespace.QName SCALECROP$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "ScaleCrop");
    private static final javax.xml.namespace.QName HEADINGPAIRS$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HeadingPairs");
    private static final javax.xml.namespace.QName TITLESOFPARTS$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "TitlesOfParts");
    private static final javax.xml.namespace.QName LINKSUPTODATE$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "LinksUpToDate");
    private static final javax.xml.namespace.QName CHARACTERSWITHSPACES$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "CharactersWithSpaces");
    private static final javax.xml.namespace.QName SHAREDDOC$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "SharedDoc");
    private static final javax.xml.namespace.QName HYPERLINKBASE$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HyperlinkBase");
    private static final javax.xml.namespace.QName HLINKS$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HLinks");
    private static final javax.xml.namespace.QName HYPERLINKSCHANGED$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "HyperlinksChanged");
    private static final javax.xml.namespace.QName DIGSIG$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "DigSig");
    private static final javax.xml.namespace.QName APPLICATION$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Application");
    private static final javax.xml.namespace.QName APPVERSION$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "AppVersion");
    private static final javax.xml.namespace.QName DOCSECURITY$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "DocSecurity");
    
    
    /**
     * Gets the "Template" element
     */
    public java.lang.String getTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Template" element
     */
    public org.apache.xmlbeans.XmlString xgetTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPLATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Template" element
     */
    public boolean isSetTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATE$0) != 0;
        }
    }
    
    /**
     * Sets the "Template" element
     */
    public void setTemplate(java.lang.String template)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATE$0);
            }
            target.setStringValue(template);
        }
    }
    
    /**
     * Sets (as xml) the "Template" element
     */
    public void xsetTemplate(org.apache.xmlbeans.XmlString template)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPLATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPLATE$0);
            }
            target.set(template);
        }
    }
    
    /**
     * Unsets the "Template" element
     */
    public void unsetTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATE$0, 0);
        }
    }
    
    /**
     * Gets the "Manager" element
     */
    public java.lang.String getManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Manager" element
     */
    public org.apache.xmlbeans.XmlString xgetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Manager" element
     */
    public boolean isSetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGER$2) != 0;
        }
    }
    
    /**
     * Sets the "Manager" element
     */
    public void setManager(java.lang.String manager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGER$2);
            }
            target.setStringValue(manager);
        }
    }
    
    /**
     * Sets (as xml) the "Manager" element
     */
    public void xsetManager(org.apache.xmlbeans.XmlString manager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGER$2);
            }
            target.set(manager);
        }
    }
    
    /**
     * Unsets the "Manager" element
     */
    public void unsetManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGER$2, 0);
        }
    }
    
    /**
     * Gets the "Company" element
     */
    public java.lang.String getCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Company" element
     */
    public org.apache.xmlbeans.XmlString xgetCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Company" element
     */
    public boolean isSetCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANY$4) != 0;
        }
    }
    
    /**
     * Sets the "Company" element
     */
    public void setCompany(java.lang.String company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANY$4);
            }
            target.setStringValue(company);
        }
    }
    
    /**
     * Sets (as xml) the "Company" element
     */
    public void xsetCompany(org.apache.xmlbeans.XmlString company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANY$4);
            }
            target.set(company);
        }
    }
    
    /**
     * Unsets the "Company" element
     */
    public void unsetCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANY$4, 0);
        }
    }
    
    /**
     * Gets the "Pages" element
     */
    public int getPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pages" element
     */
    public org.apache.xmlbeans.XmlInt xgetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Pages" element
     */
    public boolean isSetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGES$6) != 0;
        }
    }
    
    /**
     * Sets the "Pages" element
     */
    public void setPages(int pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGES$6);
            }
            target.setIntValue(pages);
        }
    }
    
    /**
     * Sets (as xml) the "Pages" element
     */
    public void xsetPages(org.apache.xmlbeans.XmlInt pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGES$6);
            }
            target.set(pages);
        }
    }
    
    /**
     * Unsets the "Pages" element
     */
    public void unsetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGES$6, 0);
        }
    }
    
    /**
     * Gets the "Words" element
     */
    public int getWords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORDS$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Words" element
     */
    public org.apache.xmlbeans.XmlInt xgetWords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORDS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Words" element
     */
    public boolean isSetWords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORDS$8) != 0;
        }
    }
    
    /**
     * Sets the "Words" element
     */
    public void setWords(int words)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORDS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORDS$8);
            }
            target.setIntValue(words);
        }
    }
    
    /**
     * Sets (as xml) the "Words" element
     */
    public void xsetWords(org.apache.xmlbeans.XmlInt words)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORDS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WORDS$8);
            }
            target.set(words);
        }
    }
    
    /**
     * Unsets the "Words" element
     */
    public void unsetWords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORDS$8, 0);
        }
    }
    
    /**
     * Gets the "Characters" element
     */
    public int getCharacters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERS$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Characters" element
     */
    public org.apache.xmlbeans.XmlInt xgetCharacters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CHARACTERS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Characters" element
     */
    public boolean isSetCharacters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERS$10) != 0;
        }
    }
    
    /**
     * Sets the "Characters" element
     */
    public void setCharacters(int characters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARACTERS$10);
            }
            target.setIntValue(characters);
        }
    }
    
    /**
     * Sets (as xml) the "Characters" element
     */
    public void xsetCharacters(org.apache.xmlbeans.XmlInt characters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CHARACTERS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CHARACTERS$10);
            }
            target.set(characters);
        }
    }
    
    /**
     * Unsets the "Characters" element
     */
    public void unsetCharacters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERS$10, 0);
        }
    }
    
    /**
     * Gets the "PresentationFormat" element
     */
    public java.lang.String getPresentationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PresentationFormat" element
     */
    public org.apache.xmlbeans.XmlString xgetPresentationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "PresentationFormat" element
     */
    public boolean isSetPresentationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONFORMAT$12) != 0;
        }
    }
    
    /**
     * Sets the "PresentationFormat" element
     */
    public void setPresentationFormat(java.lang.String presentationFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTATIONFORMAT$12);
            }
            target.setStringValue(presentationFormat);
        }
    }
    
    /**
     * Sets (as xml) the "PresentationFormat" element
     */
    public void xsetPresentationFormat(org.apache.xmlbeans.XmlString presentationFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRESENTATIONFORMAT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRESENTATIONFORMAT$12);
            }
            target.set(presentationFormat);
        }
    }
    
    /**
     * Unsets the "PresentationFormat" element
     */
    public void unsetPresentationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONFORMAT$12, 0);
        }
    }
    
    /**
     * Gets the "Lines" element
     */
    public int getLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINES$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Lines" element
     */
    public org.apache.xmlbeans.XmlInt xgetLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LINES$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Lines" element
     */
    public boolean isSetLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINES$14) != 0;
        }
    }
    
    /**
     * Sets the "Lines" element
     */
    public void setLines(int lines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINES$14);
            }
            target.setIntValue(lines);
        }
    }
    
    /**
     * Sets (as xml) the "Lines" element
     */
    public void xsetLines(org.apache.xmlbeans.XmlInt lines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LINES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LINES$14);
            }
            target.set(lines);
        }
    }
    
    /**
     * Unsets the "Lines" element
     */
    public void unsetLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINES$14, 0);
        }
    }
    
    /**
     * Gets the "Paragraphs" element
     */
    public int getParagraphs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAGRAPHS$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Paragraphs" element
     */
    public org.apache.xmlbeans.XmlInt xgetParagraphs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARAGRAPHS$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Paragraphs" element
     */
    public boolean isSetParagraphs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAGRAPHS$16) != 0;
        }
    }
    
    /**
     * Sets the "Paragraphs" element
     */
    public void setParagraphs(int paragraphs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAGRAPHS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAGRAPHS$16);
            }
            target.setIntValue(paragraphs);
        }
    }
    
    /**
     * Sets (as xml) the "Paragraphs" element
     */
    public void xsetParagraphs(org.apache.xmlbeans.XmlInt paragraphs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARAGRAPHS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PARAGRAPHS$16);
            }
            target.set(paragraphs);
        }
    }
    
    /**
     * Unsets the "Paragraphs" element
     */
    public void unsetParagraphs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAGRAPHS$16, 0);
        }
    }
    
    /**
     * Gets the "Slides" element
     */
    public int getSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLIDES$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Slides" element
     */
    public org.apache.xmlbeans.XmlInt xgetSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SLIDES$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Slides" element
     */
    public boolean isSetSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLIDES$18) != 0;
        }
    }
    
    /**
     * Sets the "Slides" element
     */
    public void setSlides(int slides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLIDES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLIDES$18);
            }
            target.setIntValue(slides);
        }
    }
    
    /**
     * Sets (as xml) the "Slides" element
     */
    public void xsetSlides(org.apache.xmlbeans.XmlInt slides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SLIDES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SLIDES$18);
            }
            target.set(slides);
        }
    }
    
    /**
     * Unsets the "Slides" element
     */
    public void unsetSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLIDES$18, 0);
        }
    }
    
    /**
     * Gets the "Notes" element
     */
    public int getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Notes" element
     */
    public org.apache.xmlbeans.XmlInt xgetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOTES$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$20) != 0;
        }
    }
    
    /**
     * Sets the "Notes" element
     */
    public void setNotes(int notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$20);
            }
            target.setIntValue(notes);
        }
    }
    
    /**
     * Sets (as xml) the "Notes" element
     */
    public void xsetNotes(org.apache.xmlbeans.XmlInt notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOTES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NOTES$20);
            }
            target.set(notes);
        }
    }
    
    /**
     * Unsets the "Notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$20, 0);
        }
    }
    
    /**
     * Gets the "TotalTime" element
     */
    public int getTotalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALTIME$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalTime" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALTIME$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalTime" element
     */
    public boolean isSetTotalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALTIME$22) != 0;
        }
    }
    
    /**
     * Sets the "TotalTime" element
     */
    public void setTotalTime(int totalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALTIME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALTIME$22);
            }
            target.setIntValue(totalTime);
        }
    }
    
    /**
     * Sets (as xml) the "TotalTime" element
     */
    public void xsetTotalTime(org.apache.xmlbeans.XmlInt totalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALTIME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALTIME$22);
            }
            target.set(totalTime);
        }
    }
    
    /**
     * Unsets the "TotalTime" element
     */
    public void unsetTotalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALTIME$22, 0);
        }
    }
    
    /**
     * Gets the "HiddenSlides" element
     */
    public int getHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIDDENSLIDES$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HiddenSlides" element
     */
    public org.apache.xmlbeans.XmlInt xgetHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HIDDENSLIDES$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "HiddenSlides" element
     */
    public boolean isSetHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDDENSLIDES$24) != 0;
        }
    }
    
    /**
     * Sets the "HiddenSlides" element
     */
    public void setHiddenSlides(int hiddenSlides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIDDENSLIDES$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIDDENSLIDES$24);
            }
            target.setIntValue(hiddenSlides);
        }
    }
    
    /**
     * Sets (as xml) the "HiddenSlides" element
     */
    public void xsetHiddenSlides(org.apache.xmlbeans.XmlInt hiddenSlides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HIDDENSLIDES$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HIDDENSLIDES$24);
            }
            target.set(hiddenSlides);
        }
    }
    
    /**
     * Unsets the "HiddenSlides" element
     */
    public void unsetHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDDENSLIDES$24, 0);
        }
    }
    
    /**
     * Gets the "MMClips" element
     */
    public int getMMClips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MMCLIPS$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MMClips" element
     */
    public org.apache.xmlbeans.XmlInt xgetMMClips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MMCLIPS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "MMClips" element
     */
    public boolean isSetMMClips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MMCLIPS$26) != 0;
        }
    }
    
    /**
     * Sets the "MMClips" element
     */
    public void setMMClips(int mmClips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MMCLIPS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MMCLIPS$26);
            }
            target.setIntValue(mmClips);
        }
    }
    
    /**
     * Sets (as xml) the "MMClips" element
     */
    public void xsetMMClips(org.apache.xmlbeans.XmlInt mmClips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MMCLIPS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MMCLIPS$26);
            }
            target.set(mmClips);
        }
    }
    
    /**
     * Unsets the "MMClips" element
     */
    public void unsetMMClips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MMCLIPS$26, 0);
        }
    }
    
    /**
     * Gets the "ScaleCrop" element
     */
    public boolean getScaleCrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALECROP$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScaleCrop" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetScaleCrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCALECROP$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScaleCrop" element
     */
    public boolean isSetScaleCrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCALECROP$28) != 0;
        }
    }
    
    /**
     * Sets the "ScaleCrop" element
     */
    public void setScaleCrop(boolean scaleCrop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALECROP$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALECROP$28);
            }
            target.setBooleanValue(scaleCrop);
        }
    }
    
    /**
     * Sets (as xml) the "ScaleCrop" element
     */
    public void xsetScaleCrop(org.apache.xmlbeans.XmlBoolean scaleCrop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SCALECROP$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SCALECROP$28);
            }
            target.set(scaleCrop);
        }
    }
    
    /**
     * Unsets the "ScaleCrop" element
     */
    public void unsetScaleCrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCALECROP$28, 0);
        }
    }
    
    /**
     * Gets the "HeadingPairs" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant getHeadingPairs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().find_element_user(HEADINGPAIRS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HeadingPairs" element
     */
    public boolean isSetHeadingPairs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADINGPAIRS$30) != 0;
        }
    }
    
    /**
     * Sets the "HeadingPairs" element
     */
    public void setHeadingPairs(org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant headingPairs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().find_element_user(HEADINGPAIRS$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().add_element_user(HEADINGPAIRS$30);
            }
            target.set(headingPairs);
        }
    }
    
    /**
     * Appends and returns a new empty "HeadingPairs" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant addNewHeadingPairs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().add_element_user(HEADINGPAIRS$30);
            return target;
        }
    }
    
    /**
     * Unsets the "HeadingPairs" element
     */
    public void unsetHeadingPairs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADINGPAIRS$30, 0);
        }
    }
    
    /**
     * Gets the "TitlesOfParts" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr getTitlesOfParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr)get_store().find_element_user(TITLESOFPARTS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TitlesOfParts" element
     */
    public boolean isSetTitlesOfParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLESOFPARTS$32) != 0;
        }
    }
    
    /**
     * Sets the "TitlesOfParts" element
     */
    public void setTitlesOfParts(org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr titlesOfParts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr)get_store().find_element_user(TITLESOFPARTS$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr)get_store().add_element_user(TITLESOFPARTS$32);
            }
            target.set(titlesOfParts);
        }
    }
    
    /**
     * Appends and returns a new empty "TitlesOfParts" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr addNewTitlesOfParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorLpstr)get_store().add_element_user(TITLESOFPARTS$32);
            return target;
        }
    }
    
    /**
     * Unsets the "TitlesOfParts" element
     */
    public void unsetTitlesOfParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLESOFPARTS$32, 0);
        }
    }
    
    /**
     * Gets the "LinksUpToDate" element
     */
    public boolean getLinksUpToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKSUPTODATE$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinksUpToDate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLinksUpToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LINKSUPTODATE$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinksUpToDate" element
     */
    public boolean isSetLinksUpToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKSUPTODATE$34) != 0;
        }
    }
    
    /**
     * Sets the "LinksUpToDate" element
     */
    public void setLinksUpToDate(boolean linksUpToDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKSUPTODATE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKSUPTODATE$34);
            }
            target.setBooleanValue(linksUpToDate);
        }
    }
    
    /**
     * Sets (as xml) the "LinksUpToDate" element
     */
    public void xsetLinksUpToDate(org.apache.xmlbeans.XmlBoolean linksUpToDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LINKSUPTODATE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LINKSUPTODATE$34);
            }
            target.set(linksUpToDate);
        }
    }
    
    /**
     * Unsets the "LinksUpToDate" element
     */
    public void unsetLinksUpToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKSUPTODATE$34, 0);
        }
    }
    
    /**
     * Gets the "CharactersWithSpaces" element
     */
    public int getCharactersWithSpaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CharactersWithSpaces" element
     */
    public org.apache.xmlbeans.XmlInt xgetCharactersWithSpaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "CharactersWithSpaces" element
     */
    public boolean isSetCharactersWithSpaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERSWITHSPACES$36) != 0;
        }
    }
    
    /**
     * Sets the "CharactersWithSpaces" element
     */
    public void setCharactersWithSpaces(int charactersWithSpaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARACTERSWITHSPACES$36);
            }
            target.setIntValue(charactersWithSpaces);
        }
    }
    
    /**
     * Sets (as xml) the "CharactersWithSpaces" element
     */
    public void xsetCharactersWithSpaces(org.apache.xmlbeans.XmlInt charactersWithSpaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CHARACTERSWITHSPACES$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CHARACTERSWITHSPACES$36);
            }
            target.set(charactersWithSpaces);
        }
    }
    
    /**
     * Unsets the "CharactersWithSpaces" element
     */
    public void unsetCharactersWithSpaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERSWITHSPACES$36, 0);
        }
    }
    
    /**
     * Gets the "SharedDoc" element
     */
    public boolean getSharedDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDDOC$38, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SharedDoc" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSharedDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHAREDDOC$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "SharedDoc" element
     */
    public boolean isSetSharedDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREDDOC$38) != 0;
        }
    }
    
    /**
     * Sets the "SharedDoc" element
     */
    public void setSharedDoc(boolean sharedDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDDOC$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDDOC$38);
            }
            target.setBooleanValue(sharedDoc);
        }
    }
    
    /**
     * Sets (as xml) the "SharedDoc" element
     */
    public void xsetSharedDoc(org.apache.xmlbeans.XmlBoolean sharedDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHAREDDOC$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHAREDDOC$38);
            }
            target.set(sharedDoc);
        }
    }
    
    /**
     * Unsets the "SharedDoc" element
     */
    public void unsetSharedDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREDDOC$38, 0);
        }
    }
    
    /**
     * Gets the "HyperlinkBase" element
     */
    public java.lang.String getHyperlinkBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HYPERLINKBASE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HyperlinkBase" element
     */
    public org.apache.xmlbeans.XmlString xgetHyperlinkBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HYPERLINKBASE$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "HyperlinkBase" element
     */
    public boolean isSetHyperlinkBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPERLINKBASE$40) != 0;
        }
    }
    
    /**
     * Sets the "HyperlinkBase" element
     */
    public void setHyperlinkBase(java.lang.String hyperlinkBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HYPERLINKBASE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HYPERLINKBASE$40);
            }
            target.setStringValue(hyperlinkBase);
        }
    }
    
    /**
     * Sets (as xml) the "HyperlinkBase" element
     */
    public void xsetHyperlinkBase(org.apache.xmlbeans.XmlString hyperlinkBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HYPERLINKBASE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HYPERLINKBASE$40);
            }
            target.set(hyperlinkBase);
        }
    }
    
    /**
     * Unsets the "HyperlinkBase" element
     */
    public void unsetHyperlinkBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPERLINKBASE$40, 0);
        }
    }
    
    /**
     * Gets the "HLinks" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant getHLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().find_element_user(HLINKS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HLinks" element
     */
    public boolean isSetHLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HLINKS$42) != 0;
        }
    }
    
    /**
     * Sets the "HLinks" element
     */
    public void setHLinks(org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant hLinks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().find_element_user(HLINKS$42, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().add_element_user(HLINKS$42);
            }
            target.set(hLinks);
        }
    }
    
    /**
     * Appends and returns a new empty "HLinks" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant addNewHLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant)get_store().add_element_user(HLINKS$42);
            return target;
        }
    }
    
    /**
     * Unsets the "HLinks" element
     */
    public void unsetHLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HLINKS$42, 0);
        }
    }
    
    /**
     * Gets the "HyperlinksChanged" element
     */
    public boolean getHyperlinksChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HyperlinksChanged" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHyperlinksChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "HyperlinksChanged" element
     */
    public boolean isSetHyperlinksChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPERLINKSCHANGED$44) != 0;
        }
    }
    
    /**
     * Sets the "HyperlinksChanged" element
     */
    public void setHyperlinksChanged(boolean hyperlinksChanged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HYPERLINKSCHANGED$44);
            }
            target.setBooleanValue(hyperlinksChanged);
        }
    }
    
    /**
     * Sets (as xml) the "HyperlinksChanged" element
     */
    public void xsetHyperlinksChanged(org.apache.xmlbeans.XmlBoolean hyperlinksChanged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HYPERLINKSCHANGED$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HYPERLINKSCHANGED$44);
            }
            target.set(hyperlinksChanged);
        }
    }
    
    /**
     * Unsets the "HyperlinksChanged" element
     */
    public void unsetHyperlinksChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPERLINKSCHANGED$44, 0);
        }
    }
    
    /**
     * Gets the "DigSig" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob getDigSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob)get_store().find_element_user(DIGSIG$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DigSig" element
     */
    public boolean isSetDigSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIGSIG$46) != 0;
        }
    }
    
    /**
     * Sets the "DigSig" element
     */
    public void setDigSig(org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob digSig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob)get_store().find_element_user(DIGSIG$46, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob)get_store().add_element_user(DIGSIG$46);
            }
            target.set(digSig);
        }
    }
    
    /**
     * Appends and returns a new empty "DigSig" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob addNewDigSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob)get_store().add_element_user(DIGSIG$46);
            return target;
        }
    }
    
    /**
     * Unsets the "DigSig" element
     */
    public void unsetDigSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIGSIG$46, 0);
        }
    }
    
    /**
     * Gets the "Application" element
     */
    public java.lang.String getApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATION$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Application" element
     */
    public org.apache.xmlbeans.XmlString xgetApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATION$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "Application" element
     */
    public boolean isSetApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLICATION$48) != 0;
        }
    }
    
    /**
     * Sets the "Application" element
     */
    public void setApplication(java.lang.String application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATION$48);
            }
            target.setStringValue(application);
        }
    }
    
    /**
     * Sets (as xml) the "Application" element
     */
    public void xsetApplication(org.apache.xmlbeans.XmlString application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATION$48);
            }
            target.set(application);
        }
    }
    
    /**
     * Unsets the "Application" element
     */
    public void unsetApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLICATION$48, 0);
        }
    }
    
    /**
     * Gets the "AppVersion" element
     */
    public java.lang.String getAppVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPVERSION$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AppVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetAppVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPVERSION$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "AppVersion" element
     */
    public boolean isSetAppVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPVERSION$50) != 0;
        }
    }
    
    /**
     * Sets the "AppVersion" element
     */
    public void setAppVersion(java.lang.String appVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPVERSION$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPVERSION$50);
            }
            target.setStringValue(appVersion);
        }
    }
    
    /**
     * Sets (as xml) the "AppVersion" element
     */
    public void xsetAppVersion(org.apache.xmlbeans.XmlString appVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPVERSION$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPVERSION$50);
            }
            target.set(appVersion);
        }
    }
    
    /**
     * Unsets the "AppVersion" element
     */
    public void unsetAppVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPVERSION$50, 0);
        }
    }
    
    /**
     * Gets the "DocSecurity" element
     */
    public int getDocSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCSECURITY$52, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocSecurity" element
     */
    public org.apache.xmlbeans.XmlInt xgetDocSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DOCSECURITY$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "DocSecurity" element
     */
    public boolean isSetDocSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCSECURITY$52) != 0;
        }
    }
    
    /**
     * Sets the "DocSecurity" element
     */
    public void setDocSecurity(int docSecurity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCSECURITY$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCSECURITY$52);
            }
            target.setIntValue(docSecurity);
        }
    }
    
    /**
     * Sets (as xml) the "DocSecurity" element
     */
    public void xsetDocSecurity(org.apache.xmlbeans.XmlInt docSecurity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DOCSECURITY$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DOCSECURITY$52);
            }
            target.set(docSecurity);
        }
    }
    
    /**
     * Unsets the "DocSecurity" element
     */
    public void unsetDocSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCSECURITY$52, 0);
        }
    }
}

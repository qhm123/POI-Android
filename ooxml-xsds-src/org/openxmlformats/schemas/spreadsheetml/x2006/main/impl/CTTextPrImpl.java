/*
 * XML Type:  CT_TextPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TextPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr
{
    
    public CTTextPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFIELDS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "textFields");
    private static final javax.xml.namespace.QName PROMPT$2 = 
        new javax.xml.namespace.QName("", "prompt");
    private static final javax.xml.namespace.QName FILETYPE$4 = 
        new javax.xml.namespace.QName("", "fileType");
    private static final javax.xml.namespace.QName CODEPAGE$6 = 
        new javax.xml.namespace.QName("", "codePage");
    private static final javax.xml.namespace.QName FIRSTROW$8 = 
        new javax.xml.namespace.QName("", "firstRow");
    private static final javax.xml.namespace.QName SOURCEFILE$10 = 
        new javax.xml.namespace.QName("", "sourceFile");
    private static final javax.xml.namespace.QName DELIMITED$12 = 
        new javax.xml.namespace.QName("", "delimited");
    private static final javax.xml.namespace.QName DECIMAL$14 = 
        new javax.xml.namespace.QName("", "decimal");
    private static final javax.xml.namespace.QName THOUSANDS$16 = 
        new javax.xml.namespace.QName("", "thousands");
    private static final javax.xml.namespace.QName TAB$18 = 
        new javax.xml.namespace.QName("", "tab");
    private static final javax.xml.namespace.QName SPACE$20 = 
        new javax.xml.namespace.QName("", "space");
    private static final javax.xml.namespace.QName COMMA$22 = 
        new javax.xml.namespace.QName("", "comma");
    private static final javax.xml.namespace.QName SEMICOLON$24 = 
        new javax.xml.namespace.QName("", "semicolon");
    private static final javax.xml.namespace.QName CONSECUTIVE$26 = 
        new javax.xml.namespace.QName("", "consecutive");
    private static final javax.xml.namespace.QName QUALIFIER$28 = 
        new javax.xml.namespace.QName("", "qualifier");
    private static final javax.xml.namespace.QName DELIMITER$30 = 
        new javax.xml.namespace.QName("", "delimiter");
    
    
    /**
     * Gets the "textFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields getTextFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields)get_store().find_element_user(TEXTFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "textFields" element
     */
    public boolean isSetTextFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTFIELDS$0) != 0;
        }
    }
    
    /**
     * Sets the "textFields" element
     */
    public void setTextFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields textFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields)get_store().find_element_user(TEXTFIELDS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields)get_store().add_element_user(TEXTFIELDS$0);
            }
            target.set(textFields);
        }
    }
    
    /**
     * Appends and returns a new empty "textFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields addNewTextFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields)get_store().add_element_user(TEXTFIELDS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "textFields" element
     */
    public void unsetTextFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTFIELDS$0, 0);
        }
    }
    
    /**
     * Gets the "prompt" attribute
     */
    public boolean getPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROMPT$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "prompt" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROMPT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROMPT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "prompt" attribute
     */
    public boolean isSetPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROMPT$2) != null;
        }
    }
    
    /**
     * Sets the "prompt" attribute
     */
    public void setPrompt(boolean prompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMPT$2);
            }
            target.setBooleanValue(prompt);
        }
    }
    
    /**
     * Sets (as xml) the "prompt" attribute
     */
    public void xsetPrompt(org.apache.xmlbeans.XmlBoolean prompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROMPT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROMPT$2);
            }
            target.set(prompt);
        }
    }
    
    /**
     * Unsets the "prompt" attribute
     */
    public void unsetPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROMPT$2);
        }
    }
    
    /**
     * Gets the "fileType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType.Enum getFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILETYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType xgetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType)get_store().find_attribute_user(FILETYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType)get_default_attribute_value(FILETYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "fileType" attribute
     */
    public boolean isSetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILETYPE$4) != null;
        }
    }
    
    /**
     * Sets the "fileType" attribute
     */
    public void setFileType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType.Enum fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILETYPE$4);
            }
            target.setEnumValue(fileType);
        }
    }
    
    /**
     * Sets (as xml) the "fileType" attribute
     */
    public void xsetFileType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType)get_store().find_attribute_user(FILETYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType)get_store().add_attribute_user(FILETYPE$4);
            }
            target.set(fileType);
        }
    }
    
    /**
     * Unsets the "fileType" attribute
     */
    public void unsetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILETYPE$4);
        }
    }
    
    /**
     * Gets the "codePage" attribute
     */
    public long getCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODEPAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODEPAGE$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "codePage" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CODEPAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(CODEPAGE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "codePage" attribute
     */
    public boolean isSetCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODEPAGE$6) != null;
        }
    }
    
    /**
     * Sets the "codePage" attribute
     */
    public void setCodePage(long codePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODEPAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODEPAGE$6);
            }
            target.setLongValue(codePage);
        }
    }
    
    /**
     * Sets (as xml) the "codePage" attribute
     */
    public void xsetCodePage(org.apache.xmlbeans.XmlUnsignedInt codePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CODEPAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CODEPAGE$6);
            }
            target.set(codePage);
        }
    }
    
    /**
     * Unsets the "codePage" attribute
     */
    public void unsetCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODEPAGE$6);
        }
    }
    
    /**
     * Gets the "firstRow" attribute
     */
    public long getFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTROW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTROW$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstRow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTROW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(FIRSTROW$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstRow" attribute
     */
    public boolean isSetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTROW$8) != null;
        }
    }
    
    /**
     * Sets the "firstRow" attribute
     */
    public void setFirstRow(long firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTROW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTROW$8);
            }
            target.setLongValue(firstRow);
        }
    }
    
    /**
     * Sets (as xml) the "firstRow" attribute
     */
    public void xsetFirstRow(org.apache.xmlbeans.XmlUnsignedInt firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTROW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTROW$8);
            }
            target.set(firstRow);
        }
    }
    
    /**
     * Unsets the "firstRow" attribute
     */
    public void unsetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTROW$8);
        }
    }
    
    /**
     * Gets the "sourceFile" attribute
     */
    public java.lang.String getSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEFILE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCEFILE$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceFile" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SOURCEFILE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_default_attribute_value(SOURCEFILE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceFile" attribute
     */
    public boolean isSetSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCEFILE$10) != null;
        }
    }
    
    /**
     * Sets the "sourceFile" attribute
     */
    public void setSourceFile(java.lang.String sourceFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEFILE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEFILE$10);
            }
            target.setStringValue(sourceFile);
        }
    }
    
    /**
     * Sets (as xml) the "sourceFile" attribute
     */
    public void xsetSourceFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring sourceFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SOURCEFILE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SOURCEFILE$10);
            }
            target.set(sourceFile);
        }
    }
    
    /**
     * Unsets the "sourceFile" attribute
     */
    public void unsetSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCEFILE$10);
        }
    }
    
    /**
     * Gets the "delimited" attribute
     */
    public boolean getDelimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIMITED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELIMITED$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "delimited" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDelimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELIMITED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELIMITED$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "delimited" attribute
     */
    public boolean isSetDelimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELIMITED$12) != null;
        }
    }
    
    /**
     * Sets the "delimited" attribute
     */
    public void setDelimited(boolean delimited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIMITED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELIMITED$12);
            }
            target.setBooleanValue(delimited);
        }
    }
    
    /**
     * Sets (as xml) the "delimited" attribute
     */
    public void xsetDelimited(org.apache.xmlbeans.XmlBoolean delimited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELIMITED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELIMITED$12);
            }
            target.set(delimited);
        }
    }
    
    /**
     * Unsets the "delimited" attribute
     */
    public void unsetDelimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELIMITED$12);
        }
    }
    
    /**
     * Gets the "decimal" attribute
     */
    public java.lang.String getDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DECIMAL$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimal" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DECIMAL$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_default_attribute_value(DECIMAL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "decimal" attribute
     */
    public boolean isSetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMAL$14) != null;
        }
    }
    
    /**
     * Sets the "decimal" attribute
     */
    public void setDecimal(java.lang.String decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMAL$14);
            }
            target.setStringValue(decimal);
        }
    }
    
    /**
     * Sets (as xml) the "decimal" attribute
     */
    public void xsetDecimal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DECIMAL$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DECIMAL$14);
            }
            target.set(decimal);
        }
    }
    
    /**
     * Unsets the "decimal" attribute
     */
    public void unsetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMAL$14);
        }
    }
    
    /**
     * Gets the "thousands" attribute
     */
    public java.lang.String getThousands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THOUSANDS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THOUSANDS$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "thousands" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetThousands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(THOUSANDS$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_default_attribute_value(THOUSANDS$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "thousands" attribute
     */
    public boolean isSetThousands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THOUSANDS$16) != null;
        }
    }
    
    /**
     * Sets the "thousands" attribute
     */
    public void setThousands(java.lang.String thousands)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THOUSANDS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THOUSANDS$16);
            }
            target.setStringValue(thousands);
        }
    }
    
    /**
     * Sets (as xml) the "thousands" attribute
     */
    public void xsetThousands(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring thousands)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(THOUSANDS$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(THOUSANDS$16);
            }
            target.set(thousands);
        }
    }
    
    /**
     * Unsets the "thousands" attribute
     */
    public void unsetThousands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THOUSANDS$16);
        }
    }
    
    /**
     * Gets the "tab" attribute
     */
    public boolean getTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAB$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TAB$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tab" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TAB$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TAB$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "tab" attribute
     */
    public boolean isSetTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TAB$18) != null;
        }
    }
    
    /**
     * Sets the "tab" attribute
     */
    public void setTab(boolean tab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAB$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAB$18);
            }
            target.setBooleanValue(tab);
        }
    }
    
    /**
     * Sets (as xml) the "tab" attribute
     */
    public void xsetTab(org.apache.xmlbeans.XmlBoolean tab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TAB$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TAB$18);
            }
            target.set(tab);
        }
    }
    
    /**
     * Unsets the "tab" attribute
     */
    public void unsetTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TAB$18);
        }
    }
    
    /**
     * Gets the "space" attribute
     */
    public boolean getSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPACE$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "space" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPACE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SPACE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "space" attribute
     */
    public boolean isSetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPACE$20) != null;
        }
    }
    
    /**
     * Sets the "space" attribute
     */
    public void setSpace(boolean space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$20);
            }
            target.setBooleanValue(space);
        }
    }
    
    /**
     * Sets (as xml) the "space" attribute
     */
    public void xsetSpace(org.apache.xmlbeans.XmlBoolean space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPACE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SPACE$20);
            }
            target.set(space);
        }
    }
    
    /**
     * Unsets the "space" attribute
     */
    public void unsetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPACE$20);
        }
    }
    
    /**
     * Gets the "comma" attribute
     */
    public boolean getComma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMMA$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "comma" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetComma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMMA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMMA$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "comma" attribute
     */
    public boolean isSetComma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMMA$22) != null;
        }
    }
    
    /**
     * Sets the "comma" attribute
     */
    public void setComma(boolean comma)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMA$22);
            }
            target.setBooleanValue(comma);
        }
    }
    
    /**
     * Sets (as xml) the "comma" attribute
     */
    public void xsetComma(org.apache.xmlbeans.XmlBoolean comma)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMMA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMMA$22);
            }
            target.set(comma);
        }
    }
    
    /**
     * Unsets the "comma" attribute
     */
    public void unsetComma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMMA$22);
        }
    }
    
    /**
     * Gets the "semicolon" attribute
     */
    public boolean getSemicolon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMICOLON$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SEMICOLON$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "semicolon" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSemicolon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SEMICOLON$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SEMICOLON$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "semicolon" attribute
     */
    public boolean isSetSemicolon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEMICOLON$24) != null;
        }
    }
    
    /**
     * Sets the "semicolon" attribute
     */
    public void setSemicolon(boolean semicolon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMICOLON$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEMICOLON$24);
            }
            target.setBooleanValue(semicolon);
        }
    }
    
    /**
     * Sets (as xml) the "semicolon" attribute
     */
    public void xsetSemicolon(org.apache.xmlbeans.XmlBoolean semicolon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SEMICOLON$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SEMICOLON$24);
            }
            target.set(semicolon);
        }
    }
    
    /**
     * Unsets the "semicolon" attribute
     */
    public void unsetSemicolon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEMICOLON$24);
        }
    }
    
    /**
     * Gets the "consecutive" attribute
     */
    public boolean getConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSECUTIVE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONSECUTIVE$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "consecutive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONSECUTIVE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONSECUTIVE$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "consecutive" attribute
     */
    public boolean isSetConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONSECUTIVE$26) != null;
        }
    }
    
    /**
     * Sets the "consecutive" attribute
     */
    public void setConsecutive(boolean consecutive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSECUTIVE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSECUTIVE$26);
            }
            target.setBooleanValue(consecutive);
        }
    }
    
    /**
     * Sets (as xml) the "consecutive" attribute
     */
    public void xsetConsecutive(org.apache.xmlbeans.XmlBoolean consecutive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONSECUTIVE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONSECUTIVE$26);
            }
            target.set(consecutive);
        }
    }
    
    /**
     * Unsets the "consecutive" attribute
     */
    public void unsetConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONSECUTIVE$26);
        }
    }
    
    /**
     * Gets the "qualifier" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier.Enum getQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(QUALIFIER$28);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "qualifier" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier xgetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier)get_store().find_attribute_user(QUALIFIER$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier)get_default_attribute_value(QUALIFIER$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "qualifier" attribute
     */
    public boolean isSetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUALIFIER$28) != null;
        }
    }
    
    /**
     * Sets the "qualifier" attribute
     */
    public void setQualifier(org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier.Enum qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$28);
            }
            target.setEnumValue(qualifier);
        }
    }
    
    /**
     * Sets (as xml) the "qualifier" attribute
     */
    public void xsetQualifier(org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier)get_store().find_attribute_user(QUALIFIER$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier)get_store().add_attribute_user(QUALIFIER$28);
            }
            target.set(qualifier);
        }
    }
    
    /**
     * Unsets the "qualifier" attribute
     */
    public void unsetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUALIFIER$28);
        }
    }
    
    /**
     * Gets the "delimiter" attribute
     */
    public java.lang.String getDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIMITER$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "delimiter" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DELIMITER$30);
            return target;
        }
    }
    
    /**
     * True if has "delimiter" attribute
     */
    public boolean isSetDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELIMITER$30) != null;
        }
    }
    
    /**
     * Sets the "delimiter" attribute
     */
    public void setDelimiter(java.lang.String delimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIMITER$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELIMITER$30);
            }
            target.setStringValue(delimiter);
        }
    }
    
    /**
     * Sets (as xml) the "delimiter" attribute
     */
    public void xsetDelimiter(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring delimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DELIMITER$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DELIMITER$30);
            }
            target.set(delimiter);
        }
    }
    
    /**
     * Unsets the "delimiter" attribute
     */
    public void unsetDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELIMITER$30);
        }
    }
}

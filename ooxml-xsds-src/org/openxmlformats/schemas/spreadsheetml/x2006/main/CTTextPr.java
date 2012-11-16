/*
 * XML Type:  CT_TextPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_TextPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTextPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttextpr0b58type");
    
    /**
     * Gets the "textFields" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields getTextFields();
    
    /**
     * True if has "textFields" element
     */
    boolean isSetTextFields();
    
    /**
     * Sets the "textFields" element
     */
    void setTextFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields textFields);
    
    /**
     * Appends and returns a new empty "textFields" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields addNewTextFields();
    
    /**
     * Unsets the "textFields" element
     */
    void unsetTextFields();
    
    /**
     * Gets the "prompt" attribute
     */
    boolean getPrompt();
    
    /**
     * Gets (as xml) the "prompt" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPrompt();
    
    /**
     * True if has "prompt" attribute
     */
    boolean isSetPrompt();
    
    /**
     * Sets the "prompt" attribute
     */
    void setPrompt(boolean prompt);
    
    /**
     * Sets (as xml) the "prompt" attribute
     */
    void xsetPrompt(org.apache.xmlbeans.XmlBoolean prompt);
    
    /**
     * Unsets the "prompt" attribute
     */
    void unsetPrompt();
    
    /**
     * Gets the "fileType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType.Enum getFileType();
    
    /**
     * Gets (as xml) the "fileType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType xgetFileType();
    
    /**
     * True if has "fileType" attribute
     */
    boolean isSetFileType();
    
    /**
     * Sets the "fileType" attribute
     */
    void setFileType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType.Enum fileType);
    
    /**
     * Sets (as xml) the "fileType" attribute
     */
    void xsetFileType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFileType fileType);
    
    /**
     * Unsets the "fileType" attribute
     */
    void unsetFileType();
    
    /**
     * Gets the "codePage" attribute
     */
    long getCodePage();
    
    /**
     * Gets (as xml) the "codePage" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCodePage();
    
    /**
     * True if has "codePage" attribute
     */
    boolean isSetCodePage();
    
    /**
     * Sets the "codePage" attribute
     */
    void setCodePage(long codePage);
    
    /**
     * Sets (as xml) the "codePage" attribute
     */
    void xsetCodePage(org.apache.xmlbeans.XmlUnsignedInt codePage);
    
    /**
     * Unsets the "codePage" attribute
     */
    void unsetCodePage();
    
    /**
     * Gets the "firstRow" attribute
     */
    long getFirstRow();
    
    /**
     * Gets (as xml) the "firstRow" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFirstRow();
    
    /**
     * True if has "firstRow" attribute
     */
    boolean isSetFirstRow();
    
    /**
     * Sets the "firstRow" attribute
     */
    void setFirstRow(long firstRow);
    
    /**
     * Sets (as xml) the "firstRow" attribute
     */
    void xsetFirstRow(org.apache.xmlbeans.XmlUnsignedInt firstRow);
    
    /**
     * Unsets the "firstRow" attribute
     */
    void unsetFirstRow();
    
    /**
     * Gets the "sourceFile" attribute
     */
    java.lang.String getSourceFile();
    
    /**
     * Gets (as xml) the "sourceFile" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSourceFile();
    
    /**
     * True if has "sourceFile" attribute
     */
    boolean isSetSourceFile();
    
    /**
     * Sets the "sourceFile" attribute
     */
    void setSourceFile(java.lang.String sourceFile);
    
    /**
     * Sets (as xml) the "sourceFile" attribute
     */
    void xsetSourceFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring sourceFile);
    
    /**
     * Unsets the "sourceFile" attribute
     */
    void unsetSourceFile();
    
    /**
     * Gets the "delimited" attribute
     */
    boolean getDelimited();
    
    /**
     * Gets (as xml) the "delimited" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDelimited();
    
    /**
     * True if has "delimited" attribute
     */
    boolean isSetDelimited();
    
    /**
     * Sets the "delimited" attribute
     */
    void setDelimited(boolean delimited);
    
    /**
     * Sets (as xml) the "delimited" attribute
     */
    void xsetDelimited(org.apache.xmlbeans.XmlBoolean delimited);
    
    /**
     * Unsets the "delimited" attribute
     */
    void unsetDelimited();
    
    /**
     * Gets the "decimal" attribute
     */
    java.lang.String getDecimal();
    
    /**
     * Gets (as xml) the "decimal" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDecimal();
    
    /**
     * True if has "decimal" attribute
     */
    boolean isSetDecimal();
    
    /**
     * Sets the "decimal" attribute
     */
    void setDecimal(java.lang.String decimal);
    
    /**
     * Sets (as xml) the "decimal" attribute
     */
    void xsetDecimal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring decimal);
    
    /**
     * Unsets the "decimal" attribute
     */
    void unsetDecimal();
    
    /**
     * Gets the "thousands" attribute
     */
    java.lang.String getThousands();
    
    /**
     * Gets (as xml) the "thousands" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetThousands();
    
    /**
     * True if has "thousands" attribute
     */
    boolean isSetThousands();
    
    /**
     * Sets the "thousands" attribute
     */
    void setThousands(java.lang.String thousands);
    
    /**
     * Sets (as xml) the "thousands" attribute
     */
    void xsetThousands(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring thousands);
    
    /**
     * Unsets the "thousands" attribute
     */
    void unsetThousands();
    
    /**
     * Gets the "tab" attribute
     */
    boolean getTab();
    
    /**
     * Gets (as xml) the "tab" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTab();
    
    /**
     * True if has "tab" attribute
     */
    boolean isSetTab();
    
    /**
     * Sets the "tab" attribute
     */
    void setTab(boolean tab);
    
    /**
     * Sets (as xml) the "tab" attribute
     */
    void xsetTab(org.apache.xmlbeans.XmlBoolean tab);
    
    /**
     * Unsets the "tab" attribute
     */
    void unsetTab();
    
    /**
     * Gets the "space" attribute
     */
    boolean getSpace();
    
    /**
     * Gets (as xml) the "space" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSpace();
    
    /**
     * True if has "space" attribute
     */
    boolean isSetSpace();
    
    /**
     * Sets the "space" attribute
     */
    void setSpace(boolean space);
    
    /**
     * Sets (as xml) the "space" attribute
     */
    void xsetSpace(org.apache.xmlbeans.XmlBoolean space);
    
    /**
     * Unsets the "space" attribute
     */
    void unsetSpace();
    
    /**
     * Gets the "comma" attribute
     */
    boolean getComma();
    
    /**
     * Gets (as xml) the "comma" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetComma();
    
    /**
     * True if has "comma" attribute
     */
    boolean isSetComma();
    
    /**
     * Sets the "comma" attribute
     */
    void setComma(boolean comma);
    
    /**
     * Sets (as xml) the "comma" attribute
     */
    void xsetComma(org.apache.xmlbeans.XmlBoolean comma);
    
    /**
     * Unsets the "comma" attribute
     */
    void unsetComma();
    
    /**
     * Gets the "semicolon" attribute
     */
    boolean getSemicolon();
    
    /**
     * Gets (as xml) the "semicolon" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSemicolon();
    
    /**
     * True if has "semicolon" attribute
     */
    boolean isSetSemicolon();
    
    /**
     * Sets the "semicolon" attribute
     */
    void setSemicolon(boolean semicolon);
    
    /**
     * Sets (as xml) the "semicolon" attribute
     */
    void xsetSemicolon(org.apache.xmlbeans.XmlBoolean semicolon);
    
    /**
     * Unsets the "semicolon" attribute
     */
    void unsetSemicolon();
    
    /**
     * Gets the "consecutive" attribute
     */
    boolean getConsecutive();
    
    /**
     * Gets (as xml) the "consecutive" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetConsecutive();
    
    /**
     * True if has "consecutive" attribute
     */
    boolean isSetConsecutive();
    
    /**
     * Sets the "consecutive" attribute
     */
    void setConsecutive(boolean consecutive);
    
    /**
     * Sets (as xml) the "consecutive" attribute
     */
    void xsetConsecutive(org.apache.xmlbeans.XmlBoolean consecutive);
    
    /**
     * Unsets the "consecutive" attribute
     */
    void unsetConsecutive();
    
    /**
     * Gets the "qualifier" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier.Enum getQualifier();
    
    /**
     * Gets (as xml) the "qualifier" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier xgetQualifier();
    
    /**
     * True if has "qualifier" attribute
     */
    boolean isSetQualifier();
    
    /**
     * Sets the "qualifier" attribute
     */
    void setQualifier(org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier.Enum qualifier);
    
    /**
     * Sets (as xml) the "qualifier" attribute
     */
    void xsetQualifier(org.openxmlformats.schemas.spreadsheetml.x2006.main.STQualifier qualifier);
    
    /**
     * Unsets the "qualifier" attribute
     */
    void unsetQualifier();
    
    /**
     * Gets the "delimiter" attribute
     */
    java.lang.String getDelimiter();
    
    /**
     * Gets (as xml) the "delimiter" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDelimiter();
    
    /**
     * True if has "delimiter" attribute
     */
    boolean isSetDelimiter();
    
    /**
     * Sets the "delimiter" attribute
     */
    void setDelimiter(java.lang.String delimiter);
    
    /**
     * Sets (as xml) the "delimiter" attribute
     */
    void xsetDelimiter(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring delimiter);
    
    /**
     * Unsets the "delimiter" attribute
     */
    void unsetDelimiter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}

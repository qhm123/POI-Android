/*
 * XML Type:  CT_Settings
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Settings(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSettingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings
{
    
    public CTSettingsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WRITEPROTECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "writeProtection");
    private static final javax.xml.namespace.QName VIEW$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "view");
    private static final javax.xml.namespace.QName ZOOM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "zoom");
    private static final javax.xml.namespace.QName REMOVEPERSONALINFORMATION$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "removePersonalInformation");
    private static final javax.xml.namespace.QName REMOVEDATEANDTIME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "removeDateAndTime");
    private static final javax.xml.namespace.QName DONOTDISPLAYPAGEBOUNDARIES$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotDisplayPageBoundaries");
    private static final javax.xml.namespace.QName DISPLAYBACKGROUNDSHAPE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displayBackgroundShape");
    private static final javax.xml.namespace.QName PRINTPOSTSCRIPTOVERTEXT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printPostScriptOverText");
    private static final javax.xml.namespace.QName PRINTFRACTIONALCHARACTERWIDTH$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printFractionalCharacterWidth");
    private static final javax.xml.namespace.QName PRINTFORMSDATA$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printFormsData");
    private static final javax.xml.namespace.QName EMBEDTRUETYPEFONTS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedTrueTypeFonts");
    private static final javax.xml.namespace.QName EMBEDSYSTEMFONTS$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedSystemFonts");
    private static final javax.xml.namespace.QName SAVESUBSETFONTS$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveSubsetFonts");
    private static final javax.xml.namespace.QName SAVEFORMSDATA$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveFormsData");
    private static final javax.xml.namespace.QName MIRRORMARGINS$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mirrorMargins");
    private static final javax.xml.namespace.QName ALIGNBORDERSANDEDGES$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alignBordersAndEdges");
    private static final javax.xml.namespace.QName BORDERSDONOTSURROUNDHEADER$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bordersDoNotSurroundHeader");
    private static final javax.xml.namespace.QName BORDERSDONOTSURROUNDFOOTER$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bordersDoNotSurroundFooter");
    private static final javax.xml.namespace.QName GUTTERATTOP$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gutterAtTop");
    private static final javax.xml.namespace.QName HIDESPELLINGERRORS$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hideSpellingErrors");
    private static final javax.xml.namespace.QName HIDEGRAMMATICALERRORS$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hideGrammaticalErrors");
    private static final javax.xml.namespace.QName ACTIVEWRITINGSTYLE$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "activeWritingStyle");
    private static final javax.xml.namespace.QName PROOFSTATE$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofState");
    private static final javax.xml.namespace.QName FORMSDESIGN$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formsDesign");
    private static final javax.xml.namespace.QName ATTACHEDTEMPLATE$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "attachedTemplate");
    private static final javax.xml.namespace.QName LINKSTYLES$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "linkStyles");
    private static final javax.xml.namespace.QName STYLEPANEFORMATFILTER$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "stylePaneFormatFilter");
    private static final javax.xml.namespace.QName STYLEPANESORTMETHOD$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "stylePaneSortMethod");
    private static final javax.xml.namespace.QName DOCUMENTTYPE$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "documentType");
    private static final javax.xml.namespace.QName MAILMERGE$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mailMerge");
    private static final javax.xml.namespace.QName REVISIONVIEW$60 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "revisionView");
    private static final javax.xml.namespace.QName TRACKREVISIONS$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trackRevisions");
    private static final javax.xml.namespace.QName DONOTTRACKMOVES$64 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotTrackMoves");
    private static final javax.xml.namespace.QName DONOTTRACKFORMATTING$66 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotTrackFormatting");
    private static final javax.xml.namespace.QName DOCUMENTPROTECTION$68 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "documentProtection");
    private static final javax.xml.namespace.QName AUTOFORMATOVERRIDE$70 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoFormatOverride");
    private static final javax.xml.namespace.QName STYLELOCKTHEME$72 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleLockTheme");
    private static final javax.xml.namespace.QName STYLELOCKQFSET$74 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleLockQFSet");
    private static final javax.xml.namespace.QName DEFAULTTABSTOP$76 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defaultTabStop");
    private static final javax.xml.namespace.QName AUTOHYPHENATION$78 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoHyphenation");
    private static final javax.xml.namespace.QName CONSECUTIVEHYPHENLIMIT$80 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "consecutiveHyphenLimit");
    private static final javax.xml.namespace.QName HYPHENATIONZONE$82 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hyphenationZone");
    private static final javax.xml.namespace.QName DONOTHYPHENATECAPS$84 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotHyphenateCaps");
    private static final javax.xml.namespace.QName SHOWENVELOPE$86 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "showEnvelope");
    private static final javax.xml.namespace.QName SUMMARYLENGTH$88 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "summaryLength");
    private static final javax.xml.namespace.QName CLICKANDTYPESTYLE$90 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "clickAndTypeStyle");
    private static final javax.xml.namespace.QName DEFAULTTABLESTYLE$92 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defaultTableStyle");
    private static final javax.xml.namespace.QName EVENANDODDHEADERS$94 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "evenAndOddHeaders");
    private static final javax.xml.namespace.QName BOOKFOLDREVPRINTING$96 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookFoldRevPrinting");
    private static final javax.xml.namespace.QName BOOKFOLDPRINTING$98 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookFoldPrinting");
    private static final javax.xml.namespace.QName BOOKFOLDPRINTINGSHEETS$100 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookFoldPrintingSheets");
    private static final javax.xml.namespace.QName DRAWINGGRIDHORIZONTALSPACING$102 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridHorizontalSpacing");
    private static final javax.xml.namespace.QName DRAWINGGRIDVERTICALSPACING$104 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridVerticalSpacing");
    private static final javax.xml.namespace.QName DISPLAYHORIZONTALDRAWINGGRIDEVERY$106 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displayHorizontalDrawingGridEvery");
    private static final javax.xml.namespace.QName DISPLAYVERTICALDRAWINGGRIDEVERY$108 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displayVerticalDrawingGridEvery");
    private static final javax.xml.namespace.QName DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotUseMarginsForDrawingGridOrigin");
    private static final javax.xml.namespace.QName DRAWINGGRIDHORIZONTALORIGIN$112 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridHorizontalOrigin");
    private static final javax.xml.namespace.QName DRAWINGGRIDVERTICALORIGIN$114 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridVerticalOrigin");
    private static final javax.xml.namespace.QName DONOTSHADEFORMDATA$116 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotShadeFormData");
    private static final javax.xml.namespace.QName NOPUNCTUATIONKERNING$118 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noPunctuationKerning");
    private static final javax.xml.namespace.QName CHARACTERSPACINGCONTROL$120 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "characterSpacingControl");
    private static final javax.xml.namespace.QName PRINTTWOONONE$122 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printTwoOnOne");
    private static final javax.xml.namespace.QName STRICTFIRSTANDLASTCHARS$124 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "strictFirstAndLastChars");
    private static final javax.xml.namespace.QName NOLINEBREAKSAFTER$126 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noLineBreaksAfter");
    private static final javax.xml.namespace.QName NOLINEBREAKSBEFORE$128 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noLineBreaksBefore");
    private static final javax.xml.namespace.QName SAVEPREVIEWPICTURE$130 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "savePreviewPicture");
    private static final javax.xml.namespace.QName DONOTVALIDATEAGAINSTSCHEMA$132 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotValidateAgainstSchema");
    private static final javax.xml.namespace.QName SAVEINVALIDXML$134 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveInvalidXml");
    private static final javax.xml.namespace.QName IGNOREMIXEDCONTENT$136 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ignoreMixedContent");
    private static final javax.xml.namespace.QName ALWAYSSHOWPLACEHOLDERTEXT$138 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alwaysShowPlaceholderText");
    private static final javax.xml.namespace.QName DONOTDEMARCATEINVALIDXML$140 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotDemarcateInvalidXml");
    private static final javax.xml.namespace.QName SAVEXMLDATAONLY$142 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveXmlDataOnly");
    private static final javax.xml.namespace.QName USEXSLTWHENSAVING$144 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "useXSLTWhenSaving");
    private static final javax.xml.namespace.QName SAVETHROUGHXSLT$146 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveThroughXslt");
    private static final javax.xml.namespace.QName SHOWXMLTAGS$148 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "showXMLTags");
    private static final javax.xml.namespace.QName ALWAYSMERGEEMPTYNAMESPACE$150 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alwaysMergeEmptyNamespace");
    private static final javax.xml.namespace.QName UPDATEFIELDS$152 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "updateFields");
    private static final javax.xml.namespace.QName HDRSHAPEDEFAULTS$154 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hdrShapeDefaults");
    private static final javax.xml.namespace.QName FOOTNOTEPR$156 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotePr");
    private static final javax.xml.namespace.QName ENDNOTEPR$158 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotePr");
    private static final javax.xml.namespace.QName COMPAT$160 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "compat");
    private static final javax.xml.namespace.QName DOCVARS$162 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docVars");
    private static final javax.xml.namespace.QName RSIDS$164 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsids");
    private static final javax.xml.namespace.QName MATHPR$166 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mathPr");
    private static final javax.xml.namespace.QName UICOMPAT97TO2003$168 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uiCompat97To2003");
    private static final javax.xml.namespace.QName ATTACHEDSCHEMA$170 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "attachedSchema");
    private static final javax.xml.namespace.QName THEMEFONTLANG$172 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFontLang");
    private static final javax.xml.namespace.QName CLRSCHEMEMAPPING$174 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "clrSchemeMapping");
    private static final javax.xml.namespace.QName DONOTINCLUDESUBDOCSINSTATS$176 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotIncludeSubdocsInStats");
    private static final javax.xml.namespace.QName DONOTAUTOCOMPRESSPICTURES$178 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotAutoCompressPictures");
    private static final javax.xml.namespace.QName FORCEUPGRADE$180 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "forceUpgrade");
    private static final javax.xml.namespace.QName CAPTIONS$182 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "captions");
    private static final javax.xml.namespace.QName READMODEINKLOCKDOWN$184 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "readModeInkLockDown");
    private static final javax.xml.namespace.QName SMARTTAGTYPE$186 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "smartTagType");
    private static final javax.xml.namespace.QName SCHEMALIBRARY$188 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "schemaLibrary");
    private static final javax.xml.namespace.QName SHAPEDEFAULTS$190 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shapeDefaults");
    private static final javax.xml.namespace.QName DONOTEMBEDSMARTTAGS$192 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotEmbedSmartTags");
    private static final javax.xml.namespace.QName DECIMALSYMBOL$194 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "decimalSymbol");
    private static final javax.xml.namespace.QName LISTSEPARATOR$196 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "listSeparator");
    
    
    /**
     * Gets the "writeProtection" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection getWriteProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection)get_store().find_element_user(WRITEPROTECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "writeProtection" element
     */
    public boolean isSetWriteProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRITEPROTECTION$0) != 0;
        }
    }
    
    /**
     * Sets the "writeProtection" element
     */
    public void setWriteProtection(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection writeProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection)get_store().find_element_user(WRITEPROTECTION$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection)get_store().add_element_user(WRITEPROTECTION$0);
            }
            target.set(writeProtection);
        }
    }
    
    /**
     * Appends and returns a new empty "writeProtection" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection addNewWriteProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection)get_store().add_element_user(WRITEPROTECTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "writeProtection" element
     */
    public void unsetWriteProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRITEPROTECTION$0, 0);
        }
    }
    
    /**
     * Gets the "view" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView getView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView)get_store().find_element_user(VIEW$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "view" element
     */
    public boolean isSetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIEW$2) != 0;
        }
    }
    
    /**
     * Sets the "view" element
     */
    public void setView(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView view)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView)get_store().find_element_user(VIEW$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView)get_store().add_element_user(VIEW$2);
            }
            target.set(view);
        }
    }
    
    /**
     * Appends and returns a new empty "view" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView addNewView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView)get_store().add_element_user(VIEW$2);
            return target;
        }
    }
    
    /**
     * Unsets the "view" element
     */
    public void unsetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIEW$2, 0);
        }
    }
    
    /**
     * Gets the "zoom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom getZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom)get_store().find_element_user(ZOOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "zoom" element
     */
    public boolean isSetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZOOM$4) != 0;
        }
    }
    
    /**
     * Sets the "zoom" element
     */
    public void setZoom(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom zoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom)get_store().find_element_user(ZOOM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom)get_store().add_element_user(ZOOM$4);
            }
            target.set(zoom);
        }
    }
    
    /**
     * Appends and returns a new empty "zoom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom addNewZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom)get_store().add_element_user(ZOOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "zoom" element
     */
    public void unsetZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZOOM$4, 0);
        }
    }
    
    /**
     * Gets the "removePersonalInformation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getRemovePersonalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(REMOVEPERSONALINFORMATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "removePersonalInformation" element
     */
    public boolean isSetRemovePersonalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOVEPERSONALINFORMATION$6) != 0;
        }
    }
    
    /**
     * Sets the "removePersonalInformation" element
     */
    public void setRemovePersonalInformation(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff removePersonalInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(REMOVEPERSONALINFORMATION$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(REMOVEPERSONALINFORMATION$6);
            }
            target.set(removePersonalInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "removePersonalInformation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewRemovePersonalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(REMOVEPERSONALINFORMATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "removePersonalInformation" element
     */
    public void unsetRemovePersonalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOVEPERSONALINFORMATION$6, 0);
        }
    }
    
    /**
     * Gets the "removeDateAndTime" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getRemoveDateAndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(REMOVEDATEANDTIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "removeDateAndTime" element
     */
    public boolean isSetRemoveDateAndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOVEDATEANDTIME$8) != 0;
        }
    }
    
    /**
     * Sets the "removeDateAndTime" element
     */
    public void setRemoveDateAndTime(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff removeDateAndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(REMOVEDATEANDTIME$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(REMOVEDATEANDTIME$8);
            }
            target.set(removeDateAndTime);
        }
    }
    
    /**
     * Appends and returns a new empty "removeDateAndTime" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewRemoveDateAndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(REMOVEDATEANDTIME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "removeDateAndTime" element
     */
    public void unsetRemoveDateAndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOVEDATEANDTIME$8, 0);
        }
    }
    
    /**
     * Gets the "doNotDisplayPageBoundaries" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotDisplayPageBoundaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTDISPLAYPAGEBOUNDARIES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotDisplayPageBoundaries" element
     */
    public boolean isSetDoNotDisplayPageBoundaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTDISPLAYPAGEBOUNDARIES$10) != 0;
        }
    }
    
    /**
     * Sets the "doNotDisplayPageBoundaries" element
     */
    public void setDoNotDisplayPageBoundaries(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotDisplayPageBoundaries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTDISPLAYPAGEBOUNDARIES$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTDISPLAYPAGEBOUNDARIES$10);
            }
            target.set(doNotDisplayPageBoundaries);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotDisplayPageBoundaries" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotDisplayPageBoundaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTDISPLAYPAGEBOUNDARIES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotDisplayPageBoundaries" element
     */
    public void unsetDoNotDisplayPageBoundaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTDISPLAYPAGEBOUNDARIES$10, 0);
        }
    }
    
    /**
     * Gets the "displayBackgroundShape" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDisplayBackgroundShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DISPLAYBACKGROUNDSHAPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "displayBackgroundShape" element
     */
    public boolean isSetDisplayBackgroundShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYBACKGROUNDSHAPE$12) != 0;
        }
    }
    
    /**
     * Sets the "displayBackgroundShape" element
     */
    public void setDisplayBackgroundShape(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff displayBackgroundShape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DISPLAYBACKGROUNDSHAPE$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DISPLAYBACKGROUNDSHAPE$12);
            }
            target.set(displayBackgroundShape);
        }
    }
    
    /**
     * Appends and returns a new empty "displayBackgroundShape" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDisplayBackgroundShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DISPLAYBACKGROUNDSHAPE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "displayBackgroundShape" element
     */
    public void unsetDisplayBackgroundShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYBACKGROUNDSHAPE$12, 0);
        }
    }
    
    /**
     * Gets the "printPostScriptOverText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPrintPostScriptOverText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTPOSTSCRIPTOVERTEXT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printPostScriptOverText" element
     */
    public boolean isSetPrintPostScriptOverText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTPOSTSCRIPTOVERTEXT$14) != 0;
        }
    }
    
    /**
     * Sets the "printPostScriptOverText" element
     */
    public void setPrintPostScriptOverText(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff printPostScriptOverText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTPOSTSCRIPTOVERTEXT$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTPOSTSCRIPTOVERTEXT$14);
            }
            target.set(printPostScriptOverText);
        }
    }
    
    /**
     * Appends and returns a new empty "printPostScriptOverText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPrintPostScriptOverText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTPOSTSCRIPTOVERTEXT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "printPostScriptOverText" element
     */
    public void unsetPrintPostScriptOverText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTPOSTSCRIPTOVERTEXT$14, 0);
        }
    }
    
    /**
     * Gets the "printFractionalCharacterWidth" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPrintFractionalCharacterWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTFRACTIONALCHARACTERWIDTH$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printFractionalCharacterWidth" element
     */
    public boolean isSetPrintFractionalCharacterWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTFRACTIONALCHARACTERWIDTH$16) != 0;
        }
    }
    
    /**
     * Sets the "printFractionalCharacterWidth" element
     */
    public void setPrintFractionalCharacterWidth(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff printFractionalCharacterWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTFRACTIONALCHARACTERWIDTH$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTFRACTIONALCHARACTERWIDTH$16);
            }
            target.set(printFractionalCharacterWidth);
        }
    }
    
    /**
     * Appends and returns a new empty "printFractionalCharacterWidth" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPrintFractionalCharacterWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTFRACTIONALCHARACTERWIDTH$16);
            return target;
        }
    }
    
    /**
     * Unsets the "printFractionalCharacterWidth" element
     */
    public void unsetPrintFractionalCharacterWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTFRACTIONALCHARACTERWIDTH$16, 0);
        }
    }
    
    /**
     * Gets the "printFormsData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPrintFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTFORMSDATA$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printFormsData" element
     */
    public boolean isSetPrintFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTFORMSDATA$18) != 0;
        }
    }
    
    /**
     * Sets the "printFormsData" element
     */
    public void setPrintFormsData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff printFormsData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTFORMSDATA$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTFORMSDATA$18);
            }
            target.set(printFormsData);
        }
    }
    
    /**
     * Appends and returns a new empty "printFormsData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPrintFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTFORMSDATA$18);
            return target;
        }
    }
    
    /**
     * Unsets the "printFormsData" element
     */
    public void unsetPrintFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTFORMSDATA$18, 0);
        }
    }
    
    /**
     * Gets the "embedTrueTypeFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EMBEDTRUETYPEFONTS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embedTrueTypeFonts" element
     */
    public boolean isSetEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDTRUETYPEFONTS$20) != 0;
        }
    }
    
    /**
     * Sets the "embedTrueTypeFonts" element
     */
    public void setEmbedTrueTypeFonts(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff embedTrueTypeFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EMBEDTRUETYPEFONTS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EMBEDTRUETYPEFONTS$20);
            }
            target.set(embedTrueTypeFonts);
        }
    }
    
    /**
     * Appends and returns a new empty "embedTrueTypeFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EMBEDTRUETYPEFONTS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "embedTrueTypeFonts" element
     */
    public void unsetEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDTRUETYPEFONTS$20, 0);
        }
    }
    
    /**
     * Gets the "embedSystemFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getEmbedSystemFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EMBEDSYSTEMFONTS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embedSystemFonts" element
     */
    public boolean isSetEmbedSystemFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDSYSTEMFONTS$22) != 0;
        }
    }
    
    /**
     * Sets the "embedSystemFonts" element
     */
    public void setEmbedSystemFonts(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff embedSystemFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EMBEDSYSTEMFONTS$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EMBEDSYSTEMFONTS$22);
            }
            target.set(embedSystemFonts);
        }
    }
    
    /**
     * Appends and returns a new empty "embedSystemFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewEmbedSystemFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EMBEDSYSTEMFONTS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "embedSystemFonts" element
     */
    public void unsetEmbedSystemFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDSYSTEMFONTS$22, 0);
        }
    }
    
    /**
     * Gets the "saveSubsetFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVESUBSETFONTS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveSubsetFonts" element
     */
    public boolean isSetSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVESUBSETFONTS$24) != 0;
        }
    }
    
    /**
     * Sets the "saveSubsetFonts" element
     */
    public void setSaveSubsetFonts(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff saveSubsetFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVESUBSETFONTS$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVESUBSETFONTS$24);
            }
            target.set(saveSubsetFonts);
        }
    }
    
    /**
     * Appends and returns a new empty "saveSubsetFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVESUBSETFONTS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "saveSubsetFonts" element
     */
    public void unsetSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVESUBSETFONTS$24, 0);
        }
    }
    
    /**
     * Gets the "saveFormsData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSaveFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEFORMSDATA$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveFormsData" element
     */
    public boolean isSetSaveFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEFORMSDATA$26) != 0;
        }
    }
    
    /**
     * Sets the "saveFormsData" element
     */
    public void setSaveFormsData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff saveFormsData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEFORMSDATA$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEFORMSDATA$26);
            }
            target.set(saveFormsData);
        }
    }
    
    /**
     * Appends and returns a new empty "saveFormsData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSaveFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEFORMSDATA$26);
            return target;
        }
    }
    
    /**
     * Unsets the "saveFormsData" element
     */
    public void unsetSaveFormsData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEFORMSDATA$26, 0);
        }
    }
    
    /**
     * Gets the "mirrorMargins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getMirrorMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(MIRRORMARGINS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mirrorMargins" element
     */
    public boolean isSetMirrorMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIRRORMARGINS$28) != 0;
        }
    }
    
    /**
     * Sets the "mirrorMargins" element
     */
    public void setMirrorMargins(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff mirrorMargins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(MIRRORMARGINS$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(MIRRORMARGINS$28);
            }
            target.set(mirrorMargins);
        }
    }
    
    /**
     * Appends and returns a new empty "mirrorMargins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewMirrorMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(MIRRORMARGINS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "mirrorMargins" element
     */
    public void unsetMirrorMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIRRORMARGINS$28, 0);
        }
    }
    
    /**
     * Gets the "alignBordersAndEdges" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAlignBordersAndEdges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALIGNBORDERSANDEDGES$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "alignBordersAndEdges" element
     */
    public boolean isSetAlignBordersAndEdges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIGNBORDERSANDEDGES$30) != 0;
        }
    }
    
    /**
     * Sets the "alignBordersAndEdges" element
     */
    public void setAlignBordersAndEdges(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff alignBordersAndEdges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALIGNBORDERSANDEDGES$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALIGNBORDERSANDEDGES$30);
            }
            target.set(alignBordersAndEdges);
        }
    }
    
    /**
     * Appends and returns a new empty "alignBordersAndEdges" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAlignBordersAndEdges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALIGNBORDERSANDEDGES$30);
            return target;
        }
    }
    
    /**
     * Unsets the "alignBordersAndEdges" element
     */
    public void unsetAlignBordersAndEdges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIGNBORDERSANDEDGES$30, 0);
        }
    }
    
    /**
     * Gets the "bordersDoNotSurroundHeader" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBordersDoNotSurroundHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BORDERSDONOTSURROUNDHEADER$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bordersDoNotSurroundHeader" element
     */
    public boolean isSetBordersDoNotSurroundHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERSDONOTSURROUNDHEADER$32) != 0;
        }
    }
    
    /**
     * Sets the "bordersDoNotSurroundHeader" element
     */
    public void setBordersDoNotSurroundHeader(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bordersDoNotSurroundHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BORDERSDONOTSURROUNDHEADER$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BORDERSDONOTSURROUNDHEADER$32);
            }
            target.set(bordersDoNotSurroundHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "bordersDoNotSurroundHeader" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBordersDoNotSurroundHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BORDERSDONOTSURROUNDHEADER$32);
            return target;
        }
    }
    
    /**
     * Unsets the "bordersDoNotSurroundHeader" element
     */
    public void unsetBordersDoNotSurroundHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERSDONOTSURROUNDHEADER$32, 0);
        }
    }
    
    /**
     * Gets the "bordersDoNotSurroundFooter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBordersDoNotSurroundFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BORDERSDONOTSURROUNDFOOTER$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bordersDoNotSurroundFooter" element
     */
    public boolean isSetBordersDoNotSurroundFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERSDONOTSURROUNDFOOTER$34) != 0;
        }
    }
    
    /**
     * Sets the "bordersDoNotSurroundFooter" element
     */
    public void setBordersDoNotSurroundFooter(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bordersDoNotSurroundFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BORDERSDONOTSURROUNDFOOTER$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BORDERSDONOTSURROUNDFOOTER$34);
            }
            target.set(bordersDoNotSurroundFooter);
        }
    }
    
    /**
     * Appends and returns a new empty "bordersDoNotSurroundFooter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBordersDoNotSurroundFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BORDERSDONOTSURROUNDFOOTER$34);
            return target;
        }
    }
    
    /**
     * Unsets the "bordersDoNotSurroundFooter" element
     */
    public void unsetBordersDoNotSurroundFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERSDONOTSURROUNDFOOTER$34, 0);
        }
    }
    
    /**
     * Gets the "gutterAtTop" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getGutterAtTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(GUTTERATTOP$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gutterAtTop" element
     */
    public boolean isSetGutterAtTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUTTERATTOP$36) != 0;
        }
    }
    
    /**
     * Sets the "gutterAtTop" element
     */
    public void setGutterAtTop(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff gutterAtTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(GUTTERATTOP$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(GUTTERATTOP$36);
            }
            target.set(gutterAtTop);
        }
    }
    
    /**
     * Appends and returns a new empty "gutterAtTop" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewGutterAtTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(GUTTERATTOP$36);
            return target;
        }
    }
    
    /**
     * Unsets the "gutterAtTop" element
     */
    public void unsetGutterAtTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUTTERATTOP$36, 0);
        }
    }
    
    /**
     * Gets the "hideSpellingErrors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getHideSpellingErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDESPELLINGERRORS$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideSpellingErrors" element
     */
    public boolean isSetHideSpellingErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDESPELLINGERRORS$38) != 0;
        }
    }
    
    /**
     * Sets the "hideSpellingErrors" element
     */
    public void setHideSpellingErrors(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff hideSpellingErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDESPELLINGERRORS$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDESPELLINGERRORS$38);
            }
            target.set(hideSpellingErrors);
        }
    }
    
    /**
     * Appends and returns a new empty "hideSpellingErrors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewHideSpellingErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDESPELLINGERRORS$38);
            return target;
        }
    }
    
    /**
     * Unsets the "hideSpellingErrors" element
     */
    public void unsetHideSpellingErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDESPELLINGERRORS$38, 0);
        }
    }
    
    /**
     * Gets the "hideGrammaticalErrors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getHideGrammaticalErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDEGRAMMATICALERRORS$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideGrammaticalErrors" element
     */
    public boolean isSetHideGrammaticalErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDEGRAMMATICALERRORS$40) != 0;
        }
    }
    
    /**
     * Sets the "hideGrammaticalErrors" element
     */
    public void setHideGrammaticalErrors(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff hideGrammaticalErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDEGRAMMATICALERRORS$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDEGRAMMATICALERRORS$40);
            }
            target.set(hideGrammaticalErrors);
        }
    }
    
    /**
     * Appends and returns a new empty "hideGrammaticalErrors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewHideGrammaticalErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDEGRAMMATICALERRORS$40);
            return target;
        }
    }
    
    /**
     * Unsets the "hideGrammaticalErrors" element
     */
    public void unsetHideGrammaticalErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDEGRAMMATICALERRORS$40, 0);
        }
    }
    
    /**
     * Gets a List of "activeWritingStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle> getActiveWritingStyleList()
    {
        final class ActiveWritingStyleList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle get(int i)
                { return CTSettingsImpl.this.getActiveWritingStyleArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle old = CTSettingsImpl.this.getActiveWritingStyleArray(i);
                CTSettingsImpl.this.setActiveWritingStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle o)
                { CTSettingsImpl.this.insertNewActiveWritingStyle(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle old = CTSettingsImpl.this.getActiveWritingStyleArray(i);
                CTSettingsImpl.this.removeActiveWritingStyle(i);
                return old;
            }
            
            public int size()
                { return CTSettingsImpl.this.sizeOfActiveWritingStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ActiveWritingStyleList();
        }
    }
    
    /**
     * Gets array of all "activeWritingStyle" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle[] getActiveWritingStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVEWRITINGSTYLE$42, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activeWritingStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle getActiveWritingStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle)get_store().find_element_user(ACTIVEWRITINGSTYLE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activeWritingStyle" element
     */
    public int sizeOfActiveWritingStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVEWRITINGSTYLE$42);
        }
    }
    
    /**
     * Sets array of all "activeWritingStyle" element
     */
    public void setActiveWritingStyleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle[] activeWritingStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activeWritingStyleArray, ACTIVEWRITINGSTYLE$42);
        }
    }
    
    /**
     * Sets ith "activeWritingStyle" element
     */
    public void setActiveWritingStyleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle activeWritingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle)get_store().find_element_user(ACTIVEWRITINGSTYLE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activeWritingStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activeWritingStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle insertNewActiveWritingStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle)get_store().insert_element_user(ACTIVEWRITINGSTYLE$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activeWritingStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle addNewActiveWritingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle)get_store().add_element_user(ACTIVEWRITINGSTYLE$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "activeWritingStyle" element
     */
    public void removeActiveWritingStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVEWRITINGSTYLE$42, i);
        }
    }
    
    /**
     * Gets the "proofState" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof getProofState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof)get_store().find_element_user(PROOFSTATE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "proofState" element
     */
    public boolean isSetProofState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROOFSTATE$44) != 0;
        }
    }
    
    /**
     * Sets the "proofState" element
     */
    public void setProofState(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof proofState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof)get_store().find_element_user(PROOFSTATE$44, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof)get_store().add_element_user(PROOFSTATE$44);
            }
            target.set(proofState);
        }
    }
    
    /**
     * Appends and returns a new empty "proofState" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof addNewProofState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof)get_store().add_element_user(PROOFSTATE$44);
            return target;
        }
    }
    
    /**
     * Unsets the "proofState" element
     */
    public void unsetProofState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROOFSTATE$44, 0);
        }
    }
    
    /**
     * Gets the "formsDesign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getFormsDesign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FORMSDESIGN$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formsDesign" element
     */
    public boolean isSetFormsDesign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMSDESIGN$46) != 0;
        }
    }
    
    /**
     * Sets the "formsDesign" element
     */
    public void setFormsDesign(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff formsDesign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FORMSDESIGN$46, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FORMSDESIGN$46);
            }
            target.set(formsDesign);
        }
    }
    
    /**
     * Appends and returns a new empty "formsDesign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewFormsDesign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FORMSDESIGN$46);
            return target;
        }
    }
    
    /**
     * Unsets the "formsDesign" element
     */
    public void unsetFormsDesign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMSDESIGN$46, 0);
        }
    }
    
    /**
     * Gets the "attachedTemplate" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getAttachedTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(ATTACHEDTEMPLATE$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attachedTemplate" element
     */
    public boolean isSetAttachedTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHEDTEMPLATE$48) != 0;
        }
    }
    
    /**
     * Sets the "attachedTemplate" element
     */
    public void setAttachedTemplate(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel attachedTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(ATTACHEDTEMPLATE$48, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(ATTACHEDTEMPLATE$48);
            }
            target.set(attachedTemplate);
        }
    }
    
    /**
     * Appends and returns a new empty "attachedTemplate" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewAttachedTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(ATTACHEDTEMPLATE$48);
            return target;
        }
    }
    
    /**
     * Unsets the "attachedTemplate" element
     */
    public void unsetAttachedTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHEDTEMPLATE$48, 0);
        }
    }
    
    /**
     * Gets the "linkStyles" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getLinkStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LINKSTYLES$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "linkStyles" element
     */
    public boolean isSetLinkStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKSTYLES$50) != 0;
        }
    }
    
    /**
     * Sets the "linkStyles" element
     */
    public void setLinkStyles(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff linkStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LINKSTYLES$50, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LINKSTYLES$50);
            }
            target.set(linkStyles);
        }
    }
    
    /**
     * Appends and returns a new empty "linkStyles" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewLinkStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LINKSTYLES$50);
            return target;
        }
    }
    
    /**
     * Unsets the "linkStyles" element
     */
    public void unsetLinkStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKSTYLES$50, 0);
        }
    }
    
    /**
     * Gets the "stylePaneFormatFilter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber getStylePaneFormatFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(STYLEPANEFORMATFILTER$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stylePaneFormatFilter" element
     */
    public boolean isSetStylePaneFormatFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLEPANEFORMATFILTER$52) != 0;
        }
    }
    
    /**
     * Sets the "stylePaneFormatFilter" element
     */
    public void setStylePaneFormatFilter(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber stylePaneFormatFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(STYLEPANEFORMATFILTER$52, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(STYLEPANEFORMATFILTER$52);
            }
            target.set(stylePaneFormatFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "stylePaneFormatFilter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber addNewStylePaneFormatFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(STYLEPANEFORMATFILTER$52);
            return target;
        }
    }
    
    /**
     * Unsets the "stylePaneFormatFilter" element
     */
    public void unsetStylePaneFormatFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLEPANEFORMATFILTER$52, 0);
        }
    }
    
    /**
     * Gets the "stylePaneSortMethod" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber getStylePaneSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(STYLEPANESORTMETHOD$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stylePaneSortMethod" element
     */
    public boolean isSetStylePaneSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLEPANESORTMETHOD$54) != 0;
        }
    }
    
    /**
     * Sets the "stylePaneSortMethod" element
     */
    public void setStylePaneSortMethod(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber stylePaneSortMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(STYLEPANESORTMETHOD$54, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(STYLEPANESORTMETHOD$54);
            }
            target.set(stylePaneSortMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "stylePaneSortMethod" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber addNewStylePaneSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(STYLEPANESORTMETHOD$54);
            return target;
        }
    }
    
    /**
     * Unsets the "stylePaneSortMethod" element
     */
    public void unsetStylePaneSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLEPANESORTMETHOD$54, 0);
        }
    }
    
    /**
     * Gets the "documentType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType getDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType)get_store().find_element_user(DOCUMENTTYPE$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentType" element
     */
    public boolean isSetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTTYPE$56) != 0;
        }
    }
    
    /**
     * Sets the "documentType" element
     */
    public void setDocumentType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType)get_store().find_element_user(DOCUMENTTYPE$56, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType)get_store().add_element_user(DOCUMENTTYPE$56);
            }
            target.set(documentType);
        }
    }
    
    /**
     * Appends and returns a new empty "documentType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType addNewDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType)get_store().add_element_user(DOCUMENTTYPE$56);
            return target;
        }
    }
    
    /**
     * Unsets the "documentType" element
     */
    public void unsetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTTYPE$56, 0);
        }
    }
    
    /**
     * Gets the "mailMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge getMailMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge)get_store().find_element_user(MAILMERGE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mailMerge" element
     */
    public boolean isSetMailMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAILMERGE$58) != 0;
        }
    }
    
    /**
     * Sets the "mailMerge" element
     */
    public void setMailMerge(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge mailMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge)get_store().find_element_user(MAILMERGE$58, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge)get_store().add_element_user(MAILMERGE$58);
            }
            target.set(mailMerge);
        }
    }
    
    /**
     * Appends and returns a new empty "mailMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge addNewMailMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge)get_store().add_element_user(MAILMERGE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "mailMerge" element
     */
    public void unsetMailMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAILMERGE$58, 0);
        }
    }
    
    /**
     * Gets the "revisionView" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView getRevisionView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView)get_store().find_element_user(REVISIONVIEW$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "revisionView" element
     */
    public boolean isSetRevisionView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVISIONVIEW$60) != 0;
        }
    }
    
    /**
     * Sets the "revisionView" element
     */
    public void setRevisionView(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView revisionView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView)get_store().find_element_user(REVISIONVIEW$60, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView)get_store().add_element_user(REVISIONVIEW$60);
            }
            target.set(revisionView);
        }
    }
    
    /**
     * Appends and returns a new empty "revisionView" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView addNewRevisionView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView)get_store().add_element_user(REVISIONVIEW$60);
            return target;
        }
    }
    
    /**
     * Unsets the "revisionView" element
     */
    public void unsetRevisionView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVISIONVIEW$60, 0);
        }
    }
    
    /**
     * Gets the "trackRevisions" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TRACKREVISIONS$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trackRevisions" element
     */
    public boolean isSetTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKREVISIONS$62) != 0;
        }
    }
    
    /**
     * Sets the "trackRevisions" element
     */
    public void setTrackRevisions(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff trackRevisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TRACKREVISIONS$62, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TRACKREVISIONS$62);
            }
            target.set(trackRevisions);
        }
    }
    
    /**
     * Appends and returns a new empty "trackRevisions" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TRACKREVISIONS$62);
            return target;
        }
    }
    
    /**
     * Unsets the "trackRevisions" element
     */
    public void unsetTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKREVISIONS$62, 0);
        }
    }
    
    /**
     * Gets the "doNotTrackMoves" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotTrackMoves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTTRACKMOVES$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotTrackMoves" element
     */
    public boolean isSetDoNotTrackMoves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTTRACKMOVES$64) != 0;
        }
    }
    
    /**
     * Sets the "doNotTrackMoves" element
     */
    public void setDoNotTrackMoves(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotTrackMoves)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTTRACKMOVES$64, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTTRACKMOVES$64);
            }
            target.set(doNotTrackMoves);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotTrackMoves" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotTrackMoves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTTRACKMOVES$64);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotTrackMoves" element
     */
    public void unsetDoNotTrackMoves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTTRACKMOVES$64, 0);
        }
    }
    
    /**
     * Gets the "doNotTrackFormatting" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotTrackFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTTRACKFORMATTING$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotTrackFormatting" element
     */
    public boolean isSetDoNotTrackFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTTRACKFORMATTING$66) != 0;
        }
    }
    
    /**
     * Sets the "doNotTrackFormatting" element
     */
    public void setDoNotTrackFormatting(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotTrackFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTTRACKFORMATTING$66, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTTRACKFORMATTING$66);
            }
            target.set(doNotTrackFormatting);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotTrackFormatting" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotTrackFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTTRACKFORMATTING$66);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotTrackFormatting" element
     */
    public void unsetDoNotTrackFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTTRACKFORMATTING$66, 0);
        }
    }
    
    /**
     * Gets the "documentProtection" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect getDocumentProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect)get_store().find_element_user(DOCUMENTPROTECTION$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentProtection" element
     */
    public boolean isSetDocumentProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTPROTECTION$68) != 0;
        }
    }
    
    /**
     * Sets the "documentProtection" element
     */
    public void setDocumentProtection(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect documentProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect)get_store().find_element_user(DOCUMENTPROTECTION$68, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect)get_store().add_element_user(DOCUMENTPROTECTION$68);
            }
            target.set(documentProtection);
        }
    }
    
    /**
     * Appends and returns a new empty "documentProtection" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect addNewDocumentProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect)get_store().add_element_user(DOCUMENTPROTECTION$68);
            return target;
        }
    }
    
    /**
     * Unsets the "documentProtection" element
     */
    public void unsetDocumentProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTPROTECTION$68, 0);
        }
    }
    
    /**
     * Gets the "autoFormatOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAutoFormatOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(AUTOFORMATOVERRIDE$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoFormatOverride" element
     */
    public boolean isSetAutoFormatOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOFORMATOVERRIDE$70) != 0;
        }
    }
    
    /**
     * Sets the "autoFormatOverride" element
     */
    public void setAutoFormatOverride(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff autoFormatOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(AUTOFORMATOVERRIDE$70, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(AUTOFORMATOVERRIDE$70);
            }
            target.set(autoFormatOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "autoFormatOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAutoFormatOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(AUTOFORMATOVERRIDE$70);
            return target;
        }
    }
    
    /**
     * Unsets the "autoFormatOverride" element
     */
    public void unsetAutoFormatOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOFORMATOVERRIDE$70, 0);
        }
    }
    
    /**
     * Gets the "styleLockTheme" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getStyleLockTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STYLELOCKTHEME$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "styleLockTheme" element
     */
    public boolean isSetStyleLockTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLELOCKTHEME$72) != 0;
        }
    }
    
    /**
     * Sets the "styleLockTheme" element
     */
    public void setStyleLockTheme(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff styleLockTheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STYLELOCKTHEME$72, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STYLELOCKTHEME$72);
            }
            target.set(styleLockTheme);
        }
    }
    
    /**
     * Appends and returns a new empty "styleLockTheme" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewStyleLockTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STYLELOCKTHEME$72);
            return target;
        }
    }
    
    /**
     * Unsets the "styleLockTheme" element
     */
    public void unsetStyleLockTheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLELOCKTHEME$72, 0);
        }
    }
    
    /**
     * Gets the "styleLockQFSet" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getStyleLockQFSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STYLELOCKQFSET$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "styleLockQFSet" element
     */
    public boolean isSetStyleLockQFSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLELOCKQFSET$74) != 0;
        }
    }
    
    /**
     * Sets the "styleLockQFSet" element
     */
    public void setStyleLockQFSet(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff styleLockQFSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STYLELOCKQFSET$74, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STYLELOCKQFSET$74);
            }
            target.set(styleLockQFSet);
        }
    }
    
    /**
     * Appends and returns a new empty "styleLockQFSet" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewStyleLockQFSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STYLELOCKQFSET$74);
            return target;
        }
    }
    
    /**
     * Unsets the "styleLockQFSet" element
     */
    public void unsetStyleLockQFSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLELOCKQFSET$74, 0);
        }
    }
    
    /**
     * Gets the "defaultTabStop" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getDefaultTabStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DEFAULTTABSTOP$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultTabStop" element
     */
    public boolean isSetDefaultTabStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTTABSTOP$76) != 0;
        }
    }
    
    /**
     * Sets the "defaultTabStop" element
     */
    public void setDefaultTabStop(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure defaultTabStop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DEFAULTTABSTOP$76, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DEFAULTTABSTOP$76);
            }
            target.set(defaultTabStop);
        }
    }
    
    /**
     * Appends and returns a new empty "defaultTabStop" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewDefaultTabStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DEFAULTTABSTOP$76);
            return target;
        }
    }
    
    /**
     * Unsets the "defaultTabStop" element
     */
    public void unsetDefaultTabStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTTABSTOP$76, 0);
        }
    }
    
    /**
     * Gets the "autoHyphenation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAutoHyphenation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(AUTOHYPHENATION$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoHyphenation" element
     */
    public boolean isSetAutoHyphenation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOHYPHENATION$78) != 0;
        }
    }
    
    /**
     * Sets the "autoHyphenation" element
     */
    public void setAutoHyphenation(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff autoHyphenation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(AUTOHYPHENATION$78, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(AUTOHYPHENATION$78);
            }
            target.set(autoHyphenation);
        }
    }
    
    /**
     * Appends and returns a new empty "autoHyphenation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAutoHyphenation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(AUTOHYPHENATION$78);
            return target;
        }
    }
    
    /**
     * Unsets the "autoHyphenation" element
     */
    public void unsetAutoHyphenation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOHYPHENATION$78, 0);
        }
    }
    
    /**
     * Gets the "consecutiveHyphenLimit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getConsecutiveHyphenLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(CONSECUTIVEHYPHENLIMIT$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "consecutiveHyphenLimit" element
     */
    public boolean isSetConsecutiveHyphenLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSECUTIVEHYPHENLIMIT$80) != 0;
        }
    }
    
    /**
     * Sets the "consecutiveHyphenLimit" element
     */
    public void setConsecutiveHyphenLimit(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber consecutiveHyphenLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(CONSECUTIVEHYPHENLIMIT$80, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(CONSECUTIVEHYPHENLIMIT$80);
            }
            target.set(consecutiveHyphenLimit);
        }
    }
    
    /**
     * Appends and returns a new empty "consecutiveHyphenLimit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewConsecutiveHyphenLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(CONSECUTIVEHYPHENLIMIT$80);
            return target;
        }
    }
    
    /**
     * Unsets the "consecutiveHyphenLimit" element
     */
    public void unsetConsecutiveHyphenLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSECUTIVEHYPHENLIMIT$80, 0);
        }
    }
    
    /**
     * Gets the "hyphenationZone" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getHyphenationZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(HYPHENATIONZONE$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hyphenationZone" element
     */
    public boolean isSetHyphenationZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPHENATIONZONE$82) != 0;
        }
    }
    
    /**
     * Sets the "hyphenationZone" element
     */
    public void setHyphenationZone(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure hyphenationZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(HYPHENATIONZONE$82, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(HYPHENATIONZONE$82);
            }
            target.set(hyphenationZone);
        }
    }
    
    /**
     * Appends and returns a new empty "hyphenationZone" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewHyphenationZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(HYPHENATIONZONE$82);
            return target;
        }
    }
    
    /**
     * Unsets the "hyphenationZone" element
     */
    public void unsetHyphenationZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPHENATIONZONE$82, 0);
        }
    }
    
    /**
     * Gets the "doNotHyphenateCaps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotHyphenateCaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTHYPHENATECAPS$84, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotHyphenateCaps" element
     */
    public boolean isSetDoNotHyphenateCaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTHYPHENATECAPS$84) != 0;
        }
    }
    
    /**
     * Sets the "doNotHyphenateCaps" element
     */
    public void setDoNotHyphenateCaps(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotHyphenateCaps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTHYPHENATECAPS$84, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTHYPHENATECAPS$84);
            }
            target.set(doNotHyphenateCaps);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotHyphenateCaps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotHyphenateCaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTHYPHENATECAPS$84);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotHyphenateCaps" element
     */
    public void unsetDoNotHyphenateCaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTHYPHENATECAPS$84, 0);
        }
    }
    
    /**
     * Gets the "showEnvelope" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getShowEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHOWENVELOPE$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showEnvelope" element
     */
    public boolean isSetShowEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWENVELOPE$86) != 0;
        }
    }
    
    /**
     * Sets the "showEnvelope" element
     */
    public void setShowEnvelope(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff showEnvelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHOWENVELOPE$86, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SHOWENVELOPE$86);
            }
            target.set(showEnvelope);
        }
    }
    
    /**
     * Appends and returns a new empty "showEnvelope" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewShowEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SHOWENVELOPE$86);
            return target;
        }
    }
    
    /**
     * Unsets the "showEnvelope" element
     */
    public void unsetShowEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWENVELOPE$86, 0);
        }
    }
    
    /**
     * Gets the "summaryLength" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getSummaryLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(SUMMARYLENGTH$88, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "summaryLength" element
     */
    public boolean isSetSummaryLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUMMARYLENGTH$88) != 0;
        }
    }
    
    /**
     * Sets the "summaryLength" element
     */
    public void setSummaryLength(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber summaryLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(SUMMARYLENGTH$88, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(SUMMARYLENGTH$88);
            }
            target.set(summaryLength);
        }
    }
    
    /**
     * Appends and returns a new empty "summaryLength" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewSummaryLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(SUMMARYLENGTH$88);
            return target;
        }
    }
    
    /**
     * Unsets the "summaryLength" element
     */
    public void unsetSummaryLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUMMARYLENGTH$88, 0);
        }
    }
    
    /**
     * Gets the "clickAndTypeStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getClickAndTypeStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(CLICKANDTYPESTYLE$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clickAndTypeStyle" element
     */
    public boolean isSetClickAndTypeStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLICKANDTYPESTYLE$90) != 0;
        }
    }
    
    /**
     * Sets the "clickAndTypeStyle" element
     */
    public void setClickAndTypeStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString clickAndTypeStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(CLICKANDTYPESTYLE$90, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(CLICKANDTYPESTYLE$90);
            }
            target.set(clickAndTypeStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "clickAndTypeStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewClickAndTypeStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(CLICKANDTYPESTYLE$90);
            return target;
        }
    }
    
    /**
     * Unsets the "clickAndTypeStyle" element
     */
    public void unsetClickAndTypeStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLICKANDTYPESTYLE$90, 0);
        }
    }
    
    /**
     * Gets the "defaultTableStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DEFAULTTABLESTYLE$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultTableStyle" element
     */
    public boolean isSetDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTTABLESTYLE$92) != 0;
        }
    }
    
    /**
     * Sets the "defaultTableStyle" element
     */
    public void setDefaultTableStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString defaultTableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DEFAULTTABLESTYLE$92, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DEFAULTTABLESTYLE$92);
            }
            target.set(defaultTableStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "defaultTableStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DEFAULTTABLESTYLE$92);
            return target;
        }
    }
    
    /**
     * Unsets the "defaultTableStyle" element
     */
    public void unsetDefaultTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTTABLESTYLE$92, 0);
        }
    }
    
    /**
     * Gets the "evenAndOddHeaders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getEvenAndOddHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EVENANDODDHEADERS$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "evenAndOddHeaders" element
     */
    public boolean isSetEvenAndOddHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENANDODDHEADERS$94) != 0;
        }
    }
    
    /**
     * Sets the "evenAndOddHeaders" element
     */
    public void setEvenAndOddHeaders(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff evenAndOddHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EVENANDODDHEADERS$94, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EVENANDODDHEADERS$94);
            }
            target.set(evenAndOddHeaders);
        }
    }
    
    /**
     * Appends and returns a new empty "evenAndOddHeaders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewEvenAndOddHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EVENANDODDHEADERS$94);
            return target;
        }
    }
    
    /**
     * Unsets the "evenAndOddHeaders" element
     */
    public void unsetEvenAndOddHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENANDODDHEADERS$94, 0);
        }
    }
    
    /**
     * Gets the "bookFoldRevPrinting" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBookFoldRevPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BOOKFOLDREVPRINTING$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bookFoldRevPrinting" element
     */
    public boolean isSetBookFoldRevPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKFOLDREVPRINTING$96) != 0;
        }
    }
    
    /**
     * Sets the "bookFoldRevPrinting" element
     */
    public void setBookFoldRevPrinting(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bookFoldRevPrinting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BOOKFOLDREVPRINTING$96, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BOOKFOLDREVPRINTING$96);
            }
            target.set(bookFoldRevPrinting);
        }
    }
    
    /**
     * Appends and returns a new empty "bookFoldRevPrinting" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBookFoldRevPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BOOKFOLDREVPRINTING$96);
            return target;
        }
    }
    
    /**
     * Unsets the "bookFoldRevPrinting" element
     */
    public void unsetBookFoldRevPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKFOLDREVPRINTING$96, 0);
        }
    }
    
    /**
     * Gets the "bookFoldPrinting" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBookFoldPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BOOKFOLDPRINTING$98, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bookFoldPrinting" element
     */
    public boolean isSetBookFoldPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKFOLDPRINTING$98) != 0;
        }
    }
    
    /**
     * Sets the "bookFoldPrinting" element
     */
    public void setBookFoldPrinting(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bookFoldPrinting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BOOKFOLDPRINTING$98, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BOOKFOLDPRINTING$98);
            }
            target.set(bookFoldPrinting);
        }
    }
    
    /**
     * Appends and returns a new empty "bookFoldPrinting" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBookFoldPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BOOKFOLDPRINTING$98);
            return target;
        }
    }
    
    /**
     * Unsets the "bookFoldPrinting" element
     */
    public void unsetBookFoldPrinting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKFOLDPRINTING$98, 0);
        }
    }
    
    /**
     * Gets the "bookFoldPrintingSheets" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getBookFoldPrintingSheets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(BOOKFOLDPRINTINGSHEETS$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bookFoldPrintingSheets" element
     */
    public boolean isSetBookFoldPrintingSheets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKFOLDPRINTINGSHEETS$100) != 0;
        }
    }
    
    /**
     * Sets the "bookFoldPrintingSheets" element
     */
    public void setBookFoldPrintingSheets(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber bookFoldPrintingSheets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(BOOKFOLDPRINTINGSHEETS$100, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(BOOKFOLDPRINTINGSHEETS$100);
            }
            target.set(bookFoldPrintingSheets);
        }
    }
    
    /**
     * Appends and returns a new empty "bookFoldPrintingSheets" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewBookFoldPrintingSheets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(BOOKFOLDPRINTINGSHEETS$100);
            return target;
        }
    }
    
    /**
     * Unsets the "bookFoldPrintingSheets" element
     */
    public void unsetBookFoldPrintingSheets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKFOLDPRINTINGSHEETS$100, 0);
        }
    }
    
    /**
     * Gets the "drawingGridHorizontalSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getDrawingGridHorizontalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDHORIZONTALSPACING$102, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "drawingGridHorizontalSpacing" element
     */
    public boolean isSetDrawingGridHorizontalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWINGGRIDHORIZONTALSPACING$102) != 0;
        }
    }
    
    /**
     * Sets the "drawingGridHorizontalSpacing" element
     */
    public void setDrawingGridHorizontalSpacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure drawingGridHorizontalSpacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDHORIZONTALSPACING$102, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDHORIZONTALSPACING$102);
            }
            target.set(drawingGridHorizontalSpacing);
        }
    }
    
    /**
     * Appends and returns a new empty "drawingGridHorizontalSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewDrawingGridHorizontalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDHORIZONTALSPACING$102);
            return target;
        }
    }
    
    /**
     * Unsets the "drawingGridHorizontalSpacing" element
     */
    public void unsetDrawingGridHorizontalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWINGGRIDHORIZONTALSPACING$102, 0);
        }
    }
    
    /**
     * Gets the "drawingGridVerticalSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getDrawingGridVerticalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDVERTICALSPACING$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "drawingGridVerticalSpacing" element
     */
    public boolean isSetDrawingGridVerticalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWINGGRIDVERTICALSPACING$104) != 0;
        }
    }
    
    /**
     * Sets the "drawingGridVerticalSpacing" element
     */
    public void setDrawingGridVerticalSpacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure drawingGridVerticalSpacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDVERTICALSPACING$104, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDVERTICALSPACING$104);
            }
            target.set(drawingGridVerticalSpacing);
        }
    }
    
    /**
     * Appends and returns a new empty "drawingGridVerticalSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewDrawingGridVerticalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDVERTICALSPACING$104);
            return target;
        }
    }
    
    /**
     * Unsets the "drawingGridVerticalSpacing" element
     */
    public void unsetDrawingGridVerticalSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWINGGRIDVERTICALSPACING$104, 0);
        }
    }
    
    /**
     * Gets the "displayHorizontalDrawingGridEvery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getDisplayHorizontalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "displayHorizontalDrawingGridEvery" element
     */
    public boolean isSetDisplayHorizontalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106) != 0;
        }
    }
    
    /**
     * Sets the "displayHorizontalDrawingGridEvery" element
     */
    public void setDisplayHorizontalDrawingGridEvery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber displayHorizontalDrawingGridEvery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106);
            }
            target.set(displayHorizontalDrawingGridEvery);
        }
    }
    
    /**
     * Appends and returns a new empty "displayHorizontalDrawingGridEvery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewDisplayHorizontalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106);
            return target;
        }
    }
    
    /**
     * Unsets the "displayHorizontalDrawingGridEvery" element
     */
    public void unsetDisplayHorizontalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106, 0);
        }
    }
    
    /**
     * Gets the "displayVerticalDrawingGridEvery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getDisplayVerticalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "displayVerticalDrawingGridEvery" element
     */
    public boolean isSetDisplayVerticalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYVERTICALDRAWINGGRIDEVERY$108) != 0;
        }
    }
    
    /**
     * Sets the "displayVerticalDrawingGridEvery" element
     */
    public void setDisplayVerticalDrawingGridEvery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber displayVerticalDrawingGridEvery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108);
            }
            target.set(displayVerticalDrawingGridEvery);
        }
    }
    
    /**
     * Appends and returns a new empty "displayVerticalDrawingGridEvery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewDisplayVerticalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108);
            return target;
        }
    }
    
    /**
     * Unsets the "displayVerticalDrawingGridEvery" element
     */
    public void unsetDisplayVerticalDrawingGridEvery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYVERTICALDRAWINGGRIDEVERY$108, 0);
        }
    }
    
    /**
     * Gets the "doNotUseMarginsForDrawingGridOrigin" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotUseMarginsForDrawingGridOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotUseMarginsForDrawingGridOrigin" element
     */
    public boolean isSetDoNotUseMarginsForDrawingGridOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110) != 0;
        }
    }
    
    /**
     * Sets the "doNotUseMarginsForDrawingGridOrigin" element
     */
    public void setDoNotUseMarginsForDrawingGridOrigin(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotUseMarginsForDrawingGridOrigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110);
            }
            target.set(doNotUseMarginsForDrawingGridOrigin);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotUseMarginsForDrawingGridOrigin" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotUseMarginsForDrawingGridOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotUseMarginsForDrawingGridOrigin" element
     */
    public void unsetDoNotUseMarginsForDrawingGridOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110, 0);
        }
    }
    
    /**
     * Gets the "drawingGridHorizontalOrigin" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getDrawingGridHorizontalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDHORIZONTALORIGIN$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "drawingGridHorizontalOrigin" element
     */
    public boolean isSetDrawingGridHorizontalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWINGGRIDHORIZONTALORIGIN$112) != 0;
        }
    }
    
    /**
     * Sets the "drawingGridHorizontalOrigin" element
     */
    public void setDrawingGridHorizontalOrigin(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure drawingGridHorizontalOrigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDHORIZONTALORIGIN$112, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDHORIZONTALORIGIN$112);
            }
            target.set(drawingGridHorizontalOrigin);
        }
    }
    
    /**
     * Appends and returns a new empty "drawingGridHorizontalOrigin" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewDrawingGridHorizontalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDHORIZONTALORIGIN$112);
            return target;
        }
    }
    
    /**
     * Unsets the "drawingGridHorizontalOrigin" element
     */
    public void unsetDrawingGridHorizontalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWINGGRIDHORIZONTALORIGIN$112, 0);
        }
    }
    
    /**
     * Gets the "drawingGridVerticalOrigin" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getDrawingGridVerticalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDVERTICALORIGIN$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "drawingGridVerticalOrigin" element
     */
    public boolean isSetDrawingGridVerticalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWINGGRIDVERTICALORIGIN$114) != 0;
        }
    }
    
    /**
     * Sets the "drawingGridVerticalOrigin" element
     */
    public void setDrawingGridVerticalOrigin(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure drawingGridVerticalOrigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(DRAWINGGRIDVERTICALORIGIN$114, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDVERTICALORIGIN$114);
            }
            target.set(drawingGridVerticalOrigin);
        }
    }
    
    /**
     * Appends and returns a new empty "drawingGridVerticalOrigin" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewDrawingGridVerticalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(DRAWINGGRIDVERTICALORIGIN$114);
            return target;
        }
    }
    
    /**
     * Unsets the "drawingGridVerticalOrigin" element
     */
    public void unsetDrawingGridVerticalOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWINGGRIDVERTICALORIGIN$114, 0);
        }
    }
    
    /**
     * Gets the "doNotShadeFormData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotShadeFormData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTSHADEFORMDATA$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotShadeFormData" element
     */
    public boolean isSetDoNotShadeFormData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTSHADEFORMDATA$116) != 0;
        }
    }
    
    /**
     * Sets the "doNotShadeFormData" element
     */
    public void setDoNotShadeFormData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotShadeFormData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTSHADEFORMDATA$116, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTSHADEFORMDATA$116);
            }
            target.set(doNotShadeFormData);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotShadeFormData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotShadeFormData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTSHADEFORMDATA$116);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotShadeFormData" element
     */
    public void unsetDoNotShadeFormData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTSHADEFORMDATA$116, 0);
        }
    }
    
    /**
     * Gets the "noPunctuationKerning" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNoPunctuationKerning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOPUNCTUATIONKERNING$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noPunctuationKerning" element
     */
    public boolean isSetNoPunctuationKerning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOPUNCTUATIONKERNING$118) != 0;
        }
    }
    
    /**
     * Sets the "noPunctuationKerning" element
     */
    public void setNoPunctuationKerning(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff noPunctuationKerning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOPUNCTUATIONKERNING$118, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOPUNCTUATIONKERNING$118);
            }
            target.set(noPunctuationKerning);
        }
    }
    
    /**
     * Appends and returns a new empty "noPunctuationKerning" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNoPunctuationKerning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOPUNCTUATIONKERNING$118);
            return target;
        }
    }
    
    /**
     * Unsets the "noPunctuationKerning" element
     */
    public void unsetNoPunctuationKerning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOPUNCTUATIONKERNING$118, 0);
        }
    }
    
    /**
     * Gets the "characterSpacingControl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing getCharacterSpacingControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing)get_store().find_element_user(CHARACTERSPACINGCONTROL$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "characterSpacingControl" element
     */
    public boolean isSetCharacterSpacingControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERSPACINGCONTROL$120) != 0;
        }
    }
    
    /**
     * Sets the "characterSpacingControl" element
     */
    public void setCharacterSpacingControl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing characterSpacingControl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing)get_store().find_element_user(CHARACTERSPACINGCONTROL$120, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing)get_store().add_element_user(CHARACTERSPACINGCONTROL$120);
            }
            target.set(characterSpacingControl);
        }
    }
    
    /**
     * Appends and returns a new empty "characterSpacingControl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing addNewCharacterSpacingControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing)get_store().add_element_user(CHARACTERSPACINGCONTROL$120);
            return target;
        }
    }
    
    /**
     * Unsets the "characterSpacingControl" element
     */
    public void unsetCharacterSpacingControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERSPACINGCONTROL$120, 0);
        }
    }
    
    /**
     * Gets the "printTwoOnOne" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPrintTwoOnOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTTWOONONE$122, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printTwoOnOne" element
     */
    public boolean isSetPrintTwoOnOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTTWOONONE$122) != 0;
        }
    }
    
    /**
     * Sets the "printTwoOnOne" element
     */
    public void setPrintTwoOnOne(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff printTwoOnOne)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PRINTTWOONONE$122, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTTWOONONE$122);
            }
            target.set(printTwoOnOne);
        }
    }
    
    /**
     * Appends and returns a new empty "printTwoOnOne" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPrintTwoOnOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PRINTTWOONONE$122);
            return target;
        }
    }
    
    /**
     * Unsets the "printTwoOnOne" element
     */
    public void unsetPrintTwoOnOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTTWOONONE$122, 0);
        }
    }
    
    /**
     * Gets the "strictFirstAndLastChars" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STRICTFIRSTANDLASTCHARS$124, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strictFirstAndLastChars" element
     */
    public boolean isSetStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRICTFIRSTANDLASTCHARS$124) != 0;
        }
    }
    
    /**
     * Sets the "strictFirstAndLastChars" element
     */
    public void setStrictFirstAndLastChars(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff strictFirstAndLastChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STRICTFIRSTANDLASTCHARS$124, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STRICTFIRSTANDLASTCHARS$124);
            }
            target.set(strictFirstAndLastChars);
        }
    }
    
    /**
     * Appends and returns a new empty "strictFirstAndLastChars" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STRICTFIRSTANDLASTCHARS$124);
            return target;
        }
    }
    
    /**
     * Unsets the "strictFirstAndLastChars" element
     */
    public void unsetStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRICTFIRSTANDLASTCHARS$124, 0);
        }
    }
    
    /**
     * Gets the "noLineBreaksAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku getNoLineBreaksAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().find_element_user(NOLINEBREAKSAFTER$126, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noLineBreaksAfter" element
     */
    public boolean isSetNoLineBreaksAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOLINEBREAKSAFTER$126) != 0;
        }
    }
    
    /**
     * Sets the "noLineBreaksAfter" element
     */
    public void setNoLineBreaksAfter(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku noLineBreaksAfter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().find_element_user(NOLINEBREAKSAFTER$126, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().add_element_user(NOLINEBREAKSAFTER$126);
            }
            target.set(noLineBreaksAfter);
        }
    }
    
    /**
     * Appends and returns a new empty "noLineBreaksAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku addNewNoLineBreaksAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().add_element_user(NOLINEBREAKSAFTER$126);
            return target;
        }
    }
    
    /**
     * Unsets the "noLineBreaksAfter" element
     */
    public void unsetNoLineBreaksAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOLINEBREAKSAFTER$126, 0);
        }
    }
    
    /**
     * Gets the "noLineBreaksBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku getNoLineBreaksBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().find_element_user(NOLINEBREAKSBEFORE$128, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noLineBreaksBefore" element
     */
    public boolean isSetNoLineBreaksBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOLINEBREAKSBEFORE$128) != 0;
        }
    }
    
    /**
     * Sets the "noLineBreaksBefore" element
     */
    public void setNoLineBreaksBefore(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku noLineBreaksBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().find_element_user(NOLINEBREAKSBEFORE$128, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().add_element_user(NOLINEBREAKSBEFORE$128);
            }
            target.set(noLineBreaksBefore);
        }
    }
    
    /**
     * Appends and returns a new empty "noLineBreaksBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku addNewNoLineBreaksBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku)get_store().add_element_user(NOLINEBREAKSBEFORE$128);
            return target;
        }
    }
    
    /**
     * Unsets the "noLineBreaksBefore" element
     */
    public void unsetNoLineBreaksBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOLINEBREAKSBEFORE$128, 0);
        }
    }
    
    /**
     * Gets the "savePreviewPicture" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSavePreviewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEPREVIEWPICTURE$130, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "savePreviewPicture" element
     */
    public boolean isSetSavePreviewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEPREVIEWPICTURE$130) != 0;
        }
    }
    
    /**
     * Sets the "savePreviewPicture" element
     */
    public void setSavePreviewPicture(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff savePreviewPicture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEPREVIEWPICTURE$130, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEPREVIEWPICTURE$130);
            }
            target.set(savePreviewPicture);
        }
    }
    
    /**
     * Appends and returns a new empty "savePreviewPicture" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSavePreviewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEPREVIEWPICTURE$130);
            return target;
        }
    }
    
    /**
     * Unsets the "savePreviewPicture" element
     */
    public void unsetSavePreviewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEPREVIEWPICTURE$130, 0);
        }
    }
    
    /**
     * Gets the "doNotValidateAgainstSchema" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotValidateAgainstSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTVALIDATEAGAINSTSCHEMA$132, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotValidateAgainstSchema" element
     */
    public boolean isSetDoNotValidateAgainstSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTVALIDATEAGAINSTSCHEMA$132) != 0;
        }
    }
    
    /**
     * Sets the "doNotValidateAgainstSchema" element
     */
    public void setDoNotValidateAgainstSchema(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotValidateAgainstSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTVALIDATEAGAINSTSCHEMA$132, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTVALIDATEAGAINSTSCHEMA$132);
            }
            target.set(doNotValidateAgainstSchema);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotValidateAgainstSchema" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotValidateAgainstSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTVALIDATEAGAINSTSCHEMA$132);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotValidateAgainstSchema" element
     */
    public void unsetDoNotValidateAgainstSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTVALIDATEAGAINSTSCHEMA$132, 0);
        }
    }
    
    /**
     * Gets the "saveInvalidXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSaveInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEINVALIDXML$134, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveInvalidXml" element
     */
    public boolean isSetSaveInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEINVALIDXML$134) != 0;
        }
    }
    
    /**
     * Sets the "saveInvalidXml" element
     */
    public void setSaveInvalidXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff saveInvalidXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEINVALIDXML$134, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEINVALIDXML$134);
            }
            target.set(saveInvalidXml);
        }
    }
    
    /**
     * Appends and returns a new empty "saveInvalidXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSaveInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEINVALIDXML$134);
            return target;
        }
    }
    
    /**
     * Unsets the "saveInvalidXml" element
     */
    public void unsetSaveInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEINVALIDXML$134, 0);
        }
    }
    
    /**
     * Gets the "ignoreMixedContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getIgnoreMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(IGNOREMIXEDCONTENT$136, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ignoreMixedContent" element
     */
    public boolean isSetIgnoreMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IGNOREMIXEDCONTENT$136) != 0;
        }
    }
    
    /**
     * Sets the "ignoreMixedContent" element
     */
    public void setIgnoreMixedContent(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff ignoreMixedContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(IGNOREMIXEDCONTENT$136, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(IGNOREMIXEDCONTENT$136);
            }
            target.set(ignoreMixedContent);
        }
    }
    
    /**
     * Appends and returns a new empty "ignoreMixedContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewIgnoreMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(IGNOREMIXEDCONTENT$136);
            return target;
        }
    }
    
    /**
     * Unsets the "ignoreMixedContent" element
     */
    public void unsetIgnoreMixedContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IGNOREMIXEDCONTENT$136, 0);
        }
    }
    
    /**
     * Gets the "alwaysShowPlaceholderText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAlwaysShowPlaceholderText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "alwaysShowPlaceholderText" element
     */
    public boolean isSetAlwaysShowPlaceholderText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALWAYSSHOWPLACEHOLDERTEXT$138) != 0;
        }
    }
    
    /**
     * Sets the "alwaysShowPlaceholderText" element
     */
    public void setAlwaysShowPlaceholderText(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff alwaysShowPlaceholderText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138);
            }
            target.set(alwaysShowPlaceholderText);
        }
    }
    
    /**
     * Appends and returns a new empty "alwaysShowPlaceholderText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAlwaysShowPlaceholderText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138);
            return target;
        }
    }
    
    /**
     * Unsets the "alwaysShowPlaceholderText" element
     */
    public void unsetAlwaysShowPlaceholderText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALWAYSSHOWPLACEHOLDERTEXT$138, 0);
        }
    }
    
    /**
     * Gets the "doNotDemarcateInvalidXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotDemarcateInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTDEMARCATEINVALIDXML$140, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotDemarcateInvalidXml" element
     */
    public boolean isSetDoNotDemarcateInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTDEMARCATEINVALIDXML$140) != 0;
        }
    }
    
    /**
     * Sets the "doNotDemarcateInvalidXml" element
     */
    public void setDoNotDemarcateInvalidXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotDemarcateInvalidXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTDEMARCATEINVALIDXML$140, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTDEMARCATEINVALIDXML$140);
            }
            target.set(doNotDemarcateInvalidXml);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotDemarcateInvalidXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotDemarcateInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTDEMARCATEINVALIDXML$140);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotDemarcateInvalidXml" element
     */
    public void unsetDoNotDemarcateInvalidXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTDEMARCATEINVALIDXML$140, 0);
        }
    }
    
    /**
     * Gets the "saveXmlDataOnly" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSaveXmlDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEXMLDATAONLY$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveXmlDataOnly" element
     */
    public boolean isSetSaveXmlDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEXMLDATAONLY$142) != 0;
        }
    }
    
    /**
     * Sets the "saveXmlDataOnly" element
     */
    public void setSaveXmlDataOnly(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff saveXmlDataOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SAVEXMLDATAONLY$142, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEXMLDATAONLY$142);
            }
            target.set(saveXmlDataOnly);
        }
    }
    
    /**
     * Appends and returns a new empty "saveXmlDataOnly" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSaveXmlDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SAVEXMLDATAONLY$142);
            return target;
        }
    }
    
    /**
     * Unsets the "saveXmlDataOnly" element
     */
    public void unsetSaveXmlDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEXMLDATAONLY$142, 0);
        }
    }
    
    /**
     * Gets the "useXSLTWhenSaving" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getUseXSLTWhenSaving()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(USEXSLTWHENSAVING$144, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "useXSLTWhenSaving" element
     */
    public boolean isSetUseXSLTWhenSaving()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEXSLTWHENSAVING$144) != 0;
        }
    }
    
    /**
     * Sets the "useXSLTWhenSaving" element
     */
    public void setUseXSLTWhenSaving(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff useXSLTWhenSaving)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(USEXSLTWHENSAVING$144, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(USEXSLTWHENSAVING$144);
            }
            target.set(useXSLTWhenSaving);
        }
    }
    
    /**
     * Appends and returns a new empty "useXSLTWhenSaving" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewUseXSLTWhenSaving()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(USEXSLTWHENSAVING$144);
            return target;
        }
    }
    
    /**
     * Unsets the "useXSLTWhenSaving" element
     */
    public void unsetUseXSLTWhenSaving()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEXSLTWHENSAVING$144, 0);
        }
    }
    
    /**
     * Gets the "saveThroughXslt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt getSaveThroughXslt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt)get_store().find_element_user(SAVETHROUGHXSLT$146, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "saveThroughXslt" element
     */
    public boolean isSetSaveThroughXslt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVETHROUGHXSLT$146) != 0;
        }
    }
    
    /**
     * Sets the "saveThroughXslt" element
     */
    public void setSaveThroughXslt(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt saveThroughXslt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt)get_store().find_element_user(SAVETHROUGHXSLT$146, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt)get_store().add_element_user(SAVETHROUGHXSLT$146);
            }
            target.set(saveThroughXslt);
        }
    }
    
    /**
     * Appends and returns a new empty "saveThroughXslt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt addNewSaveThroughXslt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt)get_store().add_element_user(SAVETHROUGHXSLT$146);
            return target;
        }
    }
    
    /**
     * Unsets the "saveThroughXslt" element
     */
    public void unsetSaveThroughXslt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVETHROUGHXSLT$146, 0);
        }
    }
    
    /**
     * Gets the "showXMLTags" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getShowXMLTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHOWXMLTAGS$148, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showXMLTags" element
     */
    public boolean isSetShowXMLTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWXMLTAGS$148) != 0;
        }
    }
    
    /**
     * Sets the "showXMLTags" element
     */
    public void setShowXMLTags(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff showXMLTags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHOWXMLTAGS$148, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SHOWXMLTAGS$148);
            }
            target.set(showXMLTags);
        }
    }
    
    /**
     * Appends and returns a new empty "showXMLTags" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewShowXMLTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SHOWXMLTAGS$148);
            return target;
        }
    }
    
    /**
     * Unsets the "showXMLTags" element
     */
    public void unsetShowXMLTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWXMLTAGS$148, 0);
        }
    }
    
    /**
     * Gets the "alwaysMergeEmptyNamespace" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAlwaysMergeEmptyNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALWAYSMERGEEMPTYNAMESPACE$150, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "alwaysMergeEmptyNamespace" element
     */
    public boolean isSetAlwaysMergeEmptyNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALWAYSMERGEEMPTYNAMESPACE$150) != 0;
        }
    }
    
    /**
     * Sets the "alwaysMergeEmptyNamespace" element
     */
    public void setAlwaysMergeEmptyNamespace(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff alwaysMergeEmptyNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ALWAYSMERGEEMPTYNAMESPACE$150, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALWAYSMERGEEMPTYNAMESPACE$150);
            }
            target.set(alwaysMergeEmptyNamespace);
        }
    }
    
    /**
     * Appends and returns a new empty "alwaysMergeEmptyNamespace" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAlwaysMergeEmptyNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ALWAYSMERGEEMPTYNAMESPACE$150);
            return target;
        }
    }
    
    /**
     * Unsets the "alwaysMergeEmptyNamespace" element
     */
    public void unsetAlwaysMergeEmptyNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALWAYSMERGEEMPTYNAMESPACE$150, 0);
        }
    }
    
    /**
     * Gets the "updateFields" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getUpdateFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(UPDATEFIELDS$152, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "updateFields" element
     */
    public boolean isSetUpdateFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATEFIELDS$152) != 0;
        }
    }
    
    /**
     * Sets the "updateFields" element
     */
    public void setUpdateFields(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff updateFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(UPDATEFIELDS$152, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(UPDATEFIELDS$152);
            }
            target.set(updateFields);
        }
    }
    
    /**
     * Appends and returns a new empty "updateFields" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewUpdateFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(UPDATEFIELDS$152);
            return target;
        }
    }
    
    /**
     * Unsets the "updateFields" element
     */
    public void unsetUpdateFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATEFIELDS$152, 0);
        }
    }
    
    /**
     * Gets the "hdrShapeDefaults" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults getHdrShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().find_element_user(HDRSHAPEDEFAULTS$154, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hdrShapeDefaults" element
     */
    public boolean isSetHdrShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HDRSHAPEDEFAULTS$154) != 0;
        }
    }
    
    /**
     * Sets the "hdrShapeDefaults" element
     */
    public void setHdrShapeDefaults(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults hdrShapeDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().find_element_user(HDRSHAPEDEFAULTS$154, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().add_element_user(HDRSHAPEDEFAULTS$154);
            }
            target.set(hdrShapeDefaults);
        }
    }
    
    /**
     * Appends and returns a new empty "hdrShapeDefaults" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults addNewHdrShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().add_element_user(HDRSHAPEDEFAULTS$154);
            return target;
        }
    }
    
    /**
     * Unsets the "hdrShapeDefaults" element
     */
    public void unsetHdrShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HDRSHAPEDEFAULTS$154, 0);
        }
    }
    
    /**
     * Gets the "footnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps getFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps)get_store().find_element_user(FOOTNOTEPR$156, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "footnotePr" element
     */
    public boolean isSetFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTEPR$156) != 0;
        }
    }
    
    /**
     * Sets the "footnotePr" element
     */
    public void setFootnotePr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps footnotePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps)get_store().find_element_user(FOOTNOTEPR$156, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps)get_store().add_element_user(FOOTNOTEPR$156);
            }
            target.set(footnotePr);
        }
    }
    
    /**
     * Appends and returns a new empty "footnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps addNewFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps)get_store().add_element_user(FOOTNOTEPR$156);
            return target;
        }
    }
    
    /**
     * Unsets the "footnotePr" element
     */
    public void unsetFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTEPR$156, 0);
        }
    }
    
    /**
     * Gets the "endnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps getEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps)get_store().find_element_user(ENDNOTEPR$158, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endnotePr" element
     */
    public boolean isSetEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDNOTEPR$158) != 0;
        }
    }
    
    /**
     * Sets the "endnotePr" element
     */
    public void setEndnotePr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps endnotePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps)get_store().find_element_user(ENDNOTEPR$158, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps)get_store().add_element_user(ENDNOTEPR$158);
            }
            target.set(endnotePr);
        }
    }
    
    /**
     * Appends and returns a new empty "endnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps addNewEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps)get_store().add_element_user(ENDNOTEPR$158);
            return target;
        }
    }
    
    /**
     * Unsets the "endnotePr" element
     */
    public void unsetEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDNOTEPR$158, 0);
        }
    }
    
    /**
     * Gets the "compat" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat getCompat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat)get_store().find_element_user(COMPAT$160, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "compat" element
     */
    public boolean isSetCompat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPAT$160) != 0;
        }
    }
    
    /**
     * Sets the "compat" element
     */
    public void setCompat(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat compat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat)get_store().find_element_user(COMPAT$160, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat)get_store().add_element_user(COMPAT$160);
            }
            target.set(compat);
        }
    }
    
    /**
     * Appends and returns a new empty "compat" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat addNewCompat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat)get_store().add_element_user(COMPAT$160);
            return target;
        }
    }
    
    /**
     * Unsets the "compat" element
     */
    public void unsetCompat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPAT$160, 0);
        }
    }
    
    /**
     * Gets the "docVars" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars getDocVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars)get_store().find_element_user(DOCVARS$162, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docVars" element
     */
    public boolean isSetDocVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCVARS$162) != 0;
        }
    }
    
    /**
     * Sets the "docVars" element
     */
    public void setDocVars(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars docVars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars)get_store().find_element_user(DOCVARS$162, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars)get_store().add_element_user(DOCVARS$162);
            }
            target.set(docVars);
        }
    }
    
    /**
     * Appends and returns a new empty "docVars" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars addNewDocVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars)get_store().add_element_user(DOCVARS$162);
            return target;
        }
    }
    
    /**
     * Unsets the "docVars" element
     */
    public void unsetDocVars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCVARS$162, 0);
        }
    }
    
    /**
     * Gets the "rsids" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids getRsids()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids)get_store().find_element_user(RSIDS$164, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rsids" element
     */
    public boolean isSetRsids()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSIDS$164) != 0;
        }
    }
    
    /**
     * Sets the "rsids" element
     */
    public void setRsids(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids rsids)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids)get_store().find_element_user(RSIDS$164, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids)get_store().add_element_user(RSIDS$164);
            }
            target.set(rsids);
        }
    }
    
    /**
     * Appends and returns a new empty "rsids" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids addNewRsids()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids)get_store().add_element_user(RSIDS$164);
            return target;
        }
    }
    
    /**
     * Unsets the "rsids" element
     */
    public void unsetRsids()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSIDS$164, 0);
        }
    }
    
    /**
     * Gets the "mathPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr getMathPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().find_element_user(MATHPR$166, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mathPr" element
     */
    public boolean isSetMathPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATHPR$166) != 0;
        }
    }
    
    /**
     * Sets the "mathPr" element
     */
    public void setMathPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr mathPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().find_element_user(MATHPR$166, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().add_element_user(MATHPR$166);
            }
            target.set(mathPr);
        }
    }
    
    /**
     * Appends and returns a new empty "mathPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr addNewMathPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().add_element_user(MATHPR$166);
            return target;
        }
    }
    
    /**
     * Unsets the "mathPr" element
     */
    public void unsetMathPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATHPR$166, 0);
        }
    }
    
    /**
     * Gets the "uiCompat97To2003" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getUiCompat97To2003()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(UICOMPAT97TO2003$168, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uiCompat97To2003" element
     */
    public boolean isSetUiCompat97To2003()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UICOMPAT97TO2003$168) != 0;
        }
    }
    
    /**
     * Sets the "uiCompat97To2003" element
     */
    public void setUiCompat97To2003(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff uiCompat97To2003)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(UICOMPAT97TO2003$168, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(UICOMPAT97TO2003$168);
            }
            target.set(uiCompat97To2003);
        }
    }
    
    /**
     * Appends and returns a new empty "uiCompat97To2003" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewUiCompat97To2003()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(UICOMPAT97TO2003$168);
            return target;
        }
    }
    
    /**
     * Unsets the "uiCompat97To2003" element
     */
    public void unsetUiCompat97To2003()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UICOMPAT97TO2003$168, 0);
        }
    }
    
    /**
     * Gets a List of "attachedSchema" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getAttachedSchemaList()
    {
        final class AttachedSchemaList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTSettingsImpl.this.getAttachedSchemaArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTSettingsImpl.this.getAttachedSchemaArray(i);
                CTSettingsImpl.this.setAttachedSchemaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTSettingsImpl.this.insertNewAttachedSchema(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTSettingsImpl.this.getAttachedSchemaArray(i);
                CTSettingsImpl.this.removeAttachedSchema(i);
                return old;
            }
            
            public int size()
                { return CTSettingsImpl.this.sizeOfAttachedSchemaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AttachedSchemaList();
        }
    }
    
    /**
     * Gets array of all "attachedSchema" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getAttachedSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHEDSCHEMA$170, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attachedSchema" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAttachedSchemaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ATTACHEDSCHEMA$170, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attachedSchema" element
     */
    public int sizeOfAttachedSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHEDSCHEMA$170);
        }
    }
    
    /**
     * Sets array of all "attachedSchema" element
     */
    public void setAttachedSchemaArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] attachedSchemaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachedSchemaArray, ATTACHEDSCHEMA$170);
        }
    }
    
    /**
     * Sets ith "attachedSchema" element
     */
    public void setAttachedSchemaArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString attachedSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ATTACHEDSCHEMA$170, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachedSchema);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attachedSchema" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewAttachedSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(ATTACHEDSCHEMA$170, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attachedSchema" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAttachedSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ATTACHEDSCHEMA$170);
            return target;
        }
    }
    
    /**
     * Removes the ith "attachedSchema" element
     */
    public void removeAttachedSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHEDSCHEMA$170, i);
        }
    }
    
    /**
     * Gets the "themeFontLang" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage getThemeFontLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().find_element_user(THEMEFONTLANG$172, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "themeFontLang" element
     */
    public boolean isSetThemeFontLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THEMEFONTLANG$172) != 0;
        }
    }
    
    /**
     * Sets the "themeFontLang" element
     */
    public void setThemeFontLang(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage themeFontLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().find_element_user(THEMEFONTLANG$172, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().add_element_user(THEMEFONTLANG$172);
            }
            target.set(themeFontLang);
        }
    }
    
    /**
     * Appends and returns a new empty "themeFontLang" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage addNewThemeFontLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().add_element_user(THEMEFONTLANG$172);
            return target;
        }
    }
    
    /**
     * Unsets the "themeFontLang" element
     */
    public void unsetThemeFontLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THEMEFONTLANG$172, 0);
        }
    }
    
    /**
     * Gets the "clrSchemeMapping" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping getClrSchemeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping)get_store().find_element_user(CLRSCHEMEMAPPING$174, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrSchemeMapping" element
     */
    public boolean isSetClrSchemeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRSCHEMEMAPPING$174) != 0;
        }
    }
    
    /**
     * Sets the "clrSchemeMapping" element
     */
    public void setClrSchemeMapping(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping clrSchemeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping)get_store().find_element_user(CLRSCHEMEMAPPING$174, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping)get_store().add_element_user(CLRSCHEMEMAPPING$174);
            }
            target.set(clrSchemeMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "clrSchemeMapping" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping addNewClrSchemeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping)get_store().add_element_user(CLRSCHEMEMAPPING$174);
            return target;
        }
    }
    
    /**
     * Unsets the "clrSchemeMapping" element
     */
    public void unsetClrSchemeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRSCHEMEMAPPING$174, 0);
        }
    }
    
    /**
     * Gets the "doNotIncludeSubdocsInStats" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotIncludeSubdocsInStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTINCLUDESUBDOCSINSTATS$176, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotIncludeSubdocsInStats" element
     */
    public boolean isSetDoNotIncludeSubdocsInStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTINCLUDESUBDOCSINSTATS$176) != 0;
        }
    }
    
    /**
     * Sets the "doNotIncludeSubdocsInStats" element
     */
    public void setDoNotIncludeSubdocsInStats(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotIncludeSubdocsInStats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTINCLUDESUBDOCSINSTATS$176, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTINCLUDESUBDOCSINSTATS$176);
            }
            target.set(doNotIncludeSubdocsInStats);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotIncludeSubdocsInStats" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotIncludeSubdocsInStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTINCLUDESUBDOCSINSTATS$176);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotIncludeSubdocsInStats" element
     */
    public void unsetDoNotIncludeSubdocsInStats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTINCLUDESUBDOCSINSTATS$176, 0);
        }
    }
    
    /**
     * Gets the "doNotAutoCompressPictures" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTAUTOCOMPRESSPICTURES$178, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotAutoCompressPictures" element
     */
    public boolean isSetDoNotAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTAUTOCOMPRESSPICTURES$178) != 0;
        }
    }
    
    /**
     * Sets the "doNotAutoCompressPictures" element
     */
    public void setDoNotAutoCompressPictures(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotAutoCompressPictures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTAUTOCOMPRESSPICTURES$178, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTAUTOCOMPRESSPICTURES$178);
            }
            target.set(doNotAutoCompressPictures);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotAutoCompressPictures" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTAUTOCOMPRESSPICTURES$178);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotAutoCompressPictures" element
     */
    public void unsetDoNotAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTAUTOCOMPRESSPICTURES$178, 0);
        }
    }
    
    /**
     * Gets the "forceUpgrade" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getForceUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(FORCEUPGRADE$180, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "forceUpgrade" element
     */
    public boolean isSetForceUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORCEUPGRADE$180) != 0;
        }
    }
    
    /**
     * Sets the "forceUpgrade" element
     */
    public void setForceUpgrade(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty forceUpgrade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(FORCEUPGRADE$180, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(FORCEUPGRADE$180);
            }
            target.set(forceUpgrade);
        }
    }
    
    /**
     * Appends and returns a new empty "forceUpgrade" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewForceUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(FORCEUPGRADE$180);
            return target;
        }
    }
    
    /**
     * Unsets the "forceUpgrade" element
     */
    public void unsetForceUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORCEUPGRADE$180, 0);
        }
    }
    
    /**
     * Gets the "captions" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions getCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions)get_store().find_element_user(CAPTIONS$182, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "captions" element
     */
    public boolean isSetCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPTIONS$182) != 0;
        }
    }
    
    /**
     * Sets the "captions" element
     */
    public void setCaptions(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions captions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions)get_store().find_element_user(CAPTIONS$182, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions)get_store().add_element_user(CAPTIONS$182);
            }
            target.set(captions);
        }
    }
    
    /**
     * Appends and returns a new empty "captions" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions addNewCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions)get_store().add_element_user(CAPTIONS$182);
            return target;
        }
    }
    
    /**
     * Unsets the "captions" element
     */
    public void unsetCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPTIONS$182, 0);
        }
    }
    
    /**
     * Gets the "readModeInkLockDown" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown getReadModeInkLockDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown)get_store().find_element_user(READMODEINKLOCKDOWN$184, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "readModeInkLockDown" element
     */
    public boolean isSetReadModeInkLockDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(READMODEINKLOCKDOWN$184) != 0;
        }
    }
    
    /**
     * Sets the "readModeInkLockDown" element
     */
    public void setReadModeInkLockDown(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown readModeInkLockDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown)get_store().find_element_user(READMODEINKLOCKDOWN$184, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown)get_store().add_element_user(READMODEINKLOCKDOWN$184);
            }
            target.set(readModeInkLockDown);
        }
    }
    
    /**
     * Appends and returns a new empty "readModeInkLockDown" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown addNewReadModeInkLockDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown)get_store().add_element_user(READMODEINKLOCKDOWN$184);
            return target;
        }
    }
    
    /**
     * Unsets the "readModeInkLockDown" element
     */
    public void unsetReadModeInkLockDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(READMODEINKLOCKDOWN$184, 0);
        }
    }
    
    /**
     * Gets a List of "smartTagType" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType> getSmartTagTypeList()
    {
        final class SmartTagTypeList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType get(int i)
                { return CTSettingsImpl.this.getSmartTagTypeArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType old = CTSettingsImpl.this.getSmartTagTypeArray(i);
                CTSettingsImpl.this.setSmartTagTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType o)
                { CTSettingsImpl.this.insertNewSmartTagType(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType old = CTSettingsImpl.this.getSmartTagTypeArray(i);
                CTSettingsImpl.this.removeSmartTagType(i);
                return old;
            }
            
            public int size()
                { return CTSettingsImpl.this.sizeOfSmartTagTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SmartTagTypeList();
        }
    }
    
    /**
     * Gets array of all "smartTagType" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType[] getSmartTagTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SMARTTAGTYPE$186, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "smartTagType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType getSmartTagTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType)get_store().find_element_user(SMARTTAGTYPE$186, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "smartTagType" element
     */
    public int sizeOfSmartTagTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAGTYPE$186);
        }
    }
    
    /**
     * Sets array of all "smartTagType" element
     */
    public void setSmartTagTypeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType[] smartTagTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(smartTagTypeArray, SMARTTAGTYPE$186);
        }
    }
    
    /**
     * Sets ith "smartTagType" element
     */
    public void setSmartTagTypeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType smartTagType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType)get_store().find_element_user(SMARTTAGTYPE$186, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(smartTagType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "smartTagType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType insertNewSmartTagType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType)get_store().insert_element_user(SMARTTAGTYPE$186, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "smartTagType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType addNewSmartTagType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType)get_store().add_element_user(SMARTTAGTYPE$186);
            return target;
        }
    }
    
    /**
     * Removes the ith "smartTagType" element
     */
    public void removeSmartTagType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAGTYPE$186, i);
        }
    }
    
    /**
     * Gets the "schemaLibrary" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary getSchemaLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().find_element_user(SCHEMALIBRARY$188, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schemaLibrary" element
     */
    public boolean isSetSchemaLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMALIBRARY$188) != 0;
        }
    }
    
    /**
     * Sets the "schemaLibrary" element
     */
    public void setSchemaLibrary(org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary schemaLibrary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().find_element_user(SCHEMALIBRARY$188, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().add_element_user(SCHEMALIBRARY$188);
            }
            target.set(schemaLibrary);
        }
    }
    
    /**
     * Appends and returns a new empty "schemaLibrary" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary addNewSchemaLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary)get_store().add_element_user(SCHEMALIBRARY$188);
            return target;
        }
    }
    
    /**
     * Unsets the "schemaLibrary" element
     */
    public void unsetSchemaLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMALIBRARY$188, 0);
        }
    }
    
    /**
     * Gets the "shapeDefaults" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults getShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().find_element_user(SHAPEDEFAULTS$190, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shapeDefaults" element
     */
    public boolean isSetShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPEDEFAULTS$190) != 0;
        }
    }
    
    /**
     * Sets the "shapeDefaults" element
     */
    public void setShapeDefaults(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults shapeDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().find_element_user(SHAPEDEFAULTS$190, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().add_element_user(SHAPEDEFAULTS$190);
            }
            target.set(shapeDefaults);
        }
    }
    
    /**
     * Appends and returns a new empty "shapeDefaults" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults addNewShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults)get_store().add_element_user(SHAPEDEFAULTS$190);
            return target;
        }
    }
    
    /**
     * Unsets the "shapeDefaults" element
     */
    public void unsetShapeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPEDEFAULTS$190, 0);
        }
    }
    
    /**
     * Gets the "doNotEmbedSmartTags" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotEmbedSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTEMBEDSMARTTAGS$192, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotEmbedSmartTags" element
     */
    public boolean isSetDoNotEmbedSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTEMBEDSMARTTAGS$192) != 0;
        }
    }
    
    /**
     * Sets the "doNotEmbedSmartTags" element
     */
    public void setDoNotEmbedSmartTags(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotEmbedSmartTags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTEMBEDSMARTTAGS$192, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTEMBEDSMARTTAGS$192);
            }
            target.set(doNotEmbedSmartTags);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotEmbedSmartTags" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotEmbedSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTEMBEDSMARTTAGS$192);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotEmbedSmartTags" element
     */
    public void unsetDoNotEmbedSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTEMBEDSMARTTAGS$192, 0);
        }
    }
    
    /**
     * Gets the "decimalSymbol" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDecimalSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DECIMALSYMBOL$194, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "decimalSymbol" element
     */
    public boolean isSetDecimalSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMALSYMBOL$194) != 0;
        }
    }
    
    /**
     * Sets the "decimalSymbol" element
     */
    public void setDecimalSymbol(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString decimalSymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DECIMALSYMBOL$194, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DECIMALSYMBOL$194);
            }
            target.set(decimalSymbol);
        }
    }
    
    /**
     * Appends and returns a new empty "decimalSymbol" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDecimalSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DECIMALSYMBOL$194);
            return target;
        }
    }
    
    /**
     * Unsets the "decimalSymbol" element
     */
    public void unsetDecimalSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMALSYMBOL$194, 0);
        }
    }
    
    /**
     * Gets the "listSeparator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getListSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(LISTSEPARATOR$196, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "listSeparator" element
     */
    public boolean isSetListSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTSEPARATOR$196) != 0;
        }
    }
    
    /**
     * Sets the "listSeparator" element
     */
    public void setListSeparator(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString listSeparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(LISTSEPARATOR$196, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(LISTSEPARATOR$196);
            }
            target.set(listSeparator);
        }
    }
    
    /**
     * Appends and returns a new empty "listSeparator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewListSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(LISTSEPARATOR$196);
            return target;
        }
    }
    
    /**
     * Unsets the "listSeparator" element
     */
    public void unsetListSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTSEPARATOR$196, 0);
        }
    }
}

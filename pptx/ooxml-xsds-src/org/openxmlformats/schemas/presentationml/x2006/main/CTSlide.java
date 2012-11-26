/*
 * XML Type:  CT_Slide
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlide
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_Slide(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSlide extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSlide.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctslided7betype");
    
    /**
     * Gets the "cSld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData getCSld();
    
    /**
     * Sets the "cSld" element
     */
    void setCSld(org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData cSld);
    
    /**
     * Appends and returns a new empty "cSld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData addNewCSld();
    
    /**
     * Gets the "clrMapOvr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride getClrMapOvr();
    
    /**
     * True if has "clrMapOvr" element
     */
    boolean isSetClrMapOvr();
    
    /**
     * Sets the "clrMapOvr" element
     */
    void setClrMapOvr(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride clrMapOvr);
    
    /**
     * Appends and returns a new empty "clrMapOvr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride addNewClrMapOvr();
    
    /**
     * Unsets the "clrMapOvr" element
     */
    void unsetClrMapOvr();
    
    /**
     * Gets the "transition" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition getTransition();
    
    /**
     * True if has "transition" element
     */
    boolean isSetTransition();
    
    /**
     * Sets the "transition" element
     */
    void setTransition(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition transition);
    
    /**
     * Appends and returns a new empty "transition" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition addNewTransition();
    
    /**
     * Unsets the "transition" element
     */
    void unsetTransition();
    
    /**
     * Gets the "timing" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming getTiming();
    
    /**
     * True if has "timing" element
     */
    boolean isSetTiming();
    
    /**
     * Sets the "timing" element
     */
    void setTiming(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming timing);
    
    /**
     * Appends and returns a new empty "timing" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming addNewTiming();
    
    /**
     * Unsets the "timing" element
     */
    void unsetTiming();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "showMasterSp" attribute
     */
    boolean getShowMasterSp();
    
    /**
     * Gets (as xml) the "showMasterSp" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowMasterSp();
    
    /**
     * True if has "showMasterSp" attribute
     */
    boolean isSetShowMasterSp();
    
    /**
     * Sets the "showMasterSp" attribute
     */
    void setShowMasterSp(boolean showMasterSp);
    
    /**
     * Sets (as xml) the "showMasterSp" attribute
     */
    void xsetShowMasterSp(org.apache.xmlbeans.XmlBoolean showMasterSp);
    
    /**
     * Unsets the "showMasterSp" attribute
     */
    void unsetShowMasterSp();
    
    /**
     * Gets the "showMasterPhAnim" attribute
     */
    boolean getShowMasterPhAnim();
    
    /**
     * Gets (as xml) the "showMasterPhAnim" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowMasterPhAnim();
    
    /**
     * True if has "showMasterPhAnim" attribute
     */
    boolean isSetShowMasterPhAnim();
    
    /**
     * Sets the "showMasterPhAnim" attribute
     */
    void setShowMasterPhAnim(boolean showMasterPhAnim);
    
    /**
     * Sets (as xml) the "showMasterPhAnim" attribute
     */
    void xsetShowMasterPhAnim(org.apache.xmlbeans.XmlBoolean showMasterPhAnim);
    
    /**
     * Unsets the "showMasterPhAnim" attribute
     */
    void unsetShowMasterPhAnim();
    
    /**
     * Gets the "show" attribute
     */
    boolean getShow();
    
    /**
     * Gets (as xml) the "show" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShow();
    
    /**
     * True if has "show" attribute
     */
    boolean isSetShow();
    
    /**
     * Sets the "show" attribute
     */
    void setShow(boolean show);
    
    /**
     * Sets (as xml) the "show" attribute
     */
    void xsetShow(org.apache.xmlbeans.XmlBoolean show);
    
    /**
     * Unsets the "show" attribute
     */
    void unsetShow();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory
    {
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide newInstance() {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTSlide parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTSlide) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

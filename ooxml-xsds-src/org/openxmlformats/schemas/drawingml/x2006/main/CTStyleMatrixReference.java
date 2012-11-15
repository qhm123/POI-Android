/*
 * XML Type:  CT_StyleMatrixReference
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_StyleMatrixReference(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTStyleMatrixReference extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTStyleMatrixReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctstylematrixreference6ef4type");
    
    /**
     * Gets the "scrgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor getScrgbClr();
    
    /**
     * True if has "scrgbClr" element
     */
    boolean isSetScrgbClr();
    
    /**
     * Sets the "scrgbClr" element
     */
    void setScrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor scrgbClr);
    
    /**
     * Appends and returns a new empty "scrgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor addNewScrgbClr();
    
    /**
     * Unsets the "scrgbClr" element
     */
    void unsetScrgbClr();
    
    /**
     * Gets the "srgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor getSrgbClr();
    
    /**
     * True if has "srgbClr" element
     */
    boolean isSetSrgbClr();
    
    /**
     * Sets the "srgbClr" element
     */
    void setSrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor srgbClr);
    
    /**
     * Appends and returns a new empty "srgbClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor addNewSrgbClr();
    
    /**
     * Unsets the "srgbClr" element
     */
    void unsetSrgbClr();
    
    /**
     * Gets the "hslClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor getHslClr();
    
    /**
     * True if has "hslClr" element
     */
    boolean isSetHslClr();
    
    /**
     * Sets the "hslClr" element
     */
    void setHslClr(org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor hslClr);
    
    /**
     * Appends and returns a new empty "hslClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor addNewHslClr();
    
    /**
     * Unsets the "hslClr" element
     */
    void unsetHslClr();
    
    /**
     * Gets the "sysClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor getSysClr();
    
    /**
     * True if has "sysClr" element
     */
    boolean isSetSysClr();
    
    /**
     * Sets the "sysClr" element
     */
    void setSysClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor sysClr);
    
    /**
     * Appends and returns a new empty "sysClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor addNewSysClr();
    
    /**
     * Unsets the "sysClr" element
     */
    void unsetSysClr();
    
    /**
     * Gets the "schemeClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor getSchemeClr();
    
    /**
     * True if has "schemeClr" element
     */
    boolean isSetSchemeClr();
    
    /**
     * Sets the "schemeClr" element
     */
    void setSchemeClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor schemeClr);
    
    /**
     * Appends and returns a new empty "schemeClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor addNewSchemeClr();
    
    /**
     * Unsets the "schemeClr" element
     */
    void unsetSchemeClr();
    
    /**
     * Gets the "prstClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor getPrstClr();
    
    /**
     * True if has "prstClr" element
     */
    boolean isSetPrstClr();
    
    /**
     * Sets the "prstClr" element
     */
    void setPrstClr(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor prstClr);
    
    /**
     * Appends and returns a new empty "prstClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor addNewPrstClr();
    
    /**
     * Unsets the "prstClr" element
     */
    void unsetPrstClr();
    
    /**
     * Gets the "idx" attribute
     */
    long getIdx();
    
    /**
     * Gets (as xml) the "idx" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STStyleMatrixColumnIndex xgetIdx();
    
    /**
     * Sets the "idx" attribute
     */
    void setIdx(long idx);
    
    /**
     * Sets (as xml) the "idx" attribute
     */
    void xsetIdx(org.openxmlformats.schemas.drawingml.x2006.main.STStyleMatrixColumnIndex idx);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

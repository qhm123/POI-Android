/*
 * XML Type:  CT_CustomGeometry2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_CustomGeometry2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCustomGeometry2D extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCustomGeometry2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcustomgeometry2dca70type");
    
    /**
     * Gets the "avLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList getAvLst();
    
    /**
     * True if has "avLst" element
     */
    boolean isSetAvLst();
    
    /**
     * Sets the "avLst" element
     */
    void setAvLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList avLst);
    
    /**
     * Appends and returns a new empty "avLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList addNewAvLst();
    
    /**
     * Unsets the "avLst" element
     */
    void unsetAvLst();
    
    /**
     * Gets the "gdLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList getGdLst();
    
    /**
     * True if has "gdLst" element
     */
    boolean isSetGdLst();
    
    /**
     * Sets the "gdLst" element
     */
    void setGdLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList gdLst);
    
    /**
     * Appends and returns a new empty "gdLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList addNewGdLst();
    
    /**
     * Unsets the "gdLst" element
     */
    void unsetGdLst();
    
    /**
     * Gets the "ahLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList getAhLst();
    
    /**
     * True if has "ahLst" element
     */
    boolean isSetAhLst();
    
    /**
     * Sets the "ahLst" element
     */
    void setAhLst(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList ahLst);
    
    /**
     * Appends and returns a new empty "ahLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList addNewAhLst();
    
    /**
     * Unsets the "ahLst" element
     */
    void unsetAhLst();
    
    /**
     * Gets the "cxnLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList getCxnLst();
    
    /**
     * True if has "cxnLst" element
     */
    boolean isSetCxnLst();
    
    /**
     * Sets the "cxnLst" element
     */
    void setCxnLst(org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList cxnLst);
    
    /**
     * Appends and returns a new empty "cxnLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList addNewCxnLst();
    
    /**
     * Unsets the "cxnLst" element
     */
    void unsetCxnLst();
    
    /**
     * Gets the "rect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect getRect();
    
    /**
     * True if has "rect" element
     */
    boolean isSetRect();
    
    /**
     * Sets the "rect" element
     */
    void setRect(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect rect);
    
    /**
     * Appends and returns a new empty "rect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect addNewRect();
    
    /**
     * Unsets the "rect" element
     */
    void unsetRect();
    
    /**
     * Gets the "pathLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList getPathLst();
    
    /**
     * Sets the "pathLst" element
     */
    void setPathLst(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList pathLst);
    
    /**
     * Appends and returns a new empty "pathLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList addNewPathLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

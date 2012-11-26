/*
 * XML Type:  CT_GradientFillProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GradientFillProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGradientFillProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGradientFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgradientfillproperties81c1type");
    
    /**
     * Gets the "gsLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList getGsLst();
    
    /**
     * True if has "gsLst" element
     */
    boolean isSetGsLst();
    
    /**
     * Sets the "gsLst" element
     */
    void setGsLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList gsLst);
    
    /**
     * Appends and returns a new empty "gsLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList addNewGsLst();
    
    /**
     * Unsets the "gsLst" element
     */
    void unsetGsLst();
    
    /**
     * Gets the "lin" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties getLin();
    
    /**
     * True if has "lin" element
     */
    boolean isSetLin();
    
    /**
     * Sets the "lin" element
     */
    void setLin(org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties lin);
    
    /**
     * Appends and returns a new empty "lin" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties addNewLin();
    
    /**
     * Unsets the "lin" element
     */
    void unsetLin();
    
    /**
     * Gets the "path" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties getPath();
    
    /**
     * True if has "path" element
     */
    boolean isSetPath();
    
    /**
     * Sets the "path" element
     */
    void setPath(org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties path);
    
    /**
     * Appends and returns a new empty "path" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties addNewPath();
    
    /**
     * Unsets the "path" element
     */
    void unsetPath();
    
    /**
     * Gets the "tileRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getTileRect();
    
    /**
     * True if has "tileRect" element
     */
    boolean isSetTileRect();
    
    /**
     * Sets the "tileRect" element
     */
    void setTileRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect tileRect);
    
    /**
     * Appends and returns a new empty "tileRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewTileRect();
    
    /**
     * Unsets the "tileRect" element
     */
    void unsetTileRect();
    
    /**
     * Gets the "flip" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum getFlip();
    
    /**
     * Gets (as xml) the "flip" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode xgetFlip();
    
    /**
     * True if has "flip" attribute
     */
    boolean isSetFlip();
    
    /**
     * Sets the "flip" attribute
     */
    void setFlip(org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum flip);
    
    /**
     * Sets (as xml) the "flip" attribute
     */
    void xsetFlip(org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode flip);
    
    /**
     * Unsets the "flip" attribute
     */
    void unsetFlip();
    
    /**
     * Gets the "rotWithShape" attribute
     */
    boolean getRotWithShape();
    
    /**
     * Gets (as xml) the "rotWithShape" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRotWithShape();
    
    /**
     * True if has "rotWithShape" attribute
     */
    boolean isSetRotWithShape();
    
    /**
     * Sets the "rotWithShape" attribute
     */
    void setRotWithShape(boolean rotWithShape);
    
    /**
     * Sets (as xml) the "rotWithShape" attribute
     */
    void xsetRotWithShape(org.apache.xmlbeans.XmlBoolean rotWithShape);
    
    /**
     * Unsets the "rotWithShape" attribute
     */
    void unsetRotWithShape();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

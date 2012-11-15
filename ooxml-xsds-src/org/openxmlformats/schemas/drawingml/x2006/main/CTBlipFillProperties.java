/*
 * XML Type:  CT_BlipFillProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_BlipFillProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBlipFillProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBlipFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctblipfillproperties0382type");
    
    /**
     * Gets the "blip" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlip getBlip();
    
    /**
     * True if has "blip" element
     */
    boolean isSetBlip();
    
    /**
     * Sets the "blip" element
     */
    void setBlip(org.openxmlformats.schemas.drawingml.x2006.main.CTBlip blip);
    
    /**
     * Appends and returns a new empty "blip" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlip addNewBlip();
    
    /**
     * Unsets the "blip" element
     */
    void unsetBlip();
    
    /**
     * Gets the "srcRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getSrcRect();
    
    /**
     * True if has "srcRect" element
     */
    boolean isSetSrcRect();
    
    /**
     * Sets the "srcRect" element
     */
    void setSrcRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect srcRect);
    
    /**
     * Appends and returns a new empty "srcRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewSrcRect();
    
    /**
     * Unsets the "srcRect" element
     */
    void unsetSrcRect();
    
    /**
     * Gets the "tile" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties getTile();
    
    /**
     * True if has "tile" element
     */
    boolean isSetTile();
    
    /**
     * Sets the "tile" element
     */
    void setTile(org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties tile);
    
    /**
     * Appends and returns a new empty "tile" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties addNewTile();
    
    /**
     * Unsets the "tile" element
     */
    void unsetTile();
    
    /**
     * Gets the "stretch" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties getStretch();
    
    /**
     * True if has "stretch" element
     */
    boolean isSetStretch();
    
    /**
     * Sets the "stretch" element
     */
    void setStretch(org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties stretch);
    
    /**
     * Appends and returns a new empty "stretch" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties addNewStretch();
    
    /**
     * Unsets the "stretch" element
     */
    void unsetStretch();
    
    /**
     * Gets the "dpi" attribute
     */
    long getDpi();
    
    /**
     * Gets (as xml) the "dpi" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDpi();
    
    /**
     * True if has "dpi" attribute
     */
    boolean isSetDpi();
    
    /**
     * Sets the "dpi" attribute
     */
    void setDpi(long dpi);
    
    /**
     * Sets (as xml) the "dpi" attribute
     */
    void xsetDpi(org.apache.xmlbeans.XmlUnsignedInt dpi);
    
    /**
     * Unsets the "dpi" attribute
     */
    void unsetDpi();
    
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
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

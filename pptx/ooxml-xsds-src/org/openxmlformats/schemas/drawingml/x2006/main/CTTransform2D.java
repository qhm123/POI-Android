/*
 * XML Type:  CT_Transform2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Transform2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTransform2D extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTransform2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttransform2d5deftype");
    
    /**
     * Gets the "off" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getOff();
    
    /**
     * True if has "off" element
     */
    boolean isSetOff();
    
    /**
     * Sets the "off" element
     */
    void setOff(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D off);
    
    /**
     * Appends and returns a new empty "off" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewOff();
    
    /**
     * Unsets the "off" element
     */
    void unsetOff();
    
    /**
     * Gets the "ext" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getExt();
    
    /**
     * True if has "ext" element
     */
    boolean isSetExt();
    
    /**
     * Sets the "ext" element
     */
    void setExt(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D ext);
    
    /**
     * Appends and returns a new empty "ext" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewExt();
    
    /**
     * Unsets the "ext" element
     */
    void unsetExt();
    
    /**
     * Gets the "rot" attribute
     */
    int getRot();
    
    /**
     * Gets (as xml) the "rot" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STAngle xgetRot();
    
    /**
     * True if has "rot" attribute
     */
    boolean isSetRot();
    
    /**
     * Sets the "rot" attribute
     */
    void setRot(int rot);
    
    /**
     * Sets (as xml) the "rot" attribute
     */
    void xsetRot(org.openxmlformats.schemas.drawingml.x2006.main.STAngle rot);
    
    /**
     * Unsets the "rot" attribute
     */
    void unsetRot();
    
    /**
     * Gets the "flipH" attribute
     */
    boolean getFlipH();
    
    /**
     * Gets (as xml) the "flipH" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFlipH();
    
    /**
     * True if has "flipH" attribute
     */
    boolean isSetFlipH();
    
    /**
     * Sets the "flipH" attribute
     */
    void setFlipH(boolean flipH);
    
    /**
     * Sets (as xml) the "flipH" attribute
     */
    void xsetFlipH(org.apache.xmlbeans.XmlBoolean flipH);
    
    /**
     * Unsets the "flipH" attribute
     */
    void unsetFlipH();
    
    /**
     * Gets the "flipV" attribute
     */
    boolean getFlipV();
    
    /**
     * Gets (as xml) the "flipV" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFlipV();
    
    /**
     * True if has "flipV" attribute
     */
    boolean isSetFlipV();
    
    /**
     * Sets the "flipV" attribute
     */
    void setFlipV(boolean flipV);
    
    /**
     * Sets (as xml) the "flipV" attribute
     */
    void xsetFlipV(org.apache.xmlbeans.XmlBoolean flipV);
    
    /**
     * Unsets the "flipV" attribute
     */
    void unsetFlipV();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

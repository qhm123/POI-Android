/*
 * XML Type:  CT_FillOverlayEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_FillOverlayEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFillOverlayEffect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFillOverlayEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfilloverlayeffecte42ftype");
    
    /**
     * Gets the "noFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties getNoFill();
    
    /**
     * True if has "noFill" element
     */
    boolean isSetNoFill();
    
    /**
     * Sets the "noFill" element
     */
    void setNoFill(org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties noFill);
    
    /**
     * Appends and returns a new empty "noFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties addNewNoFill();
    
    /**
     * Unsets the "noFill" element
     */
    void unsetNoFill();
    
    /**
     * Gets the "solidFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getSolidFill();
    
    /**
     * True if has "solidFill" element
     */
    boolean isSetSolidFill();
    
    /**
     * Sets the "solidFill" element
     */
    void setSolidFill(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties solidFill);
    
    /**
     * Appends and returns a new empty "solidFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewSolidFill();
    
    /**
     * Unsets the "solidFill" element
     */
    void unsetSolidFill();
    
    /**
     * Gets the "gradFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties getGradFill();
    
    /**
     * True if has "gradFill" element
     */
    boolean isSetGradFill();
    
    /**
     * Sets the "gradFill" element
     */
    void setGradFill(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties gradFill);
    
    /**
     * Appends and returns a new empty "gradFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties addNewGradFill();
    
    /**
     * Unsets the "gradFill" element
     */
    void unsetGradFill();
    
    /**
     * Gets the "blipFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties getBlipFill();
    
    /**
     * True if has "blipFill" element
     */
    boolean isSetBlipFill();
    
    /**
     * Sets the "blipFill" element
     */
    void setBlipFill(org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties blipFill);
    
    /**
     * Appends and returns a new empty "blipFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties addNewBlipFill();
    
    /**
     * Unsets the "blipFill" element
     */
    void unsetBlipFill();
    
    /**
     * Gets the "pattFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties getPattFill();
    
    /**
     * True if has "pattFill" element
     */
    boolean isSetPattFill();
    
    /**
     * Sets the "pattFill" element
     */
    void setPattFill(org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties pattFill);
    
    /**
     * Appends and returns a new empty "pattFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties addNewPattFill();
    
    /**
     * Unsets the "pattFill" element
     */
    void unsetPattFill();
    
    /**
     * Gets the "grpFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties getGrpFill();
    
    /**
     * True if has "grpFill" element
     */
    boolean isSetGrpFill();
    
    /**
     * Sets the "grpFill" element
     */
    void setGrpFill(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties grpFill);
    
    /**
     * Appends and returns a new empty "grpFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties addNewGrpFill();
    
    /**
     * Unsets the "grpFill" element
     */
    void unsetGrpFill();
    
    /**
     * Gets the "blend" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum getBlend();
    
    /**
     * Gets (as xml) the "blend" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode xgetBlend();
    
    /**
     * Sets the "blend" attribute
     */
    void setBlend(org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum blend);
    
    /**
     * Sets (as xml) the "blend" attribute
     */
    void xsetBlend(org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode blend);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  CT_Shape3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Shape3D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTShape3D extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTShape3D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctshape3d6783type");
    
    /**
     * Gets the "bevelT" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBevel getBevelT();
    
    /**
     * True if has "bevelT" element
     */
    boolean isSetBevelT();
    
    /**
     * Sets the "bevelT" element
     */
    void setBevelT(org.openxmlformats.schemas.drawingml.x2006.main.CTBevel bevelT);
    
    /**
     * Appends and returns a new empty "bevelT" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBevel addNewBevelT();
    
    /**
     * Unsets the "bevelT" element
     */
    void unsetBevelT();
    
    /**
     * Gets the "bevelB" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBevel getBevelB();
    
    /**
     * True if has "bevelB" element
     */
    boolean isSetBevelB();
    
    /**
     * Sets the "bevelB" element
     */
    void setBevelB(org.openxmlformats.schemas.drawingml.x2006.main.CTBevel bevelB);
    
    /**
     * Appends and returns a new empty "bevelB" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBevel addNewBevelB();
    
    /**
     * Unsets the "bevelB" element
     */
    void unsetBevelB();
    
    /**
     * Gets the "extrusionClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor getExtrusionClr();
    
    /**
     * True if has "extrusionClr" element
     */
    boolean isSetExtrusionClr();
    
    /**
     * Sets the "extrusionClr" element
     */
    void setExtrusionClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor extrusionClr);
    
    /**
     * Appends and returns a new empty "extrusionClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewExtrusionClr();
    
    /**
     * Unsets the "extrusionClr" element
     */
    void unsetExtrusionClr();
    
    /**
     * Gets the "contourClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor getContourClr();
    
    /**
     * True if has "contourClr" element
     */
    boolean isSetContourClr();
    
    /**
     * Sets the "contourClr" element
     */
    void setContourClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor contourClr);
    
    /**
     * Appends and returns a new empty "contourClr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewContourClr();
    
    /**
     * Unsets the "contourClr" element
     */
    void unsetContourClr();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "z" attribute
     */
    long getZ();
    
    /**
     * Gets (as xml) the "z" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetZ();
    
    /**
     * True if has "z" attribute
     */
    boolean isSetZ();
    
    /**
     * Sets the "z" attribute
     */
    void setZ(long z);
    
    /**
     * Sets (as xml) the "z" attribute
     */
    void xsetZ(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate z);
    
    /**
     * Unsets the "z" attribute
     */
    void unsetZ();
    
    /**
     * Gets the "extrusionH" attribute
     */
    long getExtrusionH();
    
    /**
     * Gets (as xml) the "extrusionH" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetExtrusionH();
    
    /**
     * True if has "extrusionH" attribute
     */
    boolean isSetExtrusionH();
    
    /**
     * Sets the "extrusionH" attribute
     */
    void setExtrusionH(long extrusionH);
    
    /**
     * Sets (as xml) the "extrusionH" attribute
     */
    void xsetExtrusionH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate extrusionH);
    
    /**
     * Unsets the "extrusionH" attribute
     */
    void unsetExtrusionH();
    
    /**
     * Gets the "contourW" attribute
     */
    long getContourW();
    
    /**
     * Gets (as xml) the "contourW" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetContourW();
    
    /**
     * True if has "contourW" attribute
     */
    boolean isSetContourW();
    
    /**
     * Sets the "contourW" attribute
     */
    void setContourW(long contourW);
    
    /**
     * Sets (as xml) the "contourW" attribute
     */
    void xsetContourW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate contourW);
    
    /**
     * Unsets the "contourW" attribute
     */
    void unsetContourW();
    
    /**
     * Gets the "prstMaterial" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum getPrstMaterial();
    
    /**
     * Gets (as xml) the "prstMaterial" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType xgetPrstMaterial();
    
    /**
     * True if has "prstMaterial" attribute
     */
    boolean isSetPrstMaterial();
    
    /**
     * Sets the "prstMaterial" attribute
     */
    void setPrstMaterial(org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum prstMaterial);
    
    /**
     * Sets (as xml) the "prstMaterial" attribute
     */
    void xsetPrstMaterial(org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType prstMaterial);
    
    /**
     * Unsets the "prstMaterial" attribute
     */
    void unsetPrstMaterial();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

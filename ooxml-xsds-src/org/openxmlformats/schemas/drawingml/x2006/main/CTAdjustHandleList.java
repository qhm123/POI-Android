/*
 * XML Type:  CT_AdjustHandleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_AdjustHandleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAdjustHandleList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAdjustHandleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctadjusthandlelistfdb0type");
    
    /**
     * Gets a List of "ahXY" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle> getAhXYList();
    
    /**
     * Gets array of all "ahXY" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle[] getAhXYArray();
    
    /**
     * Gets ith "ahXY" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle getAhXYArray(int i);
    
    /**
     * Returns number of "ahXY" element
     */
    int sizeOfAhXYArray();
    
    /**
     * Sets array of all "ahXY" element
     */
    void setAhXYArray(org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle[] ahXYArray);
    
    /**
     * Sets ith "ahXY" element
     */
    void setAhXYArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle ahXY);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ahXY" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle insertNewAhXY(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ahXY" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle addNewAhXY();
    
    /**
     * Removes the ith "ahXY" element
     */
    void removeAhXY(int i);
    
    /**
     * Gets a List of "ahPolar" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle> getAhPolarList();
    
    /**
     * Gets array of all "ahPolar" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle[] getAhPolarArray();
    
    /**
     * Gets ith "ahPolar" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle getAhPolarArray(int i);
    
    /**
     * Returns number of "ahPolar" element
     */
    int sizeOfAhPolarArray();
    
    /**
     * Sets array of all "ahPolar" element
     */
    void setAhPolarArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle[] ahPolarArray);
    
    /**
     * Sets ith "ahPolar" element
     */
    void setAhPolarArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle ahPolar);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ahPolar" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle insertNewAhPolar(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ahPolar" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle addNewAhPolar();
    
    /**
     * Removes the ith "ahPolar" element
     */
    void removeAhPolar(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

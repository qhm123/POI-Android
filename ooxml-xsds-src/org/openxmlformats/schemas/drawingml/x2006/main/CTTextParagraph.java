/*
 * XML Type:  CT_TextParagraph
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TextParagraph(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTextParagraph extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextParagraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttextparagraphcaf2type");
    
    /**
     * Gets the "pPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getPPr();
    
    /**
     * True if has "pPr" element
     */
    boolean isSetPPr();
    
    /**
     * Sets the "pPr" element
     */
    void setPPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties pPr);
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewPPr();
    
    /**
     * Unsets the "pPr" element
     */
    void unsetPPr();
    
    /**
     * Gets a List of "r" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun> getRList();
    
    /**
     * Gets array of all "r" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun[] getRArray();
    
    /**
     * Gets ith "r" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun getRArray(int i);
    
    /**
     * Returns number of "r" element
     */
    int sizeOfRArray();
    
    /**
     * Sets array of all "r" element
     */
    void setRArray(org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun[] rArray);
    
    /**
     * Sets ith "r" element
     */
    void setRArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun r);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun insertNewR(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun addNewR();
    
    /**
     * Removes the ith "r" element
     */
    void removeR(int i);
    
    /**
     * Gets a List of "br" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak> getBrList();
    
    /**
     * Gets array of all "br" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak[] getBrArray();
    
    /**
     * Gets ith "br" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak getBrArray(int i);
    
    /**
     * Returns number of "br" element
     */
    int sizeOfBrArray();
    
    /**
     * Sets array of all "br" element
     */
    void setBrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak[] brArray);
    
    /**
     * Sets ith "br" element
     */
    void setBrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak br);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak insertNewBr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak addNewBr();
    
    /**
     * Removes the ith "br" element
     */
    void removeBr(int i);
    
    /**
     * Gets a List of "fld" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTextField> getFldList();
    
    /**
     * Gets array of all "fld" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextField[] getFldArray();
    
    /**
     * Gets ith "fld" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextField getFldArray(int i);
    
    /**
     * Returns number of "fld" element
     */
    int sizeOfFldArray();
    
    /**
     * Sets array of all "fld" element
     */
    void setFldArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTextField[] fldArray);
    
    /**
     * Sets ith "fld" element
     */
    void setFldArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextField fld);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fld" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextField insertNewFld(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fld" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextField addNewFld();
    
    /**
     * Removes the ith "fld" element
     */
    void removeFld(int i);
    
    /**
     * Gets the "endParaRPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties getEndParaRPr();
    
    /**
     * True if has "endParaRPr" element
     */
    boolean isSetEndParaRPr();
    
    /**
     * Sets the "endParaRPr" element
     */
    void setEndParaRPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties endParaRPr);
    
    /**
     * Appends and returns a new empty "endParaRPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties addNewEndParaRPr();
    
    /**
     * Unsets the "endParaRPr" element
     */
    void unsetEndParaRPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

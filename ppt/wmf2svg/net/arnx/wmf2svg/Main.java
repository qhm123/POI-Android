/*
 * Copyright 2007-2008 Hidekatsu Izuno
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package net.arnx.wmf2svg;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;

import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import net.arnx.wmf2svg.gdi.Gdi;
import net.arnx.wmf2svg.gdi.svg.*;
import net.arnx.wmf2svg.gdi.wmf.*;

/**
 * @author Hidekatsu Izuno
 */
public class Main {
	private static Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		String src = "/sdcard/people001.wmf";
		String dest = "/sdcard/people001.svg";

		boolean debug = false;
		boolean compatible = false;

//		for (int i = 0; i < args.length; i++) {
//			if (args[i].startsWith("-")) {
//				if (args[i].equals("-debug")) {
//					debug = true;
//				} else if (args[i].equals("-compatible")) {
//					compatible = true;
//				} else {
//					usage();
//					return;
//				}
//			} else if (i == args.length - 2) {
//				src = args[i];
//			} else if (i == args.length - 1) {
//				dest = args[i];
//			}
//		}

//		if (src == null || dest == null) {
//			usage();
//			return;
//		}

		try {
			InputStream in = new FileInputStream(src);
			WmfParser parser = new WmfParser();
			final SvgGdi gdi = new SvgGdi(compatible);
			parser.parse(in, gdi);

			Document doc = gdi.getDocument();
			OutputStream out = new FileOutputStream(dest);
//			if (args[1].endsWith(".svgz")) {
//				out = new GZIPOutputStream(out);
//			}

			output(doc, out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void output(Document doc, OutputStream out) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,
				"-//W3C//DTD SVG 1.0//EN");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
				"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd");
		transformer.transform(new DOMSource(doc), new StreamResult(out));
		out.flush();
		out.close();
	}

	private static void usage() {
		System.out
				.println("java -jar wmf2svg.jar [wmf filename] [svg filename(svg, xml, or .svgz)]");
		System.exit(-1);
	}
}

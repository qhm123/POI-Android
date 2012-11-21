/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hslf.blip;

import org.apache.poi.hslf.usermodel.PictureData;
import org.apache.poi.poifs.filesystem.DocumentInputStream;

import and.awt.BufferedImage;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.poi.poiandroid.Utils;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Represents a bitmap picture data:  JPEG or PNG.
 * The data is not compressed and the exact file content is written in the stream.
 *
 * @author Yegor Kozlov
 */
public abstract  class Bitmap extends PictureData {

    public byte[] getData(){
    	Log.d("BitmapPainter", "Start Paint");
    	DocumentInputStream is = getStream();
    	byte[] imgdata = new byte[imgsize - 17];
    	try {
    		if (rawdataPos > is.position()) {
    			Log.d("Bitmap", "rawdataPos > is.position()");
    			is.skip(rawdataPos - is.position() + 17);
    		} else {
				is.reset();
				is.skip(rawdataPos + 17);
    		}
			
	    	is.read(imgdata, 0, imgdata.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
//    	final BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeByteArray(imgdata, 0, imgdata.length, options);
//
//        // Calculate inSampleSize
//        options.inSampleSize = Utils.calculateInSampleSize(options, 480, 800);
//
//        // Decode bitmap with inSampleSize set
//        options.inJustDecodeBounds = false;
//    	Bitmap bm = BitmapFactory.decodeByteArray(imgdata, 0, imgdata.length, options);
//    	Log.d("BitmapPainter", "bm: " + bm);
//    	img = new BufferedImage(bm);
    	
    	
//        byte[] rawdata = getRawData();
//        byte[] imgdata = new byte[rawdata.length-17];
//        System.arraycopy(rawdata, 17, imgdata, 0, imgdata.length);
        return imgdata;
    }

    public void setData(byte[] data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] checksum = getChecksum(data);
        out.write(checksum);
        out.write(0);
        out.write(data);

        setRawData(out.toByteArray());
    }
}

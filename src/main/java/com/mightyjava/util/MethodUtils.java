package com.mightyjava.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.HttpStatus;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class MethodUtils {

	private MethodUtils() {
	}

	public static String prepareErrorJSON(HttpStatus status, Exception ex) {
		JSONObject errorJSON = new JSONObject();
		try {
			errorJSON.put("status", status.value());
			errorJSON.put("error", status.getReasonPhrase());
			errorJSON.put("message", ex.getMessage().split(":")[0]);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return errorJSON.toString();
	}
}

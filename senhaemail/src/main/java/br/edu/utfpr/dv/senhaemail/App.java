package br.edu.utfpr.dv.senhaemail;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.adamiworks.utils.crypto.CryptoMode;
import com.adamiworks.utils.crypto.CryptoUtils;

public class App 
	private static final byte[] MAIL_KEY_PASSWORD = { -112, 78, -12, 45, -13, 51, -84, 8 };

	public static void main(String[] args) {
		CryptoUtils cu;
		try {
			cu = new CryptoUtils(CryptoMode.DES, MAIL_KEY_PASSWORD);

			String encriptedPassword = cu.encrypt(args[0]);

			System.out.println(encriptedPassword);

		} catch (InvalidKeyException, NoSuchAlgorithmException,
            NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
            InvalidAlgorithmParameterException e) {
			e.printStackTrace();
	}
	}
}

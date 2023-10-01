//import javax.crypto.Cipher;
//import javax.crypto.spec.SecretKeySpec;
//import org.apache.commons.codec.binary.Base64;
///**
// *
// */
//public class AES {
//
//    //Encrypt
//    public static String Encrypt(String sSrc, String sKey) throws Exception {
//        if (sKey == null) {
//            System.out.print("Key is null");
//            return null;
//        }
//        byte[] raw = sKey.getBytes("utf-8");
//        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
//        byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
//
//        return new Base64().encodeToString(encrypted);
//    }
//
//    //Decrypt
//    public static String Decrypt(String sSrc, String sKey) throws Exception {
//        try {
//            if (sKey == null) {
//                System.out.print("Key is null");
//                return null;
//            }
//            byte[] raw = sKey.getBytes("utf-8");
//            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
//            byte[] encrypted1 = new Base64().decode(sSrc);
//            try {
//                byte[] original = cipher.doFinal(encrypted1);
//                String originalString = new String(original,"utf-8");
//                return originalString;
//            } catch (Exception e) {
//                System.out.println(e.toString());
//                return null;
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.toString());
//            return null;
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        /*
//         * 使用AES-128-ECB加密模式，key需要16位
//         */
//        String cKey = "0000000000000000";
//        String cSrc = "咩";
//        System.out.println(cSrc);
//        //Encrypt
//        String enString = AES.Encrypt(cSrc, cKey);
//        System.out.println("Encrypt：" + enString);
//
//        //Decrypt
//        String DeString = AES.Decrypt(enString, cKey);
//        System.out.println("Decrypt：" + DeString);
//    }
//}
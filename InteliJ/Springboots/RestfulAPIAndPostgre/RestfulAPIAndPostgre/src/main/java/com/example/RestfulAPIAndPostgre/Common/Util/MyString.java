package com.example.RestfulAPIAndPostgre.Common.Util;

import java.util.regex.Pattern;

public class MyString {
    private static final Pattern SPECIALCHARACTER = Pattern.compile("[^a-z0-9-/ ]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");
    private static final Pattern MULTIPLEDASH = Pattern.compile("[-]+");

    public static String generateSlug(String str, boolean hierarchical)
    {
        String slug = str.trim().toLowerCase();
        String[] decomposed = new String[] { "à","á","ạ","ả","ã","â","ầ","ấ","ậ","ẩ","ẫ","ă",
                "ằ","ắ","ặ","ẳ","ẵ","è","é","ẹ","ẻ","ẽ","ê","ề" ,
                "ế","ệ","ể","ễ", "ì","í","ị","ỉ","ĩ", "ò","ó","ọ",
                "ỏ","õ","ô","ồ","ố","ộ","ổ","ỗ","ơ" ,"ò","ớ","ợ","ở",
                "õ", "ù","ú","ụ","ủ","ũ","ư","ừ","ứ","ự","ử","ữ",
                "ỳ","ý","ỵ","ỷ","ỹ", "đ",
                "À","À","Ạ","Ả","Ã","Â","Ầ","Ấ","Ậ","Ẩ","Ẫ","Ă" ,
                "Ằ","Ắ","Ặ","Ẳ","Ẵ", "È","É","Ẹ","Ẻ","Ẽ","Ê","Ề",
                "Ế","Ệ","Ể","Ễ", "Ì","Í","Ị","Ỉ","Ĩ", "Ò","Ó","Ọ","Ỏ",
                "Õ","Ô","Ồ","Ố","Ộ","Ổ","Ỗ","Ơ" ,"Ờ","Ớ","Ợ","Ở","Ỡ",
                "Ù","Ú","Ụ","Ủ","Ũ","Ư","Ừ","Ứ","Ự","Ử","Ữ", "Ỳ","Ý","Ỵ",
                "Ỷ","Ỹ", "Đ"};
        String[] precomposed =  {  "à","á","ạ","ả","ã","â","ầ","ấ","ậ","ẩ","ẫ","ă",
                "ằ","ắ","ặ","ẳ","ẵ","è","é","ẹ","ẻ","ẽ","ê","ề" ,
                "ế","ệ","ể","ễ", "ì","í","ị","ỉ","ĩ", "ò","ó","ọ","ỏ",
                "õ","ô","ồ","ố","ộ","ổ","ỗ","ơ" ,"ờ","ớ","ợ","ở","ỡ", "ù",
                "ú","ụ","ủ","ũ","ư","ừ","ứ","ự","ử","ữ", "ỳ","ý","ỵ","ỷ","ỹ",
                "đ", "À","Á","Ạ","Ả","Ã","Â","Ầ","Ấ","Ậ","Ẩ","Ẫ","Ă" ,"Ằ","Ắ",
                "Ặ","Ẳ","Ẵ", "È","É","Ẹ","Ẻ","Ẽ","Ê","Ề","Ế","Ệ","Ể","Ễ", "Ì",
                "Í","Ị","Ỉ","Ĩ", "Ò","Ó","Ọ","Ỏ","Õ","Ô","Ồ","Ố","Ộ","Ổ","Ỗ",
                "Ơ" ,"Ờ","Ớ","Ợ","Ở","Ỡ", "Ù","Ú","Ụ","Ủ","Ũ","Ư","Ừ","Ứ","Ự",
                "Ử","Ữ", "Ỳ","Ý","Ỵ","Ỷ","Ỹ", "Đ"};
        String[] latin =  { "a","a","a","a","a","a","a","a","a","a","a" ,
                "a","a","a","a","a","a", "e","e","e","e","e",
                "e","e","e","e","e","e", "i","i","i","i","i", "o",
                "o","o","o","o","o","o","o","o","o","o","o" ,"o","o","o","o","o",
                "u","u","u","u","u","u","u","u","u","u","u", "y","y","y","y","y", "d",
                "a","a","a","a","a","a","a","a","a","a","a","a" ,"a","a","a","a","a",
                "e","e","e","e","e","e","e","e","e","e","e", "i","i","i","i","i", "o",
                "o","o","o","o","o","o","o","o","o","o","o" ,"o","o","o","o","o", "u",
                "u","u","u","u","u","u","u","u","u","u", "y","y","y","y","y", "d"};
        // Convert culture specific characters
        for (int i = 0; i < decomposed.length; i++)
        {
            slug = slug.replace(decomposed[i], latin[i]);
            slug = slug.replace(precomposed[i], latin[i]);
        }
        // Remove special characters
        slug = SPECIALCHARACTER.matcher(slug).replaceAll("").replace("--", "-");
        // Remove whitespaces
        slug = WHITESPACE.matcher(slug).replaceAll("-");
        // Remove slash if non-hierarchical
        if (!hierarchical)
            slug = slug.replace("/", "-");
        // Remove multiple dashes
        slug = MULTIPLEDASH.matcher(slug).replaceAll("-");
        // Remove leading & trailing dashes
        if (slug.endsWith("-"))
            slug = slug.substring(0, slug.lastIndexOf("-"));
        if (slug.startsWith("-"))
            slug = slug.substring(Math.min(slug.indexOf("-") + 1, slug.length()));
        return slug;
    }
    public static String generateSlug(String str){
        return generateSlug(str, true);
    }
    public static String capitalizeEachWord(String str){
        //để chuyển đổi message thành một mảng kiểu char
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if(Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if(foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        // chuyển đổi mảng char thành string
        return String.valueOf(charArray);
    }

    public static String generateRoleName(String str){
        String userName = str.trim().toLowerCase();
        String[] decomposed = new String[] { "à","á","ạ","ả","ã","â","ầ","ấ","ậ","ẩ","ẫ","ă",
                "ằ","ắ","ặ","ẳ","ẵ","è","é","ẹ","ẻ","ẽ","ê","ề" ,
                "ế","ệ","ể","ễ", "ì","í","ị","ỉ","ĩ", "ò","ó","ọ",
                "ỏ","õ","ô","ồ","ố","ộ","ổ","ỗ","ơ" ,"ò","ớ","ợ","ở",
                "õ", "ù","ú","ụ","ủ","ũ","ư","ừ","ứ","ự","ử","ữ",
                "ỳ","ý","ỵ","ỷ","ỹ", "đ",
                "À","À","Ạ","Ả","Ã","Â","Ầ","Ấ","Ậ","Ẩ","Ẫ","Ă" ,
                "Ằ","Ắ","Ặ","Ẳ","Ẵ", "È","É","Ẹ","Ẻ","Ẽ","Ê","Ề",
                "Ế","Ệ","Ể","Ễ", "Ì","Í","Ị","Ỉ","Ĩ", "Ò","Ó","Ọ","Ỏ",
                "Õ","Ô","Ồ","Ố","Ộ","Ổ","Ỗ","Ơ" ,"Ờ","Ớ","Ợ","Ở","Ỡ",
                "Ù","Ú","Ụ","Ủ","Ũ","Ư","Ừ","Ứ","Ự","Ử","Ữ", "Ỳ","Ý","Ỵ",
                "Ỷ","Ỹ", "Đ"};
        String[] precomposed =  {  "à","á","ạ","ả","ã","â","ầ","ấ","ậ","ẩ","ẫ","ă",
                "ằ","ắ","ặ","ẳ","ẵ","è","é","ẹ","ẻ","ẽ","ê","ề" ,
                "ế","ệ","ể","ễ", "ì","í","ị","ỉ","ĩ", "ò","ó","ọ","ỏ",
                "õ","ô","ồ","ố","ộ","ổ","ỗ","ơ" ,"ờ","ớ","ợ","ở","ỡ", "ù",
                "ú","ụ","ủ","ũ","ư","ừ","ứ","ự","ử","ữ", "ỳ","ý","ỵ","ỷ","ỹ",
                "đ", "À","Á","Ạ","Ả","Ã","Â","Ầ","Ấ","Ậ","Ẩ","Ẫ","Ă" ,"Ằ","Ắ",
                "Ặ","Ẳ","Ẵ", "È","É","Ẹ","Ẻ","Ẽ","Ê","Ề","Ế","Ệ","Ể","Ễ", "Ì",
                "Í","Ị","Ỉ","Ĩ", "Ò","Ó","Ọ","Ỏ","Õ","Ô","Ồ","Ố","Ộ","Ổ","Ỗ",
                "Ơ" ,"Ờ","Ớ","Ợ","Ở","Ỡ", "Ù","Ú","Ụ","Ủ","Ũ","Ư","Ừ","Ứ","Ự",
                "Ử","Ữ", "Ỳ","Ý","Ỵ","Ỷ","Ỹ", "Đ"};
        String[] latin =  { "a","a","a","a","a","a","a","a","a","a","a" ,
                "a","a","a","a","a","a", "e","e","e","e","e",
                "e","e","e","e","e","e", "i","i","i","i","i", "o",
                "o","o","o","o","o","o","o","o","o","o","o" ,"o","o","o","o","o",
                "u","u","u","u","u","u","u","u","u","u","u", "y","y","y","y","y", "d",
                "a","a","a","a","a","a","a","a","a","a","a","a" ,"a","a","a","a","a",
                "e","e","e","e","e","e","e","e","e","e","e", "i","i","i","i","i", "o",
                "o","o","o","o","o","o","o","o","o","o","o" ,"o","o","o","o","o", "u",
                "u","u","u","u","u","u","u","u","u","u", "y","y","y","y","y", "d"};
        // Convert culture specific characters
        for (int i = 0; i < decomposed.length; i++)
        {
            userName = userName.replace(decomposed[i], latin[i]);
            userName = userName.replace(precomposed[i], latin[i]);
        }
        // Remove whitespaces
        userName = WHITESPACE.matcher(userName).replaceAll("-");
        return userName.toUpperCase();
    }
}

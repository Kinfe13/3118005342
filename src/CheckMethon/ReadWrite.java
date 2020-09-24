package CheckMethon;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    //读取TXT文档
    public static String ReadFileTxt(String path) throws IOException {
        String filepath = path;
        String text = new String();
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filepath), "UTF8"));
        String str;
        while((str = in.readLine()) != null)
            text += str;
        in.close();
        return text;
    }

    //查重结果写入TXT文档
    public static void WriteFile(int l1,int l2,int l3,int l4,int l5,String str,String str1,String str2,String str3,String str4,String str5) {
        try {
            File writeName = new File("F:\\IDEA\\paperCheck\\testTXT\\test\\result.txt"); // 绝对路径
            //writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                if (l1<str.length()){
                    out.write("add:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l1 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str1.length() + "\r\n");
                    float temp = (float) l1 / str.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }else {
                    out.write("add:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l1 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str1.length() + "\r\n");
                    float temp = (float) l1 / str1.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }

                if (l2<str.length()){
                    out.write("del:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l2 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str2.length() + "\r\n");
                    float temp = (float) l2 / str.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }else {
                    out.write("del:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l2 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str2.length() + "\r\n");
                    float temp = (float) l2 / str2.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }

                if (l3<str.length()){
                    out.write("dis_1:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l3 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str3.length() + "\r\n");
                    float temp = (float) l3 / str.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }else {
                    out.write("dis_1:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l3 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str3.length() + "\r\n");
                    float temp = (float) l3 / str3.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }

                if (l4<str.length()){
                    out.write("dis_10:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l4 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str4.length() + "\r\n");
                    float temp = (float) l4 / str.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }else {
                    out.write("dis_10:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l4 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str4.length() + "\r\n");
                    float temp = (float) l4 / str4.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }

                if (l5<str.length()){
                    out.write("dis_15:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l5 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str5.length() + "\r\n");
                    float temp = (float) l5 / str.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }else {
                    out.write("dis_15:\r\n"); // \r\n即为换行
                    out.write("公共子串长度：" + l5 + "\r\n"); // \r\n即为换行
                    out.write("原文最长长度：" + str.length() + "\r\n");
                    out.write("改文最长长度：" + str5.length() + "\r\n");
                    float temp = (float) l5 / str5.length();
                    float Similarity = (float)(Math.round(temp*100))/100;
                    out.write("论文相似度：" + Similarity + "\r\n");
                    out.write("\r\n"); // \r\n即为换行
                }

                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

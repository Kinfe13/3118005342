package CheckMethon;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class CheckPaperTest {
    public static void main(String[] args) throws IOException {
        //读取文档并计算最长公共子串
        //原文读取
        String str = ReadWrite.ReadFileTxt("F:\\IDEA\\paperCheck\\testTXT\\test\\orig.txt");
        //add读取
        String str1 = ReadWrite.ReadFileTxt("F:\\IDEA\\paperCheck\\testTXT\\test\\orig_0.8_add.txt");
        int l1 = LongestSonMethod.LongestSon(str, str1);
        //del读取
        String str2 = ReadWrite.ReadFileTxt("F:\\IDEA\\paperCheck\\testTXT\\test\\orig_0.8_del.txt");
        int l2 = LongestSonMethod.LongestSon(str, str2);
        //dis_1读取
        String str3 = ReadWrite.ReadFileTxt("F:\\IDEA\\paperCheck\\testTXT\\test\\orig_0.8_dis_1.txt");
        int l3 = LongestSonMethod.LongestSon(str, str3);
        //dis_10读取
        String str4 = ReadWrite.ReadFileTxt("F:\\IDEA\\paperCheck\\testTXT\\test\\orig_0.8_dis_10.txt");
        int l4 = LongestSonMethod.LongestSon(str, str4);
        //dis_15读取
        String str5 = ReadWrite.ReadFileTxt("F:\\IDEA\\paperCheck\\testTXT\\test\\orig_0.8_dis_15.txt");
        int l5 = LongestSonMethod.LongestSon(str, str5);

        //写入TXT文档
        ReadWrite.WriteFile(l1,l2,l3,l4,l5,str,str1,str2,str3,str4,str5);

        //输出查重结果
       /* System.out.println("add:");
        print(l1, str, str1);
        System.out.println();

        System.out.println("del:");
        print(l2, str, str2);
        System.out.println();

        System.out.println("dis_1:");
        print(l3, str, str3);
        System.out.println();

        System.out.println("dis_10:");
        print(l4, str, str4);
        System.out.println();

        System.out.println("dis_15:");
        print(l5, str, str5);
        System.out.println();*/
    }
/*
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
    */

/*
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
*/
    //输出查重结果
    /*public static void print(int l,String str1,String str2){
        if (l<str1.length()) {
            System.out.println("公共子串长度：" + l);
            System.out.println("原文最长长度：" + str1.length());
            System.out.println("改文最长长度：" + str2.length());
            float temp = (float) l / str1.length();
            float Similarity = (float)(Math.round(temp*100))/100;
            System.out.println("论文的重复率：" + Similarity);
        }else {
            System.out.println("公共子串长度：" + l);
            System.out.println("原文最长长度：" + str1.length());
            System.out.println("改文最长长度：" + str2.length());
            float temp = (float) l / str2.length();
            float Similarity = (float)(Math.round(temp*100))/100;
            System.out.println("论文的重复率：" + Similarity);
        }
    }*/
}

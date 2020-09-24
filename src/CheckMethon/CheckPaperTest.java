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


    }

}

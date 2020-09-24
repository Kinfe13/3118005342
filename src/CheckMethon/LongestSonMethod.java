package CheckMethon;

//求最长公共子串长度算法实现类
public class LongestSonMethod implements LongestSon{
    public static int LongestSon(String str1, String str2) {
        //因为要形成上图的表格，所以给两个字符串头多添了一个字符
        //使第一行和第一列都变为0
        String s1 = "2" + str1;
        String s2 = "1" + str2;

        //创建二位表格
        int[][] check = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                //第一行/列为0
                if (i == 0 || j == 0)
                {
                    check[i][j] = 0;
                }
                //若字符相同，则递增填入相同字符数
                else if (s1.charAt(i) == s2.charAt(j)) {
                    check[i][j] = (check[i - 1][j - 1] + 1);
                }
                //若字符不相同，则取上一个数和左边的数中大的数填入二维表格
                else {
                    if (check[i - 1][j] > check[i][j - 1])
                        check[i][j] = check[i - 1][j];
                    else
                        check[i][j] = check[i][j - 1];
                }
            }
        }
        //返回二维数组的最后一位，即最长公共子序列
        return check[s1.length() - 1][s2.length() - 1];
    }
}

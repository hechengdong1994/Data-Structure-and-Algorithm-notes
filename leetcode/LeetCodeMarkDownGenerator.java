import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeMarkDownGenerator {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(49, "group-anagrams");

        map.forEach((key, value) -> {
            try {
                generateMarkdownFile(key, value);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public static void generateMarkdownFile(int num, String title) throws IOException {
        // 拼接文件名
        String fileName = String.format("%04d", num) + "-" + title + ".md";

        // 创建文件
        File file = new File("F:\\github\\data-structure-and-algorithm-notes\\leetcode\\" + fileName);
        if (file.createNewFile()) {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("# " + title + "\n" +
                    "\n" +
                    "https://leetcode-cn.com/problems/" + title + "/\n" +
                    "\n" +
                    "\n" +
                    "## 1 方法一\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "```java\n" +
                    "\n" +
                    "```\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "## 2 方法二\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "```java\n" +
                    "\n" +
                    "```\n" +
                    "\n" +
                    "\n");
            fileWriter.close();
        }
    }
}

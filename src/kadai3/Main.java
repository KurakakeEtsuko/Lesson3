package kadai3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

	Map<String, String> lineMap = new HashMap<>();
	lineMap.put("シャツ", "1枚100円からになります。");
	lineMap.put("コート", "1枚500円からになります。");
	lineMap.put("スーツ", "1枚300円からになります。");

	System.out.println(lineMap.get("シャツ"));
	System.out.println(lineMap.get("コート"));
	System.out.println(lineMap.get("スーツ"));

	String[] optionMenu = { "しみ抜き", "漂白加工", "プレス加工", "シロセット加工", "汗抜き" };

	int option = 4;

	try {
	    System.out.println("追加オプションで" + optionMenu[option] + "をやっております。");
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println(option + "は追加オプションをしておりません。");
	} finally {
	    System.out.println("ありがとうございます。");

	}

	List<String> menu = new ArrayList<>();
	menu.add("しみ抜き");
	menu.add("漂白加工");
	menu.add("プレス加工");
	menu.add("シロセット加工");
	menu.add("汗抜き");

	System.out.println("当店は" + menu.toString() + "のみオプション追加できます。");
    }

}

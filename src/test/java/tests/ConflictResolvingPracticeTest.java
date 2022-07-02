package tests;

import runner.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class ConflictResolvingPracticeTest extends BaseTest {

    public static String getText5(String text) {

        String str = null;

        return text.concat("Text2").concat("Text3");
    }

    public static List<String> getListWithText(String text) {

        List<String> list = new ArrayList<>();
        list.add(text);

        return list;
    }
}

package ch12;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(
            new FullBorder(
                new FullBorder(
                    new SideBorder(
                        new FullBorder(new StringDisplay("こんにちは。")),'*'
                    )
                )
            ),
            '/'
        );
        b4.show();

        // 問題12-1
        b2 = new UpDownBorder(b1, '-');
        b4 = new FullBorder(
            new UpDownBorder(
                new SideBorder(
                    new UpDownBorder(
                        new SideBorder(
                            new StringDisplay("こんにちは。"),
                            '*'
                        ),
                        '='
                    ),
                    '|'
                ),
                '/'
            )
        );
        b4.show();

        // 問題12-2
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("おはようございます。");
        md.add("こんにちは。");
        md.add("おやすみなさい、また明日。");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();
        Display d2 = new FullBorder(md);
        d2.show();
    }
}

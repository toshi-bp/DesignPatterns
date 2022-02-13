package ch19;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SafeFrame extends Frame implements ActionListener, Context{
    private TextField textClock = new TextField(60); // 現在時刻表示
    private TextArea textScreen = new TextArea(10, 60); // 警備センター出力
    private Button buttonUse = new Button("金庫使用");
    private Button buttonAlarm = new Button("非常ベル");
    private Button buttonPhone = new Button("通常通話");
    private Button buttonExit = new Button("終了");

    private State state = DayState.getInstance();

    // コンストラクタ
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // textClockを配置
        add(textClock, BorderLayout.NORTH);
        // textScreenを配置
        // パネルにボタンを格納
        // そのパネルを配置
        // 表示
        // リスナーの設定
        // ボタンが押されたらここに来る
        // 時刻の設定
        // 状態変化
        // 警備センター呼び出し
        // 警備センター記録
    }
}

# `Singleton`パターン

# 概要
- `Singleton`パターンとは指定したクラスのインスタンスが絶対に1個しか存在しないことを保証するパターンのことである
- singletonとは, 要素を1個しか持たない集合のことである
    > singleton: 単集合
- システムの中に1個しかインスタンスが存在しないことを表現したい時の事例は以下に示す通りである
    - コンピューがそのものを表現したクラス
    - 現在のシステム設定を表現したクラス
    - ウインドウシステムを表現したクラス

# サンプルプログラム
サンプルプログラムはインスタンスが1個しか存在しないことを示すものとなっている.

| クラス名 | 解説 |
| --- | --- |
| Singleton | インスタンスが1つしか存在しないクラス |
| Main | 動作テスト用のクラス |

## 備考
- `Singleton`クラスでは, インスタンスは1つしか作られない
    - `static`フィールド(クラス変数)として`singleton`が定義され, それを`singleton`クラスのロード時に一度だけ行われる
    - `Singleton`クラスのコンストラクタは`private`になっており, これは`Singleton`クラス外からコンストラクタを呼び出すことを禁止するためである
    - もし, 下のような式があったとしても, コンパイル時にエラーとなる
        ```java
        new Singleton();
        ```
    - 唯一のインスタンスを得るメソッドは何かしら必要となる. サンプルプログラムでは`getInstance`メソッドがその役割を担っている
    - 以下に示すコードのように`Singleton`クラスを作成したとしても, 厳密には`Singleton`パターンにはならない
        ```java
        public class Singleton {
            private static Singleton singleton = null;
            private Singleton() {
                System.out.println("インスタンスを生成しました");
            }
            public static Singleton getInstance() {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                return singleton;
            }
        }
        ```
        - これはマルチスレッドからほぼ同時に`getInstance`メソッドが実行された際に, インスタンスが複数生成されてしまうからである
- `Main`クラスは`Singleton`クラスを利用しているクラスである
    - `getInstance`メソッドを2回実行し, それぞれの返り値が等しいか否か(生成されたインスタンスが本当に1つだけなのか)の判定を行っている

# 登場人物
- `Singleton`の役
    - 唯一のインスタンスを得るための`static`メソッドを持っている
        - このメソッドは位置も同じインスタンスを返す

# パターンを使う意義
## 制限を設ける理由
インスタンスの数に制限を設けている(前提となる条件を増やしている)のは, インスタンスが複数存在した場合に起こる, インスタンスたちが相互に影響し合って, 思いがけないバグを生み出してしまう可能性を0にするためである.
## 唯一のインスタンスはいつ生成されるのか
サンプルプログラムを実行すると,
```
Start.
インスタンスを生成しました
```
というような表示となる. つまり, 実行開始後に最初に`getInstance`メソッドを呼び出した時に`Singleton`クラスは初期化される. そして, その時に`static`フィールドの初期化が行われ, 唯一のインスタンスが作られる.

# 関連しているパターン
- Abstract Factoryパターン(第8章)
- Builderパターン(第7章)
- Facadeパターン(第15章)
- Prototypeパターン(第6章)
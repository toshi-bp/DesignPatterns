# `Template Method`パターン

# 概要
- `Template Method`パターンとはテンプレートの機能を持つパターンである
- スーパークラスの方にテンプレートとなるメソッドが定義されている
- メソッドの定義の中では抽象メソッドが使われている
    - →スーパークラスのプログラムを読むだけでは, 最終的にどんな処理をすることになるかはわからない
    - 抽象メソッドをどのように呼び出しているかはわかる
- 抽象メソッドはサブクラスで実際に実装される
    - サブクラスの側で実装をすることで具体的な処理を決定する
    - もちろん, 異なるサブクラスで異なる実装を行えば, 異なる処理が行われる
- 処理の大きな流れはスーパークラスで組み立てた通りになる

# サンプルプログラム
サンプルプログラムは「文字や文字列を5回繰り返して表示する」というものである.

サンプルプログラムのクラス一覧
| クラス名 | 解説 |
| --- | --- | --- |
| `AbstractDisplay` | メソッド`display`のみ実装している**抽象クラス** |
| `CharDisplay` | メソッド`open`, `print`, `close`を実装しているクラス |
| `StringDisplay` | メソッド`open`, `print`, `close`を実装しているクラス |
| Main | 動作テスト用のクラス |

## 備考
- `AbstractDisplay`クラスでは

# 登場人物

# パターンを使う意義

# 関連しているパターン
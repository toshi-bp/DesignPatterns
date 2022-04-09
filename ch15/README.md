# `Facade`パターン

# 概要

- `Facade`パターンとは大きなプログラムに対してその処理を行うための「窓口」を用意するパターンである
- そのようにすると, 個別にクラスを制御することなく処理を行うことができる(「窓口」に要求を出せば良い)

# サンプルプログラム

サンプルプログラムはユーザーの Web ページを作成するものである

| パッケージ | クラス名   | 解説                                                  |
| ---------- | ---------- | ----------------------------------------------------- |
| pagemaker  | Database   | メールアドレスからユーザ名を得るクラス                |
| pagemaker  | HtmlWriter | HTML ファイルを作成するクラス                         |
| pagemaker  | PageMaker  | メールアドレスからユーザの Web ページを作成するクラス |
| 無名       | Main       | 動作テスト用のクラス                                  |

## 備考

- ``

# 登場人物

- ## ``()

# パターンを使う意義

##

-

# 関連しているパターン

- パターン(第`num`章)
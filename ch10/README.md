# `Strategy`パターン

# 概要

- `Strategy`パターンとはアルゴリズム部分をごっそりと交換できるようにするパターン

# サンプルプログラム

サンプルプログラムはではコンピュータでじゃんけんを行うものである.

2 つの戦略を交換可能とするプログラムの実装を行う

| 名前            | 解説                                                   |
| --------------- | ------------------------------------------------------ |
| Hand            | じゃんけんの「手」を表すクラス                         |
| Strategy        | じゃんけんの「戦略」を表すインターフェース             |
| WinningStrategy | 勝ったら次も同じ手を出す戦略を表すクラス               |
| ProbStrategy    | 1 回前の手から次の手を確率的に計算する戦略を表すクラス |
| Player          | じゃんけんを行うプレイヤーのクラス                     |
| Main            | 動作テスト用のクラス                                   |

## 備考

- ``

# 登場人物

- ## ``()

# パターンを使う意義

##

-

# 関連しているパターン

- パターン(第`num`章)
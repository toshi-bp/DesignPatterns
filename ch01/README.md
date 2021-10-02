# `Iterator`パターン

# 概要
- `Iterator`パターンとは, 何かがたくさん集まっている時に, それを順番に指し示していき, 全体をスキャンしていく処理を行うためのもの.
> iterate: 繰り返す

# サンプルプログラム
サンプルプログラムでは, 本棚(Bookshelf)の中に本(Book)を入れ, その本の名前を順番に表示ような仕様となっている.

サンプルプログラムにおけるクラスとインターフェース一覧
|  名前  |  解説 | インターフェースorクラス |
| ---- | ---- | ---- |
| `Aggregate` |  集合体を表す  | インターフェース |
| `Iterator` |  数え上げ, スキャンを行う  | インターフェース |
| `Book` | 本を表す | クラス |
| `BookShelf` | 本棚を表す | クラス |
| `BookShelfIterator` | 本棚をスキャンする | クラス |
| `Main` | 動作テスト用 | クラス |

# 登場人物
- `Iterator`
    - 要素を順番にスキャンしていくインターフェース(API)を定める役
- `ConcreteIterator`
    - Iterator役が定めたインターフェース(API)を実際に実装する役
- `Aggregate`
    - `Iterator`役を作り出すインターフェース(API)を定める役
    - インターフェースは「自身が持っている要素を順番にスキャンしてくれる人」を作り出すメソッドということになる
- `ConcreteAggregate`
    - `Aggregate`役が定めたインターフェース(API)を実際に実装する役. 具体的な`Iterator`役(→`ConcreteIterator`役)のインスタンスを作り出す.

# Iteratorパターンを使う意義
Iteratorを使うことで ,実装とは切り離して, 数え上げを行うことができる.
具体的には, 本の管理を配列ではなく, `java.util.Vector`としても, `BookShelf`が`iterator`メソッドを持っている.
```java
while (it.hasNext()) {
        Book book = (Book)it.next();
        System.out.println(book.getName());
    }
```

→**正しい`Iterator`を返してくれれば(`hasNext`と`next`メソッドが正しく実装されているクラスのインスタンスを返してくれば), `while`ループを全く変更しなくても動作する**

# 備考
- `next`は「現在の要素を返しつつ, 次の位置に進める」メソッドである.
- `hasNext`は最後の要素を得た後に`false`を返すメソッドである.
- Javaでは, 使われなくなったインスタンスは自動的に削除されるため, `iterator`に対応した`deleteIterator`メソッドは不要である.

# Iteratorの種類
- 最初から開始して進めていく
- 最後尾から開始して逆方向に進む
- 順方向も逆方向にもいく(not only `next` method, but also `previous` method)
- 番号を指定して, いきなりそこにジャンプする

# 関連しているパターン
- Visitorパターン(→第13章)
- Compositeパターン(→第11章)
- Factory Methodパターン(→第4章)
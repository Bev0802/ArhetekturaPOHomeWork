## OCP: Open-Closed Principle. 
### Принцип открытости или закрытости
_____
Класс должен быть открыт для расширения, но закрыт для модификации.

Программные сущности (классы, модули, функции) открыты для расширения,
но закрыты для модификации. Это означает, что должна быть возможность
изменять внешнее поведение класса, не внося физических изменений в сам
класс. Следуя этому принципу, классы разрабатываются так, чтобы для
подстройки класса к конкретным условиям применения было достаточно
расширить его и переопределить некоторые функции.

Главная концепция этого принципа — то, что класс открыт для расширений, но
закрыт от модификаций.

Мы должны разработать свой модуль так, чтобы новая функциональность
добавлялась только при создании новых требований.

Статус «Закрыт для модификации» означает, что мы уже разработали класс, и
он прошёл модульное тестирование. Не меняем его, пока не найдём ошибки.
Как говорится, класс должен быть открытым только для расширений, и мы
можем использовать для этого наследование.

### Открыт для расширения

То есть класс создаётся таким образом, чтобы поведение класса можно было
дополнить в любой момент. По мере изменения требований мы должны иметь
возможность дополнить класс новой функциональностью.

### Закрыт для модификации

При добавлении новой функциональности нельзя вносить изменения в
исходный код такого класса. То есть весь новый код не должен затрагивать
старый.

### Суть принципа

Важно, чтобы изменения в программе происходили при написании нового
кода, а не модификации старого.

Принцип открытости или закрытости сформулировал Бертран Мейер в 1988
году: «Программные сущности должны быть открыты для расширения и
закрыты для изменения». Важно расширять поведение программных
сущностей без их изменения. Если строго соблюдать этот принцип, можно
регулировать поведение кода без изменения самого исходника.
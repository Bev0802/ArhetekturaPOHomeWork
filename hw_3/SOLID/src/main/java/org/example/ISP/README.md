## ISP: Interface Segregation Principle.
### Принцип разделения интерфейсов
_____
Лучше создавать много отдельных узкоспециализированных интерфейсов, чем
один, который включает в себя множество функций. Это позволит сделать
архитектуру более гибкой и использовать интерфейсы по отдельности.
Этот принцип похож на первый, принцип единой ответственности.

    💡 Клиенты не должны попадать в зависимость от методов, которыми они не
    пользуются.

Интерфейс считается абстракцией внешнего представления класса и
описывает все доступные методы для работы с ним. В языках, где нет
поддержки интерфейсов, они эмулируются через классы с пустыми методами.
То есть интерфейсы — классы, у которых есть исключительно публичные
методы, и у них нет реализации, они реализуются классами, их
использующими.

Этот принцип призывает разработчиков программного обеспечения избегать
зависимости от всего, что не используется. То есть слишком большие
интерфейсы требуется разделять на более маленькие, чтобы программные
сущности маленьких интерфейсов знали только о методах, которые требуются
им в работе.

### Цели принципа:
1. Принцип борется с толстыми интерфейсами — с интерфейсами на все
   случаи жизни.
2. По сути, это принцип персональной ответственности, но для
   интерфейсов, то есть каждый интерфейс должен делать одну свою
   задачу.
3. Интерфейс должен быть абстрактным — иметь универсальное имя и
   никому не принадлежать.

### Принцип применяется
1. Для создания абстракций (повышение гибкости).
2. Используется в принципе DIP.

### Опасности
1. Добавление метода в интерфейс заставляет реализовывать его в
   классах-наследниках.
2. Заранее хорошо продумывайте абстракции.
3. Заранее продумывайте интерфейс, а потом — класс.

   Если происходит наоборот: сначала реализовывается класс, а потом часть его
   методов переходит в интерфейс, стоит задуматься, а всё ли вы делаете
   правильно. Это пагубная привычка и признак возможной проблемы.
   
### Суть принципа
1. Много специализированных интерфейсов лучше, чем один
   универсальный.
2. Этот принцип призывает разработчиков программного обеспечения
   избегать зависимости от всего, что не используется. То есть слишком
   большие интерфейсы надо разделять на более маленькие, чтобы
   программные сущности маленьких интерфейсов знали только о методах,
   которые требуются им в работе.
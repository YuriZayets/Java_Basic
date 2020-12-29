package Classes;

public class Answers {
//          1.	Опишите процедуру инициализации полей класса и полей экземпляра класса. Когда инициализируются поля класса,
//          а когда – поля экземпляров класса. Какие значения присваиваются полям по умолчанию? Где еще в классе полям могут быть присвоены начальные значения?
//
//    Инициализация – присвоение начального значения переменной.
//    Процедура инициализации полей может выглядеть по-разному:
//            - по умолчанию (0 для чисел, null для String, false для Boolean и \u0000 или просто 0 для char);
//		- значение для инициализации может быть указанно в месте объявления переменной (в основном это касается финальных и статических полей);
//		- в блоке инициализации (выполняется до конструкторов и может уменьшить число их перегрузок);
//		- в конструкторе (включая дополнительную логику проверки передаваемых значений);
//		- после созданий объекта на усмотрение программиста (не лучшая практика т.к. может привести к ошибкам).
//
//    Касаемо времени, когда инициализируются поля можно привести следующую последовательность:
//      - статические поля родителя
//      -> статические поля наследника
//      -> нестатические поля родителя
//      -> конструктор класса родителя
//      -> нестатические поля наследника
//      -> конструктор класса наследника (инициализация полей экземпляра класса)
//
//             2.	Дайте определение перегрузке методов. Как вы думаете, чем удобна перегрузка методов?
//          Укажите, какие методы могут перегружаться, и какими методами они могут быть перегружены?
//          Можно ли перегрузить методы в базовом и производном классах? Можно ли private метод базового класса перегрузить public методов производного?
//          Можно ли перегрузить конструкторы, и можно ли при перегрузке конструкторов менять атрибуты доступа у конструкторов?
//
//    Перегрузка методов – возможность вызывать исполнение метода имеющего одно имя с различными параметрами,
//    удобство такого подхода заключается в значительном сокращении количества методов.
//    Если в классе наследнике создать метод с сигнатурой аналогичной родительскому, то произойдёт его переопределение, а не перегрузка,
//    если с разными сигнатурами, то перегрузка.
//    При переопределении можно расширять видимость и сужать тип значения, но не наоборот.
//    Конструкторы по сути это такие же методы, думаю что менять атрибуты доступа можно без проблем.
//
//
//            3.	Объясните, что такое раннее и позднее связывание? Перегрузка – это раннее или позднее связывание?
//            Объясните правила, которым следует компилятор при разрешении перегрузки; в том числе, если методы перегружаются примитивными типами,
//            между которыми возможно неявное приведение или ссылочными типами, состоящими в иерархической связи.
//
//    Раннее и позднее связывание – часть жизненного цикла программы, раннее происходит в момент компиляции, когда «указатели» расставляются заранее и
//    точно известно какой	метод вызывать. Позднее происходит в момент выполнения кода, когда определение конкретного «исполнителя» подбирается на ходу,
//    яркий пример позднего связывания – переопределение методов.
//    Перегрузка методов – пример раннего связывания.
//    Порядок выбора компилятором подходящего метода из перечня перегружаемых:
//    I расширение в очерёдности byte – short (char) – int – long – float - double
//    II упаковка (int в Integer, Double в double и т.д.)
//    III varargs – если не нашлось ничего подходящего за 2 предыдущих прохода ищем с учётом аргументов переменной длинны.
//
//            4.	Объясните, как вы понимаете, что такое неявная ссылка this? В каких методах эта ссылка присутствует, а в каких – нет, и почему?
//
//    Ссылка this – адресный указатель, который есть у метода, чтобы сослаться на вызывающий его объект.
//    Обычно применяется при совпадении поля объекта и параметра, передаваемого в метод, либо при пробрасывании результата работы одного конструктора в другой
//    (чтобы сохранить ссылку на объект).
//    Ссылка this есть у всех методов кроме статических, которые вызываются не на объекте, а у класса, поэтому ссылаться там просто некуда.
//
//            5.	Что такое финальные поля, какие поля можно объявить со спецификатором final? Где можно инициализировать финальные поля?
//
//    Финальные поля – поля изменение значения которых не предполагается,
//    обычно в приложении модификатором final отмечаются такие константы как имена столбцов SQL таблиц.
//    Финальные поля должны быть инициализированы до момента первого обращения к ним, это может быть сделано непосредственно при объявлении,
//    в блоке инициализации или в конструкторе. При инициализации финальной переменной в разных конструкторах можно назначать экземплярам класса разные значения.
//
//              6.	Что такое статические поля, статические финальные поля и статические методы. К чему имеют доступ статические методы?
//              Можно ли перегрузить и переопределить статические методы? Наследуются ли статические методы?
//
//    Статические поля и статические методы отличаются от обычных тем, что для их использования нет необходимости создавать экземпляр класса.
//    Статические методы имеют доступ только к статическим переменным и другим статическим методам,
//    но вполне могут объявлять внутри себя собственные нестатические переменные и работать с ними.
//    Перегрузка статических методов возможна и ничем не отличается от перегрузки прочих методов.
//    Переопределение статических методов невозможно, поскольку использование статического метода с именем аналогичным методу родителя
//    в наследнике приведёт к его сокрытию. По сути будет существовать 2 независимых метода с одним именем и вызываться они будут в зависимости от того,
//    на какой класс мы ссылаемся.
//    Статические методы наследуются, как и все прочие, но их переопределение приводит к сокрытию реализации.
//
//            7.	Что такое логические и статические блоки инициализации? Сколько их может быть в классе,
//            в каком порядке они могут быть размещены и в каком порядке вызываются?
//
//    Блоки инициализации это функционал позволяющий производить инициализацию переменных (включая вычисление значений),
//    а также исполнять простой логический функционал вне определённых классе методов (например запись в лог).
//    Статические блоки отличаются тем, что используются для инициализации статических переменных.
//    Ограничения на количество блоков нет, но желательно к их количеству подходить разумно, особенно со статическими блоками,
//    т.к. для них применяется неленивая инициализация. А именно - статические блоки исполняются в момент первого обращения к классу,
//    а обычные при создании экземпляра класса.
//    Порядок вызова блоков совпадает с указанным в ответе на вопрос №1, если учесть что блоки и есть инициализация полей родителя/наследника.
//
//          8.	Что представляют собой методы с переменным числом параметров,
//          как передаются параметры в такие методы и что представляет собой такой параметр в методе? Как осуществляется выбор подходящего метода,
//          при использовании перегрузки для методов с переменным числом параметров?
//
//    Метод с переменный числом параметров – метод в который одному из параметров можно присвоить от 0 до «разумного предела» значений.
//    Параметры в такие методы можно передавать просто через запятую или в виде массива значений соответствующего типа.
//    Внутри метода vararg будет простым массивом со всеми вытекающими возможности обхода её циклами.
//    При применении vararg есть несколько ограничений таких как:
//          - в методе может быть только один vararg
//          - vararg должен быть указан последним в списке параметров.
//
//    При перегрузке компилятор сначала попытается найти метод без vararg, затем попытается снова, но уже с расширением примитивов
//    - боксом/анбоксом и когда уже и такой не найдёт, пойдёт по vararg. Выбор подходящего vararg (в версии java 1.7 и выше)
//    осуществляется также как и с боксом/анбоксом, но нужно быть осторожным с применением классов обёрток и примитивных классов при перегрузке одного метода,
//    поскольку компилятор не поймёт кому из них отдавать переменные.
//
//          9.	Чем является класс Object? Перечислите известные вам методы класса  Object, укажите их назначение.
//
//    Класс Object это неявный родитель всех классов в java, это средство передачи всем создаваемым классам пула методов, которые гарантированно есть у всех.
//    Методы:
//    toString() – возвращает текстовое описание объекта;
//    equals() & hashCode() – пара методов необходимых для сравнения объектов. hashCode() быстродейственный,
//    но не совсем точный ввиду коллизий, equals() медленный но стопроцентный,
//    сочетание двух этих методов позволяет выполнять быстрый поиск даже в больших коллекциях;
//    wait(), notify(), notifyAll() – методы для работы в многопоточной среде, wait заставляет нить остановиться и освободить синхронизированный объект,
//      notify() «вернёт её к жизни», а notifyAll() «вернёт к жизни» все нити остановленные на данном мониторе;
//    clone() – создаёт копию объекта (требует наследования от интерфейса Clonable);
//    finalize() – мистический метод для вызова GC, работает плохо, пользоваться не стоит;
//    try-with-resources  - метод в основном для работы с потоками IO, с автоматическим закрытием потока по завершению передачи;
//    getClass – для получения класса объекта, в основном используется при сравнении.
//
//            10.	Что такое хэш-значение? Объясните, почему два разных объекта могут сгенерировать одинаковые хэш-коды?
//
//    Хэш значение это цифровое представление объекта, объект можно представить как массив произвольной длинны,
//    а этот массив можно представить как целочисленное значение int.
//    Генерация одинаковых хэш кодов или коллизия, явление редкое, но возможное. Коллизия происходит по причине ограничения размерности int,
//    по сути любой long можно хэшировать и получить int, но longов в миллионы раз больше,
//    значит для многих миллионов чисел в диапазоне long хэшкод будет одинаковым, аналогичная ситуация может возникнуть и с объектам,
//    вариации которых к тому же выходят далеко за диапазон чисел long.
//
//            11.	Что такое объект класса Class? Чем использование метода getClass()
//            и последующего сравнения возвращенного значения с Type.class отличается от использования оператора instanceof?

//   Все классы и интерфейсы в Java являются объектами Class, благодаря существованию которого, можно получить имя класса,
//   существующие в нём методы, модификаторы и производить другие манипуляции.
//   getClass() со сравнением проверит являются ли объекты представителями одного класса,
//   instanceof() будет также включать сюда подклассы. Instanceof() в отличии от getClass() защищён от NullPoinet.
//
//            12.	Укажите правила переопределения методов equals(), hashCode() и toString().

//    equals()
//    рефлексивность, тоесть объект должен быть равен сам себе;
//    симметричность – если а равен б, то б равен а;
//    транзитивность – если а равен б, б равен с, то с равен а;
//    согласованность – результат не должен изменяться пока не измениться одно из свойств сравниваемых объектов;
//    + отсутствие ошибки при сравнении с null, при подобном сравнении должен возвращаться результат false;
//    hashCode()
//    если объекты равны, тогда их hashCode должны быть одинаковыми;
//    если объекты разные, то их hashCode могут отличаться.
//            toString()
//    при переопределении метода необходимо выполнять преобразование переменных таких как Date  в удобочитаемый вид;
//    при необходимости разделять вывод на несколько строк;
//    при необходимости исключать из вывода несущественные параметры.

}

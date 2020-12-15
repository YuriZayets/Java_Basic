package Strings;

public class Answers {

//          1.	Как создать объект класса String, какие конструкторы класса String вы знаете? Что такое строковый литерал?
//          Объясните, что значит “упрощенное создание объекта String”?

//    Создать объект класса String можно воспользовавшись одним из множества его конструкторов, к наиболее часто используемым я бы отнёс:
//  - путём присвоения литерала String s = “I’m literal, beware, earthlings!”;
//  - на основе массива символов;
//  - на основе копии другой строковой переменной или её части;
//  - создание пустой строки;
//  - путём преобразования StringBuilder в String;
//  - на основе массива байтов;
//    Строковый литерал – явно заданное значение строковой переменной в коде, в java оно заключается в двойные кавычки,
//    например “Съешь ещё этих мягких французских булок, да выпей чаю”.
//
//    Упрошённое создание объекта String – объявление и инстанцирование переменной в одном месте, например
//    String message = “Hello”, это позволяет сократить конструкцию, а также даёт Java пространство для использования интернирования
//    т.к. отсутствует явное указание что нам нужна новая строка.
//
//            2.	Можно ли изменить состояние объекта типа String? Что происходит при попытке изменения состояния объекта типа String?
//            Можно ли наследоваться от класса String? Как вы думаете, почему строковые объекты immutable?

//    Изменить состояние объекта типа String невозможно, при попытке изменения вы получите новый объект из другой области памяти,
//    с этим связана опасность использования String  в циклах, когда литерал многократно изменяется в памяти остаётся множество объектов без ссылок на них.
//    Наследоваться от String нельзя, он имеет модификатор final
//    Строки в Java имеют модификатор immutable сразу по нескольким причинам:
//  - это гарантирует возможность работы со стоковыми данными сразу нескольким потокам, любые изменения, внесённые одним из потоков,
//    создадут новую строку, а не изменят старую;
//  - по той же причине повышается безопасность и защита от взлома, поскольку нельзя изменить содержимое в рантайме;
//  - позволяет добиться повышения производительности и экономии памяти с использованием хитрой схемы String pool;
//  - позволяет безопасно использовать String в качестве ключа у коллекций и в хэшируемых структурах данных.

//            3.	Объясните, что такое кодировка? Какие кодировки вы знаете? Как создать строки в различной кодировке?

//    Кодировка -  способ представления символов и формируемого из них текста в виде двоичного кода понятного компьютеру.
//    Самые распространённые кодировки ASCII (128 символов), Unicode (включая UTF-8, UTF-16 и т.д.).
//    Насколько мне позволяют судить мои неглубокие познания Java нельзя создать строку определённой кодировки, в рантайме все строки будут в Unicode,
//    что логично, иначе сильно возрастут затраты на кодирование \ декодирование мест из взаимодействия с разными частями программы и друг другом.
//    Кодирование строк происходит при вводе-выводе данных, таких например как сохранение в файл или вывод на экран. Например:
//    byte[] someStuff  = …reading form file…
//    String decoded = String (someStuff, “UTF-8”);

//            4.	Что такое пул литералов? Как строки заносятся в пул литералов?
//            Как занести строку в пул литералов и как получить ссылку на строку, хранящуюся в пуле литералов?
//            Где хранится(в каком типе памяти) пул литералов в Java 1.6 и Java 1.7?

//    Пул строк – набор строк, хранящихся в памяти Java Heap, пул создан для экономии объёма памяти на тяжеловесные объекты класса String.
//    Строки заносятся в пул на основании сравнения строк в существующем пуле с вновь создаваемой строкой и если находится совпадение,
//    то вместо новой строки возвращается ссылка на уже существующую.
//    Чтобы явно указать, что при создании объекта нужно добавить новый объект в пул следует использовать конструкцию:
//    String HEAPster = new String(“Одно место у окна в куче, пожалуйста”);
//
//    До Java 1.7 строки хранились в области фиксированного размера permGen что вызывало много сложностей,
//    после патча 1.7 область для хранения String переместили в кучу (динамическая память) ко всем прочим объектам.
//
//            5.	В чем отличие объектов классов StringBuilder и StringBuffer от объектов класса String?
//            Какой из этих классов потокобезопасный? Как необходимо сравнивать на равенство объекты классов StringBuilder и StringBuffer и почему?

//    StringBuilder и StringBuffer отличаются от String своей изменяемостью, если при внесении изменений в объект класса String мы получим совершенно новый объект,
//    то внесение изменений в StringBuilder и StringBuffer просто изменят его значение.
//    StringBuffer является потокобезопасным и его следует использовать в многопоточной среде,
//    но за синхронизацию приходится платить производительностью по сравнению со StringBuilder.
//    Для сравнения StringBiulder и StringBuffer между собой или с объектами класса String нужно привести их к классу String.
//    Поскольку в этих классах не переопределён метод equals(), то сравнение через «==» или «equals» будет проверять только равенство ссылок, но не содержимого.
//
//              6.	Что такое Unicode?

//    Принятый единый стандарт кодирования, который включает в себя все возможные символы в мире.
//    Уникод также содержит несколько вариантов представления символа в памяти компьютера (UTF-8, UTF-32, Win 1251).
//    В Юникоде можно хранить 1 114 112 различных символов, но на сегодняшний день занято чуть более 10% этого пространства.
//    Unicode не теряет производительности из-за хранения такого большого числа вариантов символов благодаря переменной длинне кода,
//    то есть закодированный символ входящий в список символов ASCII в Юникоде занимает всего 1 байт.

//              7.	Какие методы класса String используются для работы с кодовыми точками? Как вы думаете, когда следует их использовать?

//    Воу, неожиданно высокоуровневый вопрос, особенно после вопроса что такое Юникод.
//    Насколько я смог понять, кодовая точка это номер идентифицирующий символ.
//    Кодовая точка может оказаться символом целиком (если значение лежит в пределе 0 до FFFF, то есть от  0 до 2^14)
//    или быть частью суррогатной пары если для кодирования нужно больше цифр.
//    Из методов можно назвать codePointAt(n) – возвращает кодовую точку под индексом n, codePoints(String) – для использования потоков в Java 1.8 или выше.
//


//    Regular Expressions

//              1.	Расскажите, что представляет собой регулярное выражение?
//              Что такое метасимволы регулярного выражения? Какие вы знаете классы символов регулярных выражений?
//              Что такое квантификаторы? Какие логические операторы регулярных выражений вы знаете? Что значит “якорь” для регулярного выражения?

//    Регулярное выражение представляет собой строку являющуюся шаблоном для поиска в тексте.
//    Метасимволы – зарезервированные символы которые в регулярных выражениях имеют специальное значение.
//    Всего метасимволы разделены на 5 классов:
//  - символы границ (^, $...)
//  - символы классов (\d, \s…)
//  - символы редактирования (\t, \s…)
//  - символы группировки ([qwert]…)
//  - квантификаторы (?, + …)
//    Квантификаторы позволяют оставлять указания количественных характеристик в регулярных выражениях.
//    Логические операторы «и» ab (a и b), «или» a|b (a или b), «группа» (ab).
//    Якорь – символы начала или конца чего либо (слово, строка), например ^ - символ начала строки.
//
//              2.	Какие java-классы работают с регулярными выражениями? В каком пакете они расположены?
//              Приведите пример анализа текста с помощью регулярного выражения и поясните код примера.

//    С регулярными выражениями работают 2 класса Pattern и Matcher, расположенные в классе java.util.regex.
//    String text = “Жили были кот да кит”;
//    Pattern pattern = Pattern.compile(“к.т”); - создаём регулярное выражение, подходящим будет слово начинающееся с буквы “к” и заканчивающееся буквой “т”
//    с одной любой буквой между ними.
//    Matcher matcher = pattern.matcher(text); - объединяем паттерн с проверяемой строкой;
//    boolean isFound = matcher.matches(); - узнаём есть ли в нашем тексте кот или кит.
//
//              3.	Что такое группы в регулярных выражениях? Как нумеруются группы? Что представляет собой группа номер 0(ноль)?
//              Приведите пример с использованием групп регулярного выражения.

//    Группа – способ обращения с символами регулярного выражения как с одним целым.
//    Группы определяются по числу открывающих круглых скобок слева направо и соответственно нумеруются слева направо начиная от 1.
//    Группа 0 – группа использующая все обозначенные критерии поиска.
//    String string = "Для доступа в Джойказино просто добавь цифры 1488 перед ...";
//    Pattern pattern = Pattern.compile("([а-яА-Я0-9]+)([\\s]+[0-9]+)");
//    Matcher matcher = pattern.matcher(string);
//        if (matcher.find()){
//        System.out.println("Group 0 : " + matcher.group(0)); // Group 0 : цифры 1488
//        System.out.println("Group 1 : " + matcher.group(1)); // Group 1 : цифры
//        System.out.println("Group 2 : " + matcher.group(2)); // Group 2 :  1488
//    }

}
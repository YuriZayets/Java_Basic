package Basics_of_software_code_development;

public class Answers {
    /*

    Question #1 Объясните, что имеется в виду, когда говорится: Java-язык программирования и Java-платформа.
    1. Java-язык программирования является непосредственно языком, на котором человек может излагать действия, которые абстрактной машине необходимо будет выполнить.
    Java-платформа это сочетание JRE и JVM, которые позволяют конвертировать код написанный на языке в файлы классов,
    а затем интерпретировать их непосредственно в машинный код.

    Question #2 Поясните, как связаны имя java-файла и классы, которые в этом файле объявляются.
    2. Название файла является указателем точки входа т.к. должно совпадать с названием класса.

    Question #3 Расшифруйте аббревиатуры JVM, JDK и JRE; покажите, где “они находятся” и что собой представляют.
    3. JDK – java development kit является инструментом разработки и отладки приложений написанных на языке java.
    JRE – java runtime environment позволяет преобразовывать код из JDK в файлы классов (байт код) и
    по сути является слоем абстракции поверх ОС в которых возможно исполнение java программ.
    JVM – java virtual machine (является часть JRE) непосредственно исполнитель кода на конкретном устройстве,
    JVM также следит за ресурсами необходимыми для запуска и работы программы.

    Question #4 Объясните, как скомпилировать и запустить приложение из командной строки, а также зачем в переменных среды окружения прописывать пути к установленному jdk.
    4. Для компиляции кода необходимо в командной строке выполнить команду javac <имя файла>, результатом которой будет файл <имя файла>.class,
    который при наличии метода main можно запустить командой java <имя класса>.
    В переменную path прописывается адрес размещения java.exe и javac.exe чтобы иметь возможность их запуска в т.ч. через командную строку.

    Question #5 Перечислите атрибуты доступа, объясните их действие.
    5. Public – общедоступный класс, поля и методы с таким модификатором видны в текущем и внешних пакетах.
    Protected - видимость в пределах всех классов в том же пакете, а также во всех классах наследниках.
    Package private (default) – видимость в пределах данного пакета.
    Private – видимость в пределах данного класса.

    Question #6 Что такое пакеты в java-программе, что представляют собой пакеты на диске? Каково соглашение по именованию пакетов? Как создать пакет?
    6. Пакет – контейнер сильносвязанных между собой классов (интерфейсов) выполняющих общую задачу, либо классов (интерфейсов) выполняющих определённый спектр однотипных задач.
    Java пакеты на диске будут просто папками.
    Именование пакетов выполняется только строчными буквами, а первая его часть зачастую является перевёрнутым доменным именем его разработчика.
    Современные IDE позволяют создавать пакеты аналогично классам –
    после нажатия правой кнопки по родительской папке в структуре проекта необходимо выбрать пункт <New package> и задать имя пакета.

    Question #7 Объясните, какие классы, интерфейсы, перечисления необходимо импортировать в вашу программу, как это сделать.
    Влияет ли импорт пакета на импорт классов и др., лежащего в подпакетах? Какой пакет в Java импортируется по умолчанию?
    7. Импортирование классов и интерфейсов происходит по мере необходимости применения функций как встроенных классов Java,
    так и функций разработанных во внешних пакетах другими программистами. Сделать это можно указав ключевое слово import <имя пакета>.
    При импорте есть возможность получить все содержимое пакета с помощью оператора “*”, к примеру, import java.io.* импортирует все вложенные классы пакета io,
    в прочих случаях необходимо указывать полный путь, например import.java.util.Date, где Date является искомым классом.
    По умолчанию в каждый проект импортируется пакет java.lang, поскольку без него написание чего-либо на языке java невозможно.

    Question #8 Объясните различия между терминами “объект” и “ссылка на объект”.
    8. Объект – некий сферический объём памяти в вакууме (куче), если на данную область памяти отсутствуют указатели (ссылки),
    то сам объект через некоторое время будет уничтожен GC. Ссылка на объект, по сути, привязывает его к заданной пользователем переменной через оператор =. Например:
    Animal animal; - создана переменная, но на данном этапе она не имеет указателя,
    animal = new Animal() – переменная теперь указывает (ссылается) на объект Animal.

    Question #9 Какие примитивные типы Java вы знаете, как создать переменные примитивных типов?
    Объясните процедуру, по которой переменные примитивных типов передаются в методы как параметры.
    9. В java существует 8 примитивных типов данных
    Целые числа :  byte, short, int, long
    Вещественные числа : float, double
    Логический : Boolean
    Символьный : Char (отнесён к этой категории из-за численного представления в памяти)
    Создание примитивных переменных происходит по принципу:
    <тип переменной> <имя переменной> = <значение переменной>  / (int a = 2)
    При передаче примитивных типов в методы создаётся их копия, а любые действия в методе не отразятся на значении той переменной, что осталась за его пределами.

    Question #10 Каков размер примитивных типов, как размер примитивных типов зависит от разрядности платформы,
    что такое преобразование (приведение) типов и зачем оно необходимо? Какие примитивные типы не приводятся ни к какому другому типу.
    10. Примитивные типы имеют размеры в байтах:
    Byte – 1, short – 2, int – 4, long – 8, float  - 4, double – 8, char – 4, boolean – 1/8.
    Приведение типов – возможность «переложить» значение одной переменной в другую, иногда включающее округление (напр. double к int) или преобразование (напр. char в int).
    Приведение в т.ч. необходимо чтобы производить математические вычисления с переменными одинаковых типов.
    Тип boolean не приводится ни к какому другому.

    Question #11 Объясните, что такое явное и неявное приведение типов, приведите примеры, когда такое преобразование имеет место.
    11. Неявное приведение типов происходит без непосредственного участия программиста и зачастую имеет место при приведении «меньшего» примитива к «большему».
    Явное же приведение происходит в местах, которые компилятор считает опасными, например, когда int приводится к short,
    в данном случае потребуется явно указать что всё под контролем и значение не будет утеряно.
    Явное приведение будет происходить при необходимости выделить целую часть из числа double или преобразовании char в int.

    Question #12 Что такое литералы в Java-программе, какую классификацию литералов вы знаете, как записываются литералы различных видов и типов в Java-программе?
    12. Типы литералов: Числовые (целочисленные + с плавающей точкой), Строковые, Символьные, Логические. Литерал является примитивными значением (строки, числа и т.д.)
    - Числовые литералы записываются в виде:
    Int a = 123, где 123 – числовой литерал (возможна запись в двоичной системе счисления с префиксом 0b, в восьмеричной с префиксом 0 и в шестнадцатеричной с префиксом 0х)
    Литералы с плавающей точной можно записать в научном виде double b = 1.23E-9.
    При создания литералов float и long необходимо в конце литерала указывать букву f и l соответственно, иначе данные литералы будут приведены в double и int соответственно;
    - Строковые литералы указываются в двойных кавычках в виде String s = “Строка”;
    - Символьный - в одиночных кавычках char ch = ‘r’, либо задать в 16-битовом виде с указанием префикса \u;
    Логические – имеют всего два варианта true или false;

    Question #13 Как осуществляется работа с типами при вычислении арифметически выражений в Java?
    13. При выполнении арифметических и побитовых преобразований все значения byte и short, а также char расширяются до int,
    (при этом в вычислениях для char используется числовое значение кода символа) затем, если хотя бы один операнд имеет тип long, тип целого выражения расширяется до long.
    Если один из операндов имеет тип float, то тип полного вы-ражения расширяется до float, а если один из операндов имеет тип double, то тип результата будет double.
    В некоторых случаях при операциях вроде :
    byte x = 2, y = 3;
    x = x + y;   будет происходить ошибка связанная с вышеописанным правилом, обойти которую можно явным приведением результата к типу byte.

    Question #14 Что такое классы-оболочки, для чего они предназначены? Объясните, что значит: объект класса оболочки – константный объект.
    14. Обёртка — это специальный класс, который хранит внутри себя значение примитива. Существование обёрток объясняется необходимостью применения методов к значениям примитивов.
    Оболочки (обёртки) называются константными объектами потому что, как и в случае со стройками, при изменении их значения будет создан новый объект,
    а не изменено значение существующего.

    Question #15 Объясните разницу между примитивными и ссылочными типами данных. Поясните существующие различия, при передаче параметров примитивных и ссылочных типов в методы.
    Объясните, как константные объекты ведут себя при передаче в метод.
    15. Примитивные типы данных хранят примитивное значение, ссылочные же хранят ссылку на объект класса, массив или строку.
    При передаче примитивных типов в методы создаётся их копия, а в случае со ссылочными типами создаётся копия ссылки. Из этого можно сделать вывод,
    что в теле метода нельзя изменить примитивным тип, полученный методом в качестве параметра, но можно изменить содержимое объекта, на который указывает ссылка.
    При передаче в метод константного объекта и его изменении в теле этого метода, будет создана копия объекта, которую можно получить, вернув её через return.

    Question #16 Поясните, что такое автоупаковка и автораспаковка.
    16. Автоупаковка и автораспаковка это функции преобразования примитивных типов в объектные и наоборот. Данная функция значительно упрощает переключение между данными типами,
    например в метод ожидающий значение Integer можно передать примитив int, который в результате будет автоматически упакован в оболочку.

    Question #17 Перечислите известные вам арифметические, логические и битовые операторы, определите случаи их употребления.
    Что такое приоритет оператора, как определить, в какой последовательности будут выполняться операции в выражении, если несколько из них имеют одинаковый приоритет.
    17. В Java существует множество операторов из которых можно выделить большие группы:
    Арифметические (+,  -,  *,  /,  %);
    Инкремента/декремента (+, -,  ++, --);
    Сравнения (==, !=, >, >=);
    Логические (NOT, AND, OR, XOR, &, |, &&, ||);
    Побитовые (~, &, |, ^, >>, >>>, <<);
    Таблица приоритета операторов легко доступна в интернете, в ней указаны приоритеты всех операторов от инкрементов/декрементов (наивысший приоритет)
    до опереторов присваивания (низший приоритет).
    Если несколько операций в выражении имеют одинаковый приоритет, то первыми будут выполняться те, которые расположены в выражении левее.

    Question #18 Укажите правила выполнения операций с плавающий точкой в Java (согласно стандарту IEEE754).
    Как определить, что результатом вычисления стала бесконечность или нечисло?
    18. Стандартом IEEE 754 оговорена запись вещественных чисел в экспоненциальном виде.
    Это значит, что часть битов кодирует мантиссу числа, другая часть — показатель порядка (степени),
    и ещё один бит используется для указания знака числа (0 — если число положительное, 1 — если число отрицательное). Математически это записывается так:
    (-1)^s × M × 2^E, где s — знак, M — мантисса, а E — экспонента.
    Мантисса – это целое число фиксированной длины, экспонента ( «показатель степени») – это степень в которую мантиссу необходимо возвести основание 10.
    По сути экспонента - количество цифр перед точкой, отделяющей дробную часть числа.
    Простой способ определить является ли результатам бесконечно или нечисло – вывести их через System.out.println.

    Question #19 Что такое статический импорт, какие элементы можно импортировать при статическом импорте.
    19. Статический импорт – модификация оператора import позволяющая получить прямой доступ к статическим членам импортируемого класса без указания их имени.
    Например, при статическом импорте класса Math такие методы как Math.pow() можно использовать просто как pow.

    Question #20 Объясните работу операторов if, switch, while, do-while, for, for-each. Напишите корректные примеры работы этих операторов.
    20. if (<булево значение>){
    действия, которые выполнятся при булевом значение true
    }

    switch (<переменная>){
    case 1: код исполняемый при условии того, что переменная имеет значение 1
    break;
    case 2: код исполняемый при условии того, что переменная имеет значение 2
    }

    while (<булево значение>){
    Тело цикла, исполняемое пока булево значение равно true
    }

    do-while по сути аналогичен циклу while, однако он будет исполнен по крайней мере 1 раз, а уже затем будет проверено условие и если оно вернёт true, то цикл повторится.

    For (<начальное значение переменной>; <логической выражение с переменной>; <действия над переменной после завершения цикла>){
    Тело цикла
    }

    For-each(<тип переменной и её название>:<название массива/коллекции>){
    Тело цикла, через который пройдёт каждый элемент массива/коллекции
    }

    Question #21 Объясните работу оператора instanceof. Что будет результатом работы оператора, если слева от него будет стоять ссылка, равная null?
    21. Оператор instanceof проверяет был ли объект, на который ссылается переменная, создан на основе объекта определённого класса. Например:
    class Animal{}
    class Cat extends Animal{}
    Cat cat = new Cat();
    Sout(cat instanceof Animal); - выведет true.

    Если ссылка стоящая слева от оператора instanceof будет равна null будет выведено значение false

     */
}

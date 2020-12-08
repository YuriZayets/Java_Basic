package Algorithmization;

public class Answers {
//    1.	Дайте определение массиву. Как осуществляется индексация элементов массива. Как необходимо обращаться к i-му элементу массива?
//    Массив – структура данных, в которой каждый хранимый элемент имеет индекс. Массивы в Java однородные,
//    то есть в одном массиве не может храниться сразу несколько типов данных. Можно сказать что массивы относятся к immutable
//    типу данных поскольку после создания массива, нельзя изменить его характеристики, например размер, но изменить содержимое ячеек массива можно.
//    Индексация элементов массива происходит от 0 до n, где n указывается при создании массива в качестве его размера.
//            Int[] arr = new int[n];
//    Для обращения к i-тому элементу необходимо использовать конструкцию arr[i];
//
//2.	Приведите способы объявления и инициализации одномерных и двумерных массивов примитивных и ссылочных типов.
//  Укажите разницу, между массивами примитивных и ссылочных типов.
//    Массивы можно инициализировать несколькими способами, но предпочтительным в java является: String [] array = new String[10];
//    Для получения двух- и более мерных массивов при объявлении необходимо создать вложенность одного массива в другой (или другие):
//    int[][] matrix = new int[2][2];
//    Результатом будет «матрица»:
//            [[0 0]
//            [0 0]], слово матрица я взял в кавычки поскольку как таковой математической матрицей этот объект не является,
//            это лишь массив, хранящий в себе ссылку на два других массива с примитивными значениями.
//    Инициализацию массива можно отделить от объявления:
//    int[] arr = new int[2];
//    arr[0] = 42;
//    Или совместить с объявлением String[] names = new String[] {“Алевтина”, “Григорий”, “Святозар“, “Феокл”};
//    (в таком случае можно даже обойтись без оператора new int[] arr = {0,1,2,3}; поскольку размер будет очевиден из контекста)
//        Разница между массивами примитивных и ссылочных типов состоит в том, что в случае с примитивами в массиве лежит само значение,
//        а у массива ссылочных типов хранится ссылка на объект.
//
//        3. Объясните, что значит клонирование массива, как в Java можно клонировать массив, в чем состоит разница в клонировании массивов примитивных и ссылочных типов.
//        Клонирование массива – способ получить для работы копию массива, обычно это используется когда необходимо обеспечить «сохранность»
//        изначального массива. При работе с одномерными массивами клонирование работает так, как и предполагается – для примитивных типов будет
//        создан новый независимый массив со своими значениями, а для ссылочных будет создан массив копий ссылок.
//        Ввиду особенности формирования массивов в java (описанной в предыдущем вопросе) при клонировании многомерных массивов даже примитивных
//        типов мы получим лишь копии ссылок на массивы вложенные в клонируемую матрицу. То есть
//        int[][] a = {{0,0},{0,0}}
//        int[][] b = a.clone();
//        a[0][0] = 1;
//        sout(b[0][0]); //вывод «1», поскольку b хранит в себе ссылки на int[0] a и int[1] a;
//
//        4. Объясните, что представляет собой двумерных массив в Java, что такое “рваный массив”. Как узнать количество строк и количество
//        элементов в каждой строке для “рваного” массива?
//        Штош, как уже говорилось выше двумерный массив в Java это массив, хранящий в себе ссылки на массивы уже непосредственно хранящие
//        элементы или ссылки на них. Рваным он будет в том случае, если размер этих вложенных массивов будет различен, например int[][] arr = {{0},{1,2},{3,4,5}};
//        Для того чтобы узнать количество элементов в строке рваного массива нужно лишь вспомнить что строка по сути является массивом
//        со своим индексом. arr[1].length – позволит узнать число элементов во второй строке
//
//        5. Объясните ситуации, когда в java-коде могут возникнуть следующие исключительные ситуации java.lang.ArrayIndexOutOfBoundsException и java.lang.ArrayStoreException.
//        java.lang.ArrayIndexOutOfBoundsException возникает при попытке обратиться к элементу массива по индексу выходящему за пределы его размерности
//        и соответственно за пределы выделенной ему памяти. Например:
//        int[] array = new int[5];
//        array[7] = 2;  java.lang.ArrayIndexOutOfBoundsException
//
//        java.lang.ArrayStoreException возникает при попытке присвоить элементу массива значение
//        отличное от указанного при объявлении, например попытаться положить long в массив String
//        String[] array = new String[]{“one”,”two”,”three”};
//        long x = 1111L
//        array[1] =  x  java.lang.ArrayStoreException
//
//        6. Объясните, зачем при кодировании разделять решаемую задачу на методы. Поясните, как вы понимаете выражение: “Один метод не должен выполнять две задачи”.
//        Разделение на методы выполняет сразу несколько задач:
//        - позволяет переиспользовать код, написанный один раз во множестве мест в коде;
//        - значительно упрощает отладку (особенно в ситуациях, когда метод также обрабатывает разнородные ошибки и их не приходится отлавливать выше по стеку вызовов);
//        - значительно упрощает масштабирование и внесение изменений в имеющийся функционал;
//        - зачастую повышает производительность.
//
//        выражение: “Один метод не должен выполнять две задачи” подразумевает, что каждый существующий метод выполняет одну задачу,
//        которая должна быть понятна из названия этого метода. Наличие у метода «побочных эффектов» значительно затрудняет поиск ошибок и масштабирование,
//        а код с таким подходом со временем превратится в «спагетти».
//
//        7. Объясните, как в Java передаются параметры в методы, в чем особенность передачи в метод значения примитивного типа, а в чем ссылочного.
//        Вопрос повторяется, был в прошлом вопроснике под номером 15 и я уже получил на него развёрнутый комментарий 
//        8. Объясните, как в метод передать массив. И как массив вернуть из метода. Можно ли в методе изменить размер переданного массива.
//        Передача массива в метод и его возврат из метода не отличается от передачи других ссылочных типов данных.
//        Метод работает с массивом по ссылке, соответственно любые изменения, произведенные в методе, отразятся на «исходном» объекте.
//        Изменение размера классического массива в Java невозможно (если мы не имеем ввиду ArrayList конечно),
//        размер указывается при его объявлении и остаётся таковым. При необходимости увеличить «вместимость» массива необходимо создать массив большего размера,
//        а затем скопировать содержимое меньшего массива в больший.
//        9. Поясните, что означает выражение ‘вернуть значение из метода’. Как можно вернуть значение из метода.
//        Есть ли разница при возврате значений примитивного и ссылочного типов.
//        Вернуть значение из метода - вернуть ход выполнения программы обратно к вызвавшему метод сегменту кода с каким-то искомым значением, например
//        int I = (int) Math.random()
//        мы вызываем метод random() класса Math и ожидаем, что он вернёт нам значение, которым мы инициализируем переменную.
//        По сути, мы говорим программе загляни по этому адресу и верни то, что тебе там дадут.
//        Возврат значений из метода выполняется ключевым словом return, за которым следует возвращаемое значение.
//        Работа с возвращение значений примитивных и ссылочных типов аналогична такой работе с их передачей в методы,
//        за исключением того, что в некоторых случаях метод может сам создавать объекты и возвращать уже значения или ссылки на них.
//
//        10. Перечислите известные вам алгоритмы сортировки значений, приведите код, реализующий это алгоритмы.
//        Существуют десятки алгоритмов сортировки и сотни их модификаций, но условно можно выделить 2 большие категории
//        – Хорошие сортировки и Плохие сортировки. Простые в реализации сортировки такие как пузырьковая, вставками, обменами и т.д.
//        имеют высокую сложность и при большом количестве элементов мгновенно теряют свою актуальность.
//        К хорошим относятся сортировки основанные на ветвлении (пирамидальная, слиянием) их сложность обычно на уровне nlogn и стремится к n всеми возможными способами.

        }

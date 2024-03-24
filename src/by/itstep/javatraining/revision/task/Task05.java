package by.itstep.javatraining.revision.task;

/*	Task 05. The Next Even Number [следующее чётное число]
 *
 *	На вход дается натуральное число N. Вычислите следующее за ним чётное число.
 *
 *	Формат входных данных [input]
 *	На вход дается целое положительное число N.
 *
 *	Формат выходных данных [output]
 *	Выведите одно целое число - ответ на задачу.
 *
 *  Примечание
 *  На забудьте предусмотреть "защиту от дурака": если данные не подходят по условию задачи,
 *  то необходимо возвратить 0
 *
 *	[Sample method input 1]: 1
 *	[Sample method output 1]: 2
 *
 *	[ input 2]: 2
 *	[output 2]: 4
 *
 *	[ input 3]: 3
 *	[output 3]: 4
 *
 *	[ input 4]: 0
 *	[output 4]: 0
 *
 *	[ input 5]: -1
 *	[output 5]: 0
 */

public class Task05 {
    public static int start(int number) {
        if (number < 1) {
            return 0;
        }

        return number % 2 == 0 ? number + 2 : number + 1;
    }
}
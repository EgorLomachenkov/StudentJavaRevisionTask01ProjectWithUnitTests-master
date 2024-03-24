package by.itstep.javatraining.revision.task;

/*	Task 03. The Number of tens [число десятков]
 *
 *	Дано целое число N, определите число десятков в нем (предпоследнюю цифру числа).
 *	Если предпоследней цифры нет, то можно считать, что число десятков равно нулю.
 *
 *	Формат входных данных [input]
 *	На вход дается любое целое число N в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Возвратите одно целое число - ответ на задачу.
 *
 *	[sample method input 1]: 456
 *	[sample method output 1]: 5
 *
 *	[ input 2]: -1234567
 *	[output 2]: 6
 *
 *	[ input 3]: 1000
 *	[output 3]: 0
 *
 *	[ input 4]: 9
 *	[output 4]: 0
 */

public class Task03 {
    public static int start(int number) {
        int res = (number / 10) % 10;
        return res < 0 ? -res : res;
    }
}
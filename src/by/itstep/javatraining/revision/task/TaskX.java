package by.itstep.javatraining.revision.task;

/*	Task X. The Treasure Seekers and Gold Coins (3) [искатели сокровищ и золотые монеты]
 *
 *	Снова N искателей сокровищ нашли K золотых монет и решили честно разделить их между собой,
 *  чтобы количество монет, доставшимся любым двум искателям, отличалось бы не более, чем на 1.
 *	Сколько будет искателей, которым достанется монет меньше, чем остальным?
 *
 *	Формат входных данных [input]
 *	На вход даются целочисленные числа N (количество искателей) и K (количество монет).
 *
 *	Формат выходных данных [output]
 *	Возвратите одно целое число - ответ на задачу.
 *
 *  Примечание
 *  На забудьте предусмотреть "защиту от дурака": если данные не подходят по условию задачи,
 *  то необходимо возвратить -1
 *
 *	[sample method  input 1] (пример передаваемых в метод параметров): 5 9
 *	[sample method output 1] (пример возвращаемого методом результата): 1
 *
 *	[ input 2]: 4 20
 *	[output 2]: 0
 *
 *	[ input 3]: -3 1
 *	[output 3]: -1
 */

public class TaskX {
    public static int start(int seeker, int coin) {
        if (seeker < 1 || coin < 1) {
            return -1;
        }


//        return (seeker - coin % seeker) * (coin % seeker) /
//                ((coin % seeker) + 1 - 2 * (coin % seeker) / ((coin % seeker) + 1));

        return (seeker > 0 && coin > 0) ? (seeker - coin % seeker) % seeker : -1;
    }
}
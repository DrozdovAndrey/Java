package LectureFour;

import java.util.*;



public class LectureFour {
    public static void main(String[] args) {
        //LinkedList
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); //добавляет элемент в конец очереди
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); //1,2,3,4
        int item = queue.remove();
        System.out.println(item); //1
        System.out.println(queue); // 2,3,4
//        queue.remove(); //извлекает элемент из начала очереди, если нет элементов выведет исключение
        queue.offer(2809);
        item = queue.remove();
        System.out.println(item); //2
        System.out.println(queue); //3,4,2809
        item = queue.remove();
        System.out.println(item); //3
        System.out.println(queue); //4,2809
        item = queue.remove();
        System.out.println(item); //4
        System.out.println(queue); //2809
        queue.add(1);
//        item = queue.remove();
//        item = queue.poll();
        System.out.println(queue); //[]
        queue.add(1);
        queue.offer(2809);
        queue.remove(2809);
        item = queue.element();
        System.out.println(item);//1
//        item = queue.peek();
        System.out.println(item);//1



        //PriorityQueue - будет извлекать с наименьшего элемента
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(12);
        pq.add(1);
        System.out.println(pq);


        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll()); // если нет элемента выведет null

        //Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.removeLast();
        deque.removeFirst();
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.pollFirst();
        deque.pollLast();
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.getFirst();
//        deque.getLast();
//        deque.peekFirst();
//        deque.peekLast();

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
/* Stack and Vector устарели, сейчас используют Deque
        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])){
                st.push(Integer.parseInt(exp[i]));
            }else {
                switch (exp[i]){
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = st.pop() - st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = -st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = -st.pop() / st.pop();
                        st.push(res);
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());

 */
        var exp = "1 2 3 * -".split(" ");
        int res;
        System.out.println(Arrays.toString(exp));
        Deque<Integer> deq = new ArrayDeque<>();
        for (String s : exp) {
            if (isDigit(s)) {
                deq.offerFirst(Integer.parseInt(s));
            } else {
                switch (s) {
                    case "+" -> {
                        res = deq.pop() + deq.pop();
                        deq.push(res);
                    }
                    case "-" -> {
                        res = deq.pop() - deq.pop();
                        deq.push(res);
                    }
                    case "*" -> {
                        res = deq.pop() * deq.pop();
                        deq.push(res);
                    }
                    case "/" -> {
                        res = deq.pop() / deq.pop();
                        deq.push(res);
                    }
                    default -> {
                    }
                }
            }
        }
        System.out.printf("%d\n", deq.pop());
    }
    public static boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}

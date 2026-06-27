    class MyStack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            if (!q1.isEmpty()) {
                q1.add(x);
            } else {
                q2.add(x);
            }
        }

        public int pop() {
            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.poll());
                }
                return q1.poll();
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.poll());
                }
                return q2.poll();
            }
        }

        public int top() {
            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.poll());
                }
                int top= q1.peek();
                q2.add(q1.poll());
                return top;

            } else {
                while (q2.size() > 1) {
                    q1.add(q2.poll());
                }
                int top= q2.peek();
                q1.add(q2.poll());
                return top;

            }

        }

        public boolean empty() {
            return (q1.isEmpty() && q2.isEmpty());
        }
    }

    /**
    * Your MyStack object will be instantiated and called as such:
    * MyStack obj = new MyStack();
    * obj.push(x);
    * int param_2 = obj.pop();
    * int param_3 = obj.top();
    * boolean param_4 = obj.empty();
    */
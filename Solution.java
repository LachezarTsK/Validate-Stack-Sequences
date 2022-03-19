
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> pushTrack = new ArrayDeque<>();
        int indexPop = 0;

        for (int pushElement : pushed) {
            pushTrack.push(pushElement);
            while (!pushTrack.isEmpty() && pushTrack.peek() == popped[indexPop]) {
                pushTrack.pop();
                indexPop++;
            }
        }
        return indexPop == pushed.length;
    }
}

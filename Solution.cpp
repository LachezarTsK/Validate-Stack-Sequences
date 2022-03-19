
#include <deque>
#include <vector>
using namespace std;

class Solution {

public:

    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        deque<int> pushTrack;
        int indexPop = 0;

        for (const auto& pushElement : pushed) {
            pushTrack.push_front(pushElement);
            while (!pushTrack.empty() && pushTrack.front() == popped[indexPop]) {
                pushTrack.pop_front();
                indexPop++;
            }
        }
        return indexPop == pushed.size();
    }
};


/**
 * @param {number[]} pushed
 * @param {number[]} popped
 * @return {boolean}
 */
var validateStackSequences = function (pushed, popped) {
    const pushTrack = [];
    let indexPop = 0;

    for (let pushElement of pushed) {
        pushTrack.push(pushElement);
        while (pushTrack.length > 0 && pushTrack[pushTrack.length - 1] === popped[indexPop]) {
            pushTrack.pop();
            indexPop++;
        }
    }
    return indexPop === pushed.length;
};

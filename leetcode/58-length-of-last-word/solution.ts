function lengthOfLastWord(s: string): number {
    let count = 0;
    let wordStart = false;
    for (let i = s.length - 1; i >= 0; i--) {
        if (s[i] === ' ') {
            if (wordStart) {
                break;
            }
            continue;
        }
        wordStart = true;
        count++;
    }
    return count;
}


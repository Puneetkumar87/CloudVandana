function reverseWords(sentence) {
    const w = [];
    let c = '';
    let r = '';
  
    for (let i = 0; i < sentence.length; i++) {
      const ch = sentence[i];
      if (ch === ' ' || i === sentence.length - 1) {
        const rw = reverseWord(c);
        r += rw + (i === sentence.length - 1 ? '' : ' ');
        c = '';
      } else {
        c += ch;
      }
    }
  
    return r;
  }
  
  function reverseWord(word) {
    let rw = '';
    for (let i = word.length - 1; i >= 0; i--) {
      rw += word[i];
    }
    return rw;
  }
  
  const s = "This is a sunny day";
  const rs = reverseWords(s);
  console.log(rs);
  
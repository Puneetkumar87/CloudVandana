function sortDescending(arr) {
    for (let i = 0; i < arr.length; i++) {
      for (let j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          const t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
        }
      }
    }
  }
  
  const a = [5, 1, 9, 3, 7, 2];
  sortDescending(a);
  console.log(a);
  
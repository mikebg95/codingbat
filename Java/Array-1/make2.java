public int[] make2(int[] a, int[] b) {
  int[] result = new int[2];
  if (a.length >= 1) {
    result[0] = a[0];
    if (a.length >= 2) {
      result[1] = a[1];
    }
    else {
      if (b.length >= 1) {
        result[1] = b[0];
      }
    }
  }
  else {
    if (b.length >= 1) {
      result[0] = b[0];
    }
    if (b.length >= 2) {
      result[1] = b[1];
    }
  }
  
  return result;
}

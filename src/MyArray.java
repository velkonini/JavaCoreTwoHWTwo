public class MyArray {
        static int getArr(String[][]myArray) throws MyDataException, MySizeException{
            if(myArray.length == 4 && myArray[0].length == 4) {
                System.out.println("Длинна массива верная");
            } else {
                throw new MySizeException("Неправильная длинна массива");
            }

            int sum = 0;
            if(myArray.length != 4) {
                throw new MySizeException("Неправильная длинна массива");
            }

            for (int i=0;i<myArray.length;i++) {
                if(myArray[i].length != 4) {
                    throw new MySizeException("Неправильная длинна массива");
                }
                for(int j=0;j<myArray[i].length;j++) {
                    try {
                        sum += Integer.parseInt(myArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyDataException("Не является числом "+i+" "+j);
                    }
                }
            }

            Integer[][] intArray = new Integer[myArray.length][myArray[0].length];
            int result=0;
            for(int i=0;i<myArray.length;i++) {
                for (int j=0;j<myArray[0].length;j++) {
                    intArray[i][j] = Integer.parseInt(myArray[i][j]);
                    i++;
                    result += intArray[i][j];
                }
            }
            return sum;
        }

    }

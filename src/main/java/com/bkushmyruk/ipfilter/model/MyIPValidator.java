//package com.bkushmyruk.ipfilter.model;
//
//import com.bkushmyruk.ipfilter.util.Messages;
//import com.bkushmyruk.ipfilter.view.View;
//
//import java.util.Arrays;
//
//public class MyIPValidator {
//    public void validationIPFormat(String str) {
//        if (validation(str)) {
//        } else {
//            View.printMessage(Messages.DATA_FORMAT_ERROR);
//        }
//    }
//
//    private boolean validation(String str) {
//
//        char[] charArray = str.toCharArray();
//        System.out.println(Arrays.toString(charArray));
//        System.out.println(str.indexOf("."));
//
//        if (validationStep1(charArray) & validationStep2(charArray)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//
//    private boolean validationStep1(char[] charArray) {
//
//        if (Arrays.binarySearch(charArray, '.') != -1) {
//
//        } else {
//            return false;
//        }
//        return true;
//    }
//
//    private boolean validationStep2(char[] charArray) {
//        System.out.println(Arrays.binarySearch(charArray, '.'));
////        char[] charArray1 = Arrays.copyOf(charArray, i);
////        char[] charArray2 = Arrays.copyOfRange(charArray, i + 1, charArray.length - i);
////        System.out.println(Arrays.toString(charArray1));
////        System.out.println(Arrays.toString(charArray2));
//        return true;
//    }
//
//
////        for (int i = 0; i < charArray.length; i++) {
////            if (charArray[i] == '.') {
////                char[] charArrayPart1 = Arrays.copyOf(charArray, i);
////                char[] charArrayPart2 = Arrays.copyOfRange(charArray, i + 1, charArray.length - i);
////                System.out.println(Arrays.toString(charArrayPart1));
////                System.out.println(Arrays.toString(charArrayPart2));
////                if (arrayValidation(charArrayPart2)) {
////                    return true;
////
////                } else {
////                    return false;
////                }
////                if (arrayValidation(charArrayPart1)) {
////                    return true;
////                } else {
////                    return false;
////                }
////                validationStep2(charArrayPart2);
////
////            } else {
////                if (i == (charArray.length - 1)) {
////                    return true;
////                } else {
////                    return false;
////                }
////
////
////            }
////        }
////    }
//
////    private boolean arrayValidation(char[] charArray) {
////
////        switch (charArray.length) {
////            case 1:
////                return symbolValidationL1(charArray);
////            break;
////            case 2:
////                return symbolValidationL2(charArray);
////            break;
////            case 3:
////                return symbolValidationL3(charArray);
////            break;
////        }
////    }
//
//
////    private boolean symbolValidationL1(char[] charArray) {
////        if (charArray[0] < 10 & charArray[0] > 0 && charArray[0] == 0) {
////
////        } else {
////            return false;
////        }
////
////    }
////
////    private boolean symbolValidationL2(char[] charArray) {
////        if ((charArray[0] < 10 & charArray[0] > 0 && charArray[0] == 0) &
////                (charArray[1] < 10 & charArray[1] > 0 && charArray[1] == 0)) {
////
////        } else {
////            return false;
////        }
////    }
////
////    private boolean symbolValidationL3(char[] charArray) {
////        if ((charArray[0] < 3 & charArray[0] > 0 && charArray[0] == 0) &
////                (charArray[1] < 10 & charArray[1] > 0 && charArray[1] == 0) &
////                (charArray[2] < 10 & charArray[2] > 0 && charArray[2] == 0)) {
////
////        } else {
////            return false;
////        }
////
////    }
//}
//

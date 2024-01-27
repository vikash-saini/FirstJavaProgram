package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static <Char> void main(String[] args) {

        int[] arr ={2,4,6,8,9,11,15,20};
        int target =10;
        int[] arr1 ={33,25,20,15,6,4,2,1};
        System.out.println(search(arr,target));
        System.out.println(searchOrtderagnosticBinary(arr1,target));


        System.out.println("ceiling number: "+searchCeiling(arr,target));
        System.out.println("Floor number: "+searchFloor(arr,target));

        System.out.println(('b'+0)<('c'+0));
        System.out.println('p'>'d');
        char[] charr={'b','d','v','x','z'};
        System.out.println("char search : "+searchChar(charr,'v'));
        System.out.println("ceiling char: "+searchCeilingChar(charr,'d'));

        System.out.println(nearestGreaterLetter(charr,'a'));
//      System.out.println(2%3);

        int[] newarr = {5,7,7,7,7,7,8,8,10};
        int[] resArr = findFirstLastPosition(newarr,7);
        System.out.println(Arrays.toString(resArr));

        String n = "July Afgv";
        System.out.println(n.toLowerCase());
        System.out.println(n);

        System.out.println("positionFromInfinite: "+findPositonFromInfinite(arr,22));

        int arr2[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = findPos(arr2,180);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] == target){
                return mid;
            }
        }

        return -1;
    }

    static int searchChar(char[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] == target){
                return mid;
            }
        }

        return -1;
    }

    static int searchOrtderagnosticBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean asc =arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if (asc){
                if(arr[mid] <target){
                    start = mid+1;
                }else if(arr[mid] > target){
                    end = mid-1;
                }else if (arr[mid] == target){
                    return mid;
                }
            }else{
                if(arr[mid] <target){
                    end = mid-1;
                }else if(arr[mid] > target){
                    start = mid+1;
                }else if (arr[mid] == target){
                    return mid;
                }
            }

        }

        return -1;
    }

//    Ceiling: nearest greater or equals to target number
    static int searchCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if (target > arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
//                if (arr[start]>target){
//                    return arr[start];
//                }
            }else if(arr[mid] > target){
                end = mid-1;
//                if (arr[end]>target){
//                    return arr[end];
//                }
            }else if (arr[mid] == target){
                return arr[mid];
            }
        }

        return arr[start];
    }

//    Floor : nearest small or equals to target number
    static int searchFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if (target > arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
//                if (arr[start]>target){
//                    return arr[start];
//                }
            }else if(arr[mid] > target){
                end = mid-1;
//                if (arr[end]>target){
//                    return arr[end];
//                }
            }else if (arr[mid] == target){
                return arr[mid];
            }
        }

        return arr[end];
    }


//   Ceiling: nearest greater or equals to target number
    static char searchCeilingChar(char[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if (target > arr[arr.length-1]){
            return 'n';
        }
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;

            }
            else if (arr[mid] == target){
                return arr[mid];
            }
        }

        return arr[start];
    }

    // return nearest greater to target number, not: if no greatest then returen cover (start element)
    static char nearestGreaterLetter(char[] letter, int target){
        int start = 0;
        int end = letter.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;

            if(letter[mid] > target){
                end = mid-1;

            }else{
                start = mid+1;
            }

        }

        return letter[start % letter.length];
    }

//    find first and last position in a sorted array

    static int[] findFirstLastPosition(int[] arr, int target){

        int[] result ={-1,-1};
        result[0]=searchFirstLast(arr,target,true);
        result[1]=searchFirstLast(arr,target,false);


        return result;

    }

    static int searchFirstLast(int[] arr, int target,boolean findFirstOccurence){
        int start = 0;
        int end = arr.length-1;

//        potential answer
        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] == target){
                ans = mid;
               if (findFirstOccurence){
                   end=mid-1;
               }else{
                   start=mid+1;
               }
//
            }
        }

        return ans;

    }

//  Amazon - find position of en element from sorted array of infinite size
    static int findPositonFromInfinite(int[] arr,int target){
        int start =0;
        int end = 1;

        while(target>arr[end]){
            int  temp =end+1;
            end = end+(end-start+1)*2;
            if (end > arr.length-1){
                end= arr.length-1;
            }

            start = temp;
            if (target>arr[arr.length-1]){
                break;
            }
        }
        return searchPosition(arr, target,start,end);
    }

    static int searchPosition(int[] arr, int target,int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] == target){
                return mid;
            }
        }

        return -1;
    }

    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }

    // Method takes an infinite size array and a key to be
    // searched and returns its position if found else -1.
    // We don't know size of arr[] and we can assume size to be
    // infinite in this function.
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE
    // THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
    static int findPos(int arr[],int key)
    {
        int l = 0, h = 1;
        int val = arr[0];

        // Find h to do binary search
        while (val < key)
        {
            l = h;     // store previous high
            //check that 2*h doesn't exceeds array
            //length to prevent ArrayOutOfBoundException
            if(2*h < arr.length-1)
                h = 2*h;
            else
                h = arr.length-1;

            val = arr[h]; // update new val

            if (key>arr[arr.length-1]){
                break;
            }
        }

        // at this point we have updated low
        // and high indices, thus use binary
        // search between them
        return binarySearch(arr, l, h, key);
    }

}

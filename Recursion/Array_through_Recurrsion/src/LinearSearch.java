import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,5,6,7};
        System.out.println(find(arr,3,0));
        System.out.println(linearSearch(arr,5,0));
        findAllIndex(arr,4,0);
        System.out.println(list);
        //calling the function in which we send the ArrayList In side the parameter
        System.out.println(findAllIndex(arr,4,0,new ArrayList<Integer>()));
        System.out.println(findAllIndex2(arr,4,0));
    }
    static boolean linearSearch(int [] arr,int target,int index){
        if(index==arr.length-1){
            return false;
        }
        return arr[index]==target || linearSearch(arr,target,index + 1);
    }
    //how to get index insted of true or false
    static int find(int arr[],int target,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return find(arr,target,index+1);
    }
    //how to return all tge
    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int [] arr,int target,int index){
        if(index==arr.length-1){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index + 1);
    }
    static ArrayList<Integer> findAllIndex(int arr[],int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index + 1,list);
    }

    static ArrayList<Integer> findAllIndex2(int []arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> belowValues=findAllIndex2(arr,target,index + 1);
        list.addAll(belowValues);
        return list;
    }
}


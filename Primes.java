public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Boolean [] arr = new Boolean[n+1]; //create new array
        for (int i = 2 ; i< n+1 ; i++){ //make all values past index 1 true
            arr[i] = true;
        }
        for (int i = 2 ; i< Math.sqrt(n+1) ; i++){ // check if the given index is true(i.e. prime)
            if (arr[i]==true){
                for (int j = i*i ; j< n+1 ; j+=i){ // go through all multiples of i 
                    arr[j] = false; //change all values at multiples of i to false
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2 ; i< n+1 ; i++){
            if (arr[i]==true){
                System.out.println(i); // print out every prime
                count ++; //coutn amoutn of primes
            } 
        }
        int percent = (int)(100.0*count/n); // calculate percentage of primes
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
}
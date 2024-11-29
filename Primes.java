public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Boolean [] arr = new Boolean[n+1];
        for (int i = 2 ; i< n+1 ; i++){
            arr[i] = true;
        }
        for (int i = 2 ; i< Math.sqrt(n+1) ; i++){
            if (arr[i]==true){
                for (int j = i*i ; j< n+1 ; j+=i){
                    arr[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2 ; i< n+1 ; i++){
            if (arr[i]==true){
                System.out.println(i);
                count ++;
            } 
        }
        int percent = (int)(100.0*count/n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
}
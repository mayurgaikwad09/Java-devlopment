import java.io.*;

class patterns8 {
    public static void main(String[] args) throws IOException {

        BufferedReader obj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter row");
        int rows = Integer.parseInt(obj.readLine());

       

        for (int i=1; i<=rows; i++) {
              int num = rows;
            for (int j=1; j<=rows; j++) {

                if (j%2==1) {
                    System.out.print((char)(num + 64));
                }
                else {
                    System.out.print(num);
                }

                num--;
            }

            System.out.println();
        }
    }
}

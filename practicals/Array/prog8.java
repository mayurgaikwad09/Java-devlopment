class Demo {
    public static void main(String[] args) {

        String name = "Mayur";

        int arr[] = new int[name.length()];

        for (int i = 0; i < name.length(); i++) {
            arr[i] = name.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

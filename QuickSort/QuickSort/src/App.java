public class App {

    public static void quickSort(int[] arr, int low, int high) {
        // Ninfa Isabel Rodrìguez Briceño
        // Carnet 2024-1649U

        if (low < high) {
            int pi = partition(arr, low, high); // Obtener el indice del pivote
            quickSort(arr, low, pi - 1); // Ordenar recursivamente la
            quickSort(arr, pi + 1, high); // Ordenar recursivamente la
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Tomamos el ultimo elemento como pivote
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Retorna el indice del pivote
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello word");

        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quickSort(arr, 0, n - 1); // Llamada al mètodo
        System.out.println("Arreglo ordenado");
        for (int num : arr) {
            System.out.println(num + " ");

        }

    }
}

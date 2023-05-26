import java.util.*;
public class Bai4_Set {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Nhap mang so thuc: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        Set<Double> uniqueElements = new HashSet<>();
        Set<Double> duplicateElements = new HashSet<>();

        for (double num : arr) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }
        System.out.println("Cac phan tu xuat hien trong mang dung mot lan: ");
        for (double num : uniqueElements) {
            if (!duplicateElements.contains(num)) {
                System.out.println(num);
            }
        }
    }
}

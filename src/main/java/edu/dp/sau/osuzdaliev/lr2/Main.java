package edu.dp.sau.osuzdaliev.lr2;
import java.util.Random;
import java.util.Scanner;
public class Main {
    private static final int MIN_RANDOM_VALUE = -50;
    private static final int MAX_RANDOM_VALUE = 50;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix width (no more than 20): ");
        int matrixWidth = scanner.nextInt();
        System.out.print("Enter matrix height (no more than 20): ");
        int matrixHeight = scanner.nextInt();
        if (matrixWidth > 20 || matrixHeight > 20) {
            System.out.println("Dimensions cannot exceed 20x20.");
            return;
        }
        int[][] matrix = new int[matrixHeight][matrixWidth];
        System.out.print("Enter 1 for manual filling or 2 for random filling: ");
        int fillingChoice = scanner.nextInt();
        if (fillingChoice == 1) {
            fillMatrixManually(matrix, scanner);
        } else if (fillingChoice == 2) {
            fillMatrixRandomly(matrix);
        } else {
            System.out.println("Invalid choice!");
            return;
        }
        printMatrix(matrix);
        System.out.println("Minimum element in the matrix: " + findMinimum(matrix));
        System.out.println("Maximum element in the matrix: " + findMaximum(matrix));
        System.out.println("Average of matrix elements: " + calculateAverage(matrix));
    }
    private static void fillMatrixManually(int[][] matrix, Scanner scanner) {
        System.out.println("Enter matrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Element [" + row + "][" + col + "]: ");
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
    private static void fillMatrixRandomly(int[][] matrix) {
        Random random = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1);
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    private static int findMinimum(int[][] matrix) {
        int minElement = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < minElement) {
                    minElement = value;
                }
            }
        }
        return minElement;
    }
    private static int findMaximum(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > maxElement) {
                    maxElement = value;
                }
            }
        }
        return maxElement;
    }
    private static double calculateAverage(int[][] matrix) {
        int totalSum = 0;
        int elementCount = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                totalSum += value;
                elementCount++;
            }
        }
        return (double) totalSum / elementCount;
    }
}
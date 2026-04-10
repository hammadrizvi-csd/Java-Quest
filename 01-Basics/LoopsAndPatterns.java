public public class LoopsAndPatterns{
    
    public static void main(String[] args) {
        System.out.println("--- Loops & Patterns for Placement ---");

        // 1. While Loop (Jab tak condition true hai, tab tak chalega)
        int dsaProblemsSolved = 0;
        System.out.println("\nStarting DSA Practice:");
        while (dsaProblemsSolved < 3) {
            dsaProblemsSolved++;
            System.out.println("Solved problem number: " + dsaProblemsSolved);
        }
        System.out.println("Target met for today!");

        // 2. For Loop + Nested Loops (Pattern Printing)
        System.out.println("\n--- Classic Right-Angled Triangle Pattern ---");
        int n = 5; // Number of rows
        
        // Outer loop: Rows handle karta hai
        for (int i = 1; i <= n; i++) {
            
            // Inner loop: Columns handle karta hai (Har row mein kitne stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Notice: println nahi, sirf print use kiya hai
            }
            
            // Ek row complete hone ke baad line change
            System.out.println(); 
        }

        // 3. Break & Continue
        System.out.println("\n--- Break and Continue Demo ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping day 3 (Rest day) using continue.");
                continue; // Is loop iteration ko skip kar dega
            }
            System.out.println("Day " + i + ": Consistent coding.");
        }
    }
} 

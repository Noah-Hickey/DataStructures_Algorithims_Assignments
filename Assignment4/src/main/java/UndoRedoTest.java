public class UndoRedoTest {
    public static void main(String[] args) {

        UndoRedo<String> undoRedo = new UndoRedo<>();

        System.out.println("  Testing Undo/Redo Functionality");
        System.out.println("====================================");
        System.out.println();
        // Null Check //
        System.out.println("Initial State: " + undoRedo.getCurrentState());

        // Add States //
        undoRedo.addState("State 1");
        undoRedo.addState("State 2");
        undoRedo.addState("State 3");
        undoRedo.addState("State 4");

        undoRedo.printStates();
        System.out.println("Current: " + undoRedo.getCurrentState());
        System.out.println();

        // Test undo operations
        System.out.println("=== Testing Undo ====");
        System.out.println("Undo to: " + undoRedo.undo());
        undoRedo.printStates();

        System.out.println("Undo to: " + undoRedo.undo());
        undoRedo.printStates();
        System.out.println();

        // Test redo operations
        System.out.println("=== Testing Redo ===");
        System.out.println("Redo to: " + undoRedo.redo());
        undoRedo.printStates();

        System.out.println("Redo to: " + undoRedo.redo());
        undoRedo.printStates();
        System.out.println();

        // Test the other helper methods //
        System.out.println("=== Helper Methods Test ===");
        System.out.println("Can undo? " + undoRedo.canUndo());
        System.out.println("Can redo? " + undoRedo.canRedo());
        System.out.println("Redo count: " + undoRedo.getRedoCount());
        System.out.println("Is empty? " + undoRedo.isEmpty());
        System.out.println();

        // Undo at the beginning //
        System.out.println("Undoing to the very beginning:");
        while (undoRedo.canUndo()) {
            System.out.println("  Undo to: " + undoRedo.undo());
        }
        undoRedo.printStates();

        // Try to undo when already at the beginning //
        System.out.println("Trying to undo when at beginning: " + undoRedo.undo());

        // Redo at the end //
        System.out.println("Redoing to the very end:");
        while (undoRedo.canRedo()) {
            System.out.println("  Redo to: " + undoRedo.redo());
        }
        undoRedo.printStates();

        // Try to redo when already at the end //
        System.out.println("Trying to redo when at end: " + undoRedo.redo());
        System.out.println();

        // Test branching (creating new history) //
        System.out.println("=== Branching Test ===");
        undoRedo.undo(); // Go back one step
        System.out.println("After undo:");
        undoRedo.printStates();

        undoRedo.addState("New Branch"); // This should remove future states //
        System.out.println("After adding new state (old future should be gone):");
        undoRedo.printStates();
        System.out.println("Can redo now? " + undoRedo.canRedo() + " (should be false)");
        System.out.println();

        // Test with different data types //
        System.out.println("=== Different Data Types Test ===");
        UndoRedo<Integer> intUndoRedo = new UndoRedo<>();
        intUndoRedo.addState(10);
        intUndoRedo.addState(20);
        intUndoRedo.addState(30);

        System.out.println("Integer UndoRedo:");
        intUndoRedo.printStates();
        System.out.println("Undo: " + intUndoRedo.undo());
        intUndoRedo.printStates();
        System.out.println();

        // Test clear functionality //
        System.out.println("=== Clear Test ===");
        System.out.println("Before clear:");
        undoRedo.printStates();

        undoRedo.clear();
        System.out.println("After clear:");
        undoRedo.printStates();
        System.out.println("Is empty? " + undoRedo.isEmpty());
        System.out.println();

        // Test null handling //
        System.out.println("=== Error Handling Test ===");
        try {
            undoRedo.addState(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        // Test operations on empty undo-redo //
        System.out.println("Operations on empty undo-redo:");
        System.out.println("  Undo: " + undoRedo.undo());
        System.out.println("  Redo: " + undoRedo.redo());
        System.out.println("  Current: " + undoRedo.getCurrentState());
        System.out.println("  Can undo: " + undoRedo.canUndo());
        System.out.println("  Can redo: " + undoRedo.canRedo());
    }
}

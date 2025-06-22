public class UndoRedoTest {
    public static void main(String[] args) {

        UndoRedo<String> undoRedo = new UndoRedo<>();

        System.out.println("Testing Undo/Redo Functionality");
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
        System.out.println("Testing Undo:");
        System.out.println("Undo to: " + undoRedo.undo());
        undoRedo.printStates();

        System.out.println("Undo to: " + undoRedo.undo());
        undoRedo.printStates();
        System.out.println();

        // Test redo operations
        System.out.println("Testing Redo:");
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

    }
}

import java.util.LinkedList;

public class UndoRedo<T> {

    private final LinkedList<T> states;
    private int currentIndex;

    public UndoRedo() {
        this.states = new LinkedList<>();
        this.currentIndex = -1; // -1 as there are no states yet /
    }

    public void addState(T state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }

        // Remove all states after the current position //
        while (states.size() > currentIndex + 1) {
            states.removeLast();
        }

        // Add a new state //
        states.add(state);
        currentIndex++;
    }

    public T undo() {
        if (canUndo()) {
            currentIndex--;
            return states.get(currentIndex);
        }
        return null;
    }

    public T redo() {
        if (canRedo()) {
            currentIndex++;
            return states.get(currentIndex);
        }
        return null;
    }

    public T getCurrentState() {
        if (currentIndex >= 0 && currentIndex < states.size()) {
            return states.get(currentIndex);
        }
        return null;
    }

    public boolean canUndo() {
        return currentIndex > 0;
    }

    public boolean canRedo() {
        return currentIndex < states.size() - 1;
    }

    public int getRedoCount() {
        return states.size() - currentIndex - 1;
    }

    // Clear all states and reset the current index //
    public void clear() {
        states.clear();
        currentIndex = -1;
    }

    public boolean isEmpty() {
        return states.isEmpty();
    }

    public void printStates() {
        if (states.isEmpty()) {
            System.out.println("No states available");
            return;
        }

        System.out.print("States: ");
        for (int i = 0; i < states.size(); i++) {
            if (i == currentIndex) {
                System.out.print("[" + states.get(i) + "] ");
            } else {
                System.out.print(states.get(i) + " ");
            }
        }
        System.out.println();
    }

    // Additional helpful methods //
    public int getStateCount() {
        return states.size();
    }

    public T getFirstState() {
        return states.isEmpty() ? null : states.getFirst();
    }

    public T getLastState() {
        return states.isEmpty() ? null : states.getLast();
    }

    // Get state at specific position (0-based)
    public T getStateAt(int index) {
        if (index >= 0 && index < states.size()) {
            return states.get(index);
        }
        return null;
    }

}







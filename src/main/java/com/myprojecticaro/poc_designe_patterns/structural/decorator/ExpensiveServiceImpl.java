public class ExpensiveServiceImpl implements ExpensiveService {

    @Override
    public int calculate(int input) {
        try { Thread.sleep(2000); } catch (Exception ignored) {}
        return input * 10;
    }
}

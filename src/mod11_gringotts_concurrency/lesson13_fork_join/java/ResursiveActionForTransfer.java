package mod11_gringotts_concurrency.lesson13_fork_join.java;


import java.util.concurrent.RecursiveAction;

public class ResursiveActionForTransfer extends RecursiveAction {
    private final int THRESHOLD = 100;
    private final Transfer[] transfers;
    private final int start;
    private final int end;

    public ResursiveActionForTransfer(Transfer[] transfers, int start, int end) {
        this.transfers = transfers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                transfers[i].execute();
            }
        } else {
            int mid = (end + start) / 2;
//            invokeAll(new ResursiveActionForTransfer(transfers, 0, mid),
//                    new ResursiveActionForTransfer(transfers, mid, end));
            var action1 = new ResursiveActionForTransfer(transfers, 0, mid);
            var action2 = new ResursiveActionForTransfer(transfers, mid, end);

            //Асинхронно запускаем задачи
            action1.fork();
            action2.fork();

            //Ожидание завершения обоих подзадач
            action1.join();
            action2.join();

        }
    }
}

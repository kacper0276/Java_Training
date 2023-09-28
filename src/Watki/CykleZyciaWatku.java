package Watki;

public class CykleZyciaWatku {
    // NEW - nowo utworzony wątek, jeszcze nie rozpoczął swojej pracy
    // RUNNABLE - działający wątek, albo gotowy do rozpoczęcia swojej pracy, ale czekający na zasoby
    // BLOCKED - oczekuje na zablokowany zasób, aby uzyskać do niego dostęp. Odbywa się to za pomocą monitorów służących do synchronizacji wątków
    // WAITING - czeka na inny wątek, aż zakończy swoją prace bez limitu pracy
    // TIMED_WAITING - uśpiony wątek oczekuje określony czas np. po wywołaniu metody sleep()
    // TERMINATED - wątek zakończył swoją pracę
}

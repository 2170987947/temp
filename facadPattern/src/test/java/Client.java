import org.example.BackupFacade;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 20:33
 */
public class Client {
    @Test
    public void main() {
        BackupFacade backupFacade = new BackupFacade();
        Assert.assertNotNull(backupFacade);
        backupFacade.oneKeyBackup();
    }
}

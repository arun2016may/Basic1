import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 2
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Loading files - Please wait...");
        shell.open();
        while (!shell.isDisposed()) {
           if (!display.readAndDispatch()) display.sleep();
}
      display.dispose();
	}

}

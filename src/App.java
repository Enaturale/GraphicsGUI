public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        SplashScreen splashscreen = new SplashScreen();

        try{
            for(int i=0; i<=100; ++i){
                Thread.sleep(50);
                splashscreen.progress.setValue(i);
                splashscreen.ProgressStatus.setText(Integer.toString(i) + "% Loading");
            }
        }catch(Exception e){

        }

        Dashboard dashboard = new Dashboard();
        splashscreen.frame.dispose();
    }
}

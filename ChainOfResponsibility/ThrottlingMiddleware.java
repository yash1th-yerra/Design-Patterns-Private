public class ThrottlingMiddleware extends Middleware {

    private int requestPerMintute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMintute) {
        this.requestPerMintute = requestPerMintute;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if (request > requestPerMintute) {
            System.out.println("Request time exceeded!");
            Thread.currentThread().interrupt();
        }
        return checkNext(email, password);
    }

}

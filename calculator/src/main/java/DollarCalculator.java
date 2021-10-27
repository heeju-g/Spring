public class DollarCalculator implements ICalculator{

    private int price = 1;
    //계산기는 계산역할만 해야하니까, 시세 알아오는 marketApi를 외부에서 주입하는 방식으로 빼자
    private MarketApi marketApi;

    public DollarCalculator(MarketApi marketApi){
        this.marketApi = marketApi;
    }
    //초기화할때 connect로 가격알아오는 거
    public void init(){
        this.price = marketApi.connect();
    }

    @Override
    public int sum(int x, int y) {
        x*=price;
        y*=price;
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        x*=price;
        y*=price;
        return x-y;
    }
}

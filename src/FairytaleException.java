class FairytaleException extends Exception{
    private String exc;
    FairytaleException(String s){
        super(s);
        exc = s;
    }

    public String getExc() {
        return exc;
    }
}

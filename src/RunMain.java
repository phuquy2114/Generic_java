public class RunMain {

    public static void main(String[] args) {
        BaseModel<Integer> st = new BaseModel<>();
        st.setModel(10);
        System.out.println(""+st.getModel());

        ArrayPhuQuy<String> stringArrayPhuQuy = new ArrayPhuQuy<>();
        stringArrayPhuQuy.addPhuQuy("PQ");
        ArrayPhuQuy<Integer> interArrayPhuQuy = new ArrayPhuQuy<>();
        interArrayPhuQuy.addPhuQuy(10);
    }
}

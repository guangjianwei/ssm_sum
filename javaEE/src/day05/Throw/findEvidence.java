package day05.Throw;

public class findEvidence {
    public static void main(String[] args) {
        System.out.println("开庭审理案件");
        System.out.println("请出示证据");
        try {
            findEvidenced("不确定证据");
        } catch (ClassNotFoundException e) {
            System.out.println("赶紧去死");
        }
        System.out.println("审判结束，无期徒刑，哈哈哈");
    }

    private static void findEvidenced(String evidence) throws ClassNotFoundException {
        if(!evidence.equals("证据")){
            throw new ClassNotFoundException();
        }else{
            System.out.println("证据确凿！");
        }
    }
}

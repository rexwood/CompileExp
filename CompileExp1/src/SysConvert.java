/**
 * ������ѧ����
 *
 * @author Suage
 */
 
public class SysConvert {
    //������ǰ����
    private static SysConvert instance = new SysConvert();
    //���ü����ַ�
    private static String unit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //��������
    private String number;
    //�������
    private int sysIn;
    //�������
    private int sysOut;
    //����ʵ��ֵ
    private double actualValue;
    //С�����㾫��
    private int precision;
    //���ڴ�Ž��
    private StringBuilder result = new StringBuilder();
 
    private SysConvert() {
    }
 
    public static SysConvert getInstance() {
        return instance;
    }
 
    /**
     * ��ȡ��ǰλ�������ֵ
     *
     * @param sys   ������
     * @param index ����С����ľ���
     * @param var   ��ǰλ��ʾ�ַ�
     * @return ��ǰλ�������ֵ
     */
    private static double changeNI(int sys, int index, char var) {
        return unit.indexOf(var) * Math.pow(sys, index);
    }
 
    /**
     * ��ֵת��Ϊ��Ӧ���Ʊ�ʾ�ַ�
     *
     * @param sys ������
     * @param var ֵ
     * @return ��Ӧ���Ʊ�ʾ�ַ�
     */
    private static char changeIN(int sys, int var) {
        return unit.charAt(var);
    }
 
    /**
     * ����ʵ��ֵ
     */
    private void calculateActualValue() {
        //���С����
        int pointIndex = number.indexOf('.');
 
        //������������
        if (pointIndex < 0) {//���û��С������
            for (int i = 0; i < number.length(); i++) {
                actualValue += (long) changeNI(sysIn, i, number.charAt(number.length() - i - 1));
            }
        } else {//����
            for (int i = 0; i < pointIndex; i++) {
                actualValue += (long) changeNI(sysIn, i, number.charAt(pointIndex - i - 1));
            }
        }
 
        if (!(pointIndex < 0)) {//�����С������
            //����С������
            for (int i = pointIndex + 1; i < number.length(); i++) {
                actualValue += changeNI(sysIn, pointIndex - i, number.charAt(i));
            }
        }
    }
 
    /**
     * ת��Ϊָ������
     */
    private void Convert() {
        //����������С��
        long integerPart = (long) actualValue;
        double decimalsPart = actualValue - integerPart;
 
        //�����ַ��������ڱ�����
        while (integerPart >= sysOut) { //����������,ȡ����
            result.insert(0, changeIN(sysOut, (int) (integerPart % sysOut))); //׷�ӽ��
            integerPart = integerPart / sysOut;//��
        }
        if (integerPart != 0) { //������δ������
            result.insert(0, changeIN(sysOut, (int) integerPart)); //׷�ӽ��
        }
 
        if (decimalsPart > 0) { //�����С������
            //���С����
            result.append(".");
            for (int t = 0; t < precision; t++) {
                decimalsPart = decimalsPart * sysOut;
                result.append(changeIN(sysOut, (int) decimalsPart));
                decimalsPart = decimalsPart - (int) decimalsPart;
            }
        }
    }
 
    /**
     * ����ת��
     *
     * @param sysIn     �������(Input base)
     * @param sysOut    �������(Output base)
     * @param number    ��������(Input number)
     * @param precision �������(��С���˲�����Ч)(Output precision (non-decimal this parameter is not valid))
     * @return ���ת�����
     */
    public String Convert(int sysIn, int sysOut, String number, int precision) {
        this.sysIn = sysIn;
        this.sysOut = sysOut;
        this.number = number;
        this.precision = precision;
        actualValue = 0;
        result.delete(0, result.length());
        calculateActualValue();
        Convert();
        return result.toString();
    }
}
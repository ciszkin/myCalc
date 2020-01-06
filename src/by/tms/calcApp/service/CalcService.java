package by.tms.calcApp.service;

import static by.tms.calcApp.entity.Calculator.*;

public class CalcService {

    public Double calc(double a, double b, String operation) {
        Double result = null;
        switch (operation) {
            case "sum":
                result = sum(a, b);
                break;
            case "sub":
                result = sub(a, b);
                break;
            case "div":
                result = div(a, b);
                break;
            case "mul":
                result = mul(a, b);
                break;
            default:
                break;
        }
        return result;
    }


}

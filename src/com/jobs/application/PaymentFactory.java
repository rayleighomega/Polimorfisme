package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory
{
    public static IPaymentRate createPaymentRateBoss()
    {
        return new IPaymentRate()
            {	
                @Override
                public double pay(double salaryPerMonth)
                {
                    return salaryPerMonth*1.5; //base salary plus 50%
                }
        };
    }

    public static IPaymentRate createPaymentRateEmployee()
    {
        return new IPaymentRate()
        {
                @Override
                public double pay(double salaryPerMonth)
                {
                        return salaryPerMonth * 0.85; //base salary minus 15%
                }
        };
    }
 
    public static IPaymentRate createPaymentRateVolunteer()
    {
        return new IPaymentRate()
        {
                @Override
                public double pay(double salaryPerMonth)
                {
                        return 0; //no salary
                }
        };
    }
    
        public static IPaymentRate createPaymentRateManager()
    {
        return new IPaymentRate()
        {
                @Override
                public double pay(double salaryPerMonth)
                {
                        return salaryPerMonth * 1.1; //base salary plus 10%
                }
        };
    }

}

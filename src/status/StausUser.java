/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 * @MODIFIED BY Juan Munoz February 9, 2026
 */
public class StausUser 
{
   public void statusDetail(StatusCode code)
{
switch(code)
        {
        case ZERO: 
            System.out.println(ResultCode.REJECTED);
        break;
        case ONE: 
            System.out.println(ResultCode.PENDING);
        break;
        case TWO:
            System.out.println(ResultCode.PROCESSING);
        break;
        case THREE: 
            System.out.println(ResultCode.APPROVED);
        break;
        case FOUR: 
            System.out.println(ResultCode.COMPLETED);
        break;
        default:
            System.out.println(ResultCode.IN_VALID_CODE);
        break;
        }
}
 
}

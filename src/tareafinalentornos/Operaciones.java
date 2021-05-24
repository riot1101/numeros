/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafinalentornos;

/**
 *
 * @author CES
 */
public class Operaciones {

    /**
     *
     * @param a
     * @param b
     * @return
     * no pasa test java.lang.ArrayIndexOutOfBoundsException
     * da una matriz de arrays negativa, no pasa test
     * 
     * 
     * 
     */
    public int[] rango (int a, int b){
		int[] nums = new int[b-a];
		for (int i=a; i<b; i++){
			nums[i]=i;
		}
		return nums;
	}

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int sumRango(int a, int b){
		int sum = 0;
		for (int i=a; i<b; i++){
			sum+=i;
		}
		return sum;
	}

    /**
     *
     * @param a
     * @return
     * PASA TEST, ES CORRECTO
     */
    public boolean isPar(int a){
		if(a%2==0){
			return true;
		}
		return false;
	}

    /**
     *
     * @param nums
     * @return
     * 
     */
    public int[] extraerPositivos(int []nums){
		
		int n=0;
		for (int i=0; i<nums.length; i++){
			if(nums[i]>0){
				n++;
			}
		}

		int []positivos = new int[n];
		int j=0;
		for (int i=0; i<nums.length; i++){
			if(nums[i]>0){
				positivos[j]=nums[i];
				j++;
			}
		}
		return positivos;
	}
}

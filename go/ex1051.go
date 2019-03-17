package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func calculate(value float64) float64 {

	ret := 0.0

	if value > 4500.00 {
		ret += (value - 4500.00) * .10
	}

	if value > 3000.00 {
		ret += (value - 3000.00) * .10
	}

	if value > 2000.00 {
		ret += (value - 2000.00) * .08
	}

	return ret
}

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	for scanner.Scan() {
		input := scanner.Text()

		salary, _ := strconv.ParseFloat(input, 32)

		if salary == 0.0 {
			break
		}

		value := calculate(salary)

		if value == 0.0 {
			fmt.Println("Isento")
		} else {
			fmt.Printf("R$ %.2f\n", value)
		}
	}
}

package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	positivesSum, totalPositives := 0.0, 0.0

	scanner := bufio.NewScanner(os.Stdin)

	for i := 0; i < 6; i++ {
		scanner.Scan()
		input := scanner.Text()

		value, _ := strconv.ParseFloat(input, 32)

		if value > 0.0 {
			positivesSum += value
			totalPositives++
		}
	}

	fmt.Printf("%v valores positivos\n", totalPositives)
	fmt.Printf("%.1f\n", positivesSum/totalPositives)
}

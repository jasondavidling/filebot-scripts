#!/usr/bin/env filebot -script


// print input watch folders
args.each{ folder -> log.fine "Watch $folder" }


// watch given input folder
args*.watchFolder{ changes ->
	// call amc script on newly added files
	executeScript('amc', changes)
}


// keep running indefinitely
println "Press ENTER to quit..."
console.readLine()

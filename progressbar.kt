fun progressBar(progress: Float){
	when{
		progress < 0.05 -> print("[#                   ] 5%\r")
		progress < 0.1 ->  print("[##                  ] 10%\r")
		progress < 0.15 -> print("[###                 ] 15%\r")
		progress < 0.2 ->  print("[####                ] 20%\r")
		progress < 0.25 -> print("[#####               ] 25%\r")
		progress < 0.3 ->  print("[######              ] 30%\r")
		progress < 0.35 -> print("[#######             ] 35%\r")
		progress < 0.4 ->  print("[########            ] 40%\r")
		progress < 0.45 -> print("[#########           ] 45%\r")
		progress < 0.5 ->  print("[##########          ] 50%\r")
		progress < 0.55 -> print("[###########         ] 55%\r")
		progress < 0.6 ->  print("[############        ] 60%\r")
		progress < 0.65 -> print("[#############       ] 65%\r")
		progress < 0.7 ->  print("[##############      ] 70%\r")
		progress < 0.75 -> print("[###############     ] 75%\r")
		progress < 0.8 ->  print("[################    ] 80%\r")
		progress < 0.85 -> print("[#################   ] 85%\r")
		progress < 0.9 ->  print("[##################  ] 90%\r")
		progress < 0.95 -> print("[################### ] 95%\r")
		progress < 1   ->  print("[####################] 100%\r")
	}
}

/*!
 * Bootstrap v3.3.4 (http://getbootstrap.com)
 * Copyright 2011-2015 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 */
			//FUNZIONE PER RICERCA IN TABELLA
			function ricercaInTable(id_table) {
				ripristinaTable(id_table);
				var valore = document.ricerca.campo.value;
				var table = document.getElementById(id_table);
				var celle = table.getElementsByTagName('td');
				var contatore = 0;
				for (var j = 0; j < celle.length; j++) {
					if (celle[j].innerHTML == valore) {
						celle[j].className = 'trovato';
						contatore++;
					}
				}
				document.getElementById('responso').innerHTML = 'Trovati: '
						+ contatore;
			}

			// FUNZIONE CHE RIPRISTINA LO STILE INIZIALE DELLA TABELLA
			function ripristinaTable(id_table) {
				var table = document.getElementById(id_table);
				var celle = table.getElementsByTagName('td');
				for (var j = 0; j < celle.length; j++) {
					celle[j].className = 'default';
				}
				document.getElementById('responso').innerHTML = '';
			}
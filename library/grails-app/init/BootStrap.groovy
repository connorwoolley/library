import com.library.*

class BootStrap {

    def init = { servletContext ->

			def librarian1= new Librarian
				(name:'Bob Smith',
				email: 'BS@mail.com',
				userName: 'BS1',
				password: 'password',
				telephone: '01142390745').save()

			def librarian2= new Librarian
				(name:'Harry Owen',
				email: 'HO@mail.com',
				userName: 'HO1',
				password: 'password',
				telephone: '01142981375').save()

			def librarian3= new Librarian
				(name:'Jess Matts',
				email: 'JM@mail.com',
				userName: 'JM1',
				password: 'password',
				telephone: '0114297456').save()

			
			def library1= new Library
				(location: 'Sheffield',
				openingHours: '9-5',
				book: 'romance',
				student: 'Steven Gerrard').save()

			def library2= new Library
				(location: 'Leeds',
				openingHours: '9-5',
				book: 'Sci Fi',
				student: 'Fiona Bibs').save()

			def library3= new Library
				(location: 'Wakefield',
				openingHours: '9-5',
				book: 'Horror',
				student: 'Andrew Miller').save()



			def book1= new Book
				(title: 'Harry Potter 1',
				author: 'JK Rowling',
				isbn: '1541098331',
				dateBorrowed: '20/04/2016',
				returnDate: '02/04/2016',
				student: 'Steven Gerrard').save()

			def book2= new Book
				(title: 'The Hunger Games 1',
				author: 'Brian Cooper',
				isbn: '9736308523',
				dateBorrowed: '16/03/2016',
				returnDate: '04/08/2016',
				student: 'Fiona Bibs').save()

			def book3= new Book
				(title: 'Monsters Inc',
				author: 'Martin Cooper',
				isbn: '3014297863',
				dateBorrowed: '26/03/2016',
				returnDate: '25/04/2016',
				student: 'Andrew Miller').save()

		
			def course1= new Course
				(title: 'Web',
				code: 'w1',
				tutor: 'Martin Smith',
				department: 'Computing',
				description: '''We teach CSS HTML etc.
				We Teach CSS HTML etc. ''').save()

			def course2= new Course
				(title: 'Games Design',
				code: 'gd1',
				tutor: 'Sue Hepworth',
				department: 'Computing',
				description: '''Here we make games. Here 					we make games. Here we make games. ''').save()

			def course3= new Course
				(title: 'English',
				code: 'e1',
				tutor: 'David Brown',
				department: 'English',
				description: '''Here we teach English. Here 					we teach English. ''').save()


			def student1= new Student
				(name: 'Steven Gerrard',
				email: 'SG@unimail.com',
				studentId: 'B1207623',
				course:course1).save()

			def student2= new Student
				(name: 'Fiona Bibs',
				email: 'FB@unimail.com',
				studentId: 'B7031365',
				course:course2).save()

			def student3= new Student
				(name: 'Andrew Miller',
				email: 'AM@unimail.com',
				studentId: 'B6098455',
				course:course3).save()

					
			library1.addToLibrarians(librarian1)
			library2.addToLibrarians(librarian2)
			library3.addToLibrarians(librarian3)
			
	
			library1.addToBooks(book1)
			library2.addToBooks(book2)
			library3.addToBooks(book3)
			

			library1.addToStudents(student1)
			library2.addToStudents(student2)
			library3.addToStudents(student3)
			

			


    }
    def destroy = {
    }
}

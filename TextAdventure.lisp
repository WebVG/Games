;; text game from land of lisp, this is a graph with three nodes and four edges
;; nodes represented as ellipses	edges represented as arrows
;; looking around	-	walking to locations	-	picking up objects	-	actions performed with objects

#| the nodes variable is the game locations 
		*there are no strings used to handle this text
			how is the text handled?
		*|#
 
(defparameter *nodes* '((living-room (you are in the living-room.
							a wizard is snoring loudly on the couch.))
						(garden (you are in a beautiful garden.
							there is a well in front of you.))
						(attic (you are in the attic.
							there is a giant welding torch in the corner.))))
;;describe the locations - find garden node using assoc function create new function pass location and the list of locations
(assoc 'garden *nodes*)
(defun describe-location (location nodes)
	(cadr (assoc location nodes)))
;;now there are descriptions of locations
#|the edges variable acts as the paths to the locations in the game. edges as in lines to nodes on a graph |#
(defparameter *edges* '((living-room (garden west door)
									 ( attic upstairs ladder))
						(garden (living-room east door))
						(attic  (living-room downstairs ladder))))
;;describe the path - the single or back quote will tell lisp to turn to data mode the comma goes back to code
;; we have created a piece of data with formatted bits of information inserted into it. 
(defun describe-path (edge)
	`(there is a ,(caddr edge) going ,(cadr edge) from here.))

(defun describe-paths (location edges)
	(apply #'append (mapcar #'describe-path (cdr (assoc location edges)))))


#|whats happening here in the describe-paths function is unique to lisp. cdr is ued on the assoc to determine the edges 
	mext the edges are converted into descriptions the mapcar then hashes these descriptions. What's happening here is that 
	a function is being passed through a function, similar to javaScript.|#
(defparameter *objects* '(whiskey bucket frog chain))
(defparameter *object-locations* '((whiskey living-room)
									(bucket living-room)
									(chain garden)
									(frog garden)))
(defun objects-at (loc objs obj-locs)
	(labels ((at-loc-p (obj)
				(eq (cadr (assoc obj obj-locs)) loc)))
		(remove-if-not #'at-loc-p objs)))
#|This is inserting an object into a description of an object|#
(defun describe-objects (loc objs obj-loc)
	(labels ((describe-obj (obj)
				`(you see a ,obj on the floor.)))
		(apply #'append (mapcar #'describe-obj (objects-at loc objs obj-loc)))))

(describe-objects 'living-room *objects* *object-locations*)

(defun describe-objects (loc objs obj-loc)
  (labels ((describe-obj (obj)
				`(you see a ,obj on the floor.)))
	(apply #'append (mapcar #'describe-obj (objects-at loc objs obj-loc)))))
;; location is initalized at the living-room making the start of the game in the living room.
(defparameter *location* 'living-room) 

(defun look()
	(append (describe-location *location* *nodes*)
			(describe-paths *location* *edges*)
			(describe-objects *location* *objects* *object-locations*)))
(defun walk (direction)
  (let ((next (find direction
					(cdr (assoc *location* *edges*))
					:key #'cadr)))
  (if next
		(progn (setf *location* (car next))
			   (look))
		'(you cannot go that way.))))
(defun pickup (object)
 (cond ((member object
				(objects-at *location* *objects* *object-locations*))
		(push (list object 'body) *object-locations*)
			`(you are now carrying the ,object))
		(t '(you cannot get that.))))

(defun inventory ()
	(cons 'items- (objects-at 'body *objects* *object-locations*)))
#|
controls
(look)
(walk)
(pickup)


|#
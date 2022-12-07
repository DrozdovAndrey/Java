package OOP05.Ex003Math.Core.Presenters;

 

import OOP05.Ex003Math.Core.Infrastructure.Generator;
import OOP05.Ex003Math.Core.Models.Model;
import OOP05.Ex003Math.Core.Views.View;
import OOP05.Ex003Math.Mathematics.Exceptions.UnacceptableValueException;
import OOP05.Ex003Math.Mathematics.Shapes.Circle;
import OOP05.Ex003Math.Mathematics.Shapes.Rectangle;
import OOP05.Ex003Math.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}

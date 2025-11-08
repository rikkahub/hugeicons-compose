package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VegetarianFood: ImageVector
    get() {
        if (_vegetarianFood != null) {
            return _vegetarianFood!!
        }
        _vegetarianFood = ImageVector.Builder(
            name = "VegetarianFood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 13.2308f)
        curveTo(17f, 13.2308f, 16.0909f, 12.7693f, 15.1818f, 12.7693f)
        curveTo(13.8182f, 12.7693f, 12f, 14.6154f, 12f, 17.3846f)
        curveTo(12f, 20.1537f, 14.4896f, 22f, 17f, 22f)
        curveTo(19.5104f, 22f, 22f, 20.1537f, 22f, 17.3846f)
        curveTo(22f, 14.6154f, 20.1818f, 12.7693f, 18.8182f, 12.7693f)
        curveTo(17.9091f, 12.7693f, 17f, 13.2308f, 17f, 13.2308f)
        moveTo(17f, 13.2308f)
        curveTo(17f, 11.8462f, 17.9091f, 10f, 19.7273f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.655f, 5f)
        curveTo(11.5512f, 5f, 12.2778f, 4.32843f, 12.2778f, 3.5f)
        curveTo(12.2778f, 2.67157f, 11.5512f, 2f, 10.655f, 2f)
        horizontalLineTo(5.24561f)
        curveTo(4.34936f, 2f, 3.6228f, 2.67157f, 3.6228f, 3.5f)
        curveTo(3.6228f, 4.32843f, 4.34936f, 5f, 5.24561f, 5f)
        moveTo(11.1693f, 4.92311f)
        curveTo(12.1247f, 6.68943f, 12.9095f, 8.28337f, 13.3888f, 10f)
        curveTo(13.4279f, 10.1401f, 13.465f, 10.281f, 13.5f, 10.4229f)
        moveTo(10.428f, 22f)
        horizontalLineTo(6.32748f)
        curveTo(2.74721f, 22f, 2f, 21.3093f, 2f, 18f)
        verticalLineTo(13.7771f)
        curveTo(2f, 10.3773f, 3.09757f, 7.88562f, 4.70467f, 4.91465f)
        }
        }.build()

        return _vegetarianFood!!
    }

private var _vegetarianFood: ImageVector? = null

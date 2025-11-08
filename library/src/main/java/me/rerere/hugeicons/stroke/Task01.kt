package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Task01: ImageVector
    get() {
        if (_task01 != null) {
            return _task01!!
        }
        _task01 = ImageVector.Builder(
            name = "Task01",
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
        moveTo(14.4961f, 2.00027f)
        horizontalLineTo(9.49609f)
        curveTo(8.66766f, 2.00027f, 7.99609f, 2.67185f, 7.99609f, 3.50027f)
        curveTo(7.99609f, 4.3287f, 8.66766f, 5.00027f, 9.49609f, 5.00027f)
        horizontalLineTo(14.4961f)
        curveTo(15.3245f, 5.00027f, 15.9961f, 4.3287f, 15.9961f, 3.50027f)
        curveTo(15.9961f, 2.67185f, 15.3245f, 2.00027f, 14.4961f, 2.00027f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99609f, 15.0003f)
        horizontalLineTo(11.4247f)
        moveTo(7.99609f, 11.0003f)
        horizontalLineTo(15.9961f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9961f, 3.50027f)
        curveTo(17.5495f, 3.54709f, 18.4761f, 3.72035f, 19.1174f, 4.36164f)
        curveTo(19.9961f, 5.24032f, 19.9961f, 6.65451f, 19.9961f, 9.4829f)
        lineTo(19.9961f, 15.9997f)
        curveTo(19.9961f, 18.8282f, 19.9961f, 20.2424f, 19.1174f, 21.1211f)
        curveTo(18.2387f, 21.9997f, 16.8245f, 21.9997f, 13.9961f, 21.9997f)
        lineTo(9.99608f, 21.9997f)
        curveTo(7.16766f, 21.9997f, 5.75345f, 21.9997f, 4.87477f, 21.1211f)
        curveTo(3.9961f, 20.2424f, 3.99609f, 18.8282f, 3.99609f, 15.9998f)
        lineTo(3.9961f, 9.48296f)
        curveTo(3.99609f, 6.65453f, 3.99609f, 5.24031f, 4.87477f, 4.36163f)
        curveTo(5.51605f, 3.72034f, 6.4426f, 3.54708f, 7.99599f, 3.50027f)
        }
        }.build()

        return _task01!!
    }

private var _task01: ImageVector? = null

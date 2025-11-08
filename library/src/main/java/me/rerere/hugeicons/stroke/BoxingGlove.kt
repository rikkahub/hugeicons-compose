package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = ImageVector.Builder(
            name = "BoxingGlove",
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
        moveTo(16.5841f, 6.05737f)
        curveTo(18.9187f, 6.05737f, 19.5461f, 9.24441f, 18.5423f, 11.3422f)
        curveTo(18.0933f, 12.2806f, 17.3165f, 13.1051f, 16.6946f, 13.9357f)
        curveTo(16.0982f, 14.7322f, 15.8f, 15.1304f, 15.408f, 15.4091f)
        curveTo(14.5339f, 16.0304f, 13.522f, 16f, 12.4897f, 16f)
        horizontalLineTo(11.4583f)
        curveTo(8.91929f, 16f, 7.64977f, 16f, 6.81095f, 15.2904f)
        curveTo(5.97214f, 14.5809f, 5.76679f, 13.3596f, 5.3561f, 10.917f)
        curveTo(5.13029f, 9.57401f, 4.97133f, 8.23222f, 5.00434f, 6.93135f)
        curveTo(5.06478f, 4.54904f, 6.8888f, 2.54273f, 9.35241f, 2.14874f)
        curveTo(10.526f, 1.96106f, 11.9711f, 1.94251f, 13.1454f, 2.14182f)
        curveTo(15.2422f, 2.49775f, 16.7207f, 4.30419f, 16.5741f, 6.33112f)
        curveTo(16.4847f, 7.56721f, 15.9831f, 8.83974f, 15.67f, 10.0344f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00391f, 15.5f)
        verticalLineTo(18f)
        curveTo(7.00391f, 19.8856f, 7.00391f, 20.8284f, 7.58969f, 21.4142f)
        curveTo(8.17548f, 22f, 9.11829f, 22f, 11.0039f, 22f)
        horizontalLineTo(12.0039f)
        curveTo(13.8895f, 22f, 14.8323f, 22f, 15.4181f, 21.4142f)
        curveTo(16.0039f, 20.8284f, 16.0039f, 19.8856f, 16.0039f, 18f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00391f, 19f)
        horizontalLineTo(10.0039f)
        }
        }.build()

        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null

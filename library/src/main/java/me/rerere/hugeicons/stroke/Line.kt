package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = ImageVector.Builder(
            name = "Line",
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
        moveTo(2f, 10.5f)
        curveTo(2f, 15.1944f, 6.47715f, 19f, 12f, 19f)
        curveTo(12.6849f, 19f, 13.3538f, 18.9415f, 14f, 18.83f)
        verticalLineTo(22f)
        curveTo(15.6708f, 20.365f, 18.5f, 17.5f, 20.2561f, 15.2974f)
        curveTo(21.3564f, 13.9321f, 22f, 12.2799f, 22f, 10.5f)
        curveTo(22f, 5.80558f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 5.80558f, 2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8.5f)
        verticalLineTo(12.5f)
        horizontalLineTo(7f)
        moveTo(9f, 8.5f)
        verticalLineTo(12.5f)
        moveTo(11.1f, 12.5f)
        verticalLineTo(8.5f)
        lineTo(13.5f, 12.5f)
        verticalLineTo(8.5f)
        moveTo(17.5f, 8.5f)
        horizontalLineTo(15.6f)
        verticalLineTo(10.5f)
        moveTo(17.5f, 12.5f)
        horizontalLineTo(15.6f)
        verticalLineTo(10.5f)
        moveTo(15.6f, 10.5f)
        horizontalLineTo(17.04f)
        }
        }.build()

        return _line!!
    }

private var _line: ImageVector? = null

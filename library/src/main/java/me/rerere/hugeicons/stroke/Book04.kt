package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Book04: ImageVector
    get() {
        if (_book04 != null) {
            return _book04!!
        }
        _book04 = ImageVector.Builder(
            name = "Book04",
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
        moveTo(19.543f, 2f)
        horizontalLineTo(6.5f)
        curveTo(5.11929f, 2f, 4f, 3.11929f, 4f, 4.5f)
        curveTo(4f, 4.5454f, 4.00121f, 4.59053f, 4.0036f, 4.63533f)
        moveTo(6.5f, 4.5f)
        horizontalLineTo(16f)
        curveTo(16.9428f, 4.5f, 17.4142f, 4.5f, 17.7071f, 4.79289f)
        curveTo(18f, 5.08579f, 18f, 5.55719f, 18f, 6.5f)
        moveTo(4.0036f, 4.63533f)
        curveTo(4.0739f, 5.95312f, 5.16469f, 7f, 6.5f, 7f)
        horizontalLineTo(16f)
        curveTo(17.8856f, 7f, 18.8284f, 7f, 19.4142f, 7.58579f)
        curveTo(20f, 8.17157f, 20f, 9.11438f, 20f, 11f)
        lineTo(20f, 18f)
        curveTo(20f, 19.8856f, 20f, 20.8284f, 19.4142f, 21.4142f)
        curveTo(18.8284f, 22f, 17.8856f, 22f, 16f, 22f)
        horizontalLineTo(10.0036f)
        curveTo(7.17517f, 22f, 5.76096f, 22f, 4.88228f, 21.1213f)
        curveTo(4.0036f, 20.2426f, 4.0036f, 18.8284f, 4.0036f, 16f)
        verticalLineTo(4.63533f)
        moveTo(4.0036f, 4.63533f)
        verticalLineTo(4.50127f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 12.5f)
        horizontalLineTo(8.5f)
        moveTo(12.5f, 16.5f)
        horizontalLineTo(8.5f)
        }
        }.build()

        return _book04!!
    }

private var _book04: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SevenSquare: ImageVector
    get() {
        if (_sevenSquare != null) {
            return _sevenSquare!!
        }
        _sevenSquare = ImageVector.Builder(
            name = "SevenSquare",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.99707f, 12f)
        curveTo(2.99707f, 7.52166f, 2.99707f, 5.28249f, 4.38831f, 3.89124f)
        curveTo(5.77956f, 2.5f, 8.01873f, 2.5f, 12.4971f, 2.5f)
        curveTo(16.9754f, 2.5f, 19.2146f, 2.5f, 20.6058f, 3.89124f)
        curveTo(21.9971f, 5.28249f, 21.9971f, 7.52166f, 21.9971f, 12f)
        curveTo(21.9971f, 16.4783f, 21.9971f, 18.7175f, 20.6058f, 20.1088f)
        curveTo(19.2146f, 21.5f, 16.9754f, 21.5f, 12.4971f, 21.5f)
        curveTo(8.01873f, 21.5f, 5.77956f, 21.5f, 4.38831f, 20.1088f)
        curveTo(2.99707f, 18.7175f, 2.99707f, 16.4783f, 2.99707f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.49707f, 7f)
        horizontalLineTo(15.0811f)
        curveTo(15.3108f, 7f, 15.4971f, 7.18625f, 15.4971f, 7.41599f)
        curveTo(15.4971f, 7.47144f, 15.486f, 7.52632f, 15.4645f, 7.57742f)
        lineTo(11.4971f, 17f)
        }
        }.build()

        return _sevenSquare!!
    }

private var _sevenSquare: ImageVector? = null

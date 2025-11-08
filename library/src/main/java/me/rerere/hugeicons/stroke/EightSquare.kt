package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EightSquare: ImageVector
    get() {
        if (_eightSquare != null) {
            return _eightSquare!!
        }
        _eightSquare = ImageVector.Builder(
            name = "EightSquare",
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
        moveTo(12.9971f, 12f)
        horizontalLineTo(11.9971f)
        moveTo(12.9971f, 12f)
        curveTo(14.3778f, 12f, 15.4971f, 10.8807f, 15.4971f, 9.5f)
        curveTo(15.4971f, 8.11929f, 14.3778f, 7f, 12.9971f, 7f)
        horizontalLineTo(11.9971f)
        curveTo(10.6164f, 7f, 9.49707f, 8.11929f, 9.49707f, 9.5f)
        curveTo(9.49707f, 10.8807f, 10.6164f, 12f, 11.9971f, 12f)
        moveTo(12.9971f, 12f)
        curveTo(14.3778f, 12f, 15.4971f, 13.1193f, 15.4971f, 14.5f)
        curveTo(15.4971f, 15.8807f, 14.3778f, 17f, 12.9971f, 17f)
        horizontalLineTo(11.9971f)
        curveTo(10.6164f, 17f, 9.49707f, 15.8807f, 9.49707f, 14.5f)
        curveTo(9.49707f, 13.1193f, 10.6164f, 12f, 11.9971f, 12f)
        }
        }.build()

        return _eightSquare!!
    }

private var _eightSquare: ImageVector? = null

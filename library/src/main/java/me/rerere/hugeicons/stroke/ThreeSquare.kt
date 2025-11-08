package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThreeSquare: ImageVector
    get() {
        if (_threeSquare != null) {
            return _threeSquare!!
        }
        _threeSquare = ImageVector.Builder(
            name = "ThreeSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 12f)
        horizontalLineTo(11.5f)
        moveTo(12.5f, 12f)
        curveTo(13.8807f, 12f, 15f, 10.8807f, 15f, 9.5f)
        curveTo(15f, 8.11929f, 13.8807f, 7f, 12.5f, 7f)
        horizontalLineTo(11.5f)
        curveTo(10.1193f, 7f, 9f, 8.11929f, 9f, 9.5f)
        moveTo(12.5f, 12f)
        curveTo(13.8807f, 12f, 15f, 13.1193f, 15f, 14.5f)
        curveTo(15f, 15.8807f, 13.8807f, 17f, 12.5f, 17f)
        horizontalLineTo(11.5f)
        curveTo(10.1193f, 17f, 9f, 15.8807f, 9f, 14.5f)
        }
        }.build()

        return _threeSquare!!
    }

private var _threeSquare: ImageVector? = null

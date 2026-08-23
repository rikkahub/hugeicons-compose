package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareAsterisk: ImageVector
    get() {
        if (_squareAsterisk != null) {
            return _squareAsterisk!!
        }
        _squareAsterisk = ImageVector.Builder(
            name = "SquareAsterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 21.5f)
            horizontalLineTo(12f)
            horizontalLineTo(12f)
            curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.1088f)
            curveTo(21.5f, 18.7175f, 21.5f, 16.4783f, 21.5f, 12f)
            verticalLineTo(12f)
            verticalLineTo(12f)
            curveTo(21.5f, 7.52165f, 21.5f, 5.28248f, 20.1088f, 3.89124f)
            curveTo(18.7175f, 2.5f, 16.4783f, 2.5f, 12f, 2.5f)
            curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.89124f)
            curveTo(2.5f, 5.28249f, 2.5f, 7.52166f, 2.5f, 12f)
            curveTo(2.5f, 16.4783f, 2.5f, 18.7175f, 3.89124f, 20.1088f)
            curveTo(5.28248f, 21.5f, 7.52165f, 21.5f, 12f, 21.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9999f, 7.49902f)
            verticalLineTo(16.499f)
            moveTo(15.8995f, 9.74469f)
            lineTo(8.10532f, 14.2447f)
            moveTo(15.9045f, 14.2451f)
            lineTo(8.11031f, 9.74512f)
        }
        }.build()

        return _squareAsterisk!!
    }

private var _squareAsterisk: ImageVector? = null

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

val HugeIcons.AlertSquare: ImageVector
    get() {
        if (_alertSquare != null) {
            return _alertSquare!!
        }
        _alertSquare = ImageVector.Builder(
            name = "AlertSquare",
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
            moveTo(2.5f, 12f)
            curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
            curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
            curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
            curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
            curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
            curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
            curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
            curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
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
            moveTo(12f, 8f)
            verticalLineTo(12f)
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
            moveTo(12.125f, 15.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 15.75f)
            curveTo(12.25f, 15.8881f, 12.1381f, 16f, 12f, 16f)
            curveTo(11.8619f, 16f, 11.75f, 15.8881f, 11.75f, 15.75f)
            curveTo(11.75f, 15.6119f, 11.8619f, 15.5f, 12f, 15.5f)
            curveTo(12.1381f, 15.5f, 12.25f, 15.6119f, 12.25f, 15.75f)
            close()
        }
        }.build()

        return _alertSquare!!
    }

private var _alertSquare: ImageVector? = null

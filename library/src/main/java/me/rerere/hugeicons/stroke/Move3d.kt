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

val HugeIcons.Move3d: ImageVector
    get() {
        if (_move3d != null) {
            return _move3d!!
        }
        _move3d = ImageVector.Builder(
            name = "Move3d",
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
            moveTo(5.9924f, 3f)
            lineTo(5.99201f, 11.9997f)
            curveTo(5.99188f, 14.8283f, 5.99182f, 16.2425f, 6.87051f, 17.1213f)
            curveTo(7.7492f, 18f, 9.16347f, 18f, 11.992f, 18f)
            horizontalLineTo(20.9924f)
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
            moveTo(6.992f, 17f)
            lineTo(13.992f, 10f)
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
            moveTo(8.992f, 5.99998f)
            curveTo(8.992f, 5.99998f, 6.78254f, 3.00001f, 5.99198f, 3f)
            curveTo(5.20142f, 2.99999f, 2.992f, 6f, 2.992f, 6f)
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
            moveTo(17.992f, 21f)
            curveTo(17.992f, 21f, 20.992f, 18.7905f, 20.992f, 18f)
            curveTo(20.992f, 17.2094f, 17.992f, 15f, 17.992f, 15f)
        }
        }.build()

        return _move3d!!
    }

private var _move3d: ImageVector? = null

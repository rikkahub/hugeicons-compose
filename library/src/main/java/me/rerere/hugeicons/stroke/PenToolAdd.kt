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

val HugeIcons.PenToolAdd: ImageVector
    get() {
        if (_penToolAdd != null) {
            return _penToolAdd!!
        }
        _penToolAdd = ImageVector.Builder(
            name = "PenToolAdd",
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
            moveTo(11.5f, 15f)
            lineTo(5f, 21.5f)
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
            moveTo(12.5f, 15f)
            curveTo(12.5f, 15.5523f, 12.0523f, 16f, 11.5f, 16f)
            curveTo(10.9477f, 16f, 10.5f, 15.5523f, 10.5f, 15f)
            curveTo(10.5f, 14.4477f, 10.9477f, 14f, 11.5f, 14f)
            curveTo(12.0523f, 14f, 12.5f, 14.4477f, 12.5f, 15f)
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
            moveTo(18.5f, 13.5152f)
            lineTo(17.0047f, 16.933f)
            curveTo(16.2833f, 18.5819f, 15.9226f, 19.4064f, 15.2437f, 19.9351f)
            curveTo(14.5649f, 20.4639f, 13.6772f, 20.6119f, 11.9019f, 20.9078f)
            lineTo(5.34848f, 22f)
            curveTo(4.87988f, 22f, 4.5f, 21.6201f, 4.5f, 21.1515f)
            lineTo(5.59223f, 14.5981f)
            curveTo(5.88812f, 12.8228f, 6.03607f, 11.9351f, 6.56486f, 11.2563f)
            curveTo(7.09365f, 10.5774f, 7.91811f, 10.2167f, 9.56704f, 9.49529f)
            lineTo(12.9848f, 8f)
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
            moveTo(18.5685f, 12.997f)
            lineTo(13.503f, 7.93155f)
            curveTo(13.1809f, 7.6095f, 13f, 7.1727f, 13f, 6.71726f)
            curveTo(13f, 5.76884f, 13.7688f, 5f, 14.7173f, 5f)
            curveTo(15.1727f, 5f, 15.6095f, 5.18093f, 15.9315f, 5.50297f)
            lineTo(20.997f, 10.5685f)
            curveTo(21.3191f, 10.8905f, 21.5f, 11.3273f, 21.5f, 11.7827f)
            curveTo(21.5f, 12.7312f, 20.7312f, 13.5f, 19.7827f, 13.5f)
            curveTo(19.3273f, 13.5f, 18.8905f, 13.3191f, 18.5685f, 12.997f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 5f)
            horizontalLineTo(8.5f)
            moveTo(5.50033f, 2f)
            lineTo(5.50033f, 8f)
        }
        }.build()

        return _penToolAdd!!
    }

private var _penToolAdd: ImageVector? = null

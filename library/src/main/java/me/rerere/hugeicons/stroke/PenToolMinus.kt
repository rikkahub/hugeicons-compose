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

val HugeIcons.PenToolMinus: ImageVector
    get() {
        if (_penToolMinus != null) {
            return _penToolMinus!!
        }
        _penToolMinus = ImageVector.Builder(
            name = "PenToolMinus",
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
            moveTo(11.5f, 14f)
            lineTo(5f, 20.5f)
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
            moveTo(12.5f, 14f)
            curveTo(12.5f, 14.5523f, 12.0523f, 15f, 11.5f, 15f)
            curveTo(10.9477f, 15f, 10.5f, 14.5523f, 10.5f, 14f)
            curveTo(10.5f, 13.4477f, 10.9477f, 13f, 11.5f, 13f)
            curveTo(12.0523f, 13f, 12.5f, 13.4477f, 12.5f, 14f)
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
            moveTo(18.5f, 12.5152f)
            lineTo(17.0047f, 15.933f)
            curveTo(16.2833f, 17.5819f, 15.9226f, 18.4064f, 15.2437f, 18.9351f)
            curveTo(14.5649f, 19.4639f, 13.6772f, 19.6119f, 11.9019f, 19.9078f)
            lineTo(5.34848f, 21f)
            curveTo(4.87988f, 21f, 4.5f, 20.6201f, 4.5f, 20.1515f)
            lineTo(5.59223f, 13.5981f)
            curveTo(5.88812f, 11.8228f, 6.03607f, 10.9351f, 6.56486f, 10.2563f)
            curveTo(7.09365f, 9.5774f, 7.91811f, 9.2167f, 9.56704f, 8.49529f)
            lineTo(12.9848f, 7f)
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
            moveTo(18.5685f, 11.997f)
            lineTo(13.503f, 6.93155f)
            curveTo(13.1809f, 6.6095f, 13f, 6.1727f, 13f, 5.71726f)
            curveTo(13f, 4.76884f, 13.7688f, 4f, 14.7173f, 4f)
            curveTo(15.1727f, 4f, 15.6095f, 4.18093f, 15.9315f, 4.50297f)
            lineTo(20.997f, 9.56846f)
            curveTo(21.3191f, 9.8905f, 21.5f, 10.3273f, 21.5f, 10.7827f)
            curveTo(21.5f, 11.7312f, 20.7312f, 12.5f, 19.7827f, 12.5f)
            curveTo(19.3273f, 12.5f, 18.8905f, 12.3191f, 18.5685f, 11.997f)
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
            moveTo(2.5f, 3f)
            horizontalLineTo(8.5f)
        }
        }.build()

        return _penToolMinus!!
    }

private var _penToolMinus: ImageVector? = null

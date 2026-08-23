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

val HugeIcons.Megaphone02: ImageVector
    get() {
        if (_megaphone02 != null) {
            return _megaphone02!!
        }
        _megaphone02 = ImageVector.Builder(
            name = "Megaphone02",
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
            moveTo(5.61646f, 7.70197f)
            curveTo(6.99532f, 7.60697f, 8.24589f, 7.57361f, 9.5f, 7.4985f)
            curveTo(13.4538f, 7.26169f, 16.7165f, 4.83668f, 19.5999f, 2.7838f)
            curveTo(19.8594f, 2.59903f, 20.1767f, 2.49991f, 20.5031f, 2.5f)
            curveTo(21.3299f, 2.50023f, 22f, 3.12584f, 22f, 3.8975f)
            verticalLineTo(19.1025f)
            curveTo(22f, 19.8742f, 21.3299f, 20.4998f, 20.5031f, 20.5f)
            curveTo(20.1767f, 20.5001f, 19.8594f, 20.401f, 19.5999f, 20.2162f)
            curveTo(16.7165f, 18.1633f, 13.4538f, 15.7383f, 9.5f, 15.5015f)
            curveTo(8.24589f, 15.4264f, 6.99532f, 15.393f, 5.61646f, 15.298f)
            curveTo(3.52015f, 15.1536f, 2f, 13.4618f, 2f, 11.5f)
            curveTo(2f, 9.53816f, 3.52015f, 7.84641f, 5.61646f, 7.70197f)
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
            moveTo(6f, 15.5f)
            lineTo(6.84493f, 20.5696f)
            curveTo(6.93441f, 21.1065f, 7.39895f, 21.5f, 7.94326f, 21.5f)
            curveTo(8.29374f, 21.5f, 8.62376f, 21.335f, 8.83404f, 21.0546f)
            lineTo(9.35777f, 20.3563f)
            curveTo(9.7731f, 19.8025f, 9.98415f, 19.1222f, 9.95514f, 18.4306f)
            lineTo(9.51757f, 8f)
        }
        }.build()

        return _megaphone02!!
    }

private var _megaphone02: ImageVector? = null

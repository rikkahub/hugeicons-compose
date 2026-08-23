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

val HugeIcons.TrainFrontTunnel: ImageVector
    get() {
        if (_trainFrontTunnel != null) {
            return _trainFrontTunnel!!
        }
        _trainFrontTunnel = ImageVector.Builder(
            name = "TrainFrontTunnel",
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
            moveTo(7f, 20f)
            lineTo(6f, 22f)
            moveTo(17f, 20f)
            lineTo(18f, 22f)
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
            moveTo(9.375f, 17.25f)
            horizontalLineTo(9.25f)
            moveTo(9.5f, 17.25f)
            curveTo(9.5f, 17.3881f, 9.38807f, 17.5f, 9.25f, 17.5f)
            curveTo(9.11193f, 17.5f, 9f, 17.3881f, 9f, 17.25f)
            curveTo(9f, 17.1119f, 9.11193f, 17f, 9.25f, 17f)
            curveTo(9.38807f, 17f, 9.5f, 17.1119f, 9.5f, 17.25f)
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
            moveTo(14.875f, 17.25f)
            horizontalLineTo(14.75f)
            moveTo(15f, 17.25f)
            curveTo(15f, 17.3881f, 14.8881f, 17.5f, 14.75f, 17.5f)
            curveTo(14.6119f, 17.5f, 14.5f, 17.3881f, 14.5f, 17.25f)
            curveTo(14.5f, 17.1119f, 14.6119f, 17f, 14.75f, 17f)
            curveTo(14.8881f, 17f, 15f, 17.1119f, 15f, 17.25f)
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
            moveTo(6f, 14f)
            horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 13f)
            curveTo(6f, 10.1716f, 6f, 8.75736f, 6.87868f, 7.87868f)
            curveTo(7.75736f, 7f, 9.17157f, 7f, 12f, 7f)
            curveTo(14.8284f, 7f, 16.2426f, 7f, 17.1213f, 7.87868f)
            curveTo(18f, 8.75736f, 18f, 10.1716f, 18f, 13f)
            verticalLineTo(14f)
            curveTo(18f, 16.8284f, 18f, 18.2426f, 17.1213f, 19.1213f)
            curveTo(16.2426f, 20f, 14.8284f, 20f, 12f, 20f)
            curveTo(9.17157f, 20f, 7.75736f, 20f, 6.87868f, 19.1213f)
            curveTo(6f, 18.2426f, 6f, 16.8284f, 6f, 14f)
            verticalLineTo(13f)
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
            moveTo(2f, 20f)
            verticalLineTo(12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
            verticalLineTo(20f)
        }
        }.build()

        return _trainFrontTunnel!!
    }

private var _trainFrontTunnel: ImageVector? = null

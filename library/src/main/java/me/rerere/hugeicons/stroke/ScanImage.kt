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

val HugeIcons.ScanImage: ImageVector
    get() {
        if (_scanImage != null) {
            return _scanImage!!
        }
        _scanImage = ImageVector.Builder(
            name = "ScanImage",
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
            moveTo(6.5f, 21.5f)
            curveTo(6.03563f, 21.5f, 5.80344f, 21.5f, 5.60812f, 21.478f)
            curveTo(3.98545f, 21.2952f, 2.70484f, 20.0145f, 2.52201f, 18.3919f)
            curveTo(2.5f, 18.1966f, 2.5f, 17.9644f, 2.5f, 17.5f)
            moveTo(17.5f, 21.5f)
            curveTo(17.9644f, 21.5f, 18.1966f, 21.5f, 18.3919f, 21.478f)
            curveTo(20.0145f, 21.2952f, 21.2952f, 20.0145f, 21.478f, 18.3919f)
            curveTo(21.5f, 18.1966f, 21.5f, 17.9644f, 21.5f, 17.5f)
            moveTo(6.5f, 2.5f)
            curveTo(6.03563f, 2.5f, 5.80344f, 2.5f, 5.60812f, 2.52201f)
            curveTo(3.98545f, 2.70484f, 2.70484f, 3.98545f, 2.52201f, 5.60812f)
            curveTo(2.5f, 5.80344f, 2.5f, 6.03563f, 2.5f, 6.5f)
            moveTo(17.5f, 2.5f)
            curveTo(17.9644f, 2.5f, 18.1966f, 2.5f, 18.3919f, 2.52201f)
            curveTo(20.0145f, 2.70484f, 21.2952f, 3.98545f, 21.478f, 5.60812f)
            curveTo(21.5f, 5.80344f, 21.5f, 6.03563f, 21.5f, 6.5f)
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
            moveTo(6.87868f, 6.87868f)
            curveTo(7.75736f, 6f, 9.17157f, 6f, 12f, 6f)
            curveTo(14.8284f, 6f, 16.2426f, 6f, 17.1213f, 6.87868f)
            curveTo(18f, 7.75736f, 18f, 9.17157f, 18f, 12f)
            curveTo(18f, 14.8284f, 18f, 16.2426f, 17.1213f, 17.1213f)
            curveTo(16.2426f, 18f, 14.8284f, 18f, 12f, 18f)
            curveTo(9.17157f, 18f, 7.75736f, 18f, 6.87868f, 17.1213f)
            curveTo(6f, 16.2426f, 6f, 14.8284f, 6f, 12f)
            curveTo(6f, 9.17157f, 6f, 7.75736f, 6.87868f, 6.87868f)
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
            moveTo(6.5f, 15.5f)
            lineTo(8.0333f, 13.8522f)
            curveTo(8.56719f, 13.2785f, 9.43281f, 13.2785f, 9.9667f, 13.8522f)
            curveTo(10.5259f, 14.4532f, 11.4415f, 14.4204f, 11.9623f, 13.7808f)
            lineTo(13.3711f, 12.0505f)
            curveTo(13.9688f, 11.3165f, 15.0312f, 11.3165f, 15.6289f, 12.0505f)
            lineTo(17.7603f, 14.6678f)
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
            moveTo(10.375f, 9.75f)
            horizontalLineTo(10.25f)
            moveTo(10.5f, 9.75f)
            curveTo(10.5f, 9.88807f, 10.3881f, 10f, 10.25f, 10f)
            curveTo(10.1119f, 10f, 10f, 9.88807f, 10f, 9.75f)
            curveTo(10f, 9.61193f, 10.1119f, 9.5f, 10.25f, 9.5f)
            curveTo(10.3881f, 9.5f, 10.5f, 9.61193f, 10.5f, 9.75f)
            close()
        }
        }.build()

        return _scanImage!!
    }

private var _scanImage: ImageVector? = null

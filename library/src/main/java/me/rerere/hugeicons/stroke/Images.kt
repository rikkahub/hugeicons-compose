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

val HugeIcons.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = ImageVector.Builder(
            name = "Images",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4f, 17.0429f)
            lineTo(8.75635f, 12.6942f)
            curveTo(10.4331f, 11.1612f, 11.2714f, 10.3947f, 12.3096f, 10.3191f)
            curveTo(13.3478f, 10.2435f, 14.2884f, 10.8805f, 16.1695f, 12.1545f)
            lineTo(17.5f, 13.0556f)
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
            moveTo(7.375f, 7.25f)
            horizontalLineTo(7.25f)
            moveTo(7.5f, 7.25f)
            curveTo(7.5f, 7.38807f, 7.38807f, 7.5f, 7.25f, 7.5f)
            curveTo(7.11193f, 7.5f, 7f, 7.38807f, 7f, 7.25f)
            curveTo(7f, 7.11193f, 7.11193f, 7f, 7.25f, 7f)
            curveTo(7.38807f, 7f, 7.5f, 7.11193f, 7.5f, 7.25f)
            close()
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
            moveTo(6f, 17.9745f)
            curveTo(6.1287f, 19.2829f, 6.41956f, 20.1636f, 7.07691f, 20.8209f)
            curveTo(8.25596f, 22f, 10.1536f, 22f, 13.9489f, 22f)
            curveTo(17.7442f, 22f, 19.6419f, 22f, 20.8209f, 20.8209f)
            curveTo(22f, 19.6419f, 22f, 17.7442f, 22f, 13.9489f)
            curveTo(22f, 10.1536f, 22f, 8.25596f, 20.8209f, 7.07691f)
            curveTo(20.1636f, 6.41956f, 19.2829f, 6.1287f, 17.9745f, 6f)
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
            moveTo(2f, 10f)
            curveTo(2f, 6.22876f, 2f, 4.34315f, 3.17157f, 3.17157f)
            curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
            curveTo(13.7712f, 2f, 15.6569f, 2f, 16.8284f, 3.17157f)
            curveTo(18f, 4.34315f, 18f, 6.22876f, 18f, 10f)
            curveTo(18f, 13.7712f, 18f, 15.6569f, 16.8284f, 16.8284f)
            curveTo(15.6569f, 18f, 13.7712f, 18f, 10f, 18f)
            curveTo(6.22876f, 18f, 4.34315f, 18f, 3.17157f, 16.8284f)
            curveTo(2f, 15.6569f, 2f, 13.7712f, 2f, 10f)
            close()
        }
        }.build()

        return _images!!
    }

private var _images: ImageVector? = null

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

val HugeIcons.Complaint: ImageVector
    get() {
        if (_complaint != null) {
            return _complaint!!
        }
        _complaint = ImageVector.Builder(
            name = "Complaint",
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
            moveTo(17.0004f, 7f)
            lineTo(17.0049f, 5.50488f)
            moveTo(17.0504f, 9.90037f)
            horizontalLineTo(17.0004f)
            moveTo(17.1004f, 9.90037f)
            curveTo(17.1004f, 9.9556f, 17.0556f, 10.0004f, 17.0004f, 10.0004f)
            curveTo(16.9452f, 10.0004f, 16.9004f, 9.9556f, 16.9004f, 9.90037f)
            curveTo(16.9004f, 9.84514f, 16.9452f, 9.80037f, 17.0004f, 9.80037f)
            curveTo(17.0556f, 9.80037f, 17.1004f, 9.84514f, 17.1004f, 9.90037f)
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
            moveTo(17f, 12.5667f)
            curveTo(19.7611f, 12.5667f, 22f, 10.4249f, 22f, 7.78336f)
            curveTo(22f, 5.14178f, 19.7611f, 3f, 17f, 3f)
            curveTo(14.2389f, 3f, 12f, 5.14178f, 12f, 7.78336f)
            curveTo(12f, 9.05254f, 12.5167f, 10.2058f, 13.3594f, 11.0616f)
            curveTo(13.545f, 11.25f, 13.6689f, 11.5074f, 13.6189f, 11.7724f)
            curveTo(13.5364f, 12.2056f, 13.3494f, 12.6097f, 13.0756f, 12.9465f)
            curveTo(13.796f, 13.0805f, 14.5451f, 12.9598f, 15.1875f, 12.6182f)
            lineTo(15.1881f, 12.6179f)
            curveTo(15.4148f, 12.4973f, 15.5282f, 12.437f, 15.6083f, 12.4248f)
            curveTo(15.6884f, 12.4126f, 15.8032f, 12.4341f, 16.0327f, 12.4772f)
            curveTo(16.3516f, 12.5371f, 16.6753f, 12.5671f, 17f, 12.5667f)
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
            moveTo(10f, 13f)
            curveTo(10f, 14.6569f, 8.65685f, 16f, 7f, 16f)
            curveTo(5.34315f, 16f, 4f, 14.6569f, 4f, 13f)
            curveTo(4f, 11.3431f, 5.34315f, 10f, 7f, 10f)
            curveTo(8.65685f, 10f, 10f, 11.3431f, 10f, 13f)
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
            moveTo(12f, 21f)
            curveTo(12f, 18.2386f, 9.76142f, 16f, 7f, 16f)
            curveTo(4.23858f, 16f, 2f, 18.2386f, 2f, 21f)
        }
        }.build()

        return _complaint!!
    }

private var _complaint: ImageVector? = null

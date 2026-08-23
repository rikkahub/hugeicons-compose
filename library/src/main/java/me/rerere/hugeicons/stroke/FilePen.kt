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

val HugeIcons.FilePen: ImageVector
    get() {
        if (_filePen != null) {
            return _filePen!!
        }
        _filePen = ImageVector.Builder(
            name = "FilePen",
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
            moveTo(4.5f, 13f)
            verticalLineTo(9.45584f)
            curveTo(4.5f, 6.21082f, 4.5f, 4.58831f, 5.38607f, 3.48933f)
            curveTo(5.56508f, 3.26731f, 5.76731f, 3.06508f, 5.98933f, 2.88607f)
            curveTo(7.08831f, 2f, 8.71082f, 2f, 11.9558f, 2f)
            curveTo(12.6614f, 2f, 13.0141f, 2f, 13.3372f, 2.11401f)
            curveTo(13.4044f, 2.13772f, 13.4702f, 2.165f, 13.5345f, 2.19575f)
            curveTo(13.8436f, 2.34355f, 14.093f, 2.593f, 14.5919f, 3.09188f)
            lineTo(19.3284f, 7.82843f)
            curveTo(19.9065f, 8.40649f, 20.1955f, 8.69552f, 20.3478f, 9.06306f)
            curveTo(20.5f, 9.4306f, 20.5f, 9.83935f, 20.5f, 10.6569f)
            verticalLineTo(14f)
            curveTo(20.5f, 17.7712f, 20.5f, 19.6569f, 19.3284f, 20.8284f)
            curveTo(18.1569f, 22f, 16.2712f, 22f, 12.5f, 22f)
            curveTo(12.1508f, 22f, 11.8178f, 22f, 11.5f, 21.9991f)
            moveTo(13.5f, 2.5f)
            verticalLineTo(3f)
            curveTo(13.5f, 5.82843f, 13.5f, 7.24264f, 14.3787f, 8.12132f)
            curveTo(15.2574f, 9f, 16.6716f, 9f, 19.5f, 9f)
            horizontalLineTo(20f)
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
            moveTo(3.5f, 22f)
            verticalLineTo(20.6611f)
            curveTo(3.5f, 20.0548f, 3.74082f, 19.4735f, 4.16947f, 19.0448f)
            lineTo(8.81022f, 14.4041f)
            curveTo(9.06894f, 14.1453f, 9.41983f, 14f, 9.78571f, 14f)
            curveTo(10.1516f, 14f, 10.5025f, 14.1453f, 10.7612f, 14.4041f)
            lineTo(11.0959f, 14.7388f)
            curveTo(11.3547f, 14.9975f, 11.5f, 15.3484f, 11.5f, 15.7143f)
            curveTo(11.5f, 16.0802f, 11.3547f, 16.4311f, 11.0959f, 16.6898f)
            lineTo(6.45518f, 21.3305f)
            curveTo(6.02653f, 21.7592f, 5.44515f, 22f, 4.83894f, 22f)
            horizontalLineTo(3.5f)
            close()
        }
        }.build()

        return _filePen!!
    }

private var _filePen: ImageVector? = null

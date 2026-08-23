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

val HugeIcons.FilePenLine: ImageVector
    get() {
        if (_filePenLine != null) {
            return _filePenLine!!
        }
        _filePenLine = ImageVector.Builder(
            name = "FilePenLine",
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
            moveTo(9f, 22f)
            horizontalLineTo(10f)
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
            moveTo(14f, 22f)
            verticalLineTo(20.6611f)
            curveTo(14f, 20.0548f, 14.2408f, 19.4735f, 14.6695f, 19.0448f)
            lineTo(19.3102f, 14.4041f)
            curveTo(19.5689f, 14.1453f, 19.9198f, 14f, 20.2857f, 14f)
            curveTo(20.6516f, 14f, 21.0025f, 14.1453f, 21.2612f, 14.4041f)
            lineTo(21.5959f, 14.7388f)
            curveTo(21.8547f, 14.9975f, 22f, 15.3484f, 22f, 15.7143f)
            curveTo(22f, 16.0802f, 21.8547f, 16.4311f, 21.5959f, 16.6898f)
            lineTo(16.9552f, 21.3305f)
            curveTo(16.5265f, 21.7592f, 15.9452f, 22f, 15.3389f, 22f)
            horizontalLineTo(14f)
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
            moveTo(12f, 2.5f)
            verticalLineTo(3f)
            curveTo(12f, 5.82843f, 12f, 7.24264f, 12.8787f, 8.12132f)
            curveTo(13.7574f, 9f, 15.1716f, 9f, 18f, 9f)
            horizontalLineTo(18.5f)
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
            moveTo(5f, 21.4151f)
            curveTo(4.68645f, 21.2627f, 4.41375f, 21.0706f, 4.17157f, 20.8284f)
            curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
            verticalLineTo(9.45584f)
            curveTo(3f, 6.21082f, 3f, 4.58831f, 3.88607f, 3.48933f)
            curveTo(4.06508f, 3.26731f, 4.26731f, 3.06508f, 4.48933f, 2.88607f)
            curveTo(5.58831f, 2f, 7.21082f, 2f, 10.4558f, 2f)
            curveTo(11.1614f, 2f, 11.5141f, 2f, 11.8372f, 2.11401f)
            curveTo(11.9044f, 2.13772f, 11.9702f, 2.165f, 12.0345f, 2.19575f)
            curveTo(12.3436f, 2.34355f, 12.593f, 2.593f, 13.0919f, 3.09188f)
            lineTo(17.8284f, 7.82843f)
            curveTo(18.4065f, 8.40649f, 18.6955f, 8.69552f, 18.8478f, 9.06306f)
            curveTo(18.9525f, 9.31595f, 18.9852f, 9.58836f, 18.9954f, 10f)
        }
        }.build()

        return _filePenLine!!
    }

private var _filePenLine: ImageVector? = null

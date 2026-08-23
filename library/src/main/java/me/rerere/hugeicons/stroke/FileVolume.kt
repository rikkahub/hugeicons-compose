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

val HugeIcons.FileVolume: ImageVector
    get() {
        if (_fileVolume != null) {
            return _fileVolume!!
        }
        _fileVolume = ImageVector.Builder(
            name = "FileVolume",
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
            moveTo(12.5f, 15.5f)
            curveTo(13.1491f, 16.2212f, 13.5f, 17.0985f, 13.5f, 18f)
            curveTo(13.5f, 18.9015f, 13.1491f, 19.7788f, 12.5f, 20.5f)
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
            moveTo(6.85982f, 14.8008f)
            lineTo(5.90841f, 15.6104f)
            curveTo(5.64452f, 15.8349f, 5.31188f, 15.9579f, 4.96837f, 15.9579f)
            curveTo(4.15741f, 15.9579f, 3.5f, 16.6291f, 3.5f, 17.4572f)
            verticalLineTo(18.5428f)
            curveTo(3.5f, 19.3709f, 4.15741f, 20.0421f, 4.96837f, 20.0421f)
            curveTo(5.31188f, 20.0421f, 5.64452f, 20.1651f, 5.90841f, 20.3896f)
            lineTo(6.85982f, 21.1992f)
            curveTo(7.56938f, 21.8029f, 7.92416f, 22.1048f, 8.21208f, 21.9671f)
            curveTo(8.5f, 21.8294f, 8.5f, 21.3579f, 8.5f, 20.4148f)
            verticalLineTo(15.5852f)
            curveTo(8.5f, 14.6421f, 8.5f, 14.1706f, 8.21208f, 14.0329f)
            curveTo(7.92416f, 13.8952f, 7.56938f, 14.1971f, 6.85982f, 14.8008f)
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
            moveTo(4.5f, 11f)
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
            verticalLineTo(14.1015f)
            curveTo(20.5f, 17.8727f, 20.5f, 19.7583f, 19.3284f, 20.9299f)
            curveTo(18.6752f, 21.5831f, 17.8001f, 21.8721f, 16.5f, 22f)
            moveTo(13.5f, 2.5f)
            verticalLineTo(3f)
            curveTo(13.5f, 5.82843f, 13.5f, 7.24264f, 14.3787f, 8.12132f)
            curveTo(15.2574f, 9f, 16.6716f, 9f, 19.5f, 9f)
            horizontalLineTo(20f)
        }
        }.build()

        return _fileVolume!!
    }

private var _fileVolume: ImageVector? = null

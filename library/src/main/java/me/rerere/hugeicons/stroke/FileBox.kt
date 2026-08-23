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

val HugeIcons.FileBox: ImageVector
    get() {
        if (_fileBox != null) {
            return _fileBox!!
        }
        _fileBox = ImageVector.Builder(
            name = "FileBox",
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
            moveTo(13.5f, 2.50088f)
            verticalLineTo(3.00175f)
            curveTo(13.5f, 5.83513f, 13.5f, 7.25182f, 14.3787f, 8.13204f)
            curveTo(15.2574f, 9.01226f, 16.6716f, 9.01226f, 19.5f, 9.01226f)
            horizontalLineTo(20f)
            moveTo(15.5f, 22f)
            curveTo(17.3723f, 21.9221f, 18.5203f, 21.671f, 19.3284f, 20.8614f)
            curveTo(20.5f, 19.6878f, 20.5f, 17.7989f, 20.5f, 14.021f)
            verticalLineTo(10.672f)
            curveTo(20.5f, 9.85308f, 20.5f, 9.44362f, 20.3478f, 9.07543f)
            curveTo(20.1955f, 8.70724f, 19.9065f, 8.41771f, 19.3284f, 7.83864f)
            lineTo(14.5919f, 3.0938f)
            curveTo(14.093f, 2.59404f, 13.8436f, 2.34416f, 13.5345f, 2.19609f)
            curveTo(13.4702f, 2.16529f, 13.4044f, 2.13796f, 13.3372f, 2.11421f)
            curveTo(13.0141f, 2f, 12.6614f, 2f, 11.9558f, 2f)
            curveTo(8.71082f, 2f, 7.08831f, 2f, 5.98933f, 2.88763f)
            curveTo(5.76731f, 3.06694f, 5.56508f, 3.26953f, 5.38607f, 3.49194f)
            curveTo(4.54367f, 4.53858f, 4.50205f, 6.05926f, 4.5f, 9f)
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
            moveTo(12f, 15f)
            lineTo(8f, 17f)
            moveTo(8f, 17f)
            lineTo(4f, 15f)
            moveTo(8f, 17f)
            verticalLineTo(22f)
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
            moveTo(10.7188f, 13.3822f)
            lineTo(10.2188f, 13.0552f)
            curveTo(9.1433f, 12.3517f, 8.60555f, 12f, 8f, 12f)
            curveTo(7.39445f, 12f, 6.8567f, 12.3517f, 5.7812f, 13.0552f)
            lineTo(5.2812f, 13.3822f)
            curveTo(4.40927f, 13.9525f, 3.9733f, 14.2377f, 3.73665f, 14.6715f)
            curveTo(3.5f, 15.1053f, 3.5f, 15.6194f, 3.5f, 16.6475f)
            verticalLineTo(17.3525f)
            curveTo(3.5f, 18.3806f, 3.5f, 18.8947f, 3.73665f, 19.3285f)
            curveTo(3.9733f, 19.7623f, 4.40927f, 20.0475f, 5.2812f, 20.6178f)
            lineTo(5.7812f, 20.9448f)
            curveTo(6.85669f, 21.6483f, 7.39445f, 22f, 8f, 22f)
            curveTo(8.60555f, 22f, 9.1433f, 21.6483f, 10.2188f, 20.9448f)
            lineTo(10.7188f, 20.6178f)
            curveTo(11.5907f, 20.0475f, 12.0267f, 19.7623f, 12.2633f, 19.3285f)
            curveTo(12.5f, 18.8947f, 12.5f, 18.3806f, 12.5f, 17.3525f)
            verticalLineTo(16.6475f)
            curveTo(12.5f, 15.6194f, 12.5f, 15.1053f, 12.2633f, 14.6715f)
            curveTo(12.0267f, 14.2377f, 11.5907f, 13.9525f, 10.7188f, 13.3822f)
            close()
        }
        }.build()

        return _fileBox!!
    }

private var _fileBox: ImageVector? = null

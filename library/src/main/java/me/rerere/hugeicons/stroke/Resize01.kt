package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Resize01: ImageVector
    get() {
        if (_resize01 != null) {
            return _resize01!!
        }
        _resize01 = ImageVector.Builder(
            name = "Resize01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 4f)
        horizontalLineTo(21f)
        moveTo(17f, 4f)
        curveTo(17f, 4.56018f, 18.4943f, 5.60678f, 19f, 6f)
        moveTo(17f, 4f)
        curveTo(17f, 3.43982f, 18.4943f, 2.39322f, 19f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 4f)
        horizontalLineTo(3f)
        moveTo(7f, 4f)
        curveTo(7f, 3.43982f, 5.5057f, 2.39322f, 5f, 2f)
        moveTo(7f, 4f)
        curveTo(7f, 4.56018f, 5.5057f, 5.60678f, 5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.8348f, 22f)
        lineTo(9.8348f, 21.0513f)
        curveTo(9.8348f, 20.4058f, 9.6261f, 19.7775f, 9.23964f, 19.2595f)
        lineTo(5.58206f, 14.3566f)
        curveTo(5.16022f, 13.7911f, 4.8233f, 13.0896f, 5.1018f, 12.4419f)
        curveTo(5.55264f, 11.3935f, 6.82458f, 10.7124f, 8.38144f, 12.2843f)
        lineTo(9.97865f, 13.9937f)
        lineTo(9.97865f, 3.57057f)
        curveTo(10.0349f, 1.52742f, 13.3229f, 1.42614f, 13.4635f, 3.57057f)
        lineTo(13.4635f, 9.5106f)
        curveTo(14.9435f, 9.31946f, 21.9155f, 10.3629f, 20.8993f, 14.7831f)
        curveTo(20.851f, 14.9931f, 20.8028f, 15.2063f, 20.7557f, 15.4165f)
        curveTo(20.5501f, 16.3353f, 19.9422f, 17.9727f, 19.2719f, 18.93f)
        curveTo(18.5741f, 19.9266f, 18.8203f, 20.9192f, 18.8203f, 22f)
        }
        }.build()

        return _resize01!!
    }

private var _resize01: ImageVector? = null

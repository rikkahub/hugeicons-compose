package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeDown01: ImageVector
    get() {
        if (_swipeDown01 != null) {
            return _swipeDown01!!
        }
        _swipeDown01 = ImageVector.Builder(
            name = "SwipeDown01",
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
        moveTo(18.5f, 8f)
        verticalLineTo(2f)
        moveTo(18.5f, 8f)
        curveTo(17.7998f, 8f, 16.4915f, 6.0057f, 16f, 5.5f)
        moveTo(18.5f, 8f)
        curveTo(19.2002f, 8f, 20.5085f, 6.0057f, 21f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.8348f, 22f)
        lineTo(7.8348f, 21.0513f)
        curveTo(7.8348f, 20.4058f, 7.6261f, 19.7775f, 7.23964f, 19.2595f)
        lineTo(3.58206f, 14.3566f)
        curveTo(3.16022f, 13.7911f, 2.8233f, 13.0896f, 3.1018f, 12.4419f)
        curveTo(3.55264f, 11.3935f, 4.82458f, 10.7124f, 6.38144f, 12.2843f)
        lineTo(7.97865f, 13.9937f)
        lineTo(7.97865f, 3.57057f)
        curveTo(8.03487f, 1.52742f, 11.3229f, 1.42614f, 11.4635f, 3.57057f)
        lineTo(11.4635f, 9.5106f)
        curveTo(12.9435f, 9.31946f, 19.9155f, 10.3629f, 18.8993f, 14.7831f)
        curveTo(18.851f, 14.9931f, 18.8028f, 15.2063f, 18.7557f, 15.4165f)
        curveTo(18.5501f, 16.3353f, 17.9422f, 17.9727f, 17.2719f, 18.93f)
        curveTo(16.5741f, 19.9266f, 16.8203f, 20.9192f, 16.8203f, 22f)
        }
        }.build()

        return _swipeDown01!!
    }

private var _swipeDown01: ImageVector? = null

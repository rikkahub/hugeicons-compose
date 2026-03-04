package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CallSpark01: ImageVector
    get() {
        if (_callSpark01 != null) {
            return _callSpark01!!
        }
        _callSpark01 = ImageVector.Builder(
            name = "CallSpark01",
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
        moveTo(4.91186f, 10.5413f)
        lineTo(7.55229f, 7.90088f)
        curveTo(8.09091f, 7.36227f, 8.27728f, 6.56642f, 8.05944f, 5.83652f)
        curveTo(7.8891f, 5.26577f, 7.69718f, 4.57964f, 7.56961f, 3.99292f)
        curveTo(7.45162f, 3.45027f, 6.97545f, 3f, 6.42012f, 3f)
        horizontalLineTo(4.91186f)
        curveTo(3.8012f, 3f, 2.88911f, 3.90384f, 3.01094f, 5.0078f)
        curveTo(3.93709f, 13.3996f, 10.6004f, 20.0629f, 18.9922f, 20.9891f)
        curveTo(20.0962f, 21.1109f, 21f, 20.1988f, 21f, 19.0881f)
        verticalLineTo(17.5799f)
        curveTo(21f, 17.0246f, 20.5479f, 16.569f, 20.0015f, 16.4696f)
        curveTo(19.3988f, 16.36f, 18.7611f, 16.1804f, 18.2276f, 16.0103f)
        curveTo(17.4611f, 15.7659f, 16.6091f, 15.9377f, 16.0403f, 16.5065f)
        lineTo(13.4587f, 19.0881f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4693f, 3.02506f)
        curveTo(17.4761f, 2.99165f, 17.5239f, 2.99165f, 17.5307f, 3.02506f)
        curveTo(17.8852f, 4.75942f, 19.2406f, 6.11481f, 20.9749f, 6.4693f)
        curveTo(21.0084f, 6.47613f, 21.0084f, 6.52387f, 20.9749f, 6.5307f)
        curveTo(19.2406f, 6.88519f, 17.8852f, 8.24058f, 17.5307f, 9.97494f)
        curveTo(17.5239f, 10.0084f, 17.4761f, 10.0084f, 17.4693f, 9.97494f)
        curveTo(17.1148f, 8.24058f, 15.7594f, 6.88519f, 14.0251f, 6.5307f)
        curveTo(13.9916f, 6.52387f, 13.9916f, 6.47613f, 14.0251f, 6.4693f)
        curveTo(15.7594f, 6.11481f, 17.1148f, 4.75942f, 17.4693f, 3.02506f)
        }
        }.build()

        return _callSpark01!!
    }

private var _callSpark01: ImageVector? = null

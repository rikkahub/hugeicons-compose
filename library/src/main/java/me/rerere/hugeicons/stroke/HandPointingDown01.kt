package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingDown01: ImageVector
    get() {
        if (_handPointingDown01 != null) {
            return _handPointingDown01!!
        }
        _handPointingDown01 = ImageVector.Builder(
            name = "HandPointingDown01",
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
        moveTo(8.83403f, 2.00138f)
        verticalLineTo(2.94868f)
        curveTo(8.83403f, 3.59418f, 8.62529f, 4.22251f, 8.23873f, 4.74055f)
        lineTo(4.5803f, 9.64341f)
        curveTo(4.15836f, 10.2089f, 3.82136f, 10.9104f, 4.09993f, 11.5581f)
        curveTo(4.55088f, 12.6065f, 5.82312f, 13.2876f, 7.38033f, 11.7157f)
        lineTo(8.97792f, 10.0063f)
        verticalLineTo(20.4294f)
        curveTo(9.03415f, 22.4726f, 12.3229f, 22.5739f, 12.4636f, 20.4294f)
        verticalLineTo(14.4894f)
        curveTo(13.9439f, 14.6805f, 20.9175f, 13.6371f, 19.9011f, 9.21686f)
        curveTo(19.8528f, 9.00686f, 19.8046f, 8.79374f, 19.7575f, 8.58346f)
        curveTo(19.5518f, 7.66469f, 18.9438f, 6.02726f, 18.2734f, 5.06998f)
        curveTo(17.5754f, 4.07344f, 17.8217f, 2.44361f, 17.8217f, 2f)
        }
        }.build()

        return _handPointingDown01!!
    }

private var _handPointingDown01: ImageVector? = null

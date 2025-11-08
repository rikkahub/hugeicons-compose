package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetBangla: ImageVector
    get() {
        if (_alphabetBangla != null) {
            return _alphabetBangla!!
        }
        _alphabetBangla = ImageVector.Builder(
            name = "AlphabetBangla",
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
        moveTo(14.7394f, 12.7799f)
        curveTo(15.773f, 12.7495f, 17.8505f, 14.1181f, 17.9964f, 19.8328f)
        moveTo(9.93274f, 10.7651f)
        curveTo(9.85184f, 10.0639f, 9.87585f, 8.55093f, 11.2281f, 7.80584f)
        curveTo(12.9955f, 6.83202f, 14.8132f, 8.46474f, 15.0206f, 10.2727f)
        curveTo(15.1223f, 11.1585f, 14.7652f, 13.992f, 13.2559f, 15.6892f)
        curveTo(12.6926f, 16.3227f, 12.1849f, 16.8767f, 11.2281f, 16.9748f)
        curveTo(10.3404f, 17.0659f, 9.61226f, 16.8283f, 8.76843f, 16.2714f)
        curveTo(7.41998f, 15.3814f, 6.01024f, 13.881f, 4.8146f, 11.8082f)
        curveTo(3.53743f, 9.59404f, 2.84713f, 8.08034f, 2.00195f, 5.02637f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99609f, 6.36752f)
        curveTo(7.87394f, 5.41201f, 12.9902f, 1.68945f, 16.5947f, 6.13758f)
        curveTo(17.0314f, 6.67646f, 17.2497f, 6.9459f, 17.6229f, 7.99921f)
        curveTo(17.9961f, 9.05252f, 17.9961f, 9.78494f, 17.9961f, 11.2498f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9961f, 10f)
        curveTo(17.9961f, 7.72717f, 19.1961f, 4.62581f, 21.9961f, 5.03703f)
        }
        }.build()

        return _alphabetBangla!!
    }

private var _alphabetBangla: ImageVector? = null

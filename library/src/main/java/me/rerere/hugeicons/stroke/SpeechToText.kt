package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SpeechToText: ImageVector
    get() {
        if (_speechToText != null) {
            return _speechToText!!
        }
        _speechToText = ImageVector.Builder(
            name = "SpeechToText",
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
        moveTo(16f, 17f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4f)
        verticalLineTo(8f)
        moveTo(5f, 2f)
        verticalLineTo(10f)
        moveTo(2f, 5f)
        lineTo(2f, 7f)
        moveTo(11f, 5f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.00006f, 13f)
        curveTo(4.00172f, 17.1517f, 4.04756f, 19.2749f, 5.31802f, 20.6124f)
        curveTo(6.63604f, 22f, 8.75736f, 22f, 13f, 22f)
        horizontalLineTo(13.45f)
        curveTo(17.2568f, 22f, 19.1601f, 22f, 20.4225f, 20.8649f)
        curveTo(20.6018f, 20.7038f, 20.7687f, 20.528f, 20.9218f, 20.3393f)
        curveTo(22f, 19.0103f, 22f, 17.0065f, 22f, 12.9989f)
        curveTo(22f, 8.99125f, 22f, 6.98744f, 20.9218f, 5.65845f)
        curveTo(20.7687f, 5.46974f, 20.6018f, 5.29398f, 20.4225f, 5.1328f)
        curveTo(19.3191f, 4.14066f, 17.7259f, 4.01573f, 14.8f, 4f)
        horizontalLineTo(14f)
        }
        }.build()

        return _speechToText!!
    }

private var _speechToText: ImageVector? = null

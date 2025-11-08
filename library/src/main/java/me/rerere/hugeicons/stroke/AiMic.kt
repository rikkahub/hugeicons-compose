package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiMic: ImageVector
    get() {
        if (_aiMic != null) {
            return _aiMic!!
        }
        _aiMic = ImageVector.Builder(
            name = "AiMic",
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
        moveTo(17f, 11f)
        curveTo(17f, 13.7614f, 14.7614f, 16f, 12f, 16f)
        curveTo(9.23858f, 16f, 7f, 13.7614f, 7f, 11f)
        verticalLineTo(7f)
        curveTo(7f, 4.23858f, 9.23858f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        curveTo(20f, 15.4183f, 16.4183f, 19f, 12f, 19f)
        moveTo(12f, 19f)
        curveTo(7.58172f, 19f, 4f, 15.4183f, 4f, 11f)
        moveTo(12f, 19f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3327f, 4.64612f)
        curveTo(15.5394f, 4.49594f, 16.4959f, 3.53944f, 16.6461f, 2.33267f)
        curveTo(16.6689f, 2.14999f, 16.8159f, 2f, 17f, 2f)
        curveTo(17.1841f, 2f, 17.3311f, 2.14999f, 17.3539f, 2.33267f)
        curveTo(17.5041f, 3.53944f, 18.4606f, 4.49594f, 19.6673f, 4.64612f)
        curveTo(19.85f, 4.66885f, 20f, 4.81591f, 20f, 5f)
        curveTo(20f, 5.1841f, 19.85f, 5.33115f, 19.6673f, 5.35388f)
        curveTo(18.4606f, 5.50406f, 17.5041f, 6.46056f, 17.3539f, 7.66733f)
        curveTo(17.3311f, 7.85001f, 17.1841f, 8f, 17f, 8f)
        curveTo(16.8159f, 8f, 16.6689f, 7.85001f, 16.6461f, 7.66733f)
        curveTo(16.4959f, 6.46056f, 15.5394f, 5.50406f, 14.3327f, 5.35388f)
        curveTo(14.15f, 5.33115f, 14f, 5.1841f, 14f, 5f)
        curveTo(14f, 4.81591f, 14.15f, 4.66885f, 14.3327f, 4.64612f)
        }
        }.build()

        return _aiMic!!
    }

private var _aiMic: ImageVector? = null

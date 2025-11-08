package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SourceCodeCircle: ImageVector
    get() {
        if (_sourceCodeCircle != null) {
            return _sourceCodeCircle!!
        }
        _sourceCodeCircle = ImageVector.Builder(
            name = "SourceCodeCircle",
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
        moveTo(16f, 10f)
        lineTo(17.2265f, 11.0572f)
        curveTo(17.7422f, 11.5016f, 18f, 11.7239f, 18f, 12f)
        curveTo(18f, 12.2761f, 17.7422f, 12.4984f, 17.2265f, 12.9428f)
        lineTo(16f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        lineTo(6.77346f, 11.0572f)
        curveTo(6.25782f, 11.5016f, 6f, 11.7239f, 6f, 12f)
        curveTo(6f, 12.2761f, 6.25782f, 12.4984f, 6.77346f, 12.9428f)
        lineTo(8f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        lineTo(11f, 15f)
        }
        }.build()

        return _sourceCodeCircle!!
    }

private var _sourceCodeCircle: ImageVector? = null

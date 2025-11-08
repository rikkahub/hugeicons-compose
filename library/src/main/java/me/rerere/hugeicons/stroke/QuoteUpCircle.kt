package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QuoteUpCircle: ImageVector
    get() {
        if (_quoteUpCircle != null) {
            return _quoteUpCircle!!
        }
        _quoteUpCircle = ImageVector.Builder(
            name = "QuoteUpCircle",
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
        moveTo(13.2544f, 14f)
        curveTo(13.2544f, 14.9428f, 13.2544f, 15.4142f, 13.5653f, 15.7071f)
        curveTo(13.8761f, 16f, 14.3765f, 16f, 15.3772f, 16f)
        curveTo(16.3779f, 16f, 16.8782f, 16f, 17.1891f, 15.7071f)
        curveTo(17.5f, 15.4142f, 17.5f, 14.9428f, 17.5f, 14f)
        curveTo(17.5f, 13.0572f, 17.5f, 12.5858f, 17.1891f, 12.2929f)
        curveTo(16.8782f, 12f, 16.3779f, 12f, 15.3772f, 12f)
        curveTo(14.3765f, 12f, 13.8761f, 12f, 13.5653f, 12.2929f)
        curveTo(13.2544f, 12.5858f, 13.2544f, 13.0572f, 13.2544f, 14f)
        moveTo(13.2544f, 14f)
        verticalLineTo(11.9313f)
        curveTo(13.2544f, 10.0978f, 14.5895f, 8.54292f, 16.4386f, 8f)
        moveTo(6.5f, 14f)
        curveTo(6.5f, 14.9428f, 6.5f, 15.4142f, 6.81088f, 15.7071f)
        curveTo(7.12176f, 16f, 7.62211f, 16f, 8.62281f, 16f)
        curveTo(9.62351f, 16f, 10.1239f, 16f, 10.4347f, 15.7071f)
        curveTo(10.7456f, 15.4142f, 10.7456f, 14.9428f, 10.7456f, 14f)
        curveTo(10.7456f, 13.0572f, 10.7456f, 12.5858f, 10.4347f, 12.2929f)
        curveTo(10.1239f, 12f, 9.62351f, 12f, 8.62281f, 12f)
        curveTo(7.62211f, 12f, 7.12176f, 12f, 6.81088f, 12.2929f)
        curveTo(6.5f, 12.5858f, 6.5f, 13.0572f, 6.5f, 14f)
        moveTo(6.5f, 14f)
        verticalLineTo(11.9313f)
        curveTo(6.5f, 10.0978f, 7.83509f, 8.54292f, 9.68421f, 8f)
        }
        }.build()

        return _quoteUpCircle!!
    }

private var _quoteUpCircle: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QuoteDownCircle: ImageVector
    get() {
        if (_quoteDownCircle != null) {
            return _quoteDownCircle!!
        }
        _quoteDownCircle = ImageVector.Builder(
            name = "QuoteDownCircle",
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
        moveTo(10.7456f, 10f)
        curveTo(10.7456f, 9.05719f, 10.7456f, 8.58579f, 10.4347f, 8.29289f)
        curveTo(10.1239f, 8f, 9.62351f, 8f, 8.62281f, 8f)
        curveTo(7.62211f, 8f, 7.12176f, 8f, 6.81088f, 8.29289f)
        curveTo(6.5f, 8.58579f, 6.5f, 9.05719f, 6.5f, 10f)
        curveTo(6.5f, 10.9428f, 6.5f, 11.4142f, 6.81088f, 11.7071f)
        curveTo(7.12176f, 12f, 7.62211f, 12f, 8.62281f, 12f)
        curveTo(9.62351f, 12f, 10.1239f, 12f, 10.4347f, 11.7071f)
        curveTo(10.7456f, 11.4142f, 10.7456f, 10.9428f, 10.7456f, 10f)
        moveTo(10.7456f, 10f)
        lineTo(10.7456f, 12.0687f)
        curveTo(10.7456f, 13.9022f, 9.41052f, 15.4571f, 7.5614f, 16f)
        moveTo(17.5f, 10f)
        curveTo(17.5f, 9.05719f, 17.5f, 8.58579f, 17.1891f, 8.29289f)
        curveTo(16.8782f, 8f, 16.3779f, 8f, 15.3772f, 8f)
        curveTo(14.3765f, 8f, 13.8761f, 8f, 13.5653f, 8.29289f)
        curveTo(13.2544f, 8.58579f, 13.2544f, 9.05719f, 13.2544f, 10f)
        curveTo(13.2544f, 10.9428f, 13.2544f, 11.4142f, 13.5653f, 11.7071f)
        curveTo(13.8761f, 12f, 14.3765f, 12f, 15.3772f, 12f)
        curveTo(16.3779f, 12f, 16.8782f, 12f, 17.1891f, 11.7071f)
        curveTo(17.5f, 11.4142f, 17.5f, 10.9428f, 17.5f, 10f)
        moveTo(17.5f, 10f)
        verticalLineTo(12.0687f)
        curveTo(17.5f, 13.9022f, 16.1649f, 15.4571f, 14.3158f, 16f)
        }
        }.build()

        return _quoteDownCircle!!
    }

private var _quoteDownCircle: ImageVector? = null

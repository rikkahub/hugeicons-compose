package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kidneys: ImageVector
    get() {
        if (_kidneys != null) {
            return _kidneys!!
        }
        _kidneys = ImageVector.Builder(
            name = "Kidneys",
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
        moveTo(9.98556f, 6f)
        curveTo(10.1428f, 4.59395f, 9.00449f, 3f, 6.57134f, 3f)
        curveTo(4.04666f, 3f, 1.99999f, 5.46243f, 1.99999f, 8.5f)
        curveTo(1.99999f, 11.5376f, 3.53887f, 14f, 6.06355f, 14f)
        curveTo(7.67995f, 14f, 8.53551f, 12.7459f, 8.35578f, 11.6589f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        curveTo(8.50006f, 7.9996f, 10.4999f, 8.4957f, 10.4999f, 11.64f)
        curveTo(10.4999f, 15.8f, 8.49942f, 17.36f, 10.0005f, 21f)
        moveTo(17f, 8f)
        curveTo(15.4999f, 7.9996f, 13.5001f, 8.4957f, 13.5001f, 11.64f)
        curveTo(13.5001f, 15.8f, 15.5006f, 17.36f, 13.9995f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.61035f, 6f)
        curveTo(6.81406f, 6.57143f, 7.16038f, 7.94286f, 6.91592f, 8.85714f)
        curveTo(6.81407f, 9.2381f, 6.48829f, 10f, 6f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0144f, 6f)
        curveTo(13.8572f, 4.59395f, 14.9955f, 3f, 17.4287f, 3f)
        curveTo(19.9533f, 3f, 22f, 5.46243f, 22f, 8.5f)
        curveTo(22f, 11.5376f, 20.4611f, 14f, 17.9364f, 14f)
        curveTo(16.2406f, 14f, 15.3822f, 12.6196f, 15.6783f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3897f, 6f)
        curveTo(17.1859f, 6.57143f, 16.8396f, 7.94286f, 17.0841f, 8.85714f)
        curveTo(17.1859f, 9.2381f, 17.5117f, 10f, 18f, 10f)
        }
        }.build()

        return _kidneys!!
    }

private var _kidneys: ImageVector? = null

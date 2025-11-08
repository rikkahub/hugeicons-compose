package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) {
            return _plusMinus!!
        }
        _plusMinus = ImageVector.Builder(
            name = "PlusMinus",
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
        moveTo(11.0001f, 16f)
        curveTo(11.0001f, 17.8692f, 11.0001f, 18.8038f, 11.402f, 19.5f)
        curveTo(11.6653f, 19.9561f, 12.044f, 20.3348f, 12.5001f, 20.5981f)
        curveTo(13.1962f, 21f, 14.1308f, 21f, 16.0001f, 21f)
        curveTo(17.8693f, 21f, 18.8039f, 21f, 19.5001f, 20.5981f)
        curveTo(19.9561f, 20.3348f, 20.3348f, 19.9561f, 20.5981f, 19.5f)
        curveTo(21.0001f, 18.8038f, 21.0001f, 17.8692f, 21.0001f, 16f)
        curveTo(21.0001f, 14.1308f, 21.0001f, 13.1962f, 20.5981f, 12.5f)
        curveTo(20.3348f, 12.0439f, 19.9561f, 11.6652f, 19.5001f, 11.4019f)
        curveTo(18.8039f, 11f, 17.8693f, 11f, 16.0001f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00024f, 3f)
        curveTo(9.86948f, 3f, 10.8041f, 3f, 11.5002f, 3.40192f)
        curveTo(11.9563f, 3.66523f, 12.335f, 4.04394f, 12.5983f, 4.5f)
        curveTo(13.0002f, 5.19615f, 13.0002f, 6.13077f, 13.0002f, 8f)
        curveTo(13.0002f, 9.86923f, 13.0002f, 10.8038f, 12.5983f, 11.5f)
        curveTo(12.335f, 11.9561f, 11.9563f, 12.3348f, 11.5002f, 12.5981f)
        curveTo(10.8041f, 13f, 9.86948f, 13f, 8.00024f, 13f)
        curveTo(6.13101f, 13f, 5.1964f, 13f, 4.50024f, 12.5981f)
        curveTo(4.04419f, 12.3348f, 3.66547f, 11.9561f, 3.40217f, 11.5f)
        curveTo(3.00024f, 10.8038f, 3.00024f, 9.86923f, 3.00024f, 8f)
        curveTo(3.00024f, 6.13077f, 3.00024f, 5.19615f, 3.40217f, 4.5f)
        curveTo(3.66547f, 4.04394f, 4.04419f, 3.66523f, 4.50024f, 3.40192f)
        curveTo(5.1964f, 3f, 6.13101f, 3f, 8.00024f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00003f, 6f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        lineTo(6.00003f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16f)
        lineTo(14f, 16f)
        }
        }.build()

        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null

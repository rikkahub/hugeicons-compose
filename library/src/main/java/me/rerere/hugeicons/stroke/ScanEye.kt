package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScanEye: ImageVector
    get() {
        if (_scanEye != null) {
            return _scanEye!!
        }
        _scanEye = ImageVector.Builder(
            name = "ScanEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 16.9995f)
            curveTo(16.2266f, 16.9995f, 18.3342f, 13.5086f, 18.913f, 12.3606f)
            curveTo(19.0289f, 12.1308f, 19.0289f, 11.8682f, 18.913f, 11.6384f)
            curveTo(18.3342f, 10.4904f, 16.2266f, 6.99951f, 12f, 6.99951f)
            curveTo(7.77333f, 6.99951f, 5.6657f, 10.4904f, 5.08686f, 11.6384f)
            curveTo(4.97099f, 11.8682f, 4.97099f, 12.1308f, 5.08686f, 12.3606f)
            curveTo(5.6657f, 13.5086f, 7.77333f, 16.9995f, 12f, 16.9995f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 11.9995f)
            arcTo(2f, 2f, 0f, true, false, 10f, 11.9995f)
            arcTo(2f, 2f, 0f, true, false, 14f, 11.9995f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.5f, 7.50034f)
            curveTo(21.4085f, 5.6542f, 21.1348f, 4.50316f, 20.316f, 3.68435f)
            curveTo(19.4972f, 2.86555f, 18.3462f, 2.59184f, 16.5f, 2.50034f)
            moveTo(2.50002f, 7.49951f)
            curveTo(2.59151f, 5.65337f, 2.86522f, 4.50233f, 3.68403f, 3.68352f)
            curveTo(4.50284f, 2.86472f, 5.65387f, 2.59101f, 7.50002f, 2.49951f)
            moveTo(21.5f, 16.4998f)
            curveTo(21.4085f, 18.3459f, 21.1348f, 19.497f, 20.316f, 20.3158f)
            curveTo(19.4972f, 21.1346f, 18.3462f, 21.4083f, 16.5f, 21.4998f)
            moveTo(2.50002f, 16.5006f)
            curveTo(2.59151f, 18.3468f, 2.86522f, 19.4978f, 3.68403f, 20.3166f)
            curveTo(4.50284f, 21.1354f, 5.65387f, 21.4091f, 7.50002f, 21.5006f)
        }
        }.build()

        return _scanEye!!
    }

private var _scanEye: ImageVector? = null

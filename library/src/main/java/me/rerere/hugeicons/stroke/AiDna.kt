package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiDna: ImageVector
    get() {
        if (_aiDna != null) {
            return _aiDna!!
        }
        _aiDna = ImageVector.Builder(
            name = "AiDna",
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
        moveTo(7.49114f, 14.0015f)
        curveTo(3.00094f, 11.6015f, 3.00094f, 10.4015f, 3.00094f, 10.0015f)
        curveTo(3.00094f, 9.60146f, 3.00094f, 8.40146f, 7.49114f, 6.00146f)
        moveTo(7.49114f, 14.0015f)
        curveTo(3.00094f, 16.4015f, 3.00006f, 17.2015f, 3.00006f, 18.0015f)
        moveTo(7.49114f, 14.0015f)
        curveTo(11.9804f, 11.602f, 11.9804f, 10.402f, 11.9804f, 10.0017f)
        curveTo(11.9804f, 9.60147f, 11.9804f, 8.40099f, 7.49114f, 6.00146f)
        moveTo(7.49114f, 6.00146f)
        curveTo(11.9813f, 3.60146f, 11.9813f, 2.80146f, 11.9813f, 2.00146f)
        moveTo(7.49114f, 6.00146f)
        lineTo(5.30787f, 4.74576f)
        curveTo(3.00063f, 3.28295f, 3.00006f, 2.64221f, 3.00006f, 2.00146f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4119f, 12.0005f)
        verticalLineTo(13.9795f)
        moveTo(10.9249f, 15.5009f)
        horizontalLineTo(12.9768f)
        moveTo(18.9479f, 15.5009f)
        horizontalLineTo(20.9999f)
        moveTo(18.9479f, 18.4741f)
        horizontalLineTo(20.9999f)
        moveTo(10.9249f, 18.4741f)
        horizontalLineTo(12.9768f)
        moveTo(14.4119f, 20.0197f)
        verticalLineTo(21.9987f)
        moveTo(17.4373f, 20.0197f)
        verticalLineTo(21.9987f)
        moveTo(17.4266f, 12.0005f)
        verticalLineTo(13.9795f)
        moveTo(13.9768f, 19.968f)
        horizontalLineTo(17.9479f)
        curveTo(18.5002f, 19.968f, 18.9479f, 19.5203f, 18.9479f, 18.968f)
        verticalLineTo(14.9795f)
        curveTo(18.9479f, 14.4272f, 18.5002f, 13.9795f, 17.9479f, 13.9795f)
        horizontalLineTo(13.9768f)
        curveTo(13.4246f, 13.9795f, 12.9768f, 14.4272f, 12.9768f, 14.9795f)
        verticalLineTo(18.968f)
        curveTo(12.9768f, 19.5203f, 13.4246f, 19.968f, 13.9768f, 19.968f)
        }
        }.build()

        return _aiDna!!
    }

private var _aiDna: ImageVector? = null

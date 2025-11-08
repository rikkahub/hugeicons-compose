package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PenToolAdd: ImageVector
    get() {
        if (_penToolAdd != null) {
            return _penToolAdd!!
        }
        _penToolAdd = ImageVector.Builder(
            name = "PenToolAdd",
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
        moveTo(14.5995f, 20.4737f)
        lineTo(7.63427f, 21.7672f)
        curveTo(6.2983f, 22.0153f, 5.63031f, 22.1393f, 5.24549f, 21.7545f)
        curveTo(4.86067f, 21.3697f, 4.98471f, 20.7016f, 5.2328f, 19.3656f)
        lineTo(6.52621f, 12.4001f)
        curveTo(6.73362f, 11.2831f, 6.83732f, 10.7246f, 7.20549f, 10.3872f)
        curveTo(7.57365f, 10.0497f, 8.24697f, 9.98389f, 9.59359f, 9.85218f)
        curveTo(10.8915f, 9.72524f, 12.1197f, 9.28032f, 13.4f, 8f)
        lineTo(19f, 13.6005f)
        curveTo(17.7197f, 14.8808f, 17.2746f, 16.1083f, 17.1474f, 17.4062f)
        curveTo(17.0155f, 18.753f, 16.9495f, 19.4264f, 16.6121f, 19.7945f)
        curveTo(16.2747f, 20.1626f, 15.7163f, 20.2663f, 14.5995f, 20.4737f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16.2105f)
        curveTo(12.4405f, 16.1197f, 11.9289f, 15.8763f, 11.5263f, 15.4737f)
        moveTo(11.5263f, 15.4737f)
        curveTo(11.1237f, 15.0711f, 10.8803f, 14.5595f, 10.7895f, 14f)
        moveTo(11.5263f, 15.4737f)
        lineTo(6f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 8f)
        curveTo(14.1332f, 7.06586f, 15.4907f, 5.16107f, 16.7613f, 5.00976f)
        curveTo(17.6287f, 4.90648f, 18.3472f, 5.62499f, 19.7842f, 7.06202f)
        lineTo(19.938f, 7.2158f)
        curveTo(21.375f, 8.65283f, 22.0935f, 9.37135f, 21.9902f, 10.2387f)
        curveTo(21.8389f, 11.5092f, 19.9341f, 12.8668f, 19f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 8f)
        lineTo(5f, 2f)
        moveTo(2f, 5f)
        horizontalLineTo(8f)
        }
        }.build()

        return _penToolAdd!!
    }

private var _penToolAdd: ImageVector? = null

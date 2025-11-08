package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = ImageVector.Builder(
            name = "TShirt",
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
        moveTo(5.99756f, 12f)
        verticalLineTo(17.6841f)
        curveTo(5.99756f, 19.4952f, 5.99756f, 20.4008f, 6.58285f, 20.9635f)
        curveTo(7.24789f, 21.6028f, 9.6154f, 21.9785f, 11.9925f, 21.9991f)
        curveTo(14.3085f, 22.0192f, 16.6337f, 21.7022f, 17.4021f, 20.9635f)
        curveTo(17.9874f, 20.4008f, 17.9874f, 19.4952f, 17.9874f, 17.6841f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.72228f, 14.022f)
        curveTo(4.8566f, 13.7083f, 3.22971f, 13.4394f, 2.49588f, 12.7032f)
        curveTo(1.48592f, 11.69f, 2.13864f, 10.3201f, 3.37707f, 7.73891f)
        curveTo(3.93449f, 6.5771f, 5.00094f, 5.72243f, 6.24362f, 5.38452f)
        curveTo(6.41238f, 5.33863f, 6.55884f, 5.23314f, 6.65592f, 5.08755f)
        lineTo(7.93933f, 3.08867f)
        curveTo(7.97639f, 3.03309f, 8.02343f, 2.98533f, 8.08061f, 2.95084f)
        curveTo(8.65909f, 2.60195f, 10.0921f, 1.99998f, 11.9925f, 1.99998f)
        curveTo(13.8929f, 1.99998f, 15.2321f, 2.60195f, 15.8105f, 2.95084f)
        curveTo(15.8677f, 2.98533f, 15.9148f, 3.03309f, 15.9518f, 3.08867f)
        lineTo(17.2721f, 5.0687f)
        curveTo(17.3692f, 5.21429f, 17.5156f, 5.31978f, 17.6844f, 5.36567f)
        curveTo(18.9271f, 5.70358f, 19.9451f, 6.45012f, 20.5026f, 7.61193f)
        curveTo(21.8937f, 10.1413f, 22.5105f, 11.6707f, 21.5005f, 12.6839f)
        curveTo(20.7667f, 13.4201f, 19.1174f, 13.7116f, 18.2517f, 14.0253f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.50098f, 5.49998f)
        lineTo(10.7345f, 8.79261f)
        curveTo(11.3409f, 9.26419f, 11.644f, 9.49998f, 12.001f, 9.49998f)
        curveTo(12.358f, 9.49998f, 12.6611f, 9.26419f, 13.2675f, 8.79261f)
        lineTo(17.501f, 5.49998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50098f, 2.99998f)
        lineTo(11.001f, 8.99998f)
        moveTo(14.501f, 2.99998f)
        lineTo(13.001f, 8.99998f)
        }
        }.build()

        return _tShirt!!
    }

private var _tShirt: ImageVector? = null

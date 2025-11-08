package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tap04: ImageVector
    get() {
        if (_tap04 != null) {
            return _tap04!!
        }
        _tap04 = ImageVector.Builder(
            name = "Tap04",
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
        moveTo(7.72161f, 14.8947f)
        verticalLineTo(11.5789f)
        moveTo(7.72161f, 11.5789f)
        verticalLineTo(6.15789f)
        curveTo(7.72161f, 5.24227f, 8.45287f, 4.5f, 9.35494f, 4.5f)
        curveTo(10.257f, 4.5f, 10.9883f, 5.24226f, 10.9883f, 6.15789f)
        verticalLineTo(10.6316f)
        lineTo(13.8601f, 11.084f)
        curveTo(15.6602f, 11.3581f, 16.5602f, 11.4951f, 17.1942f, 11.8806f)
        curveTo(18.2414f, 12.5174f, 19f, 13.4737f, 19f, 14.8697f)
        curveTo(19f, 15.8421f, 18.7632f, 16.4945f, 18.1876f, 18.2472f)
        curveTo(17.8224f, 19.3594f, 17.6398f, 19.9154f, 17.342f, 20.3556f)
        curveTo(16.8517f, 21.0804f, 16.1285f, 21.6095f, 15.2961f, 21.8524f)
        curveTo(14.7905f, 22f, 14.213f, 22f, 13.0581f, 22f)
        horizontalLineTo(11.7468f)
        curveTo(10.0813f, 22f, 9.24852f, 22f, 8.53345f, 21.6827f)
        curveTo(8.21038f, 21.5393f, 7.90896f, 21.3502f, 7.63815f, 21.121f)
        curveTo(7.03875f, 20.6138f, 6.66633f, 19.8577f, 5.92149f, 18.3456f)
        curveTo(5.31747f, 17.1194f, 5.01546f, 16.5063f, 5.00077f, 15.8707f)
        curveTo(4.99414f, 15.584f, 5.0303f, 15.298f, 5.108f, 15.0223f)
        curveTo(5.28029f, 14.411f, 5.72499f, 13.8951f, 6.61438f, 12.8634f)
        lineTo(7.72161f, 11.5789f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.3164f, 6f)
        curveTo(13.3164f, 3.79086f, 11.5255f, 2f, 9.31641f, 2f)
        curveTo(7.10727f, 2f, 5.31641f, 3.79086f, 5.31641f, 6f)
        }
        }.build()

        return _tap04!!
    }

private var _tap04: ImageVector? = null

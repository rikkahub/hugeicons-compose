package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PenTool03: ImageVector
    get() {
        if (_penTool03 != null) {
            return _penTool03!!
        }
        _penTool03 = ImageVector.Builder(
            name = "PenTool03",
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
        moveTo(13.2852f, 19.3647f)
        lineTo(5.82243f, 20.7506f)
        curveTo(4.39103f, 21.0164f, 3.67534f, 21.1493f, 3.26303f, 20.737f)
        curveTo(2.85072f, 20.3246f, 2.98362f, 19.6089f, 3.24943f, 18.1774f)
        lineTo(4.63523f, 10.7143f)
        curveTo(4.85745f, 9.51762f, 4.96856f, 8.91925f, 5.36302f, 8.5577f)
        curveTo(5.75749f, 8.19616f, 6.47889f, 8.1256f, 7.9217f, 7.98448f)
        curveTo(9.31227f, 7.84847f, 10.6283f, 7.37177f, 12f, 6f)
        lineTo(18f, 12.0005f)
        curveTo(16.6283f, 13.3723f, 16.1513f, 14.6874f, 16.0151f, 16.0781f)
        curveTo(15.8738f, 17.5211f, 15.8031f, 18.2426f, 15.4416f, 18.637f)
        curveTo(15.0801f, 19.0314f, 14.4818f, 19.1425f, 13.2852f, 19.3647f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.2105f)
        curveTo(10.4405f, 15.1197f, 9.92895f, 14.8763f, 9.52632f, 14.4737f)
        moveTo(9.52632f, 14.4737f)
        curveTo(9.12368f, 14.0711f, 8.8803f, 13.5595f, 8.78947f, 13f)
        moveTo(9.52632f, 14.4737f)
        lineTo(4f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        curveTo(12.7123f, 4.9491f, 13.6771f, 3.1812f, 15.1065f, 3.01098f)
        curveTo(16.0822f, 2.89479f, 16.8906f, 3.70312f, 18.5072f, 5.31978f)
        lineTo(18.6802f, 5.49277f)
        curveTo(20.2969f, 7.10944f, 21.1052f, 7.91777f, 20.989f, 8.8935f)
        curveTo(20.8188f, 10.3229f, 19.0509f, 11.2877f, 18f, 12f)
        }
        }.build()

        return _penTool03!!
    }

private var _penTool03: ImageVector? = null

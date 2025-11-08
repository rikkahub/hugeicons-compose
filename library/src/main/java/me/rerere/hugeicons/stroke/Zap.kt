package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Zap: ImageVector
    get() {
        if (_zap != null) {
            return _zap!!
        }
        _zap = ImageVector.Builder(
            name = "Zap",
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
        moveTo(8.62814f, 12.6736f)
        horizontalLineTo(8.16918f)
        curveTo(6.68545f, 12.6736f, 5.94358f, 12.6736f, 5.62736f, 12.1844f)
        curveTo(5.31114f, 11.6953f, 5.61244f, 11.0138f, 6.21504f, 9.65083f)
        lineTo(8.02668f, 5.55323f)
        curveTo(8.57457f, 4.314f, 8.84852f, 3.69438f, 9.37997f, 3.34719f)
        curveTo(9.91142f, 3f, 10.5859f, 3f, 11.935f, 3f)
        horizontalLineTo(14.0244f)
        curveTo(15.6632f, 3f, 16.4826f, 3f, 16.7916f, 3.53535f)
        curveTo(17.1007f, 4.0707f, 16.6942f, 4.78588f, 15.8811f, 6.21623f)
        lineTo(14.8092f, 8.10188f)
        curveTo(14.405f, 8.81295f, 14.2029f, 9.16849f, 14.2057f, 9.45952f)
        curveTo(14.2094f, 9.83775f, 14.4105f, 10.1862f, 14.7354f, 10.377f)
        curveTo(14.9854f, 10.5239f, 15.3927f, 10.5239f, 16.2074f, 10.5239f)
        curveTo(17.2373f, 10.5239f, 17.7523f, 10.5239f, 18.0205f, 10.7022f)
        curveTo(18.3689f, 10.9338f, 18.5513f, 11.3482f, 18.4874f, 11.7632f)
        curveTo(18.4382f, 12.0826f, 18.0918f, 12.4656f, 17.399f, 13.2317f)
        lineTo(11.8639f, 19.3523f)
        curveTo(10.7767f, 20.5545f, 10.2331f, 21.1556f, 9.86807f, 20.9654f)
        curveTo(9.50303f, 20.7751f, 9.67833f, 19.9822f, 10.0289f, 18.3962f)
        lineTo(10.7157f, 15.2896f)
        curveTo(10.9826f, 14.082f, 11.1161f, 13.4782f, 10.7951f, 13.0759f)
        curveTo(10.4741f, 12.6736f, 9.85877f, 12.6736f, 8.62814f, 12.6736f)
        }
        }.build()

        return _zap!!
    }

private var _zap: ImageVector? = null

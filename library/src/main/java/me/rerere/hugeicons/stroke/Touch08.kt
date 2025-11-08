package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touch08: ImageVector
    get() {
        if (_touch08 != null) {
            return _touch08!!
        }
        _touch08 = ImageVector.Builder(
            name = "Touch08",
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
        moveTo(7.77888f, 13.9566f)
        verticalLineTo(9.49309f)
        moveTo(7.77888f, 9.49309f)
        verticalLineTo(3.97813f)
        curveTo(7.77888f, 3.15856f, 8.46218f, 2.49805f, 9.28215f, 2.49805f)
        curveTo(10.1021f, 2.49805f, 10.7482f, 3.15856f, 10.7482f, 3.97813f)
        verticalLineTo(7.97397f)
        moveTo(7.77888f, 9.49309f)
        curveTo(6.46416f, 10.6839f, 5.04938f, 12.1882f, 4.85886f, 12.5736f)
        curveTo(3.97239f, 13.9223f, 4.06531f, 14.5753f, 5.05322f, 16.2256f)
        curveTo(5.89231f, 17.6273f, 7.02077f, 19.1829f, 7.08664f, 19.2576f)
        curveTo(7.7571f, 20.017f, 7.62379f, 20.0172f, 8.59557f, 20.7303f)
        curveTo(9.46334f, 21.3323f, 11.2633f, 21.7517f, 15.483f, 21.3323f)
        curveTo(18.9206f, 20.8015f, 19.7442f, 17.8022f, 19.7263f, 16.3689f)
        verticalLineTo(12.8293f)
        curveTo(19.9405f, 9.8874f, 18.7102f, 9.75461f, 16.4763f, 9.46504f)
        moveTo(10.7482f, 7.97397f)
        verticalLineTo(10.4974f)
        moveTo(10.7482f, 7.97397f)
        curveTo(11.3057f, 7.06531f, 13.3304f, 7.43252f, 13.725f, 9.1484f)
        moveTo(13.7606f, 10.4935f)
        verticalLineTo(9.49309f)
        curveTo(13.7606f, 9.41423f, 13.7567f, 9.33512f, 13.7456f, 9.2571f)
        moveTo(13.725f, 9.1484f)
        curveTo(13.7266f, 9.15562f, 13.7283f, 9.16286f, 13.7299f, 9.17013f)
        curveTo(13.7362f, 9.19892f, 13.7414f, 9.22793f, 13.7456f, 9.2571f)
        moveTo(13.725f, 9.1484f)
        curveTo(13.7291f, 9.18336f, 13.7359f, 9.2196f, 13.7456f, 9.2571f)
        moveTo(13.725f, 9.1484f)
        curveTo(13.5848f, 7.95243f, 16.6168f, 8.24397f, 16.7402f, 10.3473f)
        verticalLineTo(11.4904f)
        }
        }.build()

        return _touch08!!
    }

private var _touch08: ImageVector? = null
